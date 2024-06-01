/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_mod3_1302210004;

/**
 *
 * @author ASUS
 */
public class Lingkaran {
    String warna;
    double jariJari;
    
    public Lingkaran(String warna, double jariJari){
        this.warna = warna;
        this.jariJari = jariJari;
    }
    
    public void printWarna_1302210004(){
        System.out.println("Warna objek lingkaran adalah " + warna);
    }
    
    public void printKeliling_1302210004(){
        double keliling = 2 * 22.0/7.0 * jariJari;
        System.out.println("Keliling objek lingkaran adalah " + (int)keliling);
    }
    
    public void printLuas_1302210004(){
        double luas = 22.0/7.0 * jariJari * jariJari;
        System.out.println("Luas objek lingkaran adalah " + luas);
    }
}
