/*
 * generated by Xtext 2.24.0
 */
package org.xtext.mde.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.datalog.ui.internal.DatalogActivator;

public class DatalogUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DatalogActivator.getInstance().getInjector("org.xtext.mde.Datalog");
	}

}
