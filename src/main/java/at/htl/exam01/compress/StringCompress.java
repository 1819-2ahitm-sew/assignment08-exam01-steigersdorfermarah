package at.htl.exam01.compress;

import jdk.nashorn.internal.runtime.ErrorManager;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class StringCompress {

    private static final String FILE_NAME = "sample.txt";

    /**
     * Main-Methode, hier wird das StringCompress-Objekt erstellt
     * und die Methoden des Objekts werden aufgerufen
     *
     * @param args
     */
    public static void main(String[] args) {
        int counter = 0;
        String filename = "";
        StringCompress sc = new StringCompress();
        int anzahl = sc.getNoOfLines(filename, counter);
        String[] text = sc.readFromFile(FILE_NAME, anzahl);


    }


    /**
     * Sämtliche Zeilen werden aus der Textdatei eingelesen
     * zB 5A
     * Nun wird in das String-Array AAAAA geschrieben
     * <p>
     * Bsp Testdatei
     * 5A
     * 3B
     * 4C
     * <p>
     * ergibt eine String-Array mit 3 Elementen
     * AAAAA
     * BBB
     * CCCC
     *
     * @param fileName
     * @return String-Array mit dem entpacktem Text
     */
    public String[] readFromFile(String fileName, int anzahl) {


        String[] lines = new String[4];


        try (Scanner scanner = new Scanner(new FileReader(FILE_NAME))) {

            int lineNo = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                char letter = line.charAt(0);
                String noStr = line.substring(1);
                int noAnzahl = Integer.parseInt(noStr);


                lines[lineNo] = "";

                for (int j = 0; j < noAnzahl; j++) {

                    lines[lineNo] += letter;

                }

                lineNo++;

            }
        } catch (FileNotFoundException e) {
            System.err.print(e.getMessage());
        }


//        int counter = 0;
//        String [] elements = new String[100];
//        StringBuilder stringBuilder = new StringBuilder();
//        try (Scanner scanner = new Scanner(new FileReader(FILE_NAME))){
//
//            while (scanner.hasNextLine()){
//                System.out.println(scanner.nextLine());

//                for (int i = 0; i < anzahl; i++) {
//                    elements[i]  = scanner.next();
//                    System.out.println();
//                    System.out.println(elements[i]);
//                }


//                for (int i = 0; i < anzahl; i++) {
//                    if (scanner.next().charAt(anzahl) == scanner.next().charAt(anzahl++)){
//                        elements[i] = scanner.next().substring(anzahl);
//
//                        System.out.println(elements[i]);
//                    }
//                }


        //  elements[counter] = scanner.next().substring(counter,counter++) ;


//
//                counter++;
//            }
//
//        }
//        catch (FileNotFoundException e){
//            System.err.print(e);
//        }
//
//        return elements;

        return lines;

    }

    /**
     * Der Inhalt des String-Arrays wird zeilenweise auf der Console ausgegeben
     *
     * @param lines String-Array
     */
    public void print(String[] lines) {



        System.out.println("");
    }

    /**
     * Die Anzahl der Zeilen der übergebenen Textdatei wird bestimmt
     *
     * @param fileName
     * @return Anzahl der Zeilen in der Textdatei
     */
    public int getNoOfLines(String fileName, int counter) {

        try (Scanner scanner = new Scanner(new FileReader(FILE_NAME))) {
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                counter++;
            }
        } catch (FileNotFoundException e) {
            System.err.print(e.getMessage());
        }
        return counter;
    }
}
