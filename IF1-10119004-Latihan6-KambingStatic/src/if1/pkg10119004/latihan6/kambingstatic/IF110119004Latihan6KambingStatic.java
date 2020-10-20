/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan6.kambingstatic;

/**
 *
 * @author ENDOG
 * NAMA     : Muhamad Ramadan
 * KELAS    : IF 1
 * NIM      : 10119004
 * Deskripsi Program : Program ini berisi untuk menampilkan
 * value ke layar
 */
public class IF110119004Latihan6KambingStatic {

    /**
     * @param args the command line arguments
     */
    public class Mamalia {
        //variabel jumlah kambing dideklarasikan sebagai statik
        public static int jumlahKambing;    
    }
    
    
    public class KambingStatic {
        //NAMA_KAMBING sebagai konstanta
        public static final String NAMA_KAMBING ="MIDUN";
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing =485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);   
    }
    
}
