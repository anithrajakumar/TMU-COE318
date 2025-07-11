/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;
import java.util.Scanner;

/**
 *
 * @author Anith rajakumar
 */
public class UserMain {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        Circuit circuit = new Circuit();
        String stdin;
        
        do{
            stdin = input.nextLine().toLowerCase();
            if(stdin.charAt(0) == 'r' || stdin.charAt(0) == 'v'){
                circuit.addStrComp(stdin);
            }
            else if(stdin.equals("spice")){
                circuit.spiceDescription();
            }
            else if (!stdin.equals("end")){
                System.out.println("Invalid Input");
            }
        } while(!stdin.equals("end"));
        System.out.println("All Done");
        
    }
    
}