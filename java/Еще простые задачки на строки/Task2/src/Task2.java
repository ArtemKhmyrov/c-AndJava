import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner S = new Scanner(System.in); // сканер заводим
        String str = S.nextLine(); // заводим строку
        char[] chars = str.toCharArray(); // массив элементов заводим
        int max_digit = 0; // счетчик суммы
        for (int i = 0; i < chars.length; i++) { // от начала до конца считываем
            if ((byte)chars[i] >= max_digit) // тут по байтам где 30-39 идут элементы цифр то бишь байт цифры
                max_digit = chars[i]; // суммируем результат и переводим в десятичную

        }

        System.out.println(max_digit);
    }
}



//  S.append((char) Integer.parseInt(str, 16)); хочу Отпарсить этим методом

//   https://c-for-dummies.com/blog/?p=1000 вот тут про эти хексы наглядно
