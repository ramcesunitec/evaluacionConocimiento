package d_Empleado;


public class Arreglo {
    public static void main(String[] args) {
        Empleado personas[]=new Empleado[2];
        
        
        personas[0]=new Empleado("Ramces", 23, "Programador");
        personas[1]=new Empleado("Pedro", 28, "Contador");
        
        System.out.println("Empleado(indice 0) "+personas[0]);
        System.out.println("Empleado(indice 1) "+personas[1]);
        
        System.out.println("");
        
        for(int i=0;i<personas.length;i++){
            System.out.println("personas "+i+" ="+personas[i]);
        }
    }
}
