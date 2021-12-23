import java.util.Scanner;
public class Main {
    public static void main(String args [])
   {
        System.out.println("sayi giriniz:");//burada sayi sitedim
        Scanner cagir=new Scanner(System.in);//burada da scanner sınıfından nesne vasıtasıyla next fonk eriştim
        int sayi=cagir.nextInt();//sayiyi cagir nesnesiyle cagirdik
        int fakt=1;
        for(int i=1;i<=sayi;i++)
        {
          fakt=fakt*i;
        }
      System.out.println(fakt);



   }
}
