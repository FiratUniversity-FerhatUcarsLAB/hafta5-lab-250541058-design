/*
 * Ad Soyad: Burçin AYYILDIZ
 * Ogrenci No: 250541058
 * Tarih: 13.11.2025
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */


import java.util.Scanner ;
public class GeometrikSekilHesaplayıcı {
    public static void main(String[] args){

    Scanner input = new Scanner (System.in) ;
    System.out.println("===Hesaplama Sonuçları===") ;


    // kare
    System.out.print("Karenin kenarının değerini giriniz : ") ;
    double kenar = input.nextDouble() ;
    System.out.printf("Karenin alanı : %.2f\n " , calculateSquareArea(kenar));
    System.out.printf("Karenin çevresi : %.2f\n" , calculateSquarePerimeter(kenar));

    //dikdörtgen
        System.out.print("Dikdörtgenin kısa kenarını giriniz : ") ;
        int kisaKenar = input.nextInt() ;
        System.out.print("Dikdörtgenin uzun kenarını giriniz : ") ;
        int uzunKenar = input.nextInt() ;
        System.out.printf("Dikdörtgenin alanı : %d\n" , calculateRectangleArea(kisaKenar,uzunKenar) );
        System.out.printf("Dikdörtgenin çevresi : %d\n" , calculateRectanglePerimeter(kisaKenar,uzunKenar)) ;

        //daire
        final double pi = 3.14 ;
        System.out.print("Dairenin yarıçapını giriniz : ") ;
        double daireYaricapi = input.nextDouble() ;
        System.out.printf("Dairenin alanı : %.2f\n" ,calculateCircleArea (pi,daireYaricapi) ) ;
        System.out.printf("DAirenin çevresi : %.2f\n" , calculateCirclePerimeter (pi,daireYaricapi)) ;
        
        //üçgen
        System.out.print("Üçgenin tabanını giriniz : " ) ;
        double ucgenTaban = input.nextDouble() ; // Değişken adı değiştirildi
        System.out.print("Üçgenin yüksekliğini giriniz : ") ;
        double ucgenYukseklik = input.nextDouble() ; // Değişken adı değiştirildi
        System.out.printf("Üçgenin alanı : %.2f\n" , calculateTriangleArea (ucgenTaban,ucgenYukseklik)) ;

        System.out.print("Üçgenin 1. kenarını giriniz (Taban) : ") ;
        double kenar1 = input.nextDouble() ;
        System.out.print("Üçgenin 2. kenarını giriniz : ") ;
        double kenar2 = input.nextDouble() ;
        System.out.print("Üçgenin 3. kenarını giriniz : ") ;
        double kenar3 = input.nextDouble() ;
        System.out.printf("Üçgenin çevresi : %.2f\n " , calculateTrianglePerimeter (kenar1, kenar2, kenar3)) ;

        input.close() ;
        
}
    //kare alan
    public static double calculateSquareArea (double kenar ) {
        return kenar * kenar;
    }

    //kare çevre
    public static double calculateSquarePerimeter (double kenar ) {
        return kenar * 4;
    }

    //dikdörtgen alan
    public static int calculateRectangleArea (int kisaKenar, int uzunKenar ) {
        return kisaKenar * uzunKenar ;
    }

    //dikdörtgen çevresi
    public static int calculateRectanglePerimeter (int kisaKenar , int uzunKenar ) {
        return (kisaKenar+uzunKenar)*2 ;
    }

    //daire alan
    public static double calculateCircleArea (final double pi , double daireYaricapi) {
        return pi * daireYaricapi * daireYaricapi ;
    }

    //daire çevre
    public static double calculateCirclePerimeter(final double pi , double daireYaricapi) {
        return 2 * pi * daireYaricapi ;
    }

    //üçgen alan
    public static double calculateTriangleArea(double taban, double yukseklik ) {
        return (taban * yukseklik)/2 ;
    }
    
    //üçgen çevresi
    public static double calculateTrianglePerimeter (double kenar1 , double kenar2 , double kenar3 ) {
        return kenar1 + kenar2 + kenar3;
    }
    

}
