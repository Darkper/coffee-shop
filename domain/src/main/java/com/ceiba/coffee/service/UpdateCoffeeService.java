package com.ceiba.coffee.service;

import com.ceiba.coffee.exception.CoffeeNotFoundException;
import com.ceiba.coffee.model.entity.Coffee;
import com.ceiba.coffee.port.repository.CoffeeRepository;

public class UpdateCoffeeService {

    private static final String COFFEE_NOT_FOUND = "Café no encontrado";

    private final CoffeeRepository coffeeRepository;

    public UpdateCoffeeService(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    public void execute(Coffee coffee) {
        validateExistence(coffee);
        this.coffeeRepository.update(coffee);
    }

    private void validateExistence(Coffee coffee) {
        boolean exist = this.coffeeRepository.exist(coffee.getId());
        if(!exist) {
            throw new CoffeeNotFoundException(COFFEE_NOT_FOUND);
        }
    }
}
