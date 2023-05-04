public class Dados {
    private double n1;
    private double n2;
    private double soma;
    private double mult;
    private double subMM;
    private double divisao;
    
    public Dados(double n1, double n2, double soma, double mult, double subMM, double divisao) {
        this.n1 = n1;
        this.n2 = n2;
        this.soma = soma;
        this.mult = mult;
        this.subMM = subMM;
        this.divisao = divisao;
    }
    public double getN1() {
        return n1;
    }
    public void setN1(double n1) {
        this.n1 = n1;
    }
    public double getN2() {
        return n2;
    }
    public void setN2(double n2) {
        this.n2 = n2;
    }
    public double getSoma() {
        return soma;
    }
    public void setSoma(double soma) {
        this.soma = soma;
    }
    public double getMult() {
        return mult;
    }
    public void setMult(double mult) {
        this.mult = mult;
    }
    public double getSubMM() {
        return subMM;
    }
    public void setSubMM(double subMM) {
        this.subMM = subMM;
    }
    public double getDivisao() {
        return divisao;
    }
    public void setDivisao(double divisao) {
        this.divisao = divisao;
    }


    public double somaNum(){
        soma = n1 + n2;
        return soma;
    }
    public double multipli(){
        mult = n1 * n2;
        return mult;
    }
    public double subtracao(){
        if(n1 > n2){
            subMM = n1 - n2;
        }else if(n1 < n2){
            subMM = n2 - n1;
        }else if(n1 == n2){
            subMM = 0;
        }return subMM;
    }
    public double divi(){
        if(n1 == 0 || n2 == 0){
            divisao = 0;
        }else{
            divisao = n1 / n2;
        }return divisao;
    }
}
