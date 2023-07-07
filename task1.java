//Задание
// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// 2) Вывести все простые числа от 1 до 1000
// 3) Реализовать простой калькулятор
// 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.


import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
//        triangle();
        // simple();
       // calk();
    }
    static void triangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        String number = sc.nextLine();
        int n = Integer.parseInt(number);
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        System.out.println(sum);
    }

    static void simple() {
        // int[] simpleNumbers = new int[] {1};
        List<Integer> simpleNumbers = new ArrayList();
        simpleNumbers.add(1);
        simpleNumbers.add(2);
        boolean flg = true;
        for (int i = 3; i < 1000; i++) {
            for (int k = 1; k < simpleNumbers.size(); k++) {
                if (i % simpleNumbers.get(k) == 0) {
                    flg = false;
                } 
            }
            if (flg == true) {
                simpleNumbers.add(i);
            }
            
            flg = true;
        }
        for (int i = 0; i < simpleNumbers.size(); i++) {
            System.out.println(simpleNumbers.get(i));
        }
        
        
    }

    static void calk(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input operation: ");
        String oper = sc.nextLine();
        System.out.println("Input number1: ");
        String number1 = sc.nextLine();
        int n1 = Integer.parseInt(number1);       
        System.out.println("Input number2: ");
        String number2 = sc.nextLine();
        int n2 = Integer.parseInt(number2);

        switch (oper) {
           case  ("+"):
               System.out.println(n1 + n2);
               break;
           case ("-"):
               System.out.println(n1 - n2);
               break;
           case ("*"):
               System.out.println(n1 * n2);
               break;
           case ("/"):
               System.out.println(n1 / n2);
               break;
           default:
               System.out.println("incorrect input");;
               break;
       }
    }
}