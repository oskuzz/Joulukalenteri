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

    public void Luku() {

        String avatut = "avatut.txt";
        String line;

        try {
            FileReader tiedostonLukija = new FileReader(avatut);
            BufferedReader bufferedReader = new BufferedReader(tiedostonLukija);

            for (int i = 0; i < 23; i++) {
                luukut[i] = Boolean.parseBoolean(line = bufferedReader.readLine());
            }

            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Tiedostoa ei voitu avata '" + avatut + "'");
        } catch (IOException ex) {
            System.out.println("Virhe lukiessa tiedostoa '" + avatut + "'");
        }

    }

    public void Kirjoitus() {

        String avatut = "avatut.txt";
        String line;

        try {
            FileWriter tiedostonKirjoittaja = new FileWriter(avatut);
            BufferedWriter bufferedWriter = new BufferedWriter(tiedostonKirjoittaja);

            FileReader tiedostonLukija = new FileReader(avatut);
            BufferedReader bufferedReader = new BufferedReader(tiedostonLukija);

            for (int i = 0; i < 23; i++) {
                bufferedWriter.write(String.valueOf(luukut[i]));
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        } catch (IOException ex) {
            System.out.println("Tiedostoon ei voitu kirjoittaa '" + avatut + "'");
        }
    }

}
