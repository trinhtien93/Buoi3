import java.util.Scanner;

public class Bai28 {
    void draw() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap n : ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (i == 1 || i == n || k == 1 || k == i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
