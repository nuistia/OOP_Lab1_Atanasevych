import java.util.Scanner;
import java.util.Arrays;

public class Main {

    /* Задание 1: метод, который принимает массив целых чисел,
     * и возвращает true, если в массиве каждый элемент
     * больше или равен предыдущему*/
    private static boolean taskOne(int[] array) {
        boolean resultOfTask = true;
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                break;
            }
            if (array[i + 1] < array[i]) {
                resultOfTask = false;
                break;
            }
        }
        return resultOfTask;
    }

    /* Задание 2: реализация игры FizzBuzz. Вместо чисел,
     * кратных трем, программа должна выводить слово «Fizz»,
     * а вместо чисел, кратных пяти — слово «Buzz». Если число
     * кратно и 3, и 5, то программа должна выводить слово «FizzBuzz». */
    private static void fizzBuzz() {
        int number = 1;
        int stringCount = 0;
        while (number <= 100) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.print("FizzBuzz ");
                number++;
                stringCount++;
            } else if (number % 5 == 0) {
                System.out.print("Buzz ");
                number++;
                stringCount++;
            } else if (number % 3 == 0) {
                System.out.print("Fizz ");
                number++;
                stringCount++;
            } else {
                System.out.print(number + " ");
                number++;
                stringCount++;
            }
            if (stringCount % 10 == 0) {
                System.out.println();
            }
        }
    }

    /* Задание 3* : Реализуйте метод, который принимает на вход массив целых чисел
    и возвращает true, если массив можно разделить так, чтобы  сумма чисел в обеих
    частях была равной и false в противном случае. */
    private static boolean taskThree(int[] array) {
        //boolean resultOfTask = false;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            //первая половина массива записывается в sum1 для дальнейшего подсчета
            if (i < array.length / 2) {
                sum1 += array[i];
            } else {
                sum2 += array[i];
            }
        }
        return sum1 == sum2;
    }

    public static void main(String[] args) {
        //создаем сканер, с помощью которого будем вводить с клавиатуры значение
        Scanner scan = new Scanner(System.in);
        //тут вводим размер нашего будущего массива
        System.out.println("Введите размер массива:");
        int count = scan.nextInt();

        System.out.println("Введите массив целых чисел: ");
        //создаем динамический массив размерностью count и заполняем с помощью цикла for
        int[] ourArray = new int[count];
        for (int i = 0; i < ourArray.length; i++) {
            ourArray[i] = scan.nextInt();
        }

        System.out.println("Ваш массив выглядит так:");
        //выводим массив с помощью класса Arrays и его метода toString
        System.out.print(Arrays.toString(ourArray));

        //вызов метода taskOne и вывод его в консоль
        System.out.print("\nКаждый элемент в нём больше или равен предыдущему?\nОтвет: " + taskOne(ourArray));

        System.out.println("\nРавны ли суммы обеих частей массива?\nОтвет: " + taskThree(ourArray));

        System.out.println("\nА сейчас - игра FizzBuzz!");
        fizzBuzz();
    }
}