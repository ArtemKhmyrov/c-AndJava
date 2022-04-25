import java.io.*;

public class Task1 {

    public static void main(String[] args) {
        try(FileReader byf = new FileReader("input.txt")) // конструкция тру кетч
        {
            BufferedReader read = new BufferedReader(byf); // создаем буффер для считывания файла и заносим в переменную
            char cymbol = read.readLine().charAt(0); // заводим переменную
            String str = read.readLine(); // заводим стринговую переменную
            int count = 0; //заводим счетчик
            while(str != null){ //считываем до конца файла пока не будет пустое значение
                if (str.length() > 0 && str.charAt(0) == cymbol){ //если строка начинается с нужной буквы то
                    count++; //складываем
                }
                str = read.readLine(); // переходим на следующую строку
            }
            try(FileWriter writer = new FileWriter("output.txt", false)){ // если все ок то записываем в аутпут
                writer.write(Integer.toString(count)); //выводим счетчик в файл
                writer.flush();
            }
            catch(IOException ex){
                System.out.println(ex.getMessage()); // выводим статус операции
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage()); // выводим статус операции
        }
    }
}
