package example2;

import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {

        double value, kdvOran = 0.18, result;
        Scanner input = new Scanner(System.in);


        System.out.print("Harcanan tutarı giriniz:");
        value = input.nextDouble();

        if (value <=1000){
            result = value * kdvOran;
            System.out.println("KDV'li fiyat:" + (result + value));
            System.out.println("KDV'siz fiyat:" + value);
            System.out.println("KDV tutarı:" + result);
        } else {
            result = value * 0.08;
            System.out.println("KDV'li fiyat:" + (result + value));
            System.out.println("KDV'siz fiyat:" + value);
            System.out.println("KDV tutarı:" + result);
        }



    }
}
