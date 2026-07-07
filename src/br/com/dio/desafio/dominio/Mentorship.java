package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class Mentorship extends Content {

    private LocalDate date;

    @Override
    public double calcularXp() {
        return XP_PATTERN + 20d;
    }

    public Mentorship() {
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitle() + '\'' +
                ", descricao='" + getDescription() + '\'' +
                ", data=" + date +
                '}';
    }
}
