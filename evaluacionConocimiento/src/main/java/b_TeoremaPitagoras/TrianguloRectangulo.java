
package b_TeoremaPitagoras;

public class TrianguloRectangulo extends Triangulo{

    

    public TrianguloRectangulo(float ladoA, float ladoB, float ladoC) {
        super(ladoA, ladoB, ladoC);
    }

    public TrianguloRectangulo() {
    }
    
    
    
    public static float calculo(float ladoA, float ladoB){
        float ladoC;
        
        ladoC=(float) (Math.pow(ladoA, 2) +Math.pow(ladoB, 2));
        
        return ladoC;
    }
}
