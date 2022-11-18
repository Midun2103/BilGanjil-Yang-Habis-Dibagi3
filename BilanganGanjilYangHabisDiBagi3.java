/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilangan.ganjil.yang.habis.di.bagi.pkg3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class BilanganGanjilYangHabisDiBagi3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        int y;
        System.out.print("\t Habis Dibagi 3\n");
        
        System.out.print("\n Masukkan Batas Nilai : ");
        y = userInput.nextInt();
        
        System.out.print("\n Bilangannya : ");
        for (int i = 2; i <= y; i++){
            if (i % 3 == 0){
                System.out.print(i + " ");
    
            }
        }
    }
}
