public class Dados {
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;
    private String resultado;
    
    public Dados(double nota1, double nota2, double nota3, double media, String resultado) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = media;
        this.resultado = resultado;
    }
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
    public double getNota3() {
        return nota3;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
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
        media = (nota1 + nota2 + nota3) /3;
        return media;
    }

    public String calculaResul(){
        if(media >= 0 && media < 3){
            resultado = "Reprovado";
        }else if(media >= 3 && media <7){
            resultado = "Exame";    
        }else if(media >= 7 && media <= 10){
            resultado = "Aprovado";
        }
        return resultado;
    }
}

