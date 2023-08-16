import java.util.Scanner;

public class programa {

    private static int contarEstudantesAeB(double[] mediasAproveitamento) {
        int contador = 0;
        for (double media : mediasAproveitamento) {
            if ((media >= 9.0 && media <= 10.0) || (media >= 7.5 && media < 9.0)) {
                contador++;
            }
        }
        return contador;
    }

    private static int contarEstudantesCeD(double[] mediasAproveitamento) {
        int contador = 0;
        for (double media : mediasAproveitamento) {
            if ((media >= 6.0 && media < 7.0) || (media >= 4.0 && media < 6.0)) {
                contador++;
            }
        }
        return contador;
    }

    private static int contarEstudantesAbaixoD(double[] mediasAproveitamento) {
        int contador = 0;
        for (double media : mediasAproveitamento) {
            if (media < 4.0) {
                contador++;
            }
        }
        return contador;
    }

    private static int contarEstudantesAcimaB(double[] mediasAproveitamento) {
        int contador = 0;
        for (double media : mediasAproveitamento) {
            if (media >= 9.0 && media <= 10.0) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroAlunos = 5;
        double[] mediasAproveitamento = new double[numeroAlunos];

        int estudantesAeB = 0;
        int estudantesCeD = 0;
        int estudantesAbaixoD = 0;
        int estudantesAcimaB = 0;
        int encerrarPrograma = 0;

        do {
            Menu();

            switch (opcao) {

                case 1:

                    for (int i = 0; i < numeroAlunos; i++) {

                        System.out.println("Olá, Informe o número de identificação do estudante " + (i + 1));
                        int numeroIdentificao = scanner.nextInt();

                        System.out.println("Informe qual foi a nota do aluno " + (i + 1) + " na primeira VA");
                        double va1 = scanner.nextDouble();
                        
                        if(va1 < 0 || va1 > 10){
                             do {
                            System.out.println("Nota inválida, por favor insira uma nota no intervalo entre 0,0 (zero) a 10,0 (dez).");
                            va1 = scanner.nextDouble();

                        } while (va1 < 0 || va1 > 10);

                        }

                        
                        System.out.println("Informe qual foi a nota do aluno " + (i + 1) + " na segunda VA");
                        double va2 = scanner.nextDouble();
                        
                        if(va2 < 0 || va2 > 10){
                            
                          do {
                            System.out.println("Nota inválida, por favor insira uma nota no intervalo entre 0,0 (zero) a 10,0 (dez).");
                            va2 = scanner.nextDouble();

                        } while (va2 < 0.0 || va2 > 10.0);
                        
                        }

                        System.out.println("Informe qual foi a nota do aluno " + (i + 1) + " na terceira VA");
                        double va3 = scanner.nextDouble();
                        
                        if(va3 < 0 || va3 > 10){
                            
                          do {
                            System.out.println("Nota inválida, por favor insira uma nota no intervalo entre 0,0 (zero) a 10,0 (dez).");
                            va3 = scanner.nextDouble();

                        } while (va3 < 0.0 || va3 > 10.0);
                        
                        }

                        System.out.println("Informe a média dos exercícios que fazem parte da avaliação do aluno " + (i + 1));
                        double mediaExercicios = scanner.nextDouble();

                        double mediaAproveitamento = (va1 + 2 * va2 + 3 * va3 + mediaExercicios) / 7;
                        mediasAproveitamento[i] = mediaAproveitamento;
                    }

                    break;

                case 2:

                    estudantesAeB = contarEstudantesAeB(mediasAproveitamento);
                    System.out.println("Número de estudantes com conceitos A e B: " + estudantesAeB);

                    break;

                case 3:
                    estudantesCeD = contarEstudantesCeD(mediasAproveitamento);
                    System.out.println("Número de estudantes com conceitos C e D: " + estudantesCeD);

                    break;

                case 4:
                    estudantesAbaixoD = contarEstudantesAbaixoD(mediasAproveitamento);
                    System.out.println("Número de estudantes com conceitos Abaixo de D: " + estudantesAbaixoD);

                    break;
                case 5:
                    estudantesAcimaB = contarEstudantesAcimaB(mediasAproveitamento);
                    System.out.println("Número de estudantes com conceitos acima de B: " + estudantesAcimaB);

                    break;

                case 6:
                    System.out.println("Encerrando o programa");
                    encerrarPrograma = 1;
            }
        } while (encerrarPrograma == 0);
        scanner.close();
    }

    // Procedimentos e funções

    private static int opcao;

    private static void Menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, selecione uma das opções abaixo: ");
        System.out.println("1. Cadastrar média de 20 alunos");
        System.out.println("2. Número de estudantes com conceitos A e B");
        System.out.println("3. Número de estudantes com conceitos C e D");
        System.out.println("4. Número de estudantes com conceito abaixo de D");
        System.out.println("5. Número de estudantes com conceito acima de B");
        System.out.println("6. Sair do programa");
        opcao = scanner.nextInt();
        scanner.close();
    }
}