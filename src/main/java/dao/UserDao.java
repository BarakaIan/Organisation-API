package dao;

import org.h2.engine.User;

import java.util.List;

public interface UserDao {

    //create


    void add(models.User user);

    //read
    List<models.User> getAll();

    // find by ID
    models.User findById(int id);

    //update
    void update(int id, String name, String bio,String position,String role,int departmentId);

    //delete
    void deleteById(int id);
    void clearAll();
}
