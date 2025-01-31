import java.util.*;
import java.lang.*;
import java.io.*;

class Exeption
{
    public static void main(String[] args) {
        try {
            checkInputTestValidArray();
            checkInputTest_1();
            checkInputTest_2();
        }
        catch (Exception e) {};

    }

    public static void cheсkInput(String[][] str) throws Exception{
        int cheсkSize = 4;
        int sum = 0;
        int el = 0;
        if (str.length != cheсkSize) {
            throw new MyArraySizeExeption("Количество строк != ", cheсkSize);
        }
        for (int i = 0; i < str.length; i++) {
            if (str[i].length != cheсkSize) {
                throw new MyArraySizeExeption("в строке " , i, " количество столбцов != ", cheсkSize);
            }
            for (int j = 0; j < str[i].length; j++) {

                int size = str[i][j].length();
                if (size <= 0) throw new MyArrayDateException(i,j, " пустая строка");
                if (size > 6) throw new MyArrayDateException( i, j, "кол-во символов в строке больше размера int");
                for (int k = 0; k < size; k++) {
                    char ch = str[i][j].charAt(k);
                    if ( '0' > ch  ||  ch > '9' )  throw new MyArrayDateException(i,j, "не цифры");

                }
                el = Integer.parseInt(str[i][j]);
                sum += el;
            }
        }
        System.out.println("сумма элементов массива = " + sum);

    }

    public static void checkInputTestValidArray() throws Exception  {
        String[][] str0 = {{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"}};
        try {
            cheсkInput(str0);
        } catch (MyArraySizeExeption e) {
            System.out.println("проверка валидного массива возникло исключение : " + e.getMessage());
        }
        catch (MyArrayDateException e) {
            System.out.println("проверка валидного массива возникло исключение : " + e.getMessage());
        }
        System.out.println("0 проверка валидного массива успешно пройдена");
    }
    public static void checkInputTest_2() throws Exception {
        String[][] str1 = {{"1","1","1","1"},{"1","1","1",""},{"1","1","1","1"},{"1","1","1","1"}};
        String[][] str2 = {{"1","1","1","1"},{"1","1","  ","1"},{"1","1","1","1"},{"1","1","1","1"}};
        String[][] str3 = {{"1","1","1","1"},{"1","1","1","1"},{"1","1","1234567","1"},{"1","1","1","1"}};
        try {
            cheсkInput(str1);
        } catch (MyArrayDateException e) {
            System.out.println("3 проверка не валидного массива пустая строка :" + e.getMessage());
        }
        try {
            cheсkInput(str2);
        } catch (MyArrayDateException e) {
            System.out.println("4 проверка не валидного массива  строка с пробелами :" + e.getMessage());
        }
        try {
            cheсkInput(str3);
        } catch (MyArrayDateException e) {
            System.out.println("5 проверка не валидного массива в строке цифр больше чем может быть в int :" + e.getMessage());
        }
    }

    public static void checkInputTest_1() throws Exception {

        String[][] str1 = {{"1","1","1","1"},{"1","1","1"},{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"}};
        String[][] str2 = {{"1","1","1","1"},{"1","1","1"},{"1","1","1","1"},{"1","1","1","1"}};
        String[][] str3 = {{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1","6"},{"1","1","1","1"}};

        try {
            cheсkInput(str1);
        } catch (MyArraySizeExeption e) {
            System.out.println("1 проверка не валидного массива кол-во строк :" + e.getMessage());
        }
        try {
            cheсkInput(str2);
        } catch (MyArraySizeExeption e) {
            System.out.println("2 проверка не валидного массива  кол-во столбцов :" + e.getMessage());
        }
        try {
            cheсkInput(str3);
        } catch (MyArraySizeExeption e) {
            System.out.println("2 проверка не валидного массива  кол-во столбцов :" + e.getMessage());
        }


}
}

