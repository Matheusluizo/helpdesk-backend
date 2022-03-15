package com.matheusluiz.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusluiz.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
