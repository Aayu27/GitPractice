/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goodmorning;

import java.util.Scanner;

/**
 *
 * @author aayu9
 */
public class GoodMorning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        name n1 = new name();
        
        String name;
        
        
        System.out.print("Enter your name:  ");
        name = sc.nextLine();
        
        n1.setN(name);
        
        System.out.println(n1);
        
    }
    
}
