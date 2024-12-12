public class fibonacci {
    public static void main(String[] args){
       System.out.println("Öğrenmek istediğiniz fibonacci sayısını giriniz:");
       int birinci =1;
       System.out.println(birinci+"");

       int ikinci =1;
       System.out.println(ikinci+"");
        int yeni;

    for(int i=3;i<40;i++){
        yeni=birinci+ikinci;
        System.out.println(yeni+"");
        birinci=ikinci;
        ikinci=yeni;
    }
    }

}
       
       

   




            
    

