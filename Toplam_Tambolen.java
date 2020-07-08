import java.util.Scanner;

public class Toplam_TamBolen {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int a = scan.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int b = scan.nextInt();
        System.out.println("Tam bölünecek sayıyı giriniz: ");
        int x = scan.nextInt();
        toplama(a,b,x);
    }
    static void toplama(int a, int b, int x){
        int temp=0;
        for(int i=a;i<b;i++)
        {
            if(i%x==0)
                temp=temp+i;
        }
        System.out.println(temp);

    }
}
