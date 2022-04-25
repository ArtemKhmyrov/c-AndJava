import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // заводим сканер
        System.out.println("Введите строку S:"); // вывод
        String S = in.nextLine(); // заводим неизменную строку
        String reverse = new StringBuffer(S).reverse().toString(); // метод реверс()
        for (int i = 0; i < reverse.length(); i++) { // идем пока не дойдем до конца строки методом (Length())
            System.out.println(reverse.charAt(i)); // выводим каждый элемент
        } // снова заходим на круг и так циклимся
    }
}