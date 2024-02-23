import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner ve gerekli degiskenler tanimlandi.
        Scanner input = new Scanner(System.in);
        int Number, cacheNumber, fNumber = 0, sNumber = 1;

        // Kullanicidan basamak degeri alindi
        System.out.print("Basamak sayisini gir: ");
        Number = input.nextInt();

        // Gerekli mantiksal hesaplamalar yapildi.
        for (int i = 0; i <= Number; i++) {

            System.out.print(fNumber + " ");

            cacheNumber = fNumber + sNumber;
            fNumber = sNumber;
            sNumber = cacheNumber;
        }
    }
}