import java.util.*;
import java.lang.*;
import java.io.*;


class Lesson_3
{

	public static void main (String[] args) throws java.lang.Exception
	{
     	
    	printThreeWords();
    	checkSumSign();
    	printColor();
    	CompareNumbers();
    	sumBetween(4,6);
    	sumBetween(14,6);
    	sumBetween(14,7);
    	sumBetween(3,6);
    	checkSign(3);
    	checkSign(0);
    	checkSign(-3);
    	checkSignNegativ(3);
    	checkSignNegativ(0);
    	checkSignNegativ(-3);
    	printCount("test", 8);
    	printCount("test2", 0);
    	printCount("test3", 1);
    	System.out.println(yearLeap(2024));
    	System.out.println(yearLeap(2025));
    	System.out.println(yearLeap(100));
    	System.out.println(yearLeap(400));
    	System.out.println(yearLeap(500));
    	arrayInvers();
    	arrayFill();
    	arrayElMul2IfLess6();
    	arraySquare();
    	System.out.println(Arrays.toString(arrayFill(4,6)));
    	System.out.println(Arrays.toString(arrayFill(0,6)));
    	System.out.println(Arrays.toString(arrayFill(-2,6)));

	}
	
    public static void printThreeWords(){ //1
        System.out.println("Orange");
        System.out.println("Banan");
        System.out.println("Apple");
    }


    public static void checkSumSign(){ //2
        int a = 10;
        int b = 20;
        
        if ((a + b) >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }
    
    public static void printColor(){ //3
        int value = 100;
        if (value <= 0) System.out.println("Красный");
        else if (value <= 100) System.out.println("Желтый");
        else System.out.println("Зеленый");
    }
    
    public static void CompareNumbers(){ //4
        int a = 10;
        int b = 20;
        
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }
    
    public static void sumBetween(int a, int b){ //5
        
        if ( ((a + b) >= 10) & ((a + b) <= 20) ) System.out.println("true");
        else System.out.println("false");
        
    }
    
    public static void checkSign (int a){ //6
        
        if (a >= 0) System.out.println("положительное");
        else System.out.println("отрицательное");
        
    }
    
    public static void checkSignNegativ (int a){ //7
        
        if (a < 0) System.out.println("true");
        else System.out.println("false");
        
    }
    
    public static void printCount (String str, int count){ //8
        
       while (count > 0){
           count--;
           System.out.println(str);
       } 
    }
    
    public static boolean yearLeap (int year){ //9
        boolean result = false;    
        
        if (year % 4 == 0) result = true; 
        if (year % 100 == 0) result = false;
        if (year % 400 == 0) result = true;
        
        return result;
    }
    
    public static void arrayInvers (){ //10
        int[] arr = {1,0,1,1,0,0,1,0,0,0};
        
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
        
    }
    
    public static void arrayFill (){ //11
        int length = 100;
        int[] arr = new int[length] ;
        
        for (int i = 1; i <= length; i++){
            arr[i-1] = i;
        }
        System.out.println(Arrays.toString(arr));
        
    }
    
    public static void arrayElMul2IfLess6 (){ //12
        int[] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6) arr[i] *= 2;
        }
        System.out.println(Arrays.toString(arr));
        
    }
    
    public static void arraySquare (){ //13
        int length = 7;
        int[][] arr = new int[length][length];
        
        for (int i = 0; i < length; i++){
            for (int j = 0 ; j < length; j++){
                if(i == j) arr[i][j] = 1;  
                if(i + j == (length-1)) arr[i][j] = 1;  
            }
            
        }
        for (int i = 0; i < length; i++)
        System.out.println(Arrays.toString(arr[i]));
        
    }
    
    public static int[] arrayFill (int len, int initialValue){ //14
        int[] result;
        if (len < 1)  result = new int[0];
        else  result = new int[len];
        
        for (int i = 0; i < len; i++){
            result[i] = initialValue;
        }
        
        return result;
    }
  
}


