/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//int nilai;
        //String hasil;
        //long nilaiFib;
        //Scanner in= new Scanner(System.in);
        //System.out.println("Masukkan nilai:");
        //nilai = in.nextInt();
        //hasil=StrukturData_1(nilai);
        //hasil= BilanganPrima(nilai);
        //nilaiFib = fibonacci(nilai);
        //System.out.println("Hasil = " +hasil);
        //System.out.println("Hasil = " +nilaiFib);

package StrukturData;
import java.util.Scanner;
/**
 *
 * @author Tirana
 */
public class StrukturData_1 {
    public static void main (String[]args){
//        String string1 = "abcd";
//        String string2 = "abcd";  
//        System.out.println(string1);
//        System.out.println(string2);
//        string1 = string1.concat("efgh");
//        System.out.println(string1);
//        System.out.println(string2);  
        String a="0.23";
        double b= Double.parseDouble(a);
        int c= Integer.parseInt(a);
        System.out.println(b);
    
    } 
    
    public static String KondisiNilai(int nilai) {       
        if (nilai<=55) {
            return "Tidak Lulus";
        } else if ((nilai>55) && (nilai<=60)){
            return "C";
        } else if ((nilai>60)&& (nilai<=65)){
                 return "C+";
        } else if ((nilai>65)&& (nilai<=70)){
                 return "B";
        }else if ((nilai>70)&& (nilai<=75)){
                 return "B+";
        }else{
            return "A";
        }
    }
    
    public static String BilanganPrima (int maksAngka){
        String bilPrima="2 ";
        for (int i=2; i<=maksAngka;i++){
            if (i%2!=0){
                bilPrima+=i+" ";
            }
        }        
        return bilPrima;
    }    
    
//    public static int fibonacci(int n) {
//        
////        if (n <= 1) return n;
////        else 
////           // System.out.println(fibonacci(n-1));
////        System.out.println(fibonacci(n-2));
////            return fibonacci(n-1) + fibonacci(n-2);
//        for (int i=1; i<=n;i++){
//                
//        }  
//    }
    
//    System.out.println("Silahkan Input Matriks Nama dan Nomor Telepon:");
//        //String identitas[][]= {{"Tirana","0810963074"},{"Noor","081291828937"}};
//        String identitas[][]=new String[2][2];
//        String nama,telpon;
//        for (int i=0;i<=1;i++){
//            for (int j=0;j<=1;j++){
//                
//                Scanner input= new Scanner(System.in);                
//                if (j==0){
//                    System.out.println("Masukkan Nama:");
//                    nama= input.next();
//                    identitas[i][j]=nama;
//                } else if(j==1){
//                    System.out.println("Masukkan Telpon");
//                    telpon= input.next();
//                    identitas[i][j]=telpon;
//                }                                
//            }
//        }
//        for (int i=0;i<=1;i++){
//            for (int j=0;j<=1;j++){
//                System.out.println(identitas[i][j]+" ");
//            }            
//        }
        
}

