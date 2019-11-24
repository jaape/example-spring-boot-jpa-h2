package fi.exampleapplication.controller;

import fi.exampleapplication.model.entity.Car;
import fi.exampleapplication.repository.CarRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ExampleApplicationTest {

    @Autowired
    CarRepository repository;

    @Test
    public void carsAreMigrated() {
        var cars = new ArrayList<Car>();
        repository.findAll().forEach(cars::add);
        assertThat(cars.size(), is(3));

        Car car = cars.get(0);
        assertThat(car.getMake(), is("Toyota"));
        assertThat(car.getModel(), is("Corolla"));
    }
}
