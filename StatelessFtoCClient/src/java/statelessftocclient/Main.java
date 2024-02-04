/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statelessftocclient;

import ftoc.FtoCRemote;
import java.util.Scanner;
import javax.ejb.EJB;

/**
 *
 * @author alongkornvanzoh
 */
public class Main {

    @EJB
    private static FtoCRemote ftoC;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter degree in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        System.out.println(fahrenheit + " Fahrenheit = " + ftoC.fToC(fahrenheit) + " Celsius");
    }

}
