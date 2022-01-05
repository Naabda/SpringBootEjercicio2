package es.davidabellannavarro.ejercicio2;

/**
 * @author David Abellán Navarro
 * @project Ejercicio2
 * @course 2ºD.A.M.
 * @date 05/01/2022
 */

import org.springframework.data.annotation.Id;

/**
 * The type Customer.
 */
public class Customer {

	/**
	 * The Id.
	 */
	@Id
	public String id;

	/**
	 * The First name.
	 */
	public String firstName;
	/**
	 * The Last name.
	 */
	public String lastName;

	/**
	 * Instantiates a new Customer.
	 */
	public Customer() {}

	/**
	 * Instantiates a new Customer.
	 *
	 * @param firstName the first name
	 * @param lastName  the last name
	 */
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format(
				"Customer[id=%s, firstName='%s', lastName='%s']",
				id, firstName, lastName);
	}

}

