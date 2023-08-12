/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p2_equipo10;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Diego Vasquez
 */
public class Lab4P2_Equipo10 {

    static ArrayList<Entrenador> entrenadores = new ArrayList();
    static ArrayList<Movimiento> movimientos = new ArrayList();
    static ArrayList<Pokemon> pokemon = new ArrayList();
    static int cont = 0;
    static Pokemon[] temp = new Pokemon[6];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        int contMovimientos = 0;
        int contEntrenadores = 0;
        Scanner sc = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);

        boolean seguir = true;
        while (seguir) {
            System.out.println("""
                               =POKEMON GOTTA CATCH´EM ALL=
                               1. Registrar Entrenador
                               2.Battle Factory
                               3.Capturar/Entrenar
                               4.Añadir Movimiento
                               5.Salir""");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese el nombre del Entrenador:");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese la edad: ");
                    int edad = leer.nextInt();
                    System.out.println("Ingrese cuantos PokeDolares tiene: ");
                    int PD = leer.nextInt();
                    Entrenador pd = new Entrenador(nombre, edad, edad);
                    entrenadores.add(pd);
                    System.out.println("¡Entrenador Agregado Exitosamente!");
                    contEntrenadores++;
                }//fin case
                break;
                case 2: {
                    if (contEntrenadores < 2) {
                        System.out.println("Para pelear se necesitan por lo menos 2 entrenadores");
                    } else {
                        int posEnt1 = 0;
                        ImprimirEntrenador(entrenadores);
                        System.out.println("Ingrese que entrenador sera el primero: ");
                        posEnt1 = leer.nextInt();
                        while (posEnt1 < 0 || posEnt1 > entrenadores.size() - 1) {
                            System.out.println("Out of bounds, intentelo de nuevo");
                            posEnt1 = leer.nextInt();
                        }//fin while
                        ImprimirEntrenador(entrenadores);
                        System.out.println("Ingrese que Entrenador sera el segundo: ");
                        int pos = leer.nextInt();
                        while (pos < 0 || pos > entrenadores.size() || pos == posEnt1) {
                            System.out.println("Posicion invalida, intentelo de nuevo: ");
                            pos = leer.nextInt();
                        }
                        System.out.println("Entrenador " + entrenadores.get(posEnt1).getNombre() + "\n Escoga que pokemon lanzar a Batalla!");
                        ImprimirEquipo(entrenadores.get(posEnt1).getEquipo());
                        int indexPok = leer.nextInt();
                        while (indexPok < 0 || indexPok > entrenadores.get(posEnt1).getEquipo().length - 1) {
                            System.out.println("Posicion invalida, intentelo de nuevo:");
                            indexPok = leer.nextInt();
                        }
                        System.out.println("Entrenador " + entrenadores.get(pos).getNombre() + "\n Escoga que pokemon lanzar a Batalla!");
                        ImprimirEquipo(entrenadores.get(pos).getEquipo());
                        int indexPok2 = leer.nextInt();
                        while (indexPok2 < 0 || indexPok2 > entrenadores.get(pos).getEquipo().length - 1) {
                            System.out.println("Posicion invalida, intentelo de nuevo:");
                            indexPok2 = leer.nextInt();
                        }

                        Pokemon pokeE1 = new Pokemon();
                        pokeE1 = entrenadores.get(posEnt1).getEquipo()[indexPok];
                        Pokemon pokeE2 = new Pokemon();
                        pokeE2 = entrenadores.get(pos).getEquipo()[indexPok2];
                        //turno par == turno de jugador 1
                        int turno = 0;
                        if (pokeE1.getPuntosVelocidad() > pokeE2.getPuntosVelocidad()) {
                            turno = 0;
                        } else {
                            turno = 1;
                        }
                        while (pokeE1.getPuntosVida() > 0 && pokeE2.getPuntosVida() > 0) {
                            if (turno % 2 == 0) {
                                //turno E1
                                System.out.println("Ingrese que movimiento usar Entrenador 1:  ");
                                ImprimirAtaques(pokeE1.getMovimientos());
                                int atak = leer.nextInt();
                                while (atak < 0 || atak > pokeE1.getMovimientos().length) {
                                    System.out.println("posicion invalida, intentelo de nuevo: ");
                                    atak = leer.nextInt();
                                }

                                if (pokeE1.getMovimientos()[atak] instanceof Estado) {
                                    int x = pokeE1.getMovimientos()[atak].Ataque(pokeE1, pokeE2);
                                    if (x >= 1 && x <= 75) {
                                        pokeE2.setEstado(((Estado) pokeE1.getMovimientos()[atak]).getEstado());
                                    }
                                } else {
                                    pokeE2.setPuntosVida(pokeE2.getPuntosVida() - pokeE1.getMovimientos()[atak].Ataque(pokeE1, pokeE2));
                                }

                                turno++;
                            } else {
                                //turno E2
                                System.out.println("Ingrese que movimiento usar Entrenador 2: ");
                                ImprimirAtaques(pokeE2.getMovimientos());
                                int atak2 = leer.nextInt();
                                while (atak2 < 0 || atak2 > pokeE2.getMovimientos().length) {
                                    System.out.println("posicion invalida, intentelo de nuevo: ");
                                    atak2 = leer.nextInt();
                                }

                                if (pokeE2.getMovimientos()[atak2] instanceof Estado) {
                                    int x = pokeE2.getMovimientos()[atak2].Ataque(pokeE2, pokeE1);
                                    if (x >= 1 && x <= 75) {
                                        pokeE1.setEstado(((Estado) pokeE2.getMovimientos()[atak2]).getEstado());
                                    }
                                } else {
                                    pokeE1.setPuntosVida(pokeE1.getPuntosVida() - pokeE2.getMovimientos()[atak2].Ataque(pokeE1, pokeE2));
                                }
                                if (pokeE1.getPuntosVida() == 0) {
                                    System.out.println("Entrenador 1 Gana!");
                                } else {
                                    System.out.println("Entrenador 2 Gana!");
                                }
                                turno++;
                            }//fin if turno
                        }//fin while
                    }
                }//fin case
                break;
                case 3: {
                    boolean CE = true;
                    while (CE) {
                        System.out.println("""
                                           1.Capturar Pokemon
                                           2.Entrenar Pokemon
                                           3. Salir""");
                        int opc = leer.nextInt();
                        switch (opc) {
                            case 1: {
                                //capturar pokemon
                                System.out.println("");
                                if (contMovimientos < 4 || entrenadores.isEmpty()) {
                                    System.out.println("Cantidad minima de movimientos disponibles necesaria es 4 \nAgregue mas movimientos antes de atrapar un pokemon");
                                } else {
                                    System.out.println("Ingrese que entrenador atrapara el pokemon:");
                                    ImprimirEntrenador(entrenadores);
                                    int pos = leer.nextInt();
                                    while (pos < 0 || pos > entrenadores.size() - 1) {
                                        System.out.println("Out of Bounds, Intentelo de nuevo");
                                        pos = leer.nextInt();
                                    }
                                    System.out.println("Ingrese la especie: ");
                                    String especie = sc.nextLine();
                                    System.out.println("Ingrese el nivel: ");
                                    int nivel = leer.nextInt();
                                    System.out.println("Ingrese la experiencia: ");
                                    int exp = leer.nextInt();
                                    System.out.println("Ingrese puntos de experiencia necesarios para subir de nivel: ");
                                    int ExpNec = leer.nextInt();
                                    System.out.println("Ingrese cuanta experiencia esta en la barrita azul: ");
                                    int barritaAzul = leer.nextInt();
                                    Movimiento[] movez = new Movimiento[4];
                                    for (int i = 0; i < 4; i++) {
                                        System.out.println("Ingrese que movimiento agregarle al pokemon: ");
                                        ImprimirMovimientos(movimientos);
                                        int Mpos = leer.nextInt();
                                        while (Mpos < 0 || Mpos > movimientos.size() - 1) {
                                            System.out.println("Out of Bounds \nIntentelo de nuevo");
                                            Mpos = leer.nextInt();
                                        }//fin valid
                                        movez[i] = movimientos.get(Mpos);
                                        movimientos.remove(Mpos);
                                    }
                                    System.out.println("Ingrese sus puntos de vida: ");
                                    int HP = leer.nextInt();
                                    System.out.println("Ingrese sus puntos de ataque: ");
                                    int Att = leer.nextInt();
                                    System.out.println("Ingrese sus puntos de defensa: ");
                                    int Def = leer.nextInt();
                                    System.out.println("ingrese sus puntos especiales: ");
                                    int Esp = leer.nextInt();
                                    System.out.println("Ingrese sus puntos de velocidad: ");
                                    int Vel = leer.nextInt();
                                    String Est = "normal";
                                    Pokemon pok = new Pokemon(especie, nivel, exp, ExpNec, HP, Att, Def, Esp, Vel, Est, barritaAzul);
                                    if (entrenadores.get(pos).getEquipo()[5] == null) {
                                        System.out.println("Desea agregarl el pokemon al equipo? 1(si)/2(no)");
                                        int agE = leer.nextInt();
                                        while (agE < 1 || agE > 2) {
                                            System.out.println("Desicion invalida, intentelo de nuevo: 1(si)/2(no)");
                                            agE = leer.nextInt();
                                        }
                                        if (agE == 1) {
                                            Pokemon[] equipo = entrenadores.get(pos).getEquipo(); // Obtener el equipo del entrenador
                                            int equipoSize = 0;
                                            for (int i = 0; i < equipo.length; i++) {
                                                if (equipo[i] != null) {
                                                    equipoSize++;
                                                }
                                            }

                                            if (equipoSize < 6) {
                                                // Buscar la primera posición disponible en el equipo
                                                for (int i = 0; i < equipo.length; i++) {
                                                    if (equipo[i] == null) {
                                                        equipo[i] = pok;
                                                        System.out.println("Pokémon agregado exitosamente al equipo");
                                                        break;
                                                    }
                                                }
                                            } else {
                                                System.out.println("El equipo está lleno");
                                            }
                                            //fin for
                                            ((Entrenador) entrenadores.get(pos)).setEquipo(equipo);
                                            System.out.println("Pokemon agregado exitosamente");
                                        } else {
                                            entrenadores.get(pos).getCaja().add(pok);
                                            System.out.println("Pokemon agregado exitosamente");
                                        }
                                    } else {//fin si equipo eta vacio
                                        entrenadores.get(pos).getCaja().add(pok);
                                        System.out.println("Pokemon agregado exitosamente");
                                    }
                                }

                            }//fin case
                            break;
                            case 2: {
                                ImprimirEntrenador(entrenadores);
                                System.out.println("Ingrese el indice del entrenador : ");
                                int indexE = sc.nextInt();
                                while (indexE < 0 || indexE > entrenadores.size() - 1) {
                                    System.out.println("Ingrese el indice del entrenador : ");
                                    indexE = sc.nextInt();
                                }
                                System.out.println("""
                                                   De donde desea entrenar su pokemon:
                                                   1.Caja
                                                   2.Equipo""");
                                int op = sc.nextInt();
                                switch (op) {
                                    case 1: {
                                        ImprimirCaja(entrenadores.get(indexE).getCaja());
                                        System.out.println("Ingrese el indice del pokemon a entrenar: ");
                                        int indexP = sc.nextInt();
                                        Entrenar(entrenadores.get(indexE).getCaja().get(indexP));
                                    }
                                    break;
                                    case 2: {
                                        ImprimirEquipo(entrenadores.get(indexE).getEquipo());
                                        System.out.println("Ingrese el indice del pokemon a entrenar: ");
                                        int indexP = sc.nextInt();
                                        Pokemon[] x = entrenadores.get(indexE).getEquipo();
                                        Entrenar(x[indexP]);
                                    }
                                    break;
                                    default: {
                                        System.out.println("Invalido");
                                    }
                                    break;
                                }

                            }//fin case
                            break;
                            case 3: {
                                CE = false;
                            }//fin case
                            break;
                            default: {
                                System.out.println("Opcion Invalida, intentelo de nievo:");
                            }//fin default
                            break;
                        }//fin switch
                    }//fin while
                }//fin case
                break;
                case 4: {
                    //agregar movimiento
                    boolean seg = true;
                    while (seg) {
                        System.out.println("""
                                           =AGREGAR MOVIMIENTO=
                                           Ingrese que Tipo de Movimiento
                                           1.Estado
                                           2.Fisico
                                           3.Especial
                                           4.Salir de Movimientos""");
                        int opc = leer.nextInt();
                        switch (opc) {
                            case 1: {
                                System.out.println("Ingrese el nombre del movimiento: ");
                                String nombre = sc.nextLine();
                                System.out.println("Ingrese la descripcion del movimiento: ");
                                sc = new Scanner(System.in);
                                String descripcion = sc.nextLine();
                                String stat = "";
                                boolean statusE = true;
                                while (statusE) {
                                    System.out.println("""
                                                       Ingrese que problema de estado afectara el movimiento:
                                                       1.dormido
                                                       2.envenenado
                                                       3.paralizado
                                                       4.quemado
                                                       5.neutral""");
                                    int status = leer.nextInt();
                                    switch (status) {
                                        case 1: {
                                            stat = "dormido";
                                            statusE = false;
                                        }//fin case
                                        break;
                                        case 2: {
                                            stat = "envenenado";
                                            statusE = false;
                                        }//fin case
                                        break;
                                        case 3: {
                                            stat = "paralizado";
                                            statusE = false;

                                        }//fin case
                                        break;
                                        case 4: {
                                            stat = "quemado";
                                            statusE = false;
                                        }//fin case
                                        break;
                                        case 5: {
                                            stat = "neutral";
                                            statusE = false;
                                        }//fin case
                                        break;
                                        default: {
                                            System.out.println("Opcion invalida, intentelo de nuevo:");
                                        }//fin default
                                        break;
                                    }//fin switch
                                }//fin while
                                Estado e = new Estado(stat, nombre, descripcion);
                                movimientos.add(e);
                                contMovimientos++;
                                System.out.println("Movimiento agregado exitosamente!");
                            }//fin case
                            break;
                            case 2: {
                                System.out.println("Ingrese el nombre del movimiento: ");
                                String nombre = sc.nextLine();
                                System.out.println("Ingrese la descripcion del movimiento: ");
                                sc = new Scanner(System.in);
                                String descripcion = sc.nextLine();
                                String stat = "";
                                System.out.println("Ingrese los puntos de poder: ");
                                int PuntosPod = leer.nextInt();
                                System.out.println("Ingrese los puntos de precision: ");
                                int PuntosPre = leer.nextInt();
                                Fisicos f = new Fisicos(PuntosPod, PuntosPre, nombre, descripcion);
                                movimientos.add(f);
                                contMovimientos++;
                                System.out.println("Movimiento agregado exitosamente!");
                            }//fin case
                            break;
                            case 3: {
                                System.out.println("Ingrese el nombre del movimiento: ");
                                String nombre = sc.nextLine();
                                System.out.println("Ingrese la descripcion del movimiento: ");
                                sc = new Scanner(System.in);
                                String descripcion = sc.nextLine();
                                String stat = "";
                                System.out.println("Ingrese los puntos de poder: ");
                                int PuntosPod = leer.nextInt();
                                System.out.println("Ingrese los puntos de precision: ");
                                int PuntosPre = leer.nextInt();
                                Especiales ESP = new Especiales(PuntosPod, PuntosPre, nombre, descripcion);
                                movimientos.add(ESP);
                                contMovimientos++;
                                System.out.println("Movimiento agregado exitosamente!");
                            }//fin case
                            break;
                            case 4: {
                                seg = false;
                            }//fin case
                            break;
                            default: {
                                System.out.println("Opcion invalida, intentelo de nuevo:");
                            }//fin default
                            break;
                        }//fin switch
                    }//fin while
                }//fin case
                break;
                case 5: {
                    seguir = false;
                }//fin case
                break;
                default: {
                    System.out.println("Opcion Invalida, Intentelo de nuevo:");
                }//fin default
            }//fin switch
        }//fin while
        System.out.println("ola");
    }//fin main

    public static void Entrenar(Pokemon p) throws Exception {
        Random r = new Random();
        int random = 0 + r.nextInt(2);
        int random2 = 100 + r.nextInt(4999);
        int exp = random * random2;
        int nuevoNivel = exp / p.getSubir_experiencia();
        if (nuevoNivel > 0) {
            p.setNivel(p.getNivel() + nuevoNivel);
            p.setBarritaAzul(exp % p.getSubir_experiencia());
        } else {
            p.setBarritaAzul(exp % p.getSubir_experiencia());
        }
        p.setExperiencia(p.getExperiencia() + exp);

    }

    public static void Ataque() {

    }

    public static void ImprimirEquipo(Pokemon[] equipo) {
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("Pokemon " + i + " " + equipo[1] + "\n");
        }
    }

    public static void ImprimirCaja(ArrayList<Pokemon> caja) {
        for (int i = 0; i < caja.size(); i++) {
            System.out.println(i + "- " + caja.get(i));
        }
    }

    public static void ImprimirEntrenador(ArrayList<Entrenador> entrenadores) {
        for (int i = 0; i < entrenadores.size(); i++) {
            System.out.println(i + "- " + entrenadores.get(i).getNombre());
        }
    }

    public static void ImprimirMovimientos(ArrayList<Movimiento> moves) {
        for (int i = 0; i < moves.size(); i++) {
            System.out.println(i + "- " + moves.get(i).getNombre());
        }
    }

    public static void ImprimirAtaques(Movimiento[] moves) {
        for (int i = 0; i < moves.length; i++) {
            System.out.println(i + "- " + moves[i]);
        }
    }
}//fin class
