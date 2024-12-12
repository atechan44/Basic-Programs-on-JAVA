import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
       System.out.println("Öğrenmek istediğiniz fibonacci sayısını giriniz:");
       Scanner giris = new Scanner(System.in);
       long birinci = 0;
       long ikinci = 1;
       long yeni;
       int girilenSayi=giris.nextInt();
       System.out.println("1.sayı: 1");
    for(int i=2;i<=girilenSayi;i++){
        yeni=birinci+ikinci;
        System.out.println(i+".sayı: "+yeni);
        birinci=ikinci;
        ikinci=yeni;
    }
     giris.close();
   
    }
}

   




            
    

