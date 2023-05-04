import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        EquacaoSegundoGrau eq = new EquacaoSegundoGrau(0, 0, 0, 0, 0, 0, 0, null);
        Double a, b, c, delta, x1, x2, x;
        String metodo;

        System.out.println("Informe os valores de A, B e C: ");
        a = in.nextDouble(); eq.setA(a);
        b = in.nextDouble(); eq.setB(b);
        c = in.nextDouble(); eq.setC(c);

        delta = eq.calculaDelta();
        x = eq.calculaX();
        x1 = eq.calculaX1();
        x2 = eq.calculaX2();
        metodo = eq.CalMetodo();
        
        System.out.println(metodo);
    }

}