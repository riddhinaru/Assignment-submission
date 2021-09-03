/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carfeecalculation.java;

import jdk.nashorn.internal.parser.Scanner;

/**
 *
 * @author narula
 */
public class CarFeeCalculationJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    import java.util.Scanner;

    /**
     *
     */
    public class main
{

        private static Object ob;

    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        class Cab {
        int fare;
        int d;    //distance travelled by the user
        public Cab() {
            fare = 30;
        }
        public Cab(int amt) {
            fare = amt;
        }
        //copy Constructor
        public Cab(Cab ob2) {//Cab ob1= new Cab(ob)
            fare = ob2.fare; //ob1.fare = ob.fare
        }
        
        void showFare () {
            System.out.println("Total fare: = Rs " + fare);
        }
        }
        class RideCab {
        public static void main(String[] args) {
            
        }
        }
            int cd;      // distance of Cab from user
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Cab distance from user: ");
        cd = sc.nextInt ();
        if(cd > 5) /*{*/
            Cab ob = newCab(30 + 10 * (cd - 5));
            System.out.println("Enter the distance travelled: ");
            ob.d = sc.nextInt ();
            
            ob.fare = ob.fare + 10 * ob.d;
            
            ob.showFare();
        }
        else {
        try{
        }catch(ArrayIndexOutOfBoundsException e){
            Cab ob = new Cab ();
            System.out.println("Enter the distance travelled: ");
            ob.d = sc.nextInt ();
            
            ob.fare = ob.fare + 10 * ob.d;
            
            ob.showFare ();
            
            Cab ob1 = newCab(ob);
            ob1.showFare();
        }
        
            
        }

        }        

            private static Cab newCab(Object ob) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
    }
        
        
        
            
       

        

    
}
