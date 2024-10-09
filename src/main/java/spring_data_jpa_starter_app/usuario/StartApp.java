package spring_data_jpa_starter_app.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring_data_jpa_starter_app.usuario.model.User;
import spring_data_jpa_starter_app.usuario.repository.UserRepository;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        List<User> users = repository.filtrarPorNome("Mateus");
        for(User u : users)
            System.out.println(u);
    }

    public void insertUser () {
        User user = new User();
        user.setName("Mateus Pettenuzzo ");
        user.setUsername("Mateus");
        user.setPassword("12345");

        repository.save(user);

        for(User u: repository.findAll()) {
            System.out.println(u);
        }
    }
}
