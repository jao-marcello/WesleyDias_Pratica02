import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Dados eq = new Dados(null, null, null, null, null);
        Scanner in = new Scanner(System.in);

        String sap, bol, cam, cal, blus;
        int op;

        sap = "R$99,99"; eq.setSap(sap);
        bol = "R$103,89"; eq.setBol(bol);
        cam = "R$49,98"; eq.setCam(cam);
        cal = "R$89,72"; eq.setCal(cal);
        blus = "R$97,35"; eq.setBlus(blus);

        do{
        System.out.println("Informe o codigo do produtos: " + 
        "\n1 - Sapato" + 
        "\n2 - Bolsa" +
        "\n3 - Camisa" + 
        "\n4 - Calça" + 
        "\n5 - Blusa" + 
        "\n6 - Sair: \n");

        op = in.nextInt();

        switch(op){
            case 1: System.out.println("Sapato: " + sap); break;
            case 2: System.out.println("Bolsa " + bol); break;
            case 3: System.out.println("Sapato: " + sap); break;
            case 4: System.out.println("Sapato: " + sap); break;
            case 5: System.out.println("Sapato: " + sap); break;
            case 6: System.out.println("Fim do Programa!!");break;
            default: System.out.println("Opção Invalida!!");

            }
        } while(op !=6);
    }
}
