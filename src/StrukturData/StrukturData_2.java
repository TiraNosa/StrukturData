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
public class StrukturData_2 {
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
                str1=input.nextLine();
                System.out.println("Kata yang telah dimasukkan adalah "+str1);               
                break;
            case 2:
                System.out.println("Masukkan Kata Pertama:");
                input= new Scanner(System.in);
                str1=input.nextLine();
                System.out.println("Masukkan Kata Kedua:");
                input= new Scanner(System.in);
                str2=input.nextLine();
                System.out.println("Penggabungan Kata menggunakan '+': "+str1+str2);
                System.out.println("Penggabungan Kata menggunakan concat: "+str1.concat(str2));
                break;
            case 3:
                System.out.println("Masukkan Kata:");
                input= new Scanner(System.in);
                str1=input.nextLine();
                System.out.println("UpperCase: "+str1.toUpperCase());
                System.out.println("LowerCase: "+str1.toLowerCase()); 
                break;
            case 4:                
                System.out.println("Masukkan Kata:");
                input= new Scanner(System.in);
                str1=input.nextLine();
                System.out.println("Panjang dari kata "+str1+" adalah "+str1.length()+" karakter");                
                break;
            case 5:
                System.out.println("Masukkan Kata:");
                input= new Scanner(System.in);
                str1=input.nextLine();
                System.out.println("Ganti huruf pertama di "+str1+" dengan a. Hasil : "+str1.replace(str1.charAt(0), 'a'));
                break;
            case 6:
                String string1="Tirana";
                String string2="tirana";
                System.out.println("Membandingkan dengan '=': "+(string1==string2));
                System.out.println("Membandingkan dengan equals: "+string1.equals(string2));
                System.out.println("Membandingkan dengan equalsIgnoreCase: "+string1.equalsIgnoreCase(string2));
                System.out.println("Membandingkan dengan compareTo: "+string1.compareTo(string2));
                System.out.println("Membandingkan dengan compareToIgnoreCase: "+string1.compareToIgnoreCase(string2));
//                System.out.println("Masukkan Kata kedua:");
//                input= new Scanner(System.in);
//                str2=input.next();
//                System.out.println("Kata kedua yang telah dimasukkan adalah "+str2);
//                if (str1.equalsIgnoreCase(str2)){
//                    System.out.println("Kedua kata sama");
//                } else {
//                    System.out.println("Kedua kata tidak sama");
//                }
                
                break;
            case 7:
                System.out.println("Masukkan Kata dengan spasi di awal dan akhir:");
                input= new Scanner(System.in);
                str1=input.next();
                System.out.println("Setelah di Trim:\n"+str1.trim());
                break;
            case 8:
                 System.out.println("Masukkan Kata:");
                input= new Scanner(System.in);
                str1=input.next();
                System.out.println("Ambil huruf index ke 1 sampai akhir "+str1.substring(1));
                System.out.println("Ambil huruf index ke 1 sampai 3 "+str1.substring(1, 3));
                break;
            case 9:
                break;
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
        System.out.println("5) Replace");
        System.out.println("6) Compare");
        System.out.println("7) Trim");
        System.out.println("8) Substring");
        System.out.println("9) String Matching");
        System.out.println("10) Exit");
    }
}
