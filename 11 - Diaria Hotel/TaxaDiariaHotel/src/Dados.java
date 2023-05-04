public class Dados {
    private double dias;
    private double diaria;
    private double taxa;
    private double total;
  
  
    public Dados(double dias, double diaria, double taxa, double total) {
        this.dias = dias;
        this.diaria = diaria;
        this.taxa = taxa;
        this.total = total;
    }
    public double getDias() {
        return dias;
    }
    public void setDias(double dias) {
        this.dias = dias;
    }
    public double getDiaria() {
        return diaria;
    }
    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }
    public double getTaxa() {
        return taxa;
    }
    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    
    public double calculaTaxa(){
        if(dias < 15){
            taxa = 15;
        }else if(dias == 15){
            taxa = 10;
        }else if(dias > 15){
            taxa = 5;
        }return taxa;
    }

    public double gastoTotal(){
        total = (diaria * dias) + (taxa * dias);
        return total;
    }
    
}
