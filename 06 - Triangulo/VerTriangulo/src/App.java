import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    Dados eq = new Dados(0, 0, 0, null);
    double x, y , z;
    String resultado;
    
        System.out.println("Informar os valores dos três lados do triangulo (X - Y - Z):");
        x = in.nextDouble(); eq.setX(x);
        y = in.nextDouble(); eq.setY(y);
        z = in.nextDouble(); eq.setZ(z);

        resultado = eq.ResulTri();

        System.out.println(resultado + 
        "\nFim do programa!");
    
    }
}
