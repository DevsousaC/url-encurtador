package com.fateccotia.encurtador.service;

import com.fateccotia.encurtador.model.Url;
import com.fateccotia.encurtador.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UrlService {

    @Autowired
    private UrlRepository urlRepository;

    private static final String ALFABETO = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int TAMANHO_URL_ENCURTADA = 5;

    public Url encurtarUrl(String urlOriginal) {
        String urlEncurtada = gerarUrlEncurtada();
        Url url = new Url(urlOriginal, urlEncurtada);
        return urlRepository.save(url);
    }

    public Url buscarUrlOriginal(String urlEncurtada) {
        return urlRepository.findByUrlEncurtada(urlEncurtada);
    }

    private String gerarUrlEncurtada() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < TAMANHO_URL_ENCURTADA; i++) {
            sb.append(ALFABETO.charAt(random.nextInt(ALFABETO.length())));
        }
        return sb.toString();
    }
}
