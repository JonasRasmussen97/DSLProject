/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.validation;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.xtext.example.mydsl.projectDSL.Controller;
import org.xtext.example.mydsl.projectDSL.Endpoint;
import org.xtext.example.mydsl.projectDSL.Entity;
import org.xtext.example.mydsl.projectDSL.Parameter;
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
        this.error("Endpoint already exists!", it.eContainmentFeature());
      } else {
        endpointNames.add(it.getEndpoint().getName());
      }
    };
    c.getEndpoint().forEach(_function);
  }
  
  @Check
  public void checkCRUDNames(final Entity e) {
    final ArrayList<String> entityParameterNames = new ArrayList<String>();
    final Consumer<Parameter> _function = (Parameter it) -> {
      boolean _contains = entityParameterNames.contains(it.getName());
      if (_contains) {
        this.error("Parameter already exists!", null);
      } else {
        entityParameterNames.add(it.getName());
      }
    };
    e.getParameters().forEach(_function);
  }
  
  @Check
  public void checkForMaxOneType(final Entity entity) {
    this.checkTypeClash(entity.getParameters());
  }
  
  public void checkTypeClash(final EList<Parameter> parameters) {
    final Consumer<Parameter> _function = (Parameter it) -> {
      for (int i = 0; (i < ((Object[])Conversions.unwrapArray(it.getType(), Object.class)).length); i++) {
        for (int j = (i + 1); (j < ((Object[])Conversions.unwrapArray(it.getType(), Object.class)).length); j++) {
          String _get = it.getType().get(i);
          String _get_1 = it.getType().get(j);
          boolean _equals = Objects.equal(_get, _get_1);
          if (_equals) {
            this.error("Parameters contains duplicates", null);
          }
        }
      }
    };
    parameters.forEach(_function);
  }
}
