/*
 * generated by Xtext 2.24.0
 */
package org.xtext.mde.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.mde.datalog.Comment;
import org.xtext.mde.datalog.DatalogPackage;
import org.xtext.mde.datalog.Formula;
import org.xtext.mde.datalog.Model;
import org.xtext.mde.datalog.ParamList;
import org.xtext.mde.datalog.ParameterInt;
import org.xtext.mde.datalog.ParameterPred;
import org.xtext.mde.datalog.ParameterVar;
import org.xtext.mde.datalog.Statements;
import org.xtext.mde.services.DatalogGrammarAccess;

@SuppressWarnings("all")
public class DatalogSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DatalogGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DatalogPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DatalogPackage.COMMENT:
				sequence_Comment(context, (Comment) semanticObject); 
				return; 
			case DatalogPackage.FORMULA:
				sequence_Formula(context, (Formula) semanticObject); 
				return; 
			case DatalogPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case DatalogPackage.PARAM_LIST:
				sequence_ParamList(context, (ParamList) semanticObject); 
				return; 
			case DatalogPackage.PARAMETER_INT:
				sequence_ParameterInt(context, (ParameterInt) semanticObject); 
				return; 
			case DatalogPackage.PARAMETER_PRED:
				if (rule == grammarAccess.getStatementsRule()) {
					sequence_Atom_Form_ParameterPred(context, (ParameterPred) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getFormRule()) {
					sequence_Atom_Form_ParameterPred(context, (ParameterPred) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAssertionRule()
						|| rule == grammarAccess.getFormulaRule()
						|| action == grammarAccess.getFormulaAccess().getFormulaLeftAction_1_0()
						|| rule == grammarAccess.getAtomRule()) {
					sequence_Atom_ParameterPred(context, (ParameterPred) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getParamListRule()
						|| action == grammarAccess.getParamListAccess().getParamListLeftAction_1_0()
						|| rule == grammarAccess.getPrimaryRule()
						|| rule == grammarAccess.getParameterPredRule()) {
					sequence_ParameterPred(context, (ParameterPred) semanticObject); 
					return; 
				}
				else break;
			case DatalogPackage.PARAMETER_VAR:
				sequence_ParameterVar(context, (ParameterVar) semanticObject); 
				return; 
			case DatalogPackage.STATEMENTS:
				sequence_Statements(context, (Statements) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Statements returns ParameterPred
	 *
	 * Constraint:
	 *     (low=PREDICATE list=ParamList right=Formula?)
	 */
	protected void sequence_Atom_Form_ParameterPred(ISerializationContext context, ParameterPred semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	// This method is commented out because it has the same signature as another method in this class.
	// This is probably a bug in Xtext's serializer, please report it here: 
	// https://bugs.eclipse.org/bugs/enter_bug.cgi?product=TMF
	//
	// Contexts:
	//     Form returns ParameterPred
	//
	// Constraint:
	//     (low=PREDICATE list=ParamList right=Formula)
	//
	// protected void sequence_Atom_Form_ParameterPred(ISerializationContext context, ParameterPred semanticObject) { }
	
	/**
	 * Contexts:
	 *     Assertion returns ParameterPred
	 *     Formula returns ParameterPred
	 *     Formula.Formula_1_0 returns ParameterPred
	 *     Atom returns ParameterPred
	 *
	 * Constraint:
	 *     (low=PREDICATE list=ParamList)
	 */
	protected void sequence_Atom_ParameterPred(ISerializationContext context, ParameterPred semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.PARAMETER_PRED__LOW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.PARAMETER_PRED__LOW));
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.PARAMETER_PRED__LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.PARAMETER_PRED__LIST));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterPredAccess().getLowPREDICATETerminalRuleCall_0(), semanticObject.getLow());
		feeder.accept(grammarAccess.getAtomAccess().getListParamListParserRuleCall_2_0(), semanticObject.getList());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statements returns Comment
	 *     Comment returns Comment
	 *
	 * Constraint:
	 *     text=ID
	 */
	protected void sequence_Comment(ISerializationContext context, Comment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.COMMENT__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.COMMENT__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCommentAccess().getTextIDTerminalRuleCall_1_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statements returns Formula
	 *     Assertion returns Formula
	 *     Formula returns Formula
	 *     Formula.Formula_1_0 returns Formula
	 *
	 * Constraint:
	 *     (left=Formula_Formula_1_0 right=Atom)
	 */
	protected void sequence_Formula(ISerializationContext context, Formula semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.FORMULA__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.FORMULA__LEFT));
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.FORMULA__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.FORMULA__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFormulaAccess().getFormulaLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getFormulaAccess().getRightAtomParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     Program+=Statements+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParamList returns ParamList
	 *     ParamList.ParamList_1_0 returns ParamList
	 *
	 * Constraint:
	 *     (left=ParamList_ParamList_1_0 right=Primary)
	 */
	protected void sequence_ParamList(ISerializationContext context, ParamList semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.PARAM_LIST__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.PARAM_LIST__LEFT));
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.PARAM_LIST__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.PARAM_LIST__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParamListAccess().getParamListLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getParamListAccess().getRightPrimaryParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParamList returns ParameterInt
	 *     ParamList.ParamList_1_0 returns ParameterInt
	 *     Primary returns ParameterInt
	 *     ParameterInt returns ParameterInt
	 *
	 * Constraint:
	 *     int=INT
	 */
	protected void sequence_ParameterInt(ISerializationContext context, ParameterInt semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.PARAMETER_INT__INT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.PARAMETER_INT__INT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterIntAccess().getIntINTTerminalRuleCall_0(), semanticObject.getInt());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParamList returns ParameterPred
	 *     ParamList.ParamList_1_0 returns ParameterPred
	 *     Primary returns ParameterPred
	 *     ParameterPred returns ParameterPred
	 *
	 * Constraint:
	 *     low=PREDICATE
	 */
	protected void sequence_ParameterPred(ISerializationContext context, ParameterPred semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.PARAMETER_PRED__LOW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.PARAMETER_PRED__LOW));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterPredAccess().getLowPREDICATETerminalRuleCall_0(), semanticObject.getLow());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParamList returns ParameterVar
	 *     ParamList.ParamList_1_0 returns ParameterVar
	 *     Primary returns ParameterVar
	 *     ParameterVar returns ParameterVar
	 *
	 * Constraint:
	 *     up=VARIABLE
	 */
	protected void sequence_ParameterVar(ISerializationContext context, ParameterVar semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.PARAMETER_VAR__UP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.PARAMETER_VAR__UP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterVarAccess().getUpVARIABLETerminalRuleCall_0(), semanticObject.getUp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statements returns Statements
	 *
	 * Constraint:
	 *     {Statements}
	 */
	protected void sequence_Statements(ISerializationContext context, Statements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
