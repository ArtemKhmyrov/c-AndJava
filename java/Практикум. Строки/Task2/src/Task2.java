import java.util.Scanner; // импортируем сканер

public class Task2 { // класс задачки
    public static void main(String[] args) { // мейн класс
        Scanner in = new Scanner(System.in); // заводим сканер
        System.out.println("Введите строку S:"); // вывод в консоль
        String S = in.nextLine(); // заводим стринговую строку
        for (int i = 0; i < S.length() - 1; i++){ // цикл фор пока до дойдем до конца строки Ы
            if (S.charAt(i) == S.charAt(i + 1)){ // условие если данный элемент равен следующему элементу
                System.out.println("YES"); // выводим да
                return; // возвращаем
            }
        }
        System.out.println("NO"); // в противном случае выводим нет
        in.close(); // завершаем работу сканера
    }
}