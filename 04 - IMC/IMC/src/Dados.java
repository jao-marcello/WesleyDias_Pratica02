public class Dados {
    private double altura;
    private double peso;
    private double mediaImc;
    private String imc;
    
    public Dados(double altura, double peso, double mediaImc, String imc) {
        this.altura = altura;
        this.peso = peso;
        this.mediaImc = mediaImc;
        this.imc = imc;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getMediaImc() {
        return mediaImc;
    }
    public void setMediaImc(double mediaImc) {
        this.mediaImc = mediaImc;
    }
    public String getImc() {
        return imc;
    }
    public void setImc(String imc) {
        this.imc = imc;
    }
    
    public double calculaImc(){
        mediaImc = peso / Math.pow(altura, 2);
        return mediaImc;
    }

    public String TipoImc(){
        if(mediaImc < 20){
            imc = "Abaixo do Peso";
        }else if(mediaImc >= 20 && mediaImc < 25){
            imc = "Normal";
        }else if(mediaImc >= 25 && mediaImc < 30){
            imc = "Sobrepeso";
        }else if(mediaImc >= 30 && mediaImc < 40){
            imc = "Obesidade";
        }else if(mediaImc > 40){
            imc = "Obesidade Mórbida";
        }
        return imc;
    }
    
}
