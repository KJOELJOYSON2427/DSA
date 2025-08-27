class Pattern1 {

    void pyramid(int rows) {

        for (int i = rows-1; i >= 0; i--) {

            // Print leading spaces
            for (int j = rows-1; j > i; j--) {
                System.out.print(" ");
            }

            // Print stars with space after each
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }
    }
}

public class patter1 {
    public static void main(String[] args) {
        Pattern1 obj = new Pattern1();
        obj.pyramid(5); // change 5 to any number of rows you want
    }
}
