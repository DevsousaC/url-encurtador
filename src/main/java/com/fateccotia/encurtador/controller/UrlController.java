package com.fateccotia.encurtador.controller;


import com.fateccotia.encurtador.model.Url;
import com.fateccotia.encurtador.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/url")
public class UrlController {

    @Autowired
    private UrlService urlService;

    @PostMapping("/encurtar")
    public ResponseEntity<Url> encurtarUrl(@RequestBody String urlOriginal) {
        Url url = urlService.encurtarUrl(urlOriginal);
        return new ResponseEntity<>(url, HttpStatus.OK);
    }

    @GetMapping("/{urlEncurtada}")
    public ResponseEntity<String> redirecionarUrl(@PathVariable String urlEncurtada) {
        Url url = urlService.buscarUrlOriginal(urlEncurtada);
        if (url != null) {
            return new ResponseEntity<>(url.getUrlOriginal(), HttpStatus.FOUND);
        } else {
            return new ResponseEntity<>("URL encurtada não encontrada", HttpStatus.NOT_FOUND);
        }
    }
}
