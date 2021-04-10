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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_VARIABLE", "RULE_PREDICATE", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'?'", "':-'", "'.'", "','", "'('", "')'"
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

                if ( (LA1_0==RULE_PREDICATE||(LA1_0>=13 && LA1_0<=14)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDatalog.g:79:3: (lv_Program_0_0= ruleStatements )
            	    {
            	    // InternalDatalog.g:79:3: (lv_Program_0_0= ruleStatements )
            	    // InternalDatalog.g:80:4: lv_Program_0_0= ruleStatements
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getProgramStatementsParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_Program_0_0=ruleStatements();

            	    state._fsp--;


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


    // $ANTLR start "entryRuleStatements"
    // InternalDatalog.g:100:1: entryRuleStatements returns [EObject current=null] : iv_ruleStatements= ruleStatements EOF ;
    public final EObject entryRuleStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatements = null;


        try {
            // InternalDatalog.g:100:51: (iv_ruleStatements= ruleStatements EOF )
            // InternalDatalog.g:101:2: iv_ruleStatements= ruleStatements EOF
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
    // InternalDatalog.g:107:1: ruleStatements returns [EObject current=null] : ( ( () rulePlus ) | ( () ruleMinus ) | this_Form_4= ruleForm | this_Param_5= ruleParam | this_Ask_6= ruleAsk ) ;
    public final EObject ruleStatements() throws RecognitionException {
        EObject current = null;

        EObject this_Form_4 = null;

        EObject this_Param_5 = null;

        EObject this_Ask_6 = null;



        	enterRule();

        try {
            // InternalDatalog.g:113:2: ( ( ( () rulePlus ) | ( () ruleMinus ) | this_Form_4= ruleForm | this_Param_5= ruleParam | this_Ask_6= ruleAsk ) )
            // InternalDatalog.g:114:2: ( ( () rulePlus ) | ( () ruleMinus ) | this_Form_4= ruleForm | this_Param_5= ruleParam | this_Ask_6= ruleAsk )
            {
            // InternalDatalog.g:114:2: ( ( () rulePlus ) | ( () ruleMinus ) | this_Form_4= ruleForm | this_Param_5= ruleParam | this_Ask_6= ruleAsk )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalDatalog.g:115:3: ( () rulePlus )
                    {
                    // InternalDatalog.g:115:3: ( () rulePlus )
                    // InternalDatalog.g:116:4: () rulePlus
                    {
                    // InternalDatalog.g:116:4: ()
                    // InternalDatalog.g:117:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStatementsAccess().getStatementsAction_0_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getStatementsAccess().getPlusParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    rulePlus();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDatalog.g:132:3: ( () ruleMinus )
                    {
                    // InternalDatalog.g:132:3: ( () ruleMinus )
                    // InternalDatalog.g:133:4: () ruleMinus
                    {
                    // InternalDatalog.g:133:4: ()
                    // InternalDatalog.g:134:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStatementsAccess().getStatementsAction_1_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getStatementsAccess().getMinusParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleMinus();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDatalog.g:149:3: this_Form_4= ruleForm
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getFormParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Form_4=ruleForm();

                    state._fsp--;


                    			current = this_Form_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDatalog.g:158:3: this_Param_5= ruleParam
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getParamParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Param_5=ruleParam();

                    state._fsp--;


                    			current = this_Param_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDatalog.g:167:3: this_Ask_6= ruleAsk
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getAskParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ask_6=ruleAsk();

                    state._fsp--;


                    			current = this_Ask_6;
                    			afterParserOrEnumRuleCall();
                    		

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


    // $ANTLR start "entryRulePlus"
    // InternalDatalog.g:179:1: entryRulePlus returns [String current=null] : iv_rulePlus= rulePlus EOF ;
    public final String entryRulePlus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePlus = null;


        try {
            // InternalDatalog.g:179:44: (iv_rulePlus= rulePlus EOF )
            // InternalDatalog.g:180:2: iv_rulePlus= rulePlus EOF
            {
             newCompositeNode(grammarAccess.getPlusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlus=rulePlus();

            state._fsp--;

             current =iv_rulePlus.getText(); 
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
    // $ANTLR end "entryRulePlus"


    // $ANTLR start "rulePlus"
    // InternalDatalog.g:186:1: rulePlus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+' ;
    public final AntlrDatatypeRuleToken rulePlus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDatalog.g:192:2: (kw= '+' )
            // InternalDatalog.g:193:2: kw= '+'
            {
            kw=(Token)match(input,13,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getPlusAccess().getPlusSignKeyword());
            	

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
    // $ANTLR end "rulePlus"


    // $ANTLR start "entryRuleMinus"
    // InternalDatalog.g:201:1: entryRuleMinus returns [String current=null] : iv_ruleMinus= ruleMinus EOF ;
    public final String entryRuleMinus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMinus = null;


        try {
            // InternalDatalog.g:201:45: (iv_ruleMinus= ruleMinus EOF )
            // InternalDatalog.g:202:2: iv_ruleMinus= ruleMinus EOF
            {
             newCompositeNode(grammarAccess.getMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinus=ruleMinus();

            state._fsp--;

             current =iv_ruleMinus.getText(); 
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
    // $ANTLR end "entryRuleMinus"


    // $ANTLR start "ruleMinus"
    // InternalDatalog.g:208:1: ruleMinus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '-' ;
    public final AntlrDatatypeRuleToken ruleMinus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDatalog.g:214:2: (kw= '-' )
            // InternalDatalog.g:215:2: kw= '-'
            {
            kw=(Token)match(input,14,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getMinusAccess().getHyphenMinusKeyword());
            	

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
    // $ANTLR end "ruleMinus"


    // $ANTLR start "entryRuleAsk"
    // InternalDatalog.g:223:1: entryRuleAsk returns [EObject current=null] : iv_ruleAsk= ruleAsk EOF ;
    public final EObject entryRuleAsk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsk = null;


        try {
            // InternalDatalog.g:223:44: (iv_ruleAsk= ruleAsk EOF )
            // InternalDatalog.g:224:2: iv_ruleAsk= ruleAsk EOF
            {
             newCompositeNode(grammarAccess.getAskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsk=ruleAsk();

            state._fsp--;

             current =iv_ruleAsk; 
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
    // $ANTLR end "entryRuleAsk"


    // $ANTLR start "ruleAsk"
    // InternalDatalog.g:230:1: ruleAsk returns [EObject current=null] : (this_Formula_0= ruleFormula otherlv_1= '?' ) ;
    public final EObject ruleAsk() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Formula_0 = null;



        	enterRule();

        try {
            // InternalDatalog.g:236:2: ( (this_Formula_0= ruleFormula otherlv_1= '?' ) )
            // InternalDatalog.g:237:2: (this_Formula_0= ruleFormula otherlv_1= '?' )
            {
            // InternalDatalog.g:237:2: (this_Formula_0= ruleFormula otherlv_1= '?' )
            // InternalDatalog.g:238:3: this_Formula_0= ruleFormula otherlv_1= '?'
            {

            			newCompositeNode(grammarAccess.getAskAccess().getFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_Formula_0=ruleFormula();

            state._fsp--;


            			current = this_Formula_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getAskAccess().getQuestionMarkKeyword_1());
            		

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
    // $ANTLR end "ruleAsk"


    // $ANTLR start "entryRuleForm"
    // InternalDatalog.g:254:1: entryRuleForm returns [EObject current=null] : iv_ruleForm= ruleForm EOF ;
    public final EObject entryRuleForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForm = null;


        try {
            // InternalDatalog.g:254:45: (iv_ruleForm= ruleForm EOF )
            // InternalDatalog.g:255:2: iv_ruleForm= ruleForm EOF
            {
             newCompositeNode(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForm=ruleForm();

            state._fsp--;

             current =iv_ruleForm; 
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
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // InternalDatalog.g:261:1: ruleForm returns [EObject current=null] : (this_Atom_0= ruleAtom ( () otherlv_2= ':-' ( (lv_right_3_0= ruleFormula ) ) )* otherlv_4= '.' ) ;
    public final EObject ruleForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Atom_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDatalog.g:267:2: ( (this_Atom_0= ruleAtom ( () otherlv_2= ':-' ( (lv_right_3_0= ruleFormula ) ) )* otherlv_4= '.' ) )
            // InternalDatalog.g:268:2: (this_Atom_0= ruleAtom ( () otherlv_2= ':-' ( (lv_right_3_0= ruleFormula ) ) )* otherlv_4= '.' )
            {
            // InternalDatalog.g:268:2: (this_Atom_0= ruleAtom ( () otherlv_2= ':-' ( (lv_right_3_0= ruleFormula ) ) )* otherlv_4= '.' )
            // InternalDatalog.g:269:3: this_Atom_0= ruleAtom ( () otherlv_2= ':-' ( (lv_right_3_0= ruleFormula ) ) )* otherlv_4= '.'
            {

            			newCompositeNode(grammarAccess.getFormAccess().getAtomParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_Atom_0=ruleAtom();

            state._fsp--;


            			current = this_Atom_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDatalog.g:277:3: ( () otherlv_2= ':-' ( (lv_right_3_0= ruleFormula ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDatalog.g:278:4: () otherlv_2= ':-' ( (lv_right_3_0= ruleFormula ) )
            	    {
            	    // InternalDatalog.g:278:4: ()
            	    // InternalDatalog.g:279:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getFormAccess().getOperationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFormAccess().getColonHyphenMinusKeyword_1_1());
            	    			
            	    // InternalDatalog.g:289:4: ( (lv_right_3_0= ruleFormula ) )
            	    // InternalDatalog.g:290:5: (lv_right_3_0= ruleFormula )
            	    {
            	    // InternalDatalog.g:290:5: (lv_right_3_0= ruleFormula )
            	    // InternalDatalog.g:291:6: lv_right_3_0= ruleFormula
            	    {

            	    						newCompositeNode(grammarAccess.getFormAccess().getRightFormulaParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_right_3_0=ruleFormula();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFormRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.mde.Datalog.Formula");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFormAccess().getFullStopKeyword_2());
            		

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
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleParam"
    // InternalDatalog.g:317:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalDatalog.g:317:46: (iv_ruleParam= ruleParam EOF )
            // InternalDatalog.g:318:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalDatalog.g:324:1: ruleParam returns [EObject current=null] : (this_Formula_0= ruleFormula otherlv_1= '.' ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Formula_0 = null;



        	enterRule();

        try {
            // InternalDatalog.g:330:2: ( (this_Formula_0= ruleFormula otherlv_1= '.' ) )
            // InternalDatalog.g:331:2: (this_Formula_0= ruleFormula otherlv_1= '.' )
            {
            // InternalDatalog.g:331:2: (this_Formula_0= ruleFormula otherlv_1= '.' )
            // InternalDatalog.g:332:3: this_Formula_0= ruleFormula otherlv_1= '.'
            {

            			newCompositeNode(grammarAccess.getParamAccess().getFormulaParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_Formula_0=ruleFormula();

            state._fsp--;


            			current = this_Formula_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getParamAccess().getFullStopKeyword_1());
            		

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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleFormula"
    // InternalDatalog.g:348:1: entryRuleFormula returns [EObject current=null] : iv_ruleFormula= ruleFormula EOF ;
    public final EObject entryRuleFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormula = null;


        try {
            // InternalDatalog.g:348:48: (iv_ruleFormula= ruleFormula EOF )
            // InternalDatalog.g:349:2: iv_ruleFormula= ruleFormula EOF
            {
             newCompositeNode(grammarAccess.getFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormula=ruleFormula();

            state._fsp--;

             current =iv_ruleFormula; 
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
    // $ANTLR end "entryRuleFormula"


    // $ANTLR start "ruleFormula"
    // InternalDatalog.g:355:1: ruleFormula returns [EObject current=null] : (this_Atom_0= ruleAtom ( () otherlv_2= ',' ( (lv_right_3_0= ruleAtom ) ) )* ) ;
    public final EObject ruleFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Atom_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDatalog.g:361:2: ( (this_Atom_0= ruleAtom ( () otherlv_2= ',' ( (lv_right_3_0= ruleAtom ) ) )* ) )
            // InternalDatalog.g:362:2: (this_Atom_0= ruleAtom ( () otherlv_2= ',' ( (lv_right_3_0= ruleAtom ) ) )* )
            {
            // InternalDatalog.g:362:2: (this_Atom_0= ruleAtom ( () otherlv_2= ',' ( (lv_right_3_0= ruleAtom ) ) )* )
            // InternalDatalog.g:363:3: this_Atom_0= ruleAtom ( () otherlv_2= ',' ( (lv_right_3_0= ruleAtom ) ) )*
            {

            			newCompositeNode(grammarAccess.getFormulaAccess().getAtomParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_Atom_0=ruleAtom();

            state._fsp--;


            			current = this_Atom_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDatalog.g:371:3: ( () otherlv_2= ',' ( (lv_right_3_0= ruleAtom ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDatalog.g:372:4: () otherlv_2= ',' ( (lv_right_3_0= ruleAtom ) )
            	    {
            	    // InternalDatalog.g:372:4: ()
            	    // InternalDatalog.g:373:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getFormulaAccess().getFormulaLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFormulaAccess().getCommaKeyword_1_1());
            	    			
            	    // InternalDatalog.g:383:4: ( (lv_right_3_0= ruleAtom ) )
            	    // InternalDatalog.g:384:5: (lv_right_3_0= ruleAtom )
            	    {
            	    // InternalDatalog.g:384:5: (lv_right_3_0= ruleAtom )
            	    // InternalDatalog.g:385:6: lv_right_3_0= ruleAtom
            	    {

            	    						newCompositeNode(grammarAccess.getFormulaAccess().getRightAtomParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_right_3_0=ruleAtom();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleFormula"


    // $ANTLR start "entryRuleAtom"
    // InternalDatalog.g:407:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalDatalog.g:407:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalDatalog.g:408:2: iv_ruleAtom= ruleAtom EOF
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
    // InternalDatalog.g:414:1: ruleAtom returns [EObject current=null] : (this_ParameterPred_0= ruleParameterPred otherlv_1= '(' ( (lv_list_2_0= ruleParamList ) ) otherlv_3= ')' ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_ParameterPred_0 = null;

        EObject lv_list_2_0 = null;



        	enterRule();

        try {
            // InternalDatalog.g:420:2: ( (this_ParameterPred_0= ruleParameterPred otherlv_1= '(' ( (lv_list_2_0= ruleParamList ) ) otherlv_3= ')' ) )
            // InternalDatalog.g:421:2: (this_ParameterPred_0= ruleParameterPred otherlv_1= '(' ( (lv_list_2_0= ruleParamList ) ) otherlv_3= ')' )
            {
            // InternalDatalog.g:421:2: (this_ParameterPred_0= ruleParameterPred otherlv_1= '(' ( (lv_list_2_0= ruleParamList ) ) otherlv_3= ')' )
            // InternalDatalog.g:422:3: this_ParameterPred_0= ruleParameterPred otherlv_1= '(' ( (lv_list_2_0= ruleParamList ) ) otherlv_3= ')'
            {

            			newCompositeNode(grammarAccess.getAtomAccess().getParameterPredParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_ParameterPred_0=ruleParameterPred();

            state._fsp--;


            			current = this_ParameterPred_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDatalog.g:434:3: ( (lv_list_2_0= ruleParamList ) )
            // InternalDatalog.g:435:4: (lv_list_2_0= ruleParamList )
            {
            // InternalDatalog.g:435:4: (lv_list_2_0= ruleParamList )
            // InternalDatalog.g:436:5: lv_list_2_0= ruleParamList
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

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAtomAccess().getRightParenthesisKeyword_3());
            		

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


    // $ANTLR start "entryRuleParamList"
    // InternalDatalog.g:461:1: entryRuleParamList returns [EObject current=null] : iv_ruleParamList= ruleParamList EOF ;
    public final EObject entryRuleParamList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamList = null;


        try {
            // InternalDatalog.g:461:50: (iv_ruleParamList= ruleParamList EOF )
            // InternalDatalog.g:462:2: iv_ruleParamList= ruleParamList EOF
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
    // InternalDatalog.g:468:1: ruleParamList returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= ',' ( (lv_right_3_0= rulePrimary ) ) ) ) ;
    public final EObject ruleParamList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDatalog.g:474:2: ( (this_Primary_0= rulePrimary ( () otherlv_2= ',' ( (lv_right_3_0= rulePrimary ) ) ) ) )
            // InternalDatalog.g:475:2: (this_Primary_0= rulePrimary ( () otherlv_2= ',' ( (lv_right_3_0= rulePrimary ) ) ) )
            {
            // InternalDatalog.g:475:2: (this_Primary_0= rulePrimary ( () otherlv_2= ',' ( (lv_right_3_0= rulePrimary ) ) ) )
            // InternalDatalog.g:476:3: this_Primary_0= rulePrimary ( () otherlv_2= ',' ( (lv_right_3_0= rulePrimary ) ) )
            {

            			newCompositeNode(grammarAccess.getParamListAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDatalog.g:484:3: ( () otherlv_2= ',' ( (lv_right_3_0= rulePrimary ) ) )
            // InternalDatalog.g:485:4: () otherlv_2= ',' ( (lv_right_3_0= rulePrimary ) )
            {
            // InternalDatalog.g:485:4: ()
            // InternalDatalog.g:486:5: 
            {

            					current = forceCreateModelElementAndSet(
            						grammarAccess.getParamListAccess().getParamListLeftAction_1_0(),
            						current);
            				

            }

            otherlv_2=(Token)match(input,18,FOLLOW_10); 

            				newLeafNode(otherlv_2, grammarAccess.getParamListAccess().getCommaKeyword_1_1());
            			
            // InternalDatalog.g:496:4: ( (lv_right_3_0= rulePrimary ) )
            // InternalDatalog.g:497:5: (lv_right_3_0= rulePrimary )
            {
            // InternalDatalog.g:497:5: (lv_right_3_0= rulePrimary )
            // InternalDatalog.g:498:6: lv_right_3_0= rulePrimary
            {

            						newCompositeNode(grammarAccess.getParamListAccess().getRightPrimaryParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_2);
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
    // InternalDatalog.g:520:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalDatalog.g:520:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalDatalog.g:521:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalDatalog.g:527:1: rulePrimary returns [EObject current=null] : (this_ParameterPred_0= ruleParameterPred | this_ParameterVar_1= ruleParameterVar | this_ParameterInt_2= ruleParameterInt ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterPred_0 = null;

        EObject this_ParameterVar_1 = null;

        EObject this_ParameterInt_2 = null;



        	enterRule();

        try {
            // InternalDatalog.g:533:2: ( (this_ParameterPred_0= ruleParameterPred | this_ParameterVar_1= ruleParameterVar | this_ParameterInt_2= ruleParameterInt ) )
            // InternalDatalog.g:534:2: (this_ParameterPred_0= ruleParameterPred | this_ParameterVar_1= ruleParameterVar | this_ParameterInt_2= ruleParameterInt )
            {
            // InternalDatalog.g:534:2: (this_ParameterPred_0= ruleParameterPred | this_ParameterVar_1= ruleParameterVar | this_ParameterInt_2= ruleParameterInt )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDatalog.g:535:3: this_ParameterPred_0= ruleParameterPred
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParameterPredParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterPred_0=ruleParameterPred();

                    state._fsp--;


                    			current = this_ParameterPred_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDatalog.g:544:3: this_ParameterVar_1= ruleParameterVar
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParameterVarParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterVar_1=ruleParameterVar();

                    state._fsp--;


                    			current = this_ParameterVar_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDatalog.g:553:3: this_ParameterInt_2= ruleParameterInt
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParameterIntParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterInt_2=ruleParameterInt();

                    state._fsp--;


                    			current = this_ParameterInt_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParameterInt"
    // InternalDatalog.g:565:1: entryRuleParameterInt returns [EObject current=null] : iv_ruleParameterInt= ruleParameterInt EOF ;
    public final EObject entryRuleParameterInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterInt = null;


        try {
            // InternalDatalog.g:565:53: (iv_ruleParameterInt= ruleParameterInt EOF )
            // InternalDatalog.g:566:2: iv_ruleParameterInt= ruleParameterInt EOF
            {
             newCompositeNode(grammarAccess.getParameterIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterInt=ruleParameterInt();

            state._fsp--;

             current =iv_ruleParameterInt; 
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
    // $ANTLR end "entryRuleParameterInt"


    // $ANTLR start "ruleParameterInt"
    // InternalDatalog.g:572:1: ruleParameterInt returns [EObject current=null] : ( (lv_int_0_0= RULE_INT ) ) ;
    public final EObject ruleParameterInt() throws RecognitionException {
        EObject current = null;

        Token lv_int_0_0=null;


        	enterRule();

        try {
            // InternalDatalog.g:578:2: ( ( (lv_int_0_0= RULE_INT ) ) )
            // InternalDatalog.g:579:2: ( (lv_int_0_0= RULE_INT ) )
            {
            // InternalDatalog.g:579:2: ( (lv_int_0_0= RULE_INT ) )
            // InternalDatalog.g:580:3: (lv_int_0_0= RULE_INT )
            {
            // InternalDatalog.g:580:3: (lv_int_0_0= RULE_INT )
            // InternalDatalog.g:581:4: lv_int_0_0= RULE_INT
            {
            lv_int_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_int_0_0, grammarAccess.getParameterIntAccess().getIntINTTerminalRuleCall_0());
            			

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
    // $ANTLR end "ruleParameterInt"


    // $ANTLR start "entryRuleParameterVar"
    // InternalDatalog.g:600:1: entryRuleParameterVar returns [EObject current=null] : iv_ruleParameterVar= ruleParameterVar EOF ;
    public final EObject entryRuleParameterVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterVar = null;


        try {
            // InternalDatalog.g:600:53: (iv_ruleParameterVar= ruleParameterVar EOF )
            // InternalDatalog.g:601:2: iv_ruleParameterVar= ruleParameterVar EOF
            {
             newCompositeNode(grammarAccess.getParameterVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterVar=ruleParameterVar();

            state._fsp--;

             current =iv_ruleParameterVar; 
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
    // $ANTLR end "entryRuleParameterVar"


    // $ANTLR start "ruleParameterVar"
    // InternalDatalog.g:607:1: ruleParameterVar returns [EObject current=null] : ( (lv_up_0_0= RULE_VARIABLE ) ) ;
    public final EObject ruleParameterVar() throws RecognitionException {
        EObject current = null;

        Token lv_up_0_0=null;


        	enterRule();

        try {
            // InternalDatalog.g:613:2: ( ( (lv_up_0_0= RULE_VARIABLE ) ) )
            // InternalDatalog.g:614:2: ( (lv_up_0_0= RULE_VARIABLE ) )
            {
            // InternalDatalog.g:614:2: ( (lv_up_0_0= RULE_VARIABLE ) )
            // InternalDatalog.g:615:3: (lv_up_0_0= RULE_VARIABLE )
            {
            // InternalDatalog.g:615:3: (lv_up_0_0= RULE_VARIABLE )
            // InternalDatalog.g:616:4: lv_up_0_0= RULE_VARIABLE
            {
            lv_up_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_2); 

            				newLeafNode(lv_up_0_0, grammarAccess.getParameterVarAccess().getUpVARIABLETerminalRuleCall_0());
            			

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
    // $ANTLR end "ruleParameterVar"


    // $ANTLR start "entryRuleParameterPred"
    // InternalDatalog.g:635:1: entryRuleParameterPred returns [EObject current=null] : iv_ruleParameterPred= ruleParameterPred EOF ;
    public final EObject entryRuleParameterPred() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterPred = null;


        try {
            // InternalDatalog.g:635:54: (iv_ruleParameterPred= ruleParameterPred EOF )
            // InternalDatalog.g:636:2: iv_ruleParameterPred= ruleParameterPred EOF
            {
             newCompositeNode(grammarAccess.getParameterPredRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterPred=ruleParameterPred();

            state._fsp--;

             current =iv_ruleParameterPred; 
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
    // $ANTLR end "entryRuleParameterPred"


    // $ANTLR start "ruleParameterPred"
    // InternalDatalog.g:642:1: ruleParameterPred returns [EObject current=null] : ( (lv_low_0_0= RULE_PREDICATE ) ) ;
    public final EObject ruleParameterPred() throws RecognitionException {
        EObject current = null;

        Token lv_low_0_0=null;


        	enterRule();

        try {
            // InternalDatalog.g:648:2: ( ( (lv_low_0_0= RULE_PREDICATE ) ) )
            // InternalDatalog.g:649:2: ( (lv_low_0_0= RULE_PREDICATE ) )
            {
            // InternalDatalog.g:649:2: ( (lv_low_0_0= RULE_PREDICATE ) )
            // InternalDatalog.g:650:3: (lv_low_0_0= RULE_PREDICATE )
            {
            // InternalDatalog.g:650:3: (lv_low_0_0= RULE_PREDICATE )
            // InternalDatalog.g:651:4: lv_low_0_0= RULE_PREDICATE
            {
            lv_low_0_0=(Token)match(input,RULE_PREDICATE,FOLLOW_2); 

            				newLeafNode(lv_low_0_0, grammarAccess.getParameterPredAccess().getLowPREDICATETerminalRuleCall_0());
            			

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
    // $ANTLR end "ruleParameterPred"

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
            "\1\17\1\uffff\1\32\1\15",
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
            return "114:2: ( ( () rulePlus ) | ( () ruleMinus ) | this_Form_4= ruleForm | this_Param_5= ruleParam | this_Ask_6= ruleAsk )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000006042L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});

}