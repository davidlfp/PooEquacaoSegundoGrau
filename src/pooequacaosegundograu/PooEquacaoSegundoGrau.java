
package pooequacaosegundograu;

import java.util.Scanner;


public class PooEquacaoSegundoGrau {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        Equacao eq;
        
        while(true){
            System.out.println("Digite o fator a: ");
            a = teclado.nextDouble();
            System.out.println("Digite o fator b: ");
            b = teclado.nextDouble();
            System.out.println("Digite o fator de c: ");
            c = teclado.nextDouble();
            
            eq = new Equacao(a,b,c);
            
            if(eq.calcularDelta()> 0){
                System.out.println("Raiz 1: "+eq.calcularRaiz1()+ " Raiz 2: " +eq.calcularRaiz2());
                
            }else{
                System.out.println("Delta negativo, não há raízes reais.");
            }
            System.out.println("");
            
            
        }
            
            
        
                
        
        
        
    }
    
}
