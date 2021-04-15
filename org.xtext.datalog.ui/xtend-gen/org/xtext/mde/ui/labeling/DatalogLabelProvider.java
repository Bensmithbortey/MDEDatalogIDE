/**
 * generated by Xtext 2.24.0
 */
package org.xtext.mde.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#label-provider
 */
@SuppressWarnings("all")
public class DatalogLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public DatalogLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}