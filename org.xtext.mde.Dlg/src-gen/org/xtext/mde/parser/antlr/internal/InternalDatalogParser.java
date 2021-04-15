package org.xtext.mde.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.mde.services.DatalogGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDatalogParser extends AbstractInternalAntlrParser {
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

        public InternalDatalogParser(TokenStream input, DatalogGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DatalogGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDatalog.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDatalog.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalDatalog.g:65:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDatalog.g:71:1: ruleModel returns [EObject current=null] : ( (lv_Program_0_0= ruleStatements ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_Program_0_0 = null;



        	enterRule();

        try {
            // InternalDatalog.g:77:2: ( ( (lv_Program_0_0= ruleStatements ) )* )
            // InternalDatalog.g:78:2: ( (lv_Program_0_0= ruleStatements ) )*
            {
            // InternalDatalog.g:78:2: ( (lv_Program_0_0= ruleStatements ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_PREDICATE||(LA1_0>=13 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDatalog.g:79:3: (lv_Program_0_0= ruleStatements )
            	    {
            	    // InternalDatalog.g:79:3: (lv_Program_0_0= ruleStatements )
            	    // InternalDatalog.g:80:4: lv_Program_0_0= ruleStatements
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getModelAccess().getProgramStatementsParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_Program_0_0=ruleStatements();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getModelRule());
            	      				}
            	      				add(
            	      					current,
            	      					"Program",
            	      					lv_Program_0_0,
            	      					"org.xtext.mde.Datalog.Statements");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatements"
    // InternalDatalog.g:100:1: entryRuleStatements returns [EObject current=null] : iv_ruleStatements= ruleStatements EOF ;
    public final EObject entryRuleStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatements = null;


        try {
            // InternalDatalog.g:100:51: (iv_ruleStatements= ruleStatements EOF )
            // InternalDatalog.g:101:2: iv_ruleStatements= ruleStatements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatements=ruleStatements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatements; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatements"


    // $ANTLR start "ruleStatements"
    // InternalDatalog.g:107:1: ruleStatements returns [EObject current=null] : ( ( () rulePlusSign ) | ( () ruleMinusSign ) | this_Conditions_4= ruleConditions | this_Assertion_5= ruleAssertion | ( () ruleCom ) ) ;
    public final EObject ruleStatements() throws RecognitionException {
        EObject current = null;

        EObject this_Conditions_4 = null;

        EObject this_Assertion_5 = null;



        	enterRule();

        try {
            // InternalDatalog.g:113:2: ( ( ( () rulePlusSign ) | ( () ruleMinusSign ) | this_Conditions_4= ruleConditions | this_Assertion_5= ruleAssertion | ( () ruleCom ) ) )
            // InternalDatalog.g:114:2: ( ( () rulePlusSign ) | ( () ruleMinusSign ) | this_Conditions_4= ruleConditions | this_Assertion_5= ruleAssertion | ( () ruleCom ) )
            {
            // InternalDatalog.g:114:2: ( ( () rulePlusSign ) | ( () ruleMinusSign ) | this_Conditions_4= ruleConditions | this_Assertion_5= ruleAssertion | ( () ruleCom ) )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalDatalog.g:115:3: ( () rulePlusSign )
                    {
                    // InternalDatalog.g:115:3: ( () rulePlusSign )
                    // InternalDatalog.g:116:4: () rulePlusSign
                    {
                    // InternalDatalog.g:116:4: ()
                    // InternalDatalog.g:117:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getStatementsAccess().getStatementsAction_0_0(),
                      						current);
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementsAccess().getPlusSignParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    rulePlusSign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDatalog.g:132:3: ( () ruleMinusSign )
                    {
                    // InternalDatalog.g:132:3: ( () ruleMinusSign )
                    // InternalDatalog.g:133:4: () ruleMinusSign
                    {
                    // InternalDatalog.g:133:4: ()
                    // InternalDatalog.g:134:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getStatementsAccess().getStatementsAction_1_0(),
                      						current);
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementsAccess().getMinusSignParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleMinusSign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDatalog.g:149:3: this_Conditions_4= ruleConditions
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementsAccess().getConditionsParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Conditions_4=ruleConditions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Conditions_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalDatalog.g:158:3: this_Assertion_5= ruleAssertion
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getStatementsAccess().getAssertionParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Assertion_5=ruleAssertion();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Assertion_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalDatalog.g:167:3: ( () ruleCom )
                    {
                    // InternalDatalog.g:167:3: ( () ruleCom )
                    // InternalDatalog.g:168:4: () ruleCom
                    {
                    // InternalDatalog.g:168:4: ()
                    // InternalDatalog.g:169:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getStatementsAccess().getStatementsAction_4_0(),
                      						current);
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementsAccess().getComParserRuleCall_4_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    ruleCom();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatements"


    // $ANTLR start "entryRulePlusSign"
    // InternalDatalog.g:187:1: entryRulePlusSign returns [String current=null] : iv_rulePlusSign= rulePlusSign EOF ;
    public final String entryRulePlusSign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePlusSign = null;


        try {
            // InternalDatalog.g:187:48: (iv_rulePlusSign= rulePlusSign EOF )
            // InternalDatalog.g:188:2: iv_rulePlusSign= rulePlusSign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusSignRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlusSign=rulePlusSign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusSign.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusSign"


    // $ANTLR start "rulePlusSign"
    // InternalDatalog.g:194:1: rulePlusSign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+' ;
    public final AntlrDatatypeRuleToken rulePlusSign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDatalog.g:200:2: (kw= '+' )
            // InternalDatalog.g:201:2: kw= '+'
            {
            kw=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getPlusSignAccess().getPlusSignKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusSign"


    // $ANTLR start "entryRuleMinusSign"
    // InternalDatalog.g:209:1: entryRuleMinusSign returns [String current=null] : iv_ruleMinusSign= ruleMinusSign EOF ;
    public final String entryRuleMinusSign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMinusSign = null;


        try {
            // InternalDatalog.g:209:49: (iv_ruleMinusSign= ruleMinusSign EOF )
            // InternalDatalog.g:210:2: iv_ruleMinusSign= ruleMinusSign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinusSignRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMinusSign=ruleMinusSign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinusSign.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinusSign"


    // $ANTLR start "ruleMinusSign"
    // InternalDatalog.g:216:1: ruleMinusSign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '-' ;
    public final AntlrDatatypeRuleToken ruleMinusSign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDatalog.g:222:2: (kw= '-' )
            // InternalDatalog.g:223:2: kw= '-'
            {
            kw=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getMinusSignAccess().getHyphenMinusKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinusSign"


    // $ANTLR start "entryRuleCom"
    // InternalDatalog.g:231:1: entryRuleCom returns [String current=null] : iv_ruleCom= ruleCom EOF ;
    public final String entryRuleCom() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCom = null;


        try {
            // InternalDatalog.g:231:43: (iv_ruleCom= ruleCom EOF )
            // InternalDatalog.g:232:2: iv_ruleCom= ruleCom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCom=ruleCom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCom.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCom"


    // $ANTLR start "ruleCom"
    // InternalDatalog.g:238:1: ruleCom returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '/*' ( ( '*/' )=>kw= '*/' ) ) ;
    public final AntlrDatatypeRuleToken ruleCom() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDatalog.g:244:2: ( (kw= '/*' ( ( '*/' )=>kw= '*/' ) ) )
            // InternalDatalog.g:245:2: (kw= '/*' ( ( '*/' )=>kw= '*/' ) )
            {
            // InternalDatalog.g:245:2: (kw= '/*' ( ( '*/' )=>kw= '*/' ) )
            // InternalDatalog.g:246:3: kw= '/*' ( ( '*/' )=>kw= '*/' )
            {
            kw=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getComAccess().getSolidusAsteriskKeyword_0());
              		
            }
            // InternalDatalog.g:251:3: ( ( '*/' )=>kw= '*/' )
            // InternalDatalog.g:252:4: ( '*/' )=>kw= '*/'
            {
            kw=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				current.merge(kw);
              				newLeafNode(kw, grammarAccess.getComAccess().getAsteriskSolidusKeyword_1());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCom"


    // $ANTLR start "entryRuleConditions"
    // InternalDatalog.g:263:1: entryRuleConditions returns [EObject current=null] : iv_ruleConditions= ruleConditions EOF ;
    public final EObject entryRuleConditions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditions = null;


        try {
            // InternalDatalog.g:263:51: (iv_ruleConditions= ruleConditions EOF )
            // InternalDatalog.g:264:2: iv_ruleConditions= ruleConditions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConditions=ruleConditions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditions; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditions"


    // $ANTLR start "ruleConditions"
    // InternalDatalog.g:270:1: ruleConditions returns [EObject current=null] : ( ( (lv_Cond_0_0= ruleAtom ) ) otherlv_1= ':-' ( (lv_right_2_0= ruleFormula ) ) otherlv_3= '.' ) ;
    public final EObject ruleConditions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_Cond_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalDatalog.g:276:2: ( ( ( (lv_Cond_0_0= ruleAtom ) ) otherlv_1= ':-' ( (lv_right_2_0= ruleFormula ) ) otherlv_3= '.' ) )
            // InternalDatalog.g:277:2: ( ( (lv_Cond_0_0= ruleAtom ) ) otherlv_1= ':-' ( (lv_right_2_0= ruleFormula ) ) otherlv_3= '.' )
            {
            // InternalDatalog.g:277:2: ( ( (lv_Cond_0_0= ruleAtom ) ) otherlv_1= ':-' ( (lv_right_2_0= ruleFormula ) ) otherlv_3= '.' )
            // InternalDatalog.g:278:3: ( (lv_Cond_0_0= ruleAtom ) ) otherlv_1= ':-' ( (lv_right_2_0= ruleFormula ) ) otherlv_3= '.'
            {
            // InternalDatalog.g:278:3: ( (lv_Cond_0_0= ruleAtom ) )
            // InternalDatalog.g:279:4: (lv_Cond_0_0= ruleAtom )
            {
            // InternalDatalog.g:279:4: (lv_Cond_0_0= ruleAtom )
            // InternalDatalog.g:280:5: lv_Cond_0_0= ruleAtom
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionsAccess().getCondAtomParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_Cond_0_0=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionsRule());
              					}
              					set(
              						current,
              						"Cond",
              						lv_Cond_0_0,
              						"org.xtext.mde.Datalog.Atom");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConditionsAccess().getColonHyphenMinusKeyword_1());
              		
            }
            // InternalDatalog.g:301:3: ( (lv_right_2_0= ruleFormula ) )
            // InternalDatalog.g:302:4: (lv_right_2_0= ruleFormula )
            {
            // InternalDatalog.g:302:4: (lv_right_2_0= ruleFormula )
            // InternalDatalog.g:303:5: lv_right_2_0= ruleFormula
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConditionsAccess().getRightFormulaParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_right_2_0=ruleFormula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConditionsRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_2_0,
              						"org.xtext.mde.Datalog.Formula");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getConditionsAccess().getFullStopKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditions"


    // $ANTLR start "entryRuleAssertion"
    // InternalDatalog.g:328:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // InternalDatalog.g:328:50: (iv_ruleAssertion= ruleAssertion EOF )
            // InternalDatalog.g:329:2: iv_ruleAssertion= ruleAssertion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssertionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssertion=ruleAssertion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssertion; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssertion"


    // $ANTLR start "ruleAssertion"
    // InternalDatalog.g:335:1: ruleAssertion returns [EObject current=null] : ( ( (lv_Truth_0_0= ruleFormula ) ) otherlv_1= '.' ) ;
    public final EObject ruleAssertion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_Truth_0_0 = null;



        	enterRule();

        try {
            // InternalDatalog.g:341:2: ( ( ( (lv_Truth_0_0= ruleFormula ) ) otherlv_1= '.' ) )
            // InternalDatalog.g:342:2: ( ( (lv_Truth_0_0= ruleFormula ) ) otherlv_1= '.' )
            {
            // InternalDatalog.g:342:2: ( ( (lv_Truth_0_0= ruleFormula ) ) otherlv_1= '.' )
            // InternalDatalog.g:343:3: ( (lv_Truth_0_0= ruleFormula ) ) otherlv_1= '.'
            {
            // InternalDatalog.g:343:3: ( (lv_Truth_0_0= ruleFormula ) )
            // InternalDatalog.g:344:4: (lv_Truth_0_0= ruleFormula )
            {
            // InternalDatalog.g:344:4: (lv_Truth_0_0= ruleFormula )
            // InternalDatalog.g:345:5: lv_Truth_0_0= ruleFormula
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssertionAccess().getTruthFormulaParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_Truth_0_0=ruleFormula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssertionRule());
              					}
              					set(
              						current,
              						"Truth",
              						lv_Truth_0_0,
              						"org.xtext.mde.Datalog.Formula");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAssertionAccess().getFullStopKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssertion"


    // $ANTLR start "entryRuleFormula"
    // InternalDatalog.g:370:1: entryRuleFormula returns [EObject current=null] : iv_ruleFormula= ruleFormula EOF ;
    public final EObject entryRuleFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormula = null;


        try {
            // InternalDatalog.g:370:48: (iv_ruleFormula= ruleFormula EOF )
            // InternalDatalog.g:371:2: iv_ruleFormula= ruleFormula EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormulaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFormula=ruleFormula();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormula; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormula"


    // $ANTLR start "ruleFormula"
    // InternalDatalog.g:377:1: ruleFormula returns [EObject current=null] : (this_Atom_0= ruleAtom ( () otherlv_2= ',' ( (lv_right_3_0= ruleAtom ) ) )* ) ;
    public final EObject ruleFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Atom_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDatalog.g:383:2: ( (this_Atom_0= ruleAtom ( () otherlv_2= ',' ( (lv_right_3_0= ruleAtom ) ) )* ) )
            // InternalDatalog.g:384:2: (this_Atom_0= ruleAtom ( () otherlv_2= ',' ( (lv_right_3_0= ruleAtom ) ) )* )
            {
            // InternalDatalog.g:384:2: (this_Atom_0= ruleAtom ( () otherlv_2= ',' ( (lv_right_3_0= ruleAtom ) ) )* )
            // InternalDatalog.g:385:3: this_Atom_0= ruleAtom ( () otherlv_2= ',' ( (lv_right_3_0= ruleAtom ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFormulaAccess().getAtomParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_8);
            this_Atom_0=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Atom_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDatalog.g:393:3: ( () otherlv_2= ',' ( (lv_right_3_0= ruleAtom ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDatalog.g:394:4: () otherlv_2= ',' ( (lv_right_3_0= ruleAtom ) )
            	    {
            	    // InternalDatalog.g:394:4: ()
            	    // InternalDatalog.g:395:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getFormulaAccess().getFormulaLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getFormulaAccess().getCommaKeyword_1_1());
            	      			
            	    }
            	    // InternalDatalog.g:405:4: ( (lv_right_3_0= ruleAtom ) )
            	    // InternalDatalog.g:406:5: (lv_right_3_0= ruleAtom )
            	    {
            	    // InternalDatalog.g:406:5: (lv_right_3_0= ruleAtom )
            	    // InternalDatalog.g:407:6: lv_right_3_0= ruleAtom
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFormulaAccess().getRightAtomParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_right_3_0=ruleAtom();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getFormulaRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.mde.Datalog.Atom");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormula"


    // $ANTLR start "entryRuleAtom"
    // InternalDatalog.g:429:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalDatalog.g:429:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalDatalog.g:430:2: iv_ruleAtom= ruleAtom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtom; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalDatalog.g:436:1: ruleAtom returns [EObject current=null] : ( ( (lv_name_0_0= ruleParameterPred ) ) otherlv_1= '(' ( (lv_list_2_0= ruleParamList ) ) otherlv_3= ')' ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_0_0 = null;

        EObject lv_list_2_0 = null;



        	enterRule();

        try {
            // InternalDatalog.g:442:2: ( ( ( (lv_name_0_0= ruleParameterPred ) ) otherlv_1= '(' ( (lv_list_2_0= ruleParamList ) ) otherlv_3= ')' ) )
            // InternalDatalog.g:443:2: ( ( (lv_name_0_0= ruleParameterPred ) ) otherlv_1= '(' ( (lv_list_2_0= ruleParamList ) ) otherlv_3= ')' )
            {
            // InternalDatalog.g:443:2: ( ( (lv_name_0_0= ruleParameterPred ) ) otherlv_1= '(' ( (lv_list_2_0= ruleParamList ) ) otherlv_3= ')' )
            // InternalDatalog.g:444:3: ( (lv_name_0_0= ruleParameterPred ) ) otherlv_1= '(' ( (lv_list_2_0= ruleParamList ) ) otherlv_3= ')'
            {
            // InternalDatalog.g:444:3: ( (lv_name_0_0= ruleParameterPred ) )
            // InternalDatalog.g:445:4: (lv_name_0_0= ruleParameterPred )
            {
            // InternalDatalog.g:445:4: (lv_name_0_0= ruleParameterPred )
            // InternalDatalog.g:446:5: lv_name_0_0= ruleParameterPred
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAtomAccess().getNameParameterPredParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_name_0_0=ruleParameterPred();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAtomRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.xtext.mde.Datalog.ParameterPred");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalDatalog.g:467:3: ( (lv_list_2_0= ruleParamList ) )
            // InternalDatalog.g:468:4: (lv_list_2_0= ruleParamList )
            {
            // InternalDatalog.g:468:4: (lv_list_2_0= ruleParamList )
            // InternalDatalog.g:469:5: lv_list_2_0= ruleParamList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAtomAccess().getListParamListParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_list_2_0=ruleParamList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAtomRule());
              					}
              					set(
              						current,
              						"list",
              						lv_list_2_0,
              						"org.xtext.mde.Datalog.ParamList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAtomAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleParamList"
    // InternalDatalog.g:494:1: entryRuleParamList returns [EObject current=null] : iv_ruleParamList= ruleParamList EOF ;
    public final EObject entryRuleParamList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamList = null;


        try {
            // InternalDatalog.g:494:50: (iv_ruleParamList= ruleParamList EOF )
            // InternalDatalog.g:495:2: iv_ruleParamList= ruleParamList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParamList=ruleParamList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParamList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParamList"


    // $ANTLR start "ruleParamList"
    // InternalDatalog.g:501:1: ruleParamList returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= ',' ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleParamList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDatalog.g:507:2: ( (this_Primary_0= rulePrimary ( () otherlv_2= ',' ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalDatalog.g:508:2: (this_Primary_0= rulePrimary ( () otherlv_2= ',' ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalDatalog.g:508:2: (this_Primary_0= rulePrimary ( () otherlv_2= ',' ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalDatalog.g:509:3: this_Primary_0= rulePrimary ( () otherlv_2= ',' ( (lv_right_3_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParamListAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_8);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDatalog.g:517:3: ( () otherlv_2= ',' ( (lv_right_3_0= rulePrimary ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDatalog.g:518:4: () otherlv_2= ',' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalDatalog.g:518:4: ()
            	    // InternalDatalog.g:519:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getParamListAccess().getParamListLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getParamListAccess().getCommaKeyword_1_1());
            	      			
            	    }
            	    // InternalDatalog.g:529:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalDatalog.g:530:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalDatalog.g:530:5: (lv_right_3_0= rulePrimary )
            	    // InternalDatalog.g:531:6: lv_right_3_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getParamListAccess().getRightPrimaryParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getParamListRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.mde.Datalog.Primary");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParamList"


    // $ANTLR start "entryRulePrimary"
    // InternalDatalog.g:553:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalDatalog.g:553:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalDatalog.g:554:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalDatalog.g:560:1: rulePrimary returns [EObject current=null] : (this_ParameterPred_0= ruleParameterPred | this_ParameterVar_1= ruleParameterVar | this_ParameterInt_2= ruleParameterInt ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterPred_0 = null;

        EObject this_ParameterVar_1 = null;

        EObject this_ParameterInt_2 = null;



        	enterRule();

        try {
            // InternalDatalog.g:566:2: ( (this_ParameterPred_0= ruleParameterPred | this_ParameterVar_1= ruleParameterVar | this_ParameterInt_2= ruleParameterInt ) )
            // InternalDatalog.g:567:2: (this_ParameterPred_0= ruleParameterPred | this_ParameterVar_1= ruleParameterVar | this_ParameterInt_2= ruleParameterInt )
            {
            // InternalDatalog.g:567:2: (this_ParameterPred_0= ruleParameterPred | this_ParameterVar_1= ruleParameterVar | this_ParameterInt_2= ruleParameterInt )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_PREDICATE:
                {
                alt5=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt5=2;
                }
                break;
            case RULE_INT:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDatalog.g:568:3: this_ParameterPred_0= ruleParameterPred
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryAccess().getParameterPredParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterPred_0=ruleParameterPred();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterPred_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDatalog.g:577:3: this_ParameterVar_1= ruleParameterVar
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryAccess().getParameterVarParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterVar_1=ruleParameterVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterVar_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalDatalog.g:586:3: this_ParameterInt_2= ruleParameterInt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryAccess().getParameterIntParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterInt_2=ruleParameterInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterInt_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParameterInt"
    // InternalDatalog.g:598:1: entryRuleParameterInt returns [EObject current=null] : iv_ruleParameterInt= ruleParameterInt EOF ;
    public final EObject entryRuleParameterInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterInt = null;


        try {
            // InternalDatalog.g:598:53: (iv_ruleParameterInt= ruleParameterInt EOF )
            // InternalDatalog.g:599:2: iv_ruleParameterInt= ruleParameterInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterIntRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterInt=ruleParameterInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterInt; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterInt"


    // $ANTLR start "ruleParameterInt"
    // InternalDatalog.g:605:1: ruleParameterInt returns [EObject current=null] : ( (lv_int_0_0= RULE_INT ) ) ;
    public final EObject ruleParameterInt() throws RecognitionException {
        EObject current = null;

        Token lv_int_0_0=null;


        	enterRule();

        try {
            // InternalDatalog.g:611:2: ( ( (lv_int_0_0= RULE_INT ) ) )
            // InternalDatalog.g:612:2: ( (lv_int_0_0= RULE_INT ) )
            {
            // InternalDatalog.g:612:2: ( (lv_int_0_0= RULE_INT ) )
            // InternalDatalog.g:613:3: (lv_int_0_0= RULE_INT )
            {
            // InternalDatalog.g:613:3: (lv_int_0_0= RULE_INT )
            // InternalDatalog.g:614:4: lv_int_0_0= RULE_INT
            {
            lv_int_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_int_0_0, grammarAccess.getParameterIntAccess().getIntINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getParameterIntRule());
              				}
              				setWithLastConsumed(
              					current,
              					"int",
              					lv_int_0_0,
              					"org.eclipse.xtext.common.Terminals.INT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterInt"


    // $ANTLR start "entryRuleParameterVar"
    // InternalDatalog.g:633:1: entryRuleParameterVar returns [EObject current=null] : iv_ruleParameterVar= ruleParameterVar EOF ;
    public final EObject entryRuleParameterVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterVar = null;


        try {
            // InternalDatalog.g:633:53: (iv_ruleParameterVar= ruleParameterVar EOF )
            // InternalDatalog.g:634:2: iv_ruleParameterVar= ruleParameterVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterVarRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterVar=ruleParameterVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterVar; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterVar"


    // $ANTLR start "ruleParameterVar"
    // InternalDatalog.g:640:1: ruleParameterVar returns [EObject current=null] : ( (lv_up_0_0= RULE_VARIABLE ) ) ;
    public final EObject ruleParameterVar() throws RecognitionException {
        EObject current = null;

        Token lv_up_0_0=null;


        	enterRule();

        try {
            // InternalDatalog.g:646:2: ( ( (lv_up_0_0= RULE_VARIABLE ) ) )
            // InternalDatalog.g:647:2: ( (lv_up_0_0= RULE_VARIABLE ) )
            {
            // InternalDatalog.g:647:2: ( (lv_up_0_0= RULE_VARIABLE ) )
            // InternalDatalog.g:648:3: (lv_up_0_0= RULE_VARIABLE )
            {
            // InternalDatalog.g:648:3: (lv_up_0_0= RULE_VARIABLE )
            // InternalDatalog.g:649:4: lv_up_0_0= RULE_VARIABLE
            {
            lv_up_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_up_0_0, grammarAccess.getParameterVarAccess().getUpVARIABLETerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getParameterVarRule());
              				}
              				setWithLastConsumed(
              					current,
              					"up",
              					lv_up_0_0,
              					"org.xtext.mde.Datalog.VARIABLE");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterVar"


    // $ANTLR start "entryRuleParameterPred"
    // InternalDatalog.g:668:1: entryRuleParameterPred returns [EObject current=null] : iv_ruleParameterPred= ruleParameterPred EOF ;
    public final EObject entryRuleParameterPred() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterPred = null;


        try {
            // InternalDatalog.g:668:54: (iv_ruleParameterPred= ruleParameterPred EOF )
            // InternalDatalog.g:669:2: iv_ruleParameterPred= ruleParameterPred EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterPredRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterPred=ruleParameterPred();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterPred; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterPred"


    // $ANTLR start "ruleParameterPred"
    // InternalDatalog.g:675:1: ruleParameterPred returns [EObject current=null] : ( (lv_low_0_0= RULE_PREDICATE ) ) ;
    public final EObject ruleParameterPred() throws RecognitionException {
        EObject current = null;

        Token lv_low_0_0=null;


        	enterRule();

        try {
            // InternalDatalog.g:681:2: ( ( (lv_low_0_0= RULE_PREDICATE ) ) )
            // InternalDatalog.g:682:2: ( (lv_low_0_0= RULE_PREDICATE ) )
            {
            // InternalDatalog.g:682:2: ( (lv_low_0_0= RULE_PREDICATE ) )
            // InternalDatalog.g:683:3: (lv_low_0_0= RULE_PREDICATE )
            {
            // InternalDatalog.g:683:3: (lv_low_0_0= RULE_PREDICATE )
            // InternalDatalog.g:684:4: lv_low_0_0= RULE_PREDICATE
            {
            lv_low_0_0=(Token)match(input,RULE_PREDICATE,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_low_0_0, grammarAccess.getParameterPredAccess().getLowPREDICATETerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getParameterPredRule());
              				}
              				setWithLastConsumed(
              					current,
              					"low",
              					lv_low_0_0,
              					"org.xtext.mde.Datalog.PREDICATE");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterPred"

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
            return "114:2: ( ( () rulePlusSign ) | ( () ruleMinusSign ) | this_Conditions_4= ruleConditions | this_Assertion_5= ruleAssertion | ( () ruleCom ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000E042L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});

}