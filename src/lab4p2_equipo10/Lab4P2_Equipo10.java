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
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        ArrayList<Entrenador> entrenadores = new ArrayList();
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
                    System.out.println("Ingrese el nombre del Entrenador:");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese la edad: ");
                    int edad = leer.nextInt();
                    System.out.println("Ingrese cuantos PokeDolares tiene: ");
                    int PD = leer.nextInt();
                    Entrenador pd = new Entrenador(nombre, edad, edad);
                    entrenadores.add(pd);
                    System.out.println("¡Entrenador Agregado Exitosamente!");
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
                                //capturar pokemon
                                System.out.println("");
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
                    //agregar movimiento
                    boolean seg = true;
                    while(seg){
                        System.out.println("""
                                           =AGREGAR MOVIMIENTO=
                                           Ingrese que Tipo de Movimiento
                                           1.Estado
                                           2.Fisico
                                           3.Especial
                                           4.Salir de Movimientos""");
                        int opc = leer.nextInt();
                        switch(opc){
                            case 1:{
                                System.out.println("Ingrese el nombre del movimiento: ");
                                String nombre = sc.nextLine();
                                System.out.println("Ingrese la descripcion del movimiento: ");
                                sc = new Scanner(System.in);
                                String descripcion = sc.nextLine();
                                String stat = "";
                                boolean statusE = true;
                                while(statusE){
                                    System.out.println("""
                                                       Ingrese que problema de estado afectara el movimiento:
                                                       1.dormido
                                                       2.envenenado
                                                       3.paralizado
                                                       4.quemado
                                                       5.neutral""");
                                    int status = leer.nextInt();
                                    switch(status){
                                        case 1:{
                                            stat = "dormido";
                                            statusE = false;
                                        }//fin case
                                        break;
                                        case 2:{
                                            stat = "envenenado";
                                            statusE = false;
                                        }//fin case
                                        break;
                                        case 3:{
                                            stat = "paralizado";
                                            statusE = false;
                                            
                                        }//fin case
                                        break;
                                        case 4:{

                                        }//fin case
                                        break;
                                        case 5:{

                                        }//fin case
                                        break;
                                        default:{
                                            System.out.println("Opcion invalida, intentelo de nuevo:");
                                        }//fin default
                                        break;
                                    }//fin switch
                                }//fin while
                            }//fin case
                            break;
                            case 2:{
                                
                            }//fin case
                            break;
                            case 3:{
                                
                            }//fin case
                            break;
                            case 4:{
                                seg = false;
                            }//fin case
                            break;
                        }//fin switch
                    }//fin while
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
