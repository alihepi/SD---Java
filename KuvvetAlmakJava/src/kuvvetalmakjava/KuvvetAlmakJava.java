package kuvvetalmakjava;

import java.util.Scanner;

public class KuvvetAlmakJava {

    public static int kuvvetAl(int sayi, int kuvvet){
        
        int kuvvetne = 0;
        
        kuvvetne = (int) Math.pow(sayi, kuvvet);
        
        return kuvvetne;
        
    }
    
    public static void main(String[] args) {
        
        Scanner giris = new Scanner(System.in);
        
        System.out.print("Sayi giriniz: ");
        int sayi = giris.nextInt();
        
        System.out.print("Kuvvet giriniz: ");
        int kuvvet = giris.nextInt();
        
        System.out.println(kuvvetAl(sayi, kuvvet));
        
    }
    
}
