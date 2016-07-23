/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
  
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
       String asw=sc.nextLine();
        String aji=new StringBuffer(asw).reverse().toString();
        System.out.println("reverse  string is\t"+aji);
        String man = aji.replaceAll("[aeiouAEIOU]", "");
        System.out.println("all vowel are removed\t"+man);    
    }
}
