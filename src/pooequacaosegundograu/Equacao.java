
package pooequacaosegundograu;


public class Equacao {
    
    double a;
    double b;
    double c;
    
    public Equacao(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;        
    }

    public double calcularDelta(){
        return (this.b * this.b) - 4 * (this.a*this.c);
        
    }
    
    public double calcularRaiz1(){
        return -(this.b + Math.sqrt(this.calcularDelta()))/2*this.a;
    }
    
    public double calcularRaiz2(){
        return -(this.b - Math.sqrt(this.calcularDelta()))/2*this.a;
    }
    



    
}
