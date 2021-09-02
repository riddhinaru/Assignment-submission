/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandarguments.java;

/**
 *
 * @author narula
 */
public class CommandArgumentsJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try{
    int a = Integer.parseInt (args[0]);
    int b = Integer.parseInt (args[1]);
    int sum = a + b;
    System.out.println("Sum is" +sum);
    }catch(ArrayIndexOutOfBoundsException e){
    System.out.println("Provide two values for addition");
        }
    
    
    }
    
}
