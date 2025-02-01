import java.util.*;
import java.lang.*;
import java.io.*;

class Exeption {

    public static void main(String[] args) {
        try {
            checkInputTestValidArray();
            checkInputTest_1();
            checkInputTest_2();
        } catch (Exception e) {
        }
    }

    public static void cheсkInput(String[][] str) throws Exception {
        int cheсkSize = 4;
        int el = 0;
        long sum = 0;
        if (str.length != cheсkSize) {
            throw new MyArraySizeExeption("Количество строк != ", cheсkSize);
        }
        for (int i = 0; i < str.length; i++) {
            if (str[i].length != cheсkSize) {
                throw new MyArraySizeExeption(i, cheсkSize);
            }
            for (int j = 0; j < str[i].length; j++) {
                int size = str[i][j].length();
                if (size <= 0) throw new MyArrayDateException(i, j, " пустая строка");
                int k = 0;
                if (str[i][j].charAt(k) == '-') {
                    k = 1;
                    if (size > 11) throw new MyArrayDateException(i, j, "кол-во символов в строке больше размера int");
                    checMinInt(str[i][j].substring(1, size), i, j);
                } else if (size > 10)
                    throw new MyArrayDateException(i, j, "кол-во символов в строке больше размера int");
                if (size == 10) {
                    checMaxInt(str[i][j], i, j);
                }
                for (; k < size; k++) {
                    char ch = str[i][j].charAt(k);
                    if ('0' > ch || ch > '9') throw new MyArrayDateException(i, j, "не цифры");
                }
                el = Integer.parseInt(str[i][j]);
                sum += el;
            }
        }
        System.out.print("сумма элементов массива = " + sum + "\t");
    }

    public static void checMaxInt(String str, int i, int j) throws MyArrayDateException {
        //2147483647
        if (str.charAt(0) > '2') throw new MyArrayDateException(i, j, "не смогу преобразовать");
        if (str.charAt(0) == '2' && (str.charAt(1) > '1' || str.charAt(1) < '0'))
            throw new MyArrayDateException(i, j, "не смогу преобразовать");
        if (str.charAt(0) == '2' && str.charAt(1) == '1' && (str.charAt(2) > '4' || str.charAt(2) < '0'))
            throw new MyArrayDateException(i, j, "не смогу преобразовать");
        if (str.charAt(0) == '2' && str.charAt(1) == '1' && str.charAt(2) == '4' && (str.charAt(3) > '7' || str.charAt(3) < '0'))
            throw new MyArrayDateException(i, j, "не смогу преобразовать");
        if (str.charAt(0) == '2' && str.charAt(1) == '1' && str.charAt(2) == '4' && str.charAt(3) == '7' && (str.charAt(4) > '7' || str.charAt(4) < '0'))
            throw new MyArrayDateException(i, j, "не смогу преобразовать");
        if (str.charAt(0) == '2' && str.charAt(1) == '1' && str.charAt(2) == '4' && str.charAt(3) == '7' && str.charAt(4) == '4' && (str.charAt(5) > '8' || str.charAt(5) < '0'))
            throw new MyArrayDateException(i, j, "не смогу преобразовать");
        if (str.charAt(0) == '2' && str.charAt(1) == '1' && str.charAt(2) == '4' && str.charAt(3) == '7' && str.charAt(4) == '4' && str.charAt(5) == '8' && (str.charAt(6) > '3' || str.charAt(6) < '0'))
            throw new MyArrayDateException(i, j, "не смогу преобразовать");
        if (str.charAt(0) == '2' && str.charAt(1) == '1' && str.charAt(2) == '4' && str.charAt(3) == '7' && str.charAt(4) == '4' && str.charAt(5) == '8' && str.charAt(6) == '3' && (str.charAt(7) > '6' || str.charAt(7) < '0'))
            throw new MyArrayDateException(i, j, "не смогу преобразовать");
        if (str.charAt(0) == '2' && str.charAt(1) == '1' && str.charAt(2) == '4' && str.charAt(3) == '7' && str.charAt(4) == '4' && str.charAt(5) == '8' && str.charAt(6) == '3' && str.charAt(7) == '6' && (str.charAt(8) > '4' || str.charAt(8) < '0'))
            throw new MyArrayDateException(i, j, "не смогу преобразовать");
        if (str.charAt(0) == '2' && str.charAt(1) == '1' && str.charAt(2) == '4' && str.charAt(3) == '7' && str.charAt(4) == '4' && str.charAt(5) == '8' && str.charAt(6) == '3' && str.charAt(7) == '6' && str.charAt(8) == '4' && (str.charAt(9) > '7' || str.charAt(9) < '0'))
            throw new MyArrayDateException(i, j, "не смогу преобразовать");

    }

