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

@SuppressWarnings("all")
public class InternalDatalogParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "':-'", "'.'", "','", "'('", "')'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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
    // InternalDatalog.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDatalog.g:54:1: ( ruleModel EOF )
            // InternalDatalog.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDatalog.g:62:1: ruleModel : ( ( rule__Model__ProgramAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:66:2: ( ( ( rule__Model__ProgramAssignment )* ) )
            // InternalDatalog.g:67:2: ( ( rule__Model__ProgramAssignment )* )
            {
            // InternalDatalog.g:67:2: ( ( rule__Model__ProgramAssignment )* )
            // InternalDatalog.g:68:3: ( rule__Model__ProgramAssignment )*
            {
             before(grammarAccess.getModelAccess().getProgramAssignment()); 
            // InternalDatalog.g:69:3: ( rule__Model__ProgramAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDatalog.g:69:4: rule__Model__ProgramAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ProgramAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getProgramAssignment()); 

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


    // $ANTLR start "entryRuleStmtPlusMinus"
    // InternalDatalog.g:78:1: entryRuleStmtPlusMinus : ruleStmtPlusMinus EOF ;
    public final void entryRuleStmtPlusMinus() throws RecognitionException {
        try {
            // InternalDatalog.g:79:1: ( ruleStmtPlusMinus EOF )
            // InternalDatalog.g:80:1: ruleStmtPlusMinus EOF
            {
             before(grammarAccess.getStmtPlusMinusRule()); 
            pushFollow(FOLLOW_1);
            ruleStmtPlusMinus();

            state._fsp--;

             after(grammarAccess.getStmtPlusMinusRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStmtPlusMinus"


    // $ANTLR start "ruleStmtPlusMinus"
    // InternalDatalog.g:87:1: ruleStmtPlusMinus : ( ( rule__StmtPlusMinus__Group__0 ) ) ;
    public final void ruleStmtPlusMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:91:2: ( ( ( rule__StmtPlusMinus__Group__0 ) ) )
            // InternalDatalog.g:92:2: ( ( rule__StmtPlusMinus__Group__0 ) )
            {
            // InternalDatalog.g:92:2: ( ( rule__StmtPlusMinus__Group__0 ) )
            // InternalDatalog.g:93:3: ( rule__StmtPlusMinus__Group__0 )
            {
             before(grammarAccess.getStmtPlusMinusAccess().getGroup()); 
            // InternalDatalog.g:94:3: ( rule__StmtPlusMinus__Group__0 )
            // InternalDatalog.g:94:4: rule__StmtPlusMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StmtPlusMinus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStmtPlusMinusAccess().getGroup()); 

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
    // $ANTLR end "ruleStmtPlusMinus"


    // $ANTLR start "entryRuleStmtPlus"
    // InternalDatalog.g:103:1: entryRuleStmtPlus : ruleStmtPlus EOF ;
    public final void entryRuleStmtPlus() throws RecognitionException {
        try {
            // InternalDatalog.g:104:1: ( ruleStmtPlus EOF )
            // InternalDatalog.g:105:1: ruleStmtPlus EOF
            {
             before(grammarAccess.getStmtPlusRule()); 
            pushFollow(FOLLOW_1);
            ruleStmtPlus();

            state._fsp--;

             after(grammarAccess.getStmtPlusRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStmtPlus"


    // $ANTLR start "ruleStmtPlus"
    // InternalDatalog.g:112:1: ruleStmtPlus : ( ( rule__StmtPlus__Group__0 ) ) ;
    public final void ruleStmtPlus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:116:2: ( ( ( rule__StmtPlus__Group__0 ) ) )
            // InternalDatalog.g:117:2: ( ( rule__StmtPlus__Group__0 ) )
            {
            // InternalDatalog.g:117:2: ( ( rule__StmtPlus__Group__0 ) )
            // InternalDatalog.g:118:3: ( rule__StmtPlus__Group__0 )
            {
             before(grammarAccess.getStmtPlusAccess().getGroup()); 
            // InternalDatalog.g:119:3: ( rule__StmtPlus__Group__0 )
            // InternalDatalog.g:119:4: rule__StmtPlus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StmtPlus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStmtPlusAccess().getGroup()); 

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
    // $ANTLR end "ruleStmtPlus"


    // $ANTLR start "entryRuleStmtMinus"
    // InternalDatalog.g:128:1: entryRuleStmtMinus : ruleStmtMinus EOF ;
    public final void entryRuleStmtMinus() throws RecognitionException {
        try {
            // InternalDatalog.g:129:1: ( ruleStmtMinus EOF )
            // InternalDatalog.g:130:1: ruleStmtMinus EOF
            {
             before(grammarAccess.getStmtMinusRule()); 
            pushFollow(FOLLOW_1);
            ruleStmtMinus();

            state._fsp--;

             after(grammarAccess.getStmtMinusRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStmtMinus"


    // $ANTLR start "ruleStmtMinus"
    // InternalDatalog.g:137:1: ruleStmtMinus : ( ( rule__StmtMinus__Group__0 ) ) ;
    public final void ruleStmtMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:141:2: ( ( ( rule__StmtMinus__Group__0 ) ) )
            // InternalDatalog.g:142:2: ( ( rule__StmtMinus__Group__0 ) )
            {
            // InternalDatalog.g:142:2: ( ( rule__StmtMinus__Group__0 ) )
            // InternalDatalog.g:143:3: ( rule__StmtMinus__Group__0 )
            {
             before(grammarAccess.getStmtMinusAccess().getGroup()); 
            // InternalDatalog.g:144:3: ( rule__StmtMinus__Group__0 )
            // InternalDatalog.g:144:4: rule__StmtMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StmtMinus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStmtMinusAccess().getGroup()); 

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
    // $ANTLR end "ruleStmtMinus"


    // $ANTLR start "entryRuleStatements"
    // InternalDatalog.g:153:1: entryRuleStatements : ruleStatements EOF ;
    public final void entryRuleStatements() throws RecognitionException {
        try {
            // InternalDatalog.g:154:1: ( ruleStatements EOF )
            // InternalDatalog.g:155:1: ruleStatements EOF
            {
             before(grammarAccess.getStatementsRule()); 
            pushFollow(FOLLOW_1);
            ruleStatements();

            state._fsp--;

             after(grammarAccess.getStatementsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDatalog.g:162:1: ruleStatements : ( ( rule__Statements__Alternatives ) ) ;
    public final void ruleStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:166:2: ( ( ( rule__Statements__Alternatives ) ) )
            // InternalDatalog.g:167:2: ( ( rule__Statements__Alternatives ) )
            {
            // InternalDatalog.g:167:2: ( ( rule__Statements__Alternatives ) )
            // InternalDatalog.g:168:3: ( rule__Statements__Alternatives )
            {
             before(grammarAccess.getStatementsAccess().getAlternatives()); 
            // InternalDatalog.g:169:3: ( rule__Statements__Alternatives )
            // InternalDatalog.g:169:4: rule__Statements__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statements__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementsAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleConditions"
    // InternalDatalog.g:178:1: entryRuleConditions : ruleConditions EOF ;
    public final void entryRuleConditions() throws RecognitionException {
        try {
            // InternalDatalog.g:179:1: ( ruleConditions EOF )
            // InternalDatalog.g:180:1: ruleConditions EOF
            {
             before(grammarAccess.getConditionsRule()); 
            pushFollow(FOLLOW_1);
            ruleConditions();

            state._fsp--;

             after(grammarAccess.getConditionsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDatalog.g:187:1: ruleConditions : ( ( rule__Conditions__Group__0 ) ) ;
    public final void ruleConditions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:191:2: ( ( ( rule__Conditions__Group__0 ) ) )
            // InternalDatalog.g:192:2: ( ( rule__Conditions__Group__0 ) )
            {
            // InternalDatalog.g:192:2: ( ( rule__Conditions__Group__0 ) )
            // InternalDatalog.g:193:3: ( rule__Conditions__Group__0 )
            {
             before(grammarAccess.getConditionsAccess().getGroup()); 
            // InternalDatalog.g:194:3: ( rule__Conditions__Group__0 )
            // InternalDatalog.g:194:4: rule__Conditions__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conditions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionsAccess().getGroup()); 

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
    // InternalDatalog.g:203:1: entryRuleAssertion : ruleAssertion EOF ;
    public final void entryRuleAssertion() throws RecognitionException {
        try {
            // InternalDatalog.g:204:1: ( ruleAssertion EOF )
            // InternalDatalog.g:205:1: ruleAssertion EOF
            {
             before(grammarAccess.getAssertionRule()); 
            pushFollow(FOLLOW_1);
            ruleAssertion();

            state._fsp--;

             after(grammarAccess.getAssertionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDatalog.g:212:1: ruleAssertion : ( ( rule__Assertion__Group__0 ) ) ;
    public final void ruleAssertion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:216:2: ( ( ( rule__Assertion__Group__0 ) ) )
            // InternalDatalog.g:217:2: ( ( rule__Assertion__Group__0 ) )
            {
            // InternalDatalog.g:217:2: ( ( rule__Assertion__Group__0 ) )
            // InternalDatalog.g:218:3: ( rule__Assertion__Group__0 )
            {
             before(grammarAccess.getAssertionAccess().getGroup()); 
            // InternalDatalog.g:219:3: ( rule__Assertion__Group__0 )
            // InternalDatalog.g:219:4: rule__Assertion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssertionAccess().getGroup()); 

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


    // $ANTLR start "entryRuleAssertionMinus"
    // InternalDatalog.g:228:1: entryRuleAssertionMinus : ruleAssertionMinus EOF ;
    public final void entryRuleAssertionMinus() throws RecognitionException {
        try {
            // InternalDatalog.g:229:1: ( ruleAssertionMinus EOF )
            // InternalDatalog.g:230:1: ruleAssertionMinus EOF
            {
             before(grammarAccess.getAssertionMinusRule()); 
            pushFollow(FOLLOW_1);
            ruleAssertionMinus();

            state._fsp--;

             after(grammarAccess.getAssertionMinusRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssertionMinus"


    // $ANTLR start "ruleAssertionMinus"
    // InternalDatalog.g:237:1: ruleAssertionMinus : ( ( rule__AssertionMinus__Group__0 ) ) ;
    public final void ruleAssertionMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:241:2: ( ( ( rule__AssertionMinus__Group__0 ) ) )
            // InternalDatalog.g:242:2: ( ( rule__AssertionMinus__Group__0 ) )
            {
            // InternalDatalog.g:242:2: ( ( rule__AssertionMinus__Group__0 ) )
            // InternalDatalog.g:243:3: ( rule__AssertionMinus__Group__0 )
            {
             before(grammarAccess.getAssertionMinusAccess().getGroup()); 
            // InternalDatalog.g:244:3: ( rule__AssertionMinus__Group__0 )
            // InternalDatalog.g:244:4: rule__AssertionMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssertionMinus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssertionMinusAccess().getGroup()); 

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
    // $ANTLR end "ruleAssertionMinus"


    // $ANTLR start "entryRuleFormulaC"
    // InternalDatalog.g:253:1: entryRuleFormulaC : ruleFormulaC EOF ;
    public final void entryRuleFormulaC() throws RecognitionException {
        try {
            // InternalDatalog.g:254:1: ( ruleFormulaC EOF )
            // InternalDatalog.g:255:1: ruleFormulaC EOF
            {
             before(grammarAccess.getFormulaCRule()); 
            pushFollow(FOLLOW_1);
            ruleFormulaC();

            state._fsp--;

             after(grammarAccess.getFormulaCRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFormulaC"


    // $ANTLR start "ruleFormulaC"
    // InternalDatalog.g:262:1: ruleFormulaC : ( ( rule__FormulaC__Group__0 ) ) ;
    public final void ruleFormulaC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:266:2: ( ( ( rule__FormulaC__Group__0 ) ) )
            // InternalDatalog.g:267:2: ( ( rule__FormulaC__Group__0 ) )
            {
            // InternalDatalog.g:267:2: ( ( rule__FormulaC__Group__0 ) )
            // InternalDatalog.g:268:3: ( rule__FormulaC__Group__0 )
            {
             before(grammarAccess.getFormulaCAccess().getGroup()); 
            // InternalDatalog.g:269:3: ( rule__FormulaC__Group__0 )
            // InternalDatalog.g:269:4: rule__FormulaC__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FormulaC__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormulaCAccess().getGroup()); 

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
    // $ANTLR end "ruleFormulaC"


    // $ANTLR start "entryRuleAtom"
    // InternalDatalog.g:278:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // InternalDatalog.g:279:1: ( ruleAtom EOF )
            // InternalDatalog.g:280:1: ruleAtom EOF
            {
             before(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getAtomRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDatalog.g:287:1: ruleAtom : ( ( rule__Atom__Group__0 ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:291:2: ( ( ( rule__Atom__Group__0 ) ) )
            // InternalDatalog.g:292:2: ( ( rule__Atom__Group__0 ) )
            {
            // InternalDatalog.g:292:2: ( ( rule__Atom__Group__0 ) )
            // InternalDatalog.g:293:3: ( rule__Atom__Group__0 )
            {
             before(grammarAccess.getAtomAccess().getGroup()); 
            // InternalDatalog.g:294:3: ( rule__Atom__Group__0 )
            // InternalDatalog.g:294:4: rule__Atom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Atom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getGroup()); 

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


    // $ANTLR start "entryRuleAtomC"
    // InternalDatalog.g:303:1: entryRuleAtomC : ruleAtomC EOF ;
    public final void entryRuleAtomC() throws RecognitionException {
        try {
            // InternalDatalog.g:304:1: ( ruleAtomC EOF )
            // InternalDatalog.g:305:1: ruleAtomC EOF
            {
             before(grammarAccess.getAtomCRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomC();

            state._fsp--;

             after(grammarAccess.getAtomCRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAtomC"


    // $ANTLR start "ruleAtomC"
    // InternalDatalog.g:312:1: ruleAtomC : ( ( rule__AtomC__Group__0 ) ) ;
    public final void ruleAtomC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:316:2: ( ( ( rule__AtomC__Group__0 ) ) )
            // InternalDatalog.g:317:2: ( ( rule__AtomC__Group__0 ) )
            {
            // InternalDatalog.g:317:2: ( ( rule__AtomC__Group__0 ) )
            // InternalDatalog.g:318:3: ( rule__AtomC__Group__0 )
            {
             before(grammarAccess.getAtomCAccess().getGroup()); 
            // InternalDatalog.g:319:3: ( rule__AtomC__Group__0 )
            // InternalDatalog.g:319:4: rule__AtomC__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AtomC__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtomCAccess().getGroup()); 

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
    // $ANTLR end "ruleAtomC"


    // $ANTLR start "entryRuleParamList"
    // InternalDatalog.g:328:1: entryRuleParamList : ruleParamList EOF ;
    public final void entryRuleParamList() throws RecognitionException {
        try {
            // InternalDatalog.g:329:1: ( ruleParamList EOF )
            // InternalDatalog.g:330:1: ruleParamList EOF
            {
             before(grammarAccess.getParamListRule()); 
            pushFollow(FOLLOW_1);
            ruleParamList();

            state._fsp--;

             after(grammarAccess.getParamListRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDatalog.g:337:1: ruleParamList : ( ( rule__ParamList__Group__0 ) ) ;
    public final void ruleParamList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:341:2: ( ( ( rule__ParamList__Group__0 ) ) )
            // InternalDatalog.g:342:2: ( ( rule__ParamList__Group__0 ) )
            {
            // InternalDatalog.g:342:2: ( ( rule__ParamList__Group__0 ) )
            // InternalDatalog.g:343:3: ( rule__ParamList__Group__0 )
            {
             before(grammarAccess.getParamListAccess().getGroup()); 
            // InternalDatalog.g:344:3: ( rule__ParamList__Group__0 )
            // InternalDatalog.g:344:4: rule__ParamList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParamList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamListAccess().getGroup()); 

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
    // InternalDatalog.g:353:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalDatalog.g:354:1: ( rulePrimary EOF )
            // InternalDatalog.g:355:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDatalog.g:362:1: rulePrimary : ( ( rule__Primary__ValueAssignment ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:366:2: ( ( ( rule__Primary__ValueAssignment ) ) )
            // InternalDatalog.g:367:2: ( ( rule__Primary__ValueAssignment ) )
            {
            // InternalDatalog.g:367:2: ( ( rule__Primary__ValueAssignment ) )
            // InternalDatalog.g:368:3: ( rule__Primary__ValueAssignment )
            {
             before(grammarAccess.getPrimaryAccess().getValueAssignment()); 
            // InternalDatalog.g:369:3: ( rule__Primary__ValueAssignment )
            // InternalDatalog.g:369:4: rule__Primary__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getValueAssignment()); 

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


    // $ANTLR start "rule__Statements__Alternatives"
    // InternalDatalog.g:377:1: rule__Statements__Alternatives : ( ( ( rule__Statements__ConditionAssignment_0 ) ) | ( ( rule__Statements__AssertionAssignment_1 ) ) );
    public final void rule__Statements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:381:1: ( ( ( rule__Statements__ConditionAssignment_0 ) ) | ( ( rule__Statements__AssertionAssignment_1 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalDatalog.g:382:2: ( ( rule__Statements__ConditionAssignment_0 ) )
                    {
                    // InternalDatalog.g:382:2: ( ( rule__Statements__ConditionAssignment_0 ) )
                    // InternalDatalog.g:383:3: ( rule__Statements__ConditionAssignment_0 )
                    {
                     before(grammarAccess.getStatementsAccess().getConditionAssignment_0()); 
                    // InternalDatalog.g:384:3: ( rule__Statements__ConditionAssignment_0 )
                    // InternalDatalog.g:384:4: rule__Statements__ConditionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statements__ConditionAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementsAccess().getConditionAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDatalog.g:388:2: ( ( rule__Statements__AssertionAssignment_1 ) )
                    {
                    // InternalDatalog.g:388:2: ( ( rule__Statements__AssertionAssignment_1 ) )
                    // InternalDatalog.g:389:3: ( rule__Statements__AssertionAssignment_1 )
                    {
                     before(grammarAccess.getStatementsAccess().getAssertionAssignment_1()); 
                    // InternalDatalog.g:390:3: ( rule__Statements__AssertionAssignment_1 )
                    // InternalDatalog.g:390:4: rule__Statements__AssertionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statements__AssertionAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementsAccess().getAssertionAssignment_1()); 

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


    // $ANTLR start "rule__StmtPlusMinus__Group__0"
    // InternalDatalog.g:398:1: rule__StmtPlusMinus__Group__0 : rule__StmtPlusMinus__Group__0__Impl rule__StmtPlusMinus__Group__1 ;
    public final void rule__StmtPlusMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:402:1: ( rule__StmtPlusMinus__Group__0__Impl rule__StmtPlusMinus__Group__1 )
            // InternalDatalog.g:403:2: rule__StmtPlusMinus__Group__0__Impl rule__StmtPlusMinus__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__StmtPlusMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StmtPlusMinus__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__StmtPlusMinus__Group__0"


    // $ANTLR start "rule__StmtPlusMinus__Group__0__Impl"
    // InternalDatalog.g:410:1: rule__StmtPlusMinus__Group__0__Impl : ( ( rule__StmtPlusMinus__LeftAssignment_0 ) ) ;
    public final void rule__StmtPlusMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:414:1: ( ( ( rule__StmtPlusMinus__LeftAssignment_0 ) ) )
            // InternalDatalog.g:415:1: ( ( rule__StmtPlusMinus__LeftAssignment_0 ) )
            {
            // InternalDatalog.g:415:1: ( ( rule__StmtPlusMinus__LeftAssignment_0 ) )
            // InternalDatalog.g:416:2: ( rule__StmtPlusMinus__LeftAssignment_0 )
            {
             before(grammarAccess.getStmtPlusMinusAccess().getLeftAssignment_0()); 
            // InternalDatalog.g:417:2: ( rule__StmtPlusMinus__LeftAssignment_0 )
            // InternalDatalog.g:417:3: rule__StmtPlusMinus__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StmtPlusMinus__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStmtPlusMinusAccess().getLeftAssignment_0()); 

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
    // $ANTLR end "rule__StmtPlusMinus__Group__0__Impl"


    // $ANTLR start "rule__StmtPlusMinus__Group__1"
    // InternalDatalog.g:425:1: rule__StmtPlusMinus__Group__1 : rule__StmtPlusMinus__Group__1__Impl ;
    public final void rule__StmtPlusMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:429:1: ( rule__StmtPlusMinus__Group__1__Impl )
            // InternalDatalog.g:430:2: rule__StmtPlusMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StmtPlusMinus__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__StmtPlusMinus__Group__1"


    // $ANTLR start "rule__StmtPlusMinus__Group__1__Impl"
    // InternalDatalog.g:436:1: rule__StmtPlusMinus__Group__1__Impl : ( ( rule__StmtPlusMinus__RightAssignment_1 ) ) ;
    public final void rule__StmtPlusMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:440:1: ( ( ( rule__StmtPlusMinus__RightAssignment_1 ) ) )
            // InternalDatalog.g:441:1: ( ( rule__StmtPlusMinus__RightAssignment_1 ) )
            {
            // InternalDatalog.g:441:1: ( ( rule__StmtPlusMinus__RightAssignment_1 ) )
            // InternalDatalog.g:442:2: ( rule__StmtPlusMinus__RightAssignment_1 )
            {
             before(grammarAccess.getStmtPlusMinusAccess().getRightAssignment_1()); 
            // InternalDatalog.g:443:2: ( rule__StmtPlusMinus__RightAssignment_1 )
            // InternalDatalog.g:443:3: rule__StmtPlusMinus__RightAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StmtPlusMinus__RightAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStmtPlusMinusAccess().getRightAssignment_1()); 

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
    // $ANTLR end "rule__StmtPlusMinus__Group__1__Impl"


    // $ANTLR start "rule__StmtPlus__Group__0"
    // InternalDatalog.g:452:1: rule__StmtPlus__Group__0 : rule__StmtPlus__Group__0__Impl rule__StmtPlus__Group__1 ;
    public final void rule__StmtPlus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:456:1: ( rule__StmtPlus__Group__0__Impl rule__StmtPlus__Group__1 )
            // InternalDatalog.g:457:2: rule__StmtPlus__Group__0__Impl rule__StmtPlus__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__StmtPlus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StmtPlus__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__StmtPlus__Group__0"


    // $ANTLR start "rule__StmtPlus__Group__0__Impl"
    // InternalDatalog.g:464:1: rule__StmtPlus__Group__0__Impl : ( ( rule__StmtPlus__PlusAssignment_0 ) ) ;
    public final void rule__StmtPlus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:468:1: ( ( ( rule__StmtPlus__PlusAssignment_0 ) ) )
            // InternalDatalog.g:469:1: ( ( rule__StmtPlus__PlusAssignment_0 ) )
            {
            // InternalDatalog.g:469:1: ( ( rule__StmtPlus__PlusAssignment_0 ) )
            // InternalDatalog.g:470:2: ( rule__StmtPlus__PlusAssignment_0 )
            {
             before(grammarAccess.getStmtPlusAccess().getPlusAssignment_0()); 
            // InternalDatalog.g:471:2: ( rule__StmtPlus__PlusAssignment_0 )
            // InternalDatalog.g:471:3: rule__StmtPlus__PlusAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StmtPlus__PlusAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStmtPlusAccess().getPlusAssignment_0()); 

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
    // $ANTLR end "rule__StmtPlus__Group__0__Impl"


    // $ANTLR start "rule__StmtPlus__Group__1"
    // InternalDatalog.g:479:1: rule__StmtPlus__Group__1 : rule__StmtPlus__Group__1__Impl ;
    public final void rule__StmtPlus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:483:1: ( rule__StmtPlus__Group__1__Impl )
            // InternalDatalog.g:484:2: rule__StmtPlus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StmtPlus__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__StmtPlus__Group__1"


    // $ANTLR start "rule__StmtPlus__Group__1__Impl"
    // InternalDatalog.g:490:1: rule__StmtPlus__Group__1__Impl : ( ( ( rule__StmtPlus__Group_1__0 ) ) ( ( rule__StmtPlus__Group_1__0 )* ) ) ;
    public final void rule__StmtPlus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:494:1: ( ( ( ( rule__StmtPlus__Group_1__0 ) ) ( ( rule__StmtPlus__Group_1__0 )* ) ) )
            // InternalDatalog.g:495:1: ( ( ( rule__StmtPlus__Group_1__0 ) ) ( ( rule__StmtPlus__Group_1__0 )* ) )
            {
            // InternalDatalog.g:495:1: ( ( ( rule__StmtPlus__Group_1__0 ) ) ( ( rule__StmtPlus__Group_1__0 )* ) )
            // InternalDatalog.g:496:2: ( ( rule__StmtPlus__Group_1__0 ) ) ( ( rule__StmtPlus__Group_1__0 )* )
            {
            // InternalDatalog.g:496:2: ( ( rule__StmtPlus__Group_1__0 ) )
            // InternalDatalog.g:497:3: ( rule__StmtPlus__Group_1__0 )
            {
             before(grammarAccess.getStmtPlusAccess().getGroup_1()); 
            // InternalDatalog.g:498:3: ( rule__StmtPlus__Group_1__0 )
            // InternalDatalog.g:498:4: rule__StmtPlus__Group_1__0
            {
            pushFollow(FOLLOW_6);
            rule__StmtPlus__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getStmtPlusAccess().getGroup_1()); 

            }

            // InternalDatalog.g:501:2: ( ( rule__StmtPlus__Group_1__0 )* )
            // InternalDatalog.g:502:3: ( rule__StmtPlus__Group_1__0 )*
            {
             before(grammarAccess.getStmtPlusAccess().getGroup_1()); 
            // InternalDatalog.g:503:3: ( rule__StmtPlus__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDatalog.g:503:4: rule__StmtPlus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__StmtPlus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getStmtPlusAccess().getGroup_1()); 

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
    // $ANTLR end "rule__StmtPlus__Group__1__Impl"


    // $ANTLR start "rule__StmtPlus__Group_1__0"
    // InternalDatalog.g:513:1: rule__StmtPlus__Group_1__0 : rule__StmtPlus__Group_1__0__Impl rule__StmtPlus__Group_1__1 ;
    public final void rule__StmtPlus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:517:1: ( rule__StmtPlus__Group_1__0__Impl rule__StmtPlus__Group_1__1 )
            // InternalDatalog.g:518:2: rule__StmtPlus__Group_1__0__Impl rule__StmtPlus__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__StmtPlus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StmtPlus__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__StmtPlus__Group_1__0"


    // $ANTLR start "rule__StmtPlus__Group_1__0__Impl"
    // InternalDatalog.g:525:1: rule__StmtPlus__Group_1__0__Impl : ( () ) ;
    public final void rule__StmtPlus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:529:1: ( ( () ) )
            // InternalDatalog.g:530:1: ( () )
            {
            // InternalDatalog.g:530:1: ( () )
            // InternalDatalog.g:531:2: ()
            {
             before(grammarAccess.getStmtPlusAccess().getStmtPlusLeftAction_1_0()); 
            // InternalDatalog.g:532:2: ()
            // InternalDatalog.g:532:3: 
            {
            }

             after(grammarAccess.getStmtPlusAccess().getStmtPlusLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StmtPlus__Group_1__0__Impl"


    // $ANTLR start "rule__StmtPlus__Group_1__1"
    // InternalDatalog.g:540:1: rule__StmtPlus__Group_1__1 : rule__StmtPlus__Group_1__1__Impl ;
    public final void rule__StmtPlus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:544:1: ( rule__StmtPlus__Group_1__1__Impl )
            // InternalDatalog.g:545:2: rule__StmtPlus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StmtPlus__Group_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__StmtPlus__Group_1__1"


    // $ANTLR start "rule__StmtPlus__Group_1__1__Impl"
    // InternalDatalog.g:551:1: rule__StmtPlus__Group_1__1__Impl : ( ( rule__StmtPlus__RightPlusAssignment_1_1 ) ) ;
    public final void rule__StmtPlus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:555:1: ( ( ( rule__StmtPlus__RightPlusAssignment_1_1 ) ) )
            // InternalDatalog.g:556:1: ( ( rule__StmtPlus__RightPlusAssignment_1_1 ) )
            {
            // InternalDatalog.g:556:1: ( ( rule__StmtPlus__RightPlusAssignment_1_1 ) )
            // InternalDatalog.g:557:2: ( rule__StmtPlus__RightPlusAssignment_1_1 )
            {
             before(grammarAccess.getStmtPlusAccess().getRightPlusAssignment_1_1()); 
            // InternalDatalog.g:558:2: ( rule__StmtPlus__RightPlusAssignment_1_1 )
            // InternalDatalog.g:558:3: rule__StmtPlus__RightPlusAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__StmtPlus__RightPlusAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStmtPlusAccess().getRightPlusAssignment_1_1()); 

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
    // $ANTLR end "rule__StmtPlus__Group_1__1__Impl"


    // $ANTLR start "rule__StmtMinus__Group__0"
    // InternalDatalog.g:567:1: rule__StmtMinus__Group__0 : rule__StmtMinus__Group__0__Impl rule__StmtMinus__Group__1 ;
    public final void rule__StmtMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:571:1: ( rule__StmtMinus__Group__0__Impl rule__StmtMinus__Group__1 )
            // InternalDatalog.g:572:2: rule__StmtMinus__Group__0__Impl rule__StmtMinus__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__StmtMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StmtMinus__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__StmtMinus__Group__0"


    // $ANTLR start "rule__StmtMinus__Group__0__Impl"
    // InternalDatalog.g:579:1: rule__StmtMinus__Group__0__Impl : ( ( rule__StmtMinus__MinusAssignment_0 ) ) ;
    public final void rule__StmtMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:583:1: ( ( ( rule__StmtMinus__MinusAssignment_0 ) ) )
            // InternalDatalog.g:584:1: ( ( rule__StmtMinus__MinusAssignment_0 ) )
            {
            // InternalDatalog.g:584:1: ( ( rule__StmtMinus__MinusAssignment_0 ) )
            // InternalDatalog.g:585:2: ( rule__StmtMinus__MinusAssignment_0 )
            {
             before(grammarAccess.getStmtMinusAccess().getMinusAssignment_0()); 
            // InternalDatalog.g:586:2: ( rule__StmtMinus__MinusAssignment_0 )
            // InternalDatalog.g:586:3: rule__StmtMinus__MinusAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StmtMinus__MinusAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStmtMinusAccess().getMinusAssignment_0()); 

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
    // $ANTLR end "rule__StmtMinus__Group__0__Impl"


    // $ANTLR start "rule__StmtMinus__Group__1"
    // InternalDatalog.g:594:1: rule__StmtMinus__Group__1 : rule__StmtMinus__Group__1__Impl ;
    public final void rule__StmtMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:598:1: ( rule__StmtMinus__Group__1__Impl )
            // InternalDatalog.g:599:2: rule__StmtMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StmtMinus__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__StmtMinus__Group__1"


    // $ANTLR start "rule__StmtMinus__Group__1__Impl"
    // InternalDatalog.g:605:1: rule__StmtMinus__Group__1__Impl : ( ( rule__StmtMinus__Group_1__0 )* ) ;
    public final void rule__StmtMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:609:1: ( ( ( rule__StmtMinus__Group_1__0 )* ) )
            // InternalDatalog.g:610:1: ( ( rule__StmtMinus__Group_1__0 )* )
            {
            // InternalDatalog.g:610:1: ( ( rule__StmtMinus__Group_1__0 )* )
            // InternalDatalog.g:611:2: ( rule__StmtMinus__Group_1__0 )*
            {
             before(grammarAccess.getStmtMinusAccess().getGroup_1()); 
            // InternalDatalog.g:612:2: ( rule__StmtMinus__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDatalog.g:612:3: rule__StmtMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__StmtMinus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getStmtMinusAccess().getGroup_1()); 

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
    // $ANTLR end "rule__StmtMinus__Group__1__Impl"


    // $ANTLR start "rule__StmtMinus__Group_1__0"
    // InternalDatalog.g:621:1: rule__StmtMinus__Group_1__0 : rule__StmtMinus__Group_1__0__Impl rule__StmtMinus__Group_1__1 ;
    public final void rule__StmtMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:625:1: ( rule__StmtMinus__Group_1__0__Impl rule__StmtMinus__Group_1__1 )
            // InternalDatalog.g:626:2: rule__StmtMinus__Group_1__0__Impl rule__StmtMinus__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__StmtMinus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StmtMinus__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__StmtMinus__Group_1__0"


    // $ANTLR start "rule__StmtMinus__Group_1__0__Impl"
    // InternalDatalog.g:633:1: rule__StmtMinus__Group_1__0__Impl : ( () ) ;
    public final void rule__StmtMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:637:1: ( ( () ) )
            // InternalDatalog.g:638:1: ( () )
            {
            // InternalDatalog.g:638:1: ( () )
            // InternalDatalog.g:639:2: ()
            {
             before(grammarAccess.getStmtMinusAccess().getStmtMinusLeftAction_1_0()); 
            // InternalDatalog.g:640:2: ()
            // InternalDatalog.g:640:3: 
            {
            }

             after(grammarAccess.getStmtMinusAccess().getStmtMinusLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StmtMinus__Group_1__0__Impl"


    // $ANTLR start "rule__StmtMinus__Group_1__1"
    // InternalDatalog.g:648:1: rule__StmtMinus__Group_1__1 : rule__StmtMinus__Group_1__1__Impl ;
    public final void rule__StmtMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:652:1: ( rule__StmtMinus__Group_1__1__Impl )
            // InternalDatalog.g:653:2: rule__StmtMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StmtMinus__Group_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__StmtMinus__Group_1__1"


    // $ANTLR start "rule__StmtMinus__Group_1__1__Impl"
    // InternalDatalog.g:659:1: rule__StmtMinus__Group_1__1__Impl : ( ( rule__StmtMinus__RightMinusAssignment_1_1 ) ) ;
    public final void rule__StmtMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:663:1: ( ( ( rule__StmtMinus__RightMinusAssignment_1_1 ) ) )
            // InternalDatalog.g:664:1: ( ( rule__StmtMinus__RightMinusAssignment_1_1 ) )
            {
            // InternalDatalog.g:664:1: ( ( rule__StmtMinus__RightMinusAssignment_1_1 ) )
            // InternalDatalog.g:665:2: ( rule__StmtMinus__RightMinusAssignment_1_1 )
            {
             before(grammarAccess.getStmtMinusAccess().getRightMinusAssignment_1_1()); 
            // InternalDatalog.g:666:2: ( rule__StmtMinus__RightMinusAssignment_1_1 )
            // InternalDatalog.g:666:3: rule__StmtMinus__RightMinusAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__StmtMinus__RightMinusAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStmtMinusAccess().getRightMinusAssignment_1_1()); 

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
    // $ANTLR end "rule__StmtMinus__Group_1__1__Impl"


    // $ANTLR start "rule__Conditions__Group__0"
    // InternalDatalog.g:675:1: rule__Conditions__Group__0 : rule__Conditions__Group__0__Impl rule__Conditions__Group__1 ;
    public final void rule__Conditions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:679:1: ( rule__Conditions__Group__0__Impl rule__Conditions__Group__1 )
            // InternalDatalog.g:680:2: rule__Conditions__Group__0__Impl rule__Conditions__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Conditions__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditions__Group__1();

            state._fsp--;


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
    // InternalDatalog.g:687:1: rule__Conditions__Group__0__Impl : ( ( rule__Conditions__CondAssignment_0 ) ) ;
    public final void rule__Conditions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:691:1: ( ( ( rule__Conditions__CondAssignment_0 ) ) )
            // InternalDatalog.g:692:1: ( ( rule__Conditions__CondAssignment_0 ) )
            {
            // InternalDatalog.g:692:1: ( ( rule__Conditions__CondAssignment_0 ) )
            // InternalDatalog.g:693:2: ( rule__Conditions__CondAssignment_0 )
            {
             before(grammarAccess.getConditionsAccess().getCondAssignment_0()); 
            // InternalDatalog.g:694:2: ( rule__Conditions__CondAssignment_0 )
            // InternalDatalog.g:694:3: rule__Conditions__CondAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Conditions__CondAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionsAccess().getCondAssignment_0()); 

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
    // InternalDatalog.g:702:1: rule__Conditions__Group__1 : rule__Conditions__Group__1__Impl rule__Conditions__Group__2 ;
    public final void rule__Conditions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:706:1: ( rule__Conditions__Group__1__Impl rule__Conditions__Group__2 )
            // InternalDatalog.g:707:2: rule__Conditions__Group__1__Impl rule__Conditions__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Conditions__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditions__Group__2();

            state._fsp--;


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
    // InternalDatalog.g:714:1: rule__Conditions__Group__1__Impl : ( ( rule__Conditions__SignAssignment_1 ) ) ;
    public final void rule__Conditions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:718:1: ( ( ( rule__Conditions__SignAssignment_1 ) ) )
            // InternalDatalog.g:719:1: ( ( rule__Conditions__SignAssignment_1 ) )
            {
            // InternalDatalog.g:719:1: ( ( rule__Conditions__SignAssignment_1 ) )
            // InternalDatalog.g:720:2: ( rule__Conditions__SignAssignment_1 )
            {
             before(grammarAccess.getConditionsAccess().getSignAssignment_1()); 
            // InternalDatalog.g:721:2: ( rule__Conditions__SignAssignment_1 )
            // InternalDatalog.g:721:3: rule__Conditions__SignAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Conditions__SignAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionsAccess().getSignAssignment_1()); 

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
    // InternalDatalog.g:729:1: rule__Conditions__Group__2 : rule__Conditions__Group__2__Impl rule__Conditions__Group__3 ;
    public final void rule__Conditions__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:733:1: ( rule__Conditions__Group__2__Impl rule__Conditions__Group__3 )
            // InternalDatalog.g:734:2: rule__Conditions__Group__2__Impl rule__Conditions__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Conditions__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditions__Group__3();

            state._fsp--;


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
    // InternalDatalog.g:741:1: rule__Conditions__Group__2__Impl : ( ( rule__Conditions__RightAssignment_2 ) ) ;
    public final void rule__Conditions__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:745:1: ( ( ( rule__Conditions__RightAssignment_2 ) ) )
            // InternalDatalog.g:746:1: ( ( rule__Conditions__RightAssignment_2 ) )
            {
            // InternalDatalog.g:746:1: ( ( rule__Conditions__RightAssignment_2 ) )
            // InternalDatalog.g:747:2: ( rule__Conditions__RightAssignment_2 )
            {
             before(grammarAccess.getConditionsAccess().getRightAssignment_2()); 
            // InternalDatalog.g:748:2: ( rule__Conditions__RightAssignment_2 )
            // InternalDatalog.g:748:3: rule__Conditions__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Conditions__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionsAccess().getRightAssignment_2()); 

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
    // InternalDatalog.g:756:1: rule__Conditions__Group__3 : rule__Conditions__Group__3__Impl ;
    public final void rule__Conditions__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:760:1: ( rule__Conditions__Group__3__Impl )
            // InternalDatalog.g:761:2: rule__Conditions__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conditions__Group__3__Impl();

            state._fsp--;


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
    // InternalDatalog.g:767:1: rule__Conditions__Group__3__Impl : ( ( rule__Conditions__DotAssignment_3 ) ) ;
    public final void rule__Conditions__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:771:1: ( ( ( rule__Conditions__DotAssignment_3 ) ) )
            // InternalDatalog.g:772:1: ( ( rule__Conditions__DotAssignment_3 ) )
            {
            // InternalDatalog.g:772:1: ( ( rule__Conditions__DotAssignment_3 ) )
            // InternalDatalog.g:773:2: ( rule__Conditions__DotAssignment_3 )
            {
             before(grammarAccess.getConditionsAccess().getDotAssignment_3()); 
            // InternalDatalog.g:774:2: ( rule__Conditions__DotAssignment_3 )
            // InternalDatalog.g:774:3: rule__Conditions__DotAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Conditions__DotAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionsAccess().getDotAssignment_3()); 

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
    // InternalDatalog.g:783:1: rule__Assertion__Group__0 : rule__Assertion__Group__0__Impl rule__Assertion__Group__1 ;
    public final void rule__Assertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:787:1: ( rule__Assertion__Group__0__Impl rule__Assertion__Group__1 )
            // InternalDatalog.g:788:2: rule__Assertion__Group__0__Impl rule__Assertion__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Assertion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group__1();

            state._fsp--;


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
    // InternalDatalog.g:795:1: rule__Assertion__Group__0__Impl : ( ( rule__Assertion__TruthAssignment_0 ) ) ;
    public final void rule__Assertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:799:1: ( ( ( rule__Assertion__TruthAssignment_0 ) ) )
            // InternalDatalog.g:800:1: ( ( rule__Assertion__TruthAssignment_0 ) )
            {
            // InternalDatalog.g:800:1: ( ( rule__Assertion__TruthAssignment_0 ) )
            // InternalDatalog.g:801:2: ( rule__Assertion__TruthAssignment_0 )
            {
             before(grammarAccess.getAssertionAccess().getTruthAssignment_0()); 
            // InternalDatalog.g:802:2: ( rule__Assertion__TruthAssignment_0 )
            // InternalDatalog.g:802:3: rule__Assertion__TruthAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__TruthAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssertionAccess().getTruthAssignment_0()); 

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
    // InternalDatalog.g:810:1: rule__Assertion__Group__1 : rule__Assertion__Group__1__Impl ;
    public final void rule__Assertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:814:1: ( rule__Assertion__Group__1__Impl )
            // InternalDatalog.g:815:2: rule__Assertion__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__Group__1__Impl();

            state._fsp--;


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
    // InternalDatalog.g:821:1: rule__Assertion__Group__1__Impl : ( ( rule__Assertion__DotAssignment_1 ) ) ;
    public final void rule__Assertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:825:1: ( ( ( rule__Assertion__DotAssignment_1 ) ) )
            // InternalDatalog.g:826:1: ( ( rule__Assertion__DotAssignment_1 ) )
            {
            // InternalDatalog.g:826:1: ( ( rule__Assertion__DotAssignment_1 ) )
            // InternalDatalog.g:827:2: ( rule__Assertion__DotAssignment_1 )
            {
             before(grammarAccess.getAssertionAccess().getDotAssignment_1()); 
            // InternalDatalog.g:828:2: ( rule__Assertion__DotAssignment_1 )
            // InternalDatalog.g:828:3: rule__Assertion__DotAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__DotAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssertionAccess().getDotAssignment_1()); 

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


    // $ANTLR start "rule__AssertionMinus__Group__0"
    // InternalDatalog.g:837:1: rule__AssertionMinus__Group__0 : rule__AssertionMinus__Group__0__Impl rule__AssertionMinus__Group__1 ;
    public final void rule__AssertionMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:841:1: ( rule__AssertionMinus__Group__0__Impl rule__AssertionMinus__Group__1 )
            // InternalDatalog.g:842:2: rule__AssertionMinus__Group__0__Impl rule__AssertionMinus__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AssertionMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssertionMinus__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__AssertionMinus__Group__0"


    // $ANTLR start "rule__AssertionMinus__Group__0__Impl"
    // InternalDatalog.g:849:1: rule__AssertionMinus__Group__0__Impl : ( ( rule__AssertionMinus__CheckAssignment_0 ) ) ;
    public final void rule__AssertionMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:853:1: ( ( ( rule__AssertionMinus__CheckAssignment_0 ) ) )
            // InternalDatalog.g:854:1: ( ( rule__AssertionMinus__CheckAssignment_0 ) )
            {
            // InternalDatalog.g:854:1: ( ( rule__AssertionMinus__CheckAssignment_0 ) )
            // InternalDatalog.g:855:2: ( rule__AssertionMinus__CheckAssignment_0 )
            {
             before(grammarAccess.getAssertionMinusAccess().getCheckAssignment_0()); 
            // InternalDatalog.g:856:2: ( rule__AssertionMinus__CheckAssignment_0 )
            // InternalDatalog.g:856:3: rule__AssertionMinus__CheckAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AssertionMinus__CheckAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssertionMinusAccess().getCheckAssignment_0()); 

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
    // $ANTLR end "rule__AssertionMinus__Group__0__Impl"


    // $ANTLR start "rule__AssertionMinus__Group__1"
    // InternalDatalog.g:864:1: rule__AssertionMinus__Group__1 : rule__AssertionMinus__Group__1__Impl ;
    public final void rule__AssertionMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:868:1: ( rule__AssertionMinus__Group__1__Impl )
            // InternalDatalog.g:869:2: rule__AssertionMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssertionMinus__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__AssertionMinus__Group__1"


    // $ANTLR start "rule__AssertionMinus__Group__1__Impl"
    // InternalDatalog.g:875:1: rule__AssertionMinus__Group__1__Impl : ( ( rule__AssertionMinus__DotAssignment_1 ) ) ;
    public final void rule__AssertionMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:879:1: ( ( ( rule__AssertionMinus__DotAssignment_1 ) ) )
            // InternalDatalog.g:880:1: ( ( rule__AssertionMinus__DotAssignment_1 ) )
            {
            // InternalDatalog.g:880:1: ( ( rule__AssertionMinus__DotAssignment_1 ) )
            // InternalDatalog.g:881:2: ( rule__AssertionMinus__DotAssignment_1 )
            {
             before(grammarAccess.getAssertionMinusAccess().getDotAssignment_1()); 
            // InternalDatalog.g:882:2: ( rule__AssertionMinus__DotAssignment_1 )
            // InternalDatalog.g:882:3: rule__AssertionMinus__DotAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AssertionMinus__DotAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssertionMinusAccess().getDotAssignment_1()); 

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
    // $ANTLR end "rule__AssertionMinus__Group__1__Impl"


    // $ANTLR start "rule__FormulaC__Group__0"
    // InternalDatalog.g:891:1: rule__FormulaC__Group__0 : rule__FormulaC__Group__0__Impl rule__FormulaC__Group__1 ;
    public final void rule__FormulaC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:895:1: ( rule__FormulaC__Group__0__Impl rule__FormulaC__Group__1 )
            // InternalDatalog.g:896:2: rule__FormulaC__Group__0__Impl rule__FormulaC__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__FormulaC__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormulaC__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__FormulaC__Group__0"


    // $ANTLR start "rule__FormulaC__Group__0__Impl"
    // InternalDatalog.g:903:1: rule__FormulaC__Group__0__Impl : ( ( rule__FormulaC__FirstAssignment_0 ) ) ;
    public final void rule__FormulaC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:907:1: ( ( ( rule__FormulaC__FirstAssignment_0 ) ) )
            // InternalDatalog.g:908:1: ( ( rule__FormulaC__FirstAssignment_0 ) )
            {
            // InternalDatalog.g:908:1: ( ( rule__FormulaC__FirstAssignment_0 ) )
            // InternalDatalog.g:909:2: ( rule__FormulaC__FirstAssignment_0 )
            {
             before(grammarAccess.getFormulaCAccess().getFirstAssignment_0()); 
            // InternalDatalog.g:910:2: ( rule__FormulaC__FirstAssignment_0 )
            // InternalDatalog.g:910:3: rule__FormulaC__FirstAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FormulaC__FirstAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFormulaCAccess().getFirstAssignment_0()); 

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
    // $ANTLR end "rule__FormulaC__Group__0__Impl"


    // $ANTLR start "rule__FormulaC__Group__1"
    // InternalDatalog.g:918:1: rule__FormulaC__Group__1 : rule__FormulaC__Group__1__Impl ;
    public final void rule__FormulaC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:922:1: ( rule__FormulaC__Group__1__Impl )
            // InternalDatalog.g:923:2: rule__FormulaC__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormulaC__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__FormulaC__Group__1"


    // $ANTLR start "rule__FormulaC__Group__1__Impl"
    // InternalDatalog.g:929:1: rule__FormulaC__Group__1__Impl : ( ( rule__FormulaC__Group_1__0 )* ) ;
    public final void rule__FormulaC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:933:1: ( ( ( rule__FormulaC__Group_1__0 )* ) )
            // InternalDatalog.g:934:1: ( ( rule__FormulaC__Group_1__0 )* )
            {
            // InternalDatalog.g:934:1: ( ( rule__FormulaC__Group_1__0 )* )
            // InternalDatalog.g:935:2: ( rule__FormulaC__Group_1__0 )*
            {
             before(grammarAccess.getFormulaCAccess().getGroup_1()); 
            // InternalDatalog.g:936:2: ( rule__FormulaC__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDatalog.g:936:3: rule__FormulaC__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__FormulaC__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getFormulaCAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FormulaC__Group__1__Impl"


    // $ANTLR start "rule__FormulaC__Group_1__0"
    // InternalDatalog.g:945:1: rule__FormulaC__Group_1__0 : rule__FormulaC__Group_1__0__Impl rule__FormulaC__Group_1__1 ;
    public final void rule__FormulaC__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:949:1: ( rule__FormulaC__Group_1__0__Impl rule__FormulaC__Group_1__1 )
            // InternalDatalog.g:950:2: rule__FormulaC__Group_1__0__Impl rule__FormulaC__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__FormulaC__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormulaC__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__FormulaC__Group_1__0"


    // $ANTLR start "rule__FormulaC__Group_1__0__Impl"
    // InternalDatalog.g:957:1: rule__FormulaC__Group_1__0__Impl : ( () ) ;
    public final void rule__FormulaC__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:961:1: ( ( () ) )
            // InternalDatalog.g:962:1: ( () )
            {
            // InternalDatalog.g:962:1: ( () )
            // InternalDatalog.g:963:2: ()
            {
             before(grammarAccess.getFormulaCAccess().getFormulaLeftAction_1_0()); 
            // InternalDatalog.g:964:2: ()
            // InternalDatalog.g:964:3: 
            {
            }

             after(grammarAccess.getFormulaCAccess().getFormulaLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormulaC__Group_1__0__Impl"


    // $ANTLR start "rule__FormulaC__Group_1__1"
    // InternalDatalog.g:972:1: rule__FormulaC__Group_1__1 : rule__FormulaC__Group_1__1__Impl rule__FormulaC__Group_1__2 ;
    public final void rule__FormulaC__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:976:1: ( rule__FormulaC__Group_1__1__Impl rule__FormulaC__Group_1__2 )
            // InternalDatalog.g:977:2: rule__FormulaC__Group_1__1__Impl rule__FormulaC__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__FormulaC__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormulaC__Group_1__2();

            state._fsp--;


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
    // $ANTLR end "rule__FormulaC__Group_1__1"


    // $ANTLR start "rule__FormulaC__Group_1__1__Impl"
    // InternalDatalog.g:984:1: rule__FormulaC__Group_1__1__Impl : ( ( rule__FormulaC__CommaAssignment_1_1 ) ) ;
    public final void rule__FormulaC__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:988:1: ( ( ( rule__FormulaC__CommaAssignment_1_1 ) ) )
            // InternalDatalog.g:989:1: ( ( rule__FormulaC__CommaAssignment_1_1 ) )
            {
            // InternalDatalog.g:989:1: ( ( rule__FormulaC__CommaAssignment_1_1 ) )
            // InternalDatalog.g:990:2: ( rule__FormulaC__CommaAssignment_1_1 )
            {
             before(grammarAccess.getFormulaCAccess().getCommaAssignment_1_1()); 
            // InternalDatalog.g:991:2: ( rule__FormulaC__CommaAssignment_1_1 )
            // InternalDatalog.g:991:3: rule__FormulaC__CommaAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FormulaC__CommaAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFormulaCAccess().getCommaAssignment_1_1()); 

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
    // $ANTLR end "rule__FormulaC__Group_1__1__Impl"


    // $ANTLR start "rule__FormulaC__Group_1__2"
    // InternalDatalog.g:999:1: rule__FormulaC__Group_1__2 : rule__FormulaC__Group_1__2__Impl ;
    public final void rule__FormulaC__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1003:1: ( rule__FormulaC__Group_1__2__Impl )
            // InternalDatalog.g:1004:2: rule__FormulaC__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormulaC__Group_1__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__FormulaC__Group_1__2"


    // $ANTLR start "rule__FormulaC__Group_1__2__Impl"
    // InternalDatalog.g:1010:1: rule__FormulaC__Group_1__2__Impl : ( ( rule__FormulaC__RightAssignment_1_2 ) ) ;
    public final void rule__FormulaC__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1014:1: ( ( ( rule__FormulaC__RightAssignment_1_2 ) ) )
            // InternalDatalog.g:1015:1: ( ( rule__FormulaC__RightAssignment_1_2 ) )
            {
            // InternalDatalog.g:1015:1: ( ( rule__FormulaC__RightAssignment_1_2 ) )
            // InternalDatalog.g:1016:2: ( rule__FormulaC__RightAssignment_1_2 )
            {
             before(grammarAccess.getFormulaCAccess().getRightAssignment_1_2()); 
            // InternalDatalog.g:1017:2: ( rule__FormulaC__RightAssignment_1_2 )
            // InternalDatalog.g:1017:3: rule__FormulaC__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__FormulaC__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFormulaCAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__FormulaC__Group_1__2__Impl"


    // $ANTLR start "rule__Atom__Group__0"
    // InternalDatalog.g:1026:1: rule__Atom__Group__0 : rule__Atom__Group__0__Impl rule__Atom__Group__1 ;
    public final void rule__Atom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1030:1: ( rule__Atom__Group__0__Impl rule__Atom__Group__1 )
            // InternalDatalog.g:1031:2: rule__Atom__Group__0__Impl rule__Atom__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Atom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atom__Group__1();

            state._fsp--;


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
    // InternalDatalog.g:1038:1: rule__Atom__Group__0__Impl : ( ( rule__Atom__NameAssignment_0 ) ) ;
    public final void rule__Atom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1042:1: ( ( ( rule__Atom__NameAssignment_0 ) ) )
            // InternalDatalog.g:1043:1: ( ( rule__Atom__NameAssignment_0 ) )
            {
            // InternalDatalog.g:1043:1: ( ( rule__Atom__NameAssignment_0 ) )
            // InternalDatalog.g:1044:2: ( rule__Atom__NameAssignment_0 )
            {
             before(grammarAccess.getAtomAccess().getNameAssignment_0()); 
            // InternalDatalog.g:1045:2: ( rule__Atom__NameAssignment_0 )
            // InternalDatalog.g:1045:3: rule__Atom__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Atom__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getNameAssignment_0()); 

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
    // InternalDatalog.g:1053:1: rule__Atom__Group__1 : rule__Atom__Group__1__Impl rule__Atom__Group__2 ;
    public final void rule__Atom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1057:1: ( rule__Atom__Group__1__Impl rule__Atom__Group__2 )
            // InternalDatalog.g:1058:2: rule__Atom__Group__1__Impl rule__Atom__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Atom__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atom__Group__2();

            state._fsp--;


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
    // InternalDatalog.g:1065:1: rule__Atom__Group__1__Impl : ( ( rule__Atom__LpAssignment_1 ) ) ;
    public final void rule__Atom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1069:1: ( ( ( rule__Atom__LpAssignment_1 ) ) )
            // InternalDatalog.g:1070:1: ( ( rule__Atom__LpAssignment_1 ) )
            {
            // InternalDatalog.g:1070:1: ( ( rule__Atom__LpAssignment_1 ) )
            // InternalDatalog.g:1071:2: ( rule__Atom__LpAssignment_1 )
            {
             before(grammarAccess.getAtomAccess().getLpAssignment_1()); 
            // InternalDatalog.g:1072:2: ( rule__Atom__LpAssignment_1 )
            // InternalDatalog.g:1072:3: rule__Atom__LpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Atom__LpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getLpAssignment_1()); 

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
    // InternalDatalog.g:1080:1: rule__Atom__Group__2 : rule__Atom__Group__2__Impl rule__Atom__Group__3 ;
    public final void rule__Atom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1084:1: ( rule__Atom__Group__2__Impl rule__Atom__Group__3 )
            // InternalDatalog.g:1085:2: rule__Atom__Group__2__Impl rule__Atom__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Atom__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atom__Group__3();

            state._fsp--;


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
    // InternalDatalog.g:1092:1: rule__Atom__Group__2__Impl : ( ( rule__Atom__ListAssignment_2 ) ) ;
    public final void rule__Atom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1096:1: ( ( ( rule__Atom__ListAssignment_2 ) ) )
            // InternalDatalog.g:1097:1: ( ( rule__Atom__ListAssignment_2 ) )
            {
            // InternalDatalog.g:1097:1: ( ( rule__Atom__ListAssignment_2 ) )
            // InternalDatalog.g:1098:2: ( rule__Atom__ListAssignment_2 )
            {
             before(grammarAccess.getAtomAccess().getListAssignment_2()); 
            // InternalDatalog.g:1099:2: ( rule__Atom__ListAssignment_2 )
            // InternalDatalog.g:1099:3: rule__Atom__ListAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Atom__ListAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getListAssignment_2()); 

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
    // InternalDatalog.g:1107:1: rule__Atom__Group__3 : rule__Atom__Group__3__Impl ;
    public final void rule__Atom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1111:1: ( rule__Atom__Group__3__Impl )
            // InternalDatalog.g:1112:2: rule__Atom__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atom__Group__3__Impl();

            state._fsp--;


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
    // InternalDatalog.g:1118:1: rule__Atom__Group__3__Impl : ( ( rule__Atom__RpAssignment_3 ) ) ;
    public final void rule__Atom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1122:1: ( ( ( rule__Atom__RpAssignment_3 ) ) )
            // InternalDatalog.g:1123:1: ( ( rule__Atom__RpAssignment_3 ) )
            {
            // InternalDatalog.g:1123:1: ( ( rule__Atom__RpAssignment_3 ) )
            // InternalDatalog.g:1124:2: ( rule__Atom__RpAssignment_3 )
            {
             before(grammarAccess.getAtomAccess().getRpAssignment_3()); 
            // InternalDatalog.g:1125:2: ( rule__Atom__RpAssignment_3 )
            // InternalDatalog.g:1125:3: rule__Atom__RpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Atom__RpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getRpAssignment_3()); 

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


    // $ANTLR start "rule__AtomC__Group__0"
    // InternalDatalog.g:1134:1: rule__AtomC__Group__0 : rule__AtomC__Group__0__Impl rule__AtomC__Group__1 ;
    public final void rule__AtomC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1138:1: ( rule__AtomC__Group__0__Impl rule__AtomC__Group__1 )
            // InternalDatalog.g:1139:2: rule__AtomC__Group__0__Impl rule__AtomC__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__AtomC__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomC__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__AtomC__Group__0"


    // $ANTLR start "rule__AtomC__Group__0__Impl"
    // InternalDatalog.g:1146:1: rule__AtomC__Group__0__Impl : ( ( rule__AtomC__NameAssignment_0 ) ) ;
    public final void rule__AtomC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1150:1: ( ( ( rule__AtomC__NameAssignment_0 ) ) )
            // InternalDatalog.g:1151:1: ( ( rule__AtomC__NameAssignment_0 ) )
            {
            // InternalDatalog.g:1151:1: ( ( rule__AtomC__NameAssignment_0 ) )
            // InternalDatalog.g:1152:2: ( rule__AtomC__NameAssignment_0 )
            {
             before(grammarAccess.getAtomCAccess().getNameAssignment_0()); 
            // InternalDatalog.g:1153:2: ( rule__AtomC__NameAssignment_0 )
            // InternalDatalog.g:1153:3: rule__AtomC__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AtomC__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomCAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__AtomC__Group__0__Impl"


    // $ANTLR start "rule__AtomC__Group__1"
    // InternalDatalog.g:1161:1: rule__AtomC__Group__1 : rule__AtomC__Group__1__Impl rule__AtomC__Group__2 ;
    public final void rule__AtomC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1165:1: ( rule__AtomC__Group__1__Impl rule__AtomC__Group__2 )
            // InternalDatalog.g:1166:2: rule__AtomC__Group__1__Impl rule__AtomC__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__AtomC__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomC__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__AtomC__Group__1"


    // $ANTLR start "rule__AtomC__Group__1__Impl"
    // InternalDatalog.g:1173:1: rule__AtomC__Group__1__Impl : ( ( rule__AtomC__LpAssignment_1 ) ) ;
    public final void rule__AtomC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1177:1: ( ( ( rule__AtomC__LpAssignment_1 ) ) )
            // InternalDatalog.g:1178:1: ( ( rule__AtomC__LpAssignment_1 ) )
            {
            // InternalDatalog.g:1178:1: ( ( rule__AtomC__LpAssignment_1 ) )
            // InternalDatalog.g:1179:2: ( rule__AtomC__LpAssignment_1 )
            {
             before(grammarAccess.getAtomCAccess().getLpAssignment_1()); 
            // InternalDatalog.g:1180:2: ( rule__AtomC__LpAssignment_1 )
            // InternalDatalog.g:1180:3: rule__AtomC__LpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomC__LpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomCAccess().getLpAssignment_1()); 

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
    // $ANTLR end "rule__AtomC__Group__1__Impl"


    // $ANTLR start "rule__AtomC__Group__2"
    // InternalDatalog.g:1188:1: rule__AtomC__Group__2 : rule__AtomC__Group__2__Impl rule__AtomC__Group__3 ;
    public final void rule__AtomC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1192:1: ( rule__AtomC__Group__2__Impl rule__AtomC__Group__3 )
            // InternalDatalog.g:1193:2: rule__AtomC__Group__2__Impl rule__AtomC__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__AtomC__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomC__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__AtomC__Group__2"


    // $ANTLR start "rule__AtomC__Group__2__Impl"
    // InternalDatalog.g:1200:1: rule__AtomC__Group__2__Impl : ( ( rule__AtomC__ListAssignment_2 ) ) ;
    public final void rule__AtomC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1204:1: ( ( ( rule__AtomC__ListAssignment_2 ) ) )
            // InternalDatalog.g:1205:1: ( ( rule__AtomC__ListAssignment_2 ) )
            {
            // InternalDatalog.g:1205:1: ( ( rule__AtomC__ListAssignment_2 ) )
            // InternalDatalog.g:1206:2: ( rule__AtomC__ListAssignment_2 )
            {
             before(grammarAccess.getAtomCAccess().getListAssignment_2()); 
            // InternalDatalog.g:1207:2: ( rule__AtomC__ListAssignment_2 )
            // InternalDatalog.g:1207:3: rule__AtomC__ListAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AtomC__ListAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAtomCAccess().getListAssignment_2()); 

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
    // $ANTLR end "rule__AtomC__Group__2__Impl"


    // $ANTLR start "rule__AtomC__Group__3"
    // InternalDatalog.g:1215:1: rule__AtomC__Group__3 : rule__AtomC__Group__3__Impl ;
    public final void rule__AtomC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1219:1: ( rule__AtomC__Group__3__Impl )
            // InternalDatalog.g:1220:2: rule__AtomC__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomC__Group__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__AtomC__Group__3"


    // $ANTLR start "rule__AtomC__Group__3__Impl"
    // InternalDatalog.g:1226:1: rule__AtomC__Group__3__Impl : ( ( rule__AtomC__RpAssignment_3 ) ) ;
    public final void rule__AtomC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1230:1: ( ( ( rule__AtomC__RpAssignment_3 ) ) )
            // InternalDatalog.g:1231:1: ( ( rule__AtomC__RpAssignment_3 ) )
            {
            // InternalDatalog.g:1231:1: ( ( rule__AtomC__RpAssignment_3 ) )
            // InternalDatalog.g:1232:2: ( rule__AtomC__RpAssignment_3 )
            {
             before(grammarAccess.getAtomCAccess().getRpAssignment_3()); 
            // InternalDatalog.g:1233:2: ( rule__AtomC__RpAssignment_3 )
            // InternalDatalog.g:1233:3: rule__AtomC__RpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AtomC__RpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAtomCAccess().getRpAssignment_3()); 

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
    // $ANTLR end "rule__AtomC__Group__3__Impl"


    // $ANTLR start "rule__ParamList__Group__0"
    // InternalDatalog.g:1242:1: rule__ParamList__Group__0 : rule__ParamList__Group__0__Impl rule__ParamList__Group__1 ;
    public final void rule__ParamList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1246:1: ( rule__ParamList__Group__0__Impl rule__ParamList__Group__1 )
            // InternalDatalog.g:1247:2: rule__ParamList__Group__0__Impl rule__ParamList__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ParamList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamList__Group__1();

            state._fsp--;


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
    // InternalDatalog.g:1254:1: rule__ParamList__Group__0__Impl : ( ( rule__ParamList__LeftAssignment_0 ) ) ;
    public final void rule__ParamList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1258:1: ( ( ( rule__ParamList__LeftAssignment_0 ) ) )
            // InternalDatalog.g:1259:1: ( ( rule__ParamList__LeftAssignment_0 ) )
            {
            // InternalDatalog.g:1259:1: ( ( rule__ParamList__LeftAssignment_0 ) )
            // InternalDatalog.g:1260:2: ( rule__ParamList__LeftAssignment_0 )
            {
             before(grammarAccess.getParamListAccess().getLeftAssignment_0()); 
            // InternalDatalog.g:1261:2: ( rule__ParamList__LeftAssignment_0 )
            // InternalDatalog.g:1261:3: rule__ParamList__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ParamList__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParamListAccess().getLeftAssignment_0()); 

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
    // InternalDatalog.g:1269:1: rule__ParamList__Group__1 : rule__ParamList__Group__1__Impl ;
    public final void rule__ParamList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1273:1: ( rule__ParamList__Group__1__Impl )
            // InternalDatalog.g:1274:2: rule__ParamList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParamList__Group__1__Impl();

            state._fsp--;


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
    // InternalDatalog.g:1280:1: rule__ParamList__Group__1__Impl : ( ( rule__ParamList__Group_1__0 )* ) ;
    public final void rule__ParamList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1284:1: ( ( ( rule__ParamList__Group_1__0 )* ) )
            // InternalDatalog.g:1285:1: ( ( rule__ParamList__Group_1__0 )* )
            {
            // InternalDatalog.g:1285:1: ( ( rule__ParamList__Group_1__0 )* )
            // InternalDatalog.g:1286:2: ( rule__ParamList__Group_1__0 )*
            {
             before(grammarAccess.getParamListAccess().getGroup_1()); 
            // InternalDatalog.g:1287:2: ( rule__ParamList__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDatalog.g:1287:3: rule__ParamList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ParamList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getParamListAccess().getGroup_1()); 

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
    // InternalDatalog.g:1296:1: rule__ParamList__Group_1__0 : rule__ParamList__Group_1__0__Impl rule__ParamList__Group_1__1 ;
    public final void rule__ParamList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1300:1: ( rule__ParamList__Group_1__0__Impl rule__ParamList__Group_1__1 )
            // InternalDatalog.g:1301:2: rule__ParamList__Group_1__0__Impl rule__ParamList__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__ParamList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamList__Group_1__1();

            state._fsp--;


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
    // InternalDatalog.g:1308:1: rule__ParamList__Group_1__0__Impl : ( () ) ;
    public final void rule__ParamList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1312:1: ( ( () ) )
            // InternalDatalog.g:1313:1: ( () )
            {
            // InternalDatalog.g:1313:1: ( () )
            // InternalDatalog.g:1314:2: ()
            {
             before(grammarAccess.getParamListAccess().getParamListLeftAction_1_0()); 
            // InternalDatalog.g:1315:2: ()
            // InternalDatalog.g:1315:3: 
            {
            }

             after(grammarAccess.getParamListAccess().getParamListLeftAction_1_0()); 

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
    // InternalDatalog.g:1323:1: rule__ParamList__Group_1__1 : rule__ParamList__Group_1__1__Impl rule__ParamList__Group_1__2 ;
    public final void rule__ParamList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1327:1: ( rule__ParamList__Group_1__1__Impl rule__ParamList__Group_1__2 )
            // InternalDatalog.g:1328:2: rule__ParamList__Group_1__1__Impl rule__ParamList__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__ParamList__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamList__Group_1__2();

            state._fsp--;


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
    // InternalDatalog.g:1335:1: rule__ParamList__Group_1__1__Impl : ( ( rule__ParamList__CommaAssignment_1_1 ) ) ;
    public final void rule__ParamList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1339:1: ( ( ( rule__ParamList__CommaAssignment_1_1 ) ) )
            // InternalDatalog.g:1340:1: ( ( rule__ParamList__CommaAssignment_1_1 ) )
            {
            // InternalDatalog.g:1340:1: ( ( rule__ParamList__CommaAssignment_1_1 ) )
            // InternalDatalog.g:1341:2: ( rule__ParamList__CommaAssignment_1_1 )
            {
             before(grammarAccess.getParamListAccess().getCommaAssignment_1_1()); 
            // InternalDatalog.g:1342:2: ( rule__ParamList__CommaAssignment_1_1 )
            // InternalDatalog.g:1342:3: rule__ParamList__CommaAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ParamList__CommaAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getParamListAccess().getCommaAssignment_1_1()); 

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
    // InternalDatalog.g:1350:1: rule__ParamList__Group_1__2 : rule__ParamList__Group_1__2__Impl ;
    public final void rule__ParamList__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1354:1: ( rule__ParamList__Group_1__2__Impl )
            // InternalDatalog.g:1355:2: rule__ParamList__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParamList__Group_1__2__Impl();

            state._fsp--;


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
    // InternalDatalog.g:1361:1: rule__ParamList__Group_1__2__Impl : ( ( rule__ParamList__RightAssignment_1_2 ) ) ;
    public final void rule__ParamList__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1365:1: ( ( ( rule__ParamList__RightAssignment_1_2 ) ) )
            // InternalDatalog.g:1366:1: ( ( rule__ParamList__RightAssignment_1_2 ) )
            {
            // InternalDatalog.g:1366:1: ( ( rule__ParamList__RightAssignment_1_2 ) )
            // InternalDatalog.g:1367:2: ( rule__ParamList__RightAssignment_1_2 )
            {
             before(grammarAccess.getParamListAccess().getRightAssignment_1_2()); 
            // InternalDatalog.g:1368:2: ( rule__ParamList__RightAssignment_1_2 )
            // InternalDatalog.g:1368:3: rule__ParamList__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ParamList__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getParamListAccess().getRightAssignment_1_2()); 

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
    // InternalDatalog.g:1377:1: rule__Model__ProgramAssignment : ( ruleStmtPlusMinus ) ;
    public final void rule__Model__ProgramAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1381:1: ( ( ruleStmtPlusMinus ) )
            // InternalDatalog.g:1382:2: ( ruleStmtPlusMinus )
            {
            // InternalDatalog.g:1382:2: ( ruleStmtPlusMinus )
            // InternalDatalog.g:1383:3: ruleStmtPlusMinus
            {
             before(grammarAccess.getModelAccess().getProgramStmtPlusMinusParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStmtPlusMinus();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProgramStmtPlusMinusParserRuleCall_0()); 

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


    // $ANTLR start "rule__StmtPlusMinus__LeftAssignment_0"
    // InternalDatalog.g:1392:1: rule__StmtPlusMinus__LeftAssignment_0 : ( ruleStmtPlus ) ;
    public final void rule__StmtPlusMinus__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1396:1: ( ( ruleStmtPlus ) )
            // InternalDatalog.g:1397:2: ( ruleStmtPlus )
            {
            // InternalDatalog.g:1397:2: ( ruleStmtPlus )
            // InternalDatalog.g:1398:3: ruleStmtPlus
            {
             before(grammarAccess.getStmtPlusMinusAccess().getLeftStmtPlusParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStmtPlus();

            state._fsp--;

             after(grammarAccess.getStmtPlusMinusAccess().getLeftStmtPlusParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__StmtPlusMinus__LeftAssignment_0"


    // $ANTLR start "rule__StmtPlusMinus__RightAssignment_1"
    // InternalDatalog.g:1407:1: rule__StmtPlusMinus__RightAssignment_1 : ( ruleStmtMinus ) ;
    public final void rule__StmtPlusMinus__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1411:1: ( ( ruleStmtMinus ) )
            // InternalDatalog.g:1412:2: ( ruleStmtMinus )
            {
            // InternalDatalog.g:1412:2: ( ruleStmtMinus )
            // InternalDatalog.g:1413:3: ruleStmtMinus
            {
             before(grammarAccess.getStmtPlusMinusAccess().getRightStmtMinusParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStmtMinus();

            state._fsp--;

             after(grammarAccess.getStmtPlusMinusAccess().getRightStmtMinusParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__StmtPlusMinus__RightAssignment_1"


    // $ANTLR start "rule__StmtPlus__PlusAssignment_0"
    // InternalDatalog.g:1422:1: rule__StmtPlus__PlusAssignment_0 : ( ( '+' ) ) ;
    public final void rule__StmtPlus__PlusAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1426:1: ( ( ( '+' ) ) )
            // InternalDatalog.g:1427:2: ( ( '+' ) )
            {
            // InternalDatalog.g:1427:2: ( ( '+' ) )
            // InternalDatalog.g:1428:3: ( '+' )
            {
             before(grammarAccess.getStmtPlusAccess().getPlusPlusSignKeyword_0_0()); 
            // InternalDatalog.g:1429:3: ( '+' )
            // InternalDatalog.g:1430:4: '+'
            {
             before(grammarAccess.getStmtPlusAccess().getPlusPlusSignKeyword_0_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getStmtPlusAccess().getPlusPlusSignKeyword_0_0()); 

            }

             after(grammarAccess.getStmtPlusAccess().getPlusPlusSignKeyword_0_0()); 

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
    // $ANTLR end "rule__StmtPlus__PlusAssignment_0"


    // $ANTLR start "rule__StmtPlus__RightPlusAssignment_1_1"
    // InternalDatalog.g:1441:1: rule__StmtPlus__RightPlusAssignment_1_1 : ( ruleStatements ) ;
    public final void rule__StmtPlus__RightPlusAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1445:1: ( ( ruleStatements ) )
            // InternalDatalog.g:1446:2: ( ruleStatements )
            {
            // InternalDatalog.g:1446:2: ( ruleStatements )
            // InternalDatalog.g:1447:3: ruleStatements
            {
             before(grammarAccess.getStmtPlusAccess().getRightPlusStatementsParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatements();

            state._fsp--;

             after(grammarAccess.getStmtPlusAccess().getRightPlusStatementsParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__StmtPlus__RightPlusAssignment_1_1"


    // $ANTLR start "rule__StmtMinus__MinusAssignment_0"
    // InternalDatalog.g:1456:1: rule__StmtMinus__MinusAssignment_0 : ( ( '-' ) ) ;
    public final void rule__StmtMinus__MinusAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1460:1: ( ( ( '-' ) ) )
            // InternalDatalog.g:1461:2: ( ( '-' ) )
            {
            // InternalDatalog.g:1461:2: ( ( '-' ) )
            // InternalDatalog.g:1462:3: ( '-' )
            {
             before(grammarAccess.getStmtMinusAccess().getMinusHyphenMinusKeyword_0_0()); 
            // InternalDatalog.g:1463:3: ( '-' )
            // InternalDatalog.g:1464:4: '-'
            {
             before(grammarAccess.getStmtMinusAccess().getMinusHyphenMinusKeyword_0_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStmtMinusAccess().getMinusHyphenMinusKeyword_0_0()); 

            }

             after(grammarAccess.getStmtMinusAccess().getMinusHyphenMinusKeyword_0_0()); 

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
    // $ANTLR end "rule__StmtMinus__MinusAssignment_0"


    // $ANTLR start "rule__StmtMinus__RightMinusAssignment_1_1"
    // InternalDatalog.g:1475:1: rule__StmtMinus__RightMinusAssignment_1_1 : ( ruleAssertionMinus ) ;
    public final void rule__StmtMinus__RightMinusAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1479:1: ( ( ruleAssertionMinus ) )
            // InternalDatalog.g:1480:2: ( ruleAssertionMinus )
            {
            // InternalDatalog.g:1480:2: ( ruleAssertionMinus )
            // InternalDatalog.g:1481:3: ruleAssertionMinus
            {
             before(grammarAccess.getStmtMinusAccess().getRightMinusAssertionMinusParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssertionMinus();

            state._fsp--;

             after(grammarAccess.getStmtMinusAccess().getRightMinusAssertionMinusParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__StmtMinus__RightMinusAssignment_1_1"


    // $ANTLR start "rule__Statements__ConditionAssignment_0"
    // InternalDatalog.g:1490:1: rule__Statements__ConditionAssignment_0 : ( ruleConditions ) ;
    public final void rule__Statements__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1494:1: ( ( ruleConditions ) )
            // InternalDatalog.g:1495:2: ( ruleConditions )
            {
            // InternalDatalog.g:1495:2: ( ruleConditions )
            // InternalDatalog.g:1496:3: ruleConditions
            {
             before(grammarAccess.getStatementsAccess().getConditionConditionsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConditions();

            state._fsp--;

             after(grammarAccess.getStatementsAccess().getConditionConditionsParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Statements__ConditionAssignment_0"


    // $ANTLR start "rule__Statements__AssertionAssignment_1"
    // InternalDatalog.g:1505:1: rule__Statements__AssertionAssignment_1 : ( ruleAssertion ) ;
    public final void rule__Statements__AssertionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1509:1: ( ( ruleAssertion ) )
            // InternalDatalog.g:1510:2: ( ruleAssertion )
            {
            // InternalDatalog.g:1510:2: ( ruleAssertion )
            // InternalDatalog.g:1511:3: ruleAssertion
            {
             before(grammarAccess.getStatementsAccess().getAssertionAssertionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssertion();

            state._fsp--;

             after(grammarAccess.getStatementsAccess().getAssertionAssertionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Statements__AssertionAssignment_1"


    // $ANTLR start "rule__Conditions__CondAssignment_0"
    // InternalDatalog.g:1520:1: rule__Conditions__CondAssignment_0 : ( ruleAtom ) ;
    public final void rule__Conditions__CondAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1524:1: ( ( ruleAtom ) )
            // InternalDatalog.g:1525:2: ( ruleAtom )
            {
            // InternalDatalog.g:1525:2: ( ruleAtom )
            // InternalDatalog.g:1526:3: ruleAtom
            {
             before(grammarAccess.getConditionsAccess().getCondAtomParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getConditionsAccess().getCondAtomParserRuleCall_0_0()); 

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


    // $ANTLR start "rule__Conditions__SignAssignment_1"
    // InternalDatalog.g:1535:1: rule__Conditions__SignAssignment_1 : ( ( ':-' ) ) ;
    public final void rule__Conditions__SignAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1539:1: ( ( ( ':-' ) ) )
            // InternalDatalog.g:1540:2: ( ( ':-' ) )
            {
            // InternalDatalog.g:1540:2: ( ( ':-' ) )
            // InternalDatalog.g:1541:3: ( ':-' )
            {
             before(grammarAccess.getConditionsAccess().getSignColonHyphenMinusKeyword_1_0()); 
            // InternalDatalog.g:1542:3: ( ':-' )
            // InternalDatalog.g:1543:4: ':-'
            {
             before(grammarAccess.getConditionsAccess().getSignColonHyphenMinusKeyword_1_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getConditionsAccess().getSignColonHyphenMinusKeyword_1_0()); 

            }

             after(grammarAccess.getConditionsAccess().getSignColonHyphenMinusKeyword_1_0()); 

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
    // $ANTLR end "rule__Conditions__SignAssignment_1"


    // $ANTLR start "rule__Conditions__RightAssignment_2"
    // InternalDatalog.g:1554:1: rule__Conditions__RightAssignment_2 : ( ruleFormulaC ) ;
    public final void rule__Conditions__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1558:1: ( ( ruleFormulaC ) )
            // InternalDatalog.g:1559:2: ( ruleFormulaC )
            {
            // InternalDatalog.g:1559:2: ( ruleFormulaC )
            // InternalDatalog.g:1560:3: ruleFormulaC
            {
             before(grammarAccess.getConditionsAccess().getRightFormulaCParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFormulaC();

            state._fsp--;

             after(grammarAccess.getConditionsAccess().getRightFormulaCParserRuleCall_2_0()); 

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


    // $ANTLR start "rule__Conditions__DotAssignment_3"
    // InternalDatalog.g:1569:1: rule__Conditions__DotAssignment_3 : ( ( '.' ) ) ;
    public final void rule__Conditions__DotAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1573:1: ( ( ( '.' ) ) )
            // InternalDatalog.g:1574:2: ( ( '.' ) )
            {
            // InternalDatalog.g:1574:2: ( ( '.' ) )
            // InternalDatalog.g:1575:3: ( '.' )
            {
             before(grammarAccess.getConditionsAccess().getDotFullStopKeyword_3_0()); 
            // InternalDatalog.g:1576:3: ( '.' )
            // InternalDatalog.g:1577:4: '.'
            {
             before(grammarAccess.getConditionsAccess().getDotFullStopKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConditionsAccess().getDotFullStopKeyword_3_0()); 

            }

             after(grammarAccess.getConditionsAccess().getDotFullStopKeyword_3_0()); 

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
    // $ANTLR end "rule__Conditions__DotAssignment_3"


    // $ANTLR start "rule__Assertion__TruthAssignment_0"
    // InternalDatalog.g:1588:1: rule__Assertion__TruthAssignment_0 : ( ruleAtom ) ;
    public final void rule__Assertion__TruthAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1592:1: ( ( ruleAtom ) )
            // InternalDatalog.g:1593:2: ( ruleAtom )
            {
            // InternalDatalog.g:1593:2: ( ruleAtom )
            // InternalDatalog.g:1594:3: ruleAtom
            {
             before(grammarAccess.getAssertionAccess().getTruthAtomParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getAssertionAccess().getTruthAtomParserRuleCall_0_0()); 

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


    // $ANTLR start "rule__Assertion__DotAssignment_1"
    // InternalDatalog.g:1603:1: rule__Assertion__DotAssignment_1 : ( ( '.' ) ) ;
    public final void rule__Assertion__DotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1607:1: ( ( ( '.' ) ) )
            // InternalDatalog.g:1608:2: ( ( '.' ) )
            {
            // InternalDatalog.g:1608:2: ( ( '.' ) )
            // InternalDatalog.g:1609:3: ( '.' )
            {
             before(grammarAccess.getAssertionAccess().getDotFullStopKeyword_1_0()); 
            // InternalDatalog.g:1610:3: ( '.' )
            // InternalDatalog.g:1611:4: '.'
            {
             before(grammarAccess.getAssertionAccess().getDotFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAssertionAccess().getDotFullStopKeyword_1_0()); 

            }

             after(grammarAccess.getAssertionAccess().getDotFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__Assertion__DotAssignment_1"


    // $ANTLR start "rule__AssertionMinus__CheckAssignment_0"
    // InternalDatalog.g:1622:1: rule__AssertionMinus__CheckAssignment_0 : ( ruleFormulaC ) ;
    public final void rule__AssertionMinus__CheckAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1626:1: ( ( ruleFormulaC ) )
            // InternalDatalog.g:1627:2: ( ruleFormulaC )
            {
            // InternalDatalog.g:1627:2: ( ruleFormulaC )
            // InternalDatalog.g:1628:3: ruleFormulaC
            {
             before(grammarAccess.getAssertionMinusAccess().getCheckFormulaCParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFormulaC();

            state._fsp--;

             after(grammarAccess.getAssertionMinusAccess().getCheckFormulaCParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__AssertionMinus__CheckAssignment_0"


    // $ANTLR start "rule__AssertionMinus__DotAssignment_1"
    // InternalDatalog.g:1637:1: rule__AssertionMinus__DotAssignment_1 : ( ( '.' ) ) ;
    public final void rule__AssertionMinus__DotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1641:1: ( ( ( '.' ) ) )
            // InternalDatalog.g:1642:2: ( ( '.' ) )
            {
            // InternalDatalog.g:1642:2: ( ( '.' ) )
            // InternalDatalog.g:1643:3: ( '.' )
            {
             before(grammarAccess.getAssertionMinusAccess().getDotFullStopKeyword_1_0()); 
            // InternalDatalog.g:1644:3: ( '.' )
            // InternalDatalog.g:1645:4: '.'
            {
             before(grammarAccess.getAssertionMinusAccess().getDotFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAssertionMinusAccess().getDotFullStopKeyword_1_0()); 

            }

             after(grammarAccess.getAssertionMinusAccess().getDotFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__AssertionMinus__DotAssignment_1"


    // $ANTLR start "rule__FormulaC__FirstAssignment_0"
    // InternalDatalog.g:1656:1: rule__FormulaC__FirstAssignment_0 : ( ruleAtomC ) ;
    public final void rule__FormulaC__FirstAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1660:1: ( ( ruleAtomC ) )
            // InternalDatalog.g:1661:2: ( ruleAtomC )
            {
            // InternalDatalog.g:1661:2: ( ruleAtomC )
            // InternalDatalog.g:1662:3: ruleAtomC
            {
             before(grammarAccess.getFormulaCAccess().getFirstAtomCParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAtomC();

            state._fsp--;

             after(grammarAccess.getFormulaCAccess().getFirstAtomCParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__FormulaC__FirstAssignment_0"


    // $ANTLR start "rule__FormulaC__CommaAssignment_1_1"
    // InternalDatalog.g:1671:1: rule__FormulaC__CommaAssignment_1_1 : ( ( ',' ) ) ;
    public final void rule__FormulaC__CommaAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1675:1: ( ( ( ',' ) ) )
            // InternalDatalog.g:1676:2: ( ( ',' ) )
            {
            // InternalDatalog.g:1676:2: ( ( ',' ) )
            // InternalDatalog.g:1677:3: ( ',' )
            {
             before(grammarAccess.getFormulaCAccess().getCommaCommaKeyword_1_1_0()); 
            // InternalDatalog.g:1678:3: ( ',' )
            // InternalDatalog.g:1679:4: ','
            {
             before(grammarAccess.getFormulaCAccess().getCommaCommaKeyword_1_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFormulaCAccess().getCommaCommaKeyword_1_1_0()); 

            }

             after(grammarAccess.getFormulaCAccess().getCommaCommaKeyword_1_1_0()); 

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
    // $ANTLR end "rule__FormulaC__CommaAssignment_1_1"


    // $ANTLR start "rule__FormulaC__RightAssignment_1_2"
    // InternalDatalog.g:1690:1: rule__FormulaC__RightAssignment_1_2 : ( ruleAtomC ) ;
    public final void rule__FormulaC__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1694:1: ( ( ruleAtomC ) )
            // InternalDatalog.g:1695:2: ( ruleAtomC )
            {
            // InternalDatalog.g:1695:2: ( ruleAtomC )
            // InternalDatalog.g:1696:3: ruleAtomC
            {
             before(grammarAccess.getFormulaCAccess().getRightAtomCParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAtomC();

            state._fsp--;

             after(grammarAccess.getFormulaCAccess().getRightAtomCParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__FormulaC__RightAssignment_1_2"


    // $ANTLR start "rule__Atom__NameAssignment_0"
    // InternalDatalog.g:1705:1: rule__Atom__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Atom__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1709:1: ( ( RULE_ID ) )
            // InternalDatalog.g:1710:2: ( RULE_ID )
            {
            // InternalDatalog.g:1710:2: ( RULE_ID )
            // InternalDatalog.g:1711:3: RULE_ID
            {
             before(grammarAccess.getAtomAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomAccess().getNameIDTerminalRuleCall_0_0()); 

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


    // $ANTLR start "rule__Atom__LpAssignment_1"
    // InternalDatalog.g:1720:1: rule__Atom__LpAssignment_1 : ( ( '(' ) ) ;
    public final void rule__Atom__LpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1724:1: ( ( ( '(' ) ) )
            // InternalDatalog.g:1725:2: ( ( '(' ) )
            {
            // InternalDatalog.g:1725:2: ( ( '(' ) )
            // InternalDatalog.g:1726:3: ( '(' )
            {
             before(grammarAccess.getAtomAccess().getLpLeftParenthesisKeyword_1_0()); 
            // InternalDatalog.g:1727:3: ( '(' )
            // InternalDatalog.g:1728:4: '('
            {
             before(grammarAccess.getAtomAccess().getLpLeftParenthesisKeyword_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAtomAccess().getLpLeftParenthesisKeyword_1_0()); 

            }

             after(grammarAccess.getAtomAccess().getLpLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__Atom__LpAssignment_1"


    // $ANTLR start "rule__Atom__ListAssignment_2"
    // InternalDatalog.g:1739:1: rule__Atom__ListAssignment_2 : ( ruleParamList ) ;
    public final void rule__Atom__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1743:1: ( ( ruleParamList ) )
            // InternalDatalog.g:1744:2: ( ruleParamList )
            {
            // InternalDatalog.g:1744:2: ( ruleParamList )
            // InternalDatalog.g:1745:3: ruleParamList
            {
             before(grammarAccess.getAtomAccess().getListParamListParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParamList();

            state._fsp--;

             after(grammarAccess.getAtomAccess().getListParamListParserRuleCall_2_0()); 

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


    // $ANTLR start "rule__Atom__RpAssignment_3"
    // InternalDatalog.g:1754:1: rule__Atom__RpAssignment_3 : ( ( ')' ) ) ;
    public final void rule__Atom__RpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1758:1: ( ( ( ')' ) ) )
            // InternalDatalog.g:1759:2: ( ( ')' ) )
            {
            // InternalDatalog.g:1759:2: ( ( ')' ) )
            // InternalDatalog.g:1760:3: ( ')' )
            {
             before(grammarAccess.getAtomAccess().getRpRightParenthesisKeyword_3_0()); 
            // InternalDatalog.g:1761:3: ( ')' )
            // InternalDatalog.g:1762:4: ')'
            {
             before(grammarAccess.getAtomAccess().getRpRightParenthesisKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAtomAccess().getRpRightParenthesisKeyword_3_0()); 

            }

             after(grammarAccess.getAtomAccess().getRpRightParenthesisKeyword_3_0()); 

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
    // $ANTLR end "rule__Atom__RpAssignment_3"


    // $ANTLR start "rule__AtomC__NameAssignment_0"
    // InternalDatalog.g:1773:1: rule__AtomC__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AtomC__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1777:1: ( ( ( RULE_ID ) ) )
            // InternalDatalog.g:1778:2: ( ( RULE_ID ) )
            {
            // InternalDatalog.g:1778:2: ( ( RULE_ID ) )
            // InternalDatalog.g:1779:3: ( RULE_ID )
            {
             before(grammarAccess.getAtomCAccess().getNameAtomCrossReference_0_0()); 
            // InternalDatalog.g:1780:3: ( RULE_ID )
            // InternalDatalog.g:1781:4: RULE_ID
            {
             before(grammarAccess.getAtomCAccess().getNameAtomIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomCAccess().getNameAtomIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAtomCAccess().getNameAtomCrossReference_0_0()); 

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
    // $ANTLR end "rule__AtomC__NameAssignment_0"


    // $ANTLR start "rule__AtomC__LpAssignment_1"
    // InternalDatalog.g:1792:1: rule__AtomC__LpAssignment_1 : ( ( '(' ) ) ;
    public final void rule__AtomC__LpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1796:1: ( ( ( '(' ) ) )
            // InternalDatalog.g:1797:2: ( ( '(' ) )
            {
            // InternalDatalog.g:1797:2: ( ( '(' ) )
            // InternalDatalog.g:1798:3: ( '(' )
            {
             before(grammarAccess.getAtomCAccess().getLpLeftParenthesisKeyword_1_0()); 
            // InternalDatalog.g:1799:3: ( '(' )
            // InternalDatalog.g:1800:4: '('
            {
             before(grammarAccess.getAtomCAccess().getLpLeftParenthesisKeyword_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAtomCAccess().getLpLeftParenthesisKeyword_1_0()); 

            }

             after(grammarAccess.getAtomCAccess().getLpLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__AtomC__LpAssignment_1"


    // $ANTLR start "rule__AtomC__ListAssignment_2"
    // InternalDatalog.g:1811:1: rule__AtomC__ListAssignment_2 : ( ruleParamList ) ;
    public final void rule__AtomC__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1815:1: ( ( ruleParamList ) )
            // InternalDatalog.g:1816:2: ( ruleParamList )
            {
            // InternalDatalog.g:1816:2: ( ruleParamList )
            // InternalDatalog.g:1817:3: ruleParamList
            {
             before(grammarAccess.getAtomCAccess().getListParamListParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParamList();

            state._fsp--;

             after(grammarAccess.getAtomCAccess().getListParamListParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AtomC__ListAssignment_2"


    // $ANTLR start "rule__AtomC__RpAssignment_3"
    // InternalDatalog.g:1826:1: rule__AtomC__RpAssignment_3 : ( ( ')' ) ) ;
    public final void rule__AtomC__RpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1830:1: ( ( ( ')' ) ) )
            // InternalDatalog.g:1831:2: ( ( ')' ) )
            {
            // InternalDatalog.g:1831:2: ( ( ')' ) )
            // InternalDatalog.g:1832:3: ( ')' )
            {
             before(grammarAccess.getAtomCAccess().getRpRightParenthesisKeyword_3_0()); 
            // InternalDatalog.g:1833:3: ( ')' )
            // InternalDatalog.g:1834:4: ')'
            {
             before(grammarAccess.getAtomCAccess().getRpRightParenthesisKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAtomCAccess().getRpRightParenthesisKeyword_3_0()); 

            }

             after(grammarAccess.getAtomCAccess().getRpRightParenthesisKeyword_3_0()); 

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
    // $ANTLR end "rule__AtomC__RpAssignment_3"


    // $ANTLR start "rule__ParamList__LeftAssignment_0"
    // InternalDatalog.g:1845:1: rule__ParamList__LeftAssignment_0 : ( rulePrimary ) ;
    public final void rule__ParamList__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1849:1: ( ( rulePrimary ) )
            // InternalDatalog.g:1850:2: ( rulePrimary )
            {
            // InternalDatalog.g:1850:2: ( rulePrimary )
            // InternalDatalog.g:1851:3: rulePrimary
            {
             before(grammarAccess.getParamListAccess().getLeftPrimaryParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getParamListAccess().getLeftPrimaryParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ParamList__LeftAssignment_0"


    // $ANTLR start "rule__ParamList__CommaAssignment_1_1"
    // InternalDatalog.g:1860:1: rule__ParamList__CommaAssignment_1_1 : ( ( ',' ) ) ;
    public final void rule__ParamList__CommaAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1864:1: ( ( ( ',' ) ) )
            // InternalDatalog.g:1865:2: ( ( ',' ) )
            {
            // InternalDatalog.g:1865:2: ( ( ',' ) )
            // InternalDatalog.g:1866:3: ( ',' )
            {
             before(grammarAccess.getParamListAccess().getCommaCommaKeyword_1_1_0()); 
            // InternalDatalog.g:1867:3: ( ',' )
            // InternalDatalog.g:1868:4: ','
            {
             before(grammarAccess.getParamListAccess().getCommaCommaKeyword_1_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getParamListAccess().getCommaCommaKeyword_1_1_0()); 

            }

             after(grammarAccess.getParamListAccess().getCommaCommaKeyword_1_1_0()); 

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
    // $ANTLR end "rule__ParamList__CommaAssignment_1_1"


    // $ANTLR start "rule__ParamList__RightAssignment_1_2"
    // InternalDatalog.g:1879:1: rule__ParamList__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__ParamList__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1883:1: ( ( rulePrimary ) )
            // InternalDatalog.g:1884:2: ( rulePrimary )
            {
            // InternalDatalog.g:1884:2: ( rulePrimary )
            // InternalDatalog.g:1885:3: rulePrimary
            {
             before(grammarAccess.getParamListAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getParamListAccess().getRightPrimaryParserRuleCall_1_2_0()); 

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


    // $ANTLR start "rule__Primary__ValueAssignment"
    // InternalDatalog.g:1894:1: rule__Primary__ValueAssignment : ( RULE_ID ) ;
    public final void rule__Primary__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1898:1: ( ( RULE_ID ) )
            // InternalDatalog.g:1899:2: ( RULE_ID )
            {
            // InternalDatalog.g:1899:2: ( RULE_ID )
            // InternalDatalog.g:1900:3: RULE_ID
            {
             before(grammarAccess.getPrimaryAccess().getValueIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getValueIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Primary__ValueAssignment"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\1\4\1\20\1\4\1\17\1\4\1\15\1\17\2\uffff";
    static final String dfa_3s = "\1\4\1\20\1\4\1\21\1\4\1\16\1\21\2\uffff";
    static final String dfa_4s = "\7\uffff\1\1\1\2";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4\1\uffff\1\5",
            "\1\6",
            "\1\7\1\10",
            "\1\4\1\uffff\1\5",
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
            return "377:1: rule__Statements__Alternatives : ( ( ( rule__Statements__ConditionAssignment_0 ) ) | ( ( rule__Statements__AssertionAssignment_1 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});

}