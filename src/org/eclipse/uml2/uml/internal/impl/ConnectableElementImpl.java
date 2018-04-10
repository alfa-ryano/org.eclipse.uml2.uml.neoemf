/**
 */
package org.eclipse.uml2.uml.internal.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.ConnectableElementTemplateParameter;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.internal.operations.ParameterableElementOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connectable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectableElementImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectableElementImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectableElementImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.internal.impl.ConnectableElementImpl#getEnds <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConnectableElementImpl extends TypedElementImpl implements ConnectableElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CONNECTABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwner() {
		return (Element) eGet(UMLPackage.Literals.ELEMENT__OWNER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getTemplateParameter() {
		return (TemplateParameter) eGet(UMLPackage.Literals.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateParameter(TemplateParameter newTemplateParameter) {
		if (newTemplateParameter != null && !(newTemplateParameter instanceof ConnectableElementTemplateParameter)) {
			throw new IllegalArgumentException(
					"newTemplateParameter must be an instance of ConnectableElementTemplateParameter"); //$NON-NLS-1$
		}
		eSet(UMLPackage.Literals.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER, newTemplateParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTemplateParameter() {
		return eIsSet(UMLPackage.Literals.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningTemplateParameter() {
		return (TemplateParameter) eGet(UMLPackage.Literals.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningTemplateParameter(TemplateParameter newOwningTemplateParameter) {
		eSet(UMLPackage.Literals.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER, newOwningTemplateParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConnectorEnd> getEnds() {
		return (EList<ConnectorEnd>) eGet(UMLPackage.Literals.CONNECTABLE_ELEMENT__END, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompatibleWith(ParameterableElement p) {
		return ParameterableElementOperations.isCompatibleWith(this, p);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemplateParameter() {
		return ParameterableElementOperations.isTemplateParameter(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ParameterableElement.class) {
			switch (derivedFeatureID) {
			case UMLPackage.CONNECTABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER:
				return UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
			case UMLPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER:
				return UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ParameterableElement.class) {
			switch (baseFeatureID) {
			case UMLPackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER:
				return UMLPackage.CONNECTABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
			case UMLPackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER:
				return UMLPackage.CONNECTABLE_ELEMENT__TEMPLATE_PARAMETER;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ParameterableElement.class) {
			switch (baseOperationID) {
			case UMLPackage.PARAMETERABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT:
				return UMLPackage.CONNECTABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;
			case UMLPackage.PARAMETERABLE_ELEMENT___IS_TEMPLATE_PARAMETER:
				return UMLPackage.CONNECTABLE_ELEMENT___IS_TEMPLATE_PARAMETER;
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case UMLPackage.CONNECTABLE_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP:
			return validateHasOwner((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.CONNECTABLE_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP:
			return validateNotOwnSelf((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.CONNECTABLE_ELEMENT___ADD_KEYWORD__STRING:
			return addKeyword((String) arguments.get(0));
		case UMLPackage.CONNECTABLE_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE:
			return applyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.CONNECTABLE_ELEMENT___CREATE_EANNOTATION__STRING:
			return createEAnnotation((String) arguments.get(0));
		case UMLPackage.CONNECTABLE_ELEMENT___DESTROY:
			destroy();
			return null;
		case UMLPackage.CONNECTABLE_ELEMENT___GET_KEYWORDS:
			return getKeywords();
		case UMLPackage.CONNECTABLE_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING:
			return getApplicableStereotype((String) arguments.get(0));
		case UMLPackage.CONNECTABLE_ELEMENT___GET_APPLICABLE_STEREOTYPES:
			return getApplicableStereotypes();
		case UMLPackage.CONNECTABLE_ELEMENT___GET_APPLIED_STEREOTYPE__STRING:
			return getAppliedStereotype((String) arguments.get(0));
		case UMLPackage.CONNECTABLE_ELEMENT___GET_APPLIED_STEREOTYPES:
			return getAppliedStereotypes();
		case UMLPackage.CONNECTABLE_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING:
			return getAppliedSubstereotype((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.CONNECTABLE_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE:
			return getAppliedSubstereotypes((Stereotype) arguments.get(0));
		case UMLPackage.CONNECTABLE_ELEMENT___GET_MODEL:
			return getModel();
		case UMLPackage.CONNECTABLE_ELEMENT___GET_NEAREST_PACKAGE:
			return getNearestPackage();
		case UMLPackage.CONNECTABLE_ELEMENT___GET_RELATIONSHIPS:
			return getRelationships();
		case UMLPackage.CONNECTABLE_ELEMENT___GET_RELATIONSHIPS__ECLASS:
			return getRelationships((EClass) arguments.get(0));
		case UMLPackage.CONNECTABLE_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING:
			return getRequiredStereotype((String) arguments.get(0));
		case UMLPackage.CONNECTABLE_ELEMENT___GET_REQUIRED_STEREOTYPES:
			return getRequiredStereotypes();
		case UMLPackage.CONNECTABLE_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS:
			return getSourceDirectedRelationships();
		case UMLPackage.CONNECTABLE_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS:
			return getSourceDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.CONNECTABLE_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE:
			return getStereotypeApplication((Stereotype) arguments.get(0));
		case UMLPackage.CONNECTABLE_ELEMENT___GET_STEREOTYPE_APPLICATIONS:
			return getStereotypeApplications();
		case UMLPackage.CONNECTABLE_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS:
			return getTargetDirectedRelationships();
		case UMLPackage.CONNECTABLE_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS:
			return getTargetDirectedRelationships((EClass) arguments.get(0));
		case UMLPackage.CONNECTABLE_ELEMENT___GET_VALUE__STEREOTYPE_STRING:
			return getValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.CONNECTABLE_ELEMENT___HAS_KEYWORD__STRING:
			return hasKeyword((String) arguments.get(0));
		case UMLPackage.CONNECTABLE_ELEMENT___HAS_VALUE__STEREOTYPE_STRING:
			return hasValue((Stereotype) arguments.get(0), (String) arguments.get(1));
		case UMLPackage.CONNECTABLE_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE:
			return isStereotypeApplicable((Stereotype) arguments.get(0));
		case UMLPackage.CONNECTABLE_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE:
			return isStereotypeApplied((Stereotype) arguments.get(0));
		case UMLPackage.CONNECTABLE_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE:
			return isStereotypeRequired((Stereotype) arguments.get(0));
		case UMLPackage.CONNECTABLE_ELEMENT___REMOVE_KEYWORD__STRING:
			return removeKeyword((String) arguments.get(0));
		case UMLPackage.CONNECTABLE_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT:
			setValue((Stereotype) arguments.get(0), (String) arguments.get(1), arguments.get(2));
			return null;
		case UMLPackage.CONNECTABLE_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE:
			return unapplyStereotype((Stereotype) arguments.get(0));
		case UMLPackage.CONNECTABLE_ELEMENT___ALL_OWNED_ELEMENTS:
			return allOwnedElements();
		case UMLPackage.CONNECTABLE_ELEMENT___MUST_BE_OWNED:
			return mustBeOwned();
		case UMLPackage.CONNECTABLE_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP:
			return validateVisibilityNeedsOwnership((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.CONNECTABLE_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP:
			return validateHasQualifiedName((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case UMLPackage.CONNECTABLE_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP:
			return validateHasNoQualifiedName((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case UMLPackage.CONNECTABLE_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT:
			return createDependency((NamedElement) arguments.get(0));
		case UMLPackage.CONNECTABLE_ELEMENT___CREATE_USAGE__NAMEDELEMENT:
			return createUsage((NamedElement) arguments.get(0));
		case UMLPackage.CONNECTABLE_ELEMENT___GET_LABEL:
			return getLabel();
		case UMLPackage.CONNECTABLE_ELEMENT___GET_LABEL__BOOLEAN:
			return getLabel((Boolean) arguments.get(0));
		case UMLPackage.CONNECTABLE_ELEMENT___GET_NAMESPACE:
			return getNamespace();
		case UMLPackage.CONNECTABLE_ELEMENT___ALL_NAMESPACES:
			return allNamespaces();
		case UMLPackage.CONNECTABLE_ELEMENT___ALL_OWNING_PACKAGES:
			return allOwningPackages();
		case UMLPackage.CONNECTABLE_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE:
			return isDistinguishableFrom((NamedElement) arguments.get(0), (Namespace) arguments.get(1));
		case UMLPackage.CONNECTABLE_ELEMENT___GET_QUALIFIED_NAME:
			return getQualifiedName();
		case UMLPackage.CONNECTABLE_ELEMENT___SEPARATOR:
			return separator();
		case UMLPackage.CONNECTABLE_ELEMENT___GET_CLIENT_DEPENDENCIES:
			return getClientDependencies();
		case UMLPackage.CONNECTABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT:
			return isCompatibleWith((ParameterableElement) arguments.get(0));
		case UMLPackage.CONNECTABLE_ELEMENT___IS_TEMPLATE_PARAMETER:
			return isTemplateParameter();
		case UMLPackage.CONNECTABLE_ELEMENT___GET_ENDS:
			return getEnds();
		}
		return eDynamicInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner() || eIsSet(UMLPackage.CONNECTABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER);
	}

} //ConnectableElementImpl
