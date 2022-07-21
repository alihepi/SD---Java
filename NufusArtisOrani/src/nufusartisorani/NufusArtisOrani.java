package nufusartisorani;

import java.util.Scanner;

public class NufusArtisOrani {

    public static double nufus(double baslangicNufus, double artisOrani, int yil){
        
        double ulasilan = 0;
        
        double geciciDeger = (baslangicNufus*(artisOrani/100)) * yil; 
        
        ulasilan = baslangicNufus + geciciDeger;
        
        return ulasilan;
    }
    
    public static void main(String[] args) {
        
        Scanner giris = new Scanner(System.in);
        
        System.out.print("Baslangic Nufusu: ");
        double nufus = giris.nextInt();
        
        System.out.print("Yillik Artis Orani: ");
        double oran = giris.nextInt();
        
        System.out.print("Gecen Yil: ");
        int yil = giris.nextInt();
        
        System.out.println("Sehrin " + yil + "'da Ulasacagi Tahmini"
                + " Nufus: " + nufus(nufus, oran, yil));
        
    }
    
}
