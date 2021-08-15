package com.chicorski.chicofood.client.api;

import org.springframework.web.client.RestTemplate;

public class ListagemRestaurantesMain {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        RestauranteClient restauranteClient = new RestauranteClient(
                restTemplate, "http://localhost:8180");

        restauranteClient.listar().stream().forEach(restaurante -> System.out.println(restaurante));
    }
}