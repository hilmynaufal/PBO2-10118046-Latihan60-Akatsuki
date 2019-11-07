/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118046.latihan60.akatsuki;

/**
 *
 * @author ASUS
 */
public class Akatsuki extends Profile{

     public Akatsuki () {
        int pilih = pilihAnggota();
        switch (pilih) {
            case 1:
                this.id = 1;
                this.namaLengkap = "Pain";
                this.asal = "Amegakure";
                this.cincin = "零 (\"Nol\",\"Tidak ada\")";
                this.posisiCincin = "Jempol kanan";
                this.partner = "Konan";
                break;
            case 2:
                this.id = 2;
                this.namaLengkap = "Konan";
                this.asal = "Amegakure";
                this.cincin = "白 (\"Putih\")";
                this.posisiCincin = "Jari Tengah, Tangan Kanan";
                this.partner = "Pain";
                break;
            case 3:
                this.id = 3;
                this.namaLengkap = "Kakuzu";
                this.asal = "Takigakure";
                this.cincin = "北 (\"Utara\")";
                this.posisiCincin = "Jari tengah kiri";
                this.partner = "Hidan";
                break;
            case 4:
                this.id = 4;
                this.namaLengkap = "Hidan";
                this.asal = "Yugakure";
                this.cincin = "三 (\"Tiga\")";
                this.posisiCincin = "Telunjuk kiri";
                this.partner = "Kakuzu";
                break;
            case 5:
                this.id = 5;
                this.namaLengkap = "Deidara";
                this.asal = "Iwagakure";
                this.cincin = "青(\"Biru/Hijau\")";
                this.posisiCincin = "Telunjuk kanan";
                this.partner = "Sasori";
                break;
            case 6:
                this.id = 6;
                this.namaLengkap = "Sasori";
                this.asal = "Sunagakure";
                this.cincin = "玉 (\"Virgo\")";
                this.posisiCincin = "Jempol kiri";
                this.partner = "Orochimaru (dulu), Deidara";
                break;
            case 7:
                this.id = 7;
                this.namaLengkap = "Itachi Uchiha";
                this.asal = "Konohagakure";
                this.cincin = "朱 (\"Merah Darah\")";
                this.posisiCincin = "Jari manis kanan";
                this.partner = "Kisame";
                break;
            case 8:
                this.id = 8;
                this.namaLengkap = "Kisame Hoshigaki";
                this.asal = "Kirigakure";
                this.cincin = "南 (\"Selatan\")";
                this.posisiCincin = "Jari manis kiri";
                this.partner = "Itachi";
                break;
            case 9:
                this.id = 9;
                this.namaLengkap = "Tobi (Obito Uchiha)";
                this.asal = "Konohagakure";
                this.cincin = "玉 (\"Berlian\")";
                this.posisiCincin = "Jempol kiri";
                this.partner = "Deidara";
                break;
            case 10:
                this.id = 10;
                this.namaLengkap = "Orochimaru";
                this.asal = "Konohagakure";
                this.cincin = "空 (\"Langit\")";
                this.posisiCincin = "Jari Kelingking Kiri";
                this.partner = "Sasori";
                break;
            case 11:
                this.id = 11;
                this.namaLengkap = "Zetsu";
                this.asal = "";
                this.cincin = "";
                this.posisiCincin = "";
                this.partner = "";
                break;
            default:
                break;
        }
    }

    @Override
    public int pilihAnggota() {
        return super.pilihAnggota(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tampilProfile() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n=============Profile Karakter============");
        System.out.println("-----------------------------------------");
        System.out.println("Nama \t\t: " + getNamaLengkap());
        System.out.println("Asal \t\t: " + getAsal());
        System.out.println("Cincin \t\t: " + getCincin());
        System.out.println("Posisi Cincin \t: " + getPosisiCincin());
        System.out.println("Partner \t: " + getPartner());
    }

    
}
