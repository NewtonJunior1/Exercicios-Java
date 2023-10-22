import java.util.Objects;
import java.util.Scanner;

public class exer_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] gabarito = new String[10];
        System.out.println("Qual o gabarito da prova?");
        for (int i = 0; i < 10; i++){
            System.out.println("Resposta da questão " + (i + 1));
            gabarito[i] = scanner.nextLine();
        }
        int aprovados = 0;
        for (int i = 0; i < 15; i++){
            int nota = 0;
            String nome;
            System.out.println("Aluno de matricula numero: " + (i + 1) + " /-/ Qual o nome do aluno?");
            nome = scanner.nextLine();
            for (int j = 0; j < 10; j++){
                if (j == 0) {
                    System.out.println("Escreva as respostas conforme instrução abaixo:");
                }
                System.out.println("Aluno " + nome + ", questão numero: " + (j + 1));
                String respostas = scanner.nextLine();
                if (Objects.equals(respostas, gabarito[j])){
                    nota = nota + 1;
                }
                if (j == 9){
                    System.out.println("A nota do Aluno " + nome + ", foi " + nota);
                    if (nota > 5){
                        aprovados = aprovados + 1;
                    }
                }
            }
        }
        int percentual = (aprovados * 100) / 15;
        System.out.println("A quantidade de Alunos aprovados foi de " + percentual + "%");
    }
}