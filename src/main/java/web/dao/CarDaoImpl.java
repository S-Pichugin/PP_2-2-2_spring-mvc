package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> list;

    {
        list = new ArrayList<>();
        list.add(new Car(1, "bmw", 7));
        list.add(new Car(2, "mersedez", 5));
        list.add(new Car(3, "lada", 9));
        list.add(new Car(4, "kia", 3));
        list.add(new Car(5, "mazda", 6));
    }
    @Override
    public List<Car> getCarsList(int count) {
        return list.stream().limit(count).collect(Collectors.toList());
    }
}