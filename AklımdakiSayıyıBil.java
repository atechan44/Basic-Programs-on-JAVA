import java.util.Scanner;

public class AklımdakiSayıyıBil {
   public static void main(String[] args){
    System.out.println("AKLIMDAKİ SAYIYI BUL BAKALIM OYUNUNA HOŞGELDİNİZ!!!");
    Scanner giris=new Scanner(System.in);
    
    
    System.out.println("TAHMİN ETMEK İSTEDİĞİNİZ ARALIKTAKİ ÜST LİMİTİ GİRİN: ");
    int a1 = giris.nextInt();
    System.out.println("ALT LİMİTİ GİRİN");
    int a2 = giris.nextInt();

    int x1 = (int)(Math.random() * (a1 - 1)+a2);

    System.out.println("Tahminleri alalım: ");
    int tahmin;
    do { 
        tahmin = giris.nextInt();
        if(x1<tahmin)System.out.println("Girdiğiniz sayı rastgele sayıdan büyük");
        else if(x1>tahmin)System.out.println("Girilen sayı rastgele sayıdan küçük");
        else System.out.println("DOĞRU BİLDİN HELAL");
    
    } while (tahmin!=x1);
    
        giris.close();
        
   } 
}
