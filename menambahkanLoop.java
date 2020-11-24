import java.util.Scanner;
public class menambahkanLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	int i = 1;
      	int hasil = 0;
      	int n;
        
        System.out.print("Masukkan Batasnya : ");
      	n = sc.nextInt();
      
      	while(i <= n){
        	hasil += i;
          	i++;
        }
      	System.out.print(hasil);
    }    
}