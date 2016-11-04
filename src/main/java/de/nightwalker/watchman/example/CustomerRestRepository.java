package de.nightwalker.watchman.example;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author lieharn - 04.11.16.
 */
@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface CustomerRestRepository extends PagingAndSortingRepository<Customer, Long> {

    List<Customer> findByLastName(@Param("name") String name);
}
