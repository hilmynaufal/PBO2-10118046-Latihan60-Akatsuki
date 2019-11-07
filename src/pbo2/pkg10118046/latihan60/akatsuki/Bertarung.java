/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118046.latihan60.akatsuki;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bertarung extends Akatsuki implements Senjata, Jurus{

    private String senjata, jurus;
    
   
    
    @Override
    public int tampilSenjata() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n==========Pilih Senjatamu=========");
        System.out.println("----------------------------------");
        System.out.println("1. Kunai");
        System.out.println("2. Samehada");
        System.out.println("3. Sabit Beramata Tiga");
        System.out.println("4. Kertas");
        System.out.println("5. Tanah Liat");
        System.out.print("\nPilih Senjata: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    @Override
    public int tampilJurus() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n===========Pilih Jurusmu==========");
        System.out.println("----------------------------------");
        System.out.println("1. Shinra Tensei");
        System.out.println("2. Amaterasu");
        System.out.println("3. Suiton: Suikodan no Jutsu");
        System.out.println("4. Kagebunshin no Jutsu");
        System.out.println("5. Katon: Gokakyuu no Jutsu");
        System.out.print("\nPilih Jurus: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    @Override
    public void keluarakanSenjata(int pilih) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        switch (pilih) {
            case 1:
                System.out.println("\n" + getNamaLengkap() + " mengeluarkan Kunai");
                break;
            case 2:
                if (getId() != 2) System.out.println(getNamaLengkap() + " tidak bisa mengeluarkan Samehada karena sedang digunakan Kisame untuk memotong daging");
                else System.out.println(getNamaLengkap() +" mengeluarkan Samehada");
                break;
            case 3:
                if (getId() != 4) System.out.println(" tidak bisa mengeluarkan Sabit Bermata tiga karena sedang digunakan Hidan untuk Ritual-nya");
                else System.out.println(getNamaLengkap() + " mengeluarkan Sabit Bermata Tiga");
                break;
            case 4:
                if (getId() != 2) System.out.println(getNamaLengkap() + " tidak bisa mengeluarkan kertas karena habis dipake buat origami oleh Konan");
                else System.out.println(getNamaLengkap() + " mengeluarkan Kertas");
                break;
            case 5:
                if (getId() != 5) System.out.println(getNamaLengkap() + " tidak bisa mengeluarkan tanah liat karena Deidara sedang sibuk membuat seni");
                break;
            default:
                break;
        }
    }

    @Override
    public void keluarkanJurus(int pilih) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        switch (pilih) {
            case 1:
                if (getId() != 1) System.out.println(getNamaLengkap() + " tidak bisa mengeluarkan Shinra tensei karena tidak mempunyai Rinnegan");
                else System.out.println(getNamaLengkap() + " mengeluarkan Shinra Tensei dan melempar objek di sekitarnya");
                break;
            case 2:
                if (getId() != 7) System.out.println(getNamaLengkap() +" tidak bisa mengeluarkan Amaterasu karena tidak mempunyai Mangekyo Sharingan");
                else System.out.println(getNamaLengkap() + " menggunakan Amaterasu dan membakar musuh nya dengan api hitam");
                break;
            case 3:
                System.out.println(getNamaLengkap() + " menggunakan jurus Suikodan dan mengeluarkan ombak air");
                break;
            case 4:
                System.out.println(getNamaLengkap() + " menggunakan jurus Kagebunshin untuk menggandakan dirinya");
                break;
            case 5:
                System.out.println(getNamaLengkap() + " menggunakan jurus Gokakyou untuk mengeluarkan semburan api");
                break;
            default:
                break;
        }
        
    }
    
    
}
