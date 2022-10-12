import java.util.Scanner;

public class hesapMakinasi {
    public static void main(String[] args) {
        int n1 ,n2 , select ;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayıyı Giriniz : ");
        n1= input.nextInt();

        System.out.print("2.Sayıyı Giriniz :");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapmak İstediğiniz İşlemi Giriniz :" );
        select= input.nextInt();

        switch (select){

            case 1:
                System.out.print("İşlem Sonucu :" + (n1+n2));
                break;
            case  2:
                System.out.print("İşlem Sonucu :" + (n1 - n2));
                break;
            case 3 :
                System.out.print("İşlem Sonucu :"+(n1*n2));
                break;
            case 4:
                if(n2!=0){
                    System.out.print("İşlem sonucu :" +(n1/n2));}
                else{
                        System.out.print("Bir sayı 0'a Bölünemez!");
                    }
                break;
            default:
                System.out.print("Geçersiz işlem girdiniz! Tekrar Deneyiniz.");
            break;



        }


    }
}
