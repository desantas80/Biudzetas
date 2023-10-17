package Biudzetas1version;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Biudzetas biudzetas = new Biudzetas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pasirinkite veiksmą:");
            System.out.println("1. Pridėti pajamas");
            System.out.println("2. Pridėti išlaidas");
            System.out.println("3. Gauti visą pajamų sumą");
            System.out.println("4. Gauti visą išlaidų sumą");
            System.out.println("5. Atspausdinti balansą");
            System.out.println("6. Baigti programą");

            int veiksmas = scanner.nextInt();

            switch (veiksmas) {
                case 1:
                    System.out.println("Įveskite pajamų sumą:");
                    double pajamos = scanner.nextDouble();
                    biudzetas.pridetiPajamas(pajamos);
                    System.out.println("=============================");
                    break;
                case 2:
                    System.out.println("Įveskite išlaidų sumą:");
                    double islaidos = scanner.nextDouble();
                    biudzetas.pridetiIslaidas(islaidos);
                    System.out.println("=============================");
                    break;
                case 3:
                    System.out.println("Visos pajamos: " + biudzetas.gautiVisasPajamas());
                    System.out.println("=============================");
                    break;
                case 4:
                    System.out.println("Visos išlaidos: " + biudzetas.gautiVisasIslaidas());
                    System.out.println("=============================");
                    break;
                case 5:
                    System.out.println("Balansas:");
                    if(biudzetas.gautiVisasPajamas() >= biudzetas.gautiVisasIslaidas()) {
                        System.out.println("Pelnas = " + (biudzetas.gautiVisasPajamas() - biudzetas.gautiVisasIslaidas()));
                        System.out.println("=============================");
                    } else  {
                        System.out.println("Nuostolis = " + (biudzetas.gautiVisasIslaidas() - biudzetas.gautiVisasPajamas()));
                        System.out.println("=============================");
                    }
                    break;
                case 6:
                    System.out.println("Programa baigia darbą.");
                    System.out.println("=============================");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Neteisingas veiksmas.");
                    System.out.println("=============================");
            }
        }
    }
}
