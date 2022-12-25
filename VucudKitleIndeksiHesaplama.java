import android.icu.number.Scale;

import java.util.Scanner;

public class VucudKitleIndeksiHesaplama {
    public static void main(String[] args) {
        double kilo,boy,kitle;

        Scanner oku=new Scanner(System.in);
        boy=oku.nextDouble();
        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        kilo=oku.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");

        kitle=kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz: "+kitle);
    }
}
