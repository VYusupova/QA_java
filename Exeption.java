import java.util.*;
import java.lang.*;
import java.io.*;

class Exeption
{
    public static void main(String[] args) {
        testCheckInput();

    }

    public static void cheсkInput(String[][] str) throws MyArrySizeExeption {
        int cheсkSize = 4;
        if (str.length != cheсkSize) {
            throw new MyArrySizeExeption("количество строк массива не равно 4");
        }
        for (int i = 0; i < str.length; i++)
            if (str[i].length != cheсkSize) {
                throw new MyArrySizeExeption("в строке " + i + " количество столбцов не равно 4");
            }
    }

    public static void testCheckInput() {
        int tSize0 = 4;
        String[][] str0 = new String[tSize0][tSize0];
        int tSize1 = 1;
        String[][] str1 = new String[tSize1][tSize1];
        int tSize2 = 2;
        String[][] str2 = new String[tSize0][tSize2];

        try {
            cheсkInput(str0);
        } catch (MyArrySizeExeption e) {
            System.out.println("проверка валидного массива : " + e.getMessage());
        }
        try {
            cheсkInput(str1);
        } catch (MyArrySizeExeption e) {
            System.out.println("1 проверка не валидного массива кол-во строк :\n\t" + e.getMessage());
        }
        try {
            cheсkInput(str2);
        } catch (MyArrySizeExeption e) {
            System.out.println("2 проверка не валидного массива  кол-во столбцов :\n\t" + e.getMessage());
        }
    }


}


class MyArrySizeExeption extends Exception {
    public MyArrySizeExeption(String message) {
        super(message);
    }
}
