import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Cursos;
import br.com.dio.desafio.dominio.Devs;
import br.com.dio.desafio.dominio.Mentorias;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

     Devs maria = new Devs("Maria");
     Devs juan = new Devs("juan");

     Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.getConteudo().add(new Cursos("aprendendo java", "conceitos basicos",32));
        bootcampJava.getConteudo().add(new Mentorias("intro java", "conceitos basicos com nosso experto",    LocalDateTime.of(2023, 4, 4, 10, 0)));

        juan.inscriverNoBootcamp(bootcampJava);
        juan.progredir();


    }
}