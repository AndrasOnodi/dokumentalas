import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {

    public ArrayList<Employee> readFile() {
        try {
            return tryreadFile();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public ArrayList<Employee> tryreadFile() throws FileNotFoundException {

        ArrayList<Employee> empList = new ArrayList<>();
        String fileName = "dolgozok_002_rendbetett.csv";
        File file = new File(fileName);

        try(Scanner sc = new Scanner(file)) {
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        }


        return empList;
    }
}
