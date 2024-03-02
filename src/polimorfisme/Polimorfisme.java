/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfisme;

/**
 *
 * @author ASUS
 */
public class Polimorfisme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("--------JENIS MAMALIA--------");
         System.out.println("[1]. Ikan Lumba_lumba");
         System.out.println("[2]. Kelinci");
         System.out.println("[3]. Cheetah");
         System.out.println("Masukan pilihan [1..3] : "); 
         
         Mamalia generalx = new Mamalia ();
         Lumba_lumba turunan1 = new Lumba_lumba();
         Kelinci turunan2 = new Kelinci();
         Cheetah turunan3 = new Cheetah();
            switch (1){
                case 1 :
                    generalx.kelasmamalia();
                    turunan1.TampilkanLumba_lumba();
                    
                    case 2 :
                    generalx.kelasmamalia();
                    turunan2.TampilkanKelinci();
                    
                    case 3 :
                    generalx.kelasmamalia();
                    turunan3.TampilkanCheetah();

            }
    }
    
}
