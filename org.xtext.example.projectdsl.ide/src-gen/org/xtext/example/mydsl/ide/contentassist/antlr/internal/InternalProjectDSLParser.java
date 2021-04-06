package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.ProjectDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProjectDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'C'", "'R'", "'U'", "'D'", "'CR'", "'CRU'", "'CRUD'", "'system'", "'entity'", "'{'", "'}'", "'controller'", "'uses'", "','", "'make'", "':'", "'redirect'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
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

    	public void setGrammarAccess(ProjectDSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRestAPI"
    // InternalProjectDSL.g:53:1: entryRuleRestAPI : ruleRestAPI EOF ;
    public final void entryRuleRestAPI() throws RecognitionException {
        try {
            // InternalProjectDSL.g:54:1: ( ruleRestAPI EOF )
            // InternalProjectDSL.g:55:1: ruleRestAPI EOF
            {
             before(grammarAccess.getRestAPIRule()); 
            pushFollow(FOLLOW_1);
            ruleRestAPI();

            state._fsp--;

             after(grammarAccess.getRestAPIRule()); 
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
    // $ANTLR end "entryRuleRestAPI"


    // $ANTLR start "ruleRestAPI"
    // InternalProjectDSL.g:62:1: ruleRestAPI : ( ( rule__RestAPI__Group__0 ) ) ;
    public final void ruleRestAPI() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:66:2: ( ( ( rule__RestAPI__Group__0 ) ) )
            // InternalProjectDSL.g:67:2: ( ( rule__RestAPI__Group__0 ) )
            {
            // InternalProjectDSL.g:67:2: ( ( rule__RestAPI__Group__0 ) )
            // InternalProjectDSL.g:68:3: ( rule__RestAPI__Group__0 )
            {
             before(grammarAccess.getRestAPIAccess().getGroup()); 
            // InternalProjectDSL.g:69:3: ( rule__RestAPI__Group__0 )
            // InternalProjectDSL.g:69:4: rule__RestAPI__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RestAPI__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRestAPIAccess().getGroup()); 

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
    // $ANTLR end "ruleRestAPI"


    // $ANTLR start "entryRuleDeclaration"
    // InternalProjectDSL.g:78:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalProjectDSL.g:79:1: ( ruleDeclaration EOF )
            // InternalProjectDSL.g:80:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalProjectDSL.g:87:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:91:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // InternalProjectDSL.g:92:2: ( ( rule__Declaration__Alternatives ) )
            {
            // InternalProjectDSL.g:92:2: ( ( rule__Declaration__Alternatives ) )
            // InternalProjectDSL.g:93:3: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // InternalProjectDSL.g:94:3: ( rule__Declaration__Alternatives )
            // InternalProjectDSL.g:94:4: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleEntity"
    // InternalProjectDSL.g:103:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalProjectDSL.g:104:1: ( ruleEntity EOF )
            // InternalProjectDSL.g:105:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalProjectDSL.g:112:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:116:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalProjectDSL.g:117:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalProjectDSL.g:117:2: ( ( rule__Entity__Group__0 ) )
            // InternalProjectDSL.g:118:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalProjectDSL.g:119:3: ( rule__Entity__Group__0 )
            // InternalProjectDSL.g:119:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleController"
    // InternalProjectDSL.g:128:1: entryRuleController : ruleController EOF ;
    public final void entryRuleController() throws RecognitionException {
        try {
            // InternalProjectDSL.g:129:1: ( ruleController EOF )
            // InternalProjectDSL.g:130:1: ruleController EOF
            {
             before(grammarAccess.getControllerRule()); 
            pushFollow(FOLLOW_1);
            ruleController();

            state._fsp--;

             after(grammarAccess.getControllerRule()); 
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
    // $ANTLR end "entryRuleController"


    // $ANTLR start "ruleController"
    // InternalProjectDSL.g:137:1: ruleController : ( ( rule__Controller__Group__0 ) ) ;
    public final void ruleController() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:141:2: ( ( ( rule__Controller__Group__0 ) ) )
            // InternalProjectDSL.g:142:2: ( ( rule__Controller__Group__0 ) )
            {
            // InternalProjectDSL.g:142:2: ( ( rule__Controller__Group__0 ) )
            // InternalProjectDSL.g:143:3: ( rule__Controller__Group__0 )
            {
             before(grammarAccess.getControllerAccess().getGroup()); 
            // InternalProjectDSL.g:144:3: ( rule__Controller__Group__0 )
            // InternalProjectDSL.g:144:4: rule__Controller__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Controller__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getControllerAccess().getGroup()); 

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
    // $ANTLR end "ruleController"


    // $ANTLR start "entryRuleEndpoint"
    // InternalProjectDSL.g:153:1: entryRuleEndpoint : ruleEndpoint EOF ;
    public final void entryRuleEndpoint() throws RecognitionException {
        try {
            // InternalProjectDSL.g:154:1: ( ruleEndpoint EOF )
            // InternalProjectDSL.g:155:1: ruleEndpoint EOF
            {
             before(grammarAccess.getEndpointRule()); 
            pushFollow(FOLLOW_1);
            ruleEndpoint();

            state._fsp--;

             after(grammarAccess.getEndpointRule()); 
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
    // $ANTLR end "entryRuleEndpoint"


    // $ANTLR start "ruleEndpoint"
    // InternalProjectDSL.g:162:1: ruleEndpoint : ( ( rule__Endpoint__NameAssignment ) ) ;
    public final void ruleEndpoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:166:2: ( ( ( rule__Endpoint__NameAssignment ) ) )
            // InternalProjectDSL.g:167:2: ( ( rule__Endpoint__NameAssignment ) )
            {
            // InternalProjectDSL.g:167:2: ( ( rule__Endpoint__NameAssignment ) )
            // InternalProjectDSL.g:168:3: ( rule__Endpoint__NameAssignment )
            {
             before(grammarAccess.getEndpointAccess().getNameAssignment()); 
            // InternalProjectDSL.g:169:3: ( rule__Endpoint__NameAssignment )
            // InternalProjectDSL.g:169:4: rule__Endpoint__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleEndpoint"


    // $ANTLR start "entryRuleParameter"
    // InternalProjectDSL.g:178:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalProjectDSL.g:179:1: ( ruleParameter EOF )
            // InternalProjectDSL.g:180:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalProjectDSL.g:187:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:191:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalProjectDSL.g:192:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalProjectDSL.g:192:2: ( ( rule__Parameter__Group__0 ) )
            // InternalProjectDSL.g:193:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalProjectDSL.g:194:3: ( rule__Parameter__Group__0 )
            // InternalProjectDSL.g:194:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleRedirect"
    // InternalProjectDSL.g:203:1: entryRuleRedirect : ruleRedirect EOF ;
    public final void entryRuleRedirect() throws RecognitionException {
        try {
            // InternalProjectDSL.g:204:1: ( ruleRedirect EOF )
            // InternalProjectDSL.g:205:1: ruleRedirect EOF
            {
             before(grammarAccess.getRedirectRule()); 
            pushFollow(FOLLOW_1);
            ruleRedirect();

            state._fsp--;

             after(grammarAccess.getRedirectRule()); 
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
    // $ANTLR end "entryRuleRedirect"


    // $ANTLR start "ruleRedirect"
    // InternalProjectDSL.g:212:1: ruleRedirect : ( ( rule__Redirect__Alternatives ) ) ;
    public final void ruleRedirect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:216:2: ( ( ( rule__Redirect__Alternatives ) ) )
            // InternalProjectDSL.g:217:2: ( ( rule__Redirect__Alternatives ) )
            {
            // InternalProjectDSL.g:217:2: ( ( rule__Redirect__Alternatives ) )
            // InternalProjectDSL.g:218:3: ( rule__Redirect__Alternatives )
            {
             before(grammarAccess.getRedirectAccess().getAlternatives()); 
            // InternalProjectDSL.g:219:3: ( rule__Redirect__Alternatives )
            // InternalProjectDSL.g:219:4: rule__Redirect__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Redirect__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRedirectAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRedirect"


    // $ANTLR start "entryRuleType"
    // InternalProjectDSL.g:228:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalProjectDSL.g:229:1: ( ruleType EOF )
            // InternalProjectDSL.g:230:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalProjectDSL.g:237:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:241:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalProjectDSL.g:242:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalProjectDSL.g:242:2: ( ( rule__Type__Alternatives ) )
            // InternalProjectDSL.g:243:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalProjectDSL.g:244:3: ( rule__Type__Alternatives )
            // InternalProjectDSL.g:244:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "rule__Declaration__Alternatives"
    // InternalProjectDSL.g:252:1: rule__Declaration__Alternatives : ( ( ruleEntity ) | ( ruleController ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:256:1: ( ( ruleEntity ) | ( ruleController ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalProjectDSL.g:257:2: ( ruleEntity )
                    {
                    // InternalProjectDSL.g:257:2: ( ruleEntity )
                    // InternalProjectDSL.g:258:3: ruleEntity
                    {
                     before(grammarAccess.getDeclarationAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProjectDSL.g:263:2: ( ruleController )
                    {
                    // InternalProjectDSL.g:263:2: ( ruleController )
                    // InternalProjectDSL.g:264:3: ruleController
                    {
                     before(grammarAccess.getDeclarationAccess().getControllerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleController();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getControllerParserRuleCall_1()); 

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
    // $ANTLR end "rule__Declaration__Alternatives"


    // $ANTLR start "rule__Redirect__Alternatives"
    // InternalProjectDSL.g:273:1: rule__Redirect__Alternatives : ( ( ( rule__Redirect__NameAssignment_0 ) ) | ( ( rule__Redirect__UrlAssignment_1 ) ) );
    public final void rule__Redirect__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:277:1: ( ( ( rule__Redirect__NameAssignment_0 ) ) | ( ( rule__Redirect__UrlAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalProjectDSL.g:278:2: ( ( rule__Redirect__NameAssignment_0 ) )
                    {
                    // InternalProjectDSL.g:278:2: ( ( rule__Redirect__NameAssignment_0 ) )
                    // InternalProjectDSL.g:279:3: ( rule__Redirect__NameAssignment_0 )
                    {
                     before(grammarAccess.getRedirectAccess().getNameAssignment_0()); 
                    // InternalProjectDSL.g:280:3: ( rule__Redirect__NameAssignment_0 )
                    // InternalProjectDSL.g:280:4: rule__Redirect__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Redirect__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRedirectAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProjectDSL.g:284:2: ( ( rule__Redirect__UrlAssignment_1 ) )
                    {
                    // InternalProjectDSL.g:284:2: ( ( rule__Redirect__UrlAssignment_1 ) )
                    // InternalProjectDSL.g:285:3: ( rule__Redirect__UrlAssignment_1 )
                    {
                     before(grammarAccess.getRedirectAccess().getUrlAssignment_1()); 
                    // InternalProjectDSL.g:286:3: ( rule__Redirect__UrlAssignment_1 )
                    // InternalProjectDSL.g:286:4: rule__Redirect__UrlAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Redirect__UrlAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRedirectAccess().getUrlAssignment_1()); 

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
    // $ANTLR end "rule__Redirect__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalProjectDSL.g:294:1: rule__Type__Alternatives : ( ( 'C' ) | ( 'R' ) | ( 'U' ) | ( 'D' ) | ( 'CR' ) | ( 'CRU' ) | ( 'CRUD' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:298:1: ( ( 'C' ) | ( 'R' ) | ( 'U' ) | ( 'D' ) | ( 'CR' ) | ( 'CRU' ) | ( 'CRUD' ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalProjectDSL.g:299:2: ( 'C' )
                    {
                    // InternalProjectDSL.g:299:2: ( 'C' )
                    // InternalProjectDSL.g:300:3: 'C'
                    {
                     before(grammarAccess.getTypeAccess().getCKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getCKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProjectDSL.g:305:2: ( 'R' )
                    {
                    // InternalProjectDSL.g:305:2: ( 'R' )
                    // InternalProjectDSL.g:306:3: 'R'
                    {
                     before(grammarAccess.getTypeAccess().getRKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getRKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalProjectDSL.g:311:2: ( 'U' )
                    {
                    // InternalProjectDSL.g:311:2: ( 'U' )
                    // InternalProjectDSL.g:312:3: 'U'
                    {
                     before(grammarAccess.getTypeAccess().getUKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getUKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalProjectDSL.g:317:2: ( 'D' )
                    {
                    // InternalProjectDSL.g:317:2: ( 'D' )
                    // InternalProjectDSL.g:318:3: 'D'
                    {
                     before(grammarAccess.getTypeAccess().getDKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getDKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalProjectDSL.g:323:2: ( 'CR' )
                    {
                    // InternalProjectDSL.g:323:2: ( 'CR' )
                    // InternalProjectDSL.g:324:3: 'CR'
                    {
                     before(grammarAccess.getTypeAccess().getCRKeyword_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getCRKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalProjectDSL.g:329:2: ( 'CRU' )
                    {
                    // InternalProjectDSL.g:329:2: ( 'CRU' )
                    // InternalProjectDSL.g:330:3: 'CRU'
                    {
                     before(grammarAccess.getTypeAccess().getCRUKeyword_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getCRUKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalProjectDSL.g:335:2: ( 'CRUD' )
                    {
                    // InternalProjectDSL.g:335:2: ( 'CRUD' )
                    // InternalProjectDSL.g:336:3: 'CRUD'
                    {
                     before(grammarAccess.getTypeAccess().getCRUDKeyword_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getCRUDKeyword_6()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__RestAPI__Group__0"
    // InternalProjectDSL.g:345:1: rule__RestAPI__Group__0 : rule__RestAPI__Group__0__Impl rule__RestAPI__Group__1 ;
    public final void rule__RestAPI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:349:1: ( rule__RestAPI__Group__0__Impl rule__RestAPI__Group__1 )
            // InternalProjectDSL.g:350:2: rule__RestAPI__Group__0__Impl rule__RestAPI__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RestAPI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestAPI__Group__1();

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
    // $ANTLR end "rule__RestAPI__Group__0"


    // $ANTLR start "rule__RestAPI__Group__0__Impl"
    // InternalProjectDSL.g:357:1: rule__RestAPI__Group__0__Impl : ( 'system' ) ;
    public final void rule__RestAPI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:361:1: ( ( 'system' ) )
            // InternalProjectDSL.g:362:1: ( 'system' )
            {
            // InternalProjectDSL.g:362:1: ( 'system' )
            // InternalProjectDSL.g:363:2: 'system'
            {
             before(grammarAccess.getRestAPIAccess().getSystemKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRestAPIAccess().getSystemKeyword_0()); 

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
    // $ANTLR end "rule__RestAPI__Group__0__Impl"


    // $ANTLR start "rule__RestAPI__Group__1"
    // InternalProjectDSL.g:372:1: rule__RestAPI__Group__1 : rule__RestAPI__Group__1__Impl rule__RestAPI__Group__2 ;
    public final void rule__RestAPI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:376:1: ( rule__RestAPI__Group__1__Impl rule__RestAPI__Group__2 )
            // InternalProjectDSL.g:377:2: rule__RestAPI__Group__1__Impl rule__RestAPI__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RestAPI__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestAPI__Group__2();

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
    // $ANTLR end "rule__RestAPI__Group__1"


    // $ANTLR start "rule__RestAPI__Group__1__Impl"
    // InternalProjectDSL.g:384:1: rule__RestAPI__Group__1__Impl : ( ( rule__RestAPI__NameAssignment_1 ) ) ;
    public final void rule__RestAPI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:388:1: ( ( ( rule__RestAPI__NameAssignment_1 ) ) )
            // InternalProjectDSL.g:389:1: ( ( rule__RestAPI__NameAssignment_1 ) )
            {
            // InternalProjectDSL.g:389:1: ( ( rule__RestAPI__NameAssignment_1 ) )
            // InternalProjectDSL.g:390:2: ( rule__RestAPI__NameAssignment_1 )
            {
             before(grammarAccess.getRestAPIAccess().getNameAssignment_1()); 
            // InternalProjectDSL.g:391:2: ( rule__RestAPI__NameAssignment_1 )
            // InternalProjectDSL.g:391:3: rule__RestAPI__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RestAPI__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRestAPIAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__RestAPI__Group__1__Impl"


    // $ANTLR start "rule__RestAPI__Group__2"
    // InternalProjectDSL.g:399:1: rule__RestAPI__Group__2 : rule__RestAPI__Group__2__Impl ;
    public final void rule__RestAPI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:403:1: ( rule__RestAPI__Group__2__Impl )
            // InternalProjectDSL.g:404:2: rule__RestAPI__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RestAPI__Group__2__Impl();

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
    // $ANTLR end "rule__RestAPI__Group__2"


    // $ANTLR start "rule__RestAPI__Group__2__Impl"
    // InternalProjectDSL.g:410:1: rule__RestAPI__Group__2__Impl : ( ( rule__RestAPI__DeclarationsAssignment_2 )* ) ;
    public final void rule__RestAPI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:414:1: ( ( ( rule__RestAPI__DeclarationsAssignment_2 )* ) )
            // InternalProjectDSL.g:415:1: ( ( rule__RestAPI__DeclarationsAssignment_2 )* )
            {
            // InternalProjectDSL.g:415:1: ( ( rule__RestAPI__DeclarationsAssignment_2 )* )
            // InternalProjectDSL.g:416:2: ( rule__RestAPI__DeclarationsAssignment_2 )*
            {
             before(grammarAccess.getRestAPIAccess().getDeclarationsAssignment_2()); 
            // InternalProjectDSL.g:417:2: ( rule__RestAPI__DeclarationsAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19||LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalProjectDSL.g:417:3: rule__RestAPI__DeclarationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__RestAPI__DeclarationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRestAPIAccess().getDeclarationsAssignment_2()); 

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
    // $ANTLR end "rule__RestAPI__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalProjectDSL.g:426:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:430:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalProjectDSL.g:431:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalProjectDSL.g:438:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:442:1: ( ( 'entity' ) )
            // InternalProjectDSL.g:443:1: ( 'entity' )
            {
            // InternalProjectDSL.g:443:1: ( 'entity' )
            // InternalProjectDSL.g:444:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalProjectDSL.g:453:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:457:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalProjectDSL.g:458:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalProjectDSL.g:465:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:469:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalProjectDSL.g:470:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalProjectDSL.g:470:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalProjectDSL.g:471:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalProjectDSL.g:472:2: ( rule__Entity__NameAssignment_1 )
            // InternalProjectDSL.g:472:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalProjectDSL.g:480:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:484:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalProjectDSL.g:485:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalProjectDSL.g:492:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:496:1: ( ( '{' ) )
            // InternalProjectDSL.g:497:1: ( '{' )
            {
            // InternalProjectDSL.g:497:1: ( '{' )
            // InternalProjectDSL.g:498:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalProjectDSL.g:507:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:511:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalProjectDSL.g:512:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalProjectDSL.g:519:1: rule__Entity__Group__3__Impl : ( ( ( rule__Entity__ParametersAssignment_3 ) ) ( ( rule__Entity__ParametersAssignment_3 )* ) ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:523:1: ( ( ( ( rule__Entity__ParametersAssignment_3 ) ) ( ( rule__Entity__ParametersAssignment_3 )* ) ) )
            // InternalProjectDSL.g:524:1: ( ( ( rule__Entity__ParametersAssignment_3 ) ) ( ( rule__Entity__ParametersAssignment_3 )* ) )
            {
            // InternalProjectDSL.g:524:1: ( ( ( rule__Entity__ParametersAssignment_3 ) ) ( ( rule__Entity__ParametersAssignment_3 )* ) )
            // InternalProjectDSL.g:525:2: ( ( rule__Entity__ParametersAssignment_3 ) ) ( ( rule__Entity__ParametersAssignment_3 )* )
            {
            // InternalProjectDSL.g:525:2: ( ( rule__Entity__ParametersAssignment_3 ) )
            // InternalProjectDSL.g:526:3: ( rule__Entity__ParametersAssignment_3 )
            {
             before(grammarAccess.getEntityAccess().getParametersAssignment_3()); 
            // InternalProjectDSL.g:527:3: ( rule__Entity__ParametersAssignment_3 )
            // InternalProjectDSL.g:527:4: rule__Entity__ParametersAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__Entity__ParametersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getParametersAssignment_3()); 

            }

            // InternalProjectDSL.g:530:2: ( ( rule__Entity__ParametersAssignment_3 )* )
            // InternalProjectDSL.g:531:3: ( rule__Entity__ParametersAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getParametersAssignment_3()); 
            // InternalProjectDSL.g:532:3: ( rule__Entity__ParametersAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalProjectDSL.g:532:4: rule__Entity__ParametersAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Entity__ParametersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getParametersAssignment_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalProjectDSL.g:541:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:545:1: ( rule__Entity__Group__4__Impl )
            // InternalProjectDSL.g:546:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__4__Impl();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalProjectDSL.g:552:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:556:1: ( ( '}' ) )
            // InternalProjectDSL.g:557:1: ( '}' )
            {
            // InternalProjectDSL.g:557:1: ( '}' )
            // InternalProjectDSL.g:558:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Controller__Group__0"
    // InternalProjectDSL.g:568:1: rule__Controller__Group__0 : rule__Controller__Group__0__Impl rule__Controller__Group__1 ;
    public final void rule__Controller__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:572:1: ( rule__Controller__Group__0__Impl rule__Controller__Group__1 )
            // InternalProjectDSL.g:573:2: rule__Controller__Group__0__Impl rule__Controller__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Controller__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__1();

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
    // $ANTLR end "rule__Controller__Group__0"


    // $ANTLR start "rule__Controller__Group__0__Impl"
    // InternalProjectDSL.g:580:1: rule__Controller__Group__0__Impl : ( 'controller' ) ;
    public final void rule__Controller__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:584:1: ( ( 'controller' ) )
            // InternalProjectDSL.g:585:1: ( 'controller' )
            {
            // InternalProjectDSL.g:585:1: ( 'controller' )
            // InternalProjectDSL.g:586:2: 'controller'
            {
             before(grammarAccess.getControllerAccess().getControllerKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getControllerKeyword_0()); 

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
    // $ANTLR end "rule__Controller__Group__0__Impl"


    // $ANTLR start "rule__Controller__Group__1"
    // InternalProjectDSL.g:595:1: rule__Controller__Group__1 : rule__Controller__Group__1__Impl rule__Controller__Group__2 ;
    public final void rule__Controller__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:599:1: ( rule__Controller__Group__1__Impl rule__Controller__Group__2 )
            // InternalProjectDSL.g:600:2: rule__Controller__Group__1__Impl rule__Controller__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Controller__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__2();

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
    // $ANTLR end "rule__Controller__Group__1"


    // $ANTLR start "rule__Controller__Group__1__Impl"
    // InternalProjectDSL.g:607:1: rule__Controller__Group__1__Impl : ( ( rule__Controller__NameAssignment_1 ) ) ;
    public final void rule__Controller__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:611:1: ( ( ( rule__Controller__NameAssignment_1 ) ) )
            // InternalProjectDSL.g:612:1: ( ( rule__Controller__NameAssignment_1 ) )
            {
            // InternalProjectDSL.g:612:1: ( ( rule__Controller__NameAssignment_1 ) )
            // InternalProjectDSL.g:613:2: ( rule__Controller__NameAssignment_1 )
            {
             before(grammarAccess.getControllerAccess().getNameAssignment_1()); 
            // InternalProjectDSL.g:614:2: ( rule__Controller__NameAssignment_1 )
            // InternalProjectDSL.g:614:3: rule__Controller__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Controller__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getControllerAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Controller__Group__1__Impl"


    // $ANTLR start "rule__Controller__Group__2"
    // InternalProjectDSL.g:622:1: rule__Controller__Group__2 : rule__Controller__Group__2__Impl rule__Controller__Group__3 ;
    public final void rule__Controller__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:626:1: ( rule__Controller__Group__2__Impl rule__Controller__Group__3 )
            // InternalProjectDSL.g:627:2: rule__Controller__Group__2__Impl rule__Controller__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Controller__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__3();

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
    // $ANTLR end "rule__Controller__Group__2"


    // $ANTLR start "rule__Controller__Group__2__Impl"
    // InternalProjectDSL.g:634:1: rule__Controller__Group__2__Impl : ( 'uses' ) ;
    public final void rule__Controller__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:638:1: ( ( 'uses' ) )
            // InternalProjectDSL.g:639:1: ( 'uses' )
            {
            // InternalProjectDSL.g:639:1: ( 'uses' )
            // InternalProjectDSL.g:640:2: 'uses'
            {
             before(grammarAccess.getControllerAccess().getUsesKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getUsesKeyword_2()); 

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
    // $ANTLR end "rule__Controller__Group__2__Impl"


    // $ANTLR start "rule__Controller__Group__3"
    // InternalProjectDSL.g:649:1: rule__Controller__Group__3 : rule__Controller__Group__3__Impl rule__Controller__Group__4 ;
    public final void rule__Controller__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:653:1: ( rule__Controller__Group__3__Impl rule__Controller__Group__4 )
            // InternalProjectDSL.g:654:2: rule__Controller__Group__3__Impl rule__Controller__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Controller__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__4();

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
    // $ANTLR end "rule__Controller__Group__3"


    // $ANTLR start "rule__Controller__Group__3__Impl"
    // InternalProjectDSL.g:661:1: rule__Controller__Group__3__Impl : ( ( rule__Controller__BaseAssignment_3 ) ) ;
    public final void rule__Controller__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:665:1: ( ( ( rule__Controller__BaseAssignment_3 ) ) )
            // InternalProjectDSL.g:666:1: ( ( rule__Controller__BaseAssignment_3 ) )
            {
            // InternalProjectDSL.g:666:1: ( ( rule__Controller__BaseAssignment_3 ) )
            // InternalProjectDSL.g:667:2: ( rule__Controller__BaseAssignment_3 )
            {
             before(grammarAccess.getControllerAccess().getBaseAssignment_3()); 
            // InternalProjectDSL.g:668:2: ( rule__Controller__BaseAssignment_3 )
            // InternalProjectDSL.g:668:3: rule__Controller__BaseAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Controller__BaseAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getControllerAccess().getBaseAssignment_3()); 

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
    // $ANTLR end "rule__Controller__Group__3__Impl"


    // $ANTLR start "rule__Controller__Group__4"
    // InternalProjectDSL.g:676:1: rule__Controller__Group__4 : rule__Controller__Group__4__Impl rule__Controller__Group__5 ;
    public final void rule__Controller__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:680:1: ( rule__Controller__Group__4__Impl rule__Controller__Group__5 )
            // InternalProjectDSL.g:681:2: rule__Controller__Group__4__Impl rule__Controller__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Controller__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__5();

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
    // $ANTLR end "rule__Controller__Group__4"


    // $ANTLR start "rule__Controller__Group__4__Impl"
    // InternalProjectDSL.g:688:1: rule__Controller__Group__4__Impl : ( ( rule__Controller__Group_4__0 )* ) ;
    public final void rule__Controller__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:692:1: ( ( ( rule__Controller__Group_4__0 )* ) )
            // InternalProjectDSL.g:693:1: ( ( rule__Controller__Group_4__0 )* )
            {
            // InternalProjectDSL.g:693:1: ( ( rule__Controller__Group_4__0 )* )
            // InternalProjectDSL.g:694:2: ( rule__Controller__Group_4__0 )*
            {
             before(grammarAccess.getControllerAccess().getGroup_4()); 
            // InternalProjectDSL.g:695:2: ( rule__Controller__Group_4__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalProjectDSL.g:695:3: rule__Controller__Group_4__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Controller__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getControllerAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Controller__Group__4__Impl"


    // $ANTLR start "rule__Controller__Group__5"
    // InternalProjectDSL.g:703:1: rule__Controller__Group__5 : rule__Controller__Group__5__Impl rule__Controller__Group__6 ;
    public final void rule__Controller__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:707:1: ( rule__Controller__Group__5__Impl rule__Controller__Group__6 )
            // InternalProjectDSL.g:708:2: rule__Controller__Group__5__Impl rule__Controller__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Controller__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__6();

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
    // $ANTLR end "rule__Controller__Group__5"


    // $ANTLR start "rule__Controller__Group__5__Impl"
    // InternalProjectDSL.g:715:1: rule__Controller__Group__5__Impl : ( '{' ) ;
    public final void rule__Controller__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:719:1: ( ( '{' ) )
            // InternalProjectDSL.g:720:1: ( '{' )
            {
            // InternalProjectDSL.g:720:1: ( '{' )
            // InternalProjectDSL.g:721:2: '{'
            {
             before(grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Controller__Group__5__Impl"


    // $ANTLR start "rule__Controller__Group__6"
    // InternalProjectDSL.g:730:1: rule__Controller__Group__6 : rule__Controller__Group__6__Impl rule__Controller__Group__7 ;
    public final void rule__Controller__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:734:1: ( rule__Controller__Group__6__Impl rule__Controller__Group__7 )
            // InternalProjectDSL.g:735:2: rule__Controller__Group__6__Impl rule__Controller__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Controller__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__7();

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
    // $ANTLR end "rule__Controller__Group__6"


    // $ANTLR start "rule__Controller__Group__6__Impl"
    // InternalProjectDSL.g:742:1: rule__Controller__Group__6__Impl : ( ( ( rule__Controller__Group_6__0 ) ) ( ( rule__Controller__Group_6__0 )* ) ) ;
    public final void rule__Controller__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:746:1: ( ( ( ( rule__Controller__Group_6__0 ) ) ( ( rule__Controller__Group_6__0 )* ) ) )
            // InternalProjectDSL.g:747:1: ( ( ( rule__Controller__Group_6__0 ) ) ( ( rule__Controller__Group_6__0 )* ) )
            {
            // InternalProjectDSL.g:747:1: ( ( ( rule__Controller__Group_6__0 ) ) ( ( rule__Controller__Group_6__0 )* ) )
            // InternalProjectDSL.g:748:2: ( ( rule__Controller__Group_6__0 ) ) ( ( rule__Controller__Group_6__0 )* )
            {
            // InternalProjectDSL.g:748:2: ( ( rule__Controller__Group_6__0 ) )
            // InternalProjectDSL.g:749:3: ( rule__Controller__Group_6__0 )
            {
             before(grammarAccess.getControllerAccess().getGroup_6()); 
            // InternalProjectDSL.g:750:3: ( rule__Controller__Group_6__0 )
            // InternalProjectDSL.g:750:4: rule__Controller__Group_6__0
            {
            pushFollow(FOLLOW_13);
            rule__Controller__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getControllerAccess().getGroup_6()); 

            }

            // InternalProjectDSL.g:753:2: ( ( rule__Controller__Group_6__0 )* )
            // InternalProjectDSL.g:754:3: ( rule__Controller__Group_6__0 )*
            {
             before(grammarAccess.getControllerAccess().getGroup_6()); 
            // InternalProjectDSL.g:755:3: ( rule__Controller__Group_6__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalProjectDSL.g:755:4: rule__Controller__Group_6__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Controller__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getControllerAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Controller__Group__6__Impl"


    // $ANTLR start "rule__Controller__Group__7"
    // InternalProjectDSL.g:764:1: rule__Controller__Group__7 : rule__Controller__Group__7__Impl ;
    public final void rule__Controller__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:768:1: ( rule__Controller__Group__7__Impl )
            // InternalProjectDSL.g:769:2: rule__Controller__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Controller__Group__7__Impl();

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
    // $ANTLR end "rule__Controller__Group__7"


    // $ANTLR start "rule__Controller__Group__7__Impl"
    // InternalProjectDSL.g:775:1: rule__Controller__Group__7__Impl : ( '}' ) ;
    public final void rule__Controller__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:779:1: ( ( '}' ) )
            // InternalProjectDSL.g:780:1: ( '}' )
            {
            // InternalProjectDSL.g:780:1: ( '}' )
            // InternalProjectDSL.g:781:2: '}'
            {
             before(grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Controller__Group__7__Impl"


    // $ANTLR start "rule__Controller__Group_4__0"
    // InternalProjectDSL.g:791:1: rule__Controller__Group_4__0 : rule__Controller__Group_4__0__Impl rule__Controller__Group_4__1 ;
    public final void rule__Controller__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:795:1: ( rule__Controller__Group_4__0__Impl rule__Controller__Group_4__1 )
            // InternalProjectDSL.g:796:2: rule__Controller__Group_4__0__Impl rule__Controller__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Controller__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group_4__1();

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
    // $ANTLR end "rule__Controller__Group_4__0"


    // $ANTLR start "rule__Controller__Group_4__0__Impl"
    // InternalProjectDSL.g:803:1: rule__Controller__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Controller__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:807:1: ( ( ',' ) )
            // InternalProjectDSL.g:808:1: ( ',' )
            {
            // InternalProjectDSL.g:808:1: ( ',' )
            // InternalProjectDSL.g:809:2: ','
            {
             before(grammarAccess.getControllerAccess().getCommaKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__Controller__Group_4__0__Impl"


    // $ANTLR start "rule__Controller__Group_4__1"
    // InternalProjectDSL.g:818:1: rule__Controller__Group_4__1 : rule__Controller__Group_4__1__Impl ;
    public final void rule__Controller__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:822:1: ( rule__Controller__Group_4__1__Impl )
            // InternalProjectDSL.g:823:2: rule__Controller__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Controller__Group_4__1__Impl();

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
    // $ANTLR end "rule__Controller__Group_4__1"


    // $ANTLR start "rule__Controller__Group_4__1__Impl"
    // InternalProjectDSL.g:829:1: rule__Controller__Group_4__1__Impl : ( ( rule__Controller__BaseAssignment_4_1 ) ) ;
    public final void rule__Controller__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:833:1: ( ( ( rule__Controller__BaseAssignment_4_1 ) ) )
            // InternalProjectDSL.g:834:1: ( ( rule__Controller__BaseAssignment_4_1 ) )
            {
            // InternalProjectDSL.g:834:1: ( ( rule__Controller__BaseAssignment_4_1 ) )
            // InternalProjectDSL.g:835:2: ( rule__Controller__BaseAssignment_4_1 )
            {
             before(grammarAccess.getControllerAccess().getBaseAssignment_4_1()); 
            // InternalProjectDSL.g:836:2: ( rule__Controller__BaseAssignment_4_1 )
            // InternalProjectDSL.g:836:3: rule__Controller__BaseAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Controller__BaseAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getControllerAccess().getBaseAssignment_4_1()); 

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
    // $ANTLR end "rule__Controller__Group_4__1__Impl"


    // $ANTLR start "rule__Controller__Group_6__0"
    // InternalProjectDSL.g:845:1: rule__Controller__Group_6__0 : rule__Controller__Group_6__0__Impl rule__Controller__Group_6__1 ;
    public final void rule__Controller__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:849:1: ( rule__Controller__Group_6__0__Impl rule__Controller__Group_6__1 )
            // InternalProjectDSL.g:850:2: rule__Controller__Group_6__0__Impl rule__Controller__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Controller__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group_6__1();

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
    // $ANTLR end "rule__Controller__Group_6__0"


    // $ANTLR start "rule__Controller__Group_6__0__Impl"
    // InternalProjectDSL.g:857:1: rule__Controller__Group_6__0__Impl : ( 'make' ) ;
    public final void rule__Controller__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:861:1: ( ( 'make' ) )
            // InternalProjectDSL.g:862:1: ( 'make' )
            {
            // InternalProjectDSL.g:862:1: ( 'make' )
            // InternalProjectDSL.g:863:2: 'make'
            {
             before(grammarAccess.getControllerAccess().getMakeKeyword_6_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getMakeKeyword_6_0()); 

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
    // $ANTLR end "rule__Controller__Group_6__0__Impl"


    // $ANTLR start "rule__Controller__Group_6__1"
    // InternalProjectDSL.g:872:1: rule__Controller__Group_6__1 : rule__Controller__Group_6__1__Impl ;
    public final void rule__Controller__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:876:1: ( rule__Controller__Group_6__1__Impl )
            // InternalProjectDSL.g:877:2: rule__Controller__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Controller__Group_6__1__Impl();

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
    // $ANTLR end "rule__Controller__Group_6__1"


    // $ANTLR start "rule__Controller__Group_6__1__Impl"
    // InternalProjectDSL.g:883:1: rule__Controller__Group_6__1__Impl : ( ( rule__Controller__EndpointAssignment_6_1 ) ) ;
    public final void rule__Controller__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:887:1: ( ( ( rule__Controller__EndpointAssignment_6_1 ) ) )
            // InternalProjectDSL.g:888:1: ( ( rule__Controller__EndpointAssignment_6_1 ) )
            {
            // InternalProjectDSL.g:888:1: ( ( rule__Controller__EndpointAssignment_6_1 ) )
            // InternalProjectDSL.g:889:2: ( rule__Controller__EndpointAssignment_6_1 )
            {
             before(grammarAccess.getControllerAccess().getEndpointAssignment_6_1()); 
            // InternalProjectDSL.g:890:2: ( rule__Controller__EndpointAssignment_6_1 )
            // InternalProjectDSL.g:890:3: rule__Controller__EndpointAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Controller__EndpointAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getControllerAccess().getEndpointAssignment_6_1()); 

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
    // $ANTLR end "rule__Controller__Group_6__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalProjectDSL.g:899:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:903:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalProjectDSL.g:904:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalProjectDSL.g:911:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:915:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalProjectDSL.g:916:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalProjectDSL.g:916:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalProjectDSL.g:917:2: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalProjectDSL.g:918:2: ( rule__Parameter__NameAssignment_0 )
            // InternalProjectDSL.g:918:3: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalProjectDSL.g:926:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:930:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalProjectDSL.g:931:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalProjectDSL.g:938:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:942:1: ( ( ':' ) )
            // InternalProjectDSL.g:943:1: ( ':' )
            {
            // InternalProjectDSL.g:943:1: ( ':' )
            // InternalProjectDSL.g:944:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalProjectDSL.g:953:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:957:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalProjectDSL.g:958:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalProjectDSL.g:965:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:969:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // InternalProjectDSL.g:970:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // InternalProjectDSL.g:970:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // InternalProjectDSL.g:971:2: ( rule__Parameter__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            // InternalProjectDSL.g:972:2: ( rule__Parameter__TypeAssignment_2 )
            // InternalProjectDSL.g:972:3: rule__Parameter__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalProjectDSL.g:980:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:984:1: ( rule__Parameter__Group__3__Impl )
            // InternalProjectDSL.g:985:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3__Impl();

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
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalProjectDSL.g:991:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__Group_3__0 )? ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:995:1: ( ( ( rule__Parameter__Group_3__0 )? ) )
            // InternalProjectDSL.g:996:1: ( ( rule__Parameter__Group_3__0 )? )
            {
            // InternalProjectDSL.g:996:1: ( ( rule__Parameter__Group_3__0 )? )
            // InternalProjectDSL.g:997:2: ( rule__Parameter__Group_3__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_3()); 
            // InternalProjectDSL.g:998:2: ( rule__Parameter__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalProjectDSL.g:998:3: rule__Parameter__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group_3__0"
    // InternalProjectDSL.g:1007:1: rule__Parameter__Group_3__0 : rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1 ;
    public final void rule__Parameter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1011:1: ( rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1 )
            // InternalProjectDSL.g:1012:2: rule__Parameter__Group_3__0__Impl rule__Parameter__Group_3__1
            {
            pushFollow(FOLLOW_17);
            rule__Parameter__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_3__1();

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
    // $ANTLR end "rule__Parameter__Group_3__0"


    // $ANTLR start "rule__Parameter__Group_3__0__Impl"
    // InternalProjectDSL.g:1019:1: rule__Parameter__Group_3__0__Impl : ( 'redirect' ) ;
    public final void rule__Parameter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1023:1: ( ( 'redirect' ) )
            // InternalProjectDSL.g:1024:1: ( 'redirect' )
            {
            // InternalProjectDSL.g:1024:1: ( 'redirect' )
            // InternalProjectDSL.g:1025:2: 'redirect'
            {
             before(grammarAccess.getParameterAccess().getRedirectKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getRedirectKeyword_3_0()); 

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
    // $ANTLR end "rule__Parameter__Group_3__0__Impl"


    // $ANTLR start "rule__Parameter__Group_3__1"
    // InternalProjectDSL.g:1034:1: rule__Parameter__Group_3__1 : rule__Parameter__Group_3__1__Impl ;
    public final void rule__Parameter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1038:1: ( rule__Parameter__Group_3__1__Impl )
            // InternalProjectDSL.g:1039:2: rule__Parameter__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_3__1__Impl();

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
    // $ANTLR end "rule__Parameter__Group_3__1"


    // $ANTLR start "rule__Parameter__Group_3__1__Impl"
    // InternalProjectDSL.g:1045:1: rule__Parameter__Group_3__1__Impl : ( ( rule__Parameter__BaseAssignment_3_1 ) ) ;
    public final void rule__Parameter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1049:1: ( ( ( rule__Parameter__BaseAssignment_3_1 ) ) )
            // InternalProjectDSL.g:1050:1: ( ( rule__Parameter__BaseAssignment_3_1 ) )
            {
            // InternalProjectDSL.g:1050:1: ( ( rule__Parameter__BaseAssignment_3_1 ) )
            // InternalProjectDSL.g:1051:2: ( rule__Parameter__BaseAssignment_3_1 )
            {
             before(grammarAccess.getParameterAccess().getBaseAssignment_3_1()); 
            // InternalProjectDSL.g:1052:2: ( rule__Parameter__BaseAssignment_3_1 )
            // InternalProjectDSL.g:1052:3: rule__Parameter__BaseAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__BaseAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getBaseAssignment_3_1()); 

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
    // $ANTLR end "rule__Parameter__Group_3__1__Impl"


    // $ANTLR start "rule__RestAPI__NameAssignment_1"
    // InternalProjectDSL.g:1061:1: rule__RestAPI__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RestAPI__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1065:1: ( ( RULE_ID ) )
            // InternalProjectDSL.g:1066:2: ( RULE_ID )
            {
            // InternalProjectDSL.g:1066:2: ( RULE_ID )
            // InternalProjectDSL.g:1067:3: RULE_ID
            {
             before(grammarAccess.getRestAPIAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRestAPIAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__RestAPI__NameAssignment_1"


    // $ANTLR start "rule__RestAPI__DeclarationsAssignment_2"
    // InternalProjectDSL.g:1076:1: rule__RestAPI__DeclarationsAssignment_2 : ( ruleDeclaration ) ;
    public final void rule__RestAPI__DeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1080:1: ( ( ruleDeclaration ) )
            // InternalProjectDSL.g:1081:2: ( ruleDeclaration )
            {
            // InternalProjectDSL.g:1081:2: ( ruleDeclaration )
            // InternalProjectDSL.g:1082:3: ruleDeclaration
            {
             before(grammarAccess.getRestAPIAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getRestAPIAccess().getDeclarationsDeclarationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__RestAPI__DeclarationsAssignment_2"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalProjectDSL.g:1091:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1095:1: ( ( RULE_ID ) )
            // InternalProjectDSL.g:1096:2: ( RULE_ID )
            {
            // InternalProjectDSL.g:1096:2: ( RULE_ID )
            // InternalProjectDSL.g:1097:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__ParametersAssignment_3"
    // InternalProjectDSL.g:1106:1: rule__Entity__ParametersAssignment_3 : ( ruleParameter ) ;
    public final void rule__Entity__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1110:1: ( ( ruleParameter ) )
            // InternalProjectDSL.g:1111:2: ( ruleParameter )
            {
            // InternalProjectDSL.g:1111:2: ( ruleParameter )
            // InternalProjectDSL.g:1112:3: ruleParameter
            {
             before(grammarAccess.getEntityAccess().getParametersParameterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getParametersParameterParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Entity__ParametersAssignment_3"


    // $ANTLR start "rule__Controller__NameAssignment_1"
    // InternalProjectDSL.g:1121:1: rule__Controller__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Controller__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1125:1: ( ( RULE_ID ) )
            // InternalProjectDSL.g:1126:2: ( RULE_ID )
            {
            // InternalProjectDSL.g:1126:2: ( RULE_ID )
            // InternalProjectDSL.g:1127:3: RULE_ID
            {
             before(grammarAccess.getControllerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Controller__NameAssignment_1"


    // $ANTLR start "rule__Controller__BaseAssignment_3"
    // InternalProjectDSL.g:1136:1: rule__Controller__BaseAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Controller__BaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1140:1: ( ( ( RULE_ID ) ) )
            // InternalProjectDSL.g:1141:2: ( ( RULE_ID ) )
            {
            // InternalProjectDSL.g:1141:2: ( ( RULE_ID ) )
            // InternalProjectDSL.g:1142:3: ( RULE_ID )
            {
             before(grammarAccess.getControllerAccess().getBaseEntityCrossReference_3_0()); 
            // InternalProjectDSL.g:1143:3: ( RULE_ID )
            // InternalProjectDSL.g:1144:4: RULE_ID
            {
             before(grammarAccess.getControllerAccess().getBaseEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getBaseEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getControllerAccess().getBaseEntityCrossReference_3_0()); 

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
    // $ANTLR end "rule__Controller__BaseAssignment_3"


    // $ANTLR start "rule__Controller__BaseAssignment_4_1"
    // InternalProjectDSL.g:1155:1: rule__Controller__BaseAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Controller__BaseAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1159:1: ( ( ( RULE_ID ) ) )
            // InternalProjectDSL.g:1160:2: ( ( RULE_ID ) )
            {
            // InternalProjectDSL.g:1160:2: ( ( RULE_ID ) )
            // InternalProjectDSL.g:1161:3: ( RULE_ID )
            {
             before(grammarAccess.getControllerAccess().getBaseEntityCrossReference_4_1_0()); 
            // InternalProjectDSL.g:1162:3: ( RULE_ID )
            // InternalProjectDSL.g:1163:4: RULE_ID
            {
             before(grammarAccess.getControllerAccess().getBaseEntityIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getBaseEntityIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getControllerAccess().getBaseEntityCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Controller__BaseAssignment_4_1"


    // $ANTLR start "rule__Controller__EndpointAssignment_6_1"
    // InternalProjectDSL.g:1174:1: rule__Controller__EndpointAssignment_6_1 : ( ruleEndpoint ) ;
    public final void rule__Controller__EndpointAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1178:1: ( ( ruleEndpoint ) )
            // InternalProjectDSL.g:1179:2: ( ruleEndpoint )
            {
            // InternalProjectDSL.g:1179:2: ( ruleEndpoint )
            // InternalProjectDSL.g:1180:3: ruleEndpoint
            {
             before(grammarAccess.getControllerAccess().getEndpointEndpointParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEndpoint();

            state._fsp--;

             after(grammarAccess.getControllerAccess().getEndpointEndpointParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Controller__EndpointAssignment_6_1"


    // $ANTLR start "rule__Endpoint__NameAssignment"
    // InternalProjectDSL.g:1189:1: rule__Endpoint__NameAssignment : ( RULE_ID ) ;
    public final void rule__Endpoint__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1193:1: ( ( RULE_ID ) )
            // InternalProjectDSL.g:1194:2: ( RULE_ID )
            {
            // InternalProjectDSL.g:1194:2: ( RULE_ID )
            // InternalProjectDSL.g:1195:3: RULE_ID
            {
             before(grammarAccess.getEndpointAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Endpoint__NameAssignment"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // InternalProjectDSL.g:1204:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1208:1: ( ( RULE_ID ) )
            // InternalProjectDSL.g:1209:2: ( RULE_ID )
            {
            // InternalProjectDSL.g:1209:2: ( RULE_ID )
            // InternalProjectDSL.g:1210:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Parameter__NameAssignment_0"


    // $ANTLR start "rule__Parameter__TypeAssignment_2"
    // InternalProjectDSL.g:1219:1: rule__Parameter__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1223:1: ( ( ruleType ) )
            // InternalProjectDSL.g:1224:2: ( ruleType )
            {
            // InternalProjectDSL.g:1224:2: ( ruleType )
            // InternalProjectDSL.g:1225:3: ruleType
            {
             before(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Parameter__TypeAssignment_2"


    // $ANTLR start "rule__Parameter__BaseAssignment_3_1"
    // InternalProjectDSL.g:1234:1: rule__Parameter__BaseAssignment_3_1 : ( ruleRedirect ) ;
    public final void rule__Parameter__BaseAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1238:1: ( ( ruleRedirect ) )
            // InternalProjectDSL.g:1239:2: ( ruleRedirect )
            {
            // InternalProjectDSL.g:1239:2: ( ruleRedirect )
            // InternalProjectDSL.g:1240:3: ruleRedirect
            {
             before(grammarAccess.getParameterAccess().getBaseRedirectParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRedirect();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getBaseRedirectParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Parameter__BaseAssignment_3_1"


    // $ANTLR start "rule__Redirect__NameAssignment_0"
    // InternalProjectDSL.g:1249:1: rule__Redirect__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Redirect__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1253:1: ( ( ( RULE_ID ) ) )
            // InternalProjectDSL.g:1254:2: ( ( RULE_ID ) )
            {
            // InternalProjectDSL.g:1254:2: ( ( RULE_ID ) )
            // InternalProjectDSL.g:1255:3: ( RULE_ID )
            {
             before(grammarAccess.getRedirectAccess().getNameControllerCrossReference_0_0()); 
            // InternalProjectDSL.g:1256:3: ( RULE_ID )
            // InternalProjectDSL.g:1257:4: RULE_ID
            {
             before(grammarAccess.getRedirectAccess().getNameControllerIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRedirectAccess().getNameControllerIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRedirectAccess().getNameControllerCrossReference_0_0()); 

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
    // $ANTLR end "rule__Redirect__NameAssignment_0"


    // $ANTLR start "rule__Redirect__UrlAssignment_1"
    // InternalProjectDSL.g:1268:1: rule__Redirect__UrlAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Redirect__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1272:1: ( ( RULE_STRING ) )
            // InternalProjectDSL.g:1273:2: ( RULE_STRING )
            {
            // InternalProjectDSL.g:1273:2: ( RULE_STRING )
            // InternalProjectDSL.g:1274:3: RULE_STRING
            {
             before(grammarAccess.getRedirectAccess().getUrlSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRedirectAccess().getUrlSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Redirect__UrlAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000030L});

}