/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrukturData;

import java.util.*;

/**
 *
 * @author Tirana
 */
public class StrukturData_4 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("emty1 "+stack.isEmpty());
        Scanner inputan = new Scanner (System.in);
        System.out.println("panjang : ");
        int jml = inputan.nextInt();
        
        for (int i = 0; i < jml; i++) {
            
            System.out.println("masukkan isi ke " +i);
            String isi = inputan.next();
            stack.push(isi);
            
        }
        
        System.out.println("list "+stack);
        System.out.println("emty2 "+stack.isEmpty());
        
//        stack.push("adi");
//        stack.push("angga");
//        stack.push("bayu");
//        stack.push("naseh");
//        stack.push("adi");
        
        
        
        
        
//        System.out.println("Masukkan Kalimat:");
//        Scanner input= new Scanner(System.in);
//        String kalimat= input.nextLine();
//        
//        //Cara 1
//        String[]kata= kalimat.split(" ");
//        for (String listKata:kata){
//            System.out.println(listKata+"\n");
//        }
        
        //Cara 2
        
    }
}
