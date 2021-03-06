/*
 * generated by Xtext 2.24.0
 */
package org.xtext.mde.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class DatalogGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.Model");
		private final Assignment cProgramAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cProgramStmtPlusMinusParserRuleCall_0 = (RuleCall)cProgramAssignment.eContents().get(0);
		
		//Model:
		//	Program+=StmtPlusMinus*;
		@Override public ParserRule getRule() { return rule; }
		
		//Program+=StmtPlusMinus*
		public Assignment getProgramAssignment() { return cProgramAssignment; }
		
		//StmtPlusMinus
		public RuleCall getProgramStmtPlusMinusParserRuleCall_0() { return cProgramStmtPlusMinusParserRuleCall_0; }
	}
	public class StmtPlusMinusElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.StmtPlusMinus");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftStmtPlusParserRuleCall_0_0 = (RuleCall)cLeftAssignment_0.eContents().get(0);
		private final Assignment cRightAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cRightStmtMinusParserRuleCall_1_0 = (RuleCall)cRightAssignment_1.eContents().get(0);
		
		//StmtPlusMinus:
		//	left=StmtPlus right=StmtMinus;
		@Override public ParserRule getRule() { return rule; }
		
		//left=StmtPlus right=StmtMinus
		public Group getGroup() { return cGroup; }
		
		//left=StmtPlus
		public Assignment getLeftAssignment_0() { return cLeftAssignment_0; }
		
		//StmtPlus
		public RuleCall getLeftStmtPlusParserRuleCall_0_0() { return cLeftStmtPlusParserRuleCall_0_0; }
		
		//right=StmtMinus
		public Assignment getRightAssignment_1() { return cRightAssignment_1; }
		
		//StmtMinus
		public RuleCall getRightStmtMinusParserRuleCall_1_0() { return cRightStmtMinusParserRuleCall_1_0; }
	}
	public class StmtPlusElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.StmtPlus");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPlusAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cPlusPlusSignKeyword_0_0 = (Keyword)cPlusAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cStmtPlusLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cRightPlusAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightPlusStatementsParserRuleCall_1_1_0 = (RuleCall)cRightPlusAssignment_1_1.eContents().get(0);
		
		//StmtPlus:
		//	plus="+" ({StmtPlus.left=current} rightPlus=Statements)+;
		@Override public ParserRule getRule() { return rule; }
		
		//plus="+" ({StmtPlus.left=current} rightPlus=Statements)+
		public Group getGroup() { return cGroup; }
		
		//plus="+"
		public Assignment getPlusAssignment_0() { return cPlusAssignment_0; }
		
		//"+"
		public Keyword getPlusPlusSignKeyword_0_0() { return cPlusPlusSignKeyword_0_0; }
		
		//({StmtPlus.left=current} rightPlus=Statements)+
		public Group getGroup_1() { return cGroup_1; }
		
		//{StmtPlus.left=current}
		public Action getStmtPlusLeftAction_1_0() { return cStmtPlusLeftAction_1_0; }
		
		//rightPlus=Statements
		public Assignment getRightPlusAssignment_1_1() { return cRightPlusAssignment_1_1; }
		
		//Statements
		public RuleCall getRightPlusStatementsParserRuleCall_1_1_0() { return cRightPlusStatementsParserRuleCall_1_1_0; }
	}
	public class StmtMinusElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.StmtMinus");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cMinusAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cMinusHyphenMinusKeyword_0_0 = (Keyword)cMinusAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cStmtMinusLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cRightMinusAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightMinusAssertionMinusParserRuleCall_1_1_0 = (RuleCall)cRightMinusAssignment_1_1.eContents().get(0);
		
		//StmtMinus:
		//	minus="-" ({StmtMinus.left=current} rightMinus=AssertionMinus)*;
		@Override public ParserRule getRule() { return rule; }
		
		//minus="-" ({StmtMinus.left=current} rightMinus=AssertionMinus)*
		public Group getGroup() { return cGroup; }
		
		//minus="-"
		public Assignment getMinusAssignment_0() { return cMinusAssignment_0; }
		
		//"-"
		public Keyword getMinusHyphenMinusKeyword_0_0() { return cMinusHyphenMinusKeyword_0_0; }
		
		//({StmtMinus.left=current} rightMinus=AssertionMinus)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{StmtMinus.left=current}
		public Action getStmtMinusLeftAction_1_0() { return cStmtMinusLeftAction_1_0; }
		
		//rightMinus=AssertionMinus
		public Assignment getRightMinusAssignment_1_1() { return cRightMinusAssignment_1_1; }
		
		//AssertionMinus
		public RuleCall getRightMinusAssertionMinusParserRuleCall_1_1_0() { return cRightMinusAssertionMinusParserRuleCall_1_1_0; }
	}
	public class StatementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.Statements");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cConditionAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cConditionConditionsParserRuleCall_0_0 = (RuleCall)cConditionAssignment_0.eContents().get(0);
		private final Assignment cAssertionAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cAssertionAssertionParserRuleCall_1_0 = (RuleCall)cAssertionAssignment_1.eContents().get(0);
		
		//Statements:
		//	condition=Conditions | assertion=Assertion;
		@Override public ParserRule getRule() { return rule; }
		
		//condition=Conditions | assertion=Assertion
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//condition=Conditions
		public Assignment getConditionAssignment_0() { return cConditionAssignment_0; }
		
		//Conditions
		public RuleCall getConditionConditionsParserRuleCall_0_0() { return cConditionConditionsParserRuleCall_0_0; }
		
		//assertion=Assertion
		public Assignment getAssertionAssignment_1() { return cAssertionAssignment_1; }
		
		//Assertion
		public RuleCall getAssertionAssertionParserRuleCall_1_0() { return cAssertionAssertionParserRuleCall_1_0; }
	}
	public class ConditionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.Conditions");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCondAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCondAtomParserRuleCall_0_0 = (RuleCall)cCondAssignment_0.eContents().get(0);
		private final Assignment cSignAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cSignColonHyphenMinusKeyword_1_0 = (Keyword)cSignAssignment_1.eContents().get(0);
		private final Assignment cRightAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRightFormulaCParserRuleCall_2_0 = (RuleCall)cRightAssignment_2.eContents().get(0);
		private final Assignment cDotAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final Keyword cDotFullStopKeyword_3_0 = (Keyword)cDotAssignment_3.eContents().get(0);
		
		//Conditions:
		//	Cond=Atom Sign=':-' right=FormulaC dot='.';
		@Override public ParserRule getRule() { return rule; }
		
		//Cond=Atom Sign=':-' right=FormulaC dot='.'
		public Group getGroup() { return cGroup; }
		
		//Cond=Atom
		public Assignment getCondAssignment_0() { return cCondAssignment_0; }
		
		//Atom
		public RuleCall getCondAtomParserRuleCall_0_0() { return cCondAtomParserRuleCall_0_0; }
		
		//Sign=':-'
		public Assignment getSignAssignment_1() { return cSignAssignment_1; }
		
		//':-'
		public Keyword getSignColonHyphenMinusKeyword_1_0() { return cSignColonHyphenMinusKeyword_1_0; }
		
		//right=FormulaC
		public Assignment getRightAssignment_2() { return cRightAssignment_2; }
		
		//FormulaC
		public RuleCall getRightFormulaCParserRuleCall_2_0() { return cRightFormulaCParserRuleCall_2_0; }
		
		//dot='.'
		public Assignment getDotAssignment_3() { return cDotAssignment_3; }
		
		//'.'
		public Keyword getDotFullStopKeyword_3_0() { return cDotFullStopKeyword_3_0; }
	}
	public class AssertionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.Assertion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTruthAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTruthAtomParserRuleCall_0_0 = (RuleCall)cTruthAssignment_0.eContents().get(0);
		private final Assignment cDotAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cDotFullStopKeyword_1_0 = (Keyword)cDotAssignment_1.eContents().get(0);
		
		//Assertion:
		//	Truth=Atom dot='.';
		@Override public ParserRule getRule() { return rule; }
		
		//Truth=Atom dot='.'
		public Group getGroup() { return cGroup; }
		
		//Truth=Atom
		public Assignment getTruthAssignment_0() { return cTruthAssignment_0; }
		
		//Atom
		public RuleCall getTruthAtomParserRuleCall_0_0() { return cTruthAtomParserRuleCall_0_0; }
		
		//dot='.'
		public Assignment getDotAssignment_1() { return cDotAssignment_1; }
		
		//'.'
		public Keyword getDotFullStopKeyword_1_0() { return cDotFullStopKeyword_1_0; }
	}
	public class AssertionMinusElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.AssertionMinus");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCheckAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCheckFormulaCParserRuleCall_0_0 = (RuleCall)cCheckAssignment_0.eContents().get(0);
		private final Assignment cDotAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cDotFullStopKeyword_1_0 = (Keyword)cDotAssignment_1.eContents().get(0);
		
		//AssertionMinus:
		//	Check=FormulaC dot='.';
		@Override public ParserRule getRule() { return rule; }
		
		//Check=FormulaC dot='.'
		public Group getGroup() { return cGroup; }
		
		//Check=FormulaC
		public Assignment getCheckAssignment_0() { return cCheckAssignment_0; }
		
		//FormulaC
		public RuleCall getCheckFormulaCParserRuleCall_0_0() { return cCheckFormulaCParserRuleCall_0_0; }
		
		//dot='.'
		public Assignment getDotAssignment_1() { return cDotAssignment_1; }
		
		//'.'
		public Keyword getDotFullStopKeyword_1_0() { return cDotFullStopKeyword_1_0; }
	}
	public class FormulaCElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.FormulaC");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFirstAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cFirstAtomCParserRuleCall_0_0 = (RuleCall)cFirstAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cFormulaLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cCommaAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Keyword cCommaCommaKeyword_1_1_0 = (Keyword)cCommaAssignment_1_1.eContents().get(0);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightAtomCParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//FormulaC:
		//	First=AtomC ({Formula.left=current} comma=',' right=AtomC)*;
		@Override public ParserRule getRule() { return rule; }
		
		//First=AtomC ({Formula.left=current} comma=',' right=AtomC)*
		public Group getGroup() { return cGroup; }
		
		//First=AtomC
		public Assignment getFirstAssignment_0() { return cFirstAssignment_0; }
		
		//AtomC
		public RuleCall getFirstAtomCParserRuleCall_0_0() { return cFirstAtomCParserRuleCall_0_0; }
		
		//({Formula.left=current} comma=',' right=AtomC)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Formula.left=current}
		public Action getFormulaLeftAction_1_0() { return cFormulaLeftAction_1_0; }
		
		//comma=','
		public Assignment getCommaAssignment_1_1() { return cCommaAssignment_1_1; }
		
		//','
		public Keyword getCommaCommaKeyword_1_1_0() { return cCommaCommaKeyword_1_1_0; }
		
		//right=AtomC
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//AtomC
		public RuleCall getRightAtomCParserRuleCall_1_2_0() { return cRightAtomCParserRuleCall_1_2_0; }
	}
	public class AtomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.Atom");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cLpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cLpLeftParenthesisKeyword_1_0 = (Keyword)cLpAssignment_1.eContents().get(0);
		private final Assignment cListAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cListParamListParserRuleCall_2_0 = (RuleCall)cListAssignment_2.eContents().get(0);
		private final Assignment cRpAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final Keyword cRpRightParenthesisKeyword_3_0 = (Keyword)cRpAssignment_3.eContents().get(0);
		
		//Atom:
		//	name=ID lp='(' list=ParamList rp=')';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID lp='(' list=ParamList rp=')'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//lp='('
		public Assignment getLpAssignment_1() { return cLpAssignment_1; }
		
		//'('
		public Keyword getLpLeftParenthesisKeyword_1_0() { return cLpLeftParenthesisKeyword_1_0; }
		
		//list=ParamList
		public Assignment getListAssignment_2() { return cListAssignment_2; }
		
		//ParamList
		public RuleCall getListParamListParserRuleCall_2_0() { return cListParamListParserRuleCall_2_0; }
		
		//rp=')'
		public Assignment getRpAssignment_3() { return cRpAssignment_3; }
		
		//')'
		public Keyword getRpRightParenthesisKeyword_3_0() { return cRpRightParenthesisKeyword_3_0; }
	}
	public class AtomCElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.AtomC");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cNameAtomCrossReference_0_0 = (CrossReference)cNameAssignment_0.eContents().get(0);
		private final RuleCall cNameAtomIDTerminalRuleCall_0_0_1 = (RuleCall)cNameAtomCrossReference_0_0.eContents().get(1);
		private final Assignment cLpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cLpLeftParenthesisKeyword_1_0 = (Keyword)cLpAssignment_1.eContents().get(0);
		private final Assignment cListAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cListParamListParserRuleCall_2_0 = (RuleCall)cListAssignment_2.eContents().get(0);
		private final Assignment cRpAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final Keyword cRpRightParenthesisKeyword_3_0 = (Keyword)cRpAssignment_3.eContents().get(0);
		
		//AtomC:
		//	name=[Atom] lp='(' list=ParamList rp=')';
		@Override public ParserRule getRule() { return rule; }
		
		//name=[Atom] lp='(' list=ParamList rp=')'
		public Group getGroup() { return cGroup; }
		
		//name=[Atom]
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//[Atom]
		public CrossReference getNameAtomCrossReference_0_0() { return cNameAtomCrossReference_0_0; }
		
		//ID
		public RuleCall getNameAtomIDTerminalRuleCall_0_0_1() { return cNameAtomIDTerminalRuleCall_0_0_1; }
		
		//lp='('
		public Assignment getLpAssignment_1() { return cLpAssignment_1; }
		
		//'('
		public Keyword getLpLeftParenthesisKeyword_1_0() { return cLpLeftParenthesisKeyword_1_0; }
		
		//list=ParamList
		public Assignment getListAssignment_2() { return cListAssignment_2; }
		
		//ParamList
		public RuleCall getListParamListParserRuleCall_2_0() { return cListParamListParserRuleCall_2_0; }
		
		//rp=')'
		public Assignment getRpAssignment_3() { return cRpAssignment_3; }
		
		//')'
		public Keyword getRpRightParenthesisKeyword_3_0() { return cRpRightParenthesisKeyword_3_0; }
	}
	public class ParamListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.ParamList");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLeftAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLeftPrimaryParserRuleCall_0_0 = (RuleCall)cLeftAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cParamListLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cCommaAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Keyword cCommaCommaKeyword_1_1_0 = (Keyword)cCommaAssignment_1_1.eContents().get(0);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightPrimaryParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//ParamList Par:
		//	left=Primary ({ParamList.left=current} comma=',' right=Primary)*;
		@Override public ParserRule getRule() { return rule; }
		
		//left=Primary ({ParamList.left=current} comma=',' right=Primary)*
		public Group getGroup() { return cGroup; }
		
		//left=Primary
		public Assignment getLeftAssignment_0() { return cLeftAssignment_0; }
		
		//Primary
		public RuleCall getLeftPrimaryParserRuleCall_0_0() { return cLeftPrimaryParserRuleCall_0_0; }
		
		//({ParamList.left=current} comma=',' right=Primary)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{ParamList.left=current}
		public Action getParamListLeftAction_1_0() { return cParamListLeftAction_1_0; }
		
		//comma=','
		public Assignment getCommaAssignment_1_1() { return cCommaAssignment_1_1; }
		
		//','
		public Keyword getCommaCommaKeyword_1_1_0() { return cCommaCommaKeyword_1_1_0; }
		
		//right=Primary
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Primary
		public RuleCall getRightPrimaryParserRuleCall_1_2_0() { return cRightPrimaryParserRuleCall_1_2_0; }
	}
	public class PrimaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.Primary");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueIDTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//Primary Par:
		//	value=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//value=ID
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//ID
		public RuleCall getValueIDTerminalRuleCall_0() { return cValueIDTerminalRuleCall_0; }
	}
	
	
	private final ModelElements pModel;
	private final StmtPlusMinusElements pStmtPlusMinus;
	private final StmtPlusElements pStmtPlus;
	private final StmtMinusElements pStmtMinus;
	private final StatementsElements pStatements;
	private final ConditionsElements pConditions;
	private final AssertionElements pAssertion;
	private final AssertionMinusElements pAssertionMinus;
	private final FormulaCElements pFormulaC;
	private final AtomElements pAtom;
	private final AtomCElements pAtomC;
	private final ParamListElements pParamList;
	private final PrimaryElements pPrimary;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DatalogGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pStmtPlusMinus = new StmtPlusMinusElements();
		this.pStmtPlus = new StmtPlusElements();
		this.pStmtMinus = new StmtMinusElements();
		this.pStatements = new StatementsElements();
		this.pConditions = new ConditionsElements();
		this.pAssertion = new AssertionElements();
		this.pAssertionMinus = new AssertionMinusElements();
		this.pFormulaC = new FormulaCElements();
		this.pAtom = new AtomElements();
		this.pAtomC = new AtomCElements();
		this.pParamList = new ParamListElements();
		this.pPrimary = new PrimaryElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.mde.Datalog".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	Program+=StmtPlusMinus*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//StmtPlusMinus:
	//	left=StmtPlus right=StmtMinus;
	public StmtPlusMinusElements getStmtPlusMinusAccess() {
		return pStmtPlusMinus;
	}
	
	public ParserRule getStmtPlusMinusRule() {
		return getStmtPlusMinusAccess().getRule();
	}
	
	//StmtPlus:
	//	plus="+" ({StmtPlus.left=current} rightPlus=Statements)+;
	public StmtPlusElements getStmtPlusAccess() {
		return pStmtPlus;
	}
	
	public ParserRule getStmtPlusRule() {
		return getStmtPlusAccess().getRule();
	}
	
	//StmtMinus:
	//	minus="-" ({StmtMinus.left=current} rightMinus=AssertionMinus)*;
	public StmtMinusElements getStmtMinusAccess() {
		return pStmtMinus;
	}
	
	public ParserRule getStmtMinusRule() {
		return getStmtMinusAccess().getRule();
	}
	
	//Statements:
	//	condition=Conditions | assertion=Assertion;
	public StatementsElements getStatementsAccess() {
		return pStatements;
	}
	
	public ParserRule getStatementsRule() {
		return getStatementsAccess().getRule();
	}
	
	//Conditions:
	//	Cond=Atom Sign=':-' right=FormulaC dot='.';
	public ConditionsElements getConditionsAccess() {
		return pConditions;
	}
	
	public ParserRule getConditionsRule() {
		return getConditionsAccess().getRule();
	}
	
	//Assertion:
	//	Truth=Atom dot='.';
	public AssertionElements getAssertionAccess() {
		return pAssertion;
	}
	
	public ParserRule getAssertionRule() {
		return getAssertionAccess().getRule();
	}
	
	//AssertionMinus:
	//	Check=FormulaC dot='.';
	public AssertionMinusElements getAssertionMinusAccess() {
		return pAssertionMinus;
	}
	
	public ParserRule getAssertionMinusRule() {
		return getAssertionMinusAccess().getRule();
	}
	
	//FormulaC:
	//	First=AtomC ({Formula.left=current} comma=',' right=AtomC)*;
	public FormulaCElements getFormulaCAccess() {
		return pFormulaC;
	}
	
	public ParserRule getFormulaCRule() {
		return getFormulaCAccess().getRule();
	}
	
	//Atom:
	//	name=ID lp='(' list=ParamList rp=')';
	public AtomElements getAtomAccess() {
		return pAtom;
	}
	
	public ParserRule getAtomRule() {
		return getAtomAccess().getRule();
	}
	
	//AtomC:
	//	name=[Atom] lp='(' list=ParamList rp=')';
	public AtomCElements getAtomCAccess() {
		return pAtomC;
	}
	
	public ParserRule getAtomCRule() {
		return getAtomCAccess().getRule();
	}
	
	//ParamList Par:
	//	left=Primary ({ParamList.left=current} comma=',' right=Primary)*;
	public ParamListElements getParamListAccess() {
		return pParamList;
	}
	
	public ParserRule getParamListRule() {
		return getParamListAccess().getRule();
	}
	
	//Primary Par:
	//	value=ID;
	public PrimaryElements getPrimaryAccess() {
		return pPrimary;
	}
	
	public ParserRule getPrimaryRule() {
		return getPrimaryAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
