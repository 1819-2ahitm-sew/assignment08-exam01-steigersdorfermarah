package at.htl.exam01.document;

import java.util.Scanner;

public class Main {

    /**
     *
     * Führen Sie hier folgendes durch:
     *
     * 1. Erstellen Sie 2 Bücher und ein email
     *    Buch: "Rowlings", "Harry Potter und der Stein der Weisen"
     *    Email: "Susi", "Bewerbung", "CoolCompany"
     *    Buch: "Tolkien", "lordOfTheRings"
     *
     * 2. Erstellen Sie ein Document-Array und speichern Sie obige Dokumente in diesem Array.
     *
     * 3. Geben Sir die Inhalte dieser Documente wie folgt aus.
     *    Nutzen Sie dabei die Mechanismen der Vererbung.
     *    Erstellen Sie außerdem geeignete toString-Methoden
     *
     * 4. Zählen Sie die Bücher und emails im Array und geben Sie die jeweilige Anzahl aus.
     *
     * @param args
     */

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int anzahlBuch = 0;
        int anzahlEmail = 0;
        String [] documents = new String[3];

        documents[0] = "Buch: 'Harry Potter und der Stein der Weisen' von 'Rowlings'";
        documents[1] = "Email: 'Bewerbung' von 'Susi' an 'CoolCompany'";
        documents[2] = "Buch: 'lordOfTheRings' von 'Tolkien'";


        readBook(documents);
        printBook(documents,anzahlBuch, anzahlEmail);



    }

    private static void readBook(String[] documents) {
        String [] elements = new String[1000];


        for (int i = 0; i < documents.length; i++) {
            elements = documents[i].split("'");

        }

       // System.out.println(elements);
    }

    private static void printBook(String[] documents, int anzahlBuch, int anzahlEmail) {


        for (int i = 0; i < documents.length; i++) {

            if (documents[i].startsWith("Buch")){
                System.out.println(documents[i]);
                anzahlBuch++;
            }else if (documents[i].startsWith("Email")){
                System.out.println(documents[i]);
                anzahlEmail++;
            }
        }
        System.out.println();
        System.out.println("Anzahl Books: " + anzahlBuch);
        System.out.println("Anzahl Eamil: " + anzahlEmail);

    }


}
