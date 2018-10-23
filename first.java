package com.example.billcalatayud.firstcodingday;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class first   {

    public static void main (String args[]){
        List<String> stringList = new ArrayList<String>(Arrays.asList("item1", "item2", "item1"));

        findDuplicate (stringList);
        System.out.println();
        checkPalindrome("asajjasa");
        System.out.println();
        fizzBuzz(20);
        System.out.println();
        findAnagram("TACO","COAT");
        System.out.println();
        printTables(10,7);
    }

    //Problem 1: Create a function to print the duplicate in a list of strings
    public static void findDuplicate(List<String> string){
        List<String> tmp = new ArrayList<String>();
        for(String i : string){
            if (tmp.contains(i))
                System.out.println("Duplicate element: "+ i);
            else
                tmp.add(i);
        }
    }

    //Problem 2: Create function to check if the string is a palindrome
    public static void checkPalindrome(String word){
        Boolean pal = true;
        int j = word.length();
        for(int i=0;i<j;i++){
            if(word.charAt(i) != word.charAt(word.length()-(i+1)) ){
                pal = false;
            }
        }
        if(pal == true)
            System.out.println("the word is a palindrome");
        else
            System.out.println("the word isn't a palindrome");
    }

    //Problem 3:
    //Create a function that will print
    //“fizz” if the number is divisible by 3
    // “buzz” if the number is divisible by 5
    // “fizzbuzz” if the number is divisible by both and the integer
    // You can use a for loop for using the first 20 integers
    public static void fizzBuzz(int count){
        String temp = "";
        for(int i=0; i<count;i++){
            if (i%3 == 0){
                temp = "fizz";
            }
            if(i%5 == 0) {
                temp = temp + "buzz";
            }
            System.out.println(i+" = "+temp);
            temp = "";
        }
    }

    //Problem 4
    //Create a function to check if the two strings are Anagrams
    //Eg COAT and TACO would me anagrams
    public static void findAnagram(String word1, String word2){
        char word1A[] = word1.toCharArray();
        Arrays.sort(word1A);
        word1 = new String(word1A);

        char word2A[] = word2.toCharArray();
        Arrays.sort(word2A);
        word2 = new String(word2A);

        if(word1.equals(word2))
            System.out.println("the words are Anagrams");
        else
            System.out.println("the words are not Anagrams");

    }

    //Problem 5:
    //Print a multiplication table from 1 to 10 using multidimensional array output

    //1 2 3 4 5 6 7 8 9 10
    // 2 4 6 8 10 12 14 16 18 20
        //…
    public static void printTables(int num1, int num2){
        int height = num2-num1;
        int var1=num1,var2=num2;
        int[][] array1 = new int[var1][var2];
        for(int i = 1; i < var1 ; i++){
            for (int j = 0; j < var2 ;j++){
                array1[i][j] = i*(j+1);
            }
        }
        for (int i =0; i < var1; i++){
            for (int j = 0; j<var2;j++){
                System.out.print(array1[i][j]+" ");
            }
            System.out.println();
        }
    }


}
