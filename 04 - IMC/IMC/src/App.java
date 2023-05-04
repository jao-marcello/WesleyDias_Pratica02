import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Dados eq = new Dados(0, 0, 0, null);
        String imc;
        double altura, peso, mediaImc;

        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua ALTURA em METROS:"));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu PESO em KG: "));

        eq.setAltura(altura);
        eq.setPeso(peso);

        mediaImc = eq.calculaImc();
        imc = eq.TipoImc();

        JOptionPane.showMessageDialog(null, "Seu IMC é de: " + mediaImc + 
        "\nVocê está: " + imc);
    }
}
