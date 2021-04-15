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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDatalogParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_VARIABLE", "RULE_PREDICATE", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'/*'", "'*/'", "':-'", "'.'", "','", "'('", "')'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_VARIABLE=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=4;
    public static final int RULE_PREDICATE=6;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDatalogParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDatalogParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDatalogParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDatalog.g"; }


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



    // $ANTLR start "entryRuleModel"
    // InternalDatalog.g:54:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDatalog.g:55:1: ( ruleModel EOF )
            // InternalDatalog.g:56:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDatalog.g:63:1: ruleModel : ( ( rule__Model__ProgramAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:67:2: ( ( ( rule__Model__ProgramAssignment )* ) )
            // InternalDatalog.g:68:2: ( ( rule__Model__ProgramAssignment )* )
            {
            // InternalDatalog.g:68:2: ( ( rule__Model__ProgramAssignment )* )
            // InternalDatalog.g:69:3: ( rule__Model__ProgramAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getProgramAssignment()); 
            }
            // InternalDatalog.g:70:3: ( rule__Model__ProgramAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_PREDICATE||(LA1_0>=13 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDatalog.g:70:4: rule__Model__ProgramAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ProgramAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getProgramAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatements"
    // InternalDatalog.g:79:1: entryRuleStatements : ruleStatements EOF ;
    public final void entryRuleStatements() throws RecognitionException {
        try {
            // InternalDatalog.g:80:1: ( ruleStatements EOF )
            // InternalDatalog.g:81:1: ruleStatements EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStatements();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatements"


    // $ANTLR start "ruleStatements"
    // InternalDatalog.g:88:1: ruleStatements : ( ( rule__Statements__Alternatives ) ) ;
    public final void ruleStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:92:2: ( ( ( rule__Statements__Alternatives ) ) )
            // InternalDatalog.g:93:2: ( ( rule__Statements__Alternatives ) )
            {
            // InternalDatalog.g:93:2: ( ( rule__Statements__Alternatives ) )
            // InternalDatalog.g:94:3: ( rule__Statements__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementsAccess().getAlternatives()); 
            }
            // InternalDatalog.g:95:3: ( rule__Statements__Alternatives )
            // InternalDatalog.g:95:4: rule__Statements__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statements__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementsAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatements"


    // $ANTLR start "entryRulePlusSign"
    // InternalDatalog.g:104:1: entryRulePlusSign : rulePlusSign EOF ;
    public final void entryRulePlusSign() throws RecognitionException {
        try {
            // InternalDatalog.g:105:1: ( rulePlusSign EOF )
            // InternalDatalog.g:106:1: rulePlusSign EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusSignRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePlusSign();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusSignRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlusSign"


    // $ANTLR start "rulePlusSign"
    // InternalDatalog.g:113:1: rulePlusSign : ( '+' ) ;
    public final void rulePlusSign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:117:2: ( ( '+' ) )
            // InternalDatalog.g:118:2: ( '+' )
            {
            // InternalDatalog.g:118:2: ( '+' )
            // InternalDatalog.g:119:3: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusSignAccess().getPlusSignKeyword()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusSignAccess().getPlusSignKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlusSign"


    // $ANTLR start "entryRuleMinusSign"
    // InternalDatalog.g:129:1: entryRuleMinusSign : ruleMinusSign EOF ;
    public final void entryRuleMinusSign() throws RecognitionException {
        try {
            // InternalDatalog.g:130:1: ( ruleMinusSign EOF )
            // InternalDatalog.g:131:1: ruleMinusSign EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusSignRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMinusSign();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusSignRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMinusSign"


    // $ANTLR start "ruleMinusSign"
    // InternalDatalog.g:138:1: ruleMinusSign : ( '-' ) ;
    public final void ruleMinusSign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:142:2: ( ( '-' ) )
            // InternalDatalog.g:143:2: ( '-' )
            {
            // InternalDatalog.g:143:2: ( '-' )
            // InternalDatalog.g:144:3: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusSignAccess().getHyphenMinusKeyword()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusSignAccess().getHyphenMinusKeyword()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMinusSign"


    // $ANTLR start "entryRuleCom"
    // InternalDatalog.g:154:1: entryRuleCom : ruleCom EOF ;
    public final void entryRuleCom() throws RecognitionException {
        try {
            // InternalDatalog.g:155:1: ( ruleCom EOF )
            // InternalDatalog.g:156:1: ruleCom EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCom"


    // $ANTLR start "ruleCom"
    // InternalDatalog.g:163:1: ruleCom : ( ( rule__Com__Group__0 ) ) ;
    public final void ruleCom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:167:2: ( ( ( rule__Com__Group__0 ) ) )
            // InternalDatalog.g:168:2: ( ( rule__Com__Group__0 ) )
            {
            // InternalDatalog.g:168:2: ( ( rule__Com__Group__0 ) )
            // InternalDatalog.g:169:3: ( rule__Com__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComAccess().getGroup()); 
            }
            // InternalDatalog.g:170:3: ( rule__Com__Group__0 )
            // InternalDatalog.g:170:4: rule__Com__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Com__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCom"


    // $ANTLR start "entryRuleConditions"
    // InternalDatalog.g:179:1: entryRuleConditions : ruleConditions EOF ;
    public final void entryRuleConditions() throws RecognitionException {
        try {
            // InternalDatalog.g:180:1: ( ruleConditions EOF )
            // InternalDatalog.g:181:1: ruleConditions EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConditions();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditions"


    // $ANTLR start "ruleConditions"
    // InternalDatalog.g:188:1: ruleConditions : ( ( rule__Conditions__Group__0 ) ) ;
    public final void ruleConditions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:192:2: ( ( ( rule__Conditions__Group__0 ) ) )
            // InternalDatalog.g:193:2: ( ( rule__Conditions__Group__0 ) )
            {
            // InternalDatalog.g:193:2: ( ( rule__Conditions__Group__0 ) )
            // InternalDatalog.g:194:3: ( rule__Conditions__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionsAccess().getGroup()); 
            }
            // InternalDatalog.g:195:3: ( rule__Conditions__Group__0 )
            // InternalDatalog.g:195:4: rule__Conditions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conditions__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditions"


    // $ANTLR start "entryRuleAssertion"
    // InternalDatalog.g:204:1: entryRuleAssertion : ruleAssertion EOF ;
    public final void entryRuleAssertion() throws RecognitionException {
        try {
            // InternalDatalog.g:205:1: ( ruleAssertion EOF )
            // InternalDatalog.g:206:1: ruleAssertion EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAssertion();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssertionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssertion"


    // $ANTLR start "ruleAssertion"
    // InternalDatalog.g:213:1: ruleAssertion : ( ( rule__Assertion__Group__0 ) ) ;
    public final void ruleAssertion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:217:2: ( ( ( rule__Assertion__Group__0 ) ) )
            // InternalDatalog.g:218:2: ( ( rule__Assertion__Group__0 ) )
            {
            // InternalDatalog.g:218:2: ( ( rule__Assertion__Group__0 ) )
            // InternalDatalog.g:219:3: ( rule__Assertion__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertionAccess().getGroup()); 
            }
            // InternalDatalog.g:220:3: ( rule__Assertion__Group__0 )
            // InternalDatalog.g:220:4: rule__Assertion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssertionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssertion"


    // $ANTLR start "entryRuleFormula"
    // InternalDatalog.g:229:1: entryRuleFormula : ruleFormula EOF ;
    public final void entryRuleFormula() throws RecognitionException {
        try {
            // InternalDatalog.g:230:1: ( ruleFormula EOF )
            // InternalDatalog.g:231:1: ruleFormula EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulaRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulaRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormula"


    // $ANTLR start "ruleFormula"
    // InternalDatalog.g:238:1: ruleFormula : ( ( rule__Formula__Group__0 ) ) ;
    public final void ruleFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:242:2: ( ( ( rule__Formula__Group__0 ) ) )
            // InternalDatalog.g:243:2: ( ( rule__Formula__Group__0 ) )
            {
            // InternalDatalog.g:243:2: ( ( rule__Formula__Group__0 ) )
            // InternalDatalog.g:244:3: ( rule__Formula__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulaAccess().getGroup()); 
            }
            // InternalDatalog.g:245:3: ( rule__Formula__Group__0 )
            // InternalDatalog.g:245:4: rule__Formula__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Formula__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulaAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormula"


    // $ANTLR start "entryRuleAtom"
    // InternalDatalog.g:254:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // InternalDatalog.g:255:1: ( ruleAtom EOF )
            // InternalDatalog.g:256:1: ruleAtom EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAtom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalDatalog.g:263:1: ruleAtom : ( ( rule__Atom__Group__0 ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:267:2: ( ( ( rule__Atom__Group__0 ) ) )
            // InternalDatalog.g:268:2: ( ( rule__Atom__Group__0 ) )
            {
            // InternalDatalog.g:268:2: ( ( rule__Atom__Group__0 ) )
            // InternalDatalog.g:269:3: ( rule__Atom__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getGroup()); 
            }
            // InternalDatalog.g:270:3: ( rule__Atom__Group__0 )
            // InternalDatalog.g:270:4: rule__Atom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Atom__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleParamList"
    // InternalDatalog.g:279:1: entryRuleParamList : ruleParamList EOF ;
    public final void entryRuleParamList() throws RecognitionException {
        try {
            // InternalDatalog.g:280:1: ( ruleParamList EOF )
            // InternalDatalog.g:281:1: ruleParamList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamListRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParamList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamListRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParamList"


    // $ANTLR start "ruleParamList"
    // InternalDatalog.g:288:1: ruleParamList : ( ( rule__ParamList__Group__0 ) ) ;
    public final void ruleParamList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:292:2: ( ( ( rule__ParamList__Group__0 ) ) )
            // InternalDatalog.g:293:2: ( ( rule__ParamList__Group__0 ) )
            {
            // InternalDatalog.g:293:2: ( ( rule__ParamList__Group__0 ) )
            // InternalDatalog.g:294:3: ( rule__ParamList__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamListAccess().getGroup()); 
            }
            // InternalDatalog.g:295:3: ( rule__ParamList__Group__0 )
            // InternalDatalog.g:295:4: rule__ParamList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParamList__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamListAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParamList"


    // $ANTLR start "entryRulePrimary"
    // InternalDatalog.g:304:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalDatalog.g:305:1: ( rulePrimary EOF )
            // InternalDatalog.g:306:1: rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalDatalog.g:313:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:317:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalDatalog.g:318:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalDatalog.g:318:2: ( ( rule__Primary__Alternatives ) )
            // InternalDatalog.g:319:3: ( rule__Primary__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            }
            // InternalDatalog.g:320:3: ( rule__Primary__Alternatives )
            // InternalDatalog.g:320:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParameterInt"
    // InternalDatalog.g:329:1: entryRuleParameterInt : ruleParameterInt EOF ;
    public final void entryRuleParameterInt() throws RecognitionException {
        try {
            // InternalDatalog.g:330:1: ( ruleParameterInt EOF )
            // InternalDatalog.g:331:1: ruleParameterInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterIntRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameterInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterIntRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterInt"


    // $ANTLR start "ruleParameterInt"
    // InternalDatalog.g:338:1: ruleParameterInt : ( ( rule__ParameterInt__IntAssignment ) ) ;
    public final void ruleParameterInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:342:2: ( ( ( rule__ParameterInt__IntAssignment ) ) )
            // InternalDatalog.g:343:2: ( ( rule__ParameterInt__IntAssignment ) )
            {
            // InternalDatalog.g:343:2: ( ( rule__ParameterInt__IntAssignment ) )
            // InternalDatalog.g:344:3: ( rule__ParameterInt__IntAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterIntAccess().getIntAssignment()); 
            }
            // InternalDatalog.g:345:3: ( rule__ParameterInt__IntAssignment )
            // InternalDatalog.g:345:4: rule__ParameterInt__IntAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterInt__IntAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterIntAccess().getIntAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterInt"


    // $ANTLR start "entryRuleParameterVar"
    // InternalDatalog.g:354:1: entryRuleParameterVar : ruleParameterVar EOF ;
    public final void entryRuleParameterVar() throws RecognitionException {
        try {
            // InternalDatalog.g:355:1: ( ruleParameterVar EOF )
            // InternalDatalog.g:356:1: ruleParameterVar EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterVarRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameterVar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterVarRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterVar"


    // $ANTLR start "ruleParameterVar"
    // InternalDatalog.g:363:1: ruleParameterVar : ( ( rule__ParameterVar__UpAssignment ) ) ;
    public final void ruleParameterVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:367:2: ( ( ( rule__ParameterVar__UpAssignment ) ) )
            // InternalDatalog.g:368:2: ( ( rule__ParameterVar__UpAssignment ) )
            {
            // InternalDatalog.g:368:2: ( ( rule__ParameterVar__UpAssignment ) )
            // InternalDatalog.g:369:3: ( rule__ParameterVar__UpAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterVarAccess().getUpAssignment()); 
            }
            // InternalDatalog.g:370:3: ( rule__ParameterVar__UpAssignment )
            // InternalDatalog.g:370:4: rule__ParameterVar__UpAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterVar__UpAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterVarAccess().getUpAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterVar"


    // $ANTLR start "entryRuleParameterPred"
    // InternalDatalog.g:379:1: entryRuleParameterPred : ruleParameterPred EOF ;
    public final void entryRuleParameterPred() throws RecognitionException {
        try {
            // InternalDatalog.g:380:1: ( ruleParameterPred EOF )
            // InternalDatalog.g:381:1: ruleParameterPred EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPredRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameterPred();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterPredRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterPred"


    // $ANTLR start "ruleParameterPred"
    // InternalDatalog.g:388:1: ruleParameterPred : ( ( rule__ParameterPred__LowAssignment ) ) ;
    public final void ruleParameterPred() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:392:2: ( ( ( rule__ParameterPred__LowAssignment ) ) )
            // InternalDatalog.g:393:2: ( ( rule__ParameterPred__LowAssignment ) )
            {
            // InternalDatalog.g:393:2: ( ( rule__ParameterPred__LowAssignment ) )
            // InternalDatalog.g:394:3: ( rule__ParameterPred__LowAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPredAccess().getLowAssignment()); 
            }
            // InternalDatalog.g:395:3: ( rule__ParameterPred__LowAssignment )
            // InternalDatalog.g:395:4: rule__ParameterPred__LowAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterPred__LowAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterPredAccess().getLowAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterPred"


    // $ANTLR start "rule__Statements__Alternatives"
    // InternalDatalog.g:403:1: rule__Statements__Alternatives : ( ( ( rule__Statements__Group_0__0 ) ) | ( ( rule__Statements__Group_1__0 ) ) | ( ruleConditions ) | ( ruleAssertion ) | ( ( rule__Statements__Group_4__0 ) ) );
    public final void rule__Statements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:407:1: ( ( ( rule__Statements__Group_0__0 ) ) | ( ( rule__Statements__Group_1__0 ) ) | ( ruleConditions ) | ( ruleAssertion ) | ( ( rule__Statements__Group_4__0 ) ) )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalDatalog.g:408:2: ( ( rule__Statements__Group_0__0 ) )
                    {
                    // InternalDatalog.g:408:2: ( ( rule__Statements__Group_0__0 ) )
                    // InternalDatalog.g:409:3: ( rule__Statements__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementsAccess().getGroup_0()); 
                    }
                    // InternalDatalog.g:410:3: ( rule__Statements__Group_0__0 )
                    // InternalDatalog.g:410:4: rule__Statements__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statements__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementsAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDatalog.g:414:2: ( ( rule__Statements__Group_1__0 ) )
                    {
                    // InternalDatalog.g:414:2: ( ( rule__Statements__Group_1__0 ) )
                    // InternalDatalog.g:415:3: ( rule__Statements__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementsAccess().getGroup_1()); 
                    }
                    // InternalDatalog.g:416:3: ( rule__Statements__Group_1__0 )
                    // InternalDatalog.g:416:4: rule__Statements__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statements__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementsAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDatalog.g:420:2: ( ruleConditions )
                    {
                    // InternalDatalog.g:420:2: ( ruleConditions )
                    // InternalDatalog.g:421:3: ruleConditions
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementsAccess().getConditionsParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleConditions();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementsAccess().getConditionsParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDatalog.g:426:2: ( ruleAssertion )
                    {
                    // InternalDatalog.g:426:2: ( ruleAssertion )
                    // InternalDatalog.g:427:3: ruleAssertion
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementsAccess().getAssertionParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAssertion();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementsAccess().getAssertionParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDatalog.g:432:2: ( ( rule__Statements__Group_4__0 ) )
                    {
                    // InternalDatalog.g:432:2: ( ( rule__Statements__Group_4__0 ) )
                    // InternalDatalog.g:433:3: ( rule__Statements__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStatementsAccess().getGroup_4()); 
                    }
                    // InternalDatalog.g:434:3: ( rule__Statements__Group_4__0 )
                    // InternalDatalog.g:434:4: rule__Statements__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statements__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStatementsAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Alternatives"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalDatalog.g:442:1: rule__Primary__Alternatives : ( ( ruleParameterPred ) | ( ruleParameterVar ) | ( ruleParameterInt ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:446:1: ( ( ruleParameterPred ) | ( ruleParameterVar ) | ( ruleParameterInt ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_PREDICATE:
                {
                alt3=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt3=2;
                }
                break;
            case RULE_INT:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDatalog.g:447:2: ( ruleParameterPred )
                    {
                    // InternalDatalog.g:447:2: ( ruleParameterPred )
                    // InternalDatalog.g:448:3: ruleParameterPred
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getParameterPredParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleParameterPred();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getParameterPredParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDatalog.g:453:2: ( ruleParameterVar )
                    {
                    // InternalDatalog.g:453:2: ( ruleParameterVar )
                    // InternalDatalog.g:454:3: ruleParameterVar
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getParameterVarParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleParameterVar();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getParameterVarParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDatalog.g:459:2: ( ruleParameterInt )
                    {
                    // InternalDatalog.g:459:2: ( ruleParameterInt )
                    // InternalDatalog.g:460:3: ruleParameterInt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryAccess().getParameterIntParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleParameterInt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryAccess().getParameterIntParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Statements__Group_0__0"
    // InternalDatalog.g:469:1: rule__Statements__Group_0__0 : rule__Statements__Group_0__0__Impl rule__Statements__Group_0__1 ;
    public final void rule__Statements__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:473:1: ( rule__Statements__Group_0__0__Impl rule__Statements__Group_0__1 )
            // InternalDatalog.g:474:2: rule__Statements__Group_0__0__Impl rule__Statements__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Statements__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statements__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Group_0__0"


    // $ANTLR start "rule__Statements__Group_0__0__Impl"
    // InternalDatalog.g:481:1: rule__Statements__Group_0__0__Impl : ( () ) ;
    public final void rule__Statements__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:485:1: ( ( () ) )
            // InternalDatalog.g:486:1: ( () )
            {
            // InternalDatalog.g:486:1: ( () )
            // InternalDatalog.g:487:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementsAccess().getStatementsAction_0_0()); 
            }
            // InternalDatalog.g:488:2: ()
            // InternalDatalog.g:488:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementsAccess().getStatementsAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Group_0__0__Impl"


    // $ANTLR start "rule__Statements__Group_0__1"
    // InternalDatalog.g:496:1: rule__Statements__Group_0__1 : rule__Statements__Group_0__1__Impl ;
    public final void rule__Statements__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:500:1: ( rule__Statements__Group_0__1__Impl )
            // InternalDatalog.g:501:2: rule__Statements__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statements__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Group_0__1"


    // $ANTLR start "rule__Statements__Group_0__1__Impl"
    // InternalDatalog.g:507:1: rule__Statements__Group_0__1__Impl : ( rulePlusSign ) ;
    public final void rule__Statements__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:511:1: ( ( rulePlusSign ) )
            // InternalDatalog.g:512:1: ( rulePlusSign )
            {
            // InternalDatalog.g:512:1: ( rulePlusSign )
            // InternalDatalog.g:513:2: rulePlusSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementsAccess().getPlusSignParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            rulePlusSign();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementsAccess().getPlusSignParserRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Group_0__1__Impl"


    // $ANTLR start "rule__Statements__Group_1__0"
    // InternalDatalog.g:523:1: rule__Statements__Group_1__0 : rule__Statements__Group_1__0__Impl rule__Statements__Group_1__1 ;
    public final void rule__Statements__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:527:1: ( rule__Statements__Group_1__0__Impl rule__Statements__Group_1__1 )
            // InternalDatalog.g:528:2: rule__Statements__Group_1__0__Impl rule__Statements__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Statements__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statements__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Group_1__0"


    // $ANTLR start "rule__Statements__Group_1__0__Impl"
    // InternalDatalog.g:535:1: rule__Statements__Group_1__0__Impl : ( () ) ;
    public final void rule__Statements__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:539:1: ( ( () ) )
            // InternalDatalog.g:540:1: ( () )
            {
            // InternalDatalog.g:540:1: ( () )
            // InternalDatalog.g:541:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementsAccess().getStatementsAction_1_0()); 
            }
            // InternalDatalog.g:542:2: ()
            // InternalDatalog.g:542:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementsAccess().getStatementsAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Group_1__0__Impl"


    // $ANTLR start "rule__Statements__Group_1__1"
    // InternalDatalog.g:550:1: rule__Statements__Group_1__1 : rule__Statements__Group_1__1__Impl ;
    public final void rule__Statements__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:554:1: ( rule__Statements__Group_1__1__Impl )
            // InternalDatalog.g:555:2: rule__Statements__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statements__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Group_1__1"


    // $ANTLR start "rule__Statements__Group_1__1__Impl"
    // InternalDatalog.g:561:1: rule__Statements__Group_1__1__Impl : ( ruleMinusSign ) ;
    public final void rule__Statements__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:565:1: ( ( ruleMinusSign ) )
            // InternalDatalog.g:566:1: ( ruleMinusSign )
            {
            // InternalDatalog.g:566:1: ( ruleMinusSign )
            // InternalDatalog.g:567:2: ruleMinusSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementsAccess().getMinusSignParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleMinusSign();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementsAccess().getMinusSignParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Group_1__1__Impl"


    // $ANTLR start "rule__Statements__Group_4__0"
    // InternalDatalog.g:577:1: rule__Statements__Group_4__0 : rule__Statements__Group_4__0__Impl rule__Statements__Group_4__1 ;
    public final void rule__Statements__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:581:1: ( rule__Statements__Group_4__0__Impl rule__Statements__Group_4__1 )
            // InternalDatalog.g:582:2: rule__Statements__Group_4__0__Impl rule__Statements__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Statements__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Statements__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Group_4__0"


    // $ANTLR start "rule__Statements__Group_4__0__Impl"
    // InternalDatalog.g:589:1: rule__Statements__Group_4__0__Impl : ( () ) ;
    public final void rule__Statements__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:593:1: ( ( () ) )
            // InternalDatalog.g:594:1: ( () )
            {
            // InternalDatalog.g:594:1: ( () )
            // InternalDatalog.g:595:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementsAccess().getStatementsAction_4_0()); 
            }
            // InternalDatalog.g:596:2: ()
            // InternalDatalog.g:596:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementsAccess().getStatementsAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Group_4__0__Impl"


    // $ANTLR start "rule__Statements__Group_4__1"
    // InternalDatalog.g:604:1: rule__Statements__Group_4__1 : rule__Statements__Group_4__1__Impl ;
    public final void rule__Statements__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:608:1: ( rule__Statements__Group_4__1__Impl )
            // InternalDatalog.g:609:2: rule__Statements__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statements__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Group_4__1"


    // $ANTLR start "rule__Statements__Group_4__1__Impl"
    // InternalDatalog.g:615:1: rule__Statements__Group_4__1__Impl : ( ruleCom ) ;
    public final void rule__Statements__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:619:1: ( ( ruleCom ) )
            // InternalDatalog.g:620:1: ( ruleCom )
            {
            // InternalDatalog.g:620:1: ( ruleCom )
            // InternalDatalog.g:621:2: ruleCom
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatementsAccess().getComParserRuleCall_4_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleCom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatementsAccess().getComParserRuleCall_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statements__Group_4__1__Impl"


    // $ANTLR start "rule__Com__Group__0"
    // InternalDatalog.g:631:1: rule__Com__Group__0 : rule__Com__Group__0__Impl rule__Com__Group__1 ;
    public final void rule__Com__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:635:1: ( rule__Com__Group__0__Impl rule__Com__Group__1 )
            // InternalDatalog.g:636:2: rule__Com__Group__0__Impl rule__Com__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Com__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Com__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Com__Group__0"


    // $ANTLR start "rule__Com__Group__0__Impl"
    // InternalDatalog.g:643:1: rule__Com__Group__0__Impl : ( '/*' ) ;
    public final void rule__Com__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:647:1: ( ( '/*' ) )
            // InternalDatalog.g:648:1: ( '/*' )
            {
            // InternalDatalog.g:648:1: ( '/*' )
            // InternalDatalog.g:649:2: '/*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComAccess().getSolidusAsteriskKeyword_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComAccess().getSolidusAsteriskKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Com__Group__0__Impl"


    // $ANTLR start "rule__Com__Group__1"
    // InternalDatalog.g:658:1: rule__Com__Group__1 : rule__Com__Group__1__Impl ;
    public final void rule__Com__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:662:1: ( rule__Com__Group__1__Impl )
            // InternalDatalog.g:663:2: rule__Com__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Com__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Com__Group__1"


    // $ANTLR start "rule__Com__Group__1__Impl"
    // InternalDatalog.g:669:1: rule__Com__Group__1__Impl : ( ( '*/' ) ) ;
    public final void rule__Com__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:673:1: ( ( ( '*/' ) ) )
            // InternalDatalog.g:674:1: ( ( '*/' ) )
            {
            // InternalDatalog.g:674:1: ( ( '*/' ) )
            // InternalDatalog.g:675:2: ( '*/' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComAccess().getAsteriskSolidusKeyword_1()); 
            }
            // InternalDatalog.g:676:2: ( '*/' )
            // InternalDatalog.g:676:3: '*/'
            {
            match(input,16,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComAccess().getAsteriskSolidusKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Com__Group__1__Impl"


    // $ANTLR start "rule__Conditions__Group__0"
    // InternalDatalog.g:685:1: rule__Conditions__Group__0 : rule__Conditions__Group__0__Impl rule__Conditions__Group__1 ;
    public final void rule__Conditions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:689:1: ( rule__Conditions__Group__0__Impl rule__Conditions__Group__1 )
            // InternalDatalog.g:690:2: rule__Conditions__Group__0__Impl rule__Conditions__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Conditions__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conditions__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditions__Group__0"


    // $ANTLR start "rule__Conditions__Group__0__Impl"
    // InternalDatalog.g:697:1: rule__Conditions__Group__0__Impl : ( ( rule__Conditions__CondAssignment_0 ) ) ;
    public final void rule__Conditions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:701:1: ( ( ( rule__Conditions__CondAssignment_0 ) ) )
            // InternalDatalog.g:702:1: ( ( rule__Conditions__CondAssignment_0 ) )
            {
            // InternalDatalog.g:702:1: ( ( rule__Conditions__CondAssignment_0 ) )
            // InternalDatalog.g:703:2: ( rule__Conditions__CondAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionsAccess().getCondAssignment_0()); 
            }
            // InternalDatalog.g:704:2: ( rule__Conditions__CondAssignment_0 )
            // InternalDatalog.g:704:3: rule__Conditions__CondAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Conditions__CondAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionsAccess().getCondAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditions__Group__0__Impl"


    // $ANTLR start "rule__Conditions__Group__1"
    // InternalDatalog.g:712:1: rule__Conditions__Group__1 : rule__Conditions__Group__1__Impl rule__Conditions__Group__2 ;
    public final void rule__Conditions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:716:1: ( rule__Conditions__Group__1__Impl rule__Conditions__Group__2 )
            // InternalDatalog.g:717:2: rule__Conditions__Group__1__Impl rule__Conditions__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Conditions__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conditions__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditions__Group__1"


    // $ANTLR start "rule__Conditions__Group__1__Impl"
    // InternalDatalog.g:724:1: rule__Conditions__Group__1__Impl : ( ':-' ) ;
    public final void rule__Conditions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:728:1: ( ( ':-' ) )
            // InternalDatalog.g:729:1: ( ':-' )
            {
            // InternalDatalog.g:729:1: ( ':-' )
            // InternalDatalog.g:730:2: ':-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionsAccess().getColonHyphenMinusKeyword_1()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionsAccess().getColonHyphenMinusKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditions__Group__1__Impl"


    // $ANTLR start "rule__Conditions__Group__2"
    // InternalDatalog.g:739:1: rule__Conditions__Group__2 : rule__Conditions__Group__2__Impl rule__Conditions__Group__3 ;
    public final void rule__Conditions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:743:1: ( rule__Conditions__Group__2__Impl rule__Conditions__Group__3 )
            // InternalDatalog.g:744:2: rule__Conditions__Group__2__Impl rule__Conditions__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Conditions__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conditions__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditions__Group__2"


    // $ANTLR start "rule__Conditions__Group__2__Impl"
    // InternalDatalog.g:751:1: rule__Conditions__Group__2__Impl : ( ( rule__Conditions__RightAssignment_2 ) ) ;
    public final void rule__Conditions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:755:1: ( ( ( rule__Conditions__RightAssignment_2 ) ) )
            // InternalDatalog.g:756:1: ( ( rule__Conditions__RightAssignment_2 ) )
            {
            // InternalDatalog.g:756:1: ( ( rule__Conditions__RightAssignment_2 ) )
            // InternalDatalog.g:757:2: ( rule__Conditions__RightAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionsAccess().getRightAssignment_2()); 
            }
            // InternalDatalog.g:758:2: ( rule__Conditions__RightAssignment_2 )
            // InternalDatalog.g:758:3: rule__Conditions__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Conditions__RightAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionsAccess().getRightAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditions__Group__2__Impl"


    // $ANTLR start "rule__Conditions__Group__3"
    // InternalDatalog.g:766:1: rule__Conditions__Group__3 : rule__Conditions__Group__3__Impl ;
    public final void rule__Conditions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:770:1: ( rule__Conditions__Group__3__Impl )
            // InternalDatalog.g:771:2: rule__Conditions__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conditions__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditions__Group__3"


    // $ANTLR start "rule__Conditions__Group__3__Impl"
    // InternalDatalog.g:777:1: rule__Conditions__Group__3__Impl : ( '.' ) ;
    public final void rule__Conditions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:781:1: ( ( '.' ) )
            // InternalDatalog.g:782:1: ( '.' )
            {
            // InternalDatalog.g:782:1: ( '.' )
            // InternalDatalog.g:783:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionsAccess().getFullStopKeyword_3()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionsAccess().getFullStopKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditions__Group__3__Impl"


    // $ANTLR start "rule__Assertion__Group__0"
    // InternalDatalog.g:793:1: rule__Assertion__Group__0 : rule__Assertion__Group__0__Impl rule__Assertion__Group__1 ;
    public final void rule__Assertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:797:1: ( rule__Assertion__Group__0__Impl rule__Assertion__Group__1 )
            // InternalDatalog.g:798:2: rule__Assertion__Group__0__Impl rule__Assertion__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Assertion__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Assertion__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__0"


    // $ANTLR start "rule__Assertion__Group__0__Impl"
    // InternalDatalog.g:805:1: rule__Assertion__Group__0__Impl : ( ( rule__Assertion__TruthAssignment_0 ) ) ;
    public final void rule__Assertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:809:1: ( ( ( rule__Assertion__TruthAssignment_0 ) ) )
            // InternalDatalog.g:810:1: ( ( rule__Assertion__TruthAssignment_0 ) )
            {
            // InternalDatalog.g:810:1: ( ( rule__Assertion__TruthAssignment_0 ) )
            // InternalDatalog.g:811:2: ( rule__Assertion__TruthAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertionAccess().getTruthAssignment_0()); 
            }
            // InternalDatalog.g:812:2: ( rule__Assertion__TruthAssignment_0 )
            // InternalDatalog.g:812:3: rule__Assertion__TruthAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__TruthAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssertionAccess().getTruthAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__0__Impl"


    // $ANTLR start "rule__Assertion__Group__1"
    // InternalDatalog.g:820:1: rule__Assertion__Group__1 : rule__Assertion__Group__1__Impl ;
    public final void rule__Assertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:824:1: ( rule__Assertion__Group__1__Impl )
            // InternalDatalog.g:825:2: rule__Assertion__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__1"


    // $ANTLR start "rule__Assertion__Group__1__Impl"
    // InternalDatalog.g:831:1: rule__Assertion__Group__1__Impl : ( '.' ) ;
    public final void rule__Assertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:835:1: ( ( '.' ) )
            // InternalDatalog.g:836:1: ( '.' )
            {
            // InternalDatalog.g:836:1: ( '.' )
            // InternalDatalog.g:837:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertionAccess().getFullStopKeyword_1()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssertionAccess().getFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__1__Impl"


    // $ANTLR start "rule__Formula__Group__0"
    // InternalDatalog.g:847:1: rule__Formula__Group__0 : rule__Formula__Group__0__Impl rule__Formula__Group__1 ;
    public final void rule__Formula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:851:1: ( rule__Formula__Group__0__Impl rule__Formula__Group__1 )
            // InternalDatalog.g:852:2: rule__Formula__Group__0__Impl rule__Formula__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Formula__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Formula__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__0"


    // $ANTLR start "rule__Formula__Group__0__Impl"
    // InternalDatalog.g:859:1: rule__Formula__Group__0__Impl : ( ruleAtom ) ;
    public final void rule__Formula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:863:1: ( ( ruleAtom ) )
            // InternalDatalog.g:864:1: ( ruleAtom )
            {
            // InternalDatalog.g:864:1: ( ruleAtom )
            // InternalDatalog.g:865:2: ruleAtom
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulaAccess().getAtomParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulaAccess().getAtomParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__0__Impl"


    // $ANTLR start "rule__Formula__Group__1"
    // InternalDatalog.g:874:1: rule__Formula__Group__1 : rule__Formula__Group__1__Impl ;
    public final void rule__Formula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:878:1: ( rule__Formula__Group__1__Impl )
            // InternalDatalog.g:879:2: rule__Formula__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formula__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__1"


    // $ANTLR start "rule__Formula__Group__1__Impl"
    // InternalDatalog.g:885:1: rule__Formula__Group__1__Impl : ( ( rule__Formula__Group_1__0 )* ) ;
    public final void rule__Formula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:889:1: ( ( ( rule__Formula__Group_1__0 )* ) )
            // InternalDatalog.g:890:1: ( ( rule__Formula__Group_1__0 )* )
            {
            // InternalDatalog.g:890:1: ( ( rule__Formula__Group_1__0 )* )
            // InternalDatalog.g:891:2: ( rule__Formula__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulaAccess().getGroup_1()); 
            }
            // InternalDatalog.g:892:2: ( rule__Formula__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDatalog.g:892:3: rule__Formula__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Formula__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulaAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group__1__Impl"


    // $ANTLR start "rule__Formula__Group_1__0"
    // InternalDatalog.g:901:1: rule__Formula__Group_1__0 : rule__Formula__Group_1__0__Impl rule__Formula__Group_1__1 ;
    public final void rule__Formula__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:905:1: ( rule__Formula__Group_1__0__Impl rule__Formula__Group_1__1 )
            // InternalDatalog.g:906:2: rule__Formula__Group_1__0__Impl rule__Formula__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Formula__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Formula__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_1__0"


    // $ANTLR start "rule__Formula__Group_1__0__Impl"
    // InternalDatalog.g:913:1: rule__Formula__Group_1__0__Impl : ( () ) ;
    public final void rule__Formula__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:917:1: ( ( () ) )
            // InternalDatalog.g:918:1: ( () )
            {
            // InternalDatalog.g:918:1: ( () )
            // InternalDatalog.g:919:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulaAccess().getFormulaLeftAction_1_0()); 
            }
            // InternalDatalog.g:920:2: ()
            // InternalDatalog.g:920:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulaAccess().getFormulaLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_1__0__Impl"


    // $ANTLR start "rule__Formula__Group_1__1"
    // InternalDatalog.g:928:1: rule__Formula__Group_1__1 : rule__Formula__Group_1__1__Impl rule__Formula__Group_1__2 ;
    public final void rule__Formula__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:932:1: ( rule__Formula__Group_1__1__Impl rule__Formula__Group_1__2 )
            // InternalDatalog.g:933:2: rule__Formula__Group_1__1__Impl rule__Formula__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Formula__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Formula__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_1__1"


    // $ANTLR start "rule__Formula__Group_1__1__Impl"
    // InternalDatalog.g:940:1: rule__Formula__Group_1__1__Impl : ( ',' ) ;
    public final void rule__Formula__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:944:1: ( ( ',' ) )
            // InternalDatalog.g:945:1: ( ',' )
            {
            // InternalDatalog.g:945:1: ( ',' )
            // InternalDatalog.g:946:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulaAccess().getCommaKeyword_1_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulaAccess().getCommaKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_1__1__Impl"


    // $ANTLR start "rule__Formula__Group_1__2"
    // InternalDatalog.g:955:1: rule__Formula__Group_1__2 : rule__Formula__Group_1__2__Impl ;
    public final void rule__Formula__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:959:1: ( rule__Formula__Group_1__2__Impl )
            // InternalDatalog.g:960:2: rule__Formula__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formula__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_1__2"


    // $ANTLR start "rule__Formula__Group_1__2__Impl"
    // InternalDatalog.g:966:1: rule__Formula__Group_1__2__Impl : ( ( rule__Formula__RightAssignment_1_2 ) ) ;
    public final void rule__Formula__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:970:1: ( ( ( rule__Formula__RightAssignment_1_2 ) ) )
            // InternalDatalog.g:971:1: ( ( rule__Formula__RightAssignment_1_2 ) )
            {
            // InternalDatalog.g:971:1: ( ( rule__Formula__RightAssignment_1_2 ) )
            // InternalDatalog.g:972:2: ( rule__Formula__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulaAccess().getRightAssignment_1_2()); 
            }
            // InternalDatalog.g:973:2: ( rule__Formula__RightAssignment_1_2 )
            // InternalDatalog.g:973:3: rule__Formula__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Formula__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulaAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__Group_1__2__Impl"


    // $ANTLR start "rule__Atom__Group__0"
    // InternalDatalog.g:982:1: rule__Atom__Group__0 : rule__Atom__Group__0__Impl rule__Atom__Group__1 ;
    public final void rule__Atom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:986:1: ( rule__Atom__Group__0__Impl rule__Atom__Group__1 )
            // InternalDatalog.g:987:2: rule__Atom__Group__0__Impl rule__Atom__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Atom__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atom__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group__0"


    // $ANTLR start "rule__Atom__Group__0__Impl"
    // InternalDatalog.g:994:1: rule__Atom__Group__0__Impl : ( ( rule__Atom__NameAssignment_0 ) ) ;
    public final void rule__Atom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:998:1: ( ( ( rule__Atom__NameAssignment_0 ) ) )
            // InternalDatalog.g:999:1: ( ( rule__Atom__NameAssignment_0 ) )
            {
            // InternalDatalog.g:999:1: ( ( rule__Atom__NameAssignment_0 ) )
            // InternalDatalog.g:1000:2: ( rule__Atom__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getNameAssignment_0()); 
            }
            // InternalDatalog.g:1001:2: ( rule__Atom__NameAssignment_0 )
            // InternalDatalog.g:1001:3: rule__Atom__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Atom__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group__0__Impl"


    // $ANTLR start "rule__Atom__Group__1"
    // InternalDatalog.g:1009:1: rule__Atom__Group__1 : rule__Atom__Group__1__Impl rule__Atom__Group__2 ;
    public final void rule__Atom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1013:1: ( rule__Atom__Group__1__Impl rule__Atom__Group__2 )
            // InternalDatalog.g:1014:2: rule__Atom__Group__1__Impl rule__Atom__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Atom__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atom__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group__1"


    // $ANTLR start "rule__Atom__Group__1__Impl"
    // InternalDatalog.g:1021:1: rule__Atom__Group__1__Impl : ( '(' ) ;
    public final void rule__Atom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1025:1: ( ( '(' ) )
            // InternalDatalog.g:1026:1: ( '(' )
            {
            // InternalDatalog.g:1026:1: ( '(' )
            // InternalDatalog.g:1027:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group__1__Impl"


    // $ANTLR start "rule__Atom__Group__2"
    // InternalDatalog.g:1036:1: rule__Atom__Group__2 : rule__Atom__Group__2__Impl rule__Atom__Group__3 ;
    public final void rule__Atom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1040:1: ( rule__Atom__Group__2__Impl rule__Atom__Group__3 )
            // InternalDatalog.g:1041:2: rule__Atom__Group__2__Impl rule__Atom__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Atom__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Atom__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group__2"


    // $ANTLR start "rule__Atom__Group__2__Impl"
    // InternalDatalog.g:1048:1: rule__Atom__Group__2__Impl : ( ( rule__Atom__ListAssignment_2 ) ) ;
    public final void rule__Atom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1052:1: ( ( ( rule__Atom__ListAssignment_2 ) ) )
            // InternalDatalog.g:1053:1: ( ( rule__Atom__ListAssignment_2 ) )
            {
            // InternalDatalog.g:1053:1: ( ( rule__Atom__ListAssignment_2 ) )
            // InternalDatalog.g:1054:2: ( rule__Atom__ListAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getListAssignment_2()); 
            }
            // InternalDatalog.g:1055:2: ( rule__Atom__ListAssignment_2 )
            // InternalDatalog.g:1055:3: rule__Atom__ListAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Atom__ListAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getListAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group__2__Impl"


    // $ANTLR start "rule__Atom__Group__3"
    // InternalDatalog.g:1063:1: rule__Atom__Group__3 : rule__Atom__Group__3__Impl ;
    public final void rule__Atom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1067:1: ( rule__Atom__Group__3__Impl )
            // InternalDatalog.g:1068:2: rule__Atom__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atom__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group__3"


    // $ANTLR start "rule__Atom__Group__3__Impl"
    // InternalDatalog.g:1074:1: rule__Atom__Group__3__Impl : ( ')' ) ;
    public final void rule__Atom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1078:1: ( ( ')' ) )
            // InternalDatalog.g:1079:1: ( ')' )
            {
            // InternalDatalog.g:1079:1: ( ')' )
            // InternalDatalog.g:1080:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group__3__Impl"


    // $ANTLR start "rule__ParamList__Group__0"
    // InternalDatalog.g:1090:1: rule__ParamList__Group__0 : rule__ParamList__Group__0__Impl rule__ParamList__Group__1 ;
    public final void rule__ParamList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1094:1: ( rule__ParamList__Group__0__Impl rule__ParamList__Group__1 )
            // InternalDatalog.g:1095:2: rule__ParamList__Group__0__Impl rule__ParamList__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ParamList__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParamList__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamList__Group__0"


    // $ANTLR start "rule__ParamList__Group__0__Impl"
    // InternalDatalog.g:1102:1: rule__ParamList__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__ParamList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1106:1: ( ( rulePrimary ) )
            // InternalDatalog.g:1107:1: ( rulePrimary )
            {
            // InternalDatalog.g:1107:1: ( rulePrimary )
            // InternalDatalog.g:1108:2: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamListAccess().getPrimaryParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamListAccess().getPrimaryParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamList__Group__0__Impl"


    // $ANTLR start "rule__ParamList__Group__1"
    // InternalDatalog.g:1117:1: rule__ParamList__Group__1 : rule__ParamList__Group__1__Impl ;
    public final void rule__ParamList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1121:1: ( rule__ParamList__Group__1__Impl )
            // InternalDatalog.g:1122:2: rule__ParamList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParamList__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamList__Group__1"


    // $ANTLR start "rule__ParamList__Group__1__Impl"
    // InternalDatalog.g:1128:1: rule__ParamList__Group__1__Impl : ( ( rule__ParamList__Group_1__0 )* ) ;
    public final void rule__ParamList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1132:1: ( ( ( rule__ParamList__Group_1__0 )* ) )
            // InternalDatalog.g:1133:1: ( ( rule__ParamList__Group_1__0 )* )
            {
            // InternalDatalog.g:1133:1: ( ( rule__ParamList__Group_1__0 )* )
            // InternalDatalog.g:1134:2: ( rule__ParamList__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamListAccess().getGroup_1()); 
            }
            // InternalDatalog.g:1135:2: ( rule__ParamList__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDatalog.g:1135:3: rule__ParamList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ParamList__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamListAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamList__Group__1__Impl"


    // $ANTLR start "rule__ParamList__Group_1__0"
    // InternalDatalog.g:1144:1: rule__ParamList__Group_1__0 : rule__ParamList__Group_1__0__Impl rule__ParamList__Group_1__1 ;
    public final void rule__ParamList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1148:1: ( rule__ParamList__Group_1__0__Impl rule__ParamList__Group_1__1 )
            // InternalDatalog.g:1149:2: rule__ParamList__Group_1__0__Impl rule__ParamList__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__ParamList__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParamList__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamList__Group_1__0"


    // $ANTLR start "rule__ParamList__Group_1__0__Impl"
    // InternalDatalog.g:1156:1: rule__ParamList__Group_1__0__Impl : ( () ) ;
    public final void rule__ParamList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1160:1: ( ( () ) )
            // InternalDatalog.g:1161:1: ( () )
            {
            // InternalDatalog.g:1161:1: ( () )
            // InternalDatalog.g:1162:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamListAccess().getParamListLeftAction_1_0()); 
            }
            // InternalDatalog.g:1163:2: ()
            // InternalDatalog.g:1163:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamListAccess().getParamListLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamList__Group_1__0__Impl"


    // $ANTLR start "rule__ParamList__Group_1__1"
    // InternalDatalog.g:1171:1: rule__ParamList__Group_1__1 : rule__ParamList__Group_1__1__Impl rule__ParamList__Group_1__2 ;
    public final void rule__ParamList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1175:1: ( rule__ParamList__Group_1__1__Impl rule__ParamList__Group_1__2 )
            // InternalDatalog.g:1176:2: rule__ParamList__Group_1__1__Impl rule__ParamList__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__ParamList__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParamList__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamList__Group_1__1"


    // $ANTLR start "rule__ParamList__Group_1__1__Impl"
    // InternalDatalog.g:1183:1: rule__ParamList__Group_1__1__Impl : ( ',' ) ;
    public final void rule__ParamList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1187:1: ( ( ',' ) )
            // InternalDatalog.g:1188:1: ( ',' )
            {
            // InternalDatalog.g:1188:1: ( ',' )
            // InternalDatalog.g:1189:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamListAccess().getCommaKeyword_1_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamListAccess().getCommaKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamList__Group_1__1__Impl"


    // $ANTLR start "rule__ParamList__Group_1__2"
    // InternalDatalog.g:1198:1: rule__ParamList__Group_1__2 : rule__ParamList__Group_1__2__Impl ;
    public final void rule__ParamList__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1202:1: ( rule__ParamList__Group_1__2__Impl )
            // InternalDatalog.g:1203:2: rule__ParamList__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParamList__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamList__Group_1__2"


    // $ANTLR start "rule__ParamList__Group_1__2__Impl"
    // InternalDatalog.g:1209:1: rule__ParamList__Group_1__2__Impl : ( ( rule__ParamList__RightAssignment_1_2 ) ) ;
    public final void rule__ParamList__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1213:1: ( ( ( rule__ParamList__RightAssignment_1_2 ) ) )
            // InternalDatalog.g:1214:1: ( ( rule__ParamList__RightAssignment_1_2 ) )
            {
            // InternalDatalog.g:1214:1: ( ( rule__ParamList__RightAssignment_1_2 ) )
            // InternalDatalog.g:1215:2: ( rule__ParamList__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamListAccess().getRightAssignment_1_2()); 
            }
            // InternalDatalog.g:1216:2: ( rule__ParamList__RightAssignment_1_2 )
            // InternalDatalog.g:1216:3: rule__ParamList__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ParamList__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamListAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamList__Group_1__2__Impl"


    // $ANTLR start "rule__Model__ProgramAssignment"
    // InternalDatalog.g:1225:1: rule__Model__ProgramAssignment : ( ruleStatements ) ;
    public final void rule__Model__ProgramAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1229:1: ( ( ruleStatements ) )
            // InternalDatalog.g:1230:2: ( ruleStatements )
            {
            // InternalDatalog.g:1230:2: ( ruleStatements )
            // InternalDatalog.g:1231:3: ruleStatements
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getProgramStatementsParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStatements();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getProgramStatementsParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ProgramAssignment"


    // $ANTLR start "rule__Conditions__CondAssignment_0"
    // InternalDatalog.g:1240:1: rule__Conditions__CondAssignment_0 : ( ruleAtom ) ;
    public final void rule__Conditions__CondAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1244:1: ( ( ruleAtom ) )
            // InternalDatalog.g:1245:2: ( ruleAtom )
            {
            // InternalDatalog.g:1245:2: ( ruleAtom )
            // InternalDatalog.g:1246:3: ruleAtom
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionsAccess().getCondAtomParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionsAccess().getCondAtomParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditions__CondAssignment_0"


    // $ANTLR start "rule__Conditions__RightAssignment_2"
    // InternalDatalog.g:1255:1: rule__Conditions__RightAssignment_2 : ( ruleFormula ) ;
    public final void rule__Conditions__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1259:1: ( ( ruleFormula ) )
            // InternalDatalog.g:1260:2: ( ruleFormula )
            {
            // InternalDatalog.g:1260:2: ( ruleFormula )
            // InternalDatalog.g:1261:3: ruleFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionsAccess().getRightFormulaParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionsAccess().getRightFormulaParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditions__RightAssignment_2"


    // $ANTLR start "rule__Assertion__TruthAssignment_0"
    // InternalDatalog.g:1270:1: rule__Assertion__TruthAssignment_0 : ( ruleFormula ) ;
    public final void rule__Assertion__TruthAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1274:1: ( ( ruleFormula ) )
            // InternalDatalog.g:1275:2: ( ruleFormula )
            {
            // InternalDatalog.g:1275:2: ( ruleFormula )
            // InternalDatalog.g:1276:3: ruleFormula
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertionAccess().getTruthFormulaParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFormula();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssertionAccess().getTruthFormulaParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__TruthAssignment_0"


    // $ANTLR start "rule__Formula__RightAssignment_1_2"
    // InternalDatalog.g:1285:1: rule__Formula__RightAssignment_1_2 : ( ruleAtom ) ;
    public final void rule__Formula__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1289:1: ( ( ruleAtom ) )
            // InternalDatalog.g:1290:2: ( ruleAtom )
            {
            // InternalDatalog.g:1290:2: ( ruleAtom )
            // InternalDatalog.g:1291:3: ruleAtom
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormulaAccess().getRightAtomParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormulaAccess().getRightAtomParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formula__RightAssignment_1_2"


    // $ANTLR start "rule__Atom__NameAssignment_0"
    // InternalDatalog.g:1300:1: rule__Atom__NameAssignment_0 : ( ruleParameterPred ) ;
    public final void rule__Atom__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1304:1: ( ( ruleParameterPred ) )
            // InternalDatalog.g:1305:2: ( ruleParameterPred )
            {
            // InternalDatalog.g:1305:2: ( ruleParameterPred )
            // InternalDatalog.g:1306:3: ruleParameterPred
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getNameParameterPredParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameterPred();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getNameParameterPredParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__NameAssignment_0"


    // $ANTLR start "rule__Atom__ListAssignment_2"
    // InternalDatalog.g:1315:1: rule__Atom__ListAssignment_2 : ( ruleParamList ) ;
    public final void rule__Atom__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1319:1: ( ( ruleParamList ) )
            // InternalDatalog.g:1320:2: ( ruleParamList )
            {
            // InternalDatalog.g:1320:2: ( ruleParamList )
            // InternalDatalog.g:1321:3: ruleParamList
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getListParamListParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParamList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getListParamListParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__ListAssignment_2"


    // $ANTLR start "rule__ParamList__RightAssignment_1_2"
    // InternalDatalog.g:1330:1: rule__ParamList__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__ParamList__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1334:1: ( ( rulePrimary ) )
            // InternalDatalog.g:1335:2: ( rulePrimary )
            {
            // InternalDatalog.g:1335:2: ( rulePrimary )
            // InternalDatalog.g:1336:3: rulePrimary
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamListAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamListAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamList__RightAssignment_1_2"


    // $ANTLR start "rule__ParameterInt__IntAssignment"
    // InternalDatalog.g:1345:1: rule__ParameterInt__IntAssignment : ( RULE_INT ) ;
    public final void rule__ParameterInt__IntAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1349:1: ( ( RULE_INT ) )
            // InternalDatalog.g:1350:2: ( RULE_INT )
            {
            // InternalDatalog.g:1350:2: ( RULE_INT )
            // InternalDatalog.g:1351:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterIntAccess().getIntINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterIntAccess().getIntINTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterInt__IntAssignment"


    // $ANTLR start "rule__ParameterVar__UpAssignment"
    // InternalDatalog.g:1360:1: rule__ParameterVar__UpAssignment : ( RULE_VARIABLE ) ;
    public final void rule__ParameterVar__UpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1364:1: ( ( RULE_VARIABLE ) )
            // InternalDatalog.g:1365:2: ( RULE_VARIABLE )
            {
            // InternalDatalog.g:1365:2: ( RULE_VARIABLE )
            // InternalDatalog.g:1366:3: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterVarAccess().getUpVARIABLETerminalRuleCall_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterVarAccess().getUpVARIABLETerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterVar__UpAssignment"


    // $ANTLR start "rule__ParameterPred__LowAssignment"
    // InternalDatalog.g:1375:1: rule__ParameterPred__LowAssignment : ( RULE_PREDICATE ) ;
    public final void rule__ParameterPred__LowAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1379:1: ( ( RULE_PREDICATE ) )
            // InternalDatalog.g:1380:2: ( RULE_PREDICATE )
            {
            // InternalDatalog.g:1380:2: ( RULE_PREDICATE )
            // InternalDatalog.g:1381:3: RULE_PREDICATE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPredAccess().getLowPREDICATETerminalRuleCall_0()); 
            }
            match(input,RULE_PREDICATE,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterPredAccess().getLowPREDICATETerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPred__LowAssignment"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\1\6\2\uffff\1\24\1\uffff\1\4\3\23\1\4\1\21\3\23\2\uffff";
    static final String dfa_3s = "\1\17\2\uffff\1\24\1\uffff\1\6\3\25\1\6\1\23\3\25\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\uffff\1\5\11\uffff\1\3\1\4";
    static final String dfa_5s = "\20\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\6\uffff\1\1\1\2\1\4",
            "",
            "",
            "\1\5",
            "",
            "\1\10\1\7\1\6",
            "\1\11\1\uffff\1\12",
            "\1\11\1\uffff\1\12",
            "\1\11\1\uffff\1\12",
            "\1\15\1\14\1\13",
            "\1\16\2\17",
            "\1\11\1\uffff\1\12",
            "\1\11\1\uffff\1\12",
            "\1\11\1\uffff\1\12",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "403:1: rule__Statements__Alternatives : ( ( ( rule__Statements__Group_0__0 ) ) | ( ( rule__Statements__Group_1__0 ) ) | ( ruleConditions ) | ( ruleAssertion ) | ( ( rule__Statements__Group_4__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000E042L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000E040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});

}