import java.util.Scanner;

public class GameTebakAngka2 {
    public static void main(String[] args) {
        AdminTebakAngka1 game = new AdminTebakAngka1();

        Scanner scanner = new Scanner(System.in);

        while (!game.sudahTerjawab) {
            System.out.print("Masukkan tebakan Anda: ");
            int tebakanUser = scanner.nextInt();

            game.tebak(tebakanUser);
            System.out.println();
        }

        System.out.println("Anda berhasil menjawab!");
        System.out.println(game.tryCount + "x tebakan");

        scanner.close();
    }
}