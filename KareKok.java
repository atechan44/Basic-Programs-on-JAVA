import java.util.Scanner;

public class KareKok {
    public static void main(String[] args){
        try (Scanner giris = new Scanner(System.in)) {
            System.out.println("Lütfen 0'dan büyük bir sayı giriniz:");
            double x;
            x=giris.nextDouble();
            if(x<=0){
                System.out.println("0'dan büyük veya eşit bir sayı girmelisiniz");
            } else
                System.out.println(x+"'nın karekökü " + Math.sqrt(x));
        }
         }

      
    }


