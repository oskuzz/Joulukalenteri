/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.*;

/**
 *
 * @author s1601396
 */
public class File {

    private boolean[] luukut = new boolean[24];

    public File() {
        Luku();
        Kirjoitus();

    }

    public static void Luku() {

        String avatut = "avatut.txt";
        String line;

        try {
            FileReader tiedostonLukija = new FileReader(avatut);
            BufferedReader bufferedReader = new BufferedReader(tiedostonLukija);

            if ((line = bufferedReader.readLine()) == "false") {
                System.out.println("Luukkua ei voi vielä avata");
            }

            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Tiedostoa ei voitu avata '" + avatut + "'");
        } catch (IOException ex) {
            System.out.println("Virhe lukiessa tiedostoa '" + avatut + "'");
        }
    }

    public static void Kirjoitus() {

        String avatut = "avatut.txt";
        String line;

        try {
            FileWriter tiedostonKirjoittaja = new FileWriter(avatut);
            BufferedWriter bufferedWriter = new BufferedWriter(tiedostonKirjoittaja);

            FileReader tiedostonLukija = new FileReader(avatut);
            BufferedReader bufferedReader = new BufferedReader(tiedostonLukija);

            for (int i = 1; i <= 24; i++ ) {
                if ((line = bufferedReader.readLine()) == null) {
                    bufferedWriter.write("false");
                    bufferedWriter.newLine();
                }
            }

            bufferedWriter.close();
        } catch (IOException ex) {
            System.out.println("Tiedostoon ei voitu kirjoittaa '" + avatut + "'");
        }
    }
    public static void main(String[] args) {
        Luku();
        Kirjoitus();
    }
}
