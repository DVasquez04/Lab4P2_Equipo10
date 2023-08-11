/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p2_equipo10;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Diego Vasquez
 */
public class Lab4P2_Equipo10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        ArrayList<Movimiento> movimientos = new ArrayList();
        boolean seguir = true;
        while(seguir){
            System.out.println("""
                               =POKEMON GOTTA CATCH´EM ALL=
                               1. Registrar Entrenador
                               2.Battle Factory
                               3.Capturar/Entrenar
                               4.Añadir Movimiento
                               5.Salir""");
            int opcion = leer.nextInt();
            switch(opcion){
                case 1:{
                    
                }//fin case
                break;
                case 2:{
                    
                }//fin case
                break;
                case 3:{
                    boolean CE = true;
                    while(CE){
                        System.out.println("""
                                           1.Capturar Pokemon
                                           2.Entrenar Pokemon
                                           3. Salir""");
                        int opc = leer.nextInt();
                        switch(opc){
                            case 1:{
                                
                            }//fin case
                            break;
                            case 2:{
                                
                            }//fin case
                            break;
                            case 3:{
                                CE = false;
                            }//fin case
                            break;
                            default:{
                                System.out.println("Opcion Invalida, intentelo de nievo:");
                            }//fin default
                            break;
                        }//fin switch
                    }//fin while
                }//fin case
                break;
                case 4:{
                    
                }//fin case
                break;
                case 5:{
                    seguir = false;
                }//fin case
                break;
                default:{
                    System.out.println("Opcion Invalida, Intentelo de nuevo:");
                }//fin default
            }//fin switch
        }//fin while
    }//fin main
    
}//fin class
