
package 
import java.util.Scanner;

public class Asalsayıprojemini {
    public static void main(String[] args){
       System.out.println("ASAL SAYI HESAP MAKİNESİNE HOŞGELDİNİZ!!!");
       System.out.println("Asal sayı olup olmadığını hesaplamak için sayı giriniz:");
        Scanner giris=new Scanner(System.in);
        int number=giris.nextInt();

        if(number==1){
            System.out.println("GEÇERSİZ SAYI");
            return;
        }
        int remainder = number%2;
       
        boolean isPrime=true;


        for(int i=2;i<number;i++){
            if(number % i==0){
                isPrime = false;
            }
        }
         
            if(isPrime==true){
                System.out.println("Sayı asaldır.");
            }else{
                System.out.println("Sayı asal değildir.");
            }




        giris.close();
    }
}
