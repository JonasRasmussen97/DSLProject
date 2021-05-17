/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.validation;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.xtext.example.mydsl.projectDSL.Controller;
import org.xtext.example.mydsl.projectDSL.Declaration;
import org.xtext.example.mydsl.projectDSL.Endpoint;
import org.xtext.example.mydsl.projectDSL.Entity;
import org.xtext.example.mydsl.projectDSL.Parameter;
import org.xtext.example.mydsl.projectDSL.ProjectDSLPackage;
import org.xtext.example.mydsl.projectDSL.RestAPI;
import org.xtext.example.mydsl.projectDSL.impl.ControllerImpl;
import org.xtext.example.mydsl.projectDSL.impl.EntityImpl;
import org.xtext.example.mydsl.projectDSL.impl.ParentEntityImpl;
import org.xtext.example.mydsl.validation.AbstractProjectDSLValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class ProjectDSLValidator extends AbstractProjectDSLValidator {
  @Check
  public void checkMakeOperations(final Controller c) {
    final ArrayList<String> endpointNames = new ArrayList<String>();
    final Consumer<Endpoint> _function = (Endpoint it) -> {
      boolean _contains = endpointNames.contains(it.getEndpoint().getName());
      if (_contains) {
        this.error("Endpoint already exists!", it, ProjectDSLPackage.Literals.ENDPOINT__ENDPOINT);
      } else {
        endpointNames.add(it.getEndpoint().getName());
      }
    };
    c.getEndpoint().forEach(_function);
  }
  
  @Check
  public void checkDuplicateUsesStatement(final Controller c) {
    final ArrayList<String> entitiesUsed = new ArrayList<String>();
    final Consumer<Entity> _function = (Entity it) -> {
      boolean _contains = entitiesUsed.contains(it.getName());
      if (_contains) {
        this.error("Duplicate entities not allowed!", c, ProjectDSLPackage.Literals.CONTROLLER__BASE);
      } else {
        entitiesUsed.add(it.getName());
      }
    };
    c.getBase().forEach(_function);
  }
  
  @Check
  public void checkDuplicateParameter(final Entity e) {
    final ArrayList<String> entityParameterNames = new ArrayList<String>();
    final Consumer<Parameter> _function = (Parameter it) -> {
      boolean _contains = entityParameterNames.contains(it.getName());
      if (_contains) {
        this.error("Parameter already exists!", it, ProjectDSLPackage.Literals.PARAMETER__NAME);
      } else {
        entityParameterNames.add(it.getName());
      }
    };
    e.getParameters().forEach(_function);
  }
  
  @Check
  public void checkDuplicateCRUD(final Parameter parameter) {
    for (int i = 0; (i < ((Object[])Conversions.unwrapArray(parameter.getType(), Object.class)).length); i++) {
      for (int j = 0; (j < ((Object[])Conversions.unwrapArray(parameter.getType(), Object.class)).length); j++) {
        if (((i != j) && Objects.equal(parameter.getType().get(i), parameter.getType().get(j)))) {
          String _get = parameter.getType().get(i);
          String _plus = ("Parameters contains duplicates of " + _get);
          this.error(_plus, parameter, ProjectDSLPackage.Literals.PARAMETER__NAME);
        }
      }
    }
  }
  
  @Check
  public void checkDuplicateEntitiesOrControllers(final RestAPI api) {
    final ArrayList<String> entityNames = new ArrayList<String>();
    final ArrayList<String> controllerNames = new ArrayList<String>();
    final ArrayList<String> parentNames = new ArrayList<String>();
    final Consumer<Declaration> _function = (Declaration it) -> {
      if ((Objects.equal(it.getClass(), EntityImpl.class) && (!entityNames.contains(it.getName())))) {
        entityNames.add(it.getName());
      } else {
        if ((Objects.equal(it.getClass(), ControllerImpl.class) && (!controllerNames.contains(it.getName())))) {
          controllerNames.add(it.getName());
        } else {
          if ((Objects.equal(it.getClass(), ParentEntityImpl.class) && (!parentNames.contains(it.getName())))) {
            parentNames.add(it.getName());
          } else {
            this.error("Already exists", it, null);
          }
        }
      }
    };
    api.getDeclarations().forEach(_function);
  }
}
