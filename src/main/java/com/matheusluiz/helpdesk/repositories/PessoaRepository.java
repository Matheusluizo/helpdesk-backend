package com.matheusluiz.helpdesk.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusluiz.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{
	
	Optional<Pessoa> findByEmail(String email);
	Optional<Pessoa> findByCpf(String cpf);
}
