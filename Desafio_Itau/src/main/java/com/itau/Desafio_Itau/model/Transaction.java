package com.itau.Desafio_Itau.model;

import org.springframework.web.servlet.tags.EditorAwareTag;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

public class Transaction {

    private double valor;
    private OffsetDateTime dataHora;

    public Transaction (final double valor,final OffsetDateTime dataHora) {
        this.valor = valor;
        this.dataHora = dataHora;
    }

    public double getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }
}
