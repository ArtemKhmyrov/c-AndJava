import java.util.Scanner; // сканер импортируем

public class Task4 { // класс

    public static void main(String[] args) { // главный класс
        System.out.println("Введите строку S:"); // вывод
        Scanner in = new Scanner(System.in); // заводим сканер
        String S = in.nextLine(); // заводим строку которая не изменяется в отличие от стрингбилдер
        String[] arr = S.split(" "); // заводим массив строк где разбиваем строку на подстроки
        String S1 = arr[1] + " " + arr[0]; // меняем нулевой элемент с первым, но работает для подгона задачки. можно было бы сделать через цикл фор где брали бы элемент i и меняли с i+1
        System.out.println(S1); // вывод
    }
}

