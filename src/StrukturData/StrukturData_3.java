/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrukturData;

import java.util.Scanner;

/**
 *
 * @author Tirana
 */
public class StrukturData_3 {
    public static void main (String[]args){
        //char[] str1= new char[20];
        String str1= "",str2="";
        menu();
        System.out.println("\nMasukkan Pilihan:");
        Scanner input= new Scanner(System.in);
        int pilihan=input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("Masukkan Kata:");
                input= new Scanner(System.in);
                str1=input.next();
                System.out.println("Kata yang telah dimasukkan adalah "+str1);
                break;
            case 2:
                System.out.println("Masukkan Kata Pertama:");
                input= new Scanner(System.in);
                str1=input.next();
                System.out.println("Masukkan Kata Kedua:");
                input= new Scanner(System.in);
                str2=input.next();
                System.out.println("Penggabungan Kata"+str1+str2);
                System.out.println("Penggabungan Kata"+str1.concat(str2));
                break;
            case 3:
                System.out.println(str1.toUpperCase());
                System.out.println(str1.toLowerCase());
                break;
            case 4:
                System.out.println("Panjang dari kata "+str1+" adalah "+str1.length()+"karakter");                
                break;
            case 5:                
                System.out.println("Masukkan Kata:");
                input= new Scanner(System.in);
                str1=input.next();
                
                // Cara 1
//                for(int i=str1.toCharArray().length-1;i>=0;i--){
//                    str2+=str1.toCharArray()[i];
//                }
//                System.out.println("Reverse String dari "+str1+" adalah "+str2);  
                
               // Cara 2 
                
                str2= new StringBuffer(str1).reverse().toString();
                System.out.println("Reverse String dari "+str1+" adalah "+str2);  
                break;
            case 6:
                System.out.println("Masukkan Kata kedua:");
                input= new Scanner(System.in);
                str2=input.next();
                System.out.println("Kata kedua yang telah dimasukkan adalah "+str2);
                if (str1.equalsIgnoreCase(str2)){
                    System.out.println("Kedua kata sama");
                } else {
                    System.out.println("Kedua kata tidak sama");
                }
                break;
            case 7:
                System.out.println("Masukkan Kata:");
                input= new Scanner(System.in);
                str1=input.next();
                
                // Cara 1
//                int depan=0;
//                int belakang=str1.length()-1;
//                while(belakang>depan){
//                    if (str1.charAt(depan)!=str1.charAt(belakang)){
//                        System.out.println("Bukan Palindrome");
//                        return;
//                    }
//                    depan++;
//                    belakang--;
//                }              
//                System.out.println("Palindrome");
                
                // Cara 2
                if (str1.equalsIgnoreCase(new StringBuffer(str1).reverse().toString())){
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Bukan Palindrome");
                }
                break;
            case 8:
                System.out.println("Masukkan Kata:");
                input= new Scanner(System.in);
                str1=input.next();
                System.out.println("Ambil huruf index ke 1 sampai akhir "+str1.substring(1));
                System.out.println("Ambil huruf index ke 1 sampai 3 "+str1.substring(1, 3));
                break;
            case 9:
                System.out.println("Masukkan Kalimat:");
                input= new Scanner(System.in);
                str1=input.nextLine();
                
                System.out.println("Cari Kata:");
                input= new Scanner(System.in);
                str2=input.next();
                
                int index=str1.indexOf(str2);
                String[]kata= str1.split(" ");
                int jumlah=0;
                for (String word:kata){
                    if (word.equalsIgnoreCase(str2)){
                        jumlah++;
                    }
                }
                if (index==-1){
                    System.out.println("Kata "+str2+" tidak ditemukan.");
                } else {
                    System.out.println("Kata "+str2+" muncul sebanyak "+jumlah+" kali dan pertama kali muncul pada index ke-"+index);
                }                
                break;
            case 10:
                System.out.println("Masukkan Kalimat:");
                input= new Scanner(System.in);
                str1=input.nextLine();
                
                System.out.println("Cari Kata:");
                str2=input.next();
                index= str1.lastIndexOf(str2);
                if (index==-1){
                    System.out.println("Tidak ada kata "+str2+" di "+str1);
                } else {
                    System.out.println("Kata "+str2+" terakhir muncul di index ke-"+index);
                }     
                break;
            case 11:
                System.out.println("Masukkan Kalimat:");
                input= new Scanner(System.in);
                str1=input.nextLine();
                
                System.out.println("Hilangkan huruf di index ke-:");
                index =input.nextInt();
                
                // Cara 1
//                StringBuilder sb= new StringBuilder(str1);
//                sb.deleteCharAt(index);
//                System.out.println("Kalimat setelah dihilangkan huruf di index ke-"+index+":"+sb.toString());
                
                // Cara 2
                String hasil=str1.substring(0,index)+str1.substring(index+1);
                System.out.println("Kalimat setelah dihilangkan huruf di index ke-"+index+":"+hasil);
                break;
            case 12:
            default:
                
        }
    }
    
    static void menu() {
        System.out.println("Menu:");
        System.out.println("----------\n");
        System.out.println("1) Cetak String");
        System.out.println("2) Penggabungan String");
        System.out.println("3) UpperCase & LowerCase");
        System.out.println("4) Panjang Kata");
        System.out.println("5) Reverse");
        System.out.println("6) Compare");
        System.out.println("7) Palindrome");
        System.out.println("8) Substring");
        System.out.println("9) String Matching");        
        System.out.println("10) Searching Last Occurance");
        System.out.println("11) Deleting a character");
        System.out.println("12) Exit");
    }
}
