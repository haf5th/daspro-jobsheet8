import java.util.Scanner;
public class Triangle11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan nilai N = ");
        int N = sc.nextInt();
        int i = 0;
        while(i <= N) {
            int j = 0;
            while(j < i) {
                System.out.println("*");
                j++;
            }
            i++;
            System.out.println();
        }   
    }
}