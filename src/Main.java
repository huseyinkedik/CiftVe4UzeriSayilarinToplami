import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        int toplam = 0;

        //Kullanıcıdan sayı girilmesi bekleniyor.

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz: ");
            k = input.nextInt();

            //Girilen sayının çift ve 4'ün katı olması koşulunu sağlayanlar toplanıyor

            if ((k % 2 == 0) && (k % 4 == 0)) {
                toplam += k;
            }
        } while (k % 2 == 0);
        System.out.println("Toplam: " + toplam);
    }
}