import java.util.Scanner;

public class dizimaxminbulucu{
    public static void main(String[] args){
    Scanner giris = new Scanner(System.in);
   
    System.out.println("Dizi boyutu giriniz: ");
    int diziGenisligi = giris.nextInt();
    int [] dizi = new int[diziGenisligi];
    
    for(int i = 0;i<diziGenisligi;i++){
        System.out.println((i+1)+". elemanı gir: ");
        dizi[i] = giris.nextInt();
    }
    int max= dizi[0];
    for(int i=1;i<diziGenisligi;i++){
     max=Math.max(max,dizi[i]);
    }
     System.out.println("MAX: "+max);
     
     int min=dizi[0];
     for(int i=1;i<diziGenisligi;i++){
        min=Math.min(min,dizi[i]);
     }
     System.out.println("MİN: "+min);

     giris.close();
   }
}