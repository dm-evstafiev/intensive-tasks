package com.walking.intensive.chapter1.task4;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-parameter.html">ссылка</a>
 */
public class Task4 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        double a = 0;
        double b = 0;
        double c = 0;

        System.out.println(solveQuadraticEquation(a, b, c));

    }

    /**
     * При формировании строки, корни уравнения должны указываться по возрастанию.
     * <p>
     * Примеры результирующей строки:
     * <p>
     * Количество решений: 2. Корни: -4;4
     * <p>
     * Количество решений: 1. Корень: 0
     * <p>
     * Количество решений: 0.
     */
    static String solveQuadraticEquation(double a, double b, double c) {

        double x1, x2;
        double discriminant;

        if (a == 0) {
            if (b == 0) {
                return "Решений бесконечно";
            } else {
                x1 = -c / b;
                return "Количество решений: 1. Корень: " + (int) x1;
            }
        }

        discriminant = (b * b) - (4 * a * c);

        if (discriminant < 0) {
            return "Количество решений: 0.";
        }

        if (discriminant == 0) {
            x1 = -b / (2 * a);
            return "Количество решений: 1. Корень: " + (int) x1;
        } else {
            x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            return "Количество решений: 2. Корни: " + (int) x1 + ";" + (int) x2;
        }

    }
}