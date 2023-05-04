import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Dados eq = new Dados(0, 0, 0, 0, 0, 0);
        int tipoAp, dias;
        double valorDiaria, totalPag;

        do{
            System.out.println("\nInforme o tipo de Apartamento desejado: " + 
            "\n01 - Apartamento Simples: " + 
            "\n02 - Apartemento Duplo\n ");

            tipoAp = in.nextInt();
        }while (tipoAp < 1 && tipoAp > 2);

        eq.setTipoAp(tipoAp);

        System.out.println("\nInforme a quantidade de dias desejados:\n");
        dias = in.nextInt(); eq.setDias(dias);
                

        valorDiaria = eq.calculaValor();
        totalPag = eq.valorTotal();

        if(tipoAp == 1){
            System.out.println("Tipo do Apartamento: Simples"  );
        }else if(tipoAp == 2){
            System.out.println("Tipo do Apartamento: Duplo"  );
        }
        System.out.println("Dias Desejados: " + dias + 
        "\nValor Total da diaria: " + totalPag);
    }
}
