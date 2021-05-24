/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.projectDSL.Controller;
import org.xtext.example.mydsl.projectDSL.Div;
import org.xtext.example.mydsl.projectDSL.Endpoint;
import org.xtext.example.mydsl.projectDSL.Entity;
import org.xtext.example.mydsl.projectDSL.MathExp;
import org.xtext.example.mydsl.projectDSL.Minus;
import org.xtext.example.mydsl.projectDSL.Mult;
import org.xtext.example.mydsl.projectDSL.Num;
import org.xtext.example.mydsl.projectDSL.Param;
import org.xtext.example.mydsl.projectDSL.Plus;
import org.xtext.example.mydsl.projectDSL.ProjectDSLPackage;
import org.xtext.example.mydsl.projectDSL.RestAPI;
import org.xtext.example.mydsl.services.ProjectDSLGrammarAccess;

@SuppressWarnings("all")
public class ProjectDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ProjectDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ProjectDSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ProjectDSLPackage.CONTROLLER:
				sequence_Controller(context, (Controller) semanticObject); 
				return; 
			case ProjectDSLPackage.DIV:
				sequence_MulOrDiv(context, (Div) semanticObject); 
				return; 
			case ProjectDSLPackage.ENDPOINT:
				sequence_Endpoint(context, (Endpoint) semanticObject); 
				return; 
			case ProjectDSLPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case ProjectDSLPackage.MATH_EXP:
				sequence_MathExp(context, (MathExp) semanticObject); 
				return; 
			case ProjectDSLPackage.MINUS:
				sequence_Exp(context, (Minus) semanticObject); 
				return; 
			case ProjectDSLPackage.MULT:
				sequence_MulOrDiv(context, (Mult) semanticObject); 
				return; 
			case ProjectDSLPackage.NUM:
				sequence_Number(context, (Num) semanticObject); 
				return; 
			case ProjectDSLPackage.PARAM:
				sequence_Param(context, (Param) semanticObject); 
				return; 
			case ProjectDSLPackage.PARAMETER:
				sequence_Parameter(context, (org.xtext.example.mydsl.projectDSL.Parameter) semanticObject); 
				return; 
			case ProjectDSLPackage.PLUS:
				sequence_Exp(context, (Plus) semanticObject); 
				return; 
			case ProjectDSLPackage.REST_API:
				sequence_RestAPI(context, (RestAPI) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Declaration returns Controller
	 *     Controller returns Controller
	 *
	 * Constraint:
	 *     (name=ID base+=[Entity|ID] base+=[Entity|ID]* endpoint+=Endpoint+)
	 */
	protected void sequence_Controller(ISerializationContext context, Controller semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Endpoint returns Endpoint
	 *
	 * Constraint:
	 *     endpoint=[Parameter|ID]
	 */
	protected void sequence_Endpoint(ISerializationContext context, Endpoint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProjectDSLPackage.Literals.ENDPOINT__ENDPOINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectDSLPackage.Literals.ENDPOINT__ENDPOINT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEndpointAccess().getEndpointParameterIDTerminalRuleCall_0_1(), semanticObject.eGet(ProjectDSLPackage.Literals.ENDPOINT__ENDPOINT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Entity
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (name=ID parent=[Entity|ID]? ctrlr=[Controller|ID]? parameters+=Parameter+)
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Minus
	 *     Exp.Plus_1_0_0_1 returns Minus
	 *     Exp.Minus_1_0_1_1 returns Minus
	 *     MulOrDiv returns Minus
	 *     MulOrDiv.Mult_1_0_0_1 returns Minus
	 *     MulOrDiv.Div_1_0_1_1 returns Minus
	 *     Primary returns Minus
	 *     Parenthesis returns Minus
	 *
	 * Constraint:
	 *     (left=Exp_Minus_1_0_1_1 right=MulOrDiv)
	 */
	protected void sequence_Exp(ISerializationContext context, Minus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProjectDSLPackage.Literals.MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectDSLPackage.Literals.MINUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, ProjectDSLPackage.Literals.MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectDSLPackage.Literals.MINUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpAccess().getRightMulOrDivParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Plus
	 *     Exp.Plus_1_0_0_1 returns Plus
	 *     Exp.Minus_1_0_1_1 returns Plus
	 *     MulOrDiv returns Plus
	 *     MulOrDiv.Mult_1_0_0_1 returns Plus
	 *     MulOrDiv.Div_1_0_1_1 returns Plus
	 *     Primary returns Plus
	 *     Parenthesis returns Plus
	 *
	 * Constraint:
	 *     (left=Exp_Plus_1_0_0_1 right=MulOrDiv)
	 */
	protected void sequence_Exp(ISerializationContext context, Plus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProjectDSLPackage.Literals.PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectDSLPackage.Literals.PLUS__LEFT));
			if (transientValues.isValueTransient(semanticObject, ProjectDSLPackage.Literals.PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectDSLPackage.Literals.PLUS__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpAccess().getRightMulOrDivParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MathExp returns MathExp
	 *
	 * Constraint:
	 *     exp=Exp
	 */
	protected void sequence_MathExp(ISerializationContext context, MathExp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProjectDSLPackage.Literals.MATH_EXP__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectDSLPackage.Literals.MATH_EXP__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Div
	 *     Exp.Plus_1_0_0_1 returns Div
	 *     Exp.Minus_1_0_1_1 returns Div
	 *     MulOrDiv returns Div
	 *     MulOrDiv.Mult_1_0_0_1 returns Div
	 *     MulOrDiv.Div_1_0_1_1 returns Div
	 *     Primary returns Div
	 *     Parenthesis returns Div
	 *
	 * Constraint:
	 *     (left=MulOrDiv_Div_1_0_1_1 right=Primary)
	 */
	protected void sequence_MulOrDiv(ISerializationContext context, Div semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProjectDSLPackage.Literals.DIV__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectDSLPackage.Literals.DIV__LEFT));
			if (transientValues.isValueTransient(semanticObject, ProjectDSLPackage.Literals.DIV__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectDSLPackage.Literals.DIV__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMulOrDivAccess().getDivLeftAction_1_0_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Mult
	 *     Exp.Plus_1_0_0_1 returns Mult
	 *     Exp.Minus_1_0_1_1 returns Mult
	 *     MulOrDiv returns Mult
	 *     MulOrDiv.Mult_1_0_0_1 returns Mult
	 *     MulOrDiv.Div_1_0_1_1 returns Mult
	 *     Primary returns Mult
	 *     Parenthesis returns Mult
	 *
	 * Constraint:
	 *     (left=MulOrDiv_Mult_1_0_0_1 right=Primary)
	 */
	protected void sequence_MulOrDiv(ISerializationContext context, Mult semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProjectDSLPackage.Literals.MULT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectDSLPackage.Literals.MULT__LEFT));
			if (transientValues.isValueTransient(semanticObject, ProjectDSLPackage.Literals.MULT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectDSLPackage.Literals.MULT__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMulOrDivAccess().getMultLeftAction_1_0_0_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Num
	 *     Exp.Plus_1_0_0_1 returns Num
	 *     Exp.Minus_1_0_1_1 returns Num
	 *     MulOrDiv returns Num
	 *     MulOrDiv.Mult_1_0_0_1 returns Num
	 *     MulOrDiv.Div_1_0_1_1 returns Num
	 *     Primary returns Num
	 *     Parenthesis returns Num
	 *     Number returns Num
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Number(ISerializationContext context, Num semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProjectDSLPackage.Literals.NUM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectDSLPackage.Literals.NUM__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Param
	 *     Exp.Plus_1_0_0_1 returns Param
	 *     Exp.Minus_1_0_1_1 returns Param
	 *     MulOrDiv returns Param
	 *     MulOrDiv.Mult_1_0_0_1 returns Param
	 *     MulOrDiv.Div_1_0_1_1 returns Param
	 *     Primary returns Param
	 *     Param returns Param
	 *     Parenthesis returns Param
	 *
	 * Constraint:
	 *     value=[Parameter|ID]
	 */
	protected void sequence_Param(ISerializationContext context, Param semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProjectDSLPackage.Literals.PARAM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProjectDSLPackage.Literals.PARAM__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParamAccess().getValueParameterIDTerminalRuleCall_0_1(), semanticObject.eGet(ProjectDSLPackage.Literals.PARAM__VALUE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         dataType=ID 
	 *         type+=Type+ 
	 *         (
	 *             left=MathExp 
	 *             (
	 *                 op='>=' | 
	 *                 op='<=' | 
	 *                 op='>' | 
	 *                 op='<' | 
	 *                 op='==' | 
	 *                 op='=!'
	 *             ) 
	 *             right=MathExp
	 *         )?
	 *     )
	 */
	protected void sequence_Parameter(ISerializationContext context, org.xtext.example.mydsl.projectDSL.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RestAPI returns RestAPI
	 *
	 * Constraint:
	 *     (name=ID declarations+=Declaration*)
	 */
	protected void sequence_RestAPI(ISerializationContext context, RestAPI semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
