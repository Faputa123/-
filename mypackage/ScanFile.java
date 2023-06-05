//ЛАБОРАТОРНАЯ РАБОТА №5 Горякина А.В.
package mypackage;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ScanFile {
    public static void main(String[] args) throws FileNotFoundException {           // Если файла не существует, срабатывает исключение
        String path = "D:/Education/Технологии программиования/5/temp.txt";
        File file = new File(path);
        
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }

        scan.close();
    }
}