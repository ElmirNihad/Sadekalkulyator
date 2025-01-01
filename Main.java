import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1,num2;
        int secim;
        while (true) {
            System.out.println("\n--- Əməliyyat Menyusu ---");
            System.out.println("1. Toplama (+)");
            System.out.println("2. Çıxma (-)");
            System.out.println("3. Vurma (*)");
            System.out.println("4. Bölmə (/)");
            System.out.println("5. Çıxış");
            System.out.print("Seçiminizi edin: ");
            secim = input.nextInt();
            if (secim == 5) {
                System.out.println("Program baglanir...");
                break;
            }
            System.out.print("Birinci ədədi daxil edin: ");
            num1 = input.nextDouble();
            System.out.print("İkinci ədədi daxil edin: ");
            num2 = input.nextDouble();
            switch (secim) {
                case 1:
                    System.out.println("Netice : " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Netice : " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Netice : " + (num1 * num2));
                    break;
                case 4:
                    if (num2==0){
                        System.out.println("Sıfıra bölmə mümkün deyil!");
                    }else {
                        System.out.println("Nəticə: " + (num1 / num2));
                    }
                    break;
                default:
                    System.out.println("Yanlış seçim! Yenidən cəhd edin.");
            }
        }
    }
}