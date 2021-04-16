/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.validation

import org.eclipse.xtext.validation.Check
import org.xtext.example.mydsl.projectDSL.Controller
import java.util.ArrayList
import org.xtext.example.mydsl.projectDSL.ProjectDSLPackage.Literals
import org.xtext.example.mydsl.projectDSL.Entity
import org.eclipse.emf.common.util.EList
import java.util.HashSet
import java.util.HashMap
import org.xtext.example.mydsl.projectDSL.Parameter

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class ProjectDSLValidator extends AbstractProjectDSLValidator {
	
	@Check
	def checkMakeOperations(Controller c) {
		val endpointNames = new ArrayList<String>
		// We add the names of each of the endpoints.
		c.endpoint.forEach[
			if(endpointNames.contains(it.endpoint.name)) {
				error ("Endpoint already exists!", it, Literals.ENDPOINT__ENDPOINT)
			} else {
				endpointNames.add(it.endpoint.name)
			}
		]
	}
	
	@Check
	def checkCRUDNames(Entity e) {
		val entityParameterNames = new ArrayList<String>
		e.parameters.forEach[
			if(entityParameterNames.contains(it.name)) {
				error ("Parameter already exists!", it, Literals.PARAMETER__NAME)
			} else {
				entityParameterNames.add(it.name)
			}
		]
	}
    
    @Check
    def checkCRUDParameters(Parameter parameter){
    	for(var i = 0; i < parameter.type.length; i++){
            for(var j = 0; j < parameter.type.length; j++){
                if(i != j && parameter.type.get(i) == parameter.type.get(j)){
                    error("Parameters contains duplicates of " + parameter.type.get(i), parameter, Literals.PARAMETER__NAME)
                }
            }
        }
    }
	
	 

	
	

	 
}
