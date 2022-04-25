import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // заводим сканер
        System.out.println("Введите строку S:"); // вывод
        String S = in.nextLine(); // заводим неизменную строку
        for (int i = 0; i < S.length(); i++) { // идем пока не дойдем до конца строки методом (Length())
            System.out.println(S.charAt(i)); // выводим каждый элемент
        } // снова заходим на круг и так циклимся
    }
}