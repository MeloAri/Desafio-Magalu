package com.ArielMelo.Desafio_Magalu_agendamento_notificacao_api.infrastructure.repositories;

import com.ArielMelo.Desafio_Magalu_agendamento_notificacao_api.infrastructure.entities.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}
