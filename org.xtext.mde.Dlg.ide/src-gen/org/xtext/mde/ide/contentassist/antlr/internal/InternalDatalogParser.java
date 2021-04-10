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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_VARIABLE", "RULE_PREDICATE", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'?'", "'.'", "':-'", "','", "'('", "')'"
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

                if ( (LA1_0==RULE_PREDICATE||(LA1_0>=13 && LA1_0<=14)) ) {
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


    // $ANTLR start "entryRuleStatements"
    // InternalDatalog.g:78:1: entryRuleStatements : ruleStatements EOF ;
    public final void entryRuleStatements() throws RecognitionException {
        try {
            // InternalDatalog.g:79:1: ( ruleStatements EOF )
            // InternalDatalog.g:80:1: ruleStatements EOF
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
    // InternalDatalog.g:87:1: ruleStatements : ( ( rule__Statements__Alternatives ) ) ;
    public final void ruleStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:91:2: ( ( ( rule__Statements__Alternatives ) ) )
            // InternalDatalog.g:92:2: ( ( rule__Statements__Alternatives ) )
            {
            // InternalDatalog.g:92:2: ( ( rule__Statements__Alternatives ) )
            // InternalDatalog.g:93:3: ( rule__Statements__Alternatives )
            {
             before(grammarAccess.getStatementsAccess().getAlternatives()); 
            // InternalDatalog.g:94:3: ( rule__Statements__Alternatives )
            // InternalDatalog.g:94:4: rule__Statements__Alternatives
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


    // $ANTLR start "entryRulePlus"
    // InternalDatalog.g:103:1: entryRulePlus : rulePlus EOF ;
    public final void entryRulePlus() throws RecognitionException {
        try {
            // InternalDatalog.g:104:1: ( rulePlus EOF )
            // InternalDatalog.g:105:1: rulePlus EOF
            {
             before(grammarAccess.getPlusRule()); 
            pushFollow(FOLLOW_1);
            rulePlus();

            state._fsp--;

             after(grammarAccess.getPlusRule()); 
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
    // $ANTLR end "entryRulePlus"


    // $ANTLR start "rulePlus"
    // InternalDatalog.g:112:1: rulePlus : ( '+' ) ;
    public final void rulePlus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:116:2: ( ( '+' ) )
            // InternalDatalog.g:117:2: ( '+' )
            {
            // InternalDatalog.g:117:2: ( '+' )
            // InternalDatalog.g:118:3: '+'
            {
             before(grammarAccess.getPlusAccess().getPlusSignKeyword()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPlusAccess().getPlusSignKeyword()); 

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
    // $ANTLR end "rulePlus"


    // $ANTLR start "entryRuleMinus"
    // InternalDatalog.g:128:1: entryRuleMinus : ruleMinus EOF ;
    public final void entryRuleMinus() throws RecognitionException {
        try {
            // InternalDatalog.g:129:1: ( ruleMinus EOF )
            // InternalDatalog.g:130:1: ruleMinus EOF
            {
             before(grammarAccess.getMinusRule()); 
            pushFollow(FOLLOW_1);
            ruleMinus();

            state._fsp--;

             after(grammarAccess.getMinusRule()); 
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
    // $ANTLR end "entryRuleMinus"


    // $ANTLR start "ruleMinus"
    // InternalDatalog.g:137:1: ruleMinus : ( '-' ) ;
    public final void ruleMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:141:2: ( ( '-' ) )
            // InternalDatalog.g:142:2: ( '-' )
            {
            // InternalDatalog.g:142:2: ( '-' )
            // InternalDatalog.g:143:3: '-'
            {
             before(grammarAccess.getMinusAccess().getHyphenMinusKeyword()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMinusAccess().getHyphenMinusKeyword()); 

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
    // $ANTLR end "ruleMinus"


    // $ANTLR start "entryRuleAsk"
    // InternalDatalog.g:153:1: entryRuleAsk : ruleAsk EOF ;
    public final void entryRuleAsk() throws RecognitionException {
        try {
            // InternalDatalog.g:154:1: ( ruleAsk EOF )
            // InternalDatalog.g:155:1: ruleAsk EOF
            {
             before(grammarAccess.getAskRule()); 
            pushFollow(FOLLOW_1);
            ruleAsk();

            state._fsp--;

             after(grammarAccess.getAskRule()); 
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
    // $ANTLR end "entryRuleAsk"


    // $ANTLR start "ruleAsk"
    // InternalDatalog.g:162:1: ruleAsk : ( ( rule__Ask__Group__0 ) ) ;
    public final void ruleAsk() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:166:2: ( ( ( rule__Ask__Group__0 ) ) )
            // InternalDatalog.g:167:2: ( ( rule__Ask__Group__0 ) )
            {
            // InternalDatalog.g:167:2: ( ( rule__Ask__Group__0 ) )
            // InternalDatalog.g:168:3: ( rule__Ask__Group__0 )
            {
             before(grammarAccess.getAskAccess().getGroup()); 
            // InternalDatalog.g:169:3: ( rule__Ask__Group__0 )
            // InternalDatalog.g:169:4: rule__Ask__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAskAccess().getGroup()); 

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
    // $ANTLR end "ruleAsk"


    // $ANTLR start "entryRuleForm"
    // InternalDatalog.g:178:1: entryRuleForm : ruleForm EOF ;
    public final void entryRuleForm() throws RecognitionException {
        try {
            // InternalDatalog.g:179:1: ( ruleForm EOF )
            // InternalDatalog.g:180:1: ruleForm EOF
            {
             before(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_1);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getFormRule()); 
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
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // InternalDatalog.g:187:1: ruleForm : ( ( rule__Form__Group__0 ) ) ;
    public final void ruleForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:191:2: ( ( ( rule__Form__Group__0 ) ) )
            // InternalDatalog.g:192:2: ( ( rule__Form__Group__0 ) )
            {
            // InternalDatalog.g:192:2: ( ( rule__Form__Group__0 ) )
            // InternalDatalog.g:193:3: ( rule__Form__Group__0 )
            {
             before(grammarAccess.getFormAccess().getGroup()); 
            // InternalDatalog.g:194:3: ( rule__Form__Group__0 )
            // InternalDatalog.g:194:4: rule__Form__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getGroup()); 

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
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleParam"
    // InternalDatalog.g:203:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // InternalDatalog.g:204:1: ( ruleParam EOF )
            // InternalDatalog.g:205:1: ruleParam EOF
            {
             before(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_1);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getParamRule()); 
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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalDatalog.g:212:1: ruleParam : ( ( rule__Param__Group__0 ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:216:2: ( ( ( rule__Param__Group__0 ) ) )
            // InternalDatalog.g:217:2: ( ( rule__Param__Group__0 ) )
            {
            // InternalDatalog.g:217:2: ( ( rule__Param__Group__0 ) )
            // InternalDatalog.g:218:3: ( rule__Param__Group__0 )
            {
             before(grammarAccess.getParamAccess().getGroup()); 
            // InternalDatalog.g:219:3: ( rule__Param__Group__0 )
            // InternalDatalog.g:219:4: rule__Param__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Param__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getGroup()); 

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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleFormula"
    // InternalDatalog.g:228:1: entryRuleFormula : ruleFormula EOF ;
    public final void entryRuleFormula() throws RecognitionException {
        try {
            // InternalDatalog.g:229:1: ( ruleFormula EOF )
            // InternalDatalog.g:230:1: ruleFormula EOF
            {
             before(grammarAccess.getFormulaRule()); 
            pushFollow(FOLLOW_1);
            ruleFormula();

            state._fsp--;

             after(grammarAccess.getFormulaRule()); 
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
    // $ANTLR end "entryRuleFormula"


    // $ANTLR start "ruleFormula"
    // InternalDatalog.g:237:1: ruleFormula : ( ( rule__Formula__Group__0 ) ) ;
    public final void ruleFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:241:2: ( ( ( rule__Formula__Group__0 ) ) )
            // InternalDatalog.g:242:2: ( ( rule__Formula__Group__0 ) )
            {
            // InternalDatalog.g:242:2: ( ( rule__Formula__Group__0 ) )
            // InternalDatalog.g:243:3: ( rule__Formula__Group__0 )
            {
             before(grammarAccess.getFormulaAccess().getGroup()); 
            // InternalDatalog.g:244:3: ( rule__Formula__Group__0 )
            // InternalDatalog.g:244:4: rule__Formula__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Formula__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormulaAccess().getGroup()); 

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
    // InternalDatalog.g:253:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // InternalDatalog.g:254:1: ( ruleAtom EOF )
            // InternalDatalog.g:255:1: ruleAtom EOF
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
    // InternalDatalog.g:262:1: ruleAtom : ( ( rule__Atom__Group__0 ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:266:2: ( ( ( rule__Atom__Group__0 ) ) )
            // InternalDatalog.g:267:2: ( ( rule__Atom__Group__0 ) )
            {
            // InternalDatalog.g:267:2: ( ( rule__Atom__Group__0 ) )
            // InternalDatalog.g:268:3: ( rule__Atom__Group__0 )
            {
             before(grammarAccess.getAtomAccess().getGroup()); 
            // InternalDatalog.g:269:3: ( rule__Atom__Group__0 )
            // InternalDatalog.g:269:4: rule__Atom__Group__0
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


    // $ANTLR start "entryRuleParamList"
    // InternalDatalog.g:278:1: entryRuleParamList : ruleParamList EOF ;
    public final void entryRuleParamList() throws RecognitionException {
        try {
            // InternalDatalog.g:279:1: ( ruleParamList EOF )
            // InternalDatalog.g:280:1: ruleParamList EOF
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
    // InternalDatalog.g:287:1: ruleParamList : ( ( rule__ParamList__Group__0 ) ) ;
    public final void ruleParamList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:291:2: ( ( ( rule__ParamList__Group__0 ) ) )
            // InternalDatalog.g:292:2: ( ( rule__ParamList__Group__0 ) )
            {
            // InternalDatalog.g:292:2: ( ( rule__ParamList__Group__0 ) )
            // InternalDatalog.g:293:3: ( rule__ParamList__Group__0 )
            {
             before(grammarAccess.getParamListAccess().getGroup()); 
            // InternalDatalog.g:294:3: ( rule__ParamList__Group__0 )
            // InternalDatalog.g:294:4: rule__ParamList__Group__0
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
    // InternalDatalog.g:303:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalDatalog.g:304:1: ( rulePrimary EOF )
            // InternalDatalog.g:305:1: rulePrimary EOF
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
    // InternalDatalog.g:312:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:316:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalDatalog.g:317:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalDatalog.g:317:2: ( ( rule__Primary__Alternatives ) )
            // InternalDatalog.g:318:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalDatalog.g:319:3: ( rule__Primary__Alternatives )
            // InternalDatalog.g:319:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

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
    // InternalDatalog.g:328:1: entryRuleParameterInt : ruleParameterInt EOF ;
    public final void entryRuleParameterInt() throws RecognitionException {
        try {
            // InternalDatalog.g:329:1: ( ruleParameterInt EOF )
            // InternalDatalog.g:330:1: ruleParameterInt EOF
            {
             before(grammarAccess.getParameterIntRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterInt();

            state._fsp--;

             after(grammarAccess.getParameterIntRule()); 
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
    // $ANTLR end "entryRuleParameterInt"


    // $ANTLR start "ruleParameterInt"
    // InternalDatalog.g:337:1: ruleParameterInt : ( ( rule__ParameterInt__IntAssignment ) ) ;
    public final void ruleParameterInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:341:2: ( ( ( rule__ParameterInt__IntAssignment ) ) )
            // InternalDatalog.g:342:2: ( ( rule__ParameterInt__IntAssignment ) )
            {
            // InternalDatalog.g:342:2: ( ( rule__ParameterInt__IntAssignment ) )
            // InternalDatalog.g:343:3: ( rule__ParameterInt__IntAssignment )
            {
             before(grammarAccess.getParameterIntAccess().getIntAssignment()); 
            // InternalDatalog.g:344:3: ( rule__ParameterInt__IntAssignment )
            // InternalDatalog.g:344:4: rule__ParameterInt__IntAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterInt__IntAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterIntAccess().getIntAssignment()); 

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
    // InternalDatalog.g:353:1: entryRuleParameterVar : ruleParameterVar EOF ;
    public final void entryRuleParameterVar() throws RecognitionException {
        try {
            // InternalDatalog.g:354:1: ( ruleParameterVar EOF )
            // InternalDatalog.g:355:1: ruleParameterVar EOF
            {
             before(grammarAccess.getParameterVarRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterVar();

            state._fsp--;

             after(grammarAccess.getParameterVarRule()); 
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
    // $ANTLR end "entryRuleParameterVar"


    // $ANTLR start "ruleParameterVar"
    // InternalDatalog.g:362:1: ruleParameterVar : ( ( rule__ParameterVar__UpAssignment ) ) ;
    public final void ruleParameterVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:366:2: ( ( ( rule__ParameterVar__UpAssignment ) ) )
            // InternalDatalog.g:367:2: ( ( rule__ParameterVar__UpAssignment ) )
            {
            // InternalDatalog.g:367:2: ( ( rule__ParameterVar__UpAssignment ) )
            // InternalDatalog.g:368:3: ( rule__ParameterVar__UpAssignment )
            {
             before(grammarAccess.getParameterVarAccess().getUpAssignment()); 
            // InternalDatalog.g:369:3: ( rule__ParameterVar__UpAssignment )
            // InternalDatalog.g:369:4: rule__ParameterVar__UpAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterVar__UpAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterVarAccess().getUpAssignment()); 

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
    // InternalDatalog.g:378:1: entryRuleParameterPred : ruleParameterPred EOF ;
    public final void entryRuleParameterPred() throws RecognitionException {
        try {
            // InternalDatalog.g:379:1: ( ruleParameterPred EOF )
            // InternalDatalog.g:380:1: ruleParameterPred EOF
            {
             before(grammarAccess.getParameterPredRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterPred();

            state._fsp--;

             after(grammarAccess.getParameterPredRule()); 
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
    // $ANTLR end "entryRuleParameterPred"


    // $ANTLR start "ruleParameterPred"
    // InternalDatalog.g:387:1: ruleParameterPred : ( ( rule__ParameterPred__LowAssignment ) ) ;
    public final void ruleParameterPred() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:391:2: ( ( ( rule__ParameterPred__LowAssignment ) ) )
            // InternalDatalog.g:392:2: ( ( rule__ParameterPred__LowAssignment ) )
            {
            // InternalDatalog.g:392:2: ( ( rule__ParameterPred__LowAssignment ) )
            // InternalDatalog.g:393:3: ( rule__ParameterPred__LowAssignment )
            {
             before(grammarAccess.getParameterPredAccess().getLowAssignment()); 
            // InternalDatalog.g:394:3: ( rule__ParameterPred__LowAssignment )
            // InternalDatalog.g:394:4: rule__ParameterPred__LowAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterPred__LowAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterPredAccess().getLowAssignment()); 

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
    // InternalDatalog.g:402:1: rule__Statements__Alternatives : ( ( ( rule__Statements__Group_0__0 ) ) | ( ( rule__Statements__Group_1__0 ) ) | ( ruleForm ) | ( ruleParam ) | ( ruleAsk ) );
    public final void rule__Statements__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:406:1: ( ( ( rule__Statements__Group_0__0 ) ) | ( ( rule__Statements__Group_1__0 ) ) | ( ruleForm ) | ( ruleParam ) | ( ruleAsk ) )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalDatalog.g:407:2: ( ( rule__Statements__Group_0__0 ) )
                    {
                    // InternalDatalog.g:407:2: ( ( rule__Statements__Group_0__0 ) )
                    // InternalDatalog.g:408:3: ( rule__Statements__Group_0__0 )
                    {
                     before(grammarAccess.getStatementsAccess().getGroup_0()); 
                    // InternalDatalog.g:409:3: ( rule__Statements__Group_0__0 )
                    // InternalDatalog.g:409:4: rule__Statements__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statements__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementsAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDatalog.g:413:2: ( ( rule__Statements__Group_1__0 ) )
                    {
                    // InternalDatalog.g:413:2: ( ( rule__Statements__Group_1__0 ) )
                    // InternalDatalog.g:414:3: ( rule__Statements__Group_1__0 )
                    {
                     before(grammarAccess.getStatementsAccess().getGroup_1()); 
                    // InternalDatalog.g:415:3: ( rule__Statements__Group_1__0 )
                    // InternalDatalog.g:415:4: rule__Statements__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statements__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementsAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDatalog.g:419:2: ( ruleForm )
                    {
                    // InternalDatalog.g:419:2: ( ruleForm )
                    // InternalDatalog.g:420:3: ruleForm
                    {
                     before(grammarAccess.getStatementsAccess().getFormParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleForm();

                    state._fsp--;

                     after(grammarAccess.getStatementsAccess().getFormParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDatalog.g:425:2: ( ruleParam )
                    {
                    // InternalDatalog.g:425:2: ( ruleParam )
                    // InternalDatalog.g:426:3: ruleParam
                    {
                     before(grammarAccess.getStatementsAccess().getParamParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleParam();

                    state._fsp--;

                     after(grammarAccess.getStatementsAccess().getParamParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDatalog.g:431:2: ( ruleAsk )
                    {
                    // InternalDatalog.g:431:2: ( ruleAsk )
                    // InternalDatalog.g:432:3: ruleAsk
                    {
                     before(grammarAccess.getStatementsAccess().getAskParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleAsk();

                    state._fsp--;

                     after(grammarAccess.getStatementsAccess().getAskParserRuleCall_4()); 

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
    // InternalDatalog.g:441:1: rule__Primary__Alternatives : ( ( ruleParameterPred ) | ( ruleParameterVar ) | ( ruleParameterInt ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:445:1: ( ( ruleParameterPred ) | ( ruleParameterVar ) | ( ruleParameterInt ) )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDatalog.g:446:2: ( ruleParameterPred )
                    {
                    // InternalDatalog.g:446:2: ( ruleParameterPred )
                    // InternalDatalog.g:447:3: ruleParameterPred
                    {
                     before(grammarAccess.getPrimaryAccess().getParameterPredParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterPred();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getParameterPredParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDatalog.g:452:2: ( ruleParameterVar )
                    {
                    // InternalDatalog.g:452:2: ( ruleParameterVar )
                    // InternalDatalog.g:453:3: ruleParameterVar
                    {
                     before(grammarAccess.getPrimaryAccess().getParameterVarParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterVar();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getParameterVarParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDatalog.g:458:2: ( ruleParameterInt )
                    {
                    // InternalDatalog.g:458:2: ( ruleParameterInt )
                    // InternalDatalog.g:459:3: ruleParameterInt
                    {
                     before(grammarAccess.getPrimaryAccess().getParameterIntParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterInt();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getParameterIntParserRuleCall_2()); 

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
    // InternalDatalog.g:468:1: rule__Statements__Group_0__0 : rule__Statements__Group_0__0__Impl rule__Statements__Group_0__1 ;
    public final void rule__Statements__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:472:1: ( rule__Statements__Group_0__0__Impl rule__Statements__Group_0__1 )
            // InternalDatalog.g:473:2: rule__Statements__Group_0__0__Impl rule__Statements__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Statements__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statements__Group_0__1();

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
    // $ANTLR end "rule__Statements__Group_0__0"


    // $ANTLR start "rule__Statements__Group_0__0__Impl"
    // InternalDatalog.g:480:1: rule__Statements__Group_0__0__Impl : ( () ) ;
    public final void rule__Statements__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:484:1: ( ( () ) )
            // InternalDatalog.g:485:1: ( () )
            {
            // InternalDatalog.g:485:1: ( () )
            // InternalDatalog.g:486:2: ()
            {
             before(grammarAccess.getStatementsAccess().getStatementsAction_0_0()); 
            // InternalDatalog.g:487:2: ()
            // InternalDatalog.g:487:3: 
            {
            }

             after(grammarAccess.getStatementsAccess().getStatementsAction_0_0()); 

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
    // InternalDatalog.g:495:1: rule__Statements__Group_0__1 : rule__Statements__Group_0__1__Impl ;
    public final void rule__Statements__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:499:1: ( rule__Statements__Group_0__1__Impl )
            // InternalDatalog.g:500:2: rule__Statements__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statements__Group_0__1__Impl();

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
    // $ANTLR end "rule__Statements__Group_0__1"


    // $ANTLR start "rule__Statements__Group_0__1__Impl"
    // InternalDatalog.g:506:1: rule__Statements__Group_0__1__Impl : ( rulePlus ) ;
    public final void rule__Statements__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:510:1: ( ( rulePlus ) )
            // InternalDatalog.g:511:1: ( rulePlus )
            {
            // InternalDatalog.g:511:1: ( rulePlus )
            // InternalDatalog.g:512:2: rulePlus
            {
             before(grammarAccess.getStatementsAccess().getPlusParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            rulePlus();

            state._fsp--;

             after(grammarAccess.getStatementsAccess().getPlusParserRuleCall_0_1()); 

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
    // InternalDatalog.g:522:1: rule__Statements__Group_1__0 : rule__Statements__Group_1__0__Impl rule__Statements__Group_1__1 ;
    public final void rule__Statements__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:526:1: ( rule__Statements__Group_1__0__Impl rule__Statements__Group_1__1 )
            // InternalDatalog.g:527:2: rule__Statements__Group_1__0__Impl rule__Statements__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Statements__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statements__Group_1__1();

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
    // $ANTLR end "rule__Statements__Group_1__0"


    // $ANTLR start "rule__Statements__Group_1__0__Impl"
    // InternalDatalog.g:534:1: rule__Statements__Group_1__0__Impl : ( () ) ;
    public final void rule__Statements__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:538:1: ( ( () ) )
            // InternalDatalog.g:539:1: ( () )
            {
            // InternalDatalog.g:539:1: ( () )
            // InternalDatalog.g:540:2: ()
            {
             before(grammarAccess.getStatementsAccess().getStatementsAction_1_0()); 
            // InternalDatalog.g:541:2: ()
            // InternalDatalog.g:541:3: 
            {
            }

             after(grammarAccess.getStatementsAccess().getStatementsAction_1_0()); 

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
    // InternalDatalog.g:549:1: rule__Statements__Group_1__1 : rule__Statements__Group_1__1__Impl ;
    public final void rule__Statements__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:553:1: ( rule__Statements__Group_1__1__Impl )
            // InternalDatalog.g:554:2: rule__Statements__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statements__Group_1__1__Impl();

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
    // $ANTLR end "rule__Statements__Group_1__1"


    // $ANTLR start "rule__Statements__Group_1__1__Impl"
    // InternalDatalog.g:560:1: rule__Statements__Group_1__1__Impl : ( ruleMinus ) ;
    public final void rule__Statements__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:564:1: ( ( ruleMinus ) )
            // InternalDatalog.g:565:1: ( ruleMinus )
            {
            // InternalDatalog.g:565:1: ( ruleMinus )
            // InternalDatalog.g:566:2: ruleMinus
            {
             before(grammarAccess.getStatementsAccess().getMinusParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleMinus();

            state._fsp--;

             after(grammarAccess.getStatementsAccess().getMinusParserRuleCall_1_1()); 

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


    // $ANTLR start "rule__Ask__Group__0"
    // InternalDatalog.g:576:1: rule__Ask__Group__0 : rule__Ask__Group__0__Impl rule__Ask__Group__1 ;
    public final void rule__Ask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:580:1: ( rule__Ask__Group__0__Impl rule__Ask__Group__1 )
            // InternalDatalog.g:581:2: rule__Ask__Group__0__Impl rule__Ask__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Ask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ask__Group__1();

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
    // $ANTLR end "rule__Ask__Group__0"


    // $ANTLR start "rule__Ask__Group__0__Impl"
    // InternalDatalog.g:588:1: rule__Ask__Group__0__Impl : ( ruleFormula ) ;
    public final void rule__Ask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:592:1: ( ( ruleFormula ) )
            // InternalDatalog.g:593:1: ( ruleFormula )
            {
            // InternalDatalog.g:593:1: ( ruleFormula )
            // InternalDatalog.g:594:2: ruleFormula
            {
             before(grammarAccess.getAskAccess().getFormulaParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFormula();

            state._fsp--;

             after(grammarAccess.getAskAccess().getFormulaParserRuleCall_0()); 

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
    // $ANTLR end "rule__Ask__Group__0__Impl"


    // $ANTLR start "rule__Ask__Group__1"
    // InternalDatalog.g:603:1: rule__Ask__Group__1 : rule__Ask__Group__1__Impl ;
    public final void rule__Ask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:607:1: ( rule__Ask__Group__1__Impl )
            // InternalDatalog.g:608:2: rule__Ask__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ask__Group__1__Impl();

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
    // $ANTLR end "rule__Ask__Group__1"


    // $ANTLR start "rule__Ask__Group__1__Impl"
    // InternalDatalog.g:614:1: rule__Ask__Group__1__Impl : ( '?' ) ;
    public final void rule__Ask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:618:1: ( ( '?' ) )
            // InternalDatalog.g:619:1: ( '?' )
            {
            // InternalDatalog.g:619:1: ( '?' )
            // InternalDatalog.g:620:2: '?'
            {
             before(grammarAccess.getAskAccess().getQuestionMarkKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAskAccess().getQuestionMarkKeyword_1()); 

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
    // $ANTLR end "rule__Ask__Group__1__Impl"


    // $ANTLR start "rule__Form__Group__0"
    // InternalDatalog.g:630:1: rule__Form__Group__0 : rule__Form__Group__0__Impl rule__Form__Group__1 ;
    public final void rule__Form__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:634:1: ( rule__Form__Group__0__Impl rule__Form__Group__1 )
            // InternalDatalog.g:635:2: rule__Form__Group__0__Impl rule__Form__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Form__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__1();

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
    // $ANTLR end "rule__Form__Group__0"


    // $ANTLR start "rule__Form__Group__0__Impl"
    // InternalDatalog.g:642:1: rule__Form__Group__0__Impl : ( ruleAtom ) ;
    public final void rule__Form__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:646:1: ( ( ruleAtom ) )
            // InternalDatalog.g:647:1: ( ruleAtom )
            {
            // InternalDatalog.g:647:1: ( ruleAtom )
            // InternalDatalog.g:648:2: ruleAtom
            {
             before(grammarAccess.getFormAccess().getAtomParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getFormAccess().getAtomParserRuleCall_0()); 

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
    // $ANTLR end "rule__Form__Group__0__Impl"


    // $ANTLR start "rule__Form__Group__1"
    // InternalDatalog.g:657:1: rule__Form__Group__1 : rule__Form__Group__1__Impl rule__Form__Group__2 ;
    public final void rule__Form__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:661:1: ( rule__Form__Group__1__Impl rule__Form__Group__2 )
            // InternalDatalog.g:662:2: rule__Form__Group__1__Impl rule__Form__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Form__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__2();

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
    // $ANTLR end "rule__Form__Group__1"


    // $ANTLR start "rule__Form__Group__1__Impl"
    // InternalDatalog.g:669:1: rule__Form__Group__1__Impl : ( ( rule__Form__Group_1__0 )* ) ;
    public final void rule__Form__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:673:1: ( ( ( rule__Form__Group_1__0 )* ) )
            // InternalDatalog.g:674:1: ( ( rule__Form__Group_1__0 )* )
            {
            // InternalDatalog.g:674:1: ( ( rule__Form__Group_1__0 )* )
            // InternalDatalog.g:675:2: ( rule__Form__Group_1__0 )*
            {
             before(grammarAccess.getFormAccess().getGroup_1()); 
            // InternalDatalog.g:676:2: ( rule__Form__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDatalog.g:676:3: rule__Form__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Form__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getFormAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Form__Group__1__Impl"


    // $ANTLR start "rule__Form__Group__2"
    // InternalDatalog.g:684:1: rule__Form__Group__2 : rule__Form__Group__2__Impl ;
    public final void rule__Form__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:688:1: ( rule__Form__Group__2__Impl )
            // InternalDatalog.g:689:2: rule__Form__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group__2__Impl();

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
    // $ANTLR end "rule__Form__Group__2"


    // $ANTLR start "rule__Form__Group__2__Impl"
    // InternalDatalog.g:695:1: rule__Form__Group__2__Impl : ( '.' ) ;
    public final void rule__Form__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:699:1: ( ( '.' ) )
            // InternalDatalog.g:700:1: ( '.' )
            {
            // InternalDatalog.g:700:1: ( '.' )
            // InternalDatalog.g:701:2: '.'
            {
             before(grammarAccess.getFormAccess().getFullStopKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__Form__Group__2__Impl"


    // $ANTLR start "rule__Form__Group_1__0"
    // InternalDatalog.g:711:1: rule__Form__Group_1__0 : rule__Form__Group_1__0__Impl rule__Form__Group_1__1 ;
    public final void rule__Form__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:715:1: ( rule__Form__Group_1__0__Impl rule__Form__Group_1__1 )
            // InternalDatalog.g:716:2: rule__Form__Group_1__0__Impl rule__Form__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Form__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group_1__1();

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
    // $ANTLR end "rule__Form__Group_1__0"


    // $ANTLR start "rule__Form__Group_1__0__Impl"
    // InternalDatalog.g:723:1: rule__Form__Group_1__0__Impl : ( () ) ;
    public final void rule__Form__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:727:1: ( ( () ) )
            // InternalDatalog.g:728:1: ( () )
            {
            // InternalDatalog.g:728:1: ( () )
            // InternalDatalog.g:729:2: ()
            {
             before(grammarAccess.getFormAccess().getOperationLeftAction_1_0()); 
            // InternalDatalog.g:730:2: ()
            // InternalDatalog.g:730:3: 
            {
            }

             after(grammarAccess.getFormAccess().getOperationLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group_1__0__Impl"


    // $ANTLR start "rule__Form__Group_1__1"
    // InternalDatalog.g:738:1: rule__Form__Group_1__1 : rule__Form__Group_1__1__Impl rule__Form__Group_1__2 ;
    public final void rule__Form__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:742:1: ( rule__Form__Group_1__1__Impl rule__Form__Group_1__2 )
            // InternalDatalog.g:743:2: rule__Form__Group_1__1__Impl rule__Form__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__Form__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group_1__2();

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
    // $ANTLR end "rule__Form__Group_1__1"


    // $ANTLR start "rule__Form__Group_1__1__Impl"
    // InternalDatalog.g:750:1: rule__Form__Group_1__1__Impl : ( ':-' ) ;
    public final void rule__Form__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:754:1: ( ( ':-' ) )
            // InternalDatalog.g:755:1: ( ':-' )
            {
            // InternalDatalog.g:755:1: ( ':-' )
            // InternalDatalog.g:756:2: ':-'
            {
             before(grammarAccess.getFormAccess().getColonHyphenMinusKeyword_1_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getColonHyphenMinusKeyword_1_1()); 

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
    // $ANTLR end "rule__Form__Group_1__1__Impl"


    // $ANTLR start "rule__Form__Group_1__2"
    // InternalDatalog.g:765:1: rule__Form__Group_1__2 : rule__Form__Group_1__2__Impl ;
    public final void rule__Form__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:769:1: ( rule__Form__Group_1__2__Impl )
            // InternalDatalog.g:770:2: rule__Form__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group_1__2__Impl();

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
    // $ANTLR end "rule__Form__Group_1__2"


    // $ANTLR start "rule__Form__Group_1__2__Impl"
    // InternalDatalog.g:776:1: rule__Form__Group_1__2__Impl : ( ( rule__Form__RightAssignment_1_2 ) ) ;
    public final void rule__Form__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:780:1: ( ( ( rule__Form__RightAssignment_1_2 ) ) )
            // InternalDatalog.g:781:1: ( ( rule__Form__RightAssignment_1_2 ) )
            {
            // InternalDatalog.g:781:1: ( ( rule__Form__RightAssignment_1_2 ) )
            // InternalDatalog.g:782:2: ( rule__Form__RightAssignment_1_2 )
            {
             before(grammarAccess.getFormAccess().getRightAssignment_1_2()); 
            // InternalDatalog.g:783:2: ( rule__Form__RightAssignment_1_2 )
            // InternalDatalog.g:783:3: rule__Form__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Form__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Form__Group_1__2__Impl"


    // $ANTLR start "rule__Param__Group__0"
    // InternalDatalog.g:792:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:796:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // InternalDatalog.g:797:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Param__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Param__Group__1();

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
    // $ANTLR end "rule__Param__Group__0"


    // $ANTLR start "rule__Param__Group__0__Impl"
    // InternalDatalog.g:804:1: rule__Param__Group__0__Impl : ( ruleFormula ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:808:1: ( ( ruleFormula ) )
            // InternalDatalog.g:809:1: ( ruleFormula )
            {
            // InternalDatalog.g:809:1: ( ruleFormula )
            // InternalDatalog.g:810:2: ruleFormula
            {
             before(grammarAccess.getParamAccess().getFormulaParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFormula();

            state._fsp--;

             after(grammarAccess.getParamAccess().getFormulaParserRuleCall_0()); 

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
    // $ANTLR end "rule__Param__Group__0__Impl"


    // $ANTLR start "rule__Param__Group__1"
    // InternalDatalog.g:819:1: rule__Param__Group__1 : rule__Param__Group__1__Impl ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:823:1: ( rule__Param__Group__1__Impl )
            // InternalDatalog.g:824:2: rule__Param__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Param__Group__1__Impl();

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
    // $ANTLR end "rule__Param__Group__1"


    // $ANTLR start "rule__Param__Group__1__Impl"
    // InternalDatalog.g:830:1: rule__Param__Group__1__Impl : ( '.' ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:834:1: ( ( '.' ) )
            // InternalDatalog.g:835:1: ( '.' )
            {
            // InternalDatalog.g:835:1: ( '.' )
            // InternalDatalog.g:836:2: '.'
            {
             before(grammarAccess.getParamAccess().getFullStopKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getParamAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__Param__Group__1__Impl"


    // $ANTLR start "rule__Formula__Group__0"
    // InternalDatalog.g:846:1: rule__Formula__Group__0 : rule__Formula__Group__0__Impl rule__Formula__Group__1 ;
    public final void rule__Formula__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:850:1: ( rule__Formula__Group__0__Impl rule__Formula__Group__1 )
            // InternalDatalog.g:851:2: rule__Formula__Group__0__Impl rule__Formula__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Formula__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group__1();

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
    // $ANTLR end "rule__Formula__Group__0"


    // $ANTLR start "rule__Formula__Group__0__Impl"
    // InternalDatalog.g:858:1: rule__Formula__Group__0__Impl : ( ruleAtom ) ;
    public final void rule__Formula__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:862:1: ( ( ruleAtom ) )
            // InternalDatalog.g:863:1: ( ruleAtom )
            {
            // InternalDatalog.g:863:1: ( ruleAtom )
            // InternalDatalog.g:864:2: ruleAtom
            {
             before(grammarAccess.getFormulaAccess().getAtomParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getFormulaAccess().getAtomParserRuleCall_0()); 

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
    // InternalDatalog.g:873:1: rule__Formula__Group__1 : rule__Formula__Group__1__Impl ;
    public final void rule__Formula__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:877:1: ( rule__Formula__Group__1__Impl )
            // InternalDatalog.g:878:2: rule__Formula__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formula__Group__1__Impl();

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
    // $ANTLR end "rule__Formula__Group__1"


    // $ANTLR start "rule__Formula__Group__1__Impl"
    // InternalDatalog.g:884:1: rule__Formula__Group__1__Impl : ( ( rule__Formula__Group_1__0 )* ) ;
    public final void rule__Formula__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:888:1: ( ( ( rule__Formula__Group_1__0 )* ) )
            // InternalDatalog.g:889:1: ( ( rule__Formula__Group_1__0 )* )
            {
            // InternalDatalog.g:889:1: ( ( rule__Formula__Group_1__0 )* )
            // InternalDatalog.g:890:2: ( rule__Formula__Group_1__0 )*
            {
             before(grammarAccess.getFormulaAccess().getGroup_1()); 
            // InternalDatalog.g:891:2: ( rule__Formula__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDatalog.g:891:3: rule__Formula__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Formula__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getFormulaAccess().getGroup_1()); 

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
    // InternalDatalog.g:900:1: rule__Formula__Group_1__0 : rule__Formula__Group_1__0__Impl rule__Formula__Group_1__1 ;
    public final void rule__Formula__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:904:1: ( rule__Formula__Group_1__0__Impl rule__Formula__Group_1__1 )
            // InternalDatalog.g:905:2: rule__Formula__Group_1__0__Impl rule__Formula__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Formula__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group_1__1();

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
    // $ANTLR end "rule__Formula__Group_1__0"


    // $ANTLR start "rule__Formula__Group_1__0__Impl"
    // InternalDatalog.g:912:1: rule__Formula__Group_1__0__Impl : ( () ) ;
    public final void rule__Formula__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:916:1: ( ( () ) )
            // InternalDatalog.g:917:1: ( () )
            {
            // InternalDatalog.g:917:1: ( () )
            // InternalDatalog.g:918:2: ()
            {
             before(grammarAccess.getFormulaAccess().getFormulaLeftAction_1_0()); 
            // InternalDatalog.g:919:2: ()
            // InternalDatalog.g:919:3: 
            {
            }

             after(grammarAccess.getFormulaAccess().getFormulaLeftAction_1_0()); 

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
    // InternalDatalog.g:927:1: rule__Formula__Group_1__1 : rule__Formula__Group_1__1__Impl rule__Formula__Group_1__2 ;
    public final void rule__Formula__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:931:1: ( rule__Formula__Group_1__1__Impl rule__Formula__Group_1__2 )
            // InternalDatalog.g:932:2: rule__Formula__Group_1__1__Impl rule__Formula__Group_1__2
            {
            pushFollow(FOLLOW_10);
            rule__Formula__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Formula__Group_1__2();

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
    // $ANTLR end "rule__Formula__Group_1__1"


    // $ANTLR start "rule__Formula__Group_1__1__Impl"
    // InternalDatalog.g:939:1: rule__Formula__Group_1__1__Impl : ( ',' ) ;
    public final void rule__Formula__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:943:1: ( ( ',' ) )
            // InternalDatalog.g:944:1: ( ',' )
            {
            // InternalDatalog.g:944:1: ( ',' )
            // InternalDatalog.g:945:2: ','
            {
             before(grammarAccess.getFormulaAccess().getCommaKeyword_1_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFormulaAccess().getCommaKeyword_1_1()); 

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
    // InternalDatalog.g:954:1: rule__Formula__Group_1__2 : rule__Formula__Group_1__2__Impl ;
    public final void rule__Formula__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:958:1: ( rule__Formula__Group_1__2__Impl )
            // InternalDatalog.g:959:2: rule__Formula__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Formula__Group_1__2__Impl();

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
    // $ANTLR end "rule__Formula__Group_1__2"


    // $ANTLR start "rule__Formula__Group_1__2__Impl"
    // InternalDatalog.g:965:1: rule__Formula__Group_1__2__Impl : ( ( rule__Formula__RightAssignment_1_2 ) ) ;
    public final void rule__Formula__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:969:1: ( ( ( rule__Formula__RightAssignment_1_2 ) ) )
            // InternalDatalog.g:970:1: ( ( rule__Formula__RightAssignment_1_2 ) )
            {
            // InternalDatalog.g:970:1: ( ( rule__Formula__RightAssignment_1_2 ) )
            // InternalDatalog.g:971:2: ( rule__Formula__RightAssignment_1_2 )
            {
             before(grammarAccess.getFormulaAccess().getRightAssignment_1_2()); 
            // InternalDatalog.g:972:2: ( rule__Formula__RightAssignment_1_2 )
            // InternalDatalog.g:972:3: rule__Formula__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Formula__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFormulaAccess().getRightAssignment_1_2()); 

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
    // InternalDatalog.g:981:1: rule__Atom__Group__0 : rule__Atom__Group__0__Impl rule__Atom__Group__1 ;
    public final void rule__Atom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:985:1: ( rule__Atom__Group__0__Impl rule__Atom__Group__1 )
            // InternalDatalog.g:986:2: rule__Atom__Group__0__Impl rule__Atom__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDatalog.g:993:1: rule__Atom__Group__0__Impl : ( ruleParameterPred ) ;
    public final void rule__Atom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:997:1: ( ( ruleParameterPred ) )
            // InternalDatalog.g:998:1: ( ruleParameterPred )
            {
            // InternalDatalog.g:998:1: ( ruleParameterPred )
            // InternalDatalog.g:999:2: ruleParameterPred
            {
             before(grammarAccess.getAtomAccess().getParameterPredParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterPred();

            state._fsp--;

             after(grammarAccess.getAtomAccess().getParameterPredParserRuleCall_0()); 

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
    // InternalDatalog.g:1008:1: rule__Atom__Group__1 : rule__Atom__Group__1__Impl rule__Atom__Group__2 ;
    public final void rule__Atom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1012:1: ( rule__Atom__Group__1__Impl rule__Atom__Group__2 )
            // InternalDatalog.g:1013:2: rule__Atom__Group__1__Impl rule__Atom__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalDatalog.g:1020:1: rule__Atom__Group__1__Impl : ( '(' ) ;
    public final void rule__Atom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1024:1: ( ( '(' ) )
            // InternalDatalog.g:1025:1: ( '(' )
            {
            // InternalDatalog.g:1025:1: ( '(' )
            // InternalDatalog.g:1026:2: '('
            {
             before(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1()); 

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
    // InternalDatalog.g:1035:1: rule__Atom__Group__2 : rule__Atom__Group__2__Impl rule__Atom__Group__3 ;
    public final void rule__Atom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1039:1: ( rule__Atom__Group__2__Impl rule__Atom__Group__3 )
            // InternalDatalog.g:1040:2: rule__Atom__Group__2__Impl rule__Atom__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalDatalog.g:1047:1: rule__Atom__Group__2__Impl : ( ( rule__Atom__ListAssignment_2 ) ) ;
    public final void rule__Atom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1051:1: ( ( ( rule__Atom__ListAssignment_2 ) ) )
            // InternalDatalog.g:1052:1: ( ( rule__Atom__ListAssignment_2 ) )
            {
            // InternalDatalog.g:1052:1: ( ( rule__Atom__ListAssignment_2 ) )
            // InternalDatalog.g:1053:2: ( rule__Atom__ListAssignment_2 )
            {
             before(grammarAccess.getAtomAccess().getListAssignment_2()); 
            // InternalDatalog.g:1054:2: ( rule__Atom__ListAssignment_2 )
            // InternalDatalog.g:1054:3: rule__Atom__ListAssignment_2
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
    // InternalDatalog.g:1062:1: rule__Atom__Group__3 : rule__Atom__Group__3__Impl ;
    public final void rule__Atom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1066:1: ( rule__Atom__Group__3__Impl )
            // InternalDatalog.g:1067:2: rule__Atom__Group__3__Impl
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
    // InternalDatalog.g:1073:1: rule__Atom__Group__3__Impl : ( ')' ) ;
    public final void rule__Atom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1077:1: ( ( ')' ) )
            // InternalDatalog.g:1078:1: ( ')' )
            {
            // InternalDatalog.g:1078:1: ( ')' )
            // InternalDatalog.g:1079:2: ')'
            {
             before(grammarAccess.getAtomAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAtomAccess().getRightParenthesisKeyword_3()); 

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
    // InternalDatalog.g:1089:1: rule__ParamList__Group__0 : rule__ParamList__Group__0__Impl rule__ParamList__Group__1 ;
    public final void rule__ParamList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1093:1: ( rule__ParamList__Group__0__Impl rule__ParamList__Group__1 )
            // InternalDatalog.g:1094:2: rule__ParamList__Group__0__Impl rule__ParamList__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalDatalog.g:1101:1: rule__ParamList__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__ParamList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1105:1: ( ( rulePrimary ) )
            // InternalDatalog.g:1106:1: ( rulePrimary )
            {
            // InternalDatalog.g:1106:1: ( rulePrimary )
            // InternalDatalog.g:1107:2: rulePrimary
            {
             before(grammarAccess.getParamListAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getParamListAccess().getPrimaryParserRuleCall_0()); 

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
    // InternalDatalog.g:1116:1: rule__ParamList__Group__1 : rule__ParamList__Group__1__Impl ;
    public final void rule__ParamList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1120:1: ( rule__ParamList__Group__1__Impl )
            // InternalDatalog.g:1121:2: rule__ParamList__Group__1__Impl
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
    // InternalDatalog.g:1127:1: rule__ParamList__Group__1__Impl : ( ( rule__ParamList__Group_1__0 ) ) ;
    public final void rule__ParamList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1131:1: ( ( ( rule__ParamList__Group_1__0 ) ) )
            // InternalDatalog.g:1132:1: ( ( rule__ParamList__Group_1__0 ) )
            {
            // InternalDatalog.g:1132:1: ( ( rule__ParamList__Group_1__0 ) )
            // InternalDatalog.g:1133:2: ( rule__ParamList__Group_1__0 )
            {
             before(grammarAccess.getParamListAccess().getGroup_1()); 
            // InternalDatalog.g:1134:2: ( rule__ParamList__Group_1__0 )
            // InternalDatalog.g:1134:3: rule__ParamList__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__ParamList__Group_1__0();

            state._fsp--;


            }

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
    // InternalDatalog.g:1143:1: rule__ParamList__Group_1__0 : rule__ParamList__Group_1__0__Impl rule__ParamList__Group_1__1 ;
    public final void rule__ParamList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1147:1: ( rule__ParamList__Group_1__0__Impl rule__ParamList__Group_1__1 )
            // InternalDatalog.g:1148:2: rule__ParamList__Group_1__0__Impl rule__ParamList__Group_1__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalDatalog.g:1155:1: rule__ParamList__Group_1__0__Impl : ( () ) ;
    public final void rule__ParamList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1159:1: ( ( () ) )
            // InternalDatalog.g:1160:1: ( () )
            {
            // InternalDatalog.g:1160:1: ( () )
            // InternalDatalog.g:1161:2: ()
            {
             before(grammarAccess.getParamListAccess().getParamListLeftAction_1_0()); 
            // InternalDatalog.g:1162:2: ()
            // InternalDatalog.g:1162:3: 
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
    // InternalDatalog.g:1170:1: rule__ParamList__Group_1__1 : rule__ParamList__Group_1__1__Impl rule__ParamList__Group_1__2 ;
    public final void rule__ParamList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1174:1: ( rule__ParamList__Group_1__1__Impl rule__ParamList__Group_1__2 )
            // InternalDatalog.g:1175:2: rule__ParamList__Group_1__1__Impl rule__ParamList__Group_1__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalDatalog.g:1182:1: rule__ParamList__Group_1__1__Impl : ( ',' ) ;
    public final void rule__ParamList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1186:1: ( ( ',' ) )
            // InternalDatalog.g:1187:1: ( ',' )
            {
            // InternalDatalog.g:1187:1: ( ',' )
            // InternalDatalog.g:1188:2: ','
            {
             before(grammarAccess.getParamListAccess().getCommaKeyword_1_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getParamListAccess().getCommaKeyword_1_1()); 

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
    // InternalDatalog.g:1197:1: rule__ParamList__Group_1__2 : rule__ParamList__Group_1__2__Impl ;
    public final void rule__ParamList__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1201:1: ( rule__ParamList__Group_1__2__Impl )
            // InternalDatalog.g:1202:2: rule__ParamList__Group_1__2__Impl
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
    // InternalDatalog.g:1208:1: rule__ParamList__Group_1__2__Impl : ( ( rule__ParamList__RightAssignment_1_2 ) ) ;
    public final void rule__ParamList__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1212:1: ( ( ( rule__ParamList__RightAssignment_1_2 ) ) )
            // InternalDatalog.g:1213:1: ( ( rule__ParamList__RightAssignment_1_2 ) )
            {
            // InternalDatalog.g:1213:1: ( ( rule__ParamList__RightAssignment_1_2 ) )
            // InternalDatalog.g:1214:2: ( rule__ParamList__RightAssignment_1_2 )
            {
             before(grammarAccess.getParamListAccess().getRightAssignment_1_2()); 
            // InternalDatalog.g:1215:2: ( rule__ParamList__RightAssignment_1_2 )
            // InternalDatalog.g:1215:3: rule__ParamList__RightAssignment_1_2
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
    // InternalDatalog.g:1224:1: rule__Model__ProgramAssignment : ( ruleStatements ) ;
    public final void rule__Model__ProgramAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1228:1: ( ( ruleStatements ) )
            // InternalDatalog.g:1229:2: ( ruleStatements )
            {
            // InternalDatalog.g:1229:2: ( ruleStatements )
            // InternalDatalog.g:1230:3: ruleStatements
            {
             before(grammarAccess.getModelAccess().getProgramStatementsParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatements();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProgramStatementsParserRuleCall_0()); 

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


    // $ANTLR start "rule__Form__RightAssignment_1_2"
    // InternalDatalog.g:1239:1: rule__Form__RightAssignment_1_2 : ( ruleFormula ) ;
    public final void rule__Form__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1243:1: ( ( ruleFormula ) )
            // InternalDatalog.g:1244:2: ( ruleFormula )
            {
            // InternalDatalog.g:1244:2: ( ruleFormula )
            // InternalDatalog.g:1245:3: ruleFormula
            {
             before(grammarAccess.getFormAccess().getRightFormulaParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFormula();

            state._fsp--;

             after(grammarAccess.getFormAccess().getRightFormulaParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Form__RightAssignment_1_2"


    // $ANTLR start "rule__Formula__RightAssignment_1_2"
    // InternalDatalog.g:1254:1: rule__Formula__RightAssignment_1_2 : ( ruleAtom ) ;
    public final void rule__Formula__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1258:1: ( ( ruleAtom ) )
            // InternalDatalog.g:1259:2: ( ruleAtom )
            {
            // InternalDatalog.g:1259:2: ( ruleAtom )
            // InternalDatalog.g:1260:3: ruleAtom
            {
             before(grammarAccess.getFormulaAccess().getRightAtomParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getFormulaAccess().getRightAtomParserRuleCall_1_2_0()); 

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


    // $ANTLR start "rule__Atom__ListAssignment_2"
    // InternalDatalog.g:1269:1: rule__Atom__ListAssignment_2 : ( ruleParamList ) ;
    public final void rule__Atom__ListAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1273:1: ( ( ruleParamList ) )
            // InternalDatalog.g:1274:2: ( ruleParamList )
            {
            // InternalDatalog.g:1274:2: ( ruleParamList )
            // InternalDatalog.g:1275:3: ruleParamList
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


    // $ANTLR start "rule__ParamList__RightAssignment_1_2"
    // InternalDatalog.g:1284:1: rule__ParamList__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__ParamList__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1288:1: ( ( rulePrimary ) )
            // InternalDatalog.g:1289:2: ( rulePrimary )
            {
            // InternalDatalog.g:1289:2: ( rulePrimary )
            // InternalDatalog.g:1290:3: rulePrimary
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


    // $ANTLR start "rule__ParameterInt__IntAssignment"
    // InternalDatalog.g:1299:1: rule__ParameterInt__IntAssignment : ( RULE_INT ) ;
    public final void rule__ParameterInt__IntAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1303:1: ( ( RULE_INT ) )
            // InternalDatalog.g:1304:2: ( RULE_INT )
            {
            // InternalDatalog.g:1304:2: ( RULE_INT )
            // InternalDatalog.g:1305:3: RULE_INT
            {
             before(grammarAccess.getParameterIntAccess().getIntINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getParameterIntAccess().getIntINTTerminalRuleCall_0()); 

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
    // InternalDatalog.g:1314:1: rule__ParameterVar__UpAssignment : ( RULE_VARIABLE ) ;
    public final void rule__ParameterVar__UpAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1318:1: ( ( RULE_VARIABLE ) )
            // InternalDatalog.g:1319:2: ( RULE_VARIABLE )
            {
            // InternalDatalog.g:1319:2: ( RULE_VARIABLE )
            // InternalDatalog.g:1320:3: RULE_VARIABLE
            {
             before(grammarAccess.getParameterVarAccess().getUpVARIABLETerminalRuleCall_0()); 
            match(input,RULE_VARIABLE,FOLLOW_2); 
             after(grammarAccess.getParameterVarAccess().getUpVARIABLETerminalRuleCall_0()); 

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
    // InternalDatalog.g:1329:1: rule__ParameterPred__LowAssignment : ( RULE_PREDICATE ) ;
    public final void rule__ParameterPred__LowAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDatalog.g:1333:1: ( ( RULE_PREDICATE ) )
            // InternalDatalog.g:1334:2: ( RULE_PREDICATE )
            {
            // InternalDatalog.g:1334:2: ( RULE_PREDICATE )
            // InternalDatalog.g:1335:3: RULE_PREDICATE
            {
             before(grammarAccess.getParameterPredAccess().getLowPREDICATETerminalRuleCall_0()); 
            match(input,RULE_PREDICATE,FOLLOW_2); 
             after(grammarAccess.getParameterPredAccess().getLowPREDICATETerminalRuleCall_0()); 

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
    static final String dfa_1s = "\33\uffff";
    static final String dfa_2s = "\1\6\2\uffff\1\23\1\4\3\22\1\4\3\24\1\17\1\6\2\uffff\1\23\1\4\3\22\1\4\3\24\1\17\1\uffff";
    static final String dfa_3s = "\1\16\2\uffff\1\23\1\6\3\22\1\6\3\24\1\22\1\6\2\uffff\1\23\1\6\3\22\1\6\3\24\1\22\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\13\uffff\1\3\1\5\12\uffff\1\4";
    static final String dfa_5s = "\33\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\6\uffff\1\1\1\2",
            "",
            "",
            "\1\4",
            "\1\7\1\6\1\5",
            "\1\10",
            "\1\10",
            "\1\10",
            "\1\13\1\12\1\11",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\17\2\16\1\15",
            "\1\20",
            "",
            "",
            "\1\21",
            "\1\24\1\23\1\22",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\30\1\27\1\26",
            "\1\31",
            "\1\31",
            "\1\31",
            "\1\17\1\32\1\uffff\1\15",
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
            return "402:1: rule__Statements__Alternatives : ( ( ( rule__Statements__Group_0__0 ) ) | ( ( rule__Statements__Group_1__0 ) ) | ( ruleForm ) | ( ruleParam ) | ( ruleAsk ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000006042L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});

}