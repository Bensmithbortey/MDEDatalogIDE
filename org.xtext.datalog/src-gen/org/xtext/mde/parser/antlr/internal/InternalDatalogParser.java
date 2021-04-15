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

@SuppressWarnings("all")
public class InternalDatalogParser extends AbstractInternalAntlrParser {
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
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDatalog.g:71:1: ruleModel returns [EObject current=null] : ( (lv_Program_0_0= ruleStmtPlusMinus ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_Program_0_0 = null;



        	enterRule();

        try {
            // InternalDatalog.g:77:2: ( ( (lv_Program_0_0= ruleStmtPlusMinus ) )* )
            // InternalDatalog.g:78:2: ( (lv_Program_0_0= ruleStmtPlusMinus ) )*
            {
            // InternalDatalog.g:78:2: ( (lv_Program_0_0= ruleStmtPlusMinus ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDatalog.g:79:3: (lv_Program_0_0= ruleStmtPlusMinus )
            	    {
            	    // InternalDatalog.g:79:3: (lv_Program_0_0= ruleStmtPlusMinus )
            	    // InternalDatalog.g:80:4: lv_Program_0_0= ruleStmtPlusMinus
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getProgramStmtPlusMinusParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_Program_0_0=ruleStmtPlusMinus();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"Program",
            	    					lv_Program_0_0,
            	    					"org.xtext.mde.Datalog.StmtPlusMinus");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleStmtPlusMinus"
    // InternalDatalog.g:100:1: entryRuleStmtPlusMinus returns [EObject current=null] : iv_ruleStmtPlusMinus= ruleStmtPlusMinus EOF ;
    public final EObject entryRuleStmtPlusMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmtPlusMinus = null;


        try {
            // InternalDatalog.g:100:54: (iv_ruleStmtPlusMinus= ruleStmtPlusMinus EOF )
            // InternalDatalog.g:101:2: iv_ruleStmtPlusMinus= ruleStmtPlusMinus EOF
            {
             newCompositeNode(grammarAccess.getStmtPlusMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStmtPlusMinus=ruleStmtPlusMinus();

            state._fsp--;

             current =iv_ruleStmtPlusMinus; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStmtPlusMinus"


    // $ANTLR start "ruleStmtPlusMinus"
    // InternalDatalog.g:107:1: ruleStmtPlusMinus returns [EObject current=null] : ( ( (lv_left_0_0= ruleStmtPlus ) ) ( (lv_right_1_0= ruleStmtMinus ) ) ) ;
    public final EObject ruleStmtPlusMinus() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalDatalog.g:113:2: ( ( ( (lv_left_0_0= ruleStmtPlus ) ) ( (lv_right_1_0= ruleStmtMinus ) ) ) )
            // InternalDatalog.g:114:2: ( ( (lv_left_0_0= ruleStmtPlus ) ) ( (lv_right_1_0= ruleStmtMinus ) ) )
            {
            // InternalDatalog.g:114:2: ( ( (lv_left_0_0= ruleStmtPlus ) ) ( (lv_right_1_0= ruleStmtMinus ) ) )
            // InternalDatalog.g:115:3: ( (lv_left_0_0= ruleStmtPlus ) ) ( (lv_right_1_0= ruleStmtMinus ) )
            {
            // InternalDatalog.g:115:3: ( (lv_left_0_0= ruleStmtPlus ) )
            // InternalDatalog.g:116:4: (lv_left_0_0= ruleStmtPlus )
            {
            // InternalDatalog.g:116:4: (lv_left_0_0= ruleStmtPlus )
            // InternalDatalog.g:117:5: lv_left_0_0= ruleStmtPlus
            {

            					newCompositeNode(grammarAccess.getStmtPlusMinusAccess().getLeftStmtPlusParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_left_0_0=ruleStmtPlus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStmtPlusMinusRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.xtext.mde.Datalog.StmtPlus");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDatalog.g:134:3: ( (lv_right_1_0= ruleStmtMinus ) )
            // InternalDatalog.g:135:4: (lv_right_1_0= ruleStmtMinus )
            {
            // InternalDatalog.g:135:4: (lv_right_1_0= ruleStmtMinus )
            // InternalDatalog.g:136:5: lv_right_1_0= ruleStmtMinus
            {

            					newCompositeNode(grammarAccess.getStmtPlusMinusAccess().getRightStmtMinusParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_1_0=ruleStmtMinus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStmtPlusMinusRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_1_0,
            						"org.xtext.mde.Datalog.StmtMinus");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStmtPlusMinus"


    // $ANTLR start "entryRuleStmtPlus"
    // InternalDatalog.g:157:1: entryRuleStmtPlus returns [EObject current=null] : iv_ruleStmtPlus= ruleStmtPlus EOF ;
    public final EObject entryRuleStmtPlus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmtPlus = null;


        try {
            // InternalDatalog.g:157:49: (iv_ruleStmtPlus= ruleStmtPlus EOF )
            // InternalDatalog.g:158:2: iv_ruleStmtPlus= ruleStmtPlus EOF
            {
             newCompositeNode(grammarAccess.getStmtPlusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStmtPlus=ruleStmtPlus();

            state._fsp--;

             current =iv_ruleStmtPlus; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStmtPlus"


    // $ANTLR start "ruleStmtPlus"
    // InternalDatalog.g:164:1: ruleStmtPlus returns [EObject current=null] : ( ( (lv_plus_0_0= '+' ) ) ( () ( (lv_rightPlus_2_0= ruleStatements ) ) )+ ) ;
    public final EObject ruleStmtPlus() throws RecognitionException {
        EObject current = null;

        Token lv_plus_0_0=null;
        EObject lv_rightPlus_2_0 = null;



        	enterRule();

        try {
            // InternalDatalog.g:170:2: ( ( ( (lv_plus_0_0= '+' ) ) ( () ( (lv_rightPlus_2_0= ruleStatements ) ) )+ ) )
            // InternalDatalog.g:171:2: ( ( (lv_plus_0_0= '+' ) ) ( () ( (lv_rightPlus_2_0= ruleStatements ) ) )+ )
            {
            // InternalDatalog.g:171:2: ( ( (lv_plus_0_0= '+' ) ) ( () ( (lv_rightPlus_2_0= ruleStatements ) ) )+ )
            // InternalDatalog.g:172:3: ( (lv_plus_0_0= '+' ) ) ( () ( (lv_rightPlus_2_0= ruleStatements ) ) )+
            {
            // InternalDatalog.g:172:3: ( (lv_plus_0_0= '+' ) )
            // InternalDatalog.g:173:4: (lv_plus_0_0= '+' )
            {
            // InternalDatalog.g:173:4: (lv_plus_0_0= '+' )
            // InternalDatalog.g:174:5: lv_plus_0_0= '+'
            {
            lv_plus_0_0=(Token)match(input,11,FOLLOW_5); 

            					newLeafNode(lv_plus_0_0, grammarAccess.getStmtPlusAccess().getPlusPlusSignKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStmtPlusRule());
            					}
            					setWithLastConsumed(current, "plus", lv_plus_0_0, "+");
            				

            }


            }

            // InternalDatalog.g:186:3: ( () ( (lv_rightPlus_2_0= ruleStatements ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDatalog.g:187:4: () ( (lv_rightPlus_2_0= ruleStatements ) )
            	    {
            	    // InternalDatalog.g:187:4: ()
            	    // InternalDatalog.g:188:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getStmtPlusAccess().getStmtPlusLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDatalog.g:194:4: ( (lv_rightPlus_2_0= ruleStatements ) )
            	    // InternalDatalog.g:195:5: (lv_rightPlus_2_0= ruleStatements )
            	    {
            	    // InternalDatalog.g:195:5: (lv_rightPlus_2_0= ruleStatements )
            	    // InternalDatalog.g:196:6: lv_rightPlus_2_0= ruleStatements
            	    {

            	    						newCompositeNode(grammarAccess.getStmtPlusAccess().getRightPlusStatementsParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_rightPlus_2_0=ruleStatements();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStmtPlusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rightPlus",
            	    							lv_rightPlus_2_0,
            	    							"org.xtext.mde.Datalog.Statements");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStmtPlus"


    // $ANTLR start "entryRuleStmtMinus"
    // InternalDatalog.g:218:1: entryRuleStmtMinus returns [EObject current=null] : iv_ruleStmtMinus= ruleStmtMinus EOF ;
    public final EObject entryRuleStmtMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmtMinus = null;


        try {
            // InternalDatalog.g:218:50: (iv_ruleStmtMinus= ruleStmtMinus EOF )
            // InternalDatalog.g:219:2: iv_ruleStmtMinus= ruleStmtMinus EOF
            {
             newCompositeNode(grammarAccess.getStmtMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStmtMinus=ruleStmtMinus();

            state._fsp--;

             current =iv_ruleStmtMinus; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStmtMinus"


    // $ANTLR start "ruleStmtMinus"
    // InternalDatalog.g:225:1: ruleStmtMinus returns [EObject current=null] : ( ( (lv_minus_0_0= '-' ) ) ( () ( (lv_rightMinus_2_0= ruleAssertionMinus ) ) )* ) ;
    public final EObject ruleStmtMinus() throws RecognitionException {
        EObject current = null;

        Token lv_minus_0_0=null;
        EObject lv_rightMinus_2_0 = null;



        	enterRule();

        try {
            // InternalDatalog.g:231:2: ( ( ( (lv_minus_0_0= '-' ) ) ( () ( (lv_rightMinus_2_0= ruleAssertionMinus ) ) )* ) )
            // InternalDatalog.g:232:2: ( ( (lv_minus_0_0= '-' ) ) ( () ( (lv_rightMinus_2_0= ruleAssertionMinus ) ) )* )
            {
            // InternalDatalog.g:232:2: ( ( (lv_minus_0_0= '-' ) ) ( () ( (lv_rightMinus_2_0= ruleAssertionMinus ) ) )* )
            // InternalDatalog.g:233:3: ( (lv_minus_0_0= '-' ) ) ( () ( (lv_rightMinus_2_0= ruleAssertionMinus ) ) )*
            {
            // InternalDatalog.g:233:3: ( (lv_minus_0_0= '-' ) )
            // InternalDatalog.g:234:4: (lv_minus_0_0= '-' )
            {
            // InternalDatalog.g:234:4: (lv_minus_0_0= '-' )
            // InternalDatalog.g:235:5: lv_minus_0_0= '-'
            {
            lv_minus_0_0=(Token)match(input,12,FOLLOW_6); 

            					newLeafNode(lv_minus_0_0, grammarAccess.getStmtMinusAccess().getMinusHyphenMinusKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStmtMinusRule());
            					}
            					setWithLastConsumed(current, "minus", lv_minus_0_0, "-");
            				

            }


            }

            // InternalDatalog.g:247:3: ( () ( (lv_rightMinus_2_0= ruleAssertionMinus ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDatalog.g:248:4: () ( (lv_rightMinus_2_0= ruleAssertionMinus ) )
            	    {
            	    // InternalDatalog.g:248:4: ()
            	    // InternalDatalog.g:249:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getStmtMinusAccess().getStmtMinusLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDatalog.g:255:4: ( (lv_rightMinus_2_0= ruleAssertionMinus ) )
            	    // InternalDatalog.g:256:5: (lv_rightMinus_2_0= ruleAssertionMinus )
            	    {
            	    // InternalDatalog.g:256:5: (lv_rightMinus_2_0= ruleAssertionMinus )
            	    // InternalDatalog.g:257:6: lv_rightMinus_2_0= ruleAssertionMinus
            	    {

            	    						newCompositeNode(grammarAccess.getStmtMinusAccess().getRightMinusAssertionMinusParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_rightMinus_2_0=ruleAssertionMinus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStmtMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rightMinus",
            	    							lv_rightMinus_2_0,
            	    							"org.xtext.mde.Datalog.AssertionMinus");
            	    						afterParserOrEnumRuleCall();
            	    					

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


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStmtMinus"


    // $ANTLR start "entryRuleStatements"
    // InternalDatalog.g:279:1: entryRuleStatements returns [EObject current=null] : iv_ruleStatements= ruleStatements EOF ;
    public final EObject entryRuleStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatements = null;


        try {
            // InternalDatalog.g:279:51: (iv_ruleStatements= ruleStatements EOF )
            // InternalDatalog.g:280:2: iv_ruleStatements= ruleStatements EOF
            {
             newCompositeNode(grammarAccess.getStatementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatements=ruleStatements();

            state._fsp--;

             current =iv_ruleStatements; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDatalog.g:286:1: ruleStatements returns [EObject current=null] : ( ( (lv_condition_0_0= ruleConditions ) ) | ( (lv_assertion_1_0= ruleAssertion ) ) ) ;
    public final EObject ruleStatements() throws RecognitionException {
        EObject current = null;

        EObject lv_condition_0_0 = null;

        EObject lv_assertion_1_0 = null;



        	enterRule();

        try {
            // InternalDatalog.g:292:2: ( ( ( (lv_condition_0_0= ruleConditions ) ) | ( (lv_assertion_1_0= ruleAssertion ) ) ) )
            // InternalDatalog.g:293:2: ( ( (lv_condition_0_0= ruleConditions ) ) | ( (lv_assertion_1_0= ruleAssertion ) ) )
            {
            // InternalDatalog.g:293:2: ( ( (lv_condition_0_0= ruleConditions ) ) | ( (lv_assertion_1_0= ruleAssertion ) ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalDatalog.g:294:3: ( (lv_condition_0_0= ruleConditions ) )
                    {
                    // InternalDatalog.g:294:3: ( (lv_condition_0_0= ruleConditions ) )
                    // InternalDatalog.g:295:4: (lv_condition_0_0= ruleConditions )
                    {
                    // InternalDatalog.g:295:4: (lv_condition_0_0= ruleConditions )
                    // InternalDatalog.g:296:5: lv_condition_0_0= ruleConditions
                    {

                    					newCompositeNode(grammarAccess.getStatementsAccess().getConditionConditionsParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_condition_0_0=ruleConditions();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementsRule());
                    					}
                    					set(
                    						current,
                    						"condition",
                    						lv_condition_0_0,
                    						"org.xtext.mde.Datalog.Conditions");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDatalog.g:314:3: ( (lv_assertion_1_0= ruleAssertion ) )
                    {
                    // InternalDatalog.g:314:3: ( (lv_assertion_1_0= ruleAssertion ) )
                    // InternalDatalog.g:315:4: (lv_assertion_1_0= ruleAssertion )
                    {
                    // InternalDatalog.g:315:4: (lv_assertion_1_0= ruleAssertion )
                    // InternalDatalog.g:316:5: lv_assertion_1_0= ruleAssertion
                    {

                    					newCompositeNode(grammarAccess.getStatementsAccess().getAssertionAssertionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_assertion_1_0=ruleAssertion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementsRule());
                    					}
                    					set(
                    						current,
                    						"assertion",
                    						lv_assertion_1_0,
                    						"org.xtext.mde.Datalog.Assertion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleConditions"
    // InternalDatalog.g:337:1: entryRuleConditions returns [EObject current=null] : iv_ruleConditions= ruleConditions EOF ;
    public final EObject entryRuleConditions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditions = null;


        try {
            // InternalDatalog.g:337:51: (iv_ruleConditions= ruleConditions EOF )
            // InternalDatalog.g:338:2: iv_ruleConditions= ruleConditions EOF
            {
             newCompositeNode(grammarAccess.getConditionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditions=ruleConditions();

            state._fsp--;

             current =iv_ruleConditions; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDatalog.g:344:1: ruleConditions returns [EObject current=null] : ( ( (lv_Cond_0_0= ruleAtom ) ) ( (lv_Sign_1_0= ':-' ) ) ( (lv_right_2_0= ruleFormulaC ) ) ( (lv_dot_3_0= '.' ) ) ) ;
    public final EObject ruleConditions() throws RecognitionException {
        EObject current = null;

        Token lv_Sign_1_0=null;
        Token lv_dot_3_0=null;
        EObject lv_Cond_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalDatalog.g:350:2: ( ( ( (lv_Cond_0_0= ruleAtom ) ) ( (lv_Sign_1_0= ':-' ) ) ( (lv_right_2_0= ruleFormulaC ) ) ( (lv_dot_3_0= '.' ) ) ) )
            // InternalDatalog.g:351:2: ( ( (lv_Cond_0_0= ruleAtom ) ) ( (lv_Sign_1_0= ':-' ) ) ( (lv_right_2_0= ruleFormulaC ) ) ( (lv_dot_3_0= '.' ) ) )
            {
            // InternalDatalog.g:351:2: ( ( (lv_Cond_0_0= ruleAtom ) ) ( (lv_Sign_1_0= ':-' ) ) ( (lv_right_2_0= ruleFormulaC ) ) ( (lv_dot_3_0= '.' ) ) )
            // InternalDatalog.g:352:3: ( (lv_Cond_0_0= ruleAtom ) ) ( (lv_Sign_1_0= ':-' ) ) ( (lv_right_2_0= ruleFormulaC ) ) ( (lv_dot_3_0= '.' ) )
            {
            // InternalDatalog.g:352:3: ( (lv_Cond_0_0= ruleAtom ) )
            // InternalDatalog.g:353:4: (lv_Cond_0_0= ruleAtom )
            {
            // InternalDatalog.g:353:4: (lv_Cond_0_0= ruleAtom )
            // InternalDatalog.g:354:5: lv_Cond_0_0= ruleAtom
            {

            					newCompositeNode(grammarAccess.getConditionsAccess().getCondAtomParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_Cond_0_0=ruleAtom();

            state._fsp--;


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

            // InternalDatalog.g:371:3: ( (lv_Sign_1_0= ':-' ) )
            // InternalDatalog.g:372:4: (lv_Sign_1_0= ':-' )
            {
            // InternalDatalog.g:372:4: (lv_Sign_1_0= ':-' )
            // InternalDatalog.g:373:5: lv_Sign_1_0= ':-'
            {
            lv_Sign_1_0=(Token)match(input,13,FOLLOW_5); 

            					newLeafNode(lv_Sign_1_0, grammarAccess.getConditionsAccess().getSignColonHyphenMinusKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionsRule());
            					}
            					setWithLastConsumed(current, "Sign", lv_Sign_1_0, ":-");
            				

            }


            }

            // InternalDatalog.g:385:3: ( (lv_right_2_0= ruleFormulaC ) )
            // InternalDatalog.g:386:4: (lv_right_2_0= ruleFormulaC )
            {
            // InternalDatalog.g:386:4: (lv_right_2_0= ruleFormulaC )
            // InternalDatalog.g:387:5: lv_right_2_0= ruleFormulaC
            {

            					newCompositeNode(grammarAccess.getConditionsAccess().getRightFormulaCParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_right_2_0=ruleFormulaC();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionsRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"org.xtext.mde.Datalog.FormulaC");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDatalog.g:404:3: ( (lv_dot_3_0= '.' ) )
            // InternalDatalog.g:405:4: (lv_dot_3_0= '.' )
            {
            // InternalDatalog.g:405:4: (lv_dot_3_0= '.' )
            // InternalDatalog.g:406:5: lv_dot_3_0= '.'
            {
            lv_dot_3_0=(Token)match(input,14,FOLLOW_2); 

            					newLeafNode(lv_dot_3_0, grammarAccess.getConditionsAccess().getDotFullStopKeyword_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionsRule());
            					}
            					setWithLastConsumed(current, "dot", lv_dot_3_0, ".");
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalDatalog.g:422:1: entryRuleAssertion returns [EObject current=null] : iv_ruleAssertion= ruleAssertion EOF ;
    public final EObject entryRuleAssertion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertion = null;


        try {
            // InternalDatalog.g:422:50: (iv_ruleAssertion= ruleAssertion EOF )
            // InternalDatalog.g:423:2: iv_ruleAssertion= ruleAssertion EOF
            {
             newCompositeNode(grammarAccess.getAssertionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertion=ruleAssertion();

            state._fsp--;

             current =iv_ruleAssertion; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDatalog.g:429:1: ruleAssertion returns [EObject current=null] : ( ( (lv_Truth_0_0= ruleAtom ) ) ( (lv_dot_1_0= '.' ) ) ) ;
    public final EObject ruleAssertion() throws RecognitionException {
        EObject current = null;

        Token lv_dot_1_0=null;
        EObject lv_Truth_0_0 = null;



        	enterRule();

        try {
            // InternalDatalog.g:435:2: ( ( ( (lv_Truth_0_0= ruleAtom ) ) ( (lv_dot_1_0= '.' ) ) ) )
            // InternalDatalog.g:436:2: ( ( (lv_Truth_0_0= ruleAtom ) ) ( (lv_dot_1_0= '.' ) ) )
            {
            // InternalDatalog.g:436:2: ( ( (lv_Truth_0_0= ruleAtom ) ) ( (lv_dot_1_0= '.' ) ) )
            // InternalDatalog.g:437:3: ( (lv_Truth_0_0= ruleAtom ) ) ( (lv_dot_1_0= '.' ) )
            {
            // InternalDatalog.g:437:3: ( (lv_Truth_0_0= ruleAtom ) )
            // InternalDatalog.g:438:4: (lv_Truth_0_0= ruleAtom )
            {
            // InternalDatalog.g:438:4: (lv_Truth_0_0= ruleAtom )
            // InternalDatalog.g:439:5: lv_Truth_0_0= ruleAtom
            {

            					newCompositeNode(grammarAccess.getAssertionAccess().getTruthAtomParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_Truth_0_0=ruleAtom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssertionRule());
            					}
            					set(
            						current,
            						"Truth",
            						lv_Truth_0_0,
            						"org.xtext.mde.Datalog.Atom");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDatalog.g:456:3: ( (lv_dot_1_0= '.' ) )
            // InternalDatalog.g:457:4: (lv_dot_1_0= '.' )
            {
            // InternalDatalog.g:457:4: (lv_dot_1_0= '.' )
            // InternalDatalog.g:458:5: lv_dot_1_0= '.'
            {
            lv_dot_1_0=(Token)match(input,14,FOLLOW_2); 

            					newLeafNode(lv_dot_1_0, grammarAccess.getAssertionAccess().getDotFullStopKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssertionRule());
            					}
            					setWithLastConsumed(current, "dot", lv_dot_1_0, ".");
            				

            }


            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleAssertionMinus"
    // InternalDatalog.g:474:1: entryRuleAssertionMinus returns [EObject current=null] : iv_ruleAssertionMinus= ruleAssertionMinus EOF ;
    public final EObject entryRuleAssertionMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertionMinus = null;


        try {
            // InternalDatalog.g:474:55: (iv_ruleAssertionMinus= ruleAssertionMinus EOF )
            // InternalDatalog.g:475:2: iv_ruleAssertionMinus= ruleAssertionMinus EOF
            {
             newCompositeNode(grammarAccess.getAssertionMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssertionMinus=ruleAssertionMinus();

            state._fsp--;

             current =iv_ruleAssertionMinus; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssertionMinus"


    // $ANTLR start "ruleAssertionMinus"
    // InternalDatalog.g:481:1: ruleAssertionMinus returns [EObject current=null] : ( ( (lv_Check_0_0= ruleFormulaC ) ) ( (lv_dot_1_0= '.' ) ) ) ;
    public final EObject ruleAssertionMinus() throws RecognitionException {
        EObject current = null;

        Token lv_dot_1_0=null;
        EObject lv_Check_0_0 = null;



        	enterRule();

        try {
            // InternalDatalog.g:487:2: ( ( ( (lv_Check_0_0= ruleFormulaC ) ) ( (lv_dot_1_0= '.' ) ) ) )
            // InternalDatalog.g:488:2: ( ( (lv_Check_0_0= ruleFormulaC ) ) ( (lv_dot_1_0= '.' ) ) )
            {
            // InternalDatalog.g:488:2: ( ( (lv_Check_0_0= ruleFormulaC ) ) ( (lv_dot_1_0= '.' ) ) )
            // InternalDatalog.g:489:3: ( (lv_Check_0_0= ruleFormulaC ) ) ( (lv_dot_1_0= '.' ) )
            {
            // InternalDatalog.g:489:3: ( (lv_Check_0_0= ruleFormulaC ) )
            // InternalDatalog.g:490:4: (lv_Check_0_0= ruleFormulaC )
            {
            // InternalDatalog.g:490:4: (lv_Check_0_0= ruleFormulaC )
            // InternalDatalog.g:491:5: lv_Check_0_0= ruleFormulaC
            {

            					newCompositeNode(grammarAccess.getAssertionMinusAccess().getCheckFormulaCParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_Check_0_0=ruleFormulaC();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssertionMinusRule());
            					}
            					set(
            						current,
            						"Check",
            						lv_Check_0_0,
            						"org.xtext.mde.Datalog.FormulaC");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDatalog.g:508:3: ( (lv_dot_1_0= '.' ) )
            // InternalDatalog.g:509:4: (lv_dot_1_0= '.' )
            {
            // InternalDatalog.g:509:4: (lv_dot_1_0= '.' )
            // InternalDatalog.g:510:5: lv_dot_1_0= '.'
            {
            lv_dot_1_0=(Token)match(input,14,FOLLOW_2); 

            					newLeafNode(lv_dot_1_0, grammarAccess.getAssertionMinusAccess().getDotFullStopKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssertionMinusRule());
            					}
            					setWithLastConsumed(current, "dot", lv_dot_1_0, ".");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssertionMinus"


    // $ANTLR start "entryRuleFormulaC"
    // InternalDatalog.g:526:1: entryRuleFormulaC returns [EObject current=null] : iv_ruleFormulaC= ruleFormulaC EOF ;
    public final EObject entryRuleFormulaC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormulaC = null;


        try {
            // InternalDatalog.g:526:49: (iv_ruleFormulaC= ruleFormulaC EOF )
            // InternalDatalog.g:527:2: iv_ruleFormulaC= ruleFormulaC EOF
            {
             newCompositeNode(grammarAccess.getFormulaCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormulaC=ruleFormulaC();

            state._fsp--;

             current =iv_ruleFormulaC; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFormulaC"


    // $ANTLR start "ruleFormulaC"
    // InternalDatalog.g:533:1: ruleFormulaC returns [EObject current=null] : ( ( (lv_First_0_0= ruleAtomC ) ) ( () ( (lv_comma_2_0= ',' ) ) ( (lv_right_3_0= ruleAtomC ) ) )* ) ;
    public final EObject ruleFormulaC() throws RecognitionException {
        EObject current = null;

        Token lv_comma_2_0=null;
        EObject lv_First_0_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDatalog.g:539:2: ( ( ( (lv_First_0_0= ruleAtomC ) ) ( () ( (lv_comma_2_0= ',' ) ) ( (lv_right_3_0= ruleAtomC ) ) )* ) )
            // InternalDatalog.g:540:2: ( ( (lv_First_0_0= ruleAtomC ) ) ( () ( (lv_comma_2_0= ',' ) ) ( (lv_right_3_0= ruleAtomC ) ) )* )
            {
            // InternalDatalog.g:540:2: ( ( (lv_First_0_0= ruleAtomC ) ) ( () ( (lv_comma_2_0= ',' ) ) ( (lv_right_3_0= ruleAtomC ) ) )* )
            // InternalDatalog.g:541:3: ( (lv_First_0_0= ruleAtomC ) ) ( () ( (lv_comma_2_0= ',' ) ) ( (lv_right_3_0= ruleAtomC ) ) )*
            {
            // InternalDatalog.g:541:3: ( (lv_First_0_0= ruleAtomC ) )
            // InternalDatalog.g:542:4: (lv_First_0_0= ruleAtomC )
            {
            // InternalDatalog.g:542:4: (lv_First_0_0= ruleAtomC )
            // InternalDatalog.g:543:5: lv_First_0_0= ruleAtomC
            {

            					newCompositeNode(grammarAccess.getFormulaCAccess().getFirstAtomCParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_First_0_0=ruleAtomC();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormulaCRule());
            					}
            					set(
            						current,
            						"First",
            						lv_First_0_0,
            						"org.xtext.mde.Datalog.AtomC");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDatalog.g:560:3: ( () ( (lv_comma_2_0= ',' ) ) ( (lv_right_3_0= ruleAtomC ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDatalog.g:561:4: () ( (lv_comma_2_0= ',' ) ) ( (lv_right_3_0= ruleAtomC ) )
            	    {
            	    // InternalDatalog.g:561:4: ()
            	    // InternalDatalog.g:562:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getFormulaCAccess().getFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDatalog.g:568:4: ( (lv_comma_2_0= ',' ) )
            	    // InternalDatalog.g:569:5: (lv_comma_2_0= ',' )
            	    {
            	    // InternalDatalog.g:569:5: (lv_comma_2_0= ',' )
            	    // InternalDatalog.g:570:6: lv_comma_2_0= ','
            	    {
            	    lv_comma_2_0=(Token)match(input,15,FOLLOW_5); 

            	    						newLeafNode(lv_comma_2_0, grammarAccess.getFormulaCAccess().getCommaCommaKeyword_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFormulaCRule());
            	    						}
            	    						setWithLastConsumed(current, "comma", lv_comma_2_0, ",");
            	    					

            	    }


            	    }

            	    // InternalDatalog.g:582:4: ( (lv_right_3_0= ruleAtomC ) )
            	    // InternalDatalog.g:583:5: (lv_right_3_0= ruleAtomC )
            	    {
            	    // InternalDatalog.g:583:5: (lv_right_3_0= ruleAtomC )
            	    // InternalDatalog.g:584:6: lv_right_3_0= ruleAtomC
            	    {

            	    						newCompositeNode(grammarAccess.getFormulaCAccess().getRightAtomCParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_right_3_0=ruleAtomC();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFormulaCRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.mde.Datalog.AtomC");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormulaC"


    // $ANTLR start "entryRuleAtom"
    // InternalDatalog.g:606:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalDatalog.g:606:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalDatalog.g:607:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDatalog.g:613:1: ruleAtom returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_lp_1_0= '(' ) ) ( (lv_list_2_0= ruleParamList ) ) ( (lv_rp_3_0= ')' ) ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_lp_1_0=null;
        Token lv_rp_3_0=null;
        EObject lv_list_2_0 = null;



        	enterRule();

        try {
            // InternalDatalog.g:619:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_lp_1_0= '(' ) ) ( (lv_list_2_0= ruleParamList ) ) ( (lv_rp_3_0= ')' ) ) ) )
            // InternalDatalog.g:620:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_lp_1_0= '(' ) ) ( (lv_list_2_0= ruleParamList ) ) ( (lv_rp_3_0= ')' ) ) )
            {
            // InternalDatalog.g:620:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_lp_1_0= '(' ) ) ( (lv_list_2_0= ruleParamList ) ) ( (lv_rp_3_0= ')' ) ) )
            // InternalDatalog.g:621:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_lp_1_0= '(' ) ) ( (lv_list_2_0= ruleParamList ) ) ( (lv_rp_3_0= ')' ) )
            {
            // InternalDatalog.g:621:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDatalog.g:622:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDatalog.g:622:4: (lv_name_0_0= RULE_ID )
            // InternalDatalog.g:623:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAtomAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDatalog.g:639:3: ( (lv_lp_1_0= '(' ) )
            // InternalDatalog.g:640:4: (lv_lp_1_0= '(' )
            {
            // InternalDatalog.g:640:4: (lv_lp_1_0= '(' )
            // InternalDatalog.g:641:5: lv_lp_1_0= '('
            {
            lv_lp_1_0=(Token)match(input,16,FOLLOW_5); 

            					newLeafNode(lv_lp_1_0, grammarAccess.getAtomAccess().getLpLeftParenthesisKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomRule());
            					}
            					setWithLastConsumed(current, "lp", lv_lp_1_0, "(");
            				

            }


            }

            // InternalDatalog.g:653:3: ( (lv_list_2_0= ruleParamList ) )
            // InternalDatalog.g:654:4: (lv_list_2_0= ruleParamList )
            {
            // InternalDatalog.g:654:4: (lv_list_2_0= ruleParamList )
            // InternalDatalog.g:655:5: lv_list_2_0= ruleParamList
            {

            					newCompositeNode(grammarAccess.getAtomAccess().getListParamListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_list_2_0=ruleParamList();

            state._fsp--;


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

            // InternalDatalog.g:672:3: ( (lv_rp_3_0= ')' ) )
            // InternalDatalog.g:673:4: (lv_rp_3_0= ')' )
            {
            // InternalDatalog.g:673:4: (lv_rp_3_0= ')' )
            // InternalDatalog.g:674:5: lv_rp_3_0= ')'
            {
            lv_rp_3_0=(Token)match(input,17,FOLLOW_2); 

            					newLeafNode(lv_rp_3_0, grammarAccess.getAtomAccess().getRpRightParenthesisKeyword_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomRule());
            					}
            					setWithLastConsumed(current, "rp", lv_rp_3_0, ")");
            				

            }


            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleAtomC"
    // InternalDatalog.g:690:1: entryRuleAtomC returns [EObject current=null] : iv_ruleAtomC= ruleAtomC EOF ;
    public final EObject entryRuleAtomC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomC = null;


        try {
            // InternalDatalog.g:690:46: (iv_ruleAtomC= ruleAtomC EOF )
            // InternalDatalog.g:691:2: iv_ruleAtomC= ruleAtomC EOF
            {
             newCompositeNode(grammarAccess.getAtomCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomC=ruleAtomC();

            state._fsp--;

             current =iv_ruleAtomC; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAtomC"


    // $ANTLR start "ruleAtomC"
    // InternalDatalog.g:697:1: ruleAtomC returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_lp_1_0= '(' ) ) ( (lv_list_2_0= ruleParamList ) ) ( (lv_rp_3_0= ')' ) ) ) ;
    public final EObject ruleAtomC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lp_1_0=null;
        Token lv_rp_3_0=null;
        EObject lv_list_2_0 = null;



        	enterRule();

        try {
            // InternalDatalog.g:703:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_lp_1_0= '(' ) ) ( (lv_list_2_0= ruleParamList ) ) ( (lv_rp_3_0= ')' ) ) ) )
            // InternalDatalog.g:704:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_lp_1_0= '(' ) ) ( (lv_list_2_0= ruleParamList ) ) ( (lv_rp_3_0= ')' ) ) )
            {
            // InternalDatalog.g:704:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_lp_1_0= '(' ) ) ( (lv_list_2_0= ruleParamList ) ) ( (lv_rp_3_0= ')' ) ) )
            // InternalDatalog.g:705:3: ( (otherlv_0= RULE_ID ) ) ( (lv_lp_1_0= '(' ) ) ( (lv_list_2_0= ruleParamList ) ) ( (lv_rp_3_0= ')' ) )
            {
            // InternalDatalog.g:705:3: ( (otherlv_0= RULE_ID ) )
            // InternalDatalog.g:706:4: (otherlv_0= RULE_ID )
            {
            // InternalDatalog.g:706:4: (otherlv_0= RULE_ID )
            // InternalDatalog.g:707:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomCRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getAtomCAccess().getNameAtomCrossReference_0_0());
            				

            }


            }

            // InternalDatalog.g:718:3: ( (lv_lp_1_0= '(' ) )
            // InternalDatalog.g:719:4: (lv_lp_1_0= '(' )
            {
            // InternalDatalog.g:719:4: (lv_lp_1_0= '(' )
            // InternalDatalog.g:720:5: lv_lp_1_0= '('
            {
            lv_lp_1_0=(Token)match(input,16,FOLLOW_5); 

            					newLeafNode(lv_lp_1_0, grammarAccess.getAtomCAccess().getLpLeftParenthesisKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomCRule());
            					}
            					setWithLastConsumed(current, "lp", lv_lp_1_0, "(");
            				

            }


            }

            // InternalDatalog.g:732:3: ( (lv_list_2_0= ruleParamList ) )
            // InternalDatalog.g:733:4: (lv_list_2_0= ruleParamList )
            {
            // InternalDatalog.g:733:4: (lv_list_2_0= ruleParamList )
            // InternalDatalog.g:734:5: lv_list_2_0= ruleParamList
            {

            					newCompositeNode(grammarAccess.getAtomCAccess().getListParamListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_list_2_0=ruleParamList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtomCRule());
            					}
            					set(
            						current,
            						"list",
            						lv_list_2_0,
            						"org.xtext.mde.Datalog.ParamList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDatalog.g:751:3: ( (lv_rp_3_0= ')' ) )
            // InternalDatalog.g:752:4: (lv_rp_3_0= ')' )
            {
            // InternalDatalog.g:752:4: (lv_rp_3_0= ')' )
            // InternalDatalog.g:753:5: lv_rp_3_0= ')'
            {
            lv_rp_3_0=(Token)match(input,17,FOLLOW_2); 

            					newLeafNode(lv_rp_3_0, grammarAccess.getAtomCAccess().getRpRightParenthesisKeyword_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomCRule());
            					}
            					setWithLastConsumed(current, "rp", lv_rp_3_0, ")");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomC"


    // $ANTLR start "entryRuleParamList"
    // InternalDatalog.g:769:1: entryRuleParamList returns [EObject current=null] : iv_ruleParamList= ruleParamList EOF ;
    public final EObject entryRuleParamList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamList = null;


        try {
            // InternalDatalog.g:769:50: (iv_ruleParamList= ruleParamList EOF )
            // InternalDatalog.g:770:2: iv_ruleParamList= ruleParamList EOF
            {
             newCompositeNode(grammarAccess.getParamListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParamList=ruleParamList();

            state._fsp--;

             current =iv_ruleParamList; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDatalog.g:776:1: ruleParamList returns [EObject current=null] : ( ( (lv_left_0_0= rulePrimary ) ) ( () ( (lv_comma_2_0= ',' ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleParamList() throws RecognitionException {
        EObject current = null;

        Token lv_comma_2_0=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDatalog.g:782:2: ( ( ( (lv_left_0_0= rulePrimary ) ) ( () ( (lv_comma_2_0= ',' ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalDatalog.g:783:2: ( ( (lv_left_0_0= rulePrimary ) ) ( () ( (lv_comma_2_0= ',' ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalDatalog.g:783:2: ( ( (lv_left_0_0= rulePrimary ) ) ( () ( (lv_comma_2_0= ',' ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalDatalog.g:784:3: ( (lv_left_0_0= rulePrimary ) ) ( () ( (lv_comma_2_0= ',' ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
            // InternalDatalog.g:784:3: ( (lv_left_0_0= rulePrimary ) )
            // InternalDatalog.g:785:4: (lv_left_0_0= rulePrimary )
            {
            // InternalDatalog.g:785:4: (lv_left_0_0= rulePrimary )
            // InternalDatalog.g:786:5: lv_left_0_0= rulePrimary
            {

            					newCompositeNode(grammarAccess.getParamListAccess().getLeftPrimaryParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_left_0_0=rulePrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParamListRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.xtext.mde.Datalog.Primary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDatalog.g:803:3: ( () ( (lv_comma_2_0= ',' ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDatalog.g:804:4: () ( (lv_comma_2_0= ',' ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalDatalog.g:804:4: ()
            	    // InternalDatalog.g:805:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getParamListAccess().getParamListLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDatalog.g:811:4: ( (lv_comma_2_0= ',' ) )
            	    // InternalDatalog.g:812:5: (lv_comma_2_0= ',' )
            	    {
            	    // InternalDatalog.g:812:5: (lv_comma_2_0= ',' )
            	    // InternalDatalog.g:813:6: lv_comma_2_0= ','
            	    {
            	    lv_comma_2_0=(Token)match(input,15,FOLLOW_5); 

            	    						newLeafNode(lv_comma_2_0, grammarAccess.getParamListAccess().getCommaCommaKeyword_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getParamListRule());
            	    						}
            	    						setWithLastConsumed(current, "comma", lv_comma_2_0, ",");
            	    					

            	    }


            	    }

            	    // InternalDatalog.g:825:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalDatalog.g:826:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalDatalog.g:826:5: (lv_right_3_0= rulePrimary )
            	    // InternalDatalog.g:827:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getParamListAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

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
    // InternalDatalog.g:849:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalDatalog.g:849:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalDatalog.g:850:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalDatalog.g:856:1: rulePrimary returns [EObject current=null] : ( (lv_value_0_0= RULE_ID ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDatalog.g:862:2: ( ( (lv_value_0_0= RULE_ID ) ) )
            // InternalDatalog.g:863:2: ( (lv_value_0_0= RULE_ID ) )
            {
            // InternalDatalog.g:863:2: ( (lv_value_0_0= RULE_ID ) )
            // InternalDatalog.g:864:3: (lv_value_0_0= RULE_ID )
            {
            // InternalDatalog.g:864:3: (lv_value_0_0= RULE_ID )
            // InternalDatalog.g:865:4: lv_value_0_0= RULE_ID
            {
            lv_value_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getPrimaryAccess().getValueIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPrimaryRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

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

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "293:2: ( ( (lv_condition_0_0= ruleConditions ) ) | ( (lv_assertion_1_0= ruleAssertion ) ) )";
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
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});

}