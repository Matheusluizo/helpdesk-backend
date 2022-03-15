package com.matheusluiz.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusluiz.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
