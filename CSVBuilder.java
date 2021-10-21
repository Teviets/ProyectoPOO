import java.util.Scanner;
import java.io.File; // Import the File class
import java.io.IOException; // Import the IOException class to handle errors
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;

class CSVBuilder {

    public CSVBuilder() {

    }

    public String CSVBuild(String TestCSV) {

        String data = ""; // variable de retorno

        // el try catch funciona para crear un bloque de texto donde puedas ver todo el
        // contenido de nuestro CSV.

        try {
            File myObj = new File(TestCSV);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data += myReader.nextLine() + "\n";

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            String Error = ("An error occurred.");
            e.printStackTrace();
            return Error;
        }

        return data;

    }

    public string PrintSpecifics(String TestCSV) {

    }

}