    public static void checMinInt(String str, int i, int j) throws MyArrayDateException {
        //-2147483648
        if (str.charAt(0) > '2') throw new MyArrayDateException(i, j, "не смогу преобразовать");
        if (str.charAt(0) == '2' && (str.charAt(1) > '1' || str.charAt(1) < '0'))
            throw new MyArrayDateException(i, j, "не смогу преобразовать");
        if (str.charAt(0) == '2' && str.charAt(1) == '1' && (str.charAt(2) > '4' || str.charAt(2) < '0'))
            throw new MyArrayDateException(i, j, "не смогу преобразовать");
        if (str.charAt(0) == '2' && str.charAt(1) == '1' && str.charAt(2) == '4' && (str.charAt(3) > '7' || str.charAt(3) < '0'))
            throw new MyArrayDateException(i, j, "не смогу преобразовать");
        if (str.charAt(0) == '2' && str.charAt(1) == '1' && str.charAt(2) == '4' && str.charAt(3) == '7' && (str.charAt(4) > '7' || str.charAt(4) < '0'))
            throw new MyArrayDateException(i, j, "не смогу преобразовать");
        if (str.charAt(0) == '2' && str.charAt(1) == '1' && str.charAt(2) == '4' && str.charAt(3) == '7' && str.charAt(4) == '4' && (str.charAt(5) > '8' || str.charAt(5) < '0'))
            throw new MyArrayDateException(i, j, "не смогу преобразовать");
        if (str.charAt(0) == '2' && str.charAt(1) == '1' && str.charAt(2) == '4' && str.charAt(3) == '7' && str.charAt(4) == '4' && str.charAt(5) == '8' && (str.charAt(6) > '3' || str.charAt(6) < '0'))
            throw new MyArrayDateException(i, j, "не смогу преобразовать");
        if (str.charAt(0) == '2' && str.charAt(1) == '1' && str.charAt(2) == '4' && str.charAt(3) == '7' && str.charAt(4) == '4' && str.charAt(5) == '8' && str.charAt(6) == '3' && (str.charAt(7) > '6' || str.charAt(7) < '0'))
            throw new MyArrayDateException(i, j, "не смогу преобразовать");
        if (str.charAt(0) == '2' && str.charAt(1) == '1' && str.charAt(2) == '4' && str.charAt(3) == '7' && str.charAt(4) == '4' && str.charAt(5) == '8' && str.charAt(6) == '3' && str.charAt(7) == '6' && (str.charAt(8) > '4' || str.charAt(8) < '0'))
            throw new MyArrayDateException(i, j, "не смогу преобразовать");
        if (str.charAt(0) == '2' && str.charAt(1) == '1' && str.charAt(2) == '4' && str.charAt(3) == '7' && str.charAt(4) == '4' && str.charAt(5) == '8' && str.charAt(6) == '3' && str.charAt(7) == '6' && str.charAt(8) == '4' && (str.charAt(9) > '8' || str.charAt(9) < '0'))
            throw new MyArrayDateException(i, j, "не смогу преобразовать");
    }

    public static void checkInputTestValidArray() throws Exception {
        String[][] str0 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        checkValid(str0);
        String[][] str1 = {{"-1", "1", "1", "1"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        checkValid(str1);
        String[][] str3 = {{"2147483647", "1", "1", "1"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        checkValid(str3);
        String[][] str4 = {{"-2147483648", "1", "1", "1"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        checkValid(str4);
    }

    public static void checkValid(String[][] str) throws Exception {
        checkInvalid(str, "проверка валидного массива возникло исключение : ");
        System.out.println("0 проверка валидного массива успешно пройдена");
    }

    public static void checkInputTest_1() throws Exception {
        String error = " проверка не валидного массива ";
        String[][] str1 = {{"1", "2", "3", "4"}, {"1", "1", "1"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        checkInvalid(str1, "1" + error + "кол-во строк :");

        String[][] str11 = {{"1", "1", "1", "1", "1"}, {"1", "1", "1"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        checkInvalid(str11, "1" + error + "кол-во строк :");

        String[][] str2 = {{"1", "2", "3", "4"}, {"1", "2", "3"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        checkInvalid(str2, "2" + error + " кол-во столбцов :");

        String[][] str3 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4", "5"}, {"1", "2", "3", "4"}};
        checkInvalid(str3, "2" + error + " кол-во столбцов :");
    }

    public static void checkInvalid(String[][] str, String error) throws Exception {
        try {
            cheсkInput(str);
        } catch (MyArraySizeExeption e) {
            System.out.println(error + e.getMessage());
        } catch (MyArrayDateException e) {
            System.out.println(error + e.getMessage());
        }
    }

    public static void checkInputTest_2() throws Exception {
        String error = " проверка не валидного массива ";
        String[][] str1 = {{"1", "2", "3", "4"}, {"1", "2", "3", ""}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        checkInvalid(str1, "3" + error + "пустая строка :");

        String[][] str2 = {{"1", "2", "3", "4"}, {"1", "2", "  ", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        checkInvalid(str2, "4" + error + " строка с пробелами :");

        String[][] str22 = {{"1", "2", "3", "4"}, {"1", "2", "abc", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        checkInvalid(str22, "4" + error + " строка с симоволами :");

        String[][] str23 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "a12bc", "4"}, {"1", "2", "3", "4"}};
        checkInvalid(str23, "4" + error + " строка с симоволами :");

        String[][] str3 = {{"21474836470", "1", "1", "1"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        checkInvalid(str3, "5" + error + "в строке цифр больше чем может быть в int :");

        String[][] str4 = {{"2147483648", "1", "1", "1"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        checkInvalid(str4, "6" + error + "максимальный int :");

        String[][] str5 = {{"-2147483649", "1", "1", "1"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        checkInvalid(str5, "7" + error + "минимальный int :");
    }
}

