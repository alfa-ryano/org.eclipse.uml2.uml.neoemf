/**
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Ordering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A GeneralOrdering represents a binary relation between two OccurrenceSpecifications, to describe that one OccurrenceSpecification must occur before the other in a valid trace. This mechanism provides the ability to define partial orders of OccurrenceSpecifications that may otherwise not have a specified order.
 * <p>From package UML::Interactions.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.GeneralOrdering#getAfter <em>After</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.GeneralOrdering#getBefore <em>Before</em>}</li>
 * </ul>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getGeneralOrdering()
 * @model
 * @generated
 */
public interface GeneralOrdering extends NamedElement {
	/**
	 * Returns the value of the '<em><b>After</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.OccurrenceSpecification#getToBefores <em>To Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OccurrenceSpecification referenced comes after the OccurrenceSpecification referenced by before.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>After</em>' reference.
	 * @see #setAfter(OccurrenceSpecification)
	 * @see org.eclipse.uml2.uml.UMLPackage#getGeneralOrdering_After()
	 * @see org.eclipse.uml2.uml.OccurrenceSpecification#getToBefores
	 * @model opposite="toBefore" required="true" ordered="false"
	 * @generated
	 */
	OccurrenceSpecification getAfter();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.GeneralOrdering#getAfter <em>After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After</em>' reference.
	 * @see #getAfter()
	 * @generated
	 */
	void setAfter(OccurrenceSpecification value);

	/**
	 * Returns the value of the '<em><b>Before</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.OccurrenceSpecification#getToAfters <em>To After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OccurrenceSpecification referenced comes before the OccurrenceSpecification referenced by after.
	 * <p>From package UML::Interactions.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Before</em>' reference.
	 * @see #setBefore(OccurrenceSpecification)
	 * @see org.eclipse.uml2.uml.UMLPackage#getGeneralOrdering_Before()
	 * @see org.eclipse.uml2.uml.OccurrenceSpecification#getToAfters
	 * @model opposite="toAfter" required="true" ordered="false"
	 * @generated
	 */
	OccurrenceSpecification getBefore();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.GeneralOrdering#getBefore <em>Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before</em>' reference.
	 * @see #getBefore()
	 * @generated
	 */
	void setBefore(OccurrenceSpecification value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An occurrence specification must not be ordered relative to itself through a series of general orderings. (In other words, the transitive closure of the general orderings is irreflexive.)
	 * after->closure(toAfter.after)->excludes(before)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateIrreflexiveTransitiveClosure(DiagnosticChain diagnostics, Map<Object, Object> context);

} // GeneralOrdering