/*
 * generated by Xtext 2.25.0
 */
grammar InternalProjectDSL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRestAPI
entryRuleRestAPI returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRestAPIRule()); }
	iv_ruleRestAPI=ruleRestAPI
	{ $current=$iv_ruleRestAPI.current; }
	EOF;

// Rule RestAPI
ruleRestAPI returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='system'
		{
			newLeafNode(otherlv_0, grammarAccess.getRestAPIAccess().getSystemKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRestAPIAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRestAPIRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRestAPIAccess().getDeclarationsDeclarationParserRuleCall_2_0());
				}
				lv_declarations_2_0=ruleDeclaration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRestAPIRule());
					}
					add(
						$current,
						"declarations",
						lv_declarations_2_0,
						"org.xtext.example.mydsl.ProjectDSL.Declaration");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleDeclaration
entryRuleDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeclarationRule()); }
	iv_ruleDeclaration=ruleDeclaration
	{ $current=$iv_ruleDeclaration.current; }
	EOF;

// Rule Declaration
ruleDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDeclarationAccess().getEntityParserRuleCall_0());
		}
		this_Entity_0=ruleEntity
		{
			$current = $this_Entity_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDeclarationAccess().getControllerParserRuleCall_1());
		}
		this_Controller_1=ruleController
		{
			$current = $this_Controller_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	iv_ruleEntity=ruleEntity
	{ $current=$iv_ruleEntity.current; }
	EOF;

// Rule Entity
ruleEntity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='entity'
		{
			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityAccess().getParametersParameterParserRuleCall_3_0());
				}
				lv_parameters_3_0=ruleParameter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityRule());
					}
					add(
						$current,
						"parameters",
						lv_parameters_3_0,
						"org.xtext.example.mydsl.ProjectDSL.Parameter");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleController
entryRuleController returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getControllerRule()); }
	iv_ruleController=ruleController
	{ $current=$iv_ruleController.current; }
	EOF;

// Rule Controller
ruleController returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='controller'
		{
			newLeafNode(otherlv_0, grammarAccess.getControllerAccess().getControllerKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getControllerAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getControllerRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='uses'
		{
			newLeafNode(otherlv_2, grammarAccess.getControllerAccess().getUsesKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getControllerRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getControllerAccess().getBaseEntityCrossReference_3_0());
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getControllerAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getControllerRule());
						}
					}
					otherlv_5=RULE_ID
					{
						newLeafNode(otherlv_5, grammarAccess.getControllerAccess().getBaseEntityCrossReference_4_1_0());
					}
				)
			)
		)*
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_5());
		}
		(
			otherlv_7='make'
			{
				newLeafNode(otherlv_7, grammarAccess.getControllerAccess().getMakeKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getControllerAccess().getEndpointEndpointParserRuleCall_6_1_0());
					}
					lv_endpoint_8_0=ruleEndpoint
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getControllerRule());
						}
						add(
							$current,
							"endpoint",
							lv_endpoint_8_0,
							"org.xtext.example.mydsl.ProjectDSL.Endpoint");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)+
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleEndpoint
entryRuleEndpoint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEndpointRule()); }
	iv_ruleEndpoint=ruleEndpoint
	{ $current=$iv_ruleEndpoint.current; }
	EOF;

// Rule Endpoint
ruleEndpoint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getEndpointRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getEndpointAccess().getEndpointParameterCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleParameter
entryRuleParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterRule()); }
	iv_ruleParameter=ruleParameter
	{ $current=$iv_ruleParameter.current; }
	EOF;

// Rule Parameter
ruleParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParameterRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_2_0());
				}
				lv_type_2_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParameterRule());
					}
					add(
						$current,
						"type",
						lv_type_2_0,
						"org.xtext.example.mydsl.ProjectDSL.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			otherlv_3='redirect'
			{
				newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getRedirectKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getParameterAccess().getBaseRedirectParserRuleCall_3_1_0());
					}
					lv_base_4_0=ruleRedirect
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getParameterRule());
						}
						set(
							$current,
							"base",
							lv_base_4_0,
							"org.xtext.example.mydsl.ProjectDSL.Redirect");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleRedirect
entryRuleRedirect returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRedirectRule()); }
	iv_ruleRedirect=ruleRedirect
	{ $current=$iv_ruleRedirect.current; }
	EOF;

// Rule Redirect
ruleRedirect returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRedirectRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getRedirectAccess().getNameControllerCrossReference_0_0());
				}
			)
		)
		    |
		(
			(
				lv_url_1_0=RULE_STRING
				{
					newLeafNode(lv_url_1_0, grammarAccess.getRedirectAccess().getUrlSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRedirectRule());
					}
					setWithLastConsumed(
						$current,
						"url",
						lv_url_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleType
entryRuleType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current.getText(); }
	EOF;

// Rule Type
ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='C'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getCKeyword_0());
		}
		    |
		kw='R'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getRKeyword_1());
		}
		    |
		kw='U'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getUKeyword_2());
		}
		    |
		kw='D'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getDKeyword_3());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
