
/**
 * @author Maajid Saidy
 * het doel van deze applicatie is een dobbelsteen maken die door blijft rollen tot hij 6 raakt
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // scanner wordt aangemaakt
        Scanner input = new Scanner(System.in);

        // hier wordt gevraagd om de vorm van de ogen aan te geven
        System.out.println("geef je ogen aan");
        String ogen = input.nextLine();

        // while statement die altijd blijft loopen tot hij gereturned wordt
        while (true) {

            // math random in een constanten gezet
            double random = Math.random();
            // hier wordt een random nummer gegenereerd
            int dobbelsteenNummer = (int) (random * 6) + 1;

            // switch case gemaakt voor elke uitkomst van de dobbelsteen zijn patroon
            switch (dobbelsteenNummer) {
                case 1:
                    System.out.println(" " + " " + " ");
                    System.out.println(" " + ogen + " ");
                    System.out.println(" " + " " + " ");
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println(ogen + " " + " ");
                    System.out.println(" " + " " + " ");
                    System.out.println(" " + " " + ogen);
                    System.out.println(" ");

                    break;
                case 3:
                    System.out.println(ogen + " " + " ");
                    System.out.println(" " + ogen + " ");
                    System.out.println(" " + " " + ogen);
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println(ogen + " " + ogen);
                    System.out.println(" " + " " + " ");
                    System.out.println(ogen + " " + ogen);
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println(ogen + " " + ogen);
                    System.out.println(" " + ogen + " ");
                    System.out.println(ogen + " " + ogen);
                    System.out.println(" ");
                    break;
                case 6:
                    System.out.println(ogen + " " + ogen);
                    System.out.println(ogen + " " + ogen);
                    System.out.println(ogen + " " + ogen);
                    System.out.println(" ");
                    return;

            }
        }
    }
}