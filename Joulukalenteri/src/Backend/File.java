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
    private Avatut avatut = new Avatut();

    public File() {
        lisaaLuukut();
        Kirjoitus();

        Luku();
        setLuukut();

        for (int i = 0; i < 23; i++) {
            System.out.println(luukut[i]);
        }
    }

    public void lisaaLuukut() {
        luukut[0] = avatut.getLuukku1();
        luukut[1] = avatut.getLuukku2();
        luukut[2] = avatut.getLuukku3();
        luukut[3] = avatut.getLuukku4();
        luukut[4] = avatut.getLuukku5();
        luukut[5] = avatut.getLuukku6();
        luukut[6] = avatut.getLuukku7();
        luukut[7] = avatut.getLuukku8();
        luukut[8] = avatut.getLuukku9();
        luukut[9] = avatut.getLuukku10();
        luukut[10] = avatut.getLuukku11();
        luukut[11] = avatut.getLuukku12();
        luukut[12] = avatut.getLuukku13();
        luukut[13] = avatut.getLuukku14();
        luukut[14] = avatut.getLuukku15();
        luukut[15] = avatut.getLuukku16();
        luukut[16] = avatut.getLuukku17();
        luukut[17] = avatut.getLuukku18();
        luukut[18] = avatut.getLuukku19();
        luukut[19] = avatut.getLuukku20();
        luukut[20] = avatut.getLuukku21();
        luukut[21] = avatut.getLuukku22();
        luukut[22] = avatut.getLuukku23();
        luukut[23] = avatut.getLuukku24();
    }

    public void setLuukut() {
        avatut.setLuukku1(luukut[0]);
        avatut.setLuukku2(luukut[1]);
        avatut.setLuukku3(luukut[2]);
        avatut.setLuukku4(luukut[3]);
        avatut.setLuukku5(luukut[4]);
        avatut.setLuukku6(luukut[5]);
        avatut.setLuukku7(luukut[6]);
        avatut.setLuukku8(luukut[7]);
        avatut.setLuukku9(luukut[8]);
        avatut.setLuukku10(luukut[9]);
        avatut.setLuukku11(luukut[10]);
        avatut.setLuukku12(luukut[11]);
        avatut.setLuukku13(luukut[12]);
        avatut.setLuukku14(luukut[13]);
        avatut.setLuukku15(luukut[14]);
        avatut.setLuukku16(luukut[15]);
        avatut.setLuukku17(luukut[16]);
        avatut.setLuukku18(luukut[17]);
        avatut.setLuukku19(luukut[18]);
        avatut.setLuukku20(luukut[19]);
        avatut.setLuukku21(luukut[20]);
        avatut.setLuukku22(luukut[21]);
        avatut.setLuukku23(luukut[22]);
        avatut.setLuukku24(luukut[23]);
    }

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
        setLuukut();
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

    public static void main(String[] args) {
        new File();
    }
}
