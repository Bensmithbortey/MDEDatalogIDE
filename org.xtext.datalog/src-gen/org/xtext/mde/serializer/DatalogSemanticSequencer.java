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
import org.xtext.mde.datalog.Assertion;
import org.xtext.mde.datalog.AssertionMinus;
import org.xtext.mde.datalog.Atom;
import org.xtext.mde.datalog.AtomC;
import org.xtext.mde.datalog.Conditions;
import org.xtext.mde.datalog.DatalogPackage;
import org.xtext.mde.datalog.Formula;
import org.xtext.mde.datalog.FormulaC;
import org.xtext.mde.datalog.Model;
import org.xtext.mde.datalog.Par;
import org.xtext.mde.datalog.ParamList;
import org.xtext.mde.datalog.Statements;
import org.xtext.mde.datalog.StmtMinus;
import org.xtext.mde.datalog.StmtPlus;
import org.xtext.mde.datalog.StmtPlusMinus;
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
			case DatalogPackage.ASSERTION:
				sequence_Assertion(context, (Assertion) semanticObject); 
				return; 
			case DatalogPackage.ASSERTION_MINUS:
				sequence_AssertionMinus(context, (AssertionMinus) semanticObject); 
				return; 
			case DatalogPackage.ATOM:
				sequence_Atom(context, (Atom) semanticObject); 
				return; 
			case DatalogPackage.ATOM_C:
				sequence_AtomC(context, (AtomC) semanticObject); 
				return; 
			case DatalogPackage.CONDITIONS:
				sequence_Conditions(context, (Conditions) semanticObject); 
				return; 
			case DatalogPackage.FORMULA:
				sequence_FormulaC(context, (Formula) semanticObject); 
				return; 
			case DatalogPackage.FORMULA_C:
				sequence_FormulaC(context, (FormulaC) semanticObject); 
				return; 
			case DatalogPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case DatalogPackage.PAR:
				if (rule == grammarAccess.getParamListRule()
						|| action == grammarAccess.getParamListAccess().getParamListLeftAction_1_0()) {
					sequence_ParamList(context, (Par) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPrimaryRule()) {
					sequence_Primary(context, (Par) semanticObject); 
					return; 
				}
				else break;
			case DatalogPackage.PARAM_LIST:
				sequence_ParamList(context, (ParamList) semanticObject); 
				return; 
			case DatalogPackage.STATEMENTS:
				sequence_Statements(context, (Statements) semanticObject); 
				return; 
			case DatalogPackage.STMT_MINUS:
				sequence_StmtMinus(context, (StmtMinus) semanticObject); 
				return; 
			case DatalogPackage.STMT_PLUS:
				if (rule == grammarAccess.getStmtPlusRule()) {
					sequence_StmtPlus(context, (StmtPlus) semanticObject); 
					return; 
				}
				else if (action == grammarAccess.getStmtPlusAccess().getStmtPlusLeftAction_1_0()) {
					sequence_StmtPlus_StmtPlus_1_0(context, (StmtPlus) semanticObject); 
					return; 
				}
				else break;
			case DatalogPackage.STMT_PLUS_MINUS:
				sequence_StmtPlusMinus(context, (StmtPlusMinus) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AssertionMinus returns AssertionMinus
	 *
	 * Constraint:
	 *     (Check=FormulaC dot='.')
	 */
	protected void sequence_AssertionMinus(ISerializationContext context, AssertionMinus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.ASSERTION_MINUS__CHECK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.ASSERTION_MINUS__CHECK));
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.ASSERTION_MINUS__DOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.ASSERTION_MINUS__DOT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssertionMinusAccess().getCheckFormulaCParserRuleCall_0_0(), semanticObject.getCheck());
		feeder.accept(grammarAccess.getAssertionMinusAccess().getDotFullStopKeyword_1_0(), semanticObject.getDot());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Assertion returns Assertion
	 *
	 * Constraint:
	 *     (Truth=Atom dot='.')
	 */
	protected void sequence_Assertion(ISerializationContext context, Assertion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.ASSERTION__TRUTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.ASSERTION__TRUTH));
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.ASSERTION__DOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.ASSERTION__DOT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssertionAccess().getTruthAtomParserRuleCall_0_0(), semanticObject.getTruth());
		feeder.accept(grammarAccess.getAssertionAccess().getDotFullStopKeyword_1_0(), semanticObject.getDot());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AtomC returns AtomC
	 *
	 * Constraint:
	 *     (name=[Atom|ID] lp='(' list=ParamList rp=')')
	 */
	protected void sequence_AtomC(ISerializationContext context, AtomC semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.ATOM_C__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.ATOM_C__NAME));
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.ATOM_C__LP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.ATOM_C__LP));
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.ATOM_C__LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.ATOM_C__LIST));
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.ATOM_C__RP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.ATOM_C__RP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomCAccess().getNameAtomIDTerminalRuleCall_0_0_1(), semanticObject.eGet(DatalogPackage.Literals.ATOM_C__NAME, false));
		feeder.accept(grammarAccess.getAtomCAccess().getLpLeftParenthesisKeyword_1_0(), semanticObject.getLp());
		feeder.accept(grammarAccess.getAtomCAccess().getListParamListParserRuleCall_2_0(), semanticObject.getList());
		feeder.accept(grammarAccess.getAtomCAccess().getRpRightParenthesisKeyword_3_0(), semanticObject.getRp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Atom returns Atom
	 *
	 * Constraint:
	 *     (name=ID lp='(' list=ParamList rp=')')
	 */
	protected void sequence_Atom(ISerializationContext context, Atom semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.ATOM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.ATOM__NAME));
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.ATOM__LP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.ATOM__LP));
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.ATOM__LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.ATOM__LIST));
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.ATOM__RP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.ATOM__RP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAtomAccess().getLpLeftParenthesisKeyword_1_0(), semanticObject.getLp());
		feeder.accept(grammarAccess.getAtomAccess().getListParamListParserRuleCall_2_0(), semanticObject.getList());
		feeder.accept(grammarAccess.getAtomAccess().getRpRightParenthesisKeyword_3_0(), semanticObject.getRp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Conditions returns Conditions
	 *
	 * Constraint:
	 *     (Cond=Atom Sign=':-' right=FormulaC dot='.')
	 */
	protected void sequence_Conditions(ISerializationContext context, Conditions semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.CONDITIONS__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.CONDITIONS__COND));
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.CONDITIONS__SIGN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.CONDITIONS__SIGN));
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.CONDITIONS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.CONDITIONS__RIGHT));
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.CONDITIONS__DOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.CONDITIONS__DOT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConditionsAccess().getCondAtomParserRuleCall_0_0(), semanticObject.getCond());
		feeder.accept(grammarAccess.getConditionsAccess().getSignColonHyphenMinusKeyword_1_0(), semanticObject.getSign());
		feeder.accept(grammarAccess.getConditionsAccess().getRightFormulaCParserRuleCall_2_0(), semanticObject.getRight());
		feeder.accept(grammarAccess.getConditionsAccess().getDotFullStopKeyword_3_0(), semanticObject.getDot());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FormulaC returns Formula
	 *     FormulaC.Formula_1_0 returns Formula
	 *
	 * Constraint:
	 *     (left=FormulaC_Formula_1_0 comma=',' right=AtomC)
	 */
	protected void sequence_FormulaC(ISerializationContext context, Formula semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.FORMULA__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.FORMULA__LEFT));
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.FORMULA__COMMA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.FORMULA__COMMA));
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.FORMULA__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.FORMULA__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFormulaCAccess().getFormulaLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getFormulaCAccess().getCommaCommaKeyword_1_1_0(), semanticObject.getComma());
		feeder.accept(grammarAccess.getFormulaCAccess().getRightAtomCParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FormulaC returns FormulaC
	 *     FormulaC.Formula_1_0 returns FormulaC
	 *
	 * Constraint:
	 *     First=AtomC
	 */
	protected void sequence_FormulaC(ISerializationContext context, FormulaC semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.FORMULA_C__FIRST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.FORMULA_C__FIRST));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFormulaCAccess().getFirstAtomCParserRuleCall_0_0(), semanticObject.getFirst());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     Program+=StmtPlusMinus+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParamList returns Par
	 *     ParamList.ParamList_1_0 returns Par
	 *
	 * Constraint:
	 *     left=Primary
	 */
	protected void sequence_ParamList(ISerializationContext context, Par semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.PAR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.PAR__LEFT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParamListAccess().getLeftPrimaryParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParamList returns ParamList
	 *     ParamList.ParamList_1_0 returns ParamList
	 *
	 * Constraint:
	 *     (left=ParamList_ParamList_1_0 comma=',' right=Primary)
	 */
	protected void sequence_ParamList(ISerializationContext context, ParamList semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.PAR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.PAR__LEFT));
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.PARAM_LIST__COMMA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.PARAM_LIST__COMMA));
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.PARAM_LIST__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.PARAM_LIST__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParamListAccess().getParamListLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getParamListAccess().getCommaCommaKeyword_1_1_0(), semanticObject.getComma());
		feeder.accept(grammarAccess.getParamListAccess().getRightPrimaryParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Primary returns Par
	 *
	 * Constraint:
	 *     value=ID
	 */
	protected void sequence_Primary(ISerializationContext context, Par semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.PAR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.PAR__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryAccess().getValueIDTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statements returns Statements
	 *
	 * Constraint:
	 *     (condition=Conditions | assertion=Assertion)
	 */
	protected void sequence_Statements(ISerializationContext context, Statements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StmtMinus returns StmtMinus
	 *     StmtMinus.StmtMinus_1_0 returns StmtMinus
	 *
	 * Constraint:
	 *     (minus='-' | (left=StmtMinus_StmtMinus_1_0 rightMinus=AssertionMinus))
	 */
	protected void sequence_StmtMinus(ISerializationContext context, StmtMinus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StmtPlusMinus returns StmtPlusMinus
	 *
	 * Constraint:
	 *     (left=StmtPlus right=StmtMinus)
	 */
	protected void sequence_StmtPlusMinus(ISerializationContext context, StmtPlusMinus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.STMT_PLUS_MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.STMT_PLUS_MINUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.STMT_PLUS_MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.STMT_PLUS_MINUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStmtPlusMinusAccess().getLeftStmtPlusParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getStmtPlusMinusAccess().getRightStmtMinusParserRuleCall_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StmtPlus returns StmtPlus
	 *
	 * Constraint:
	 *     (left=StmtPlus_StmtPlus_1_0 rightPlus=Statements)
	 */
	protected void sequence_StmtPlus(ISerializationContext context, StmtPlus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.STMT_PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.STMT_PLUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, DatalogPackage.Literals.STMT_PLUS__RIGHT_PLUS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DatalogPackage.Literals.STMT_PLUS__RIGHT_PLUS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStmtPlusAccess().getStmtPlusLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getStmtPlusAccess().getRightPlusStatementsParserRuleCall_1_1_0(), semanticObject.getRightPlus());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StmtPlus.StmtPlus_1_0 returns StmtPlus
	 *
	 * Constraint:
	 *     (plus='+' | (left=StmtPlus_StmtPlus_1_0 rightPlus=Statements))
	 */
	protected void sequence_StmtPlus_StmtPlus_1_0(ISerializationContext context, StmtPlus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
