import java.util.Scanner;

public class Hanoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah piringan?");
        int N = input.nextInt();
        System.out.println();
        hanoi(N, 'A', 'B', 'C');
    }

    static void hanoi(int n, char awal, char temp, char akhir) {
        if (n == 1) {
            System.out.println("Pindahkan piringan 1 dari " + awal + " ke " + akhir);
        } else {
            hanoi(n - 1, awal, akhir, temp);
            System.out.println("Pindahkan piringan " + n + " dari " + awal + " ke " + akhir);
            hanoi(n - 1, temp, awal, akhir);
        }
    }
}
