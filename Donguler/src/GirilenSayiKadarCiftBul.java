import java.util.Scanner;
public class GirilenSayiKadarCiftBul {
    public static void main(String[] args) {

        int i, sayi, counter = 0;
        double top = 0, sayac;
        Scanner input=new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        sayi = input.nextInt();

        for(i=0; i<=sayi; i++)
        {
            if( (i%3==0) && (i%4==0) )
            {
                top+=i;
                counter++;
            }
        }
        sayac=top/counter;
        System.out.println("Ortalama : "+sayac);
    }
}