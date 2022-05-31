import java.util.Scanner;
public class clean {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int islem;
        double birincisayi;
        double ikincisayi;

        System.out.println("yapmak istediginiz işlemi seciniz");
        System.out.println("1- toplama");
        System.out.println("2- cıkarma");
        System.out.println("3- carpma");
        System.out.println("4- bölme");
        islem = scan.nextInt();

        System.out.println("birinci sayiyi giriniz");
        birincisayi=scan.nextDouble();
        
        System.out.println("ikinci sayiyi giriniz");
        ikincisayi=scan.nextDouble();
        scan.close();



        switch(islem){
            case 1:toplama(birincisayi,ikincisayi);
            break;
            case 2:cıkarma(birincisayi,ikincisayi);
            break;
            case 3:carpma(birincisayi,ikincisayi);
            break;
            case 4:bolme(birincisayi,ikincisayi);
            break;
        }
        

    }

    private static void bolme(double birincisayi, double ikincisayi) {
        if (ikincisayi != 0){
             System.out.println(birincisayi/ikincisayi);

        }
        else{
            System.out.println("sıfıra bölme hatası");
        }
    }

    private static void carpma(double birincisayi, double ikincisayi) {
        System.out.println(birincisayi*ikincisayi); 
    }

    private static void cıkarma(double birincisayi, double ikincisayi) {

System.out.println(birincisayi-ikincisayi);    }

    private static void toplama(double birincisayi,double ikincisayi) {
System.out.println(birincisayi+ikincisayi);    }


}
