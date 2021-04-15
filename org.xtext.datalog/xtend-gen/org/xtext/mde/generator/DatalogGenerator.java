/**
 * generated by Xtext 2.24.0
 */
package org.xtext.mde.generator;

import com.google.common.collect.Iterators;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.mde.datalog.Assertion;
import org.xtext.mde.datalog.AssertionMinus;
import org.xtext.mde.datalog.Conditions;
import org.xtext.mde.datalog.Model;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class DatalogGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final Model model = ((Model) _head);
    fsa.generateFile(this.deriveTargetFileNameFor(model, resource), this.generate(model));
    final String className = this.deriveClassName(resource);
    fsa.generateFile((className + ".java"), this.doGenerateClass(model, className));
  }
  
  public String deriveClassName(final Resource resource) {
    String _xblockexpression = null;
    {
      final String origFileName = resource.getURI().lastSegment();
      _xblockexpression = StringExtensions.toFirstUpper(origFileName.substring(0, origFileName.indexOf(".")));
    }
    return _xblockexpression;
  }
  
  public CharSequence generate(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Model contains:");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- ");
    int _size = IteratorExtensions.size(Iterators.<Conditions>filter(model.eAllContents(), Conditions.class));
    _builder.append(_size);
    _builder.append(" Conditions");
    _builder.newLineIfNotEmpty();
    _builder.append("- ");
    int _size_1 = IteratorExtensions.size(Iterators.<Assertion>filter(model.eAllContents(), Assertion.class));
    _builder.append(_size_1);
    _builder.append(" Assertions Plus");
    _builder.newLineIfNotEmpty();
    _builder.append("- ");
    int _size_2 = IteratorExtensions.size(Iterators.<AssertionMinus>filter(model.eAllContents(), AssertionMinus.class));
    _builder.append(_size_2);
    _builder.append(" Assertions Minus");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence doGenerateClass(final Model model, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import runtime.datalog;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Datalog d = new Datalog() {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public void run() {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("addSingleTruthToList(\"male\", \"grandpaSmith\");");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("addSingleTruthToList(\"male\", \"mrSmith\");");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("addSingleTruthToList(\"male\", \"peterSmith\");");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("addSingleTruthToList(\"male\", \"johnJones\");");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("addSingleTruthToList(\"male\", \"babyJones\");");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("addSingleTruthToList(\"female\", \"mrsSmith\");");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("addSingleTruthToList(\"female\", \"maryJones\");");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("addSingleTruthToList(\"female\", \"sallyWilkinson\");");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("addDoubleTruthToList(\"father\", \"grandpaSmith\", \"mrSmith\");");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("addDoubleTruthToList(\"father\", \"mrSmith\", \"peterSmith\");");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("addDoubleTruthToList(\"father\", \"mrSmith\", \"maryJones\");");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("addDoubleTruthToList(\"father\", \"johnJones\", \"babyJones\");");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("addDoubleTruthToList(\"husband_wife\", \"mrSmith\", \"mrsSmith\");");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("addDoubleTruthToList(\"husband_wife\", \"johnJones\", \"maryJones\");");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("addDoubleTruthToList(\"mother\", \"mrsSmith\", \"peterSmith\");");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("addDoubleTruthToList(\"mother\", \"mrsSmith\", \"maryJones\");");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("addDoubleTruthToList(\"mother\", \"maryJones\", \"babyJones\");");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("addDoubleTruthToList(\"loves\", \"peterSmith\", \"sallyWilkinson\");");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("System.out.println(getSimpleTruth(\"male\", \"mrSmith\"));");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("System.out.println(getSimpleTruth(\"male\", \"mrsSmith\"));");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("System.out.println(getListTruth(\"female\"));");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("System.out.println(getMapTruth(\"loves\", null, \"johnJones\"));");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("System.out.println(getMapTruth(\"loves\", null, null));");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("d.run();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String deriveTargetFileNameFor(final Model test, final Resource resource) {
    return resource.getURI().appendFileExtension("txt").lastSegment();
  }
}