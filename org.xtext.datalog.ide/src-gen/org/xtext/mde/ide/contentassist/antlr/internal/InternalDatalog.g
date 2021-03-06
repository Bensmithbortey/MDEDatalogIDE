/*
 * generated by Xtext 2.24.0
 */
grammar InternalDatalog;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.mde.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.mde.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.mde.services.DatalogGrammarAccess;

}
@parser::members {
	private DatalogGrammarAccess grammarAccess;

	public void setGrammarAccess(DatalogGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getProgramAssignment()); }
		(rule__Model__ProgramAssignment)*
		{ after(grammarAccess.getModelAccess().getProgramAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStmtPlusMinus
entryRuleStmtPlusMinus
:
{ before(grammarAccess.getStmtPlusMinusRule()); }
	 ruleStmtPlusMinus
{ after(grammarAccess.getStmtPlusMinusRule()); } 
	 EOF 
;

// Rule StmtPlusMinus
ruleStmtPlusMinus 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStmtPlusMinusAccess().getGroup()); }
		(rule__StmtPlusMinus__Group__0)
		{ after(grammarAccess.getStmtPlusMinusAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStmtPlus
entryRuleStmtPlus
:
{ before(grammarAccess.getStmtPlusRule()); }
	 ruleStmtPlus
{ after(grammarAccess.getStmtPlusRule()); } 
	 EOF 
;

// Rule StmtPlus
ruleStmtPlus 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStmtPlusAccess().getGroup()); }
		(rule__StmtPlus__Group__0)
		{ after(grammarAccess.getStmtPlusAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStmtMinus
entryRuleStmtMinus
:
{ before(grammarAccess.getStmtMinusRule()); }
	 ruleStmtMinus
{ after(grammarAccess.getStmtMinusRule()); } 
	 EOF 
;

// Rule StmtMinus
ruleStmtMinus 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStmtMinusAccess().getGroup()); }
		(rule__StmtMinus__Group__0)
		{ after(grammarAccess.getStmtMinusAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStatements
entryRuleStatements
:
{ before(grammarAccess.getStatementsRule()); }
	 ruleStatements
{ after(grammarAccess.getStatementsRule()); } 
	 EOF 
;

// Rule Statements
ruleStatements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStatementsAccess().getAlternatives()); }
		(rule__Statements__Alternatives)
		{ after(grammarAccess.getStatementsAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConditions
entryRuleConditions
:
{ before(grammarAccess.getConditionsRule()); }
	 ruleConditions
{ after(grammarAccess.getConditionsRule()); } 
	 EOF 
;

// Rule Conditions
ruleConditions 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConditionsAccess().getGroup()); }
		(rule__Conditions__Group__0)
		{ after(grammarAccess.getConditionsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAssertion
entryRuleAssertion
:
{ before(grammarAccess.getAssertionRule()); }
	 ruleAssertion
{ after(grammarAccess.getAssertionRule()); } 
	 EOF 
;

// Rule Assertion
ruleAssertion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAssertionAccess().getGroup()); }
		(rule__Assertion__Group__0)
		{ after(grammarAccess.getAssertionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAssertionMinus
entryRuleAssertionMinus
:
{ before(grammarAccess.getAssertionMinusRule()); }
	 ruleAssertionMinus
{ after(grammarAccess.getAssertionMinusRule()); } 
	 EOF 
;

// Rule AssertionMinus
ruleAssertionMinus 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAssertionMinusAccess().getGroup()); }
		(rule__AssertionMinus__Group__0)
		{ after(grammarAccess.getAssertionMinusAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFormulaC
entryRuleFormulaC
:
{ before(grammarAccess.getFormulaCRule()); }
	 ruleFormulaC
{ after(grammarAccess.getFormulaCRule()); } 
	 EOF 
;

// Rule FormulaC
ruleFormulaC 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFormulaCAccess().getGroup()); }
		(rule__FormulaC__Group__0)
		{ after(grammarAccess.getFormulaCAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAtom
entryRuleAtom
:
{ before(grammarAccess.getAtomRule()); }
	 ruleAtom
{ after(grammarAccess.getAtomRule()); } 
	 EOF 
;

// Rule Atom
ruleAtom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAtomAccess().getGroup()); }
		(rule__Atom__Group__0)
		{ after(grammarAccess.getAtomAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAtomC
entryRuleAtomC
:
{ before(grammarAccess.getAtomCRule()); }
	 ruleAtomC
{ after(grammarAccess.getAtomCRule()); } 
	 EOF 
;

// Rule AtomC
ruleAtomC 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAtomCAccess().getGroup()); }
		(rule__AtomC__Group__0)
		{ after(grammarAccess.getAtomCAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParamList
entryRuleParamList
:
{ before(grammarAccess.getParamListRule()); }
	 ruleParamList
{ after(grammarAccess.getParamListRule()); } 
	 EOF 
;

// Rule ParamList
ruleParamList 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParamListAccess().getGroup()); }
		(rule__ParamList__Group__0)
		{ after(grammarAccess.getParamListAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrimary
entryRulePrimary
:
{ before(grammarAccess.getPrimaryRule()); }
	 rulePrimary
{ after(grammarAccess.getPrimaryRule()); } 
	 EOF 
;

// Rule Primary
rulePrimary 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrimaryAccess().getValueAssignment()); }
		(rule__Primary__ValueAssignment)
		{ after(grammarAccess.getPrimaryAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statements__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStatementsAccess().getConditionAssignment_0()); }
		(rule__Statements__ConditionAssignment_0)
		{ after(grammarAccess.getStatementsAccess().getConditionAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getStatementsAccess().getAssertionAssignment_1()); }
		(rule__Statements__AssertionAssignment_1)
		{ after(grammarAccess.getStatementsAccess().getAssertionAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StmtPlusMinus__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StmtPlusMinus__Group__0__Impl
	rule__StmtPlusMinus__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StmtPlusMinus__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtPlusMinusAccess().getLeftAssignment_0()); }
	(rule__StmtPlusMinus__LeftAssignment_0)
	{ after(grammarAccess.getStmtPlusMinusAccess().getLeftAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StmtPlusMinus__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StmtPlusMinus__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StmtPlusMinus__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtPlusMinusAccess().getRightAssignment_1()); }
	(rule__StmtPlusMinus__RightAssignment_1)
	{ after(grammarAccess.getStmtPlusMinusAccess().getRightAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StmtPlus__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StmtPlus__Group__0__Impl
	rule__StmtPlus__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StmtPlus__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtPlusAccess().getPlusAssignment_0()); }
	(rule__StmtPlus__PlusAssignment_0)
	{ after(grammarAccess.getStmtPlusAccess().getPlusAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StmtPlus__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StmtPlus__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StmtPlus__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getStmtPlusAccess().getGroup_1()); }
		(rule__StmtPlus__Group_1__0)
		{ after(grammarAccess.getStmtPlusAccess().getGroup_1()); }
	)
	(
		{ before(grammarAccess.getStmtPlusAccess().getGroup_1()); }
		(rule__StmtPlus__Group_1__0)*
		{ after(grammarAccess.getStmtPlusAccess().getGroup_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StmtPlus__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StmtPlus__Group_1__0__Impl
	rule__StmtPlus__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StmtPlus__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtPlusAccess().getStmtPlusLeftAction_1_0()); }
	()
	{ after(grammarAccess.getStmtPlusAccess().getStmtPlusLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StmtPlus__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StmtPlus__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StmtPlus__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtPlusAccess().getRightPlusAssignment_1_1()); }
	(rule__StmtPlus__RightPlusAssignment_1_1)
	{ after(grammarAccess.getStmtPlusAccess().getRightPlusAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StmtMinus__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StmtMinus__Group__0__Impl
	rule__StmtMinus__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StmtMinus__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtMinusAccess().getMinusAssignment_0()); }
	(rule__StmtMinus__MinusAssignment_0)
	{ after(grammarAccess.getStmtMinusAccess().getMinusAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StmtMinus__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StmtMinus__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StmtMinus__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtMinusAccess().getGroup_1()); }
	(rule__StmtMinus__Group_1__0)*
	{ after(grammarAccess.getStmtMinusAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StmtMinus__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StmtMinus__Group_1__0__Impl
	rule__StmtMinus__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StmtMinus__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtMinusAccess().getStmtMinusLeftAction_1_0()); }
	()
	{ after(grammarAccess.getStmtMinusAccess().getStmtMinusLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StmtMinus__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StmtMinus__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StmtMinus__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStmtMinusAccess().getRightMinusAssignment_1_1()); }
	(rule__StmtMinus__RightMinusAssignment_1_1)
	{ after(grammarAccess.getStmtMinusAccess().getRightMinusAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Conditions__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Conditions__Group__0__Impl
	rule__Conditions__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditions__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionsAccess().getCondAssignment_0()); }
	(rule__Conditions__CondAssignment_0)
	{ after(grammarAccess.getConditionsAccess().getCondAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditions__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Conditions__Group__1__Impl
	rule__Conditions__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditions__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionsAccess().getSignAssignment_1()); }
	(rule__Conditions__SignAssignment_1)
	{ after(grammarAccess.getConditionsAccess().getSignAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditions__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Conditions__Group__2__Impl
	rule__Conditions__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditions__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionsAccess().getRightAssignment_2()); }
	(rule__Conditions__RightAssignment_2)
	{ after(grammarAccess.getConditionsAccess().getRightAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditions__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Conditions__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditions__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionsAccess().getDotAssignment_3()); }
	(rule__Conditions__DotAssignment_3)
	{ after(grammarAccess.getConditionsAccess().getDotAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Assertion__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Assertion__Group__0__Impl
	rule__Assertion__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Assertion__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssertionAccess().getTruthAssignment_0()); }
	(rule__Assertion__TruthAssignment_0)
	{ after(grammarAccess.getAssertionAccess().getTruthAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assertion__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Assertion__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Assertion__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssertionAccess().getDotAssignment_1()); }
	(rule__Assertion__DotAssignment_1)
	{ after(grammarAccess.getAssertionAccess().getDotAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AssertionMinus__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AssertionMinus__Group__0__Impl
	rule__AssertionMinus__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AssertionMinus__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssertionMinusAccess().getCheckAssignment_0()); }
	(rule__AssertionMinus__CheckAssignment_0)
	{ after(grammarAccess.getAssertionMinusAccess().getCheckAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssertionMinus__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AssertionMinus__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AssertionMinus__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssertionMinusAccess().getDotAssignment_1()); }
	(rule__AssertionMinus__DotAssignment_1)
	{ after(grammarAccess.getAssertionMinusAccess().getDotAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FormulaC__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FormulaC__Group__0__Impl
	rule__FormulaC__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FormulaC__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFormulaCAccess().getFirstAssignment_0()); }
	(rule__FormulaC__FirstAssignment_0)
	{ after(grammarAccess.getFormulaCAccess().getFirstAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FormulaC__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FormulaC__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FormulaC__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFormulaCAccess().getGroup_1()); }
	(rule__FormulaC__Group_1__0)*
	{ after(grammarAccess.getFormulaCAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FormulaC__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FormulaC__Group_1__0__Impl
	rule__FormulaC__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FormulaC__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFormulaCAccess().getFormulaLeftAction_1_0()); }
	()
	{ after(grammarAccess.getFormulaCAccess().getFormulaLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FormulaC__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FormulaC__Group_1__1__Impl
	rule__FormulaC__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FormulaC__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFormulaCAccess().getCommaAssignment_1_1()); }
	(rule__FormulaC__CommaAssignment_1_1)
	{ after(grammarAccess.getFormulaCAccess().getCommaAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FormulaC__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FormulaC__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FormulaC__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFormulaCAccess().getRightAssignment_1_2()); }
	(rule__FormulaC__RightAssignment_1_2)
	{ after(grammarAccess.getFormulaCAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Atom__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atom__Group__0__Impl
	rule__Atom__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Atom__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomAccess().getNameAssignment_0()); }
	(rule__Atom__NameAssignment_0)
	{ after(grammarAccess.getAtomAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atom__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atom__Group__1__Impl
	rule__Atom__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Atom__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomAccess().getLpAssignment_1()); }
	(rule__Atom__LpAssignment_1)
	{ after(grammarAccess.getAtomAccess().getLpAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atom__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atom__Group__2__Impl
	rule__Atom__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Atom__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomAccess().getListAssignment_2()); }
	(rule__Atom__ListAssignment_2)
	{ after(grammarAccess.getAtomAccess().getListAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atom__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atom__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Atom__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomAccess().getRpAssignment_3()); }
	(rule__Atom__RpAssignment_3)
	{ after(grammarAccess.getAtomAccess().getRpAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AtomC__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomC__Group__0__Impl
	rule__AtomC__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomC__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomCAccess().getNameAssignment_0()); }
	(rule__AtomC__NameAssignment_0)
	{ after(grammarAccess.getAtomCAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomC__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomC__Group__1__Impl
	rule__AtomC__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomC__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomCAccess().getLpAssignment_1()); }
	(rule__AtomC__LpAssignment_1)
	{ after(grammarAccess.getAtomCAccess().getLpAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomC__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomC__Group__2__Impl
	rule__AtomC__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomC__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomCAccess().getListAssignment_2()); }
	(rule__AtomC__ListAssignment_2)
	{ after(grammarAccess.getAtomCAccess().getListAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomC__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AtomC__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomC__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomCAccess().getRpAssignment_3()); }
	(rule__AtomC__RpAssignment_3)
	{ after(grammarAccess.getAtomCAccess().getRpAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParamList__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParamList__Group__0__Impl
	rule__ParamList__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParamList__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParamListAccess().getLeftAssignment_0()); }
	(rule__ParamList__LeftAssignment_0)
	{ after(grammarAccess.getParamListAccess().getLeftAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParamList__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParamList__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParamList__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParamListAccess().getGroup_1()); }
	(rule__ParamList__Group_1__0)*
	{ after(grammarAccess.getParamListAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParamList__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParamList__Group_1__0__Impl
	rule__ParamList__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParamList__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParamListAccess().getParamListLeftAction_1_0()); }
	()
	{ after(grammarAccess.getParamListAccess().getParamListLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParamList__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParamList__Group_1__1__Impl
	rule__ParamList__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ParamList__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParamListAccess().getCommaAssignment_1_1()); }
	(rule__ParamList__CommaAssignment_1_1)
	{ after(grammarAccess.getParamListAccess().getCommaAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParamList__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParamList__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParamList__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParamListAccess().getRightAssignment_1_2()); }
	(rule__ParamList__RightAssignment_1_2)
	{ after(grammarAccess.getParamListAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__ProgramAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getProgramStmtPlusMinusParserRuleCall_0()); }
		ruleStmtPlusMinus
		{ after(grammarAccess.getModelAccess().getProgramStmtPlusMinusParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StmtPlusMinus__LeftAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtPlusMinusAccess().getLeftStmtPlusParserRuleCall_0_0()); }
		ruleStmtPlus
		{ after(grammarAccess.getStmtPlusMinusAccess().getLeftStmtPlusParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StmtPlusMinus__RightAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtPlusMinusAccess().getRightStmtMinusParserRuleCall_1_0()); }
		ruleStmtMinus
		{ after(grammarAccess.getStmtPlusMinusAccess().getRightStmtMinusParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StmtPlus__PlusAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtPlusAccess().getPlusPlusSignKeyword_0_0()); }
		(
			{ before(grammarAccess.getStmtPlusAccess().getPlusPlusSignKeyword_0_0()); }
			'+'
			{ after(grammarAccess.getStmtPlusAccess().getPlusPlusSignKeyword_0_0()); }
		)
		{ after(grammarAccess.getStmtPlusAccess().getPlusPlusSignKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StmtPlus__RightPlusAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtPlusAccess().getRightPlusStatementsParserRuleCall_1_1_0()); }
		ruleStatements
		{ after(grammarAccess.getStmtPlusAccess().getRightPlusStatementsParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StmtMinus__MinusAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtMinusAccess().getMinusHyphenMinusKeyword_0_0()); }
		(
			{ before(grammarAccess.getStmtMinusAccess().getMinusHyphenMinusKeyword_0_0()); }
			'-'
			{ after(grammarAccess.getStmtMinusAccess().getMinusHyphenMinusKeyword_0_0()); }
		)
		{ after(grammarAccess.getStmtMinusAccess().getMinusHyphenMinusKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StmtMinus__RightMinusAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStmtMinusAccess().getRightMinusAssertionMinusParserRuleCall_1_1_0()); }
		ruleAssertionMinus
		{ after(grammarAccess.getStmtMinusAccess().getRightMinusAssertionMinusParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statements__ConditionAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStatementsAccess().getConditionConditionsParserRuleCall_0_0()); }
		ruleConditions
		{ after(grammarAccess.getStatementsAccess().getConditionConditionsParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statements__AssertionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStatementsAccess().getAssertionAssertionParserRuleCall_1_0()); }
		ruleAssertion
		{ after(grammarAccess.getStatementsAccess().getAssertionAssertionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditions__CondAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionsAccess().getCondAtomParserRuleCall_0_0()); }
		ruleAtom
		{ after(grammarAccess.getConditionsAccess().getCondAtomParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditions__SignAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionsAccess().getSignColonHyphenMinusKeyword_1_0()); }
		(
			{ before(grammarAccess.getConditionsAccess().getSignColonHyphenMinusKeyword_1_0()); }
			':-'
			{ after(grammarAccess.getConditionsAccess().getSignColonHyphenMinusKeyword_1_0()); }
		)
		{ after(grammarAccess.getConditionsAccess().getSignColonHyphenMinusKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditions__RightAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionsAccess().getRightFormulaCParserRuleCall_2_0()); }
		ruleFormulaC
		{ after(grammarAccess.getConditionsAccess().getRightFormulaCParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Conditions__DotAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionsAccess().getDotFullStopKeyword_3_0()); }
		(
			{ before(grammarAccess.getConditionsAccess().getDotFullStopKeyword_3_0()); }
			'.'
			{ after(grammarAccess.getConditionsAccess().getDotFullStopKeyword_3_0()); }
		)
		{ after(grammarAccess.getConditionsAccess().getDotFullStopKeyword_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assertion__TruthAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssertionAccess().getTruthAtomParserRuleCall_0_0()); }
		ruleAtom
		{ after(grammarAccess.getAssertionAccess().getTruthAtomParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assertion__DotAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssertionAccess().getDotFullStopKeyword_1_0()); }
		(
			{ before(grammarAccess.getAssertionAccess().getDotFullStopKeyword_1_0()); }
			'.'
			{ after(grammarAccess.getAssertionAccess().getDotFullStopKeyword_1_0()); }
		)
		{ after(grammarAccess.getAssertionAccess().getDotFullStopKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssertionMinus__CheckAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssertionMinusAccess().getCheckFormulaCParserRuleCall_0_0()); }
		ruleFormulaC
		{ after(grammarAccess.getAssertionMinusAccess().getCheckFormulaCParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssertionMinus__DotAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssertionMinusAccess().getDotFullStopKeyword_1_0()); }
		(
			{ before(grammarAccess.getAssertionMinusAccess().getDotFullStopKeyword_1_0()); }
			'.'
			{ after(grammarAccess.getAssertionMinusAccess().getDotFullStopKeyword_1_0()); }
		)
		{ after(grammarAccess.getAssertionMinusAccess().getDotFullStopKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FormulaC__FirstAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFormulaCAccess().getFirstAtomCParserRuleCall_0_0()); }
		ruleAtomC
		{ after(grammarAccess.getFormulaCAccess().getFirstAtomCParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FormulaC__CommaAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFormulaCAccess().getCommaCommaKeyword_1_1_0()); }
		(
			{ before(grammarAccess.getFormulaCAccess().getCommaCommaKeyword_1_1_0()); }
			','
			{ after(grammarAccess.getFormulaCAccess().getCommaCommaKeyword_1_1_0()); }
		)
		{ after(grammarAccess.getFormulaCAccess().getCommaCommaKeyword_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FormulaC__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFormulaCAccess().getRightAtomCParserRuleCall_1_2_0()); }
		ruleAtomC
		{ after(grammarAccess.getFormulaCAccess().getRightAtomCParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atom__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getAtomAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atom__LpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomAccess().getLpLeftParenthesisKeyword_1_0()); }
		(
			{ before(grammarAccess.getAtomAccess().getLpLeftParenthesisKeyword_1_0()); }
			'('
			{ after(grammarAccess.getAtomAccess().getLpLeftParenthesisKeyword_1_0()); }
		)
		{ after(grammarAccess.getAtomAccess().getLpLeftParenthesisKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atom__ListAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomAccess().getListParamListParserRuleCall_2_0()); }
		ruleParamList
		{ after(grammarAccess.getAtomAccess().getListParamListParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atom__RpAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomAccess().getRpRightParenthesisKeyword_3_0()); }
		(
			{ before(grammarAccess.getAtomAccess().getRpRightParenthesisKeyword_3_0()); }
			')'
			{ after(grammarAccess.getAtomAccess().getRpRightParenthesisKeyword_3_0()); }
		)
		{ after(grammarAccess.getAtomAccess().getRpRightParenthesisKeyword_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomC__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomCAccess().getNameAtomCrossReference_0_0()); }
		(
			{ before(grammarAccess.getAtomCAccess().getNameAtomIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getAtomCAccess().getNameAtomIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getAtomCAccess().getNameAtomCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomC__LpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomCAccess().getLpLeftParenthesisKeyword_1_0()); }
		(
			{ before(grammarAccess.getAtomCAccess().getLpLeftParenthesisKeyword_1_0()); }
			'('
			{ after(grammarAccess.getAtomCAccess().getLpLeftParenthesisKeyword_1_0()); }
		)
		{ after(grammarAccess.getAtomCAccess().getLpLeftParenthesisKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomC__ListAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomCAccess().getListParamListParserRuleCall_2_0()); }
		ruleParamList
		{ after(grammarAccess.getAtomCAccess().getListParamListParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomC__RpAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomCAccess().getRpRightParenthesisKeyword_3_0()); }
		(
			{ before(grammarAccess.getAtomCAccess().getRpRightParenthesisKeyword_3_0()); }
			')'
			{ after(grammarAccess.getAtomCAccess().getRpRightParenthesisKeyword_3_0()); }
		)
		{ after(grammarAccess.getAtomCAccess().getRpRightParenthesisKeyword_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParamList__LeftAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParamListAccess().getLeftPrimaryParserRuleCall_0_0()); }
		rulePrimary
		{ after(grammarAccess.getParamListAccess().getLeftPrimaryParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParamList__CommaAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParamListAccess().getCommaCommaKeyword_1_1_0()); }
		(
			{ before(grammarAccess.getParamListAccess().getCommaCommaKeyword_1_1_0()); }
			','
			{ after(grammarAccess.getParamListAccess().getCommaCommaKeyword_1_1_0()); }
		)
		{ after(grammarAccess.getParamListAccess().getCommaCommaKeyword_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParamList__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParamListAccess().getRightPrimaryParserRuleCall_1_2_0()); }
		rulePrimary
		{ after(grammarAccess.getParamListAccess().getRightPrimaryParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryAccess().getValueIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getPrimaryAccess().getValueIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
