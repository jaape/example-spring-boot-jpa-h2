package fi.exampleapplication.config;

import fi.exampleapplication.model.entity.Car;
import fi.exampleapplication.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DataMigration {

    @Bean
    public CommandLineRunner migrate(CarRepository repository) {
        return (args) -> {
            repository.save(new Car("Toyota", "Corolla"));
            repository.save(new Car("Audi", "100"));
            repository.save(new Car("Skoda", "Octavia Combi"));
        };
    }
}
