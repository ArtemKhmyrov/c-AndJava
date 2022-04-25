import java.io.*;

public class Task2 {

    public static void main(String[] args) {
        try(FileReader reader = new FileReader("input.txt")) // тру кетч и открываем файл
        {
            BufferedReader read = new BufferedReader(reader); // заводим буфер для считывания
            String str = read.readLine(); // переменную стринговую заводим
            int count = 0; //счетчик строк начинающихся с символа с
            while(str != null){ //пока файл не пустой считываем
                if (str.length() > 0 && str.charAt(0) == str.charAt(str.length()-1)){ // условие если начинается и заканчивается на одну и ту же букву
                    count++; //прибавляем
                }
                str = read.readLine(); //зацкиливаемся и идем дальше
            }
            try(FileWriter writer = new FileWriter("output.txt", false)){ // если все ок создаем и открываем файл
                writer.write(Integer.toString(count)); // записываем в него счетчик
                writer.flush(); // завершаемся
            }
            catch(IOException ex){
                System.out.println(ex.getMessage()); // статус выводим
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage()); // вывод статуса
        }
    }
}