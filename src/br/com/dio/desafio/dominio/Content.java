package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Content {

    protected static final double XP_PATTERN = 10d;

    private String title;
    private String description;

    public abstract double calcularXp();

}
