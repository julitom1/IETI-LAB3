package edu.eci.userServiceApp.repository;

import edu.eci.userServiceApp.repository.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository
    extends MongoRepository<User, String>
{
    Optional<User> findByEmail( String email );
}
