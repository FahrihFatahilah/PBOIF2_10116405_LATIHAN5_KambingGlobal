/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2_10116405_latihan5;

/**
 *
 * @author Fahrih Fatahilah
 * Nama  : Fahrih Fatahilah
 * Kelas : IF-2 / PBO-IF2
 * Nim   : 10116405
 * 
 */
public class PBOIF2_10116405_LATIHAN5 {
 int jumlahKambing = 88;
    public void getJumlahKambing(){
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }    
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PBOIF2_10116405_LATIHAN5 kambingSusu = new PBOIF2_10116405_LATIHAN5();
        
        kambingSusu.getJumlahKambing();
        
        kambingSusu.tambahKambing();
        
        kambingSusu.getJumlahKambing();
    }
    
}
