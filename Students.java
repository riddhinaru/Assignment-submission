/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.students.java;

import jdk.nashorn.internal.parser.Scanner;

/**
 *
 * @author narula
 */
public class Students {
import java.util.Scanner;
    /**
     * @param args    
     */
    public static void main(String[] args) {
    {
     String name;
     int roll, math, phy, eng;
     Scanner SC=new Scanner(System.in);
     
     System.out.println("Enter Name: ");
     name=SC.nextLine();
     System.out.println("Enter Roll Number: ");
     roll=SC.nextLine();
     System.out.println("Enter marks in Maths, Physics and English: ");
     math=SC.nextLine();
     phy=SC.nextLine();
     eng=SC.nextLine();
     
     int total=math+eng+phy;
     float marks=(float)total;
     
     System.out.println("Roll Number:" + roll +"\nName: "+name);
     System.out.println("Marks (Maths, Physics, English): " +math+","+phy+","+eng);
     
    }
    
}    
     
     
     
     
     
     
     
     
     
     
     
     
    }
    }
    
}
