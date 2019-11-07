/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118046.latihan60.akatsuki;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : membuat karakter berdasarkan karakter kelompok Akatsuki dari anime Naruto
 */
public class PBO210118046Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bertarung akatsuki = new Bertarung();
        akatsuki.tampilProfile();
        int pilihSenjata = akatsuki.tampilSenjata();
        int pilihJurus = akatsuki.tampilJurus();
        akatsuki.keluarakanSenjata(pilihSenjata);
        akatsuki.keluarkanJurus(pilihJurus);
        
    }

}
