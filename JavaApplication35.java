/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

import java.util.Scanner;

/**
 *
 * @author ZYREX
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String jenis,kertas;
    int lembar,harga;
    Scanner scan = new Scanner(System.in);
    System.out.println("jenis printer yang mau dicetak = ");
    jenis = scan.next();
    System.out.println("kertas printer yang mau dicetak = ");
    kertas = scan.next();
    System.out.println("lembar yang mau dicetak = ");
    lembar = scan.nextInt();    
   
    
 if("Hitam".equalsIgnoreCase(jenis) && "A4".equalsIgnoreCase(kertas))
    {
     if(lembar<=50)
     {
         harga = lembar*1000;
         System.out.println("yang harus anda bayar = " + harga );
     }
     else if (lembar>50)     
     {     
         harga = lembar*750;
         System.out.println("yang harus anda bayar = " + harga );
     }
     else
     {
         System.out.println("inputan anda salah");
     }
    }
 else if("Hitam".equalsIgnoreCase(jenis) && "F4".equalsIgnoreCase(kertas))
    {
     if(lembar<=50)
     {
         harga = lembar*1250;
         System.out.println("yang harus anda bayar = " + harga );
     }
     else if (lembar>50)     
     {     
         harga = lembar*1000;
         System.out.println("yang harus anda bayar = " + harga );
     }
     else
     {
         System.out.println("inputan anda salah");
     }     
    }

 else if("warna".equalsIgnoreCase(jenis) && "A4".equalsIgnoreCase(kertas))
    {
     if(lembar<=30)
     {
         harga = lembar*1500;
         System.out.println("yang harus anda bayar = " + harga );
     }
     else if (lembar>30)     
     {     
         harga = lembar*1100;
         System.out.println("yang harus anda bayar = " + harga );
     }
     else
     {
         System.out.println("inputan anda salah");
     }
    }
   
 else if("Warna".equalsIgnoreCase(jenis) && "F4".equalsIgnoreCase(kertas))
    {
     if(lembar<=30)
     {
         harga = lembar*1750;
         System.out.println("yang harus anda bayar = " + harga );
     }
     else if (lembar>30)     
     {     
         harga = lembar*1550;
         System.out.println("yang harus anda bayar = " + harga );
     }
     else
     {
         System.out.println("inputan anda salah");
     }
    } 
    
 else if("Gambar".equalsIgnoreCase(jenis) && "A4".equalsIgnoreCase(kertas))
    {
     if(lembar<=20)
     {
         harga = lembar*2000;
         System.out.println("yang harus anda bayar = " + harga );
     }
     else if (lembar>20)     
     {     
         harga = lembar*1700;
         System.out.println("yang harus anda bayar = " + harga );
     }
     else
     {
         System.out.println("inputan anda salah");
     }
    } 
  
 else if("Gambar".equalsIgnoreCase(jenis) && "F4".equalsIgnoreCase(kertas))
    {
     if(lembar<=20)
     {
         harga = lembar*2250;
         System.out.println("yang harus anda bayar = " + harga );
     }
     else if (lembar>20)     
     {     
         harga = lembar*2100;
         System.out.println("yang harus anda bayar = " + harga );
     }
     else
     {
         System.out.println("inputan anda salah");
     }
    } 

 else
     {
         System.out.println("inputan anda salah");
     }
    
    
   }
    
}
