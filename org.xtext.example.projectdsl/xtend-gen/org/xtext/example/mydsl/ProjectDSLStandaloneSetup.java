/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class ProjectDSLStandaloneSetup extends ProjectDSLStandaloneSetupGenerated {
  public static void doSetup() {
    new ProjectDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}