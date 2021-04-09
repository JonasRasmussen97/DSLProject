/*
 * generated by Xtext 2.24.0
 */
grammar InternalProjectDSL;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleRestAPI
entryRuleRestAPI
:
{ before(grammarAccess.getRestAPIRule()); }
	 ruleRestAPI
{ after(grammarAccess.getRestAPIRule()); } 
	 EOF 
;

// Rule RestAPI
ruleRestAPI 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRestAPIAccess().getGroup()); }
		(rule__RestAPI__Group__0)
		{ after(grammarAccess.getRestAPIAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDeclaration
entryRuleDeclaration
:
{ before(grammarAccess.getDeclarationRule()); }
	 ruleDeclaration
{ after(grammarAccess.getDeclarationRule()); } 
	 EOF 
;

// Rule Declaration
ruleDeclaration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDeclarationAccess().getAlternatives()); }
		(rule__Declaration__Alternatives)
		{ after(grammarAccess.getDeclarationAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntity
entryRuleEntity
:
{ before(grammarAccess.getEntityRule()); }
	 ruleEntity
{ after(grammarAccess.getEntityRule()); } 
	 EOF 
;

// Rule Entity
ruleEntity 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityAccess().getGroup()); }
		(rule__Entity__Group__0)
		{ after(grammarAccess.getEntityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleController
entryRuleController
:
{ before(grammarAccess.getControllerRule()); }
	 ruleController
{ after(grammarAccess.getControllerRule()); } 
	 EOF 
;

// Rule Controller
ruleController 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getControllerAccess().getGroup()); }
		(rule__Controller__Group__0)
		{ after(grammarAccess.getControllerAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEndpoint
entryRuleEndpoint
:
{ before(grammarAccess.getEndpointRule()); }
	 ruleEndpoint
{ after(grammarAccess.getEndpointRule()); } 
	 EOF 
;

// Rule Endpoint
ruleEndpoint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEndpointAccess().getEndpointAssignment()); }
		(rule__Endpoint__EndpointAssignment)
		{ after(grammarAccess.getEndpointAccess().getEndpointAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParameter
entryRuleParameter
:
{ before(grammarAccess.getParameterRule()); }
	 ruleParameter
{ after(grammarAccess.getParameterRule()); } 
	 EOF 
;

// Rule Parameter
ruleParameter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParameterAccess().getGroup()); }
		(rule__Parameter__Group__0)
		{ after(grammarAccess.getParameterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRedirect
entryRuleRedirect
:
{ before(grammarAccess.getRedirectRule()); }
	 ruleRedirect
{ after(grammarAccess.getRedirectRule()); } 
	 EOF 
;

// Rule Redirect
ruleRedirect 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRedirectAccess().getAlternatives()); }
		(rule__Redirect__Alternatives)
		{ after(grammarAccess.getRedirectAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleType
entryRuleType
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeAccess().getAlternatives()); }
		(rule__Type__Alternatives)
		{ after(grammarAccess.getTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Declaration__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDeclarationAccess().getEntityParserRuleCall_0()); }
		ruleEntity
		{ after(grammarAccess.getDeclarationAccess().getEntityParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDeclarationAccess().getControllerParserRuleCall_1()); }
		ruleController
		{ after(grammarAccess.getDeclarationAccess().getControllerParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Redirect__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRedirectAccess().getNameAssignment_0()); }
		(rule__Redirect__NameAssignment_0)
		{ after(grammarAccess.getRedirectAccess().getNameAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getRedirectAccess().getUrlAssignment_1()); }
		(rule__Redirect__UrlAssignment_1)
		{ after(grammarAccess.getRedirectAccess().getUrlAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getCKeyword_0()); }
		'C'
		{ after(grammarAccess.getTypeAccess().getCKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getRKeyword_1()); }
		'R'
		{ after(grammarAccess.getTypeAccess().getRKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getUKeyword_2()); }
		'U'
		{ after(grammarAccess.getTypeAccess().getUKeyword_2()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getDKeyword_3()); }
		'D'
		{ after(grammarAccess.getTypeAccess().getDKeyword_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RestAPI__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RestAPI__Group__0__Impl
	rule__RestAPI__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RestAPI__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRestAPIAccess().getSystemKeyword_0()); }
	'system'
	{ after(grammarAccess.getRestAPIAccess().getSystemKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RestAPI__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RestAPI__Group__1__Impl
	rule__RestAPI__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RestAPI__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRestAPIAccess().getNameAssignment_1()); }
	(rule__RestAPI__NameAssignment_1)
	{ after(grammarAccess.getRestAPIAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RestAPI__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RestAPI__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RestAPI__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRestAPIAccess().getDeclarationsAssignment_2()); }
	(rule__RestAPI__DeclarationsAssignment_2)*
	{ after(grammarAccess.getRestAPIAccess().getDeclarationsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__0__Impl
	rule__Entity__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getEntityKeyword_0()); }
	'entity'
	{ after(grammarAccess.getEntityAccess().getEntityKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__1__Impl
	rule__Entity__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getNameAssignment_1()); }
	(rule__Entity__NameAssignment_1)
	{ after(grammarAccess.getEntityAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__2__Impl
	rule__Entity__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getRequiresKeyword_2()); }
	'requires'
	{ after(grammarAccess.getEntityAccess().getRequiresKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__3__Impl
	rule__Entity__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getCtrlrAssignment_3()); }
	(rule__Entity__CtrlrAssignment_3)
	{ after(grammarAccess.getEntityAccess().getCtrlrAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__4__Impl
	rule__Entity__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); }
	'{'
	{ after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__5__Impl
	rule__Entity__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getEntityAccess().getParametersAssignment_5()); }
		(rule__Entity__ParametersAssignment_5)
		{ after(grammarAccess.getEntityAccess().getParametersAssignment_5()); }
	)
	(
		{ before(grammarAccess.getEntityAccess().getParametersAssignment_5()); }
		(rule__Entity__ParametersAssignment_5)*
		{ after(grammarAccess.getEntityAccess().getParametersAssignment_5()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Controller__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Controller__Group__0__Impl
	rule__Controller__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Controller__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getControllerAccess().getControllerKeyword_0()); }
	'controller'
	{ after(grammarAccess.getControllerAccess().getControllerKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Controller__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Controller__Group__1__Impl
	rule__Controller__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Controller__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getControllerAccess().getNameAssignment_1()); }
	(rule__Controller__NameAssignment_1)
	{ after(grammarAccess.getControllerAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Controller__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Controller__Group__2__Impl
	rule__Controller__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Controller__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getControllerAccess().getUsesKeyword_2()); }
	'uses'
	{ after(grammarAccess.getControllerAccess().getUsesKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Controller__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Controller__Group__3__Impl
	rule__Controller__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Controller__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getControllerAccess().getBaseAssignment_3()); }
	(rule__Controller__BaseAssignment_3)
	{ after(grammarAccess.getControllerAccess().getBaseAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Controller__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Controller__Group__4__Impl
	rule__Controller__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Controller__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getControllerAccess().getGroup_4()); }
	(rule__Controller__Group_4__0)*
	{ after(grammarAccess.getControllerAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Controller__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Controller__Group__5__Impl
	rule__Controller__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Controller__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_5()); }
	'{'
	{ after(grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Controller__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Controller__Group__6__Impl
	rule__Controller__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Controller__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getControllerAccess().getGroup_6()); }
		(rule__Controller__Group_6__0)
		{ after(grammarAccess.getControllerAccess().getGroup_6()); }
	)
	(
		{ before(grammarAccess.getControllerAccess().getGroup_6()); }
		(rule__Controller__Group_6__0)*
		{ after(grammarAccess.getControllerAccess().getGroup_6()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Controller__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Controller__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Controller__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Controller__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Controller__Group_4__0__Impl
	rule__Controller__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Controller__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getControllerAccess().getCommaKeyword_4_0()); }
	','
	{ after(grammarAccess.getControllerAccess().getCommaKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Controller__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Controller__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Controller__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getControllerAccess().getBaseAssignment_4_1()); }
	(rule__Controller__BaseAssignment_4_1)
	{ after(grammarAccess.getControllerAccess().getBaseAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Controller__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Controller__Group_6__0__Impl
	rule__Controller__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Controller__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getControllerAccess().getMakeKeyword_6_0()); }
	'make'
	{ after(grammarAccess.getControllerAccess().getMakeKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Controller__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Controller__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Controller__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getControllerAccess().getEndpointAssignment_6_1()); }
	(rule__Controller__EndpointAssignment_6_1)
	{ after(grammarAccess.getControllerAccess().getEndpointAssignment_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Parameter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parameter__Group__0__Impl
	rule__Parameter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterAccess().getNameAssignment_0()); }
	(rule__Parameter__NameAssignment_0)
	{ after(grammarAccess.getParameterAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parameter__Group__1__Impl
	rule__Parameter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getParameterAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parameter__Group__2__Impl
	rule__Parameter__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getParameterAccess().getTypeAssignment_2()); }
		(rule__Parameter__TypeAssignment_2)
		{ after(grammarAccess.getParameterAccess().getTypeAssignment_2()); }
	)
	(
		{ before(grammarAccess.getParameterAccess().getTypeAssignment_2()); }
		(rule__Parameter__TypeAssignment_2)*
		{ after(grammarAccess.getParameterAccess().getTypeAssignment_2()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parameter__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterAccess().getGroup_3()); }
	(rule__Parameter__Group_3__0)?
	{ after(grammarAccess.getParameterAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Parameter__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parameter__Group_3__0__Impl
	rule__Parameter__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterAccess().getRedirectKeyword_3_0()); }
	'redirect'
	{ after(grammarAccess.getParameterAccess().getRedirectKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parameter__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterAccess().getBaseAssignment_3_1()); }
	(rule__Parameter__BaseAssignment_3_1)
	{ after(grammarAccess.getParameterAccess().getBaseAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RestAPI__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRestAPIAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getRestAPIAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RestAPI__DeclarationsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRestAPIAccess().getDeclarationsDeclarationParserRuleCall_2_0()); }
		ruleDeclaration
		{ after(grammarAccess.getRestAPIAccess().getDeclarationsDeclarationParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__CtrlrAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getCtrlrControllerCrossReference_3_0()); }
		(
			{ before(grammarAccess.getEntityAccess().getCtrlrControllerIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getEntityAccess().getCtrlrControllerIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getEntityAccess().getCtrlrControllerCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__ParametersAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getParametersParameterParserRuleCall_5_0()); }
		ruleParameter
		{ after(grammarAccess.getEntityAccess().getParametersParameterParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Controller__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getControllerAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getControllerAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Controller__BaseAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getControllerAccess().getBaseEntityCrossReference_3_0()); }
		(
			{ before(grammarAccess.getControllerAccess().getBaseEntityIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getControllerAccess().getBaseEntityIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getControllerAccess().getBaseEntityCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Controller__BaseAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getControllerAccess().getBaseEntityCrossReference_4_1_0()); }
		(
			{ before(grammarAccess.getControllerAccess().getBaseEntityIDTerminalRuleCall_4_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getControllerAccess().getBaseEntityIDTerminalRuleCall_4_1_0_1()); }
		)
		{ after(grammarAccess.getControllerAccess().getBaseEntityCrossReference_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Controller__EndpointAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getControllerAccess().getEndpointEndpointParserRuleCall_6_1_0()); }
		ruleEndpoint
		{ after(grammarAccess.getControllerAccess().getEndpointEndpointParserRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Endpoint__EndpointAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEndpointAccess().getEndpointParameterCrossReference_0()); }
		(
			{ before(grammarAccess.getEndpointAccess().getEndpointParameterIDTerminalRuleCall_0_1()); }
			RULE_ID
			{ after(grammarAccess.getEndpointAccess().getEndpointParameterIDTerminalRuleCall_0_1()); }
		)
		{ after(grammarAccess.getEndpointAccess().getEndpointParameterCrossReference_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__TypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_2_0()); }
		ruleType
		{ after(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__BaseAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterAccess().getBaseRedirectParserRuleCall_3_1_0()); }
		ruleRedirect
		{ after(grammarAccess.getParameterAccess().getBaseRedirectParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Redirect__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRedirectAccess().getNameControllerCrossReference_0_0()); }
		(
			{ before(grammarAccess.getRedirectAccess().getNameControllerIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getRedirectAccess().getNameControllerIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getRedirectAccess().getNameControllerCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Redirect__UrlAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRedirectAccess().getUrlSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getRedirectAccess().getUrlSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
