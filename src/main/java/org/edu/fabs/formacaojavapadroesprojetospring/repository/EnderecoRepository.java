package org.edu.fabs.formacaojavapadroesprojetospring.repository;

import org.edu.fabs.formacaojavapadroesprojetospring.model.Endereco;
import org.springframework.data.repository.CrudRepository;

// CrudRepository é um Strategy que simplifica a implementacao
// nesta estrutura, o uso da anotacao @Repository é opcional
public interface EnderecoRepository extends CrudRepository<Endereco, String> {}
