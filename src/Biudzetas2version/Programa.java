package Biudzetas2version;

import java.util.Date;
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
            System.out.println("5. Baigti programą");

            int veiksmas = scanner.nextInt();

            switch (veiksmas) {
                case 1 -> pajamuIrasas(scanner, biudzetas);
                case 2 -> islaiduIrasas(scanner, biudzetas);
                case 3 -> System.out.println("Visos pajamos: " + biudzetas.gautiVisasPajamas());
                case 4 -> System.out.println("Visos išlaidos: " + biudzetas.gautiVisasIslaidas());
                case 5 -> {
                    System.out.println("Programa baigia darbą.");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Neteisingas veiksmas.");
            }
        }
    }

    private static void islaiduIrasas(Scanner scanner, Biudzetas biudzetas) {
        scanner.nextLine();
        System.out.println("Įveskite išlaidų sumą:");
        double islaidosSuma = scanner.nextDouble();
        System.out.println("Įveskite kategorijos indeksą:");
        String islaiduKategorijosIndeksas = scanner.next();
        System.out.println("Įveskite datą su laiku (pvz., '2023-10-06 14:30:00'):");
        Date islaiduDataSuLaiku = scanner.next(); // TODO sutvarkyti datos formata i Date
        System.out.println("Įveskite atsiskaitymo būdą:");
        String atsiskaitymoBudas = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Įveskite banko kortelę:");
        String bankoKortele = scanner.next();
        scanner.nextLine();
        System.out.println("Įveskite papildomą informaciją:");
        String islaiduPapildomaInformacija = scanner.nextLine();
        biudzetas.pridetiIslaidas(islaidosSuma, islaiduKategorijosIndeksas, islaiduDataSuLaiku,
                atsiskaitymoBudas, bankoKortele, islaiduPapildomaInformacija);
    }

    private static void pajamuIrasas(Scanner scanner, Biudzetas biudzetas) {
        System.out.println("Įveskite pajamų sumą:");
        double pajamosSuma = scanner.nextDouble();
        System.out.println("Įveskite kategorijos indeksą:");
        String pajamuKategorijosIndeksas = scanner.next();
        System.out.println("Įveskite datą su laiku:");
        String pajamuDataSuLaiku = scanner.next();
        System.out.println("Ar pinigai gauti į banko sąskaitą? (true/false):");
        scanner.nextLine();
        boolean gautaIBankoSaskaita = Boolean.parseBoolean(scanner.next());
        scanner.nextLine();
        System.out.println("Įveskite papildomą informaciją:");
        String pajamuPapildomaInformacija = scanner.nextLine();
        biudzetas.pridetiPajamas(pajamosSuma, pajamuKategorijosIndeksas, pajamuDataSuLaiku,
                gautaIBankoSaskaita, pajamuPapildomaInformacija);
    }
}
