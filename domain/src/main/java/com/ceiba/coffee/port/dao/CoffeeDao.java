package com.ceiba.coffee.port.dao;

import com.ceiba.coffee.model.dto.CoffeeDto;

import java.util.List;

public interface CoffeeDao {

    /**
     * Permite listar usuarios
     * @return los usuarios
     */
    List<CoffeeDto> list();
}
