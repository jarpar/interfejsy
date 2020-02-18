package interfejsy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        nazwaInterfejsu a = new Pracownik();
//        System.out.println(((Pracownik) a).getWynagrodzenie());
//        System.out.println(nazwaInterfejsu.PI);
//        a.cos();
//        int[] tab = new int[4];
//        tab[0] = 4;
//        tab[1] = 3;
//        tab[2] = 2;
//        tab[3] = 1;
//
//        Arrays.sort(tab);
//        System.out.println(tab[0]);

        Pracownik[] pracownik = new Pracownik[3];
        pracownik[0] = new Pracownik(10000);
        pracownik[1] = new Pracownik(1000);
        pracownik[2] = new Pracownik(5000);
        //System.out.println(pracownik[0].compareTo(pracownik[1]));
        System.out.println("przed sortowaniem:");
        for (Pracownik p : pracownik
        ) {
            System.out.println(p.getWynagrodzenie());

        }

        Arrays.sort(pracownik);
        System.out.println("po sortowaniu:");
        for (Pracownik p : pracownik
        ) {
            System.out.println(p.getWynagrodzenie());

        }

    }
}

//class Programista extends Pracownik {
//
//}