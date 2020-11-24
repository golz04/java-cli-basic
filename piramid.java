import java.util.Scanner;
public class piramid {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int tingkatan;

        System.out.print("Masukkan Tingkatannya : ");
        tingkatan =  sc.nextInt();

        for (int i=0; i<tingkatan; i++) {
            for (int j=0; j<tingkatan-i; j++) {
                System.out.print(" ");
            }
            for (int k=0; k<2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}