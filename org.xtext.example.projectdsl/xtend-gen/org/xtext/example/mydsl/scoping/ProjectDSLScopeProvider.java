/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.scoping;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.xtext.example.mydsl.projectDSL.Controller;
import org.xtext.example.mydsl.projectDSL.Entity;
import org.xtext.example.mydsl.projectDSL.Parameter;
import org.xtext.example.mydsl.projectDSL.ProjectDSLPackage;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class ProjectDSLScopeProvider extends AbstractProjectDSLScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    IScope _xblockexpression = null;
    {
      boolean _matched = false;
      boolean _equals = Objects.equal(reference, ProjectDSLPackage.Literals.ENDPOINT__ENDPOINT);
      if (_equals) {
        _matched=true;
        final Controller controller = EcoreUtil2.<Controller>getContainerOfType(context, Controller.class);
        final ArrayList<Parameter> entityParams = new ArrayList<Parameter>();
        final Consumer<Entity> _function = (Entity it) -> {
          Iterables.<Parameter>addAll(entityParams, this.allParameters(it));
        };
        controller.getBase().forEach(_function);
        return Scopes.scopeFor(entityParams);
      }
      if (!_matched) {
        boolean _equals_1 = Objects.equal(reference, ProjectDSLPackage.Literals.PARAM__VALUE);
        if (_equals_1) {
          _matched=true;
          final Entity entity = EcoreUtil2.<Entity>getContainerOfType(context, Entity.class);
          Entity _parent = entity.getParent();
          boolean _tripleNotEquals = (_parent != null);
          if (_tripleNotEquals) {
            final ArrayList<Parameter> allParams = new ArrayList<Parameter>();
            Iterables.<Parameter>addAll(allParams, this.allParameters(entity));
            Iterables.<Parameter>addAll(allParams, this.allParameters(entity.getParent()));
            return Scopes.scopeFor(allParams);
          }
        }
      }
      _xblockexpression = super.getScope(context, reference);
    }
    return _xblockexpression;
  }
  
  public Iterable<Parameter> allParameters(final Entity entity) {
    final ArrayList<Parameter> candidates = new ArrayList<Parameter>();
    final HashSet<Entity> seen = new HashSet<Entity>();
    Entity e = entity;
    while ((e != null)) {
      {
        boolean _contains = seen.contains(e);
        if (_contains) {
          return Collections.EMPTY_LIST;
        }
        seen.add(e);
        Iterables.<Parameter>addAll(candidates, Iterables.<Parameter>filter(e.getParameters(), Parameter.class));
        e = e.getParent();
      }
    }
    return candidates;
  }
}
