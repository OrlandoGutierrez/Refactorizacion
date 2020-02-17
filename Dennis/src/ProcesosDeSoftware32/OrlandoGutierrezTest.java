/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcesosDeSoftware32;
import junit.framework.*;
import java.util.*;
/**
/*
------ DENNIS ORLANDO GUTIERREZ LEON
------ PROCESOS DE SOFTWARE 3-2
 */
public class OrlandoGutierrezTest extends TestCase{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        junit.swingui.TestRunner.main(new String[] {"OrlandoTest"});
    }
    
    
    public OrlandoGutierrezTest(String nombre){
        super(nombre);
    }
    public void testPrimos(){
        int[] nullArray = OrlandoGutierrez.generarPrimos(0);
        assertEquals(nullArray.length, 0);
        int[] minArray = OrlandoGutierrez.generarPrimos(2);
        assertEquals(minArray.length, 1);      
        assertEquals(minArray[0], 2);
        
        int[] threeArray = OrlandoGutierrez.generarPrimos(3);      
        assertEquals(threeArray.length, 2);      
        assertEquals(threeArray[0], 2);      
        assertEquals(threeArray[1], 3);
        
        int[] centArray = OrlandoGutierrez.generarPrimos(100);      
        assertEquals(centArray.length, 25);      
        assertEquals(centArray[24], 97);
        
    }
}
