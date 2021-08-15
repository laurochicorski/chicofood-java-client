package com.chicorski.chicofood.client.api.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RestauranteInput {

    private String nome;
    private BigDecimal taxaFrete;

    private CozinhaIdInput cozinha;
    private EnderecoInput endereco;
}  