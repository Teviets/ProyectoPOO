import java.util.Scanner;
import java.io.File; // Import the File class
import java.io.IOException; // Import the IOException class to handle errors
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;

public class CSV {

    public static void main(String[] args) {

        String Name;
        String Password;
        String FullName;
        String CellPhone;
        Int Age;
        String Adress;
        String SchoolYear;
        String Job;

        Scanner Scan = new Scanner(System.in); // declarar scanner

        CSVBuilder MyBuilder = new CSVBuilder(); // Crear un objeto CSV builder

        try {
            FileWriter myWriter = new FileWriter("Testing.csv", true); // el true es importante para no borrar toda la
                                                                       // informacion

            System.out.println("Cual es tu nombre?");
            Name = Scan.nextLine();
            myWriter.write(Name + ",");

            /******************************
             * 
             * En estos prints se agrega la informacion al final de nuestro CSV
             * 
             */

            System.out.println("Cual es tu password?");
            Password = Scan.nextLine();
            myWriter.write(Password + ",");

            System.out.println("Cual es tu nombre completo?");
            FullName = Scan.nextLine();
            myWriter.write(FullName + ",");

            System.out.println("Cual es tu numero de celular?");
            CellPhone = Scan.nextLine();
            myWriter.write(CellPhone + ",");

            System.out.println("Cual es tu edad?");
            Age = Scan.nextLine();
            myWriter.write(Age + ",");

            System.out.println("Cual es tu direccion?");
            Adress = Scan.nextLine();
            myWriter.write(Adress + ",");

            System.out.println("Que diploma tienes?");
            SchoolYear = Scan.nextLine();
            myWriter.write(SchoolYear + ",");

            System.out.println("Que diploma tienes?");
            SchoolYear = Scan.nextLine();
            myWriter.write(SchoolYear + ",");

            System.out.println("Estas empleado? (si o no)");
            Job = Scan.nextLine();
            myWriter.write(Job + ",");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // System.out.println(MyBuilder.CSVBuild("Testing.csv")); <-- esta linea es para
        // ver que todo funcione correctamente dejala como comentario

    }

}
