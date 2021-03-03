package a_SumaImpares;

public class SumandoNones {
    public static void main(String[] args) {
        int i;
        int resultado = 0;
        
        for(i=1;i<=99;i++){
            if(i%2!=0){
                resultado=resultado+i;
            }
        }
        
        System.out.println("Resultado= "+resultado);
    }
}
