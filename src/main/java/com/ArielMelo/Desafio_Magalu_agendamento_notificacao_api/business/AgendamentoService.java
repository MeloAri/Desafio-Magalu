package com.ArielMelo.Desafio_Magalu_agendamento_notificacao_api.business;

import com.ArielMelo.Desafio_Magalu_agendamento_notificacao_api.business.mapper.IAgendamentoMapper;
import com.ArielMelo.Desafio_Magalu_agendamento_notificacao_api.controller.dto.in.AgendamentoRecord;
import com.ArielMelo.Desafio_Magalu_agendamento_notificacao_api.controller.dto.out.AgendamentoRecordOut;
import com.ArielMelo.Desafio_Magalu_agendamento_notificacao_api.infrastructure.repositories.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AgendamentoService {

 private final AgendamentoRepository repository;
 private final IAgendamentoMapper agendamentoMapper;

 public AgendamentoRecordOut gravarAgendamento(AgendamentoRecord agendamento){
   return agendamentoMapper.paraOut(repository.save(agendamentoMapper.paraEntity(agendamento)));
 }
}
