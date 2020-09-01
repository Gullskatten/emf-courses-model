/**
 */
package course;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see course.CoursePackage#getCourseLevel()
 * @model
 * @generated
 */
public enum CourseLevel implements Enumerator {
	/**
	 * The '<em><b>FIRST DEGREE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_DEGREE_VALUE
	 * @generated
	 * @ordered
	 */
	FIRST_DEGREE(1, "FIRST_DEGREE", "First Degree Subject"),

	/**
	 * The '<em><b>SECOND DEGREE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECOND_DEGREE_VALUE
	 * @generated
	 * @ordered
	 */
	SECOND_DEGREE(2, "SECOND_DEGREE", "Second Degree Subject"),

	/**
	 * The '<em><b>THIRD DEGREE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRD_DEGREE_VALUE
	 * @generated
	 * @ordered
	 */
	THIRD_DEGREE(3, "THIRD_DEGREE", "Third Degree Subject"),

	/**
	 * The '<em><b>HIGHER DEGREE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGHER_DEGREE_VALUE
	 * @generated
	 * @ordered
	 */
	HIGHER_DEGREE(4, "HIGHER_DEGREE", "Higher Degree Subject");

	/**
	 * The '<em><b>FIRST DEGREE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_DEGREE
	 * @model literal="First Degree Subject"
	 * @generated
	 * @ordered
	 */
	public static final int FIRST_DEGREE_VALUE = 1;

	/**
	 * The '<em><b>SECOND DEGREE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECOND_DEGREE
	 * @model literal="Second Degree Subject"
	 * @generated
	 * @ordered
	 */
	public static final int SECOND_DEGREE_VALUE = 2;

	/**
	 * The '<em><b>THIRD DEGREE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRD_DEGREE
	 * @model literal="Third Degree Subject"
	 * @generated
	 * @ordered
	 */
	public static final int THIRD_DEGREE_VALUE = 3;

	/**
	 * The '<em><b>HIGHER DEGREE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGHER_DEGREE
	 * @model literal="Higher Degree Subject"
	 * @generated
	 * @ordered
	 */
	public static final int HIGHER_DEGREE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CourseLevel[] VALUES_ARRAY =
		new CourseLevel[] {
			FIRST_DEGREE,
			SECOND_DEGREE,
			THIRD_DEGREE,
			HIGHER_DEGREE,
		};

	/**
	 * A public read-only list of all the '<em><b>Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CourseLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CourseLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CourseLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CourseLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CourseLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CourseLevel get(int value) {
		switch (value) {
			case FIRST_DEGREE_VALUE: return FIRST_DEGREE;
			case SECOND_DEGREE_VALUE: return SECOND_DEGREE;
			case THIRD_DEGREE_VALUE: return THIRD_DEGREE;
			case HIGHER_DEGREE_VALUE: return HIGHER_DEGREE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CourseLevel(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CourseLevel
