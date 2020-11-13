/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan41.massajenis;

/**
 *
 * @author SystemOs
 * Nama      : Mochammad Faishal
 * NIM       : 10119048
 * Kelas     : IF2
 * Deskripsi : Berisi program hitung massa jenis..
 */
public class Kubus {
    private int sisi;
    private int massa;
    
    public int getSisi(){
        return sisi;
    }
    
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    
    public int getMassa(){
        return massa;
    }
    
    public void setMassa(int massa){
        this.massa = massa;
    }
    
    public int hitungVolume(int parSisi){
        return(int)Math.pow(parSisi,3);
    }
    
    public int hitungMassa(int parMassa, int volume){
        this.massa = parMassa/volume;
        
        return this.massa;
    }
}
