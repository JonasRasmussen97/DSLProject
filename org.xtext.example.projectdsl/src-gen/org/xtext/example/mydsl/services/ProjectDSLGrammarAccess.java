/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ProjectDSLGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class RestAPIElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.ProjectDSL.RestAPI");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSystemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cDeclarationsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDeclarationsDeclarationParserRuleCall_2_0 = (RuleCall)cDeclarationsAssignment_2.eContents().get(0);
		
		//RestAPI:
		//	'system' name=ID declarations+=Declaration*;
		@Override public ParserRule getRule() { return rule; }
		
		//'system' name=ID declarations+=Declaration*
		public Group getGroup() { return cGroup; }
		
		//'system'
		public Keyword getSystemKeyword_0() { return cSystemKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//declarations+=Declaration*
		public Assignment getDeclarationsAssignment_2() { return cDeclarationsAssignment_2; }
		
		//Declaration
		public RuleCall getDeclarationsDeclarationParserRuleCall_2_0() { return cDeclarationsDeclarationParserRuleCall_2_0; }
	}
	public class DeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.ProjectDSL.Declaration");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEntityParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cControllerParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//// Keeps a track of which elements are allowed to be created.
		//Declaration:
		//	Entity | Controller;
		@Override public ParserRule getRule() { return rule; }
		
		//Entity | Controller
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Entity
		public RuleCall getEntityParserRuleCall_0() { return cEntityParserRuleCall_0; }
		
		//Controller
		public RuleCall getControllerParserRuleCall_1() { return cControllerParserRuleCall_1; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.ProjectDSL.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cParametersAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cParametersParameterParserRuleCall_3_0 = (RuleCall)cParametersAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Entity:
		//	'entity' name=ID '{' parameters+=Parameter+ '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'entity' name=ID '{' parameters+=Parameter+ '}'
		public Group getGroup() { return cGroup; }
		
		//'entity'
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//parameters+=Parameter+
		public Assignment getParametersAssignment_3() { return cParametersAssignment_3; }
		
		//Parameter
		public RuleCall getParametersParameterParserRuleCall_3_0() { return cParametersParameterParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class ControllerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.ProjectDSL.Controller");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cControllerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cUsesKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cBaseAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cBaseEntityCrossReference_3_0 = (CrossReference)cBaseAssignment_3.eContents().get(0);
		private final RuleCall cBaseEntityIDTerminalRuleCall_3_0_1 = (RuleCall)cBaseEntityCrossReference_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cBaseAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cBaseEntityCrossReference_4_1_0 = (CrossReference)cBaseAssignment_4_1.eContents().get(0);
		private final RuleCall cBaseEntityIDTerminalRuleCall_4_1_0_1 = (RuleCall)cBaseEntityCrossReference_4_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cMakeKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cEndpointAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cEndpointEndpointParserRuleCall_6_1_0 = (RuleCall)cEndpointAssignment_6_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//// Example of syntax: controller Weather uses Entity1, Entity {make Weather}
		//Controller:
		//	'controller' name=ID 'uses' base+=[Entity] (',' base+=[Entity])* '{' ('make' endpoint+=Endpoint)+ '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'controller' name=ID 'uses' base+=[Entity] (',' base+=[Entity])* '{' ('make' endpoint+=Endpoint)+ '}'
		public Group getGroup() { return cGroup; }
		
		//'controller'
		public Keyword getControllerKeyword_0() { return cControllerKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'uses'
		public Keyword getUsesKeyword_2() { return cUsesKeyword_2; }
		
		//base+=[Entity]
		public Assignment getBaseAssignment_3() { return cBaseAssignment_3; }
		
		//[Entity]
		public CrossReference getBaseEntityCrossReference_3_0() { return cBaseEntityCrossReference_3_0; }
		
		//ID
		public RuleCall getBaseEntityIDTerminalRuleCall_3_0_1() { return cBaseEntityIDTerminalRuleCall_3_0_1; }
		
		//(',' base+=[Entity])*
		public Group getGroup_4() { return cGroup_4; }
		
		//','
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }
		
		//base+=[Entity]
		public Assignment getBaseAssignment_4_1() { return cBaseAssignment_4_1; }
		
		//[Entity]
		public CrossReference getBaseEntityCrossReference_4_1_0() { return cBaseEntityCrossReference_4_1_0; }
		
		//ID
		public RuleCall getBaseEntityIDTerminalRuleCall_4_1_0_1() { return cBaseEntityIDTerminalRuleCall_4_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }
		
		//('make' endpoint+=Endpoint)+
		public Group getGroup_6() { return cGroup_6; }
		
		//'make'
		public Keyword getMakeKeyword_6_0() { return cMakeKeyword_6_0; }
		
		//endpoint+=Endpoint
		public Assignment getEndpointAssignment_6_1() { return cEndpointAssignment_6_1; }
		
		//Endpoint
		public RuleCall getEndpointEndpointParserRuleCall_6_1_0() { return cEndpointEndpointParserRuleCall_6_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class EndpointElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.ProjectDSL.Endpoint");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//// Are used for all the endpoints in controllers e.g., make 'Weather' 
		//Endpoint:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class ParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.ProjectDSL.Parameter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeTypeParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cRedirectKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cBaseAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cBaseRedirectParserRuleCall_3_1_0 = (RuleCall)cBaseAssignment_3_1.eContents().get(0);
		
		//Parameter:
		//	name=ID ':' type+=Type+ ('redirect' base=Redirect)?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' type+=Type+ ('redirect' base=Redirect)?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//type+=Type+
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//Type
		public RuleCall getTypeTypeParserRuleCall_2_0() { return cTypeTypeParserRuleCall_2_0; }
		
		//('redirect' base=Redirect)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'redirect'
		public Keyword getRedirectKeyword_3_0() { return cRedirectKeyword_3_0; }
		
		//base=Redirect
		public Assignment getBaseAssignment_3_1() { return cBaseAssignment_3_1; }
		
		//Redirect
		public RuleCall getBaseRedirectParserRuleCall_3_1_0() { return cBaseRedirectParserRuleCall_3_1_0; }
	}
	public class RedirectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.ProjectDSL.Redirect");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final CrossReference cNameControllerCrossReference_0_0 = (CrossReference)cNameAssignment_0.eContents().get(0);
		private final RuleCall cNameControllerIDTerminalRuleCall_0_0_1 = (RuleCall)cNameControllerCrossReference_0_0.eContents().get(1);
		private final Assignment cUrlAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cUrlSTRINGTerminalRuleCall_1_0 = (RuleCall)cUrlAssignment_1.eContents().get(0);
		
		//// Redirect can either be a controller reference or a string. 
		//Redirect:
		//	name=[Controller] | url=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//name=[Controller] | url=STRING
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//name=[Controller]
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//[Controller]
		public CrossReference getNameControllerCrossReference_0_0() { return cNameControllerCrossReference_0_0; }
		
		//ID
		public RuleCall getNameControllerIDTerminalRuleCall_0_0_1() { return cNameControllerIDTerminalRuleCall_0_0_1; }
		
		//url=STRING
		public Assignment getUrlAssignment_1() { return cUrlAssignment_1; }
		
		//STRING
		public RuleCall getUrlSTRINGTerminalRuleCall_1_0() { return cUrlSTRINGTerminalRuleCall_1_0; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.ProjectDSL.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cCKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cRKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cUKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cDKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		
		//// Indicates the different CRUD operations. 
		//Type:
		//	'C' | 'R' | 'U' | 'D';
		@Override public ParserRule getRule() { return rule; }
		
		//'C' | 'R' | 'U' | 'D'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'C'
		public Keyword getCKeyword_0() { return cCKeyword_0; }
		
		//'R'
		public Keyword getRKeyword_1() { return cRKeyword_1; }
		
		//'U'
		public Keyword getUKeyword_2() { return cUKeyword_2; }
		
		//'D'
		public Keyword getDKeyword_3() { return cDKeyword_3; }
	}
	
	
	private final RestAPIElements pRestAPI;
	private final DeclarationElements pDeclaration;
	private final EntityElements pEntity;
	private final ControllerElements pController;
	private final EndpointElements pEndpoint;
	private final ParameterElements pParameter;
	private final RedirectElements pRedirect;
	private final TypeElements pType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ProjectDSLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRestAPI = new RestAPIElements();
		this.pDeclaration = new DeclarationElements();
		this.pEntity = new EntityElements();
		this.pController = new ControllerElements();
		this.pEndpoint = new EndpointElements();
		this.pParameter = new ParameterElements();
		this.pRedirect = new RedirectElements();
		this.pType = new TypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.ProjectDSL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//RestAPI:
	//	'system' name=ID declarations+=Declaration*;
	public RestAPIElements getRestAPIAccess() {
		return pRestAPI;
	}
	
	public ParserRule getRestAPIRule() {
		return getRestAPIAccess().getRule();
	}
	
	//// Keeps a track of which elements are allowed to be created.
	//Declaration:
	//	Entity | Controller;
	public DeclarationElements getDeclarationAccess() {
		return pDeclaration;
	}
	
	public ParserRule getDeclarationRule() {
		return getDeclarationAccess().getRule();
	}
	
	//Entity:
	//	'entity' name=ID '{' parameters+=Parameter+ '}';
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//// Example of syntax: controller Weather uses Entity1, Entity {make Weather}
	//Controller:
	//	'controller' name=ID 'uses' base+=[Entity] (',' base+=[Entity])* '{' ('make' endpoint+=Endpoint)+ '}';
	public ControllerElements getControllerAccess() {
		return pController;
	}
	
	public ParserRule getControllerRule() {
		return getControllerAccess().getRule();
	}
	
	//// Are used for all the endpoints in controllers e.g., make 'Weather' 
	//Endpoint:
	//	name=ID;
	public EndpointElements getEndpointAccess() {
		return pEndpoint;
	}
	
	public ParserRule getEndpointRule() {
		return getEndpointAccess().getRule();
	}
	
	//Parameter:
	//	name=ID ':' type+=Type+ ('redirect' base=Redirect)?;
	public ParameterElements getParameterAccess() {
		return pParameter;
	}
	
	public ParserRule getParameterRule() {
		return getParameterAccess().getRule();
	}
	
	//// Redirect can either be a controller reference or a string. 
	//Redirect:
	//	name=[Controller] | url=STRING;
	public RedirectElements getRedirectAccess() {
		return pRedirect;
	}
	
	public ParserRule getRedirectRule() {
		return getRedirectAccess().getRule();
	}
	
	//// Indicates the different CRUD operations. 
	//Type:
	//	'C' | 'R' | 'U' | 'D';
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
