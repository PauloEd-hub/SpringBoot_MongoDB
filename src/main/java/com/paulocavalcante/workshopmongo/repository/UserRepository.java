package com.paulocavalcante.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.paulocavalcante.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
