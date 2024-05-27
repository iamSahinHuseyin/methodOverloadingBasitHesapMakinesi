import java.util.Scanner;


public class Main {
    //Toplama ve çarpma metdolarımız aynı isim farklı sayıda parametreler almaktadır.
    //Method overloading yaparak bu işlemi gerçekleştirmekteyim.
    public static int toplama(int sayi1, int sayi2){

        return sayi1+sayi2;
    }
    public static int toplama(int sayi1, int sayi2,int sayi3){
        return sayi1+sayi2+sayi3;
    }
    public static int cikarma(int sayi1, int sayi2){

        return sayi1-sayi2;
    }
    public static int carpma(int sayi1, int sayi2){

        return sayi1*sayi2;
    }
    public static int carpma(int sayi1, int sayi2,int sayi3){

        return sayi1*sayi2*sayi3;
    }
    public static int bolme(int sayi1, int sayi2){

        return sayi1/sayi2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hoşgeldiniz!");
        //Sayı adedini alarak hangi metodumun kullanılmasını söylüyorum.
        System.out.println("Kaç sayı ile işlem yapacaksınız?(2 veya3)");
        int sayiAdet= sc.nextInt();

        //kullanıcı 2 sayı girecekse sadece 2 sayı alıyorum.
        if (sayiAdet == 2){
            System.out.print("Bir sayı giriniz: ");
            int sayi1= sc.nextInt();
            System.out.println("Bir sayı giriniz: ");
            int sayi2 = sc.nextInt();
            while (true){
                System.out.println("Yapmak istediğiniz işlemi seçiniz: \n" +
                        "1:Toplama\n" +
                        "2:Çıkarma\n" +
                        "3:Çarpma\n" +
                        "4:Bölme\n" +
                        "9:Çıkış");
                int secim = sc.nextInt();
                if (secim == 9){
                    System.out.println("PROGRAMDAN ÇIKILIYOR!");
                    break;

                } else if (secim == 1) {
                    System.out.println("Sonuç: " + toplama(sayi1,sayi2));
                } else if (secim == 2){
                    System.out.println("Sonuç: " + cikarma(sayi1,sayi2));
                } else if (secim == 3) {
                    System.out.println("Sonuç: " + carpma(sayi1,sayi2));
                } else if (secim == 4) {
                    System.out.println("Sonuç: " + bolme(sayi1,sayi2));
                }
            }
        //kullanıcı 3 sayı girecekse sadece 3 sayı alıyorum.
        } else if (sayiAdet ==3) {
            System.out.print("Bir sayı giriniz: ");
            int sayi1= sc.nextInt();
            System.out.print("Bir sayı giriniz: ");
            int sayi2 = sc.nextInt();
            System.out.print("Bir sayı giriniz:");
            int sayi3 = sc.nextInt();
            //Programın tek sefer değil sürekli çalışmasını istediğim için while döngüsünü true olarak başlatıyorum.
            while (true){
                System.out.println("Yapmak istediğiniz işlemi seçiniz: \n" +
                        "1:Toplama\n" +
                        "2:Çıkarma\n" +
                        "3:Çarpma\n" +
                        "4:Bölme\n" +
                        "9:Çıkış");
                int secim = sc.nextInt();
                if (secim == 9){
                    System.out.println("PROGRAMDAN ÇIKILIYOR!");
                    break;

                } else if (secim == 1) {
                    System.out.println("Sonuç: " + toplama(sayi1,sayi2,sayi3));
                } else if (secim == 2){
                    System.out.println("Sonuç: " + cikarma(sayi1,sayi2));
                } else if (secim == 3) {
                    System.out.println("Sonuç: " + carpma(sayi1,sayi2,sayi3));
                } else if (secim == 4) {
                    System.out.println("Sonuç: " + bolme(sayi1,sayi2));
                }
            }


        }else {
            System.out.println("EKSİK VEYA HATALI GİRİŞ!");
        }


    }
}