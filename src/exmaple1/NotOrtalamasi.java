package exmaple1;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz:");
        mat = input.nextInt();

        System.out.print("Fizik notunuz:");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz:");
        kimya = input.nextInt();

        System.out.print("Turkce notunuz:");
        turkce = input.nextInt();

        System.out.print("Tarih notunuz:");
        tarih = input.nextInt();

        System.out.print("Muzik notunuz:");
        muzik = input.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız : " + sonuc);

    }
}
