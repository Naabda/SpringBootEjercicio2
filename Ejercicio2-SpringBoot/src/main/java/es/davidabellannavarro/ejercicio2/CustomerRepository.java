package es.davidabellannavarro.ejercicio2;

/**
 * @author David Abellán Navarro
 * @project Ejercicio2
 * @course 2ºD.A.M.
 * @date 05/01/2022
 */

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * The interface Customer repository.
 */
@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface CustomerRepository extends MongoRepository<Customer, String> {

	/**
	 * Find by first name customer.
	 *
	 * @param firstName the first name
	 * @return the customer
	 */
	public Customer findByFirstName(@Param("nombre") String firstName);

	/**
	 * Find by last name list.
	 *
	 * @param lastName the last name
	 * @return the list
	 */
	public List<Customer> findByLastName(@Param("apellido") String lastName);

}
