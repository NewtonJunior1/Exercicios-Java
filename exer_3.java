import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio",
                "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int[] temperatura = new int [12];

        for (int i = 0; i < 12; i++) {
            System.out.println("Qual a temperatura do mês " + (i + 1) + "? ");
            temperatura[i] = scanner.nextInt();
        }
        int tmin = 0;
        int tmax = 0;
        int mesmaior = 0;
        int mesmenor = 0;

        for (int i = 0; i < 12; i++){
            if (i == 0) {
                tmin = temperatura[i];
                mesmenor = i;
            }
            if (temperatura[i] < tmin){
                tmin = temperatura[i];
                mesmenor = i;
            }
            if (temperatura[i] > tmax) {
                tmax = temperatura[i];
                mesmaior = i;
            }
        }
        System.out.println("O mês com a maior temperatura é o numero " + (mesmaior + 1)
                + " com a temperatura de " + tmax + "graus");
        System.out.println("O mês com a menor temperatura é o numero " + (mesmenor + 1)
                + " com a temperatura de " + tmin + "graus");

    }
}