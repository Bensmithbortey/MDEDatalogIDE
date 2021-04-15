/**
 * generated by Xtext 2.24.0
 */
package org.xtext.mde.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.mde.DatalogRuntimeModule;
import org.xtext.mde.DatalogStandaloneSetup;
import org.xtext.mde.ide.DatalogIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class DatalogIdeSetup extends DatalogStandaloneSetup {
  @Override
  public Injector createInjector() {
    DatalogRuntimeModule _datalogRuntimeModule = new DatalogRuntimeModule();
    DatalogIdeModule _datalogIdeModule = new DatalogIdeModule();
    return Guice.createInjector(Modules2.mixin(_datalogRuntimeModule, _datalogIdeModule));
  }
}
