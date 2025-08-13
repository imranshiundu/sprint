package sprint;

public class Tree {
    public static void tree(int n) {
        if (n <= 0) {
            return;
        }

        int trunkHeight = Math.max(1, n / 3);
        int trunkWidth;
        if (n <= 3) {
            trunkWidth = 1;
        } else if (n <= 6) {
            trunkWidth = 3;
        } else if (n <= 9) {
            trunkWidth = 5;
        } else {
            trunkWidth = 7;
        }

        for (int row = 1; row <= n; row++) {
            int spaces = n - row;
            int branches = 2 * row - 1;

            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }

            if (row == 1) {
                System.out.println("^");
            } else {
                System.out.print("/");
                for (int i = 0; i < branches - 2; i++) {
                    System.out.print("*");
                }
                System.out.println("\\");
            }
        }

        int trunkSpaces = n - trunkWidth / 2 - 1;
        for (int i = 0; i < trunkHeight; i++) {
            for (int j = 0; j < trunkSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < trunkWidth; j++) {
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
