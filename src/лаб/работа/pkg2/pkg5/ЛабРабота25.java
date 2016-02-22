/*
 * Эта прога сравнивает имена
 */
package лаб.работа.pkg2.pkg5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ЛабРабота25 {
    
    public static boolean numberCheck(String A) {
            for (int j=0; j<10; j++) {
            if (A.contains(""+j)) return true;
            }
        return false;
    }

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name1 = null;

        System.out.println("\nВведи 1-е имя: ");

        try {
            name1 = bufferedReader.readLine(); //читаем строку с клавиатуры
        } catch (IOException ex) {
            System.out.println("\nДа пошел ты! Не хочу!");
        }

        String name2 = null;

        System.out.println("\nВведи 2-е имя: ");

        try {
            name2 = bufferedReader.readLine(); //читаем строку с клавиатуры
        } catch (IOException ex) {
            System.out.println("\nДа пошел ты! Не хочу! Та мне впадлу!");
        }

        System.out.println("\nИмена: " + name1 + ", " + name2);
        
        
        if ((numberCheck(name1)==true) || (numberCheck(name2)==true)) {System.out.println("Имена с цифрами!!! Капец!");  return;}
        
        if ((name1.equalsIgnoreCase(name2))) {System.out.println("\nИмена те же");}
        else if (name1.length()==name2.length()) {System.out.println("\nИмена не те же, но их длины равны.");}
        else {System.out.println("Разные имена как по длине, так и по содержанию.");}
    }

}
