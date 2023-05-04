public class Dados {
    private double nota1;
    private double nota2;
    private double media;
    private String resultado;
    
    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    public String getResultado() {
        return resultado;
    }
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public double calculaMedia(){
        media = (nota1 + nota2) /2;
        return media;
    }
    
    public String resultFinal(){
        if(media <= 7){
            resultado = "Reprovado";
        }else{
            resultado = "Aprovado";
        }
        return resultado;
    }
}
