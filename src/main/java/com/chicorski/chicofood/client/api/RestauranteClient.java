package com.chicorski.chicofood.client.api;

import com.chicorski.chicofood.client.api.model.RestauranteResumoModel;
import lombok.AllArgsConstructor;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
public class RestauranteClient {

    private static final String RESOURCE_PATH = "/restaurantes";

    private RestTemplate restTemplate;
    private String url;

    public List<RestauranteResumoModel> listar() {
        URI resourceUri = URI.create(url + RESOURCE_PATH);

        RestauranteResumoModel[] restauranteResumoModels = restTemplate.getForObject(resourceUri, RestauranteResumoModel[].class);

        return Arrays.asList(restauranteResumoModels);
    }
}
