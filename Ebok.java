import java.util.Scanner;

public class Ebok {
    public static void main(String[] args) {
        int n1,n2,ebob = 0,ekok,i;
        Scanner sayi = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz : ");
        n1 = sayi.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        n2 = sayi.nextInt();
        i = n1;

        while (i>=1){
            if (n1 % i == 0 && n2 % i == 0){
                ebob = i;
                break;
            }
            i--;
        }
        ekok = (n1*n2)/ebob;
        System.out.print("Ebob : "+ebob+"\n");
        System.out.print("Ekok : "+ekok);
    }
}
