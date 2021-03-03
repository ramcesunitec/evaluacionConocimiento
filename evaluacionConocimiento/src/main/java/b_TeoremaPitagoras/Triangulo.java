package b_TeoremaPitagoras;

public class Triangulo {
   protected float ladoA;
   protected float ladoB;
   protected float ladoC;

    public Triangulo() {
    }

    public Triangulo(float ladoA, float ladoB, float ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public float getLadoC() {
        return ladoC;
    }

    public void setLadoC(float ladoC) {
        this.ladoC = ladoC;
    }

    public float getLadoA() {
        return ladoA;
    }

    public void setLadoA(float ladoA) {
        this.ladoA = ladoA;
    }

    public float getLadoB() {
        return ladoB;
    }

    public void setLadoB(float ladoB) {
        this.ladoB = ladoB;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "ladoA=" + ladoA + ", ladoB=" + ladoB + ", ladoC=" + ladoC + '}';
    }
   
    
}
