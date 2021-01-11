package com.chris.automoveis.automoveis.domain;

import org.springframework.data.repository.CrudRepository;

public interface CarroRepository extends CrudRepository<Carro, Long> {

    Iterable<Carro> findCarrosByTipo(String tipo);

}
