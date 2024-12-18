import java.util.Scanner;

public class FiboRecuirsive{
    public static void main(String[] args){
    Scanner giris = new Scanner(System.in);
    System.out.println("Hesaplamak istediğiniz fibonacci sayısını giriniz giriniz: ");
    int sayi = giris.nextInt();
   System.out.println("fibonacci sayısı: "+fibonacci(sayi));
    }public static int fibonacci(int n){
        if(n==1||n==2){//Iterative kodumda bu satır yerine yazdırma komutuna 1.sayi=1 deyiip hatalı yapmışım ama bu çok mantıklı. 1 ve 2 değerleri için sayı 1 gelir
            return 1;// 1'e dönder diyorum. Çünkü ilk iki sayı sabittir.
        }
        return fibonacci(n-1)+fibonacci(n-2);//fibonacci değeri sürekli kendisinden 1 az ve 2 az olan değerlerle toplanıp sonuca yazılsın.
        /*7+6
        5+4
        3+2
        1+x(Kabul etmez 0'ı )
        */
            }
            
 }
