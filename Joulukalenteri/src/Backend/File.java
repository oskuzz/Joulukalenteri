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
    
    //Ohjelman avautuessa Luku() + setLuukut()
    //Luukun avattua lisaLuukut() + Kirjoitus()

    private boolean[] luukut = new boolean[24];

    private Luukku Luukku1;
    private Luukku Luukku2;
    private Luukku Luukku3;
    private Luukku Luukku4;
    private Luukku Luukku5;
    private Luukku Luukku6;
    private Luukku Luukku7;
    private Luukku Luukku8;
    private Luukku Luukku9;
    private Luukku Luukku10;
    private Luukku Luukku11;
    private Luukku Luukku12;
    private Luukku Luukku13;
    private Luukku Luukku14;
    private Luukku Luukku15;
    private Luukku Luukku16;
    private Luukku Luukku17;
    private Luukku Luukku18;
    private Luukku Luukku19;
    private Luukku Luukku20;
    private Luukku Luukku21;
    private Luukku Luukku22;
    private Luukku Luukku23;
    private Luukku Luukku24;

    public File(Luukku Luukku1, Luukku Luukku2, Luukku Luukku3, Luukku Luukku4, Luukku Luukku5, Luukku Luukku6, Luukku Luukku7, Luukku Luukku8, Luukku Luukku9, Luukku Luukku10, Luukku Luukku11, Luukku Luukku12, Luukku Luukku13, Luukku Luukku14, Luukku Luukku15, Luukku Luukku16, Luukku Luukku17, Luukku Luukku18, Luukku Luukku19, Luukku Luukku20, Luukku Luukku21, Luukku Luukku22, Luukku Luukku23, Luukku Luukku24) {
        this.Luukku1 = Luukku1;
        this.Luukku2 = Luukku2;
        this.Luukku3 = Luukku3;
        this.Luukku4 = Luukku4;
        this.Luukku5 = Luukku5;
        this.Luukku6 = Luukku6;
        this.Luukku7 = Luukku7;
        this.Luukku8 = Luukku8;
        this.Luukku9 = Luukku9;
        this.Luukku10 = Luukku10;
        this.Luukku11 = Luukku11;
        this.Luukku12 = Luukku12;
        this.Luukku13 = Luukku13;
        this.Luukku14 = Luukku14;
        this.Luukku15 = Luukku15;
        this.Luukku16 = Luukku16;
        this.Luukku17 = Luukku17;
        this.Luukku18 = Luukku18;
        this.Luukku19 = Luukku19;
        this.Luukku20 = Luukku20;
        this.Luukku21 = Luukku21;
        this.Luukku22 = Luukku22;
        this.Luukku23 = Luukku23;
        this.Luukku24 = Luukku24;
    }

    public void lisaaLuukut() {
        luukut[0] = Luukku1.getAvattu();
        luukut[1] = Luukku2.getAvattu();
        luukut[2] = Luukku3.getAvattu();
        luukut[3] = Luukku4.getAvattu();
        luukut[4] = Luukku5.getAvattu();
        luukut[5] = Luukku6.getAvattu();
        luukut[6] = Luukku7.getAvattu();
        luukut[7] = Luukku8.getAvattu();
        luukut[8] = Luukku9.getAvattu();
        luukut[9] = Luukku10.getAvattu();
        luukut[10] = Luukku11.getAvattu();
        luukut[11] = Luukku12.getAvattu();
        luukut[12] = Luukku13.getAvattu();
        luukut[13] = Luukku14.getAvattu();
        luukut[14] = Luukku15.getAvattu();
        luukut[15] = Luukku16.getAvattu();
        luukut[16] = Luukku17.getAvattu();
        luukut[17] = Luukku18.getAvattu();
        luukut[18] = Luukku19.getAvattu();
        luukut[19] = Luukku20.getAvattu();
        luukut[20] = Luukku21.getAvattu();
        luukut[21] = Luukku22.getAvattu();
        luukut[22] = Luukku23.getAvattu();
        luukut[23] = Luukku24.getAvattu();
    }

    public void setLuukut() {

        Luukku1.setAvattu(luukut[0]);
        Luukku2.setAvattu(luukut[1]);
        Luukku3.setAvattu(luukut[2]);
        Luukku4.setAvattu(luukut[3]);
        Luukku5.setAvattu(luukut[4]);
        Luukku6.setAvattu(luukut[5]);
        Luukku7.setAvattu(luukut[6]);
        Luukku8.setAvattu(luukut[7]);
        Luukku9.setAvattu(luukut[8]);
        Luukku10.setAvattu(luukut[9]);
        Luukku11.setAvattu(luukut[10]);
        Luukku12.setAvattu(luukut[11]);
        Luukku13.setAvattu(luukut[12]);
        Luukku14.setAvattu(luukut[13]);
        Luukku15.setAvattu(luukut[14]);
        Luukku16.setAvattu(luukut[15]);
        Luukku17.setAvattu(luukut[16]);
        Luukku18.setAvattu(luukut[17]);
        Luukku19.setAvattu(luukut[18]);
        Luukku20.setAvattu(luukut[19]);
        Luukku21.setAvattu(luukut[20]);
        Luukku22.setAvattu(luukut[21]);
        Luukku23.setAvattu(luukut[22]);
        Luukku24.setAvattu(luukut[23]);
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

}
