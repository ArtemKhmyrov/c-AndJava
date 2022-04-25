import java.io.*;

public class Task3 {

    public static void main(String[] args) {
        try(FileReader reader = new FileReader("input.txt")) // открываем файл
        {
            BufferedReader read = new BufferedReader(reader);
            String str = read.readLine(); // переменная стринговая
            int max_digit = 0; // заводим переменную
            StringBuilder max_str = new StringBuilder();
            while(str != null){ //пока файл не пустой
                if (str.length() > max_digit){ //если длина больше переменной
                    max_digit = str.length(); //переменная равна данному значению
                    max_str = new StringBuilder(str); //строка тоже
                }
                str = read.readLine(); //переходим к следующей переменной
            }
            try(FileWriter writer = new FileWriter("output.txt", false)){ // если ок открываем аутпут
                writer.write(max_str + "\n" + max_digit); //кладем в файл макс строку и макс длину
                writer.flush(); // закрываемся
            }
            catch(IOException ex){
                System.out.println(ex.getMessage()); // вывод статуса
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage()); // вывод статуса
        }
    }
}
