/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassandMultipleObject;

/**
 *
 * @author EXA
 */
public class kelas {
    private String nama;
    private String nbi;
    private int nilai;

    public kelas(String nama, String nbi, int nilai) {
        this.nama = nama;
        this.nbi = nbi;
        this.nilai = nilai;
    }
    
    public void tampil(){
        System.out.println("NAMA : " + nama);
        System.out.println("NIM : " + nbi);
        System.out.println("NILAI : " + nilai);
    }
    
    public static void main(String[] args) {
        kelas siswa1 = new kelas("Eka Kurniawan", "1462200171", 100);
        kelas siswa2 = new kelas("Nofan Wahyu", "1462200170", 99);
        kelas siswa3 = new kelas("John Cena", "11111111", 101);
        
        siswa1.tampil();
        System.out.println("");
        siswa2.tampil();
        System.out.println("");
        siswa3.tampil();
    }
           
    
}
