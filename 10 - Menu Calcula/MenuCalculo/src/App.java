import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Dados eq = new Dados(0, 0, 0, 0, 0, 0);
        Scanner in = new Scanner(System.in);

        int i;
        double n1, n2, soma,  mult, subMM, divisao;

        System.out.println("Informe dois numeros: ");
        n1 = in.nextDouble(); eq.setN1(n1);
        n2 = in.nextDouble(); eq.setN2(n2);

        soma = eq.somaNum();
        mult = eq.multipli();
        subMM = eq.subtracao();
        divisao = eq.divi();

       do{
        System.out.println("\n1 - soma" + 
        "\n2 - Multiplicação" + 
        "\n3 - Subtracão" + 
        "\n4 - Divisão" + 
        "\n5 - Sair" + "\n");

        i = in.nextInt();
            
        switch(i){
            case 1: System.out.println("\n" + soma); break;
            case 2: System.out.println("\n" + mult); break;
            case 3: System.out.println("\n" + subMM); break;
            case 4: System.out.println("\n" + divisao); break;
            default: System.out.println("Opção Invalida!!!");
        
        }
       }while(i != 5);

        
       
    }
}
