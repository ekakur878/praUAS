/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author EXA
 */
class hewan{
    public void hewan(){
        System.out.println("Daftar hewan ");
    }
}

class Mamalia extends hewan{
    public void nama(){
        System.out.println("Hewan mamalia");
    }
}

class kucing extends Mamalia{
    @Override
    public void nama(){
        System.out.println("Kucing adalah hewan mamalia");
    }
    
    public void nama(int kaki){
        System.out.println("jumlah Kaki : " + kaki);
    }
}


public class main {
    public static void main(String[] args) {
        kucing kucing = new kucing();
        kucing.hewan();
        kucing.nama();
        kucing.nama(4);
    }
}
