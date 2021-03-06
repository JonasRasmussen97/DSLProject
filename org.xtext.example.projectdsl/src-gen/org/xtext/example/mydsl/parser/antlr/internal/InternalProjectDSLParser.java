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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'entity'", "'extends'", "'requires'", "'{'", "'}'", "'controller'", "'uses'", "','", "'make'", "'='", "':'", "'require'", "'>='", "'<='", "'>'", "'<'", "'=='", "'=!'", "'R'", "'U'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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

                if ( (LA1_0==12||LA1_0==17) ) {
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
            else if ( (LA2_0==17) ) {
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
    // InternalProjectDSL.g:167:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'requires' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) )+ otherlv_8= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_parameters_7_0 = null;



        	enterRule();

        try {
            // InternalProjectDSL.g:173:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'requires' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) )+ otherlv_8= '}' ) )
            // InternalProjectDSL.g:174:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'requires' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) )+ otherlv_8= '}' )
            {
            // InternalProjectDSL.g:174:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'requires' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) )+ otherlv_8= '}' )
            // InternalProjectDSL.g:175:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'requires' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_parameters_7_0= ruleParameter ) )+ otherlv_8= '}'
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

            // InternalProjectDSL.g:197:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalProjectDSL.g:198:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                    			
                    // InternalProjectDSL.g:202:4: ( (otherlv_3= RULE_ID ) )
                    // InternalProjectDSL.g:203:5: (otherlv_3= RULE_ID )
                    {
                    // InternalProjectDSL.g:203:5: (otherlv_3= RULE_ID )
                    // InternalProjectDSL.g:204:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getParentEntityCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalProjectDSL.g:216:3: (otherlv_4= 'requires' ( (otherlv_5= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalProjectDSL.g:217:4: otherlv_4= 'requires' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRequiresKeyword_3_0());
                    			
                    // InternalProjectDSL.g:221:4: ( (otherlv_5= RULE_ID ) )
                    // InternalProjectDSL.g:222:5: (otherlv_5= RULE_ID )
                    {
                    // InternalProjectDSL.g:222:5: (otherlv_5= RULE_ID )
                    // InternalProjectDSL.g:223:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getCtrlrControllerCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalProjectDSL.g:239:3: ( (lv_parameters_7_0= ruleParameter ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalProjectDSL.g:240:4: (lv_parameters_7_0= ruleParameter )
            	    {
            	    // InternalProjectDSL.g:240:4: (lv_parameters_7_0= ruleParameter )
            	    // InternalProjectDSL.g:241:5: lv_parameters_7_0= ruleParameter
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getParametersParameterParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_parameters_7_0=ruleParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_7_0,
            	    						"org.xtext.example.mydsl.ProjectDSL.Parameter");
            	    					afterParserOrEnumRuleCall();
            	    				

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

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalProjectDSL.g:266:1: entryRuleController returns [EObject current=null] : iv_ruleController= ruleController EOF ;
    public final EObject entryRuleController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleController = null;


        try {
            // InternalProjectDSL.g:266:51: (iv_ruleController= ruleController EOF )
            // InternalProjectDSL.g:267:2: iv_ruleController= ruleController EOF
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
    // InternalProjectDSL.g:273:1: ruleController returns [EObject current=null] : (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '{' (otherlv_7= 'make' ( (lv_endpoint_8_0= ruleEndpoint ) ) )+ otherlv_9= '}' ) ;
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
            // InternalProjectDSL.g:279:2: ( (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '{' (otherlv_7= 'make' ( (lv_endpoint_8_0= ruleEndpoint ) ) )+ otherlv_9= '}' ) )
            // InternalProjectDSL.g:280:2: (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '{' (otherlv_7= 'make' ( (lv_endpoint_8_0= ruleEndpoint ) ) )+ otherlv_9= '}' )
            {
            // InternalProjectDSL.g:280:2: (otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '{' (otherlv_7= 'make' ( (lv_endpoint_8_0= ruleEndpoint ) ) )+ otherlv_9= '}' )
            // InternalProjectDSL.g:281:3: otherlv_0= 'controller' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= '{' (otherlv_7= 'make' ( (lv_endpoint_8_0= ruleEndpoint ) ) )+ otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getControllerAccess().getControllerKeyword_0());
            		
            // InternalProjectDSL.g:285:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalProjectDSL.g:286:4: (lv_name_1_0= RULE_ID )
            {
            // InternalProjectDSL.g:286:4: (lv_name_1_0= RULE_ID )
            // InternalProjectDSL.g:287:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getControllerAccess().getUsesKeyword_2());
            		
            // InternalProjectDSL.g:307:3: ( (otherlv_3= RULE_ID ) )
            // InternalProjectDSL.g:308:4: (otherlv_3= RULE_ID )
            {
            // InternalProjectDSL.g:308:4: (otherlv_3= RULE_ID )
            // InternalProjectDSL.g:309:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getControllerRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_3, grammarAccess.getControllerAccess().getBaseEntityCrossReference_3_0());
            				

            }


            }

            // InternalProjectDSL.g:320:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalProjectDSL.g:321:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getControllerAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalProjectDSL.g:325:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalProjectDSL.g:326:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalProjectDSL.g:326:5: (otherlv_5= RULE_ID )
            	    // InternalProjectDSL.g:327:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getControllerRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(otherlv_5, grammarAccess.getControllerAccess().getBaseEntityCrossReference_4_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalProjectDSL.g:343:3: (otherlv_7= 'make' ( (lv_endpoint_8_0= ruleEndpoint ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalProjectDSL.g:344:4: otherlv_7= 'make' ( (lv_endpoint_8_0= ruleEndpoint ) )
            	    {
            	    otherlv_7=(Token)match(input,20,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getControllerAccess().getMakeKeyword_6_0());
            	    			
            	    // InternalProjectDSL.g:348:4: ( (lv_endpoint_8_0= ruleEndpoint ) )
            	    // InternalProjectDSL.g:349:5: (lv_endpoint_8_0= ruleEndpoint )
            	    {
            	    // InternalProjectDSL.g:349:5: (lv_endpoint_8_0= ruleEndpoint )
            	    // InternalProjectDSL.g:350:6: lv_endpoint_8_0= ruleEndpoint
            	    {

            	    						newCompositeNode(grammarAccess.getControllerAccess().getEndpointEndpointParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

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
    // InternalProjectDSL.g:376:1: entryRuleEndpoint returns [EObject current=null] : iv_ruleEndpoint= ruleEndpoint EOF ;
    public final EObject entryRuleEndpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndpoint = null;


        try {
            // InternalProjectDSL.g:376:49: (iv_ruleEndpoint= ruleEndpoint EOF )
            // InternalProjectDSL.g:377:2: iv_ruleEndpoint= ruleEndpoint EOF
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
    // InternalProjectDSL.g:383:1: ruleEndpoint returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleEndpoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalProjectDSL.g:389:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalProjectDSL.g:390:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalProjectDSL.g:390:2: ( (otherlv_0= RULE_ID ) )
            // InternalProjectDSL.g:391:3: (otherlv_0= RULE_ID )
            {
            // InternalProjectDSL.g:391:3: (otherlv_0= RULE_ID )
            // InternalProjectDSL.g:392:4: otherlv_0= RULE_ID
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
    // InternalProjectDSL.g:406:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalProjectDSL.g:406:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalProjectDSL.g:407:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalProjectDSL.g:413:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_dataType_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) )+ (otherlv_5= 'require' ( (lv_left_6_0= ruleMathExp ) ) ( ( (lv_op_7_1= '>=' | lv_op_7_2= '<=' | lv_op_7_3= '>' | lv_op_7_4= '<' | lv_op_7_5= '==' | lv_op_7_6= '=!' ) ) ) ( (lv_right_8_0= ruleMathExp ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_dataType_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_op_7_1=null;
        Token lv_op_7_2=null;
        Token lv_op_7_3=null;
        Token lv_op_7_4=null;
        Token lv_op_7_5=null;
        Token lv_op_7_6=null;
        AntlrDatatypeRuleToken lv_type_4_0 = null;

        EObject lv_left_6_0 = null;

        EObject lv_right_8_0 = null;



        	enterRule();

        try {
            // InternalProjectDSL.g:419:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_dataType_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) )+ (otherlv_5= 'require' ( (lv_left_6_0= ruleMathExp ) ) ( ( (lv_op_7_1= '>=' | lv_op_7_2= '<=' | lv_op_7_3= '>' | lv_op_7_4= '<' | lv_op_7_5= '==' | lv_op_7_6= '=!' ) ) ) ( (lv_right_8_0= ruleMathExp ) ) )? ) )
            // InternalProjectDSL.g:420:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_dataType_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) )+ (otherlv_5= 'require' ( (lv_left_6_0= ruleMathExp ) ) ( ( (lv_op_7_1= '>=' | lv_op_7_2= '<=' | lv_op_7_3= '>' | lv_op_7_4= '<' | lv_op_7_5= '==' | lv_op_7_6= '=!' ) ) ) ( (lv_right_8_0= ruleMathExp ) ) )? )
            {
            // InternalProjectDSL.g:420:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_dataType_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) )+ (otherlv_5= 'require' ( (lv_left_6_0= ruleMathExp ) ) ( ( (lv_op_7_1= '>=' | lv_op_7_2= '<=' | lv_op_7_3= '>' | lv_op_7_4= '<' | lv_op_7_5= '==' | lv_op_7_6= '=!' ) ) ) ( (lv_right_8_0= ruleMathExp ) ) )? )
            // InternalProjectDSL.g:421:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_dataType_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) )+ (otherlv_5= 'require' ( (lv_left_6_0= ruleMathExp ) ) ( ( (lv_op_7_1= '>=' | lv_op_7_2= '<=' | lv_op_7_3= '>' | lv_op_7_4= '<' | lv_op_7_5= '==' | lv_op_7_6= '=!' ) ) ) ( (lv_right_8_0= ruleMathExp ) ) )?
            {
            // InternalProjectDSL.g:421:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalProjectDSL.g:422:4: (lv_name_0_0= RULE_ID )
            {
            // InternalProjectDSL.g:422:4: (lv_name_0_0= RULE_ID )
            // InternalProjectDSL.g:423:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getEqualsSignKeyword_1());
            		
            // InternalProjectDSL.g:443:3: ( (lv_dataType_2_0= RULE_ID ) )
            // InternalProjectDSL.g:444:4: (lv_dataType_2_0= RULE_ID )
            {
            // InternalProjectDSL.g:444:4: (lv_dataType_2_0= RULE_ID )
            // InternalProjectDSL.g:445:5: lv_dataType_2_0= RULE_ID
            {
            lv_dataType_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            otherlv_3=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getColonKeyword_3());
            		
            // InternalProjectDSL.g:465:3: ( (lv_type_4_0= ruleType ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=30 && LA8_0<=31)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalProjectDSL.g:466:4: (lv_type_4_0= ruleType )
            	    {
            	    // InternalProjectDSL.g:466:4: (lv_type_4_0= ruleType )
            	    // InternalProjectDSL.g:467:5: lv_type_4_0= ruleType
            	    {

            	    					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_16);
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // InternalProjectDSL.g:484:3: (otherlv_5= 'require' ( (lv_left_6_0= ruleMathExp ) ) ( ( (lv_op_7_1= '>=' | lv_op_7_2= '<=' | lv_op_7_3= '>' | lv_op_7_4= '<' | lv_op_7_5= '==' | lv_op_7_6= '=!' ) ) ) ( (lv_right_8_0= ruleMathExp ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalProjectDSL.g:485:4: otherlv_5= 'require' ( (lv_left_6_0= ruleMathExp ) ) ( ( (lv_op_7_1= '>=' | lv_op_7_2= '<=' | lv_op_7_3= '>' | lv_op_7_4= '<' | lv_op_7_5= '==' | lv_op_7_6= '=!' ) ) ) ( (lv_right_8_0= ruleMathExp ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getRequireKeyword_5_0());
                    			
                    // InternalProjectDSL.g:489:4: ( (lv_left_6_0= ruleMathExp ) )
                    // InternalProjectDSL.g:490:5: (lv_left_6_0= ruleMathExp )
                    {
                    // InternalProjectDSL.g:490:5: (lv_left_6_0= ruleMathExp )
                    // InternalProjectDSL.g:491:6: lv_left_6_0= ruleMathExp
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getLeftMathExpParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_left_6_0=ruleMathExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_6_0,
                    							"org.xtext.example.mydsl.ProjectDSL.MathExp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalProjectDSL.g:508:4: ( ( (lv_op_7_1= '>=' | lv_op_7_2= '<=' | lv_op_7_3= '>' | lv_op_7_4= '<' | lv_op_7_5= '==' | lv_op_7_6= '=!' ) ) )
                    // InternalProjectDSL.g:509:5: ( (lv_op_7_1= '>=' | lv_op_7_2= '<=' | lv_op_7_3= '>' | lv_op_7_4= '<' | lv_op_7_5= '==' | lv_op_7_6= '=!' ) )
                    {
                    // InternalProjectDSL.g:509:5: ( (lv_op_7_1= '>=' | lv_op_7_2= '<=' | lv_op_7_3= '>' | lv_op_7_4= '<' | lv_op_7_5= '==' | lv_op_7_6= '=!' ) )
                    // InternalProjectDSL.g:510:6: (lv_op_7_1= '>=' | lv_op_7_2= '<=' | lv_op_7_3= '>' | lv_op_7_4= '<' | lv_op_7_5= '==' | lv_op_7_6= '=!' )
                    {
                    // InternalProjectDSL.g:510:6: (lv_op_7_1= '>=' | lv_op_7_2= '<=' | lv_op_7_3= '>' | lv_op_7_4= '<' | lv_op_7_5= '==' | lv_op_7_6= '=!' )
                    int alt9=6;
                    switch ( input.LA(1) ) {
                    case 24:
                        {
                        alt9=1;
                        }
                        break;
                    case 25:
                        {
                        alt9=2;
                        }
                        break;
                    case 26:
                        {
                        alt9=3;
                        }
                        break;
                    case 27:
                        {
                        alt9=4;
                        }
                        break;
                    case 28:
                        {
                        alt9=5;
                        }
                        break;
                    case 29:
                        {
                        alt9=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }

                    switch (alt9) {
                        case 1 :
                            // InternalProjectDSL.g:511:7: lv_op_7_1= '>='
                            {
                            lv_op_7_1=(Token)match(input,24,FOLLOW_17); 

                            							newLeafNode(lv_op_7_1, grammarAccess.getParameterAccess().getOpGreaterThanSignEqualsSignKeyword_5_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getParameterRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_7_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalProjectDSL.g:522:7: lv_op_7_2= '<='
                            {
                            lv_op_7_2=(Token)match(input,25,FOLLOW_17); 

                            							newLeafNode(lv_op_7_2, grammarAccess.getParameterAccess().getOpLessThanSignEqualsSignKeyword_5_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getParameterRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_7_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalProjectDSL.g:533:7: lv_op_7_3= '>'
                            {
                            lv_op_7_3=(Token)match(input,26,FOLLOW_17); 

                            							newLeafNode(lv_op_7_3, grammarAccess.getParameterAccess().getOpGreaterThanSignKeyword_5_2_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getParameterRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_7_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalProjectDSL.g:544:7: lv_op_7_4= '<'
                            {
                            lv_op_7_4=(Token)match(input,27,FOLLOW_17); 

                            							newLeafNode(lv_op_7_4, grammarAccess.getParameterAccess().getOpLessThanSignKeyword_5_2_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getParameterRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_7_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalProjectDSL.g:555:7: lv_op_7_5= '=='
                            {
                            lv_op_7_5=(Token)match(input,28,FOLLOW_17); 

                            							newLeafNode(lv_op_7_5, grammarAccess.getParameterAccess().getOpEqualsSignEqualsSignKeyword_5_2_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getParameterRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_7_5, null);
                            						

                            }
                            break;
                        case 6 :
                            // InternalProjectDSL.g:566:7: lv_op_7_6= '=!'
                            {
                            lv_op_7_6=(Token)match(input,29,FOLLOW_17); 

                            							newLeafNode(lv_op_7_6, grammarAccess.getParameterAccess().getOpEqualsSignExclamationMarkKeyword_5_2_0_5());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getParameterRule());
                            							}
                            							setWithLastConsumed(current, "op", lv_op_7_6, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalProjectDSL.g:579:4: ( (lv_right_8_0= ruleMathExp ) )
                    // InternalProjectDSL.g:580:5: (lv_right_8_0= ruleMathExp )
                    {
                    // InternalProjectDSL.g:580:5: (lv_right_8_0= ruleMathExp )
                    // InternalProjectDSL.g:581:6: lv_right_8_0= ruleMathExp
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getRightMathExpParserRuleCall_5_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_8_0=ruleMathExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_8_0,
                    							"org.xtext.example.mydsl.ProjectDSL.MathExp");
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
    // InternalProjectDSL.g:603:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalProjectDSL.g:603:44: (iv_ruleType= ruleType EOF )
            // InternalProjectDSL.g:604:2: iv_ruleType= ruleType EOF
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
    // InternalProjectDSL.g:610:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'R' | kw= 'U' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalProjectDSL.g:616:2: ( (kw= 'R' | kw= 'U' ) )
            // InternalProjectDSL.g:617:2: (kw= 'R' | kw= 'U' )
            {
            // InternalProjectDSL.g:617:2: (kw= 'R' | kw= 'U' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            else if ( (LA11_0==31) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalProjectDSL.g:618:3: kw= 'R'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getRKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalProjectDSL.g:624:3: kw= 'U'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

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


    // $ANTLR start "entryRuleMathExp"
    // InternalProjectDSL.g:633:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalProjectDSL.g:633:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalProjectDSL.g:634:2: iv_ruleMathExp= ruleMathExp EOF
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
    // InternalProjectDSL.g:640:1: ruleMathExp returns [EObject current=null] : ( (lv_exp_0_0= ruleExp ) ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        EObject lv_exp_0_0 = null;



        	enterRule();

        try {
            // InternalProjectDSL.g:646:2: ( ( (lv_exp_0_0= ruleExp ) ) )
            // InternalProjectDSL.g:647:2: ( (lv_exp_0_0= ruleExp ) )
            {
            // InternalProjectDSL.g:647:2: ( (lv_exp_0_0= ruleExp ) )
            // InternalProjectDSL.g:648:3: (lv_exp_0_0= ruleExp )
            {
            // InternalProjectDSL.g:648:3: (lv_exp_0_0= ruleExp )
            // InternalProjectDSL.g:649:4: lv_exp_0_0= ruleExp
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
    // InternalProjectDSL.g:669:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalProjectDSL.g:669:44: (iv_ruleExp= ruleExp EOF )
            // InternalProjectDSL.g:670:2: iv_ruleExp= ruleExp EOF
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
    // InternalProjectDSL.g:676:1: ruleExp returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalProjectDSL.g:682:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalProjectDSL.g:683:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalProjectDSL.g:683:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalProjectDSL.g:684:3: this_MulOrDiv_0= ruleMulOrDiv ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalProjectDSL.g:692:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=32 && LA13_0<=33)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalProjectDSL.g:693:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalProjectDSL.g:693:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==32) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==33) ) {
            	        alt12=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalProjectDSL.g:694:5: (otherlv_1= '+' () )
            	            {
            	            // InternalProjectDSL.g:694:5: (otherlv_1= '+' () )
            	            // InternalProjectDSL.g:695:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,32,FOLLOW_17); 

            	            						newLeafNode(otherlv_1, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalProjectDSL.g:699:6: ()
            	            // InternalProjectDSL.g:700:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalProjectDSL.g:708:5: (otherlv_3= '-' () )
            	            {
            	            // InternalProjectDSL.g:708:5: (otherlv_3= '-' () )
            	            // InternalProjectDSL.g:709:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,33,FOLLOW_17); 

            	            						newLeafNode(otherlv_3, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalProjectDSL.g:713:6: ()
            	            // InternalProjectDSL.g:714:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalProjectDSL.g:722:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalProjectDSL.g:723:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalProjectDSL.g:723:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalProjectDSL.g:724:6: lv_right_5_0= ruleMulOrDiv
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
    // InternalProjectDSL.g:746:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalProjectDSL.g:746:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalProjectDSL.g:747:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
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
    // InternalProjectDSL.g:753:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalProjectDSL.g:759:2: ( (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalProjectDSL.g:760:2: (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalProjectDSL.g:760:2: (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalProjectDSL.g:761:3: this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalProjectDSL.g:769:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=34 && LA15_0<=35)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalProjectDSL.g:770:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalProjectDSL.g:770:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==34) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==35) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalProjectDSL.g:771:5: (otherlv_1= '*' () )
            	            {
            	            // InternalProjectDSL.g:771:5: (otherlv_1= '*' () )
            	            // InternalProjectDSL.g:772:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,34,FOLLOW_17); 

            	            						newLeafNode(otherlv_1, grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalProjectDSL.g:776:6: ()
            	            // InternalProjectDSL.g:777:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMulOrDivAccess().getMultLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalProjectDSL.g:785:5: (otherlv_3= '/' () )
            	            {
            	            // InternalProjectDSL.g:785:5: (otherlv_3= '/' () )
            	            // InternalProjectDSL.g:786:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,35,FOLLOW_17); 

            	            						newLeafNode(otherlv_3, grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalProjectDSL.g:790:6: ()
            	            // InternalProjectDSL.g:791:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMulOrDivAccess().getDivLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalProjectDSL.g:799:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalProjectDSL.g:800:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalProjectDSL.g:800:5: (lv_right_5_0= rulePrimary )
            	    // InternalProjectDSL.g:801:6: lv_right_5_0= rulePrimary
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
    // InternalProjectDSL.g:823:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalProjectDSL.g:823:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalProjectDSL.g:824:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalProjectDSL.g:830:1: rulePrimary returns [EObject current=null] : (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_Param_2= ruleParam ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_Parenthesis_1 = null;

        EObject this_Param_2 = null;



        	enterRule();

        try {
            // InternalProjectDSL.g:836:2: ( (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_Param_2= ruleParam ) )
            // InternalProjectDSL.g:837:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_Param_2= ruleParam )
            {
            // InternalProjectDSL.g:837:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_Param_2= ruleParam )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt16=1;
                }
                break;
            case 36:
                {
                alt16=2;
                }
                break;
            case RULE_ID:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalProjectDSL.g:838:3: this_Number_0= ruleNumber
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
                    // InternalProjectDSL.g:847:3: this_Parenthesis_1= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_1=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalProjectDSL.g:856:3: this_Param_2= ruleParam
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParamParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Param_2=ruleParam();

                    state._fsp--;


                    			current = this_Param_2;
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


    // $ANTLR start "entryRuleParam"
    // InternalProjectDSL.g:868:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalProjectDSL.g:868:46: (iv_ruleParam= ruleParam EOF )
            // InternalProjectDSL.g:869:2: iv_ruleParam= ruleParam EOF
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
    // InternalProjectDSL.g:875:1: ruleParam returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalProjectDSL.g:881:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalProjectDSL.g:882:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalProjectDSL.g:882:2: ( (otherlv_0= RULE_ID ) )
            // InternalProjectDSL.g:883:3: (otherlv_0= RULE_ID )
            {
            // InternalProjectDSL.g:883:3: (otherlv_0= RULE_ID )
            // InternalProjectDSL.g:884:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getParamRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getParamAccess().getValueParameterCrossReference_0());
            			

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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleParenthesis"
    // InternalProjectDSL.g:898:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalProjectDSL.g:898:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalProjectDSL.g:899:2: iv_ruleParenthesis= ruleParenthesis EOF
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
    // InternalProjectDSL.g:905:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Exp_1 = null;



        	enterRule();

        try {
            // InternalProjectDSL.g:911:2: ( (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) )
            // InternalProjectDSL.g:912:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            {
            // InternalProjectDSL.g:912:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            // InternalProjectDSL.g:913:3: otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenthesisAccess().getExpParserRuleCall_1());
            		
            pushFollow(FOLLOW_21);
            this_Exp_1=ruleExp();

            state._fsp--;


            			current = this_Exp_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,37,FOLLOW_2); 

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
    // InternalProjectDSL.g:933:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalProjectDSL.g:933:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalProjectDSL.g:934:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalProjectDSL.g:940:1: ruleNumber returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalProjectDSL.g:946:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalProjectDSL.g:947:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalProjectDSL.g:947:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalProjectDSL.g:948:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalProjectDSL.g:948:3: ()
            // InternalProjectDSL.g:949:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberAccess().getNumAction_0(),
            					current);
            			

            }

            // InternalProjectDSL.g:955:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalProjectDSL.g:956:4: (lv_value_1_0= RULE_INT )
            {
            // InternalProjectDSL.g:956:4: (lv_value_1_0= RULE_INT )
            // InternalProjectDSL.g:957:5: lv_value_1_0= RULE_INT
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000021002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000C0800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});

}