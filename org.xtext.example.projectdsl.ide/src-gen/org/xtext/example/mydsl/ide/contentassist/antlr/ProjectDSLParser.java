/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalProjectDSLParser;
import org.xtext.example.mydsl.services.ProjectDSLGrammarAccess;

public class ProjectDSLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ProjectDSLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ProjectDSLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDeclarationAccess().getAlternatives(), "rule__Declaration__Alternatives");
			builder.put(grammarAccess.getParameterAccess().getOpAlternatives_5_2_0(), "rule__Parameter__OpAlternatives_5_2_0");
			builder.put(grammarAccess.getRedirectAccess().getAlternatives(), "rule__Redirect__Alternatives");
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getMathTypeAccess().getAlternatives(), "rule__MathType__Alternatives");
			builder.put(grammarAccess.getExpAccess().getAlternatives_1_0(), "rule__Exp__Alternatives_1_0");
			builder.put(grammarAccess.getMulOrDivAccess().getAlternatives_1_0(), "rule__MulOrDiv__Alternatives_1_0");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getRestAPIAccess().getGroup(), "rule__RestAPI__Group__0");
			builder.put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
			builder.put(grammarAccess.getControllerAccess().getGroup(), "rule__Controller__Group__0");
			builder.put(grammarAccess.getControllerAccess().getGroup_4(), "rule__Controller__Group_4__0");
			builder.put(grammarAccess.getControllerAccess().getGroup_6(), "rule__Controller__Group_6__0");
			builder.put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_5(), "rule__Parameter__Group_5__0");
			builder.put(grammarAccess.getExpAccess().getGroup(), "rule__Exp__Group__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1(), "rule__Exp__Group_1__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1_0_0(), "rule__Exp__Group_1_0_0__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1_0_1(), "rule__Exp__Group_1_0_1__0");
			builder.put(grammarAccess.getMulOrDivAccess().getGroup(), "rule__MulOrDiv__Group__0");
			builder.put(grammarAccess.getMulOrDivAccess().getGroup_1(), "rule__MulOrDiv__Group_1__0");
			builder.put(grammarAccess.getMulOrDivAccess().getGroup_1_0_0(), "rule__MulOrDiv__Group_1_0_0__0");
			builder.put(grammarAccess.getMulOrDivAccess().getGroup_1_0_1(), "rule__MulOrDiv__Group_1_0_1__0");
			builder.put(grammarAccess.getParenthesisAccess().getGroup(), "rule__Parenthesis__Group__0");
			builder.put(grammarAccess.getNumberAccess().getGroup(), "rule__Number__Group__0");
			builder.put(grammarAccess.getRestAPIAccess().getNameAssignment_1(), "rule__RestAPI__NameAssignment_1");
			builder.put(grammarAccess.getRestAPIAccess().getDeclarationsAssignment_2(), "rule__RestAPI__DeclarationsAssignment_2");
			builder.put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
			builder.put(grammarAccess.getEntityAccess().getCtrlrAssignment_3(), "rule__Entity__CtrlrAssignment_3");
			builder.put(grammarAccess.getEntityAccess().getParametersAssignment_5(), "rule__Entity__ParametersAssignment_5");
			builder.put(grammarAccess.getControllerAccess().getNameAssignment_1(), "rule__Controller__NameAssignment_1");
			builder.put(grammarAccess.getControllerAccess().getBaseAssignment_3(), "rule__Controller__BaseAssignment_3");
			builder.put(grammarAccess.getControllerAccess().getBaseAssignment_4_1(), "rule__Controller__BaseAssignment_4_1");
			builder.put(grammarAccess.getControllerAccess().getEndpointAssignment_6_1(), "rule__Controller__EndpointAssignment_6_1");
			builder.put(grammarAccess.getEndpointAccess().getEndpointAssignment(), "rule__Endpoint__EndpointAssignment");
			builder.put(grammarAccess.getParameterAccess().getNameAssignment_0(), "rule__Parameter__NameAssignment_0");
			builder.put(grammarAccess.getParameterAccess().getDataTypeAssignment_2(), "rule__Parameter__DataTypeAssignment_2");
			builder.put(grammarAccess.getParameterAccess().getTypeAssignment_4(), "rule__Parameter__TypeAssignment_4");
			builder.put(grammarAccess.getParameterAccess().getLeftAssignment_5_1(), "rule__Parameter__LeftAssignment_5_1");
			builder.put(grammarAccess.getParameterAccess().getOpAssignment_5_2(), "rule__Parameter__OpAssignment_5_2");
			builder.put(grammarAccess.getParameterAccess().getRightAssignment_5_3(), "rule__Parameter__RightAssignment_5_3");
			builder.put(grammarAccess.getParameterAccess().getMathTypeAssignment_5_4(), "rule__Parameter__MathTypeAssignment_5_4");
			builder.put(grammarAccess.getParameterAccess().getMathAssignment_5_5(), "rule__Parameter__MathAssignment_5_5");
			builder.put(grammarAccess.getRedirectAccess().getNameAssignment_0(), "rule__Redirect__NameAssignment_0");
			builder.put(grammarAccess.getRedirectAccess().getUrlAssignment_1(), "rule__Redirect__UrlAssignment_1");
			builder.put(grammarAccess.getMathExpAccess().getExpAssignment(), "rule__MathExp__ExpAssignment");
			builder.put(grammarAccess.getExpAccess().getRightAssignment_1_1(), "rule__Exp__RightAssignment_1_1");
			builder.put(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1(), "rule__MulOrDiv__RightAssignment_1_1");
			builder.put(grammarAccess.getNumberAccess().getValueAssignment_1(), "rule__Number__ValueAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ProjectDSLGrammarAccess grammarAccess;

	@Override
	protected InternalProjectDSLParser createParser() {
		InternalProjectDSLParser result = new InternalProjectDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ProjectDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ProjectDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
