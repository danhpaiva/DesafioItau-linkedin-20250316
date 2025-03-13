package com.itau.Desafio_Itau.controller;


import com.itau.Desafio_Itau.dto.StatisticsDto;
import com.itau.Desafio_Itau.service.TransactionService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.DoubleSummaryStatistics;

@RestController
@RequestMapping("/estatistica")
public class StatisticsController {

    private final TransactionService transactionService;

    public StatisticsController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping(produces = "application/json")
    public ResponseEntity<StatisticsDto> getStatistics() {
        DoubleSummaryStatistics stats = transactionService.getStatistics();

        return ResponseEntity.ok(new StatisticsDto(stats));
    }
}
