package karelertoplamijava;

import java.util.Scanner;

public class KarelerToplamiJava {

    public static int KarelerinToplami(int sayi){
        
        int toplam = 0;
        
        if(sayi>0){
            for(int i = 1; i<=sayi; i++){
            toplam += Math.pow(i,2);
            }
        }else{
            return -1;
        }
        
        return toplam;
    }
    
    public static void main(String[] args) {
        
        Scanner giris = new Scanner(System.in);
        
        System.out.print("Sayı Giriniz: ");
        int sayi = giris.nextInt();
        
        System.out.println(KarelerinToplami(sayi));
        
    }
    
}
