import java.util.Scanner;

class dirty{
    public static void main(String[] args) {
        
        Scanner scan =new Scanner(System.in);
        
        System.out.println("sayi biri giriniz");
        double x=scan.nextDouble();
        System.out.println("sayi iki giriniz");
        double y=scan.nextDouble();
      

        System.out.println("1-topla");
        System.out.println("2-cıkar");

        System.out.println("3-carp");

        System.out.println("4-böl");

        System.out.println("yapmak istediginiz islemi seciniz");
        int islem=scan.nextInt();

        scan.close();
        double sonuc=0;
       switch (islem) 
       {
        case 1: sonuc=x+y;
        System.out.println(sonuc);
            break;
        

        case 2: sonuc=x-y;
        System.out.println(sonuc);
        break;

        case 3:sonuc = x*y;
        System.out.println(sonuc);
        break;

        case 4: sonuc=x/y;
        System.out.println(sonuc);
        break;
        
        default:System.out.println("bir islem yapılmadı");


    
    }
    

}
    }
