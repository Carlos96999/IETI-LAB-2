package org.ada.school.service;

import org.ada.school.dto.UserDto;
import org.ada.school.model.User;
import org.ada.school.repository.UserDocument;
import org.ada.school.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceMongoDB implements UserService
{

    private final UserRepository userRepository;

    public UserServiceMongoDB(@Autowired UserRepository userRepository )
    {
        this.userRepository = userRepository;
    }

    @Override
    public UserDocument create(UserDocument userDocument )
    {
        return new UserDocument();
    }

    @Override
    public UserDocument findById( String id )
    {
        return null;
    }

    @Override
    public List<UserDocument> all()
    {
        return null;
    }

    @Override
    public boolean deleteById( String id )
    {
        return false;
    }

    @Override
    public UserDocument update(UserDto userDto, String id) {
        return null;
    }
}
