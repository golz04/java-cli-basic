import java.util.Scanner;
public class piramida {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int tingkatan;

            System.out.print("Masukkan Tingakatannya : ");
            tingkatan = sc.nextInt();

            for(int a=tingkatan; a>=0; a--) {
                for(int b=tingkatan; b>a; b--) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=0; i<=tingkatan; i++) {
                for (int j=0; j<tingkatan-i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Hanya Boleh Angka!");
        }
    }
}