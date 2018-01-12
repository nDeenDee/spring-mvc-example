package system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.dao.UserDaoImpl;
import system.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDaoImpl userDao;

    public List<User> getUsers() {
        return userDao.getUsers();
    }
}
