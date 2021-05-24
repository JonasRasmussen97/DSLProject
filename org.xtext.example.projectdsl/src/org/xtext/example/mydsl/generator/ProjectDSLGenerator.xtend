/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.mydsl.projectDSL.RestAPI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.xtext.example.mydsl.projectDSL.Entity
import org.xtext.example.mydsl.projectDSL.ParentEntity
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
import org.eclipse.emf.common.util.EList
import org.xtext.example.mydsl.projectDSL.Endpoint

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ProjectDSLGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val RestAPI modelInstance = resource.allContents.filter(RestAPI).next
		/* 
		val math = resource.allContents.filter(MathExp).next	
		var result = math.compute;
		System.out.println("Math expression = "+math.displayMath)
		println(result);
		*/
		
		val entities = modelInstance.declarations.filter(Entity)
		
		val parentEntities = modelInstance.declarations.filter(ParentEntity)
		
		val controllers = modelInstance.declarations.filter(Controller)
		
		generateApp(fsa, entities, controllers)
		
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
	def generateApp(IFileSystemAccess2 access1, Iterable<Entity> entities, Iterable<Controller> controllers) {
		access1.generateFile('app.js', entities.generateAppJs(controllers));
	}

	// Generates the controller js files
	def generateControllers(Controller controller, IFileSystemAccess2 access2) {
		access2.generateFile(controller.name + '.js', controller.generateController)
	}

	def generateController(Controller controller) '''
	var mongoose = require('mongoose');
	
	var �controller.name� = {
	
		��� Generating general create/delete functions for each entity
	
		�FOR base:controller.base�
		// �base.name�
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
	        	if(err) { res.send("Error!")
	        	} else { res.send("Success!") }
	        	})
			};
		},
		
		��� Generating functions for entities that extends a parent entity
			�IF base.parent !== null�
				�FOR p : base.parent.parameters�
					�FOR end : controller.endpoint�
				    	�FOR t : p.type�
				    		�switch t.toString {
				    			case 'R': '''		get�p.name�: function(�base.name.toFirstUpper�, req, res) {
			�p.generateMath�{
				�base.name.toFirstUpper�.collection.findOne({
			Id: req.params.id
				}, function(err, result){
				    if(err) {
				    	res.send("There was an error!");
				    } else {
				    	res.send("Success!");
				   });
				}
			},'''
				    			
				    			case 'U': '''		put�p.name�: function(�base.name.toFirstUpper�, req, res) {
			�p.generateMath�{
				�base.name.toFirstUpper�.collection.findOneAndUpdate({
				 �p.name�:req.body.�p.name.toLowerCase�
				}, {
				   	$set: {
				    	�p.name�:req.body.value
				    }
				   });
				}
			},'''
				    			
				    		}�
				    					
						�ENDFOR�
					�ENDFOR�
				�ENDFOR���
			�ENDIF�
		
	    ���	Only create the functions in the controller js file that has "make" in the controller.
	    	�FOR p : base.parameters�
	    		�FOR end : controller.endpoint�
	    			�IF p.name == end.endpoint.name�
	    				�FOR t : p.type�
	    					�switch t.toString {
	    						case 'R': '''		get�p.name�: function(�base.name.toFirstUpper�, req, res) {
			�p.generateMath�{
				�base.name.toFirstUpper�.collection.findOne({
	  	 	Id: req.params.id
	   		}, function(err, result){
	    			if(err) {
	    				res.send("There was an error!");
	    			} else {
	    				res.send("Success!");
	    		});
			}
		},'''
	    			
	    				case 'U': '''		put�p.name�: function(�base.name.toFirstUpper�, req, res) {
			�p.generateMath�{
				�base.name.toFirstUpper�.collection.findOneAndUpdate({
	   			 �p.name�:req.body.�p.name.toLowerCase�
	    		}, {
	    			$set: {
	    				�p.name�:req.body.value
	    			}
	    		});
			}
		},'''
	    			
	    					}�
	    					
	    				�ENDFOR�
	    			�ENDIF�
	    		�ENDFOR�
	    	�ENDFOR�
	  �ENDFOR�
}
module.exports = �controller.name�
	'''

	def generateAppJs (Iterable<Entity> entities, Iterable<Controller> controllers)'''
		const express = require('express')
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
			var �e.name.toFirstLower�Schema = new mongoose.Schema({
				�IF e.parent !== null�
				�FOR p: e.parent.parameters�
				�p.name�: �p.dataType�,
				�ENDFOR�
				�ENDIF�
				�FOR p: e.parameters�
				�p.name�: �p.dataType�,
				�ENDFOR�
			}, {
				collection: '�e.name.toFirstLower�s'
			});
			
		�ENDFOR�
		
		// Mongoose Models
		
		�FOR e : entities�
		var �e.name.toFirstUpper� = mongoose.model('�e.name.toFirstUpper�', �e.name.toFirstLower�Schema);
		�ENDFOR�
		
		//Endpoints
			�FOR c : controllers�
				�FOR e : c.base�
			//�e.name.toFirstUpper�
					�IF (e.parent !== null) �
				��� Endpoint for parent entity parameters
						�FOR p : e.parent.parameters�
							�FOR t : p.type�
								�switch t.toString {
									case 'R': '''app.get('/get�e.name.toFirstUpper��p.name.toFirstUpper�', function (req, res)  {
	�e.ctrlr.name.toFirstUpper�.get�p.name�(�e.name.toFirstUpper�, req, res);
});'''
						
									case 'U': '''app.put('/put�e.name.toFirstUpper��p.name.toFirstUpper�', function (req, res)  {
	�e.ctrlr.name.toFirstUpper�.put�p.name�(�e.name.toFirstUpper�, req, res);
});'''
								}�
							�ENDFOR�
						�ENDFOR�
					�ENDIF�
					
				��� Endpoint for entity parameters
					�FOR p : e.parameters�
					�FOR end : c.endpoint�
						�IF p.name == end.endpoint.name�
						�FOR t : p.type�
					�switch t.toString {			
								case 'R': '''app.get('/get�e.name.toFirstUpper��p.name.toFirstUpper�', function (req, res)  {
	�e.ctrlr.name.toFirstUpper�.get�p.name�(�e.name.toFirstUpper�, req, res);
});'''
																		
								case 'U': '''app.put('/put�e.name.toFirstUpper��p.name.toFirstUpper�', function (req, res)  {
	�e.ctrlr.name.toFirstUpper�.put�p.name�(�e.name.toFirstUpper�, req, res);
});'''
									
					}�
						�ENDFOR�
						�ENDIF�
					�ENDFOR�
				�ENDFOR�
			�ENDFOR�
		�ENDFOR�
'''
	

	def display(EObject model) {
		val res = new XMLResourceImpl
		res.contents.add(EcoreUtil::copy(model))
		System::out.println("Dump of model:")
		res.save(System.out, null)
	}
}
