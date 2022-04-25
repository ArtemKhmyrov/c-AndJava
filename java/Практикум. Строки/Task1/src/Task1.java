// https://vertex-academy.com/tutorials/ru/rabota-so-skannerom-v-java/ тут про сканеры подробно
import java.util.Scanner; // для ввода и вывода (типа include <iostream> только это сканер)
public class Task1{ // класс

    public static void main(String[] args) { // как забавно класс в классе)))
        Scanner in = new Scanner(System.in); // объявляем новый сканер
        System.out.println("Введите символ c1:"); // вывод в консоль
        char c1 = in.nextLine().charAt(0); // ввод символа причем с новой строки
        System.out.println("Введите символ c2:"); // вывод в консоль
        char c2 = in.nextLine().charAt(0); // ввод символа так же с новой строки
        System.out.println("Введите строку S:"); // вывод
        StringBuilder S = new StringBuilder(in.nextLine()); // объявляем
        for (int i = 0; i < S.length(); i++){ //цикл пока строка по размеру не кончится (метод length() как в JS)
            if (S.charAt(i) == c2){ // условие если данный символ равен с2 то
                S.insert(i+1, c1); // на следующее место встает первый символ (insert Добавляет в массив элемент в указанное место)
                i++; // переход к следующему
            }
        }
        System.out.println(S); // вывод результата
        in.close(); // я так понял закрываем сканер
    }
}
