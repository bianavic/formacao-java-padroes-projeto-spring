package org.edu.fabs.formacaojavapadroesprojetospring.repository;

import org.edu.fabs.formacaojavapadroesprojetospring.model.Cliente;
import org.springframework.data.repository.CrudRepository;

// CrudRepository é um Strategy que simplifica a implementacao
// nesta estrutura, o uso da anotacao @Repository é opcional
public interface ClienteRepository extends CrudRepository<Cliente, Long> {}
