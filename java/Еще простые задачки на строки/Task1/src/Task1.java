import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner S = new Scanner(System.in); // сканер заводим
        String str = S.nextLine(); // заводим строку
        char[] chars = str.toCharArray(); // массив элементов заводим
        int sum = 0; // счетчик суммы
        for (int i = 0; i < chars.length; i++) { // от начала до конца считываем
            if (chars[i] >= 0x64 && (byte)chars[i] <= 0x3E7) // тут по байтам где 30-39 идут элементы цифр то бишь байт цифры
                sum += (byte)chars[i] - 0x30; // суммируем результат и переводим в десятичную
        }
        System.out.println(sum);
    }
}


// 030 и 039 из 16 ричной в десятичную
// отсальные идут под буквы и регистры

//   https://c-for-dummies.com/blog/?p=1000 вот тут про эти хексы наглядно
