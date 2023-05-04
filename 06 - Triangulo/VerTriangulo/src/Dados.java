public class Dados {
    private double x;
    private double y;
    private double z;
    private String resultado;
    
    public Dados(double x, double y, double z, String resultado) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.resultado = resultado;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }
    public String getResultado() {
        return resultado;
    }
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String ResulTri() {
        if ((y - z) < x && x < (y + z) || (x - z) < y && y < (x + z) || (x - y) < z && z < (x + y)){
            resultado = "os três valores informados podem ser os comprimentos dos lados de um triângulo";
        }else{
            resultado = "Os três valores informados não podem ser os comprimentos dos lados de um triângulo";
        }return resultado;
    }

}