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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'R'", "'U'", "'system'", "'entity'", "'requires'", "'{'", "'}'", "'controller'", "'uses'", "','", "'make'", "'='", "':'", "'redirect'"
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
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
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
    // InternalProjectDSL.g:162:1: ruleEndpoint : ( ( rule__Endpoint__EndpointAssignment ) ) ;
    public final void ruleEndpoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:166:2: ( ( ( rule__Endpoint__EndpointAssignment ) ) )
            // InternalProjectDSL.g:167:2: ( ( rule__Endpoint__EndpointAssignment ) )
            {
            // InternalProjectDSL.g:167:2: ( ( rule__Endpoint__EndpointAssignment ) )
            // InternalProjectDSL.g:168:3: ( rule__Endpoint__EndpointAssignment )
            {
             before(grammarAccess.getEndpointAccess().getEndpointAssignment()); 
            // InternalProjectDSL.g:169:3: ( rule__Endpoint__EndpointAssignment )
            // InternalProjectDSL.g:169:4: rule__Endpoint__EndpointAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Endpoint__EndpointAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEndpointAccess().getEndpointAssignment()); 

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

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==18) ) {
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
    // InternalProjectDSL.g:294:1: rule__Type__Alternatives : ( ( 'R' ) | ( 'U' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:298:1: ( ( 'R' ) | ( 'U' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalProjectDSL.g:299:2: ( 'R' )
                    {
                    // InternalProjectDSL.g:299:2: ( 'R' )
                    // InternalProjectDSL.g:300:3: 'R'
                    {
                     before(grammarAccess.getTypeAccess().getRKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getRKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProjectDSL.g:305:2: ( 'U' )
                    {
                    // InternalProjectDSL.g:305:2: ( 'U' )
                    // InternalProjectDSL.g:306:3: 'U'
                    {
                     before(grammarAccess.getTypeAccess().getUKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getUKeyword_1()); 

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
    // InternalProjectDSL.g:315:1: rule__RestAPI__Group__0 : rule__RestAPI__Group__0__Impl rule__RestAPI__Group__1 ;
    public final void rule__RestAPI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:319:1: ( rule__RestAPI__Group__0__Impl rule__RestAPI__Group__1 )
            // InternalProjectDSL.g:320:2: rule__RestAPI__Group__0__Impl rule__RestAPI__Group__1
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
    // InternalProjectDSL.g:327:1: rule__RestAPI__Group__0__Impl : ( 'system' ) ;
    public final void rule__RestAPI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:331:1: ( ( 'system' ) )
            // InternalProjectDSL.g:332:1: ( 'system' )
            {
            // InternalProjectDSL.g:332:1: ( 'system' )
            // InternalProjectDSL.g:333:2: 'system'
            {
             before(grammarAccess.getRestAPIAccess().getSystemKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalProjectDSL.g:342:1: rule__RestAPI__Group__1 : rule__RestAPI__Group__1__Impl rule__RestAPI__Group__2 ;
    public final void rule__RestAPI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:346:1: ( rule__RestAPI__Group__1__Impl rule__RestAPI__Group__2 )
            // InternalProjectDSL.g:347:2: rule__RestAPI__Group__1__Impl rule__RestAPI__Group__2
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
    // InternalProjectDSL.g:354:1: rule__RestAPI__Group__1__Impl : ( ( rule__RestAPI__NameAssignment_1 ) ) ;
    public final void rule__RestAPI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:358:1: ( ( ( rule__RestAPI__NameAssignment_1 ) ) )
            // InternalProjectDSL.g:359:1: ( ( rule__RestAPI__NameAssignment_1 ) )
            {
            // InternalProjectDSL.g:359:1: ( ( rule__RestAPI__NameAssignment_1 ) )
            // InternalProjectDSL.g:360:2: ( rule__RestAPI__NameAssignment_1 )
            {
             before(grammarAccess.getRestAPIAccess().getNameAssignment_1()); 
            // InternalProjectDSL.g:361:2: ( rule__RestAPI__NameAssignment_1 )
            // InternalProjectDSL.g:361:3: rule__RestAPI__NameAssignment_1
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
    // InternalProjectDSL.g:369:1: rule__RestAPI__Group__2 : rule__RestAPI__Group__2__Impl ;
    public final void rule__RestAPI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:373:1: ( rule__RestAPI__Group__2__Impl )
            // InternalProjectDSL.g:374:2: rule__RestAPI__Group__2__Impl
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
    // InternalProjectDSL.g:380:1: rule__RestAPI__Group__2__Impl : ( ( rule__RestAPI__DeclarationsAssignment_2 )* ) ;
    public final void rule__RestAPI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:384:1: ( ( ( rule__RestAPI__DeclarationsAssignment_2 )* ) )
            // InternalProjectDSL.g:385:1: ( ( rule__RestAPI__DeclarationsAssignment_2 )* )
            {
            // InternalProjectDSL.g:385:1: ( ( rule__RestAPI__DeclarationsAssignment_2 )* )
            // InternalProjectDSL.g:386:2: ( rule__RestAPI__DeclarationsAssignment_2 )*
            {
             before(grammarAccess.getRestAPIAccess().getDeclarationsAssignment_2()); 
            // InternalProjectDSL.g:387:2: ( rule__RestAPI__DeclarationsAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14||LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalProjectDSL.g:387:3: rule__RestAPI__DeclarationsAssignment_2
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
    // InternalProjectDSL.g:396:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:400:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalProjectDSL.g:401:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalProjectDSL.g:408:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:412:1: ( ( 'entity' ) )
            // InternalProjectDSL.g:413:1: ( 'entity' )
            {
            // InternalProjectDSL.g:413:1: ( 'entity' )
            // InternalProjectDSL.g:414:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalProjectDSL.g:423:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:427:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalProjectDSL.g:428:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalProjectDSL.g:435:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:439:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalProjectDSL.g:440:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalProjectDSL.g:440:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalProjectDSL.g:441:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalProjectDSL.g:442:2: ( rule__Entity__NameAssignment_1 )
            // InternalProjectDSL.g:442:3: rule__Entity__NameAssignment_1
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
    // InternalProjectDSL.g:450:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:454:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalProjectDSL.g:455:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
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
    // InternalProjectDSL.g:462:1: rule__Entity__Group__2__Impl : ( 'requires' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:466:1: ( ( 'requires' ) )
            // InternalProjectDSL.g:467:1: ( 'requires' )
            {
            // InternalProjectDSL.g:467:1: ( 'requires' )
            // InternalProjectDSL.g:468:2: 'requires'
            {
             before(grammarAccess.getEntityAccess().getRequiresKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRequiresKeyword_2()); 

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
    // InternalProjectDSL.g:477:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:481:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalProjectDSL.g:482:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
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
    // InternalProjectDSL.g:489:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__CtrlrAssignment_3 ) ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:493:1: ( ( ( rule__Entity__CtrlrAssignment_3 ) ) )
            // InternalProjectDSL.g:494:1: ( ( rule__Entity__CtrlrAssignment_3 ) )
            {
            // InternalProjectDSL.g:494:1: ( ( rule__Entity__CtrlrAssignment_3 ) )
            // InternalProjectDSL.g:495:2: ( rule__Entity__CtrlrAssignment_3 )
            {
             before(grammarAccess.getEntityAccess().getCtrlrAssignment_3()); 
            // InternalProjectDSL.g:496:2: ( rule__Entity__CtrlrAssignment_3 )
            // InternalProjectDSL.g:496:3: rule__Entity__CtrlrAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Entity__CtrlrAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getCtrlrAssignment_3()); 

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
    // InternalProjectDSL.g:504:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:508:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalProjectDSL.g:509:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

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
    // InternalProjectDSL.g:516:1: rule__Entity__Group__4__Impl : ( '{' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:520:1: ( ( '{' ) )
            // InternalProjectDSL.g:521:1: ( '{' )
            {
            // InternalProjectDSL.g:521:1: ( '{' )
            // InternalProjectDSL.g:522:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__Entity__Group__5"
    // InternalProjectDSL.g:531:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:535:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // InternalProjectDSL.g:536:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__6();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalProjectDSL.g:543:1: rule__Entity__Group__5__Impl : ( ( ( rule__Entity__ParametersAssignment_5 ) ) ( ( rule__Entity__ParametersAssignment_5 )* ) ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:547:1: ( ( ( ( rule__Entity__ParametersAssignment_5 ) ) ( ( rule__Entity__ParametersAssignment_5 )* ) ) )
            // InternalProjectDSL.g:548:1: ( ( ( rule__Entity__ParametersAssignment_5 ) ) ( ( rule__Entity__ParametersAssignment_5 )* ) )
            {
            // InternalProjectDSL.g:548:1: ( ( ( rule__Entity__ParametersAssignment_5 ) ) ( ( rule__Entity__ParametersAssignment_5 )* ) )
            // InternalProjectDSL.g:549:2: ( ( rule__Entity__ParametersAssignment_5 ) ) ( ( rule__Entity__ParametersAssignment_5 )* )
            {
            // InternalProjectDSL.g:549:2: ( ( rule__Entity__ParametersAssignment_5 ) )
            // InternalProjectDSL.g:550:3: ( rule__Entity__ParametersAssignment_5 )
            {
             before(grammarAccess.getEntityAccess().getParametersAssignment_5()); 
            // InternalProjectDSL.g:551:3: ( rule__Entity__ParametersAssignment_5 )
            // InternalProjectDSL.g:551:4: rule__Entity__ParametersAssignment_5
            {
            pushFollow(FOLLOW_9);
            rule__Entity__ParametersAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getParametersAssignment_5()); 

            }

            // InternalProjectDSL.g:554:2: ( ( rule__Entity__ParametersAssignment_5 )* )
            // InternalProjectDSL.g:555:3: ( rule__Entity__ParametersAssignment_5 )*
            {
             before(grammarAccess.getEntityAccess().getParametersAssignment_5()); 
            // InternalProjectDSL.g:556:3: ( rule__Entity__ParametersAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalProjectDSL.g:556:4: rule__Entity__ParametersAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Entity__ParametersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getParametersAssignment_5()); 

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
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // InternalProjectDSL.g:565:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:569:1: ( rule__Entity__Group__6__Impl )
            // InternalProjectDSL.g:570:2: rule__Entity__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__6__Impl();

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
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // InternalProjectDSL.g:576:1: rule__Entity__Group__6__Impl : ( '}' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:580:1: ( ( '}' ) )
            // InternalProjectDSL.g:581:1: ( '}' )
            {
            // InternalProjectDSL.g:581:1: ( '}' )
            // InternalProjectDSL.g:582:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Controller__Group__0"
    // InternalProjectDSL.g:592:1: rule__Controller__Group__0 : rule__Controller__Group__0__Impl rule__Controller__Group__1 ;
    public final void rule__Controller__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:596:1: ( rule__Controller__Group__0__Impl rule__Controller__Group__1 )
            // InternalProjectDSL.g:597:2: rule__Controller__Group__0__Impl rule__Controller__Group__1
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
    // InternalProjectDSL.g:604:1: rule__Controller__Group__0__Impl : ( 'controller' ) ;
    public final void rule__Controller__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:608:1: ( ( 'controller' ) )
            // InternalProjectDSL.g:609:1: ( 'controller' )
            {
            // InternalProjectDSL.g:609:1: ( 'controller' )
            // InternalProjectDSL.g:610:2: 'controller'
            {
             before(grammarAccess.getControllerAccess().getControllerKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalProjectDSL.g:619:1: rule__Controller__Group__1 : rule__Controller__Group__1__Impl rule__Controller__Group__2 ;
    public final void rule__Controller__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:623:1: ( rule__Controller__Group__1__Impl rule__Controller__Group__2 )
            // InternalProjectDSL.g:624:2: rule__Controller__Group__1__Impl rule__Controller__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalProjectDSL.g:631:1: rule__Controller__Group__1__Impl : ( ( rule__Controller__NameAssignment_1 ) ) ;
    public final void rule__Controller__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:635:1: ( ( ( rule__Controller__NameAssignment_1 ) ) )
            // InternalProjectDSL.g:636:1: ( ( rule__Controller__NameAssignment_1 ) )
            {
            // InternalProjectDSL.g:636:1: ( ( rule__Controller__NameAssignment_1 ) )
            // InternalProjectDSL.g:637:2: ( rule__Controller__NameAssignment_1 )
            {
             before(grammarAccess.getControllerAccess().getNameAssignment_1()); 
            // InternalProjectDSL.g:638:2: ( rule__Controller__NameAssignment_1 )
            // InternalProjectDSL.g:638:3: rule__Controller__NameAssignment_1
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
    // InternalProjectDSL.g:646:1: rule__Controller__Group__2 : rule__Controller__Group__2__Impl rule__Controller__Group__3 ;
    public final void rule__Controller__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:650:1: ( rule__Controller__Group__2__Impl rule__Controller__Group__3 )
            // InternalProjectDSL.g:651:2: rule__Controller__Group__2__Impl rule__Controller__Group__3
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
    // InternalProjectDSL.g:658:1: rule__Controller__Group__2__Impl : ( 'uses' ) ;
    public final void rule__Controller__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:662:1: ( ( 'uses' ) )
            // InternalProjectDSL.g:663:1: ( 'uses' )
            {
            // InternalProjectDSL.g:663:1: ( 'uses' )
            // InternalProjectDSL.g:664:2: 'uses'
            {
             before(grammarAccess.getControllerAccess().getUsesKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalProjectDSL.g:673:1: rule__Controller__Group__3 : rule__Controller__Group__3__Impl rule__Controller__Group__4 ;
    public final void rule__Controller__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:677:1: ( rule__Controller__Group__3__Impl rule__Controller__Group__4 )
            // InternalProjectDSL.g:678:2: rule__Controller__Group__3__Impl rule__Controller__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalProjectDSL.g:685:1: rule__Controller__Group__3__Impl : ( ( rule__Controller__BaseAssignment_3 ) ) ;
    public final void rule__Controller__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:689:1: ( ( ( rule__Controller__BaseAssignment_3 ) ) )
            // InternalProjectDSL.g:690:1: ( ( rule__Controller__BaseAssignment_3 ) )
            {
            // InternalProjectDSL.g:690:1: ( ( rule__Controller__BaseAssignment_3 ) )
            // InternalProjectDSL.g:691:2: ( rule__Controller__BaseAssignment_3 )
            {
             before(grammarAccess.getControllerAccess().getBaseAssignment_3()); 
            // InternalProjectDSL.g:692:2: ( rule__Controller__BaseAssignment_3 )
            // InternalProjectDSL.g:692:3: rule__Controller__BaseAssignment_3
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
    // InternalProjectDSL.g:700:1: rule__Controller__Group__4 : rule__Controller__Group__4__Impl rule__Controller__Group__5 ;
    public final void rule__Controller__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:704:1: ( rule__Controller__Group__4__Impl rule__Controller__Group__5 )
            // InternalProjectDSL.g:705:2: rule__Controller__Group__4__Impl rule__Controller__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalProjectDSL.g:712:1: rule__Controller__Group__4__Impl : ( ( rule__Controller__Group_4__0 )* ) ;
    public final void rule__Controller__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:716:1: ( ( ( rule__Controller__Group_4__0 )* ) )
            // InternalProjectDSL.g:717:1: ( ( rule__Controller__Group_4__0 )* )
            {
            // InternalProjectDSL.g:717:1: ( ( rule__Controller__Group_4__0 )* )
            // InternalProjectDSL.g:718:2: ( rule__Controller__Group_4__0 )*
            {
             before(grammarAccess.getControllerAccess().getGroup_4()); 
            // InternalProjectDSL.g:719:2: ( rule__Controller__Group_4__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalProjectDSL.g:719:3: rule__Controller__Group_4__0
            	    {
            	    pushFollow(FOLLOW_12);
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
    // InternalProjectDSL.g:727:1: rule__Controller__Group__5 : rule__Controller__Group__5__Impl rule__Controller__Group__6 ;
    public final void rule__Controller__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:731:1: ( rule__Controller__Group__5__Impl rule__Controller__Group__6 )
            // InternalProjectDSL.g:732:2: rule__Controller__Group__5__Impl rule__Controller__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalProjectDSL.g:739:1: rule__Controller__Group__5__Impl : ( '{' ) ;
    public final void rule__Controller__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:743:1: ( ( '{' ) )
            // InternalProjectDSL.g:744:1: ( '{' )
            {
            // InternalProjectDSL.g:744:1: ( '{' )
            // InternalProjectDSL.g:745:2: '{'
            {
             before(grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
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
    // InternalProjectDSL.g:754:1: rule__Controller__Group__6 : rule__Controller__Group__6__Impl rule__Controller__Group__7 ;
    public final void rule__Controller__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:758:1: ( rule__Controller__Group__6__Impl rule__Controller__Group__7 )
            // InternalProjectDSL.g:759:2: rule__Controller__Group__6__Impl rule__Controller__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalProjectDSL.g:766:1: rule__Controller__Group__6__Impl : ( ( ( rule__Controller__Group_6__0 ) ) ( ( rule__Controller__Group_6__0 )* ) ) ;
    public final void rule__Controller__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:770:1: ( ( ( ( rule__Controller__Group_6__0 ) ) ( ( rule__Controller__Group_6__0 )* ) ) )
            // InternalProjectDSL.g:771:1: ( ( ( rule__Controller__Group_6__0 ) ) ( ( rule__Controller__Group_6__0 )* ) )
            {
            // InternalProjectDSL.g:771:1: ( ( ( rule__Controller__Group_6__0 ) ) ( ( rule__Controller__Group_6__0 )* ) )
            // InternalProjectDSL.g:772:2: ( ( rule__Controller__Group_6__0 ) ) ( ( rule__Controller__Group_6__0 )* )
            {
            // InternalProjectDSL.g:772:2: ( ( rule__Controller__Group_6__0 ) )
            // InternalProjectDSL.g:773:3: ( rule__Controller__Group_6__0 )
            {
             before(grammarAccess.getControllerAccess().getGroup_6()); 
            // InternalProjectDSL.g:774:3: ( rule__Controller__Group_6__0 )
            // InternalProjectDSL.g:774:4: rule__Controller__Group_6__0
            {
            pushFollow(FOLLOW_14);
            rule__Controller__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getControllerAccess().getGroup_6()); 

            }

            // InternalProjectDSL.g:777:2: ( ( rule__Controller__Group_6__0 )* )
            // InternalProjectDSL.g:778:3: ( rule__Controller__Group_6__0 )*
            {
             before(grammarAccess.getControllerAccess().getGroup_6()); 
            // InternalProjectDSL.g:779:3: ( rule__Controller__Group_6__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalProjectDSL.g:779:4: rule__Controller__Group_6__0
            	    {
            	    pushFollow(FOLLOW_14);
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
    // InternalProjectDSL.g:788:1: rule__Controller__Group__7 : rule__Controller__Group__7__Impl ;
    public final void rule__Controller__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:792:1: ( rule__Controller__Group__7__Impl )
            // InternalProjectDSL.g:793:2: rule__Controller__Group__7__Impl
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
    // InternalProjectDSL.g:799:1: rule__Controller__Group__7__Impl : ( '}' ) ;
    public final void rule__Controller__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:803:1: ( ( '}' ) )
            // InternalProjectDSL.g:804:1: ( '}' )
            {
            // InternalProjectDSL.g:804:1: ( '}' )
            // InternalProjectDSL.g:805:2: '}'
            {
             before(grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_2); 
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
    // InternalProjectDSL.g:815:1: rule__Controller__Group_4__0 : rule__Controller__Group_4__0__Impl rule__Controller__Group_4__1 ;
    public final void rule__Controller__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:819:1: ( rule__Controller__Group_4__0__Impl rule__Controller__Group_4__1 )
            // InternalProjectDSL.g:820:2: rule__Controller__Group_4__0__Impl rule__Controller__Group_4__1
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
    // InternalProjectDSL.g:827:1: rule__Controller__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Controller__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:831:1: ( ( ',' ) )
            // InternalProjectDSL.g:832:1: ( ',' )
            {
            // InternalProjectDSL.g:832:1: ( ',' )
            // InternalProjectDSL.g:833:2: ','
            {
             before(grammarAccess.getControllerAccess().getCommaKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalProjectDSL.g:842:1: rule__Controller__Group_4__1 : rule__Controller__Group_4__1__Impl ;
    public final void rule__Controller__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:846:1: ( rule__Controller__Group_4__1__Impl )
            // InternalProjectDSL.g:847:2: rule__Controller__Group_4__1__Impl
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
    // InternalProjectDSL.g:853:1: rule__Controller__Group_4__1__Impl : ( ( rule__Controller__BaseAssignment_4_1 ) ) ;
    public final void rule__Controller__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:857:1: ( ( ( rule__Controller__BaseAssignment_4_1 ) ) )
            // InternalProjectDSL.g:858:1: ( ( rule__Controller__BaseAssignment_4_1 ) )
            {
            // InternalProjectDSL.g:858:1: ( ( rule__Controller__BaseAssignment_4_1 ) )
            // InternalProjectDSL.g:859:2: ( rule__Controller__BaseAssignment_4_1 )
            {
             before(grammarAccess.getControllerAccess().getBaseAssignment_4_1()); 
            // InternalProjectDSL.g:860:2: ( rule__Controller__BaseAssignment_4_1 )
            // InternalProjectDSL.g:860:3: rule__Controller__BaseAssignment_4_1
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
    // InternalProjectDSL.g:869:1: rule__Controller__Group_6__0 : rule__Controller__Group_6__0__Impl rule__Controller__Group_6__1 ;
    public final void rule__Controller__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:873:1: ( rule__Controller__Group_6__0__Impl rule__Controller__Group_6__1 )
            // InternalProjectDSL.g:874:2: rule__Controller__Group_6__0__Impl rule__Controller__Group_6__1
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
    // InternalProjectDSL.g:881:1: rule__Controller__Group_6__0__Impl : ( 'make' ) ;
    public final void rule__Controller__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:885:1: ( ( 'make' ) )
            // InternalProjectDSL.g:886:1: ( 'make' )
            {
            // InternalProjectDSL.g:886:1: ( 'make' )
            // InternalProjectDSL.g:887:2: 'make'
            {
             before(grammarAccess.getControllerAccess().getMakeKeyword_6_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalProjectDSL.g:896:1: rule__Controller__Group_6__1 : rule__Controller__Group_6__1__Impl ;
    public final void rule__Controller__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:900:1: ( rule__Controller__Group_6__1__Impl )
            // InternalProjectDSL.g:901:2: rule__Controller__Group_6__1__Impl
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
    // InternalProjectDSL.g:907:1: rule__Controller__Group_6__1__Impl : ( ( rule__Controller__EndpointAssignment_6_1 ) ) ;
    public final void rule__Controller__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:911:1: ( ( ( rule__Controller__EndpointAssignment_6_1 ) ) )
            // InternalProjectDSL.g:912:1: ( ( rule__Controller__EndpointAssignment_6_1 ) )
            {
            // InternalProjectDSL.g:912:1: ( ( rule__Controller__EndpointAssignment_6_1 ) )
            // InternalProjectDSL.g:913:2: ( rule__Controller__EndpointAssignment_6_1 )
            {
             before(grammarAccess.getControllerAccess().getEndpointAssignment_6_1()); 
            // InternalProjectDSL.g:914:2: ( rule__Controller__EndpointAssignment_6_1 )
            // InternalProjectDSL.g:914:3: rule__Controller__EndpointAssignment_6_1
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
    // InternalProjectDSL.g:923:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:927:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalProjectDSL.g:928:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalProjectDSL.g:935:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:939:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalProjectDSL.g:940:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalProjectDSL.g:940:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalProjectDSL.g:941:2: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalProjectDSL.g:942:2: ( rule__Parameter__NameAssignment_0 )
            // InternalProjectDSL.g:942:3: rule__Parameter__NameAssignment_0
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
    // InternalProjectDSL.g:950:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:954:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalProjectDSL.g:955:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalProjectDSL.g:962:1: rule__Parameter__Group__1__Impl : ( '=' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:966:1: ( ( '=' ) )
            // InternalProjectDSL.g:967:1: ( '=' )
            {
            // InternalProjectDSL.g:967:1: ( '=' )
            // InternalProjectDSL.g:968:2: '='
            {
             before(grammarAccess.getParameterAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getEqualsSignKeyword_1()); 

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
    // InternalProjectDSL.g:977:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:981:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalProjectDSL.g:982:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
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
    // InternalProjectDSL.g:989:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__DataTypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:993:1: ( ( ( rule__Parameter__DataTypeAssignment_2 ) ) )
            // InternalProjectDSL.g:994:1: ( ( rule__Parameter__DataTypeAssignment_2 ) )
            {
            // InternalProjectDSL.g:994:1: ( ( rule__Parameter__DataTypeAssignment_2 ) )
            // InternalProjectDSL.g:995:2: ( rule__Parameter__DataTypeAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getDataTypeAssignment_2()); 
            // InternalProjectDSL.g:996:2: ( rule__Parameter__DataTypeAssignment_2 )
            // InternalProjectDSL.g:996:3: rule__Parameter__DataTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__DataTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getDataTypeAssignment_2()); 

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
    // InternalProjectDSL.g:1004:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1008:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalProjectDSL.g:1009:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Parameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__4();

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
    // InternalProjectDSL.g:1016:1: rule__Parameter__Group__3__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1020:1: ( ( ':' ) )
            // InternalProjectDSL.g:1021:1: ( ':' )
            {
            // InternalProjectDSL.g:1021:1: ( ':' )
            // InternalProjectDSL.g:1022:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_3()); 

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


    // $ANTLR start "rule__Parameter__Group__4"
    // InternalProjectDSL.g:1031:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1035:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // InternalProjectDSL.g:1036:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Parameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5();

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
    // $ANTLR end "rule__Parameter__Group__4"


    // $ANTLR start "rule__Parameter__Group__4__Impl"
    // InternalProjectDSL.g:1043:1: rule__Parameter__Group__4__Impl : ( ( ( rule__Parameter__TypeAssignment_4 ) ) ( ( rule__Parameter__TypeAssignment_4 )* ) ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1047:1: ( ( ( ( rule__Parameter__TypeAssignment_4 ) ) ( ( rule__Parameter__TypeAssignment_4 )* ) ) )
            // InternalProjectDSL.g:1048:1: ( ( ( rule__Parameter__TypeAssignment_4 ) ) ( ( rule__Parameter__TypeAssignment_4 )* ) )
            {
            // InternalProjectDSL.g:1048:1: ( ( ( rule__Parameter__TypeAssignment_4 ) ) ( ( rule__Parameter__TypeAssignment_4 )* ) )
            // InternalProjectDSL.g:1049:2: ( ( rule__Parameter__TypeAssignment_4 ) ) ( ( rule__Parameter__TypeAssignment_4 )* )
            {
            // InternalProjectDSL.g:1049:2: ( ( rule__Parameter__TypeAssignment_4 ) )
            // InternalProjectDSL.g:1050:3: ( rule__Parameter__TypeAssignment_4 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_4()); 
            // InternalProjectDSL.g:1051:3: ( rule__Parameter__TypeAssignment_4 )
            // InternalProjectDSL.g:1051:4: rule__Parameter__TypeAssignment_4
            {
            pushFollow(FOLLOW_19);
            rule__Parameter__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_4()); 

            }

            // InternalProjectDSL.g:1054:2: ( ( rule__Parameter__TypeAssignment_4 )* )
            // InternalProjectDSL.g:1055:3: ( rule__Parameter__TypeAssignment_4 )*
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_4()); 
            // InternalProjectDSL.g:1056:3: ( rule__Parameter__TypeAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=11 && LA8_0<=12)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalProjectDSL.g:1056:4: rule__Parameter__TypeAssignment_4
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Parameter__TypeAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getParameterAccess().getTypeAssignment_4()); 

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
    // $ANTLR end "rule__Parameter__Group__4__Impl"


    // $ANTLR start "rule__Parameter__Group__5"
    // InternalProjectDSL.g:1065:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1069:1: ( rule__Parameter__Group__5__Impl )
            // InternalProjectDSL.g:1070:2: rule__Parameter__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5__Impl();

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
    // $ANTLR end "rule__Parameter__Group__5"


    // $ANTLR start "rule__Parameter__Group__5__Impl"
    // InternalProjectDSL.g:1076:1: rule__Parameter__Group__5__Impl : ( ( rule__Parameter__Group_5__0 )? ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1080:1: ( ( ( rule__Parameter__Group_5__0 )? ) )
            // InternalProjectDSL.g:1081:1: ( ( rule__Parameter__Group_5__0 )? )
            {
            // InternalProjectDSL.g:1081:1: ( ( rule__Parameter__Group_5__0 )? )
            // InternalProjectDSL.g:1082:2: ( rule__Parameter__Group_5__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_5()); 
            // InternalProjectDSL.g:1083:2: ( rule__Parameter__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalProjectDSL.g:1083:3: rule__Parameter__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Parameter__Group__5__Impl"


    // $ANTLR start "rule__Parameter__Group_5__0"
    // InternalProjectDSL.g:1092:1: rule__Parameter__Group_5__0 : rule__Parameter__Group_5__0__Impl rule__Parameter__Group_5__1 ;
    public final void rule__Parameter__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1096:1: ( rule__Parameter__Group_5__0__Impl rule__Parameter__Group_5__1 )
            // InternalProjectDSL.g:1097:2: rule__Parameter__Group_5__0__Impl rule__Parameter__Group_5__1
            {
            pushFollow(FOLLOW_20);
            rule__Parameter__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_5__1();

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
    // $ANTLR end "rule__Parameter__Group_5__0"


    // $ANTLR start "rule__Parameter__Group_5__0__Impl"
    // InternalProjectDSL.g:1104:1: rule__Parameter__Group_5__0__Impl : ( 'redirect' ) ;
    public final void rule__Parameter__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1108:1: ( ( 'redirect' ) )
            // InternalProjectDSL.g:1109:1: ( 'redirect' )
            {
            // InternalProjectDSL.g:1109:1: ( 'redirect' )
            // InternalProjectDSL.g:1110:2: 'redirect'
            {
             before(grammarAccess.getParameterAccess().getRedirectKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getRedirectKeyword_5_0()); 

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
    // $ANTLR end "rule__Parameter__Group_5__0__Impl"


    // $ANTLR start "rule__Parameter__Group_5__1"
    // InternalProjectDSL.g:1119:1: rule__Parameter__Group_5__1 : rule__Parameter__Group_5__1__Impl ;
    public final void rule__Parameter__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1123:1: ( rule__Parameter__Group_5__1__Impl )
            // InternalProjectDSL.g:1124:2: rule__Parameter__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_5__1__Impl();

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
    // $ANTLR end "rule__Parameter__Group_5__1"


    // $ANTLR start "rule__Parameter__Group_5__1__Impl"
    // InternalProjectDSL.g:1130:1: rule__Parameter__Group_5__1__Impl : ( ( rule__Parameter__BaseAssignment_5_1 ) ) ;
    public final void rule__Parameter__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1134:1: ( ( ( rule__Parameter__BaseAssignment_5_1 ) ) )
            // InternalProjectDSL.g:1135:1: ( ( rule__Parameter__BaseAssignment_5_1 ) )
            {
            // InternalProjectDSL.g:1135:1: ( ( rule__Parameter__BaseAssignment_5_1 ) )
            // InternalProjectDSL.g:1136:2: ( rule__Parameter__BaseAssignment_5_1 )
            {
             before(grammarAccess.getParameterAccess().getBaseAssignment_5_1()); 
            // InternalProjectDSL.g:1137:2: ( rule__Parameter__BaseAssignment_5_1 )
            // InternalProjectDSL.g:1137:3: rule__Parameter__BaseAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__BaseAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getBaseAssignment_5_1()); 

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
    // $ANTLR end "rule__Parameter__Group_5__1__Impl"


    // $ANTLR start "rule__RestAPI__NameAssignment_1"
    // InternalProjectDSL.g:1146:1: rule__RestAPI__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RestAPI__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1150:1: ( ( RULE_ID ) )
            // InternalProjectDSL.g:1151:2: ( RULE_ID )
            {
            // InternalProjectDSL.g:1151:2: ( RULE_ID )
            // InternalProjectDSL.g:1152:3: RULE_ID
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
    // InternalProjectDSL.g:1161:1: rule__RestAPI__DeclarationsAssignment_2 : ( ruleDeclaration ) ;
    public final void rule__RestAPI__DeclarationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1165:1: ( ( ruleDeclaration ) )
            // InternalProjectDSL.g:1166:2: ( ruleDeclaration )
            {
            // InternalProjectDSL.g:1166:2: ( ruleDeclaration )
            // InternalProjectDSL.g:1167:3: ruleDeclaration
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
    // InternalProjectDSL.g:1176:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1180:1: ( ( RULE_ID ) )
            // InternalProjectDSL.g:1181:2: ( RULE_ID )
            {
            // InternalProjectDSL.g:1181:2: ( RULE_ID )
            // InternalProjectDSL.g:1182:3: RULE_ID
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


    // $ANTLR start "rule__Entity__CtrlrAssignment_3"
    // InternalProjectDSL.g:1191:1: rule__Entity__CtrlrAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__CtrlrAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1195:1: ( ( ( RULE_ID ) ) )
            // InternalProjectDSL.g:1196:2: ( ( RULE_ID ) )
            {
            // InternalProjectDSL.g:1196:2: ( ( RULE_ID ) )
            // InternalProjectDSL.g:1197:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getCtrlrControllerCrossReference_3_0()); 
            // InternalProjectDSL.g:1198:3: ( RULE_ID )
            // InternalProjectDSL.g:1199:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getCtrlrControllerIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getCtrlrControllerIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getCtrlrControllerCrossReference_3_0()); 

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
    // $ANTLR end "rule__Entity__CtrlrAssignment_3"


    // $ANTLR start "rule__Entity__ParametersAssignment_5"
    // InternalProjectDSL.g:1210:1: rule__Entity__ParametersAssignment_5 : ( ruleParameter ) ;
    public final void rule__Entity__ParametersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1214:1: ( ( ruleParameter ) )
            // InternalProjectDSL.g:1215:2: ( ruleParameter )
            {
            // InternalProjectDSL.g:1215:2: ( ruleParameter )
            // InternalProjectDSL.g:1216:3: ruleParameter
            {
             before(grammarAccess.getEntityAccess().getParametersParameterParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getParametersParameterParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Entity__ParametersAssignment_5"


    // $ANTLR start "rule__Controller__NameAssignment_1"
    // InternalProjectDSL.g:1225:1: rule__Controller__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Controller__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1229:1: ( ( RULE_ID ) )
            // InternalProjectDSL.g:1230:2: ( RULE_ID )
            {
            // InternalProjectDSL.g:1230:2: ( RULE_ID )
            // InternalProjectDSL.g:1231:3: RULE_ID
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
    // InternalProjectDSL.g:1240:1: rule__Controller__BaseAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Controller__BaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1244:1: ( ( ( RULE_ID ) ) )
            // InternalProjectDSL.g:1245:2: ( ( RULE_ID ) )
            {
            // InternalProjectDSL.g:1245:2: ( ( RULE_ID ) )
            // InternalProjectDSL.g:1246:3: ( RULE_ID )
            {
             before(grammarAccess.getControllerAccess().getBaseEntityCrossReference_3_0()); 
            // InternalProjectDSL.g:1247:3: ( RULE_ID )
            // InternalProjectDSL.g:1248:4: RULE_ID
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
    // InternalProjectDSL.g:1259:1: rule__Controller__BaseAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Controller__BaseAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1263:1: ( ( ( RULE_ID ) ) )
            // InternalProjectDSL.g:1264:2: ( ( RULE_ID ) )
            {
            // InternalProjectDSL.g:1264:2: ( ( RULE_ID ) )
            // InternalProjectDSL.g:1265:3: ( RULE_ID )
            {
             before(grammarAccess.getControllerAccess().getBaseEntityCrossReference_4_1_0()); 
            // InternalProjectDSL.g:1266:3: ( RULE_ID )
            // InternalProjectDSL.g:1267:4: RULE_ID
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
    // InternalProjectDSL.g:1278:1: rule__Controller__EndpointAssignment_6_1 : ( ruleEndpoint ) ;
    public final void rule__Controller__EndpointAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1282:1: ( ( ruleEndpoint ) )
            // InternalProjectDSL.g:1283:2: ( ruleEndpoint )
            {
            // InternalProjectDSL.g:1283:2: ( ruleEndpoint )
            // InternalProjectDSL.g:1284:3: ruleEndpoint
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


    // $ANTLR start "rule__Endpoint__EndpointAssignment"
    // InternalProjectDSL.g:1293:1: rule__Endpoint__EndpointAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Endpoint__EndpointAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1297:1: ( ( ( RULE_ID ) ) )
            // InternalProjectDSL.g:1298:2: ( ( RULE_ID ) )
            {
            // InternalProjectDSL.g:1298:2: ( ( RULE_ID ) )
            // InternalProjectDSL.g:1299:3: ( RULE_ID )
            {
             before(grammarAccess.getEndpointAccess().getEndpointParameterCrossReference_0()); 
            // InternalProjectDSL.g:1300:3: ( RULE_ID )
            // InternalProjectDSL.g:1301:4: RULE_ID
            {
             before(grammarAccess.getEndpointAccess().getEndpointParameterIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEndpointAccess().getEndpointParameterIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getEndpointAccess().getEndpointParameterCrossReference_0()); 

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
    // $ANTLR end "rule__Endpoint__EndpointAssignment"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // InternalProjectDSL.g:1312:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1316:1: ( ( RULE_ID ) )
            // InternalProjectDSL.g:1317:2: ( RULE_ID )
            {
            // InternalProjectDSL.g:1317:2: ( RULE_ID )
            // InternalProjectDSL.g:1318:3: RULE_ID
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


    // $ANTLR start "rule__Parameter__DataTypeAssignment_2"
    // InternalProjectDSL.g:1327:1: rule__Parameter__DataTypeAssignment_2 : ( RULE_ID ) ;
    public final void rule__Parameter__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1331:1: ( ( RULE_ID ) )
            // InternalProjectDSL.g:1332:2: ( RULE_ID )
            {
            // InternalProjectDSL.g:1332:2: ( RULE_ID )
            // InternalProjectDSL.g:1333:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getDataTypeIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getDataTypeIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Parameter__DataTypeAssignment_2"


    // $ANTLR start "rule__Parameter__TypeAssignment_4"
    // InternalProjectDSL.g:1342:1: rule__Parameter__TypeAssignment_4 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1346:1: ( ( ruleType ) )
            // InternalProjectDSL.g:1347:2: ( ruleType )
            {
            // InternalProjectDSL.g:1347:2: ( ruleType )
            // InternalProjectDSL.g:1348:3: ruleType
            {
             before(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Parameter__TypeAssignment_4"


    // $ANTLR start "rule__Parameter__BaseAssignment_5_1"
    // InternalProjectDSL.g:1357:1: rule__Parameter__BaseAssignment_5_1 : ( ruleRedirect ) ;
    public final void rule__Parameter__BaseAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1361:1: ( ( ruleRedirect ) )
            // InternalProjectDSL.g:1362:2: ( ruleRedirect )
            {
            // InternalProjectDSL.g:1362:2: ( ruleRedirect )
            // InternalProjectDSL.g:1363:3: ruleRedirect
            {
             before(grammarAccess.getParameterAccess().getBaseRedirectParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRedirect();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getBaseRedirectParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Parameter__BaseAssignment_5_1"


    // $ANTLR start "rule__Redirect__NameAssignment_0"
    // InternalProjectDSL.g:1372:1: rule__Redirect__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Redirect__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1376:1: ( ( ( RULE_ID ) ) )
            // InternalProjectDSL.g:1377:2: ( ( RULE_ID ) )
            {
            // InternalProjectDSL.g:1377:2: ( ( RULE_ID ) )
            // InternalProjectDSL.g:1378:3: ( RULE_ID )
            {
             before(grammarAccess.getRedirectAccess().getNameControllerCrossReference_0_0()); 
            // InternalProjectDSL.g:1379:3: ( RULE_ID )
            // InternalProjectDSL.g:1380:4: RULE_ID
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
    // InternalProjectDSL.g:1391:1: rule__Redirect__UrlAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Redirect__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectDSL.g:1395:1: ( ( RULE_STRING ) )
            // InternalProjectDSL.g:1396:2: ( RULE_STRING )
            {
            // InternalProjectDSL.g:1396:2: ( RULE_STRING )
            // InternalProjectDSL.g:1397:3: RULE_STRING
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000044002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000030L});

}