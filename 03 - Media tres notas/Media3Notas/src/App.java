import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Dados eq = new Dados(0, 0, 0, 0, null);
        String resultado, entrada;
        double nota1, nota2, nota3, media;

        do{
            entrada = JOptionPane.showInputDialog("Informe a 1º Nota (entre 0 e 10): ");
            nota1 = Double.parseDouble(entrada);
        } while (nota1 < 0 || nota1 > 10);
        eq.setNota1(nota1);

        do {
           entrada = JOptionPane.showInputDialog("Informe a 2º Nota (entre 0 e 10): ");
           nota2 = Double.parseDouble(entrada);
        } while (nota2 < 0 || nota2 > 10);
        eq.setNota2(nota2);


        do {
            entrada = JOptionPane.showInputDialog("Infome a 3º Nota (entre 0 e 10): ");
            nota3 = Double.parseDouble(entrada);
        } while (nota3 < 0 || nota3 > 10);
        eq.setNota3(nota3);

        

        media = eq.calculaMedia();
        resultado = eq.calculaResul();

        JOptionPane.showMessageDialog(null, "O aluno foi: " + resultado);
    }

}
