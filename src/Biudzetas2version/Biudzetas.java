package Biudzetas2version;

import java.util.Date;

public class Biudzetas {
    private PajamuIrasas[] pajamos = new PajamuIrasas[100];
    private IslaiduIrasas[] islaidos = new IslaiduIrasas[100];
    private int pajamuSkaicius = 0;
    private int islaiduSkaicius = 0;

    public void pridetiPajamas(double suma, String kategorijosIndeksas, String dataSuLaiku, boolean gautaIBankoSaskaita, String papildomaInformacija) {
        if (pajamuSkaicius < 100) {
            pajamos[pajamuSkaicius++] = new PajamuIrasas(suma, kategorijosIndeksas, dataSuLaiku, gautaIBankoSaskaita, papildomaInformacija){};
            System.out.println("Pajamos pridėtos: " + suma);
        } else {
            System.out.println("Pasiektas maksimalus pajamų įrašų skaičius.");
        }
    }

    public void pridetiIslaidas(double suma, String kategorijosIndeksas, Date dataSuLaiku, String atsiskaitymoBudas, String bankoKortele, String papildomaInformacija) {
        if (islaiduSkaicius < 100) {
            islaidos[islaiduSkaicius++] = new IslaiduIrasas(suma, kategorijosIndeksas, dataSuLaiku, atsiskaitymoBudas, bankoKortele, papildomaInformacija){};
                System.out.println("Išlaidos pridėtos: " + suma);
            } else{
                System.out.println("Pasiektas maksimalus išlaidų įrašų skaičius.");
            }
        }


    public double gautiVisasPajamas() {
        double suma = 0;
        for (int i = 0; i < pajamuSkaicius; i++) {
            suma += pajamos[i].getSuma();
        }
        return suma;
    }

    public double gautiVisasIslaidas() {
        double suma = 0;
        for (int i = 0; i < islaiduSkaicius; i++) {
            suma += islaidos[i].getSuma();
        }
        return suma;
    }
}
