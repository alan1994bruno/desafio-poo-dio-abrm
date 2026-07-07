import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Course;
import br.com.dio.desafio.dominio.Developer;
import br.com.dio.desafio.dominio.Mentorship;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("curso java");
        course1.setDescription("descrição curso java");
        course1.setWorkloadDuration(8);

        Course course2 = new Course();
        course2.setTitle("curso js");
        course2.setDescription("descrição curso js");
        course2.setWorkloadDuration(4);

        Mentorship mentoring = new Mentorship();
        mentoring.setTitle("mentoria de java");
        mentoring.setDescription("descrição mentoria java");
        mentoring.setDate(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição Bootcamp Java Developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentoring);

        Developer devCamila = new Developer();
        devCamila.setName("Camila");
        devCamila.subscribeBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getContentsSubscribes());
        devCamila.advanceStudy();
        devCamila.advanceStudy();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getContentsSubscribes());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getContentsFinished());
        System.out.println("XP:" + devCamila.getTotalXP());

        System.out.println("-------");

        Developer devJoao = new Developer();
        devJoao.setName("Joao");
        devJoao.subscribeBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getContentsSubscribes());
        devJoao.advanceStudy();
        devJoao.advanceStudy();
        devJoao.advanceStudy();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getContentsSubscribes());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getContentsFinished());
        System.out.println("XP:" + devJoao.getTotalXP());

    }

}
