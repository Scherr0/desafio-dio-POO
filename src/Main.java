import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Scanner; // Importa a Scanner Class

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um Scanner object
        boolean tryAgain = true;
        boolean encerrar = false;

        // Cria um bootcamp
        Bootcamp bootcamp = new Bootcamp();
        // Define os atributos do bootcamp
        bootcamp.setNome("START Java");
        bootcamp.setDescricao("Bootcamp voltado ao aprendizado de Java, do básico ao avançado");


        // Cria um curso para o bootcamp
        Curso curso1 = new Curso();
        // Define os atributos do curso
        curso1.setTitulo("Sintaxe Básica em Java");
        curso1.setDescricao("Aprenda a sintaxe básica do Java");
        curso1.setCargaHoraria(4);


        // Cria outro curso para o bootcamp
        Curso curso2 = new Curso();
        // Define os atributos do curso
        curso2.setTitulo("Programação Orientada a Objetos");
        curso2.setDescricao("Desmistifique a POO");
        curso2.setCargaHoraria(12);


        // Cria uma mentoria para o bootcamp
        Mentoria mentoria = new Mentoria();
        // Define os atributos da mentoria
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Tire suas dúvidas sobre Java");
        mentoria.setData(LocalDate.now());

        // Adiciona os conteúdos criados ao bootcamp
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        // Cria um novo dev
        Dev dev1 = new Dev();

        // Solicita ao usuário que insira o nome do primeiro desenvolvedor
        System.out.print("Digite o nome do desenvolvedor: ");
        String nomeDev1 = scanner.nextLine();
        dev1.setNome(nomeDev1);

        // Pergunta se o usuário deseja matricular o dev1 no bootcamp
        while (tryAgain) {
            System.out.print("Você deseja matricular " + dev1.getNome() + " no Bootcamp " + bootcamp.getNome() + "? (Sim/Não)\n");
            String resposta1 = scanner.nextLine();
            char opcao1 = resposta1.toUpperCase().charAt(0);
            if (opcao1 == 'S') {
                dev1.inscreverBootcamp(bootcamp);
                System.out.println("Parabéns, você matriculou " + dev1.getNome() + " no Bootcamp " + bootcamp.getNome() + "!\n");
                System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos());
                tryAgain = false;
            } else if (opcao1 == 'N') {
                System.out.println("Que pena, até a próxima!");
                tryAgain = false;
            } else {
                System.out.println("Opção inválida, tente novamente!");
            }
        }
        tryAgain = true;


        // Cria outro dev
        Dev dev2 = new Dev();

        // Solicita ao usuário que insira o nome do segundo desenvolvedor
        System.out.print("Digite o nome do desenvolvedor: ");
        String nomeDev2 = scanner.nextLine();
        dev2.setNome(nomeDev2);

        // Pergunta se o usuário deseja matricular o dev2 no bootcamp
        while (tryAgain) {
            System.out.print("Você deseja matricular " + dev2.getNome() + " no Bootcamp " + bootcamp.getNome() + "? (Sim/Não)\n");
            String resposta2 = scanner.nextLine();
            char opcao2 = resposta2.toUpperCase().charAt(0);
            if (opcao2 == 'S') {
                dev2.inscreverBootcamp(bootcamp);
                System.out.println("Parabéns, você matriculou " + dev2.getNome() + " no Bootcamp " + bootcamp.getNome() + "!\n");
                System.out.println("Conteúdos inscritos: " + dev2.getConteudosInscritos() + "\n");
                tryAgain = false;
            } else if (opcao2 == 'N') {
                System.out.println("Que pena, até a próxima!\n");
                tryAgain = false;
            } else {
                System.out.println("Opção inválida, tente novamente!\n");
            }
        }
        tryAgain = true;

        // Permite que o usuário progrida indefinidamente os devs criados no bootcamp
        while (!encerrar) {
            // Pergunta se o usuário deseja progredir o dev 1 no bootcamp
            while (tryAgain) {
                System.out.println("Você deseja progredir " + dev1.getNome() + " no bootcamp? (Sim/Não)\n");
                String resposta3 = scanner.nextLine();
                char opcao3 = resposta3.toUpperCase().charAt(0);
                if (opcao3 == 'S') {
                    dev1.progredir();
                    System.out.println("Parabéns, " + dev1.getNome() + " progrediu no Bootcamp " + bootcamp.getNome() + "!\n");
                    System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos() + "\n");
                    System.out.println("Conteúdos concluídos: " + dev1.getConteudosConcluidos() + "\n");
                    System.out.println("XP: " + dev1.calcularTotalXp());
                    tryAgain = false;
                } else if (opcao3 == 'N') {
                    System.out.println("Continue estudando!\n");
                    System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos() + "\n");
                    System.out.println("Conteúdos concluídos: " + dev1.getConteudosConcluidos() + "\n");
                    System.out.println("XP: " + dev1.calcularTotalXp());
                    tryAgain = false;
                } else {
                    System.out.println("Opção inválida, tente novamente!\n");
                }
            }
            tryAgain = true;


            // Pergunta se o usuário deseja progredir o dev 2 no bootcamp
            while (tryAgain) {
                System.out.println("Você deseja progredir " + dev2.getNome() + " no bootcamp? (Sim/Não)\n");
                String resposta4 = scanner.nextLine();
                char opcao4 = resposta4.toUpperCase().charAt(0);
                if (opcao4 == 'S') {
                    dev2.progredir();
                    System.out.println("Parabéns, " + dev2.getNome() + " progrediu no Bootcamp " + bootcamp.getNome() + "!\n");
                    System.out.println("Conteúdos inscritos: " + dev2.getConteudosInscritos() + "\n");
                    System.out.println("Conteúdos concluídos: " + dev2.getConteudosConcluidos() + "\n");
                    System.out.println("XP: " + dev2.calcularTotalXp());
                    tryAgain = false;
                } else if (opcao4 == 'N') {
                    System.out.println("Continue estudando!\n");
                    System.out.println("Conteúdos inscritos: " + dev2.getConteudosInscritos() + "\n");
                    System.out.println("Conteúdos concluídos: " + dev2.getConteudosConcluidos() + "\n");
                    System.out.println("XP: " + dev2.calcularTotalXp());
                    tryAgain = false;
                } else {
                    System.out.println("Opção inválida, tente novamente!\n");
                }
            }
            tryAgain = true;

            // Pergunta ao usuário se ele deseja encerrar o programa
            while (tryAgain) {
                System.out.println("Você deseja encerrar o programa? (Sim/Não)\n");
                String resposta5 = scanner.nextLine();
                char opcao5 = resposta5.toUpperCase().charAt(0);
                if (opcao5 == 'S') {
                    encerrar = true;
                    tryAgain = false;
                } else if (opcao5 == 'N') {
                    tryAgain = false;
                }
                else {
                    System.out.println("Opção inválida, tente novamente!\n");
                }
            }
            tryAgain = true;
        }
    }
}
