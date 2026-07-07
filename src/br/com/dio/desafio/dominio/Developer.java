package br.com.dio.desafio.dominio;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Objects;


@Setter
@Getter
public class Developer {
    private String name;
    private Set<Content> contentsSubscribes = new LinkedHashSet<>();
    private Set<Content> contentsFinished = new LinkedHashSet<>();
    @Setter(AccessLevel.NONE)
    private double totalXP;

    public void subscribeBootcamp(Bootcamp bootcamp){
        this.contentsSubscribes.addAll(bootcamp.getContents());
        bootcamp.getDevsSubscribes().add(this);
    }

    public void advanceStudy() {
        Optional<Content> currentContent = this.contentsSubscribes.stream().findFirst();
        if(currentContent.isPresent()) {
            this.contentsFinished.add(currentContent.get());
            this.contentsSubscribes.remove(currentContent.get());
            totalXP+=currentContent.get().calcularXp();
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer dev = (Developer) o;
        return Objects.equals(name, dev.name) && Objects.equals(contentsSubscribes, dev.contentsSubscribes) && Objects.equals(contentsFinished, dev.contentsFinished);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contentsSubscribes, contentsFinished);
    }
}
