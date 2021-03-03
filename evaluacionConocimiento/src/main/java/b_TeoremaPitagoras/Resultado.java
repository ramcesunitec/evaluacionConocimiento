
package b_TeoremaPitagoras;

import java.util.Scanner;

public class Resultado {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        TrianguloRectangulo tr= new TrianguloRectangulo();
        float a=scanner.nextFloat();
        float b=scanner.nextFloat();
                
        float c=tr.calculo(a, b);
        System.out.println("Resultado= "+c);
        
        TrianguloRectangulo tra=new TrianguloRectangulo(a, b, c);
        Triangulo t=new Triangulo();
        t.toString();
            
    }
}
