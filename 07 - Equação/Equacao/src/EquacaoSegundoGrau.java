public class EquacaoSegundoGrau {
    private double a;
    private double b;
    private double c;
    private double delta;
    private double x1;
    private double x2;
    private double x;
    private String metodo;
   


    public EquacaoSegundoGrau(double a, double b, double c, double delta, double x1, double x2, double x, String metodo) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = delta;
        this.x1 = x1;
        this.x2 = x2;
        this.x = x;
        this.metodo = metodo;
    }



    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    public double getDelta() {
        return delta;
    }
    public void setDelta(double delta) {
        this.delta = delta;
    }
    public double getX1() {
        return x1;
    }
    public void setX1(double x1) {
        this.x1 = x1;
    }
    public double getX2() {
        return x2;
    }
    public void setX2(double x2) {
        this.x2 = x2;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public String getMetodo() {
        return metodo;
    }
    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }
    
    public double calculaX(){
        x = -c / b;
        return x;
    }



    public double calculaDelta(){
        delta = Math.pow(b, 2) - 4 * a * c;
        return delta;
    }

    public double calculaX1(){
        x1 = ((-1 * b) + Math.sqrt(delta)) / 2 * a;
        return x1;
    }

    public double calculaX2(){
        x2 = ((-1 * b) - Math.sqrt(delta)) / 2 * a;
        return x2;
    }
    


    
    public String CalMetodo(){
       if (a == 0)
			if(b == 0)
				if (c == 0)
					System.out.println("Igualdade confirmada: 0 = 0.");
				else
					System.out.println("Coeficientes informados incorretamente.");
			else {
				System.out.println("Esta é uma equação de primeiro grau.");
                
				System.out.println("x = " + x);
			}
		else {
			System.out.println("Esta é uma equação de segundo grau.");
			
			if(delta < 0)
               System.out.println("Esta equação não possui raízes reais: delta = " + delta);
			else
			  if (delta == 0) {
				  System.out.println("Esta equação possui duas raízes reais iguais.");
				  
				  System.out.println("x1 = x2 = "  + x1);
			  }
			  else {
				  System.out.println("Esta equação possui duas raízes reais diferentes.");
				  
				  System.out.println("x1 = " + x1);
				  System.out.println("x2 = " + x2);
			  }
			
		}
				return metodo;
	}
}


    

    
    
    
    
    
    
