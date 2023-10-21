import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numVendedores = 10;
        int[] quantidades = new int[numVendedores];
        double[] precos = new double[numVendedores];

        for (int i = 0; i < numVendedores; i++) {
            System.out.print("Informe a quantidade de peças vendidas pelo vendedor " + (i + 1) + ": ");
            quantidades[i] = scanner.nextInt();

            System.out.print("Informe o preço da peça vendida pelo vendedor " + (i + 1) + ": ");
            precos[i] = scanner.nextDouble();
        }

        double totalVendas = 0;

        for (int i = 0; i < numVendedores; i++) {
            double valorVenda = quantidades[i] * precos[i];
            totalVendas += valorVenda;

            System.out.println("Vendedor " + (i + 1) + ":");
            System.out.println("Quantidade de peças vendidas: " + quantidades[i]);
            System.out.println("Valor total da venda: " + valorVenda);
        }

        System.out.println("Quantidade total de peças vendidas por todos os vendedores: " + getTotalQuantidade(quantidades));
        System.out.println("Valor total das vendas de todos os vendedores: " + totalVendas);

        scanner.close();
    }

    public static int getTotalQuantidade(int[] quantidades) {
        int total = 0;
        for (int quantidade : quantidades) {
            total += quantidade;
        }
        return total;
    }
}