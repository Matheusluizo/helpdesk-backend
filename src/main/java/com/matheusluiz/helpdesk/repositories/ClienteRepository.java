package com.matheusluiz.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusluiz.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}