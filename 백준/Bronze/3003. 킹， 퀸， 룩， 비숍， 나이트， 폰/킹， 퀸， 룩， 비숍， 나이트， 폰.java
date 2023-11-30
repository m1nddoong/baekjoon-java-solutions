import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] chessMaxPiece = {1, 1, 2, 2, 2, 8};
        int[] chessPiece = new int[6];
        int[] newChessPiece = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            chessPiece[i] = scanner.nextInt();
            if (0 <= chessPiece[i] && chessPiece[i] <= 10) {
                newChessPiece[i] = chessMaxPiece[i] - chessPiece[i];
            }
        }
        for (int piece : newChessPiece) {
            System.out.print(piece + " ");
        }
    }
}


