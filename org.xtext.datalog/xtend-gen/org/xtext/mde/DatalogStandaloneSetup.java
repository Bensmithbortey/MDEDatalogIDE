/**
 * generated by Xtext 2.24.0
 */
package org.xtext.mde;

import org.xtext.mde.DatalogStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class DatalogStandaloneSetup extends DatalogStandaloneSetupGenerated {
  public static void doSetup() {
    new DatalogStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
