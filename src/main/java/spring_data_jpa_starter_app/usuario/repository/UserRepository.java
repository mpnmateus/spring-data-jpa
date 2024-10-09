package spring_data_jpa_starter_app.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring_data_jpa_starter_app.usuario.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
