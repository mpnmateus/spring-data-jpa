package spring_data_jpa_starter_app.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_data_jpa_starter_app.usuario.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    //Query Method
    List<User> findByNameContaining(String name);

    //Query Method
    User findByUsername(String username);


}
