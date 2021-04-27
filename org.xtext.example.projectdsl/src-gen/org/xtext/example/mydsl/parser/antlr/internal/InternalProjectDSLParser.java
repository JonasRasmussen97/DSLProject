package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.ProjectDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProjectDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'entity'", "'requires'", "'{'", "'}'", "'controller'", "'uses'", "','", "'make'", "'='", "':'", "'require'", "'>='", "'<='", "'>'", "'<'", "'R'", "'U'", "'+'", "'-'", "'/'", "'*'", "'('", "')'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalProjectDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProjectDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProjectDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalProjectDSL.g"; }



     	private ProjectDSLGrammarAccess grammarAccess;

        public InternalProjectDSLParser(TokenStream input, ProjectDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RestAPI";
       	}

       	@Override
       	protected ProjectDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRestAPI"
    // InternalProjectDSL.g:64:1: entryRuleRestAPI returns [EObject current=null] : iv_ruleRestAPI= ruleRestAPI EOF ;
    public final EObject entryRuleRestAPI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestAPI = null;


        try {
            // InternalProjectDSL.g:64:48: (iv_ruleRestAPI= ruleRestAPI EOF )
            // InternalProjectDSL.g:65:2: iv_ruleRestAPI= ruleRestAPI EOF
            {
             newCompositeNode(grammarAccess.getRestAPIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestAPI=ruleRestAPI();

            state._fsp--;

             current =iv_ruleRestAPI; 
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
    // $ANTLR end "entryRuleRestAPI"


    // $ANTLR start "ruleRestAPI"
    // InternalProjectDSL.g:71:1: ruleRestAPI returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* ) ;
    public final EObject ruleRestAPI() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_declarations_2_0 = null;



        	enterRule();

        try {
            // InternalProjectDSL.g:77:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* ) )
            // InternalProjectDSL.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* )
            {
            // InternalProjectDSL.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )* )
            // InternalProjectDSL.g:79:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_declarations_2_0= ruleDeclaration ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRestAPIAccess().getSystemKeyword_0());
            		
            // InternalProjectDSL.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalProjectDSL.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalProjectDSL.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalProjectDSL.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRestAPIAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestAPIRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalProjectDSL.g:101:3: ( (lv_declarations_2_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalProjectDSL.g:102:4: (lv_declarations_2_0= ruleDeclaration )
            	    {
            	    // InternalProjectDSL.g:102:4: (lv_declarations_2_0= ruleDeclaration )
            	    // InternalProjectDSL.g:103:5: lv_declarations_2_0= ruleDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getRestAPIAccess().getDeclarationsDeclarationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_declarations_2_0=ruleDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRestAPIRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declarations",
            	    						lv_declarations_2_0,
            	    						"org.xtext.example.mydsl.ProjectDSL.Declaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleRestAPI"


    // $ANTLR start "entryRuleDeclaration"
    // InternalProjectDSL.g:124:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalProjectDSL.g:124:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalProjectDSL.g:125:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalProjectDSL.g:131:1: ruleDeclaration returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Controller_1= ruleController ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Controller_1 = null;



        	enterRule();

        try {
            // InternalProjectDSL.g:137:2: ( (this_Entity_0= ruleEntity | this_Controller_1= ruleController ) )
            // InternalProjectDSL.g:138:2: (this_Entity_0= ruleEntity | this_Controller_1= ruleController )
            {
            // InternalProjectDSL.g:138:2: (this_Entity_0= ruleEntity | this_Controller_1= ruleController )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalProjectDSL.g:139:3: this_Entity_0= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_0=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalProjectDSL.g:148:3: this_Controller_1= ruleController
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getControllerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Controller_1=ruleController();

                    state._fsp--;


                    			current = this_Controller_1;
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleEntity"
    // InternalProjectDSL.g:160:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalProjectDSL.g:160:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalProjectDSL.g:161:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalProjectDSL.g:167:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'requires' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_parameters_5_0= ruleParameter ) )+ otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalProjectDSL.g:173:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'requires' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_parameters_5_0= ruleParameter ) )+ otherlv_6= '}' ) )
            // InternalProjectDSL.g:174:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'requires' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_parameters_5_0= ruleParameter ) )+ otherlv_6= '}' )
            {
            // InternalProjectDSL.g:174:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'requires' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_parameters_5_0= ruleParameter ) )+ otherlv_6= '}' )
            // InternalProjectDSL.g:175:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'requires' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_parameters_5_0= ruleParameter ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalProjectDSL.g:179:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalProjectDSL.g:180:4: (lv_name_1_0= RULE_ID )
            {
            // InternalProjectDSL.g:180:4: (lv_name_1_0= RULE_ID )
            // InternalProjectDSL.g:181:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getRequiresKeyword_2());
            		
            // InternalProjectDSL.g:201:3: ( (otherlv_3= RULE_ID ) )
            // InternalProjectDSL.g:202:4: (otherlv_3= RULE_ID )
            {
            // InternalProjectDSL.g:202:4: (otherlv_3= RULE_ID )
            // InternalProjectDSL.g:203:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getCtrlrControllerCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalProjectDSL.g:218:3: ( (lv_parameters_5_0= ruleParameter ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalProjectDSL.g:219:4: (lv_parameters_5_0= ruleParameter )
            	    {
            	    // InternalProjectDSL.g:219:4: (lv_parameters_5_0= ruleParameter )
            	    // InternalProjectDSL.g:220:5: lv_parameters_5_0= ruleParameter
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getParametersParameterParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_parameters_5_0=ruleParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_5_0,
            	    						"org.xtext.example.mydsl.ProjectDSL.Parameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleController"
    // InternalProjectDSL.g:245:1: entryRuleController returns [EObject current=null] : iv_ruleController= ruleController EOF ;
    public final EObject entryRuleController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleController = null;


        try {
            // InternalProjectDSL.g:245:51: (iv_ruleController= ruleController EOF )
            // InternalProjectDSL.g:246:2: iv_ruleController= ruleController EOF
            {
             newCompositeNode(grammarAccess.getControllerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleController=ruleController();

            state._fsp--;

             current =iv_ruleController; 
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
    // $ANTLR end "entryRuleController"


    // $ANTLR start "ruleController"
    // InternalProjectDSL.g:252:1: ruleController returns [EObject current=null] : (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '{' (otherlv_7= 'make' ( (lv_endpoint_8_0= ruleEndpoint ) ) )+ otherlv_9= '}' ) ;
    public final EObject ruleController() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_endpoint_8_0 = null;



        	enterRule();

        try {
            // InternalProjectDSL.g:258:2: ( (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '{' (otherlv_7= 'make' ( (lv_endpoint_8_0= ruleEndpoint ) ) )+ otherlv_9= '}' ) )
            // InternalProjectDSL.g:259:2: (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '{' (otherlv_7= 'make' ( (lv_endpoint_8_0= ruleEndpoint ) ) )+ otherlv_9= '}' )
            {
            // InternalProjectDSL.g:259:2: (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '{' (otherlv_7= 'make' ( (lv_endpoint_8_0= ruleEndpoint ) ) )+ otherlv_9= '}' )
            // InternalProjectDSL.g:260:3: otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '{' (otherlv_7= 'make' ( (lv_endpoint_8_0= ruleEndpoint ) ) )+ otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getControllerAccess().getControllerKeyword_0());
            		
            // InternalProjectDSL.g:264:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalProjectDSL.g:265:4: (lv_name_1_0= RULE_ID )
            {
            // InternalProjectDSL.g:265:4: (lv_name_1_0= RULE_ID )
            // InternalProjectDSL.g:266:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getControllerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getControllerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getControllerAccess().getUsesKeyword_2());
            		
            // InternalProjectDSL.g:286:3: ( (otherlv_3= RULE_ID ) )
            // InternalProjectDSL.g:287:4: (otherlv_3= RULE_ID )
            {
            // InternalProjectDSL.g:287:4: (otherlv_3= RULE_ID )
            // InternalProjectDSL.g:288:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getControllerRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_3, grammarAccess.getControllerAccess().getBaseEntityCrossReference_3_0());
            				

            }


            }

            // InternalProjectDSL.g:299:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalProjectDSL.g:300:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getControllerAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalProjectDSL.g:304:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalProjectDSL.g:305:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalProjectDSL.g:305:5: (otherlv_5= RULE_ID )
            	    // InternalProjectDSL.g:306:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getControllerRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    						newLeafNode(otherlv_5, grammarAccess.getControllerAccess().getBaseEntityCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalProjectDSL.g:322:3: (otherlv_7= 'make' ( (lv_endpoint_8_0= ruleEndpoint ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalProjectDSL.g:323:4: otherlv_7= 'make' ( (lv_endpoint_8_0= ruleEndpoint ) )
            	    {
            	    otherlv_7=(Token)match(input,19,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getControllerAccess().getMakeKeyword_6_0());
            	    			
            	    // InternalProjectDSL.g:327:4: ( (lv_endpoint_8_0= ruleEndpoint ) )
            	    // InternalProjectDSL.g:328:5: (lv_endpoint_8_0= ruleEndpoint )
            	    {
            	    // InternalProjectDSL.g:328:5: (lv_endpoint_8_0= ruleEndpoint )
            	    // InternalProjectDSL.g:329:6: lv_endpoint_8_0= ruleEndpoint
            	    {

            	    						newCompositeNode(grammarAccess.getControllerAccess().getEndpointEndpointParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_endpoint_8_0=ruleEndpoint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getControllerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"endpoint",
            	    							lv_endpoint_8_0,
            	    							"org.xtext.example.mydsl.ProjectDSL.Endpoint");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleController"


    // $ANTLR start "entryRuleEndpoint"
    // InternalProjectDSL.g:355:1: entryRuleEndpoint returns [EObject current=null] : iv_ruleEndpoint= ruleEndpoint EOF ;
    public final EObject entryRuleEndpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndpoint = null;


        try {
            // InternalProjectDSL.g:355:49: (iv_ruleEndpoint= ruleEndpoint EOF )
            // InternalProjectDSL.g:356:2: iv_ruleEndpoint= ruleEndpoint EOF
            {
             newCompositeNode(grammarAccess.getEndpointRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndpoint=ruleEndpoint();

            state._fsp--;

             current =iv_ruleEndpoint; 
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
    // $ANTLR end "entryRuleEndpoint"


    // $ANTLR start "ruleEndpoint"
    // InternalProjectDSL.g:362:1: ruleEndpoint returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleEndpoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalProjectDSL.g:368:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalProjectDSL.g:369:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalProjectDSL.g:369:2: ( (otherlv_0= RULE_ID ) )
            // InternalProjectDSL.g:370:3: (otherlv_0= RULE_ID )
            {
            // InternalProjectDSL.g:370:3: (otherlv_0= RULE_ID )
            // InternalProjectDSL.g:371:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEndpointRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getEndpointAccess().getEndpointParameterCrossReference_0());
            			

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
    // $ANTLR end "ruleEndpoint"


    // $ANTLR start "entryRuleParameter"
    // InternalProjectDSL.g:385:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalProjectDSL.g:385:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalProjectDSL.g:386:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalProjectDSL.g:392:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_dataType_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) )+ (otherlv_5= 'require' ( (otherlv_6= RULE_ID ) ) ( ( (lv_op_7_1= '>=' | lv_op_7_2= '<=' | lv_op_7_3= '>' | lv_op_7_4= '<' ) ) ) ( (lv_content_8_0= ruleMathContent ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_dataType_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_op_7_1=null;
        Token lv_op_7_2=null;
        Token lv_op_7_3=null;
        Token lv_op_7_4=null;
        AntlrDatatypeRuleToken lv_type_4_0 = null;

        EObject lv_content_8_0 = null;



        	enterRule();

        try {
            // InternalProjectDSL.g:398:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_dataType_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) )+ (otherlv_5= 'require' ( (otherlv_6= RULE_ID ) ) ( ( (lv_op_7_1= '>=' | lv_op_7_2= '<=' | lv_op_7_3= '>' | lv_op_7_4= '<' ) ) ) ( (lv_content_8_0= ruleMathContent ) ) )? ) )
            // InternalProjectDSL.g:399:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_dataType_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) )+ (otherlv_5= 'require' ( (otherlv_6= RULE_ID ) ) ( ( (lv_op_7_1= '>=' | lv_op_7_2= '<=' | lv_op_7_3= '>' | lv_op_7_4= '<' ) ) ) ( (lv_content_8_0= ruleMathContent ) ) )? )
            {
            // InternalProjectDSL.g:399:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_dataType_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) )+ (otherlv_5= 'require' ( (otherlv_6= RULE_ID ) ) ( ( (lv_op_7_1= '>=' | lv_op_7_2= '<=' | lv_op_7_3= '>' | lv_op_7_4= '<' ) ) ) ( (lv_content_8_0= ruleMathContent ) ) )? )
            // InternalProjectDSL.g:400:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_dataType_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) )+ (otherlv_5= 'require' ( (otherlv_6= RULE_ID ) ) ( ( (lv_op_7_1= '>=' | lv_op_7_2= '<=' | lv_op_7_3= '>' | lv_op_7_4= '<' ) ) ) ( (lv_content_8_0= ruleMathContent ) ) )?
            {
            // InternalProjectDSL.g:400:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalProjectDSL.g:401:4: (lv_name_0_0= RULE_ID )
            {
            // InternalProjectDSL.g:401:4: (lv_name_0_0= RULE_ID )
            // InternalProjectDSL.g:402:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getEqualsSignKeyword_1());
            		
            // InternalProjectDSL.g:422:3: ( (lv_dataType_2_0= RULE_ID ) )
            // InternalProjectDSL.g:423:4: (lv_dataType_2_0= RULE_ID )
            {
            // InternalProjectDSL.g:423:4: (lv_dataType_2_0= RULE_ID )
            // InternalProjectDSL.g:424:5: lv_dataType_2_0= RULE_ID
            {
            lv_dataType_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_dataType_2_0, grammarAccess.getParameterAccess().getDataTypeIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dataType",
            						lv_dataType_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getColonKeyword_3());
            		
            // InternalProjectDSL.g:444:3: ( (lv_type_4_0= ruleType ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=27 && LA6_0<=28)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalProjectDSL.g:445:4: (lv_type_4_0= ruleType )
            	    {
            	    // InternalProjectDSL.g:445:4: (lv_type_4_0= ruleType )
            	    // InternalProjectDSL.g:446:5: lv_type_4_0= ruleType
            	    {

            	    					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_type_4_0=ruleType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParameterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"type",
            	    						lv_type_4_0,
            	    						"org.xtext.example.mydsl.ProjectDSL.Type");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // InternalProjectDSL.g:463:3: (otherlv_5= 'require' ( (otherlv_6= RULE_ID ) ) ( ( (lv_op_7_1= '>=' | lv_op_7_2= '<=' | lv_op_7_3= '>' | lv_op_7_4= '<' ) ) ) ( (lv_content_8_0= ruleMathContent ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalProjectDSL.g:464:4: otherlv_5= 'require' ( (otherlv_6= RULE_ID ) ) ( ( (lv_op_7_1= '>=' | lv_op_7_2= '<=' | lv_op_7_3= '>' | lv_op_7_4= '<' ) ) ) ( (lv_content_8_0= ruleMathContent ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getRequireKeyword_5_0());
                    			
                    // InternalProjectDSL.g:468:4: ( (otherlv_6= RULE_ID ) )
                    // InternalProjectDSL.g:469:5: (otherlv_6= RULE_ID )
                    {
                    // InternalProjectDSL.g:469:5: (otherlv_6= RULE_ID )
                    // InternalProjectDSL.g:470:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getLeftParameterCrossReference_5_1_0());
                    					

                    }


                    }

                    // InternalProjectDSL.g:481:4: ( ( (lv_op_7_1= '>=' | lv_op_7_2= '<=' | lv_op_7_3= '>' | lv_op_7_4= '<' ) ) )
                    // InternalProjectDSL.g:482:5: ( (lv_op_7_1= '>=' | lv_op_7_2= '<=' | lv_op_7_3= '>' | lv_op_7_4= '<' ) )
                    {
                    // InternalProjectDSL.g:482:5: ( (lv_op_7_1= '>=' | lv_op_7_2= '<=' | lv_op_7_3= '>' | lv_op_7_4= '<' ) )
                    // InternalProjectDSL.g:483:6: (lv_op_7_1= '>=' | lv_op_7_2= '<=' | lv_op_7_3= '>' | lv_op_7_4= '<' )
                    {
                    // InternalProjectDSL.g:483:6: (lv_op_7_1= '>=' | lv_op_7_2= '<=' | lv_op_7_3= '>' | lv_op_7_4= '<' )
                    int alt7=4;
                    switch ( input.LA(1) ) {
                    case 23:
                        {
                        alt7=1;
                        }
                        break;
                    case 24:
                        {
                        alt7=2;
                        }
                        break;
                    case 25:
                        {
                        alt7=3;
                        }
                        break;
                    case 26:
                        {
                        alt7=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }

                    switch (alt7) {
                        case 1 :
                            // InternalProjectDSL.g:484:7: lv_op_7_1= '>='
                            {
                            lv_op_7_1=(Token)match(input,23,FOLLOW_17); 

                            							newLeafNode(lv_op_7_1, grammarAccess.getParameterAccess().getOpGreaterThanSignEqualsSignKeyword_5_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getParameterRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_7_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalProjectDSL.g:495:7: lv_op_7_2= '<='
                            {
                            lv_op_7_2=(Token)match(input,24,FOLLOW_17); 

                            							newLeafNode(lv_op_7_2, grammarAccess.getParameterAccess().getOpLessThanSignEqualsSignKeyword_5_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getParameterRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_7_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalProjectDSL.g:506:7: lv_op_7_3= '>'
                            {
                            lv_op_7_3=(Token)match(input,25,FOLLOW_17); 

                            							newLeafNode(lv_op_7_3, grammarAccess.getParameterAccess().getOpGreaterThanSignKeyword_5_2_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getParameterRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_7_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalProjectDSL.g:517:7: lv_op_7_4= '<'
                            {
                            lv_op_7_4=(Token)match(input,26,FOLLOW_17); 

                            							newLeafNode(lv_op_7_4, grammarAccess.getParameterAccess().getOpLessThanSignKeyword_5_2_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getParameterRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_7_4, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalProjectDSL.g:530:4: ( (lv_content_8_0= ruleMathContent ) )
                    // InternalProjectDSL.g:531:5: (lv_content_8_0= ruleMathContent )
                    {
                    // InternalProjectDSL.g:531:5: (lv_content_8_0= ruleMathContent )
                    // InternalProjectDSL.g:532:6: lv_content_8_0= ruleMathContent
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getContentMathContentParserRuleCall_5_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_content_8_0=ruleMathContent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"content",
                    							lv_content_8_0,
                    							"org.xtext.example.mydsl.ProjectDSL.MathContent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleType"
    // InternalProjectDSL.g:554:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalProjectDSL.g:554:44: (iv_ruleType= ruleType EOF )
            // InternalProjectDSL.g:555:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalProjectDSL.g:561:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'R' | kw= 'U' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalProjectDSL.g:567:2: ( (kw= 'R' | kw= 'U' ) )
            // InternalProjectDSL.g:568:2: (kw= 'R' | kw= 'U' )
            {
            // InternalProjectDSL.g:568:2: (kw= 'R' | kw= 'U' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            else if ( (LA9_0==28) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalProjectDSL.g:569:3: kw= 'R'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getRKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalProjectDSL.g:575:3: kw= 'U'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getUKeyword_1());
                    		

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleMathContent"
    // InternalProjectDSL.g:584:1: entryRuleMathContent returns [EObject current=null] : iv_ruleMathContent= ruleMathContent EOF ;
    public final EObject entryRuleMathContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathContent = null;


        try {
            // InternalProjectDSL.g:584:52: (iv_ruleMathContent= ruleMathContent EOF )
            // InternalProjectDSL.g:585:2: iv_ruleMathContent= ruleMathContent EOF
            {
             newCompositeNode(grammarAccess.getMathContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathContent=ruleMathContent();

            state._fsp--;

             current =iv_ruleMathContent; 
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
    // $ANTLR end "entryRuleMathContent"


    // $ANTLR start "ruleMathContent"
    // InternalProjectDSL.g:591:1: ruleMathContent returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) ( (lv_mathType_2_0= ruleMathType ) ) ( (lv_math_3_0= ruleMathExp ) ) ) | ( (lv_math_4_0= ruleMathExp ) ) ) ;
    public final EObject ruleMathContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_mathType_2_0 = null;

        EObject lv_math_3_0 = null;

        EObject lv_math_4_0 = null;



        	enterRule();

        try {
            // InternalProjectDSL.g:597:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) ( (lv_mathType_2_0= ruleMathType ) ) ( (lv_math_3_0= ruleMathExp ) ) ) | ( (lv_math_4_0= ruleMathExp ) ) ) )
            // InternalProjectDSL.g:598:2: ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) ( (lv_mathType_2_0= ruleMathType ) ) ( (lv_math_3_0= ruleMathExp ) ) ) | ( (lv_math_4_0= ruleMathExp ) ) )
            {
            // InternalProjectDSL.g:598:2: ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) ( (lv_mathType_2_0= ruleMathType ) ) ( (lv_math_3_0= ruleMathExp ) ) ) | ( (lv_math_4_0= ruleMathExp ) ) )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==EOF||LA10_1==RULE_ID||LA10_1==15) ) {
                    alt10=1;
                }
                else if ( ((LA10_1>=29 && LA10_1<=32)) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==RULE_INT||LA10_0==33) ) {
                alt10=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalProjectDSL.g:599:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalProjectDSL.g:599:3: ( (otherlv_0= RULE_ID ) )
                    // InternalProjectDSL.g:600:4: (otherlv_0= RULE_ID )
                    {
                    // InternalProjectDSL.g:600:4: (otherlv_0= RULE_ID )
                    // InternalProjectDSL.g:601:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMathContentRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getMathContentAccess().getRightParameterCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalProjectDSL.g:613:3: ( ( (otherlv_1= RULE_ID ) ) ( (lv_mathType_2_0= ruleMathType ) ) ( (lv_math_3_0= ruleMathExp ) ) )
                    {
                    // InternalProjectDSL.g:613:3: ( ( (otherlv_1= RULE_ID ) ) ( (lv_mathType_2_0= ruleMathType ) ) ( (lv_math_3_0= ruleMathExp ) ) )
                    // InternalProjectDSL.g:614:4: ( (otherlv_1= RULE_ID ) ) ( (lv_mathType_2_0= ruleMathType ) ) ( (lv_math_3_0= ruleMathExp ) )
                    {
                    // InternalProjectDSL.g:614:4: ( (otherlv_1= RULE_ID ) )
                    // InternalProjectDSL.g:615:5: (otherlv_1= RULE_ID )
                    {
                    // InternalProjectDSL.g:615:5: (otherlv_1= RULE_ID )
                    // InternalProjectDSL.g:616:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMathContentRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_1, grammarAccess.getMathContentAccess().getRightParameterCrossReference_1_0_0());
                    					

                    }


                    }

                    // InternalProjectDSL.g:627:4: ( (lv_mathType_2_0= ruleMathType ) )
                    // InternalProjectDSL.g:628:5: (lv_mathType_2_0= ruleMathType )
                    {
                    // InternalProjectDSL.g:628:5: (lv_mathType_2_0= ruleMathType )
                    // InternalProjectDSL.g:629:6: lv_mathType_2_0= ruleMathType
                    {

                    						newCompositeNode(grammarAccess.getMathContentAccess().getMathTypeMathTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_mathType_2_0=ruleMathType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMathContentRule());
                    						}
                    						set(
                    							current,
                    							"mathType",
                    							lv_mathType_2_0,
                    							"org.xtext.example.mydsl.ProjectDSL.MathType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProjectDSL.g:646:4: ( (lv_math_3_0= ruleMathExp ) )
                    // InternalProjectDSL.g:647:5: (lv_math_3_0= ruleMathExp )
                    {
                    // InternalProjectDSL.g:647:5: (lv_math_3_0= ruleMathExp )
                    // InternalProjectDSL.g:648:6: lv_math_3_0= ruleMathExp
                    {

                    						newCompositeNode(grammarAccess.getMathContentAccess().getMathMathExpParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_math_3_0=ruleMathExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMathContentRule());
                    						}
                    						set(
                    							current,
                    							"math",
                    							lv_math_3_0,
                    							"org.xtext.example.mydsl.ProjectDSL.MathExp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalProjectDSL.g:667:3: ( (lv_math_4_0= ruleMathExp ) )
                    {
                    // InternalProjectDSL.g:667:3: ( (lv_math_4_0= ruleMathExp ) )
                    // InternalProjectDSL.g:668:4: (lv_math_4_0= ruleMathExp )
                    {
                    // InternalProjectDSL.g:668:4: (lv_math_4_0= ruleMathExp )
                    // InternalProjectDSL.g:669:5: lv_math_4_0= ruleMathExp
                    {

                    					newCompositeNode(grammarAccess.getMathContentAccess().getMathMathExpParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_math_4_0=ruleMathExp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMathContentRule());
                    					}
                    					set(
                    						current,
                    						"math",
                    						lv_math_4_0,
                    						"org.xtext.example.mydsl.ProjectDSL.MathExp");
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
    // $ANTLR end "ruleMathContent"


    // $ANTLR start "entryRuleMathType"
    // InternalProjectDSL.g:690:1: entryRuleMathType returns [String current=null] : iv_ruleMathType= ruleMathType EOF ;
    public final String entryRuleMathType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMathType = null;


        try {
            // InternalProjectDSL.g:690:48: (iv_ruleMathType= ruleMathType EOF )
            // InternalProjectDSL.g:691:2: iv_ruleMathType= ruleMathType EOF
            {
             newCompositeNode(grammarAccess.getMathTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathType=ruleMathType();

            state._fsp--;

             current =iv_ruleMathType.getText(); 
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
    // $ANTLR end "entryRuleMathType"


    // $ANTLR start "ruleMathType"
    // InternalProjectDSL.g:697:1: ruleMathType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' | kw= '/' | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMathType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalProjectDSL.g:703:2: ( (kw= '+' | kw= '-' | kw= '/' | kw= '*' ) )
            // InternalProjectDSL.g:704:2: (kw= '+' | kw= '-' | kw= '/' | kw= '*' )
            {
            // InternalProjectDSL.g:704:2: (kw= '+' | kw= '-' | kw= '/' | kw= '*' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt11=1;
                }
                break;
            case 30:
                {
                alt11=2;
                }
                break;
            case 31:
                {
                alt11=3;
                }
                break;
            case 32:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalProjectDSL.g:705:3: kw= '+'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMathTypeAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalProjectDSL.g:711:3: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMathTypeAccess().getHyphenMinusKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalProjectDSL.g:717:3: kw= '/'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMathTypeAccess().getSolidusKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalProjectDSL.g:723:3: kw= '*'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMathTypeAccess().getAsteriskKeyword_3());
                    		

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
    // $ANTLR end "ruleMathType"


    // $ANTLR start "entryRuleMathExp"
    // InternalProjectDSL.g:732:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalProjectDSL.g:732:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalProjectDSL.g:733:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalProjectDSL.g:739:1: ruleMathExp returns [EObject current=null] : ( (lv_exp_0_0= ruleExp ) ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        EObject lv_exp_0_0 = null;



        	enterRule();

        try {
            // InternalProjectDSL.g:745:2: ( ( (lv_exp_0_0= ruleExp ) ) )
            // InternalProjectDSL.g:746:2: ( (lv_exp_0_0= ruleExp ) )
            {
            // InternalProjectDSL.g:746:2: ( (lv_exp_0_0= ruleExp ) )
            // InternalProjectDSL.g:747:3: (lv_exp_0_0= ruleExp )
            {
            // InternalProjectDSL.g:747:3: (lv_exp_0_0= ruleExp )
            // InternalProjectDSL.g:748:4: lv_exp_0_0= ruleExp
            {

            				newCompositeNode(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_exp_0_0=ruleExp();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getMathExpRule());
            				}
            				set(
            					current,
            					"exp",
            					lv_exp_0_0,
            					"org.xtext.example.mydsl.ProjectDSL.Exp");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExp"
    // InternalProjectDSL.g:768:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalProjectDSL.g:768:44: (iv_ruleExp= ruleExp EOF )
            // InternalProjectDSL.g:769:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalProjectDSL.g:775:1: ruleExp returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalProjectDSL.g:781:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalProjectDSL.g:782:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalProjectDSL.g:782:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalProjectDSL.g:783:3: this_MulOrDiv_0= ruleMulOrDiv ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalProjectDSL.g:791:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=29 && LA13_0<=30)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalProjectDSL.g:792:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalProjectDSL.g:792:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==29) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==30) ) {
            	        alt12=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalProjectDSL.g:793:5: (otherlv_1= '+' () )
            	            {
            	            // InternalProjectDSL.g:793:5: (otherlv_1= '+' () )
            	            // InternalProjectDSL.g:794:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,29,FOLLOW_17); 

            	            						newLeafNode(otherlv_1, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalProjectDSL.g:798:6: ()
            	            // InternalProjectDSL.g:799:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalProjectDSL.g:807:5: (otherlv_3= '-' () )
            	            {
            	            // InternalProjectDSL.g:807:5: (otherlv_3= '-' () )
            	            // InternalProjectDSL.g:808:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,30,FOLLOW_17); 

            	            						newLeafNode(otherlv_3, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalProjectDSL.g:812:6: ()
            	            // InternalProjectDSL.g:813:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalProjectDSL.g:821:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalProjectDSL.g:822:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalProjectDSL.g:822:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalProjectDSL.g:823:6: lv_right_5_0= ruleMulOrDiv
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightMulOrDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.xtext.example.mydsl.ProjectDSL.MulOrDiv");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalProjectDSL.g:845:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalProjectDSL.g:845:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalProjectDSL.g:846:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
             newCompositeNode(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;

             current =iv_ruleMulOrDiv; 
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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalProjectDSL.g:852:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalProjectDSL.g:858:2: ( (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalProjectDSL.g:859:2: (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalProjectDSL.g:859:2: (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalProjectDSL.g:860:3: this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalProjectDSL.g:868:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=31 && LA15_0<=32)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalProjectDSL.g:869:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalProjectDSL.g:869:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==32) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==31) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalProjectDSL.g:870:5: (otherlv_1= '*' () )
            	            {
            	            // InternalProjectDSL.g:870:5: (otherlv_1= '*' () )
            	            // InternalProjectDSL.g:871:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,32,FOLLOW_17); 

            	            						newLeafNode(otherlv_1, grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalProjectDSL.g:875:6: ()
            	            // InternalProjectDSL.g:876:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMulOrDivAccess().getMultLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalProjectDSL.g:884:5: (otherlv_3= '/' () )
            	            {
            	            // InternalProjectDSL.g:884:5: (otherlv_3= '/' () )
            	            // InternalProjectDSL.g:885:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,31,FOLLOW_17); 

            	            						newLeafNode(otherlv_3, grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalProjectDSL.g:889:6: ()
            	            // InternalProjectDSL.g:890:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMulOrDivAccess().getDivLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalProjectDSL.g:898:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalProjectDSL.g:899:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalProjectDSL.g:899:5: (lv_right_5_0= rulePrimary )
            	    // InternalProjectDSL.g:900:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.xtext.example.mydsl.ProjectDSL.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalProjectDSL.g:922:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalProjectDSL.g:922:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalProjectDSL.g:923:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalProjectDSL.g:929:1: rulePrimary returns [EObject current=null] : (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_Parenthesis_1 = null;



        	enterRule();

        try {
            // InternalProjectDSL.g:935:2: ( (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis ) )
            // InternalProjectDSL.g:936:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis )
            {
            // InternalProjectDSL.g:936:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            else if ( (LA16_0==33) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalProjectDSL.g:937:3: this_Number_0= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_0=ruleNumber();

                    state._fsp--;


                    			current = this_Number_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalProjectDSL.g:946:3: this_Parenthesis_1= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_1=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_1;
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


    // $ANTLR start "entryRuleParenthesis"
    // InternalProjectDSL.g:958:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalProjectDSL.g:958:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalProjectDSL.g:959:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalProjectDSL.g:965:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Exp_1 = null;



        	enterRule();

        try {
            // InternalProjectDSL.g:971:2: ( (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) )
            // InternalProjectDSL.g:972:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            {
            // InternalProjectDSL.g:972:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            // InternalProjectDSL.g:973:3: otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenthesisAccess().getExpParserRuleCall_1());
            		
            pushFollow(FOLLOW_21);
            this_Exp_1=ruleExp();

            state._fsp--;


            			current = this_Exp_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleNumber"
    // InternalProjectDSL.g:993:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalProjectDSL.g:993:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalProjectDSL.g:994:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalProjectDSL.g:1000:1: ruleNumber returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalProjectDSL.g:1006:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalProjectDSL.g:1007:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalProjectDSL.g:1007:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalProjectDSL.g:1008:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalProjectDSL.g:1008:3: ()
            // InternalProjectDSL.g:1009:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberAccess().getNumAction_0(),
            					current);
            			

            }

            // InternalProjectDSL.g:1015:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalProjectDSL.g:1016:4: (lv_value_1_0= RULE_INT )
            {
            // InternalProjectDSL.g:1016:4: (lv_value_1_0= RULE_INT )
            // InternalProjectDSL.g:1017:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleNumber"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000011002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000018400002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});

}