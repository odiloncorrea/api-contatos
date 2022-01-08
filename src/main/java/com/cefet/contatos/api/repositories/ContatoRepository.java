package com.cefet.contatos.api.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cefet.contatos.api.entities.Contato;


@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {
		
	Optional<Contato> findByCpf(String cpf);
}
