public class Hati {
    public static void main(String[] args) {
        System.out.print(" ");
        for (int c = 0; c < 4; c++) {
            System.out.print("*");
        }
        System.out.print(" ");
        for (int e = 0; e < 4; e++) {
            System.out.print("*");
        }
        System.out.println();

        for (int j=5; j>=0; j--) {
            for (int k=1; k<=5-j; k++) {
                System.out.print(" ");
            }
            for (int l=1; l<=2*j+1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}