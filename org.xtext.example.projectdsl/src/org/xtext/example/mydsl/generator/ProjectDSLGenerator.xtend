/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.projectDSL.RestAPI
import org.xtext.example.mydsl.projectDSL.Entity
import org.xtext.example.mydsl.projectDSL.Controller
import org.xtext.example.mydsl.projectDSL.Parameter
import org.xtext.example.mydsl.projectDSL.Plus
import org.xtext.example.mydsl.projectDSL.Expression
import org.xtext.example.mydsl.projectDSL.Minus
import org.xtext.example.mydsl.projectDSL.Mult
import org.xtext.example.mydsl.projectDSL.Div
import org.xtext.example.mydsl.projectDSL.Num
import org.xtext.example.mydsl.projectDSL.Param
import java.util.LinkedHashSet

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ProjectDSLGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val RestAPI modelInstance = resource.allContents.filter(RestAPI).next
		val entities = modelInstance.declarations.filter(Entity)
		generateApp(fsa, entities)

		// Generate each of the controller files
		modelInstance.declarations.filter(Controller).forEach[generateControllers(fsa)]
	// modelInstance.display
	}
	
	def generateMath(Parameter p) { 
		// If there is no math expression on the parameter then the operator will be null.
		if(p.op !== null && p.right !== null) {
			'''if(�p.left.exp.generateExp� �p.op� �p.right.exp.generateExp�)'''
		} 
	}
	
	
	def static String generateExp(Expression exp) {
		switch(exp) {
			Plus: "("+exp.left.generateExp+"+"+exp.right.generateExp+")"
			Minus: "("+exp.left.generateExp+"-"+exp.right.generateExp+")"
			Mult: "("+exp.left.generateExp+"*"+exp.right.generateExp+")"
			Div: "("+exp.left.generateExp+"/"+exp.right.generateExp+")"
			Num: Integer.toString(exp.value)
			Param: "req.body."+exp.value.name
			default: throw new Error("Incorrect expression!")
		}
	}
	
	
	// Generates the app.js file
	def generateApp(IFileSystemAccess2 access1, Iterable<Entity> entities) {
		access1.generateFile('app.js', entities.generateCore);
	}

	// Generates the controller js files
	def generateControllers(Controller controller, IFileSystemAccess2 access2) {
		access2.generateFile(controller.name + '.js', controller.generateController)
	}

	def generateController(Controller controller) '''
var mongoose = require('mongoose');

var �controller.name� = {
�FOR base:controller.base�
create�base.name.toFirstUpper�: function(�base.name.toFirstUpper�, req, res) {
	�base.name.toFirstUpper�.collection.insertOne(new �base.name.toFirstUpper�({
		�FOR bp:base.parameters�
		�bp.name�:req.body.�bp.name.toLowerCase�,
		�ENDFOR�
		})
	);
},

delete�base.name.toFirstUpper�: function(�base.name.toFirstUpper�, req, res) {
    �base.name.toFirstUpper�.collection.deleteOne(req.body.id, function(err, result){
		if(err) { 
			res.send("Error!")
		} else { 
			res.send("Success!") 
		}
	})
},

�ENDFOR�
�FOR e : controller.endpoint�
	�FOR b:controller.base�
		�FOR p:b.parameters� 
���	        Only create the functions in the controller js file that have "make" in the controller. 
			�IF p.name == e.endpoint.name�
				�FOR t:p.type�
				�switch t.toString {
                    case 'R': 
'''
get�p.name.toFirstUpper�: function(�b.name.toFirstUpper�, req, res) {
	�p.generateMath�{
	�b.name.toFirstUpper�.collection.findOne({
		Id: req.params.id
	}, function(err, result){
		if(err) {
			res.send("There was an error!");
		} else {
			res.send("Success!");
		}
	});
}},

'''
	                        case 'U': 
'''
put�p.name.toFirstUpper�: function(�b.name.toFirstUpper�, req, res) {
	�p.generateMath�{
	�b.name.toFirstUpper�.collection.findOneAndUpdate({
		�p.name�:req.body.�p.name.toLowerCase�
	}, {
		$set: {
		�p.name�:req.body.value
		}
	});
}},

'''

}�
                �ENDFOR�
            �ENDIF�
        �ENDFOR�
    �ENDFOR�
�ENDFOR�
}
module.exports = �controller.name�
	'''

	// Appends the entity data to the app.js file
	def generateCore(Iterable<Entity> entities) '''
		const express = require('express');
		const mongoose = require('mongoose');
		const extendSchema = require('./mongoose-extend-schema');
		const app = express()
		const port = 3000
		
		// Controllers
		�var controllerNames = new LinkedHashSet<String>()�
		�FOR e : entities�
		�IF controllerNames.add(e.ctrlr.name)�
		var �e.ctrlr.name.toFirstLower� = requires('./�e.ctrlr.name.toFirstUpper�.js');
		�ENDIF�
		�ENDFOR�
		
		// Mongoose Schemas
		�FOR e : entities�
			�IF e.parent === null �
				var �e.name.toFirstLower�Schema = new mongoose.Schema({
					�FOR p: e.parameters�
					�p.name�: {type: �p.dataType�},
					�ENDFOR�
				}, {
					collection: '�e.name.toFirstLower�s'
				});
				
			�ELSE�
				var �e.name.toFirstLower�Schema = extendSchema(�e.parent.name.toFirstLower�Schema, {
					�FOR p: e.parameters�
					�p.name�: {type: �p.dataType�},
					�ENDFOR�
				}, {
					collection: '�e.name.toFirstLower�s'
				});
				
			�ENDIF�
		�ENDFOR�
		
		// Mongoose Models
		�FOR e : entities�
		var �e.name.toFirstUpper� = mongoose.model('�e.name.toFirstUpper�', �e.name.toFirstLower�Schema);
		�ENDFOR�
		
		//Endpoints
		�FOR entity : entities�
			// �entity.name.toFirstUpper�
			�FOR base : entity.ctrlr.base�
				�FOR p : base.parameters� 
					�FOR endpoint : entity.ctrlr.endpoint�
						�IF p.name == endpoint.endpoint.name�
							�FOR t:p.type�
								�switch t.toString {
									case 'R': 
'''app.get('/get�entity.name.toFirstUpper��p.name.toFirstUpper�', function (req, res)  {
	�entity.name.toFirstUpper�Controller.get�p.name�(�entity.name.toFirstUpper�, req, res);
});
'''		
									case 'U': 
'''app.put('/put�entity.name.toFirstUpper��p.name.toFirstUpper�', function (req, res)  {
	�entity.name.toFirstUpper�Controller.put�p.name�(�entity.name.toFirstUpper�, req, res);
});
'''	
								}�
							�ENDFOR�
						�ENDIF�
					�ENDFOR�
				�ENDFOR�
			�ENDFOR�
		�ENDFOR�
	'''

}
