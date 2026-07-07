package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Course extends Content {
    private int workloadDuration;

    @Override
    public double calcularXp() {
        return XP_PATTERN * workloadDuration;
    }

    public Course() {
    }


    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitle() + '\'' +
                ", descricao='" + getDescription() + '\'' +
                ", cargaHoraria=" + workloadDuration +
                '}';
    }
}
