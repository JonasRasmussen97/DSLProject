/*
 * generated by Xtext 2.24.0
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
		otherlv_2='requires'
		{
			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getRequiresKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getCtrlrControllerCrossReference_3_0());
				}
			)
		)
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityAccess().getParametersParameterParserRuleCall_5_0());
				}
				lv_parameters_5_0=ruleParameter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityRule());
					}
					add(
						$current,
						"parameters",
						lv_parameters_5_0,
						"org.xtext.example.mydsl.ProjectDSL.Parameter");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6());
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
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getEqualsSignKeyword_1());
		}
		(
			(
				lv_dataType_2_0=RULE_ID
				{
					newLeafNode(lv_dataType_2_0, grammarAccess.getParameterAccess().getDataTypeIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParameterRule());
					}
					setWithLastConsumed(
						$current,
						"dataType",
						lv_dataType_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getColonKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_4_0());
				}
				lv_type_4_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParameterRule());
					}
					add(
						$current,
						"type",
						lv_type_4_0,
						"org.xtext.example.mydsl.ProjectDSL.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			otherlv_5='require'
			{
				newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getRequireKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getParameterAccess().getLeftMathExpParserRuleCall_5_1_0());
					}
					lv_left_6_0=ruleMathExp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getParameterRule());
						}
						set(
							$current,
							"left",
							lv_left_6_0,
							"org.xtext.example.mydsl.ProjectDSL.MathExp");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					(
						lv_op_7_1='>='
						{
							newLeafNode(lv_op_7_1, grammarAccess.getParameterAccess().getOpGreaterThanSignEqualsSignKeyword_5_2_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getParameterRule());
							}
							setWithLastConsumed($current, "op", lv_op_7_1, null);
						}
						    |
						lv_op_7_2='<='
						{
							newLeafNode(lv_op_7_2, grammarAccess.getParameterAccess().getOpLessThanSignEqualsSignKeyword_5_2_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getParameterRule());
							}
							setWithLastConsumed($current, "op", lv_op_7_2, null);
						}
						    |
						lv_op_7_3='>'
						{
							newLeafNode(lv_op_7_3, grammarAccess.getParameterAccess().getOpGreaterThanSignKeyword_5_2_0_2());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getParameterRule());
							}
							setWithLastConsumed($current, "op", lv_op_7_3, null);
						}
						    |
						lv_op_7_4='<'
						{
							newLeafNode(lv_op_7_4, grammarAccess.getParameterAccess().getOpLessThanSignKeyword_5_2_0_3());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getParameterRule());
							}
							setWithLastConsumed($current, "op", lv_op_7_4, null);
						}
						    |
						lv_op_7_5='=='
						{
							newLeafNode(lv_op_7_5, grammarAccess.getParameterAccess().getOpEqualsSignEqualsSignKeyword_5_2_0_4());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getParameterRule());
							}
							setWithLastConsumed($current, "op", lv_op_7_5, null);
						}
						    |
						lv_op_7_6='=!'
						{
							newLeafNode(lv_op_7_6, grammarAccess.getParameterAccess().getOpEqualsSignExclamationMarkKeyword_5_2_0_5());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getParameterRule());
							}
							setWithLastConsumed($current, "op", lv_op_7_6, null);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getParameterAccess().getRightMathExpParserRuleCall_5_3_0());
					}
					lv_right_8_0=ruleMathExp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getParameterRule());
						}
						set(
							$current,
							"right",
							lv_right_8_0,
							"org.xtext.example.mydsl.ProjectDSL.MathExp");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
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
		kw='R'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getRKeyword_0());
		}
		    |
		kw='U'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getUKeyword_1());
		}
	)
;

// Entry rule entryRuleMathExp
entryRuleMathExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMathExpRule()); }
	iv_ruleMathExp=ruleMathExp
	{ $current=$iv_ruleMathExp.current; }
	EOF;

// Rule MathExp
ruleMathExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_0());
			}
			lv_exp_0_0=ruleExp
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getMathExpRule());
				}
				set(
					$current,
					"exp",
					lv_exp_0_0,
					"org.xtext.example.mydsl.ProjectDSL.Exp");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleExp
entryRuleExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpRule()); }
	iv_ruleExp=ruleExp
	{ $current=$iv_ruleExp.current; }
	EOF;

// Rule Exp
ruleExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExpAccess().getMulOrDivParserRuleCall_0());
		}
		this_MulOrDiv_0=ruleMulOrDiv
		{
			$current = $this_MulOrDiv_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					otherlv_1='+'
					{
						newLeafNode(otherlv_1, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0());
					}
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_1(),
								$current);
						}
					)
				)
				    |
				(
					otherlv_3='-'
					{
						newLeafNode(otherlv_3, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0());
					}
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_1(),
								$current);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExpAccess().getRightMulOrDivParserRuleCall_1_1_0());
					}
					lv_right_5_0=ruleMulOrDiv
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpRule());
						}
						set(
							$current,
							"right",
							lv_right_5_0,
							"org.xtext.example.mydsl.ProjectDSL.MulOrDiv");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMulOrDiv
entryRuleMulOrDiv returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMulOrDivRule()); }
	iv_ruleMulOrDiv=ruleMulOrDiv
	{ $current=$iv_ruleMulOrDiv.current; }
	EOF;

// Rule MulOrDiv
ruleMulOrDiv returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
		}
		this_Primary_0=rulePrimary
		{
			$current = $this_Primary_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					otherlv_1='*'
					{
						newLeafNode(otherlv_1, grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_0());
					}
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getMulOrDivAccess().getMultLeftAction_1_0_0_1(),
								$current);
						}
					)
				)
				    |
				(
					otherlv_3='/'
					{
						newLeafNode(otherlv_3, grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_0());
					}
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getMulOrDivAccess().getDivLeftAction_1_0_1_1(),
								$current);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_1_0());
					}
					lv_right_5_0=rulePrimary
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMulOrDivRule());
						}
						set(
							$current,
							"right",
							lv_right_5_0,
							"org.xtext.example.mydsl.ProjectDSL.Primary");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePrimary
entryRulePrimary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryRule()); }
	iv_rulePrimary=rulePrimary
	{ $current=$iv_rulePrimary.current; }
	EOF;

// Rule Primary
rulePrimary returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0());
		}
		this_Number_0=ruleNumber
		{
			$current = $this_Number_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
		}
		this_Parenthesis_1=ruleParenthesis
		{
			$current = $this_Parenthesis_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getParamParserRuleCall_2());
		}
		this_Param_2=ruleParam
		{
			$current = $this_Param_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleParam
entryRuleParam returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParamRule()); }
	iv_ruleParam=ruleParam
	{ $current=$iv_ruleParam.current; }
	EOF;

// Rule Param
ruleParam returns [EObject current=null]
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
					$current = createModelElement(grammarAccess.getParamRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getParamAccess().getValueParameterCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleParenthesis
entryRuleParenthesis returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParenthesisRule()); }
	iv_ruleParenthesis=ruleParenthesis
	{ $current=$iv_ruleParenthesis.current; }
	EOF;

// Rule Parenthesis
ruleParenthesis returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getParenthesisAccess().getExpParserRuleCall_1());
		}
		this_Exp_1=ruleExp
		{
			$current = $this_Exp_1.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
		}
	)
;

// Entry rule entryRuleNumber
entryRuleNumber returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNumberRule()); }
	iv_ruleNumber=ruleNumber
	{ $current=$iv_ruleNumber.current; }
	EOF;

// Rule Number
ruleNumber returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getNumberAccess().getNumAction_0(),
					$current);
			}
		)
		(
			(
				lv_value_1_0=RULE_INT
				{
					newLeafNode(lv_value_1_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNumberRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
