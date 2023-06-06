/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author EXA
 */
class kendaran{
    protected String nama;
    protected String file;
    
    public void cetak(String nama, String warna, int tahun, int roda, String harga,String file){
     String fileName = "C:\\Users\\Administrator\\Desktop\\DANGER\\pbo\\"+file+".txt";
     String isi = "Daftar Keterangan Mobil, yaitu: \n1. Nama Mobil : " + nama +
                   "\n2. Warna : "+  warna +
                   "\n3. Tahun Dibuat : "+  tahun +
                   "\n4. Jumlah Roda : "+  roda +
                   "\n5. Harga : "+  harga ;
                   
             try (OutputStream fileOut = new FileOutputStream(fileName)){
               fileOut.write(isi.getBytes());
            System.out.println("system berhasil di tulis");
            fileOut.close();
        } catch (IOException e) {
            System.out.println("terjadi kesalahan"+ e.getMessage());
        }
    }
}

class pajero extends kendaran{
    protected String warna;
    protected int tahun;

    public pajero(String nama, String warna, int tahun, int roda, String harga,String file) {
        super.cetak(nama, warna, tahun, roda, harga, file);
    }
 
}

class expander extends kendaran{
    protected int roda;
    protected String harga;

    public expander(String nama, String warna, int tahun, int roda, String harga,String file) {
     super.cetak(nama, warna, tahun, roda, harga, file);
    }
    
    
}
public class main {
        
    public static void main(String[] args) {
        pajero pajero = new pajero("Pajero Sport", "Hitam", 2021, 0, "", "pajero");
        expander expander = new expander("Expander Sport", "", 0, 4, "250.000.000", "expander");
        
    }
    
}
