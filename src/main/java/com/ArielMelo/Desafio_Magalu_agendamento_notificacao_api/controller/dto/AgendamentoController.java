package com.ArielMelo.Desafio_Magalu_agendamento_notificacao_api.controller.dto;

import com.ArielMelo.Desafio_Magalu_agendamento_notificacao_api.business.AgendamentoService;
import com.ArielMelo.Desafio_Magalu_agendamento_notificacao_api.controller.dto.in.AgendamentoRecord;
import com.ArielMelo.Desafio_Magalu_agendamento_notificacao_api.controller.dto.out.AgendamentoRecordOut;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/agendamento")
public class AgendamentoController {

    private final AgendamentoService agendamentoService;

    @PostMapping
    public ResponseEntity<AgendamentoRecordOut> gravarAgendamentos(@RequestBody AgendamentoRecord agendamento){
        return ResponseEntity.ok(agendamentoService.gravarAgendamento(agendamento));
    }
}
