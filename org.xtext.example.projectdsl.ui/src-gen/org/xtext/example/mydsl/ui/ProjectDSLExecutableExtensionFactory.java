/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.example.projectdsl.ui.internal.ProjectdslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ProjectDSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(ProjectdslActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		ProjectdslActivator activator = ProjectdslActivator.getInstance();
		return activator != null ? activator.getInjector(ProjectdslActivator.ORG_XTEXT_EXAMPLE_MYDSL_PROJECTDSL) : null;
	}

}