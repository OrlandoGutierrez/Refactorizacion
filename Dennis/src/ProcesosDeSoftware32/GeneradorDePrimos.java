package ProcesosDeSoftware32;
/*
------ DENNIS ORLANDO GUTIERREZ LEON
------ PROCESOS DE SOFTWARE 3-2
 */
public class GeneradorDePrimos {
    private static boolean esPrimo[];
    private static int primos[];
    
    public static int[] generarPrimos (int max)
    {
        if (max < 2){
            return new int[0];
        }else{
            inicializarCandidatos(max);
            eliminarMultiplos();
            return primos;
        }
    }
    
    private static void inicializarCandidatos(int max)
    {
       int i;
       esPrimo = new boolean[max+1];
       esPrimo[0] = esPrimo[1] = false;
       for (i=2; i<esPrimo.length; i++)
           esPrimo[i] = true;
    }
    
    private static void eliminarMultiplos (){
        int i;
        for(i=2; i<maxFactor(); i++)
            if(esPrimo[i])
                eliminarMultiplosDe(i);
    }
    
    private static int maxFactor()
    {
        return (int) Math.sqrt(esPrimo.length)+1;
    }
    
    private static void eliminarMultiplosDe(int i)
    {
        int multiplo;
        for(multiplo=2*i;
            multiplo<esPrimo.length;
            multiplo+=i)
            esPrimo[multiplo] = false;
    }
}
