package service;

import model.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iparhan on 17-5-10.
 */
@Service
public class DemoService {
    @Cacheable(value = "userCache",keyGenerator = "KeyGenerator")
    public User findUser(Long id, String firstName, String lastName){
        System.out.println("db qur");
        return new User(id, firstName, lastName);

    }
    @Cacheable(value = "userListCache", keyGenerator = "KeyGenerator")
    public List<User> findUserList(Long companyId){
        System.out.println("db qry list");
        List<User> list = new ArrayList<>();
        list.add(new User(1L,"kaisar","dawut"));
        list.add(new User(2L,"anwar","dawut"));
        return  list;
    }
    @Cacheable(value ="userCacheById",key = "'key:' + #id.toString()")
    public User findUserById(Long id){
        System.out.println("db qry ById");
        return new User(id,"kaisar","dawut");
    }
    @Cacheable(value = "UserCacheById", key = "'key:' + #id.toString()")
    public int delUserById(Long id){
        System.out.println("db qry del");
        return 1;
    }
}
