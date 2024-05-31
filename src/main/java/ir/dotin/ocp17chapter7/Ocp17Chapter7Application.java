package ir.dotin.ocp17chapter7;

import io.hypersistence.utils.spring.repository.BaseJpaRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories(
        value = "ir.dotin.ocp17chapter7.repository",
        repositoryBaseClass = BaseJpaRepositoryImpl.class
)
public class Ocp17Chapter7Application {

    public static void main(String[] args) {
        SpringApplication.run(Ocp17Chapter7Application.class, args);
    }

}
