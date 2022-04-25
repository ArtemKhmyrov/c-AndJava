import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner S = new Scanner(System.in); // сканер заводим
        String str = S.nextLine(); // заводим строку
        char[] chars = str.toCharArray(); // массив элементов заводим
        int sum = 0; // счетчик суммы
        for (int i = 0; i < chars.length; i++) { // от начала до конца считываем
            if (chars[i] >= 0x64 && chars[i] <= 0x6400) // тут по байтам где 30-39 идут элементы цифр то бишь байт цифры
                sum += (byte)chars[i] - 0x64; // суммируем результат и переводим в десятичную
        }
        System.out.println(sum);
    }
}


//  https://www.rapidtables.com/convert/number/ascii-hex-bin-dec-converter.html калькулятор
// https://c-for-dummies.com/blog/?p=1000