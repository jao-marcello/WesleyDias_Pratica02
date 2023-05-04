import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Dados eq = new Dados(0, 0, 0, 0);

        double dias, diaria, taxa, total;

        diaria = 500; eq.setDiaria(diaria);

        System.out.println("Informe o numero de dias de hospedagem:");
        dias = in.nextDouble(); eq.setDias(dias);

        taxa = eq.calculaTaxa();
        total = eq.gastoTotal();

        System.out.println("\nSeu numero de diarias foram: " + dias + 
        "\nValor da diaria: R$" + diaria + 
        "\nValor da taxa diaria: R$" + taxa + 
        "\nValor total: R$" + total + 
        "\n");
    }
}
