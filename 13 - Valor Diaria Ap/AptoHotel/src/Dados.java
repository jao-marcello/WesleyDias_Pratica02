public class Dados {
    private int tipoAp;
    private int apSimples;
    private int apDuplo;
    private int dias;
    private double valorDiaria;
    private double totalPag;
  
    public Dados(int tipoAp, int apSimples, int apDuplo, int dias, double valorDiaria, double totalPag) {
        this.tipoAp = tipoAp;
        this.apSimples = apSimples;
        this.apDuplo = apDuplo;
        this.dias = dias;
        this.valorDiaria = valorDiaria;
        this.totalPag = totalPag;
    }
    public int getTipoAp() {
        return tipoAp;
    }
    public void setTipoAp(int tipoAp) {
        this.tipoAp = tipoAp;
    }
    public int getApSimples() {
        return apSimples;
    }
    public void setApSimples(int apSimples) {
        this.apSimples = apSimples;
    }
    public int getApDuplo() {
        return apDuplo;
    }
    public void setApDuplo(int apDuplo) {
        this.apDuplo = apDuplo;
    }
    public int getDias() {
        return dias;
    }
    public void setDias(int dias) {
        this.dias = dias;
    }
    public double getValorDiaria() {
        return valorDiaria;
    }
    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    public double getTotalPag() {
        return totalPag;
    }
    public void setTotalPag(double totalPag) {
        this.totalPag = totalPag;
    }
   
    public double calculaValor(){
        if(tipoAp == 1){
            if(dias <10){
                valorDiaria = 100;
            }else if(dias >= 10 && dias <= 15){
                valorDiaria = 90;
            }else if(dias > 15){
                valorDiaria = 80;
            }
        }else if(tipoAp == 2){
            if(dias < 10){
                valorDiaria = 140;
            }else if(dias >= 10 && dias <= 15){
                valorDiaria = 120;
            }else if(dias > 15){
                valorDiaria = 100;
        }
    }return valorDiaria;
}

    public double valorTotal(){
        totalPag = dias * valorDiaria;
        return totalPag;
    }

}
