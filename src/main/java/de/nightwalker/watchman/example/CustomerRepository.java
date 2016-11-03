package de.nightwalker.watchman.example;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author lieharn - 03.11.16.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

}
