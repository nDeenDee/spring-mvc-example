package system.dao;

import lombok.Getter;
import org.springframework.stereotype.Repository;
import system.model.User;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{

    @PostConstruct
    public void init() {
        users.add(new User("admin","pass"));
        users.add(new User("user1","1"));
    }

    @Getter
    private List<User> users = new ArrayList<User>();
}
