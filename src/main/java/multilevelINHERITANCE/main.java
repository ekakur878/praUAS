/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multilevelINHERITANCE;

/**
 *
 * @author EXA
 */
class kendaraan{
    protected String nama;
    public void keterangan(){
        System.out.println("Daftar kendaraan ");
    }
}
class darat extends kendaraan{
    private String jenis;
    private String BBM;
    
    @Override
    public void keterangan(){
        super.keterangan();
        System.out.println("Daftar kendaraan darat");
    }
}

class udara extends kendaraan{
    private String jenis;
    private String BBM;
    
    @Override
    public void keterangan(){
        super.keterangan();
        System.out.println("Daftar kendaraan udara");
    }
}
class mobil extends darat{
    public mobil(String nama, String jenis, String BBM){
        System.out.println("===========================");
        System.out.println("Nama Kendaraan : "+nama);
        System.out.println("Nama Kendaraan : "+jenis);
        System.out.println("Nama Kendaraan : "+BBM);
        
    }
}

class kereta extends darat{
    public kereta(String nama, String jenis, String BBM){
        System.out.println("===========================");
        System.out.println("Nama Kendaraan : "+nama);
        System.out.println("Nama Kendaraan : "+jenis);
        System.out.println("Nama Kendaraan : "+BBM);
        
    }
}
class pesawat extends udara{
    public pesawat(String nama, String jenis, String BBM){
        System.out.println("===========================");
        System.out.println("Nama Kendaraan : "+nama);
        System.out.println("Nama Kendaraan : "+jenis);
        System.out.println("Nama Kendaraan : "+BBM);
        
    }
}
class helikopter extends udara{
    public helikopter(String nama, String jenis, String BBM){
        System.out.println("===========================");
        System.out.println("Nama Kendaraan : "+nama);
        System.out.println("Nama Kendaraan : "+jenis);
        System.out.println("Nama Kendaraan : "+BBM);
        
    }
}
public class main {
    public static void main(String[] args) {
   
    darat tes2 = new darat();
    tes2.keterangan();
    
    mobil tes = new mobil("mobil", "Kendaraan Bermotor", "bensin");
    kereta kerata = new kereta("kereta api", "Kendaraan Rel", "solar");
   
    System.out.println("");
    
    udara udara = new udara();
    udara.keterangan();
    
    pesawat pesawat = new pesawat("Pesawat Terbang", "Pesawat", "Avtur");
    helikopter helikopter = new helikopter("helikopter", "Pesawat", "Avtur jet A-1");
    }
}
