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
		private final RuleCall cProgramStatementsParserRuleCall_0 = (RuleCall)cProgramAssignment.eContents().get(0);
		
		//Model:
		//	Program+=Statements*;
		@Override public ParserRule getRule() { return rule; }
		
		//Program+=Statements*
		public Assignment getProgramAssignment() { return cProgramAssignment; }
		
		//Statements
		public RuleCall getProgramStatementsParserRuleCall_0() { return cProgramStatementsParserRuleCall_0; }
	}
	public class StatementsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.Statements");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cStatementsAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final RuleCall cPlusSignParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cStatementsAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final RuleCall cMinusSignParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final RuleCall cConditionsParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cAssertionParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Action cStatementsAction_4_0 = (Action)cGroup_4.eContents().get(0);
		private final RuleCall cComParserRuleCall_4_1 = (RuleCall)cGroup_4.eContents().get(1);
		
		//Statements:
		//	{Statements} PlusSign | {Statements} MinusSign | Conditions | Assertion | {Statements} Com;
		@Override public ParserRule getRule() { return rule; }
		
		//{Statements} PlusSign | {Statements} MinusSign | Conditions | Assertion | {Statements} Com
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{Statements} PlusSign
		public Group getGroup_0() { return cGroup_0; }
		
		//{Statements}
		public Action getStatementsAction_0_0() { return cStatementsAction_0_0; }
		
		//PlusSign
		public RuleCall getPlusSignParserRuleCall_0_1() { return cPlusSignParserRuleCall_0_1; }
		
		//{Statements} MinusSign
		public Group getGroup_1() { return cGroup_1; }
		
		//{Statements}
		public Action getStatementsAction_1_0() { return cStatementsAction_1_0; }
		
		//MinusSign
		public RuleCall getMinusSignParserRuleCall_1_1() { return cMinusSignParserRuleCall_1_1; }
		
		//Conditions
		public RuleCall getConditionsParserRuleCall_2() { return cConditionsParserRuleCall_2; }
		
		//Assertion
		public RuleCall getAssertionParserRuleCall_3() { return cAssertionParserRuleCall_3; }
		
		//{Statements} Com
		public Group getGroup_4() { return cGroup_4; }
		
		//{Statements}
		public Action getStatementsAction_4_0() { return cStatementsAction_4_0; }
		
		//Com
		public RuleCall getComParserRuleCall_4_1() { return cComParserRuleCall_4_1; }
	}
	public class PlusSignElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.PlusSign");
		private final Keyword cPlusSignKeyword = (Keyword)rule.eContents().get(1);
		
		//PlusSign:
		//	'+';
		@Override public ParserRule getRule() { return rule; }
		
		//'+'
		public Keyword getPlusSignKeyword() { return cPlusSignKeyword; }
	}
	public class MinusSignElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.MinusSign");
		private final Keyword cHyphenMinusKeyword = (Keyword)rule.eContents().get(1);
		
		//MinusSign:
		//	'-';
		@Override public ParserRule getRule() { return rule; }
		
		//'-'
		public Keyword getHyphenMinusKeyword() { return cHyphenMinusKeyword; }
	}
	public class ComElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.Com");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSolidusAsteriskKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cAsteriskSolidusKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Com:
		//	'/*' -> '*/';
		@Override public ParserRule getRule() { return rule; }
		
		//'/*' -> '*/'
		public Group getGroup() { return cGroup; }
		
		//'/*'
		public Keyword getSolidusAsteriskKeyword_0() { return cSolidusAsteriskKeyword_0; }
		
		//-> '*/'
		public Keyword getAsteriskSolidusKeyword_1() { return cAsteriskSolidusKeyword_1; }
	}
	public class ConditionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.Conditions");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCondAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCondAtomParserRuleCall_0_0 = (RuleCall)cCondAssignment_0.eContents().get(0);
		private final Keyword cColonHyphenMinusKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cRightAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRightFormulaParserRuleCall_2_0 = (RuleCall)cRightAssignment_2.eContents().get(0);
		private final Keyword cFullStopKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Conditions:
		//	Cond=Atom ':-' right=Formula '.';
		@Override public ParserRule getRule() { return rule; }
		
		//Cond=Atom ':-' right=Formula '.'
		public Group getGroup() { return cGroup; }
		
		//Cond=Atom
		public Assignment getCondAssignment_0() { return cCondAssignment_0; }
		
		//Atom
		public RuleCall getCondAtomParserRuleCall_0_0() { return cCondAtomParserRuleCall_0_0; }
		
		//':-'
		public Keyword getColonHyphenMinusKeyword_1() { return cColonHyphenMinusKeyword_1; }
		
		//right=Formula
		public Assignment getRightAssignment_2() { return cRightAssignment_2; }
		
		//Formula
		public RuleCall getRightFormulaParserRuleCall_2_0() { return cRightFormulaParserRuleCall_2_0; }
		
		//'.'
		public Keyword getFullStopKeyword_3() { return cFullStopKeyword_3; }
	}
	public class AssertionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.Assertion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTruthAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTruthFormulaParserRuleCall_0_0 = (RuleCall)cTruthAssignment_0.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Assertion:
		//	Truth=Formula '.';
		@Override public ParserRule getRule() { return rule; }
		
		//Truth=Formula '.'
		public Group getGroup() { return cGroup; }
		
		//Truth=Formula
		public Assignment getTruthAssignment_0() { return cTruthAssignment_0; }
		
		//Formula
		public RuleCall getTruthFormulaParserRuleCall_0_0() { return cTruthFormulaParserRuleCall_0_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
	}
	public class FormulaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.Formula");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAtomParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cFormulaLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cCommaKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightAtomParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//Formula:
		//	Atom ({Formula.left=current} ',' right=Atom)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Atom ({Formula.left=current} ',' right=Atom)*
		public Group getGroup() { return cGroup; }
		
		//Atom
		public RuleCall getAtomParserRuleCall_0() { return cAtomParserRuleCall_0; }
		
		//({Formula.left=current} ',' right=Atom)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{Formula.left=current}
		public Action getFormulaLeftAction_1_0() { return cFormulaLeftAction_1_0; }
		
		//','
		public Keyword getCommaKeyword_1_1() { return cCommaKeyword_1_1; }
		
		//right=Atom
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Atom
		public RuleCall getRightAtomParserRuleCall_1_2_0() { return cRightAtomParserRuleCall_1_2_0; }
	}
	public class AtomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.Atom");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameParameterPredParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cListAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cListParamListParserRuleCall_2_0 = (RuleCall)cListAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Atom:
		//	name=ParameterPred '(' list=ParamList ')';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ParameterPred '(' list=ParamList ')'
		public Group getGroup() { return cGroup; }
		
		//name=ParameterPred
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ParameterPred
		public RuleCall getNameParameterPredParserRuleCall_0_0() { return cNameParameterPredParserRuleCall_0_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//list=ParamList
		public Assignment getListAssignment_2() { return cListAssignment_2; }
		
		//ParamList
		public RuleCall getListParamListParserRuleCall_2_0() { return cListParamListParserRuleCall_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class ParamListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.ParamList");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrimaryParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cParamListLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cCommaKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightPrimaryParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//ParamList Par:
		//	Primary ({ParamList.left=current} ',' right=Primary)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Primary ({ParamList.left=current} ',' right=Primary)*
		public Group getGroup() { return cGroup; }
		
		//Primary
		public RuleCall getPrimaryParserRuleCall_0() { return cPrimaryParserRuleCall_0; }
		
		//({ParamList.left=current} ',' right=Primary)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{ParamList.left=current}
		public Action getParamListLeftAction_1_0() { return cParamListLeftAction_1_0; }
		
		//','
		public Keyword getCommaKeyword_1_1() { return cCommaKeyword_1_1; }
		
		//right=Primary
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Primary
		public RuleCall getRightPrimaryParserRuleCall_1_2_0() { return cRightPrimaryParserRuleCall_1_2_0; }
	}
	public class PrimaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.Primary");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cParameterPredParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cParameterVarParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cParameterIntParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Primary Par:
		//	ParameterPred | ParameterVar | ParameterInt;
		@Override public ParserRule getRule() { return rule; }
		
		//ParameterPred | ParameterVar | ParameterInt
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ParameterPred
		public RuleCall getParameterPredParserRuleCall_0() { return cParameterPredParserRuleCall_0; }
		
		//ParameterVar
		public RuleCall getParameterVarParserRuleCall_1() { return cParameterVarParserRuleCall_1; }
		
		//ParameterInt
		public RuleCall getParameterIntParserRuleCall_2() { return cParameterIntParserRuleCall_2; }
	}
	public class ParameterIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.ParameterInt");
		private final Assignment cIntAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cIntINTTerminalRuleCall_0 = (RuleCall)cIntAssignment.eContents().get(0);
		
		//ParameterInt:
		//	int=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//int=INT
		public Assignment getIntAssignment() { return cIntAssignment; }
		
		//INT
		public RuleCall getIntINTTerminalRuleCall_0() { return cIntINTTerminalRuleCall_0; }
	}
	public class ParameterVarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.ParameterVar");
		private final Assignment cUpAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cUpVARIABLETerminalRuleCall_0 = (RuleCall)cUpAssignment.eContents().get(0);
		
		//ParameterVar:
		//	up=VARIABLE;
		@Override public ParserRule getRule() { return rule; }
		
		//up=VARIABLE
		public Assignment getUpAssignment() { return cUpAssignment; }
		
		//VARIABLE
		public RuleCall getUpVARIABLETerminalRuleCall_0() { return cUpVARIABLETerminalRuleCall_0; }
	}
	public class ParameterPredElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.ParameterPred");
		private final Assignment cLowAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cLowPREDICATETerminalRuleCall_0 = (RuleCall)cLowAssignment.eContents().get(0);
		
		//ParameterPred:
		//	low=PREDICATE;
		@Override public ParserRule getRule() { return rule; }
		
		//low=PREDICATE
		public Assignment getLowAssignment() { return cLowAssignment; }
		
		//PREDICATE
		public RuleCall getLowPREDICATETerminalRuleCall_0() { return cLowPREDICATETerminalRuleCall_0; }
	}
	
	
	private final ModelElements pModel;
	private final StatementsElements pStatements;
	private final PlusSignElements pPlusSign;
	private final MinusSignElements pMinusSign;
	private final ComElements pCom;
	private final ConditionsElements pConditions;
	private final AssertionElements pAssertion;
	private final FormulaElements pFormula;
	private final AtomElements pAtom;
	private final ParamListElements pParamList;
	private final PrimaryElements pPrimary;
	private final ParameterIntElements pParameterInt;
	private final ParameterVarElements pParameterVar;
	private final ParameterPredElements pParameterPred;
	private final TerminalRule tPREDICATE;
	private final TerminalRule tVARIABLE;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DatalogGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pStatements = new StatementsElements();
		this.pPlusSign = new PlusSignElements();
		this.pMinusSign = new MinusSignElements();
		this.pCom = new ComElements();
		this.pConditions = new ConditionsElements();
		this.pAssertion = new AssertionElements();
		this.pFormula = new FormulaElements();
		this.pAtom = new AtomElements();
		this.pParamList = new ParamListElements();
		this.pPrimary = new PrimaryElements();
		this.pParameterInt = new ParameterIntElements();
		this.pParameterVar = new ParameterVarElements();
		this.pParameterPred = new ParameterPredElements();
		this.tPREDICATE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.PREDICATE");
		this.tVARIABLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.mde.Datalog.VARIABLE");
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
	//	Program+=Statements*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Statements:
	//	{Statements} PlusSign | {Statements} MinusSign | Conditions | Assertion | {Statements} Com;
	public StatementsElements getStatementsAccess() {
		return pStatements;
	}
	
	public ParserRule getStatementsRule() {
		return getStatementsAccess().getRule();
	}
	
	//PlusSign:
	//	'+';
	public PlusSignElements getPlusSignAccess() {
		return pPlusSign;
	}
	
	public ParserRule getPlusSignRule() {
		return getPlusSignAccess().getRule();
	}
	
	//MinusSign:
	//	'-';
	public MinusSignElements getMinusSignAccess() {
		return pMinusSign;
	}
	
	public ParserRule getMinusSignRule() {
		return getMinusSignAccess().getRule();
	}
	
	//Com:
	//	'/*' -> '*/';
	public ComElements getComAccess() {
		return pCom;
	}
	
	public ParserRule getComRule() {
		return getComAccess().getRule();
	}
	
	//Conditions:
	//	Cond=Atom ':-' right=Formula '.';
	public ConditionsElements getConditionsAccess() {
		return pConditions;
	}
	
	public ParserRule getConditionsRule() {
		return getConditionsAccess().getRule();
	}
	
	//Assertion:
	//	Truth=Formula '.';
	public AssertionElements getAssertionAccess() {
		return pAssertion;
	}
	
	public ParserRule getAssertionRule() {
		return getAssertionAccess().getRule();
	}
	
	//Formula:
	//	Atom ({Formula.left=current} ',' right=Atom)*;
	public FormulaElements getFormulaAccess() {
		return pFormula;
	}
	
	public ParserRule getFormulaRule() {
		return getFormulaAccess().getRule();
	}
	
	//Atom:
	//	name=ParameterPred '(' list=ParamList ')';
	public AtomElements getAtomAccess() {
		return pAtom;
	}
	
	public ParserRule getAtomRule() {
		return getAtomAccess().getRule();
	}
	
	//ParamList Par:
	//	Primary ({ParamList.left=current} ',' right=Primary)*;
	public ParamListElements getParamListAccess() {
		return pParamList;
	}
	
	public ParserRule getParamListRule() {
		return getParamListAccess().getRule();
	}
	
	//Primary Par:
	//	ParameterPred | ParameterVar | ParameterInt;
	public PrimaryElements getPrimaryAccess() {
		return pPrimary;
	}
	
	public ParserRule getPrimaryRule() {
		return getPrimaryAccess().getRule();
	}
	
	//ParameterInt:
	//	int=INT;
	public ParameterIntElements getParameterIntAccess() {
		return pParameterInt;
	}
	
	public ParserRule getParameterIntRule() {
		return getParameterIntAccess().getRule();
	}
	
	//ParameterVar:
	//	up=VARIABLE;
	public ParameterVarElements getParameterVarAccess() {
		return pParameterVar;
	}
	
	public ParserRule getParameterVarRule() {
		return getParameterVarAccess().getRule();
	}
	
	//ParameterPred:
	//	low=PREDICATE;
	public ParameterPredElements getParameterPredAccess() {
		return pParameterPred;
	}
	
	public ParserRule getParameterPredRule() {
		return getParameterPredAccess().getRule();
	}
	
	//terminal PREDICATE:
	//	'a'..'z' ('a'..'z' | '0'..'9' | 'A'..'Z' | '_')*;
	public TerminalRule getPREDICATERule() {
		return tPREDICATE;
	}
	
	//terminal VARIABLE:
	//	'A'..'Z' ('A'..'Z' | 'a'..'z' | '0'..'9' | '_')*;
	public TerminalRule getVARIABLERule() {
		return tVARIABLE;
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
