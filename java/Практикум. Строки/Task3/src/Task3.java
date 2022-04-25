import java.util.Scanner; // импортируем сканер
public class Task3 { // класс задачки

    public static void main(String[] args) { // главный класс
        Scanner in = new Scanner(System.in); // заводим сканер
        System.out.println("Введите строку S:"); // вывод
        StringBuilder S = new StringBuilder(in.nextLine()); // заводим стринговую строчку
        if (S.length() % 2 == 0) { // условие если длина строчки четная
            S.delete(S.length() / 2 - 1, S.length() / 2 + 1); // то удаляем элемент посередине (метод delete())
        }
        else{
            S.deleteCharAt(S.length() / 2); // в противном случае берем индекс элемента и удалаяем
        }
        System.out.println(S); // вывод
        in.close(); // закрываем сканер
    }
}