/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MethodinClass;

/**
 *
 * @author EXA
 */
public class main {
    public void method1() {
        System.out.println("Ini adalah method 1.");
    }

    public int method2(int a, int b) {
        int hasil = a + b;
        return hasil;
    }

    public void method3(String nama) {
        System.out.println("Halo, " + nama + "! Ini adalah method 3.");
    }

    public double method4(double angka) {
        double hasil = Math.sqrt(angka);
        return hasil;
    }

    public static void main(String[] args) {
        main myObj = new main();

        myObj.method1();                      // Output: Ini adalah method 1.

        int hasilPenjumlahan = myObj.method2(5, 3);
        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);  // Output: Hasil penjumlahan: 8

        myObj.method3("Eka Kurniawan");                // Output: Halo, John! Ini adalah method 3.

        double angka = 16.0;
        double hasilAkar = myObj.method4(angka);
        System.out.println("Akar dari " + angka + " adalah: " + hasilAkar);  // Output: Akar dari 16.0 adalah: 4.0
        
        System.out.println("=======================================================");
        
        main myObj2 = new main();

        myObj2.method1();                      // Output: Ini adalah method 1.

        int Penjumlahan = myObj2.method2(5, 10);
        System.out.println("Hasil penjumlahan: " + Penjumlahan);  // Output: Hasil penjumlahan: 8

        myObj2.method3("Nofan Wahyu");                // Output: Halo, John! Ini adalah method 3.

        double angka2 = 16.0;
        double hasilAkar2 = myObj2.method4(angka);
        System.out.println("Akar dari " + angka2 + " adalah: " + hasilAkar2);  // Output: Akar dari 16.0 adalah: 4.0
        
        System.out.println("=======================================================");

        main myObj3 = new main();

        myObj3.method1();                      // Output: Ini adalah method 1.

        int hasilPenjumlahan3 = myObj3.method2(20, 30);
        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan3);  // Output: Hasil penjumlahan: 8

        myObj3.method3("John Cena");                // Output: Halo, John! Ini adalah method 3.

        double angka3 = 16.0;
        double hasilAkar3 = myObj.method4(angka);
        System.out.println("Akar dari " + angka3 + " adalah: " + hasilAkar3);  // Output: Akar dari 16.0 adalah: 4.0

    }
}
