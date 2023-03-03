import java.util.Scanner;

public class gaji {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan gaji : ");
            double gaji = input.nextDouble();

            System.out.print("Masukkan jam lembur: ");
            double jamLembur = input.nextDouble();

            System.out.print("Masukkan upah lembur per jam: ");
            double upahLembur = input.nextDouble();

            double gajiTotal = gaji + (jamLembur * upahLembur);

            System.out.println("Gaji total adalah: " + gajiTotal);
        }
    }
}
