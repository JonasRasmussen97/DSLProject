/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.scoping

import org.eclipse.xtext.scoping.IScope
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.xtext.example.mydsl.projectDSL.ProjectDSLPackage.Literals
import org.eclipse.xtext.EcoreUtil2
import java.util.ArrayList
import org.eclipse.xtext.scoping.Scopes
import org.xtext.example.mydsl.projectDSL.Controller
import org.xtext.example.mydsl.projectDSL.Entity
import org.xtext.example.mydsl.projectDSL.Parameter
 
class ProjectDSLScopeProvider extends AbstractProjectDSLScopeProvider {
	
	override IScope getScope(EObject context, EReference reference) {
        switch(context) {
        	
        	// Ensures that the controller knows of the associated entity's parameters.
            case reference == Literals.ENDPOINT__ENDPOINT : {
                val controller = EcoreUtil2.getContainerOfType(context, Controller);
                val result = new ArrayList<Parameter>
                controller.base.forEach[result.addAll(it.parameters)]
                return Scopes.scopeFor(result);
            }
            
            // Ensures that an entity can use it's parent's parameters in the math expressions.
            case reference == Literals.PARAM__VALUE : {
            	val entity = EcoreUtil2.getContainerOfType(context, Entity);
                val result = new ArrayList<Parameter>
                result.addAll(entity.parent.parameters)
                result.addAll(entity.parameters)
                return Scopes.scopeFor(result);
            }
            
        } 
        super.getScope(context, reference);
    }
}

