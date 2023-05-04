import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Dados eq = new Dados();
        String entrada, triangulo;
        double lado01, lado02, lado03;

        entrada = JOptionPane.showInputDialog("Digite o tamanho de um lado do triangulo: ");
        lado01 = Double.parseDouble(entrada);
        eq.setLado01(lado01);

        entrada = JOptionPane.showInputDialog("Digite o tamanho do proximo lado do Triangulo: ");
        lado02 = Double.parseDouble(entrada);
        eq.setLado02(lado02);

        entrada = JOptionPane.showInputDialog("Digite o tamanho do ultimo lado do triangulo: ");
        lado03 = Double.parseDouble(entrada);
        eq.setLado03(lado03);

        triangulo = eq.tipoTri();

        JOptionPane.showMessageDialog(null, "O Triangulo descrito é um: " + triangulo);
    }
}
