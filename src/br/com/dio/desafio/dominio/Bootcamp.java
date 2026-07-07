package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Setter
@Getter
public class Bootcamp {

    private String name;
    private String description;
    private final LocalDate startDate = LocalDate.now();
    private final LocalDate endDate = startDate.plusDays(45);
    private Set<Developer> devsSubscribes = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(startDate, bootcamp.startDate) && Objects.equals(endDate, bootcamp.endDate) && Objects.equals(devsSubscribes, bootcamp.devsSubscribes) && Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, startDate, endDate, devsSubscribes, contents);
    }
}
