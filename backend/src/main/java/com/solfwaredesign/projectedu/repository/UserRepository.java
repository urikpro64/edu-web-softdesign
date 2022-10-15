package com.solfwaredesign.projectedu.repository;

import com.solfwaredesign.projectedu.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByName(@Param("name") String name);
}
