import java.util.Scanner;
//Kullanıcıdan veri alabilmek için Scanner veri sınıfını projeye dahil ediyoruz

public class Main {
    public static void main(String[] args) {

        //Sayılarımızı atayacağımız integer türündeki değişkenlerimizi tanımlıyoruz
        int a, b, c;


        Scanner input = new Scanner(System.in);

        //Kullanıcıdan sayıları alıyoruz
        System.out.print("Birinci Sayıyı: ");
        a =input.nextInt();

        System.out.print("İkinci Sayı: ");
        b =input.nextInt();

        System.out.print("Üçüncü Sayı");
        c = input.nextInt();

       //Kullanıcının gşrdiği sayıları İf Else yapısını kullanarak küçükten büyüğe doğru sıralıyoruz.
        if ((a<b) && (a<c)){
            if (b<c){
                System.out.println("a<b<c");
            }else {
                System.out.println("a<c<b");
            }
        } else if ((b<a) && (b<c)) {
            if (a<c){
                System.out.println("b<a<c");
            }else {
                System.out.println("b<c<a");
            }
        }else {
            if (a < b){
                System.out.println("c<a<b");
            }else {
                System.out.println("c<b<a");
            }
        }
    }
}