package edu.eci.userServiceApp.service;

import edu.eci.userServiceApp.controller.user.UserDto;
import edu.eci.userServiceApp.exception.UserNotFoundException;
import edu.eci.userServiceApp.repository.document.User;

import java.util.List;

public interface UserService
{
    User create( UserDto userDto );

    User findById( String id )
        throws UserNotFoundException;

    User findByEmail( String email )
        throws UserNotFoundException;

    List<User> all();

    boolean deleteById( String id );

    User update( UserDto userDto, String id );
}
