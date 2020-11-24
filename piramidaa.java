import java.util.Scanner;
public class piramidaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tingkatan;

        System.out.print("Masukkan tingkatannya : ");
        tingkatan =  sc.nextInt();

        for (int a=0; a<tingkatan; a++) {
            for (int b=0; b<tingkatan-a; b++) {
                System.out.print(" ");
            }
            for (int c=0; c<2*a+1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=tingkatan; i>=0; i--) {
            for (int j=1; j<=tingkatan-i; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}