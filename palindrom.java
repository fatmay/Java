import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {

         System.out.println("sayiyi giriniz:");
         Scanner nesne = new Scanner(System.in);
         int sayi=nesne.nextInt();//kullancıdan sayi girişi aldım
         palindrom(sayi);



    }
    public static void palindrom(int x)//fonksiyonumuz
    {
        int bas=0,top=0,temp=0;
        temp=x;
        while(x>0)//basamaklarına ayrıldı
       {
           bas=x%10;
           x=x/10;
           top=(top*10)+bas;

       }
       if(temp==top)
       {
      System.out.println(top+" palindromdur");
       }
       else {
            System.out.println(top+" palindrom değildir.");
       }


    }
}
