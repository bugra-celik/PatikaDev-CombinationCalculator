import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,total=1,total2=1,total3=1,r,fark;
        double combination;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        n = scan.nextInt();
        System.out.print("r gruplama sayısını giriniz:");
        r = scan.nextInt();
        fark= (n-r);

        for(int i =1;i<=n;i++){
            total = total * i;
        }
        for(int j = 1;j<=r;j++){
            total2= total2 * j;
        }
        for(int x=1;x<=fark;x++){
            total3= total3*x;
        }

        combination = total / (total2 * total3);

        System.out.println("n sayısının r'li kombinasyonu ="  +combination);



    }
}