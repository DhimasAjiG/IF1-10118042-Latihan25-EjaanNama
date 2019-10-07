/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118042.latihan25.ejaannama;

import java.util.Scanner;

/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program   : Program ini berisi program Untuk Mengeja Nama Depan
 */
public class IF110118042Latihan25EjaanNama {

    public static void main(String[] args) {
           String nama;
        
        //input
        System.out.print("Masukkan nama depan anda : ");
        Scanner tempNama = new Scanner(System.in);
        nama = tempNama.nextLine();
        
        
        // proses
        char ejaan [] = nama.toCharArray();
        
        //output
        
        for(int i = 0; i < ejaan.length ; i++){
            System.out.println("Huruf Ke - " + (i+1) + " : " + ejaan[i]);
        }
        
    }
    
}