package com.solfwaredesign.projectedu.repository;

import com.solfwaredesign.projectedu.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface ProductRepository extends MongoRepository<Product, String> {
    List<Product> findByName(@Param("name") String name);
    Optional<Product> findById(@Param("id") long id);
}
