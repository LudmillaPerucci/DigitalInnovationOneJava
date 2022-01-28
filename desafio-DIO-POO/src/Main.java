import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo(" Curso Java");
		curso1.setDescricao(" Descrição Curso Java");
		curso1.setCargaHoraria(10);
				
		Curso curso2 = new Curso();
		curso2.setTitulo(" Curso Python");
		curso2.setDescricao(" Descrição Curso Python");
		curso2.setCargaHoraria(9);
		
		Curso curso3 = new Curso();
		curso3.setTitulo(" Curso .NET");
		curso3.setDescricao(" Descrição Curso .NET");
		curso3.setCargaHoraria(8);
		
		Conteudo conteudo = new Curso();
		
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo(" Mentoria de Java");
		mentoria1.setDescricao(" Descrição Mentoria Java");
		mentoria1.setData(LocalDate.now());
		
		Mentoria mentoria2 = new Mentoria();
		mentoria2.setTitulo(" Mentoria de Python");
		mentoria2.setDescricao(" Descrição Mentoria Python");
		mentoria2.setData(LocalDate.now());
		
		Mentoria mentoria3 = new Mentoria();
		mentoria3.setTitulo(" Mentoria de .NET");
		mentoria3.setDescricao(" Descrição Mentoria .NET");
		mentoria3.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(curso3);
		System.out.println(mentoria1);
		System.out.println(mentoria2);
		System.out.println(mentoria3);
		*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome(" Bootcamp Java Developer");
		bootcamp.setDescricao(" Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(curso3);
		
		Dev devLudmilla = new Dev();
		devLudmilla.setNome("Ludmilla");
		devLudmilla.inscreverBootcamp(bootcamp);
		
		System.out.println(" Conteúdos Inscritos Ludmilla:" + devLudmilla.getConteudosInscritos());
		
		devLudmilla.progredir();
		devLudmilla.progredir();
		devLudmilla.progredir();
		
		System.out.println(" ---");
		System.out.println(" Conteúdos Inscritos Ludmilla:" + devLudmilla.getConteudosInscritos());
		System.out.println(" Conteúdos Concluidos Ludmilla" + devLudmilla.getConteudosConcluidos()); 
		System.out.println("XP:" + devLudmilla.calcularTotalXp());
		
		
		System.out.println("--------");
		
		Dev devMaria = new Dev();
		devMaria.setNome("Maria");
		devMaria.inscreverBootcamp(bootcamp);
		
		System.out.println(" Conteúdos Inscritos Maria" + devMaria.getConteudosInscritos());
		
		devMaria.progredir();
		devMaria.progredir();
		
		System.out.println(" ---");
		System.out.println(" Conteúdos Inscritos Maria" + devMaria.getConteudosInscritos());
		System.out.println(" Conteúdos Concluidos Maria" + devMaria.getConteudosConcluidos()); 
		System.out.println("XP:" + devMaria.calcularTotalXp());
		
	}

}
