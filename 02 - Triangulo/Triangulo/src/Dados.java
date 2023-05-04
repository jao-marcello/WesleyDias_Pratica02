public class Dados {
    private double lado01;
    private double lado02;
    private double lado03;
    private String triangulo;
    
    public double getLado01() {
        return lado01;
    }
    public void setLado01(double lado01) {
        this.lado01 = lado01;
    }
    public double getLado02() {
        return lado02;
    }
    public void setLado02(double lado02) {
        this.lado02 = lado02;
    }
    public double getLado03() {
        return lado03;
    }
    public void setLado03(double lado03) {
        this.lado03 = lado03;
    }
    public String getTrinagulo() {
        return triangulo;
    }
    public void setTrinagulo(String triangulo) {
        this.triangulo = triangulo;
    }

    public String tipoTri(){
        if(lado01 == lado02 && lado02 == lado03){
            triangulo = "Equilátero";

        }else if(lado01 == lado02 || lado01 == lado03 || lado02 == lado03){
            triangulo = "Isósceles";
            
        }else{
            triangulo = "Escaleno";
        }
        return triangulo;
    }
}
