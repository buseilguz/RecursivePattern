import java.util.Scanner;

public class Main {
	//girilen N sayisina gore deseni olu�turuyor.
    static void design(int n){
        if (n > 0){
            System.out.print(n + " ");
            
            design(n - 5);
        }System.out.print(n +" ");
        
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N say�s�n� giriniz : ");
        int n = scan.nextInt();
        System.out.print("��kt�s� : ");
        design(n);
        System.out.println();
        
    }
}