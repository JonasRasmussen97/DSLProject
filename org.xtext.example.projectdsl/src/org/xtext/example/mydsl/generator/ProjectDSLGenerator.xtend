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
import org.xtext.example.mydsl.projectDSL.Controller

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

	// Generates the app.js file
	def generateApp(IFileSystemAccess2 access1, Iterable<Entity> entities) {
		access1.generateFile('app.js', entities.generateEntity);
	}

	// Generates the controller js files
	def generateControllers(Controller controller, IFileSystemAccess2 access2) {
		access2.generateFile(controller.name + '.js', controller.generateController)
	}

	def generateController(Controller controller) '''
		var �controller.name� = {
		�FOR e : controller.endpoint�
			�FOR b:controller.base�
				�FOR p:b.parameters� 
				��� Only create the functions in the controller js file that have "make" in the controller. *)		
					�IF p.name == e.name�
						�FOR t:p.type�
							�switch t.toString {
						case 'C': '''post�p.name�: function(req, res) {},'''
						case 'R': '''get�p.name�: function(req, res) {},'''
						case 'U': '''put�p.name�: function(req, res) {},'''
						case 'D': '''delete�p.name�: function(req, res) {},'''
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
	def generateEntity(Iterable<Entity> entities) '''
		const express = require('express')
		const app = express()
		const port = 3000	
		�FOR e : entities�
			�FOR p:e.parameters�
				�FOR t:p.type�
					�switch t.toString {
							case 'C': '''app.post('/post�p.name�') { �p.name.toFirstLower�Controller.post�p.name�() }'''
							case 'R': '''app.get('/get�p.name�') { �p.name.toFirstLower�Controller.get�p.name�() }'''
							case 'U': '''app.put('/put�p.name�') { �p.name.toFirstLower�Controller.put�p.name�() }'''
							case 'D': '''app.delete('/delete�p.name�') { �p.name.toFirstLower�Controller.delete�p.name�() }'''
						}�
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
