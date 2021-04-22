/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author FABLA
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter The Height: ");
        int size = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j <= i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}