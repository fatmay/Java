import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String arg [])
   {
        Scanner s = new Scanner(System.in);
         System.out.println("Kilonuzu giriniz: ");
         double kilo = s.nextFloat();
         System.out.println("Boyunuzu giriniz (cm cinsinden): ");
         double boy = s.nextInt();
         double vki = kilo/Math.pow(boy/100,2);
         DecimalFormat df = new DecimalFormat("##.##");
        System.out.println("Vücut kitle indexiniz: "+df.format(vki));
        System.out.println("Durumunuz: ");

  if(vki<=18.5)
      {
          System.out.println("Zayıf");
         

      }

    else if(vki<=24.9)
     {
         System.out.println("Normal");

     }

   else if(vki<=29.9)
     {
       System.out.println("Fazla kilolu");
       
     }

   else if(vki<=39.9)
     {
       System.out.println("Obez");
        

     }

   else
    {
     System.out.println("Aşırı obez");
     

     }
   }
}