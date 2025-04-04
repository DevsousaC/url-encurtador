package com.fateccotia.encurtador.repository;

import com.fateccotia.encurtador.model.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepository extends JpaRepository<Url, Long> {
    Url findByUrlEncurtada(String urlEncurtada);
}