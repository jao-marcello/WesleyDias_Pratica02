import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Dados eq = new Dados();
        String entrada, resultado;
        double nota1, nota2, media;

        entrada = JOptionPane.showInputDialog("Informe a sua 1º Nota: ");
        nota1 = Double.parseDouble(entrada);
        eq.setNota1(nota1);

        entrada = JOptionPane.showInputDialog("Informe sua 2º Nota: ");
        nota2 = Double.parseDouble(entrada);
        eq.setNota2(nota2);

        media = eq.calculaMedia();
        resultado = eq.resultFinal();

        JOptionPane.showMessageDialog(null,"Você está: " + resultado);
    }
}
