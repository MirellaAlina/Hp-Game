package ar.com.ada.online.second.hpgame;

import ar.com.ada.online.second.hpgame.character.Character;
import ar.com.ada.online.second.hpgame.character.Elf;
import ar.com.ada.online.second.hpgame.character.Wizard;
import ar.com.ada.online.second.hpgame.spell.Attack;
import ar.com.ada.online.second.hpgame.spell.Defense;
import ar.com.ada.online.second.hpgame.spell.Recovery;
import ar.com.ada.online.second.hpgame.wand.Wand;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Gameboard {
    private Character playerOne;
    private Character playerTwo;
    private static Scanner keyboard = new Scanner(System.in);

    public void selectCharacters() {
        System.out.println("Selección del jugador nro 1 ");
        playerOne = selectCharacter();

        System.out.println("\n");

        System.out.println("Selección del jugador nro 2 ");
        playerTwo = selectCharacter();

    }

    //llama al método para selección de hechizo para cada personaje
    //es 'public' para ser llamado por el main
    public void loadSpellsByCharacters() {
        System.out.println("\nSeleccion de hechizos para el jugador 1:\n");
        loadCharacterSpell(playerOne);

        System.out.println("\nSeleccion de hechizos para el jugador 2:\n");
        loadCharacterSpell(playerTwo);
    }

    private Character selectCharacter() {
        System.out.println("Seleccione el tipo de personaje: ");
        System.out.println("\n 1- Mago \n 2- Elfo\n ");
        int option = keyboard.nextInt();
        Character character = null;
        switch (option) {
            case 1:
                character = getWizard();
                break;

            case 2:
                character = getElf();
                break;
        }
        return character;
    }

    private Character getElf() {

        System.out.println("Seleccione el nombre de su personaje!");
        System.out.println("\t1) Dobby \t");
        System.out.println("\t2) Kreacher");
        System.out.println("\t3) Hokey");
        System.out.println("\t4) Winky");

        Elf elfPlayer = new Elf();

        int option = keyboard.nextInt();

        switch (option) {  // al objeto elfo le seteo el nombre
            case 1:
                elfPlayer.setName("Dobby");

                break;
            case 2:
                elfPlayer.setName("Kreacher");

                break;
            case 3:
                elfPlayer.setName("Hokey");

                break;
            case 4:
                elfPlayer.setName("Winky");

                break;
            default:
                System.out.println("Debe elegir una opción válida del 1 al 4");
                elfPlayer = null; // anulo esta instancia porque no eligió una opción válida
        }

        // seleccion de ubicacion
        elfPlayer.setLocation(selectLocation());

        //seteamos demas atributos de elfo

        elfPlayer.setMagicLevel(100);
        elfPlayer.setEnergyLevel(100);

        return elfPlayer;
    }

    private Character getWizard() {
        System.out.println("Seleccione el nombre de su personaje!");
        System.out.println("\tGryffindor");
        System.out.println("\t1) Harry Potter\t");
        System.out.println("\t2) Hermione Granger");
        System.out.println("\tRavenclaw");
        System.out.println("\t3) Luna Lovegood");
        System.out.println("\t4) Filius Flitwick");
        System.out.println("\tSlytherin");
        System.out.println("\t5) Draco Malfoy");
        System.out.println("\t6) Bellatrix Lestrange");
        System.out.println("\tHufflepuff");
        System.out.println("\t7) Newt Scamander");
        System.out.println("\t8) Nymphadora Tonks");


        Wizard wizardPlayer = new Wizard();

        int option = keyboard.nextInt();

        switch (option) {  // al objeto elfo le seteo el nombre
            case 1:
                wizardPlayer.setName("Harry Potter");

                break;
            case 2:
                wizardPlayer.setName("Hermione Granger");

                break;
            case 3:
                wizardPlayer.setName("Luna Lovegood");

                break;
            case 4:
                wizardPlayer.setName("Filius Flitwick");

                break;
            case 5:
                wizardPlayer.setName("Draco Malfoy");

                break;
            case 6:
                wizardPlayer.setName("Bellatrix Lestrange");

                break;
            case 7:
                wizardPlayer.setName("Newt Scamander");

                break;
            case 8:
                wizardPlayer.setName("Nymphadora Tonks");

                break;
            default:
                System.out.println("Debe elegir una opción válida del 1 al 8");
                wizardPlayer = null; // anulo esta instancia porque no eligió una opción válida
        }

        // seleccion de ubicacion
        wizardPlayer.setLocation(selectLocation());

        //seteamos demas atributos de mago

        wizardPlayer.setMagicLevel(100);
        wizardPlayer.setEnergyLevel(100);
        wizardPlayer.setWand(randomWandSelection());


        return wizardPlayer;
    }

    //seleccion de varita

    private Wand randomWandSelection() {

        ArrayList<Wand> arrayRandomWands = new ArrayList<>();

        arrayRandomWands.add(new Wand("Avellano", 1));
        arrayRandomWands.add(new Wand("Endrino", 2));
        arrayRandomWands.add(new Wand("Olmo", 3));
        arrayRandomWands.add(new Wand("Serbal", 4));
        arrayRandomWands.add(new Wand("Sauco", 5));

        Random random = new Random();

        Wand randomWand = arrayRandomWands.get(random.nextInt(arrayRandomWands.size()));

        System.out.println("Una varita te elegirá ... \n... \n...");
        System.out.println("La varita que te eligió es: " + randomWand);

        return randomWand;

    }

    // seleccion de ubicacion
    public static String selectLocation() {



        int optionLocation = 0;
        String locAux;
        boolean aux;

        do {
            aux = false;
            System.out.println("Seleccione ubicación: 1-IZQUIERDA, 2-CENTRO, 3-DERECHA");
            optionLocation = keyboard.nextInt();
            switch (optionLocation) {

                case 1:
                    locAux = "IZQUIERDA";
                    break;

                case 2:
                    locAux = "CENTRO";
                    break;

                case 3:
                    locAux = "DERECHA";
                    break;

                default:
                    System.out.println("Seleccione una ubicacion ingresando 1, 2 o 3");
                    locAux = null;
                    aux = true;
                    break;
            }
        } while (aux);

        return locAux;
    }

// Selección de hechizos
    public void loadCharacterSpell(Character player) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Solo se podrán jugar con seis (6) hechizos que elijas de la lista.\n" +
                "Piensa sabiamente y elige con cuidado.");
        System.out.println("Los hechizos disponibles son: ");
        System.out.println("\nHechizos de ataque:\n" +
                "1) Aguamenti: Daño 10, Energía necesaria 10.\n" +
                "Este encantamiento genera un chorro de agua desde la punta de la varita.\n" +
                "2) Incendio: Daño 20, Energía necesaria 20.\n" +
                "Este hechizo genera llamas desde la punta de la varita.\n" +
                "3) Bombarda maxima: Daño 25, Energía necesaria 40.\n" +
                "Este encantamiento provoca una pequeña explosión en su objetivo.;\n" +
                "4) Avada Kedavra: Daño 100, Energía necesaria 90.\n" +
                "Maleficio imperdonable, mata en el acto a cualquier ser vivo que le alcance.\n" +
                "5) Imperius: Daño 90, Energía necesaria 80.\n" +
                "Maleficio imperdonable, permite controlar completamente los pensamientos y acciones de la víctima\n" +
                "6) Cruciatus: Daño 80, Energía necesaria 70.\n" +
                "Maleficio imperdonable, provoca un dolor insoportable y agónico en su víctima.");


        System.out.println("\nHechizos de Defensa:\n" +
                "7) Protego: Recupera energía 5, Energía necesaria 2.\n" +
                "Genera una barrera invisible que permite bloquear y desviar hechizos enemigos.\n" +
                "8) Finite: Recupera energía 10, Energía necesaria 3.\n" +
                "Contrahechizo que cesa los efectos de un encantamiento.\n" +
                "9) Expelliarmus: Recupera energía 15, Energía necesaria 4.\n" +
                "Encantamiento desarmador.\n");

        System.out.println("Hechizos de sanación:\n" +
                "10) Episkey: Recupera vida 10, Energía necesaria 4.\n" +
                "Hechizo para tratar heridas leves.\n" +
                "11) Reparifors: Recupera vida 15, Energía necesaria 6.\n" +
                "Cura dolencias menores generadas por magia como la parálisis.\n" +
                "12) Vulnera Sanentur: Recupera vida 20, Energía necesaria 8.\n" +
                "Hechizo usado para curar heridas profundas.\n");


        boolean auxiliar;
        int option;
        for (int i = 0; i < 6; i++) {
            do {
                auxiliar = false;
                System.out.println("Elige el número del hechizo a utilizar: ");
                System.out.print("Opcion: ");
                option = keyboard.nextInt();
                switch (option) {
                    case 1:
                        player.addSpell(new Attack("Aguamenti", 10, 10));
                        break;
                    case 2:
                        player.addSpell(new Attack("Incendio", 20, 20));
                        break;
                    case 3:
                        player.addSpell(new Attack("Bombarda maxima", 25, 40));
                        break;
                    case 4:
                        player.addSpell(new Attack("Avada Kedavra", 100, 90));
                        break;
                    case 5:
                        player.addSpell(new Attack("Imperius", 90, 80));
                        break;
                    case 6:
                        player.addSpell(new Attack("Cruciatus", 80, 70));
                    case 7:
                        player.addSpell(new Recovery("Protego", 5, 2));
                        break;
                    case 8:
                        player.addSpell(new Recovery("Finite", 10, 3));
                        break;
                    case 9:
                        player.addSpell(new Recovery("Expelliarmus", 15, 4));
                        break;
                    case 10:
                        player.addSpell(new Defense("Episkey", 10, 4));
                        break;
                    case 11:
                        player.addSpell(new Defense("Reparifors", 15, 6));
                        break;
                    case 12:
                        player.addSpell(new Defense("Vulnera Sanentur", 20, 8));
                        break;
                    default:
                        auxiliar = true;
                        System.out.println("No has elegido una opción válida, elige un número entre el 1 y el 12.");
                }
                System.out.println("Tienes " + (5 - i) + " hechizos por elegir.");
            } while (auxiliar);
        }
    }


    public void letsFight() {
        do {
            turn(playerOne, playerTwo);
            if (playerTwo.isDead()) break;

            turn(playerTwo, playerOne);
        } while (!playerOne.isDead());
    }

    private void turn(Character playerInTurn, Character opponent) {
        System.out.println("\n" + playerInTurn.characterStatus());
        System.out.println("\n" + playerInTurn.getName() + " es tu turno!! \n");
        System.out.println("\nElije qué acción deseeas realizar primero: " +
                "\n1) Atacar" +
                "\n2) Recuperar energía mágica" +
                "\n3) Recuperar vida");
        int option = keyboard.nextInt();

        switch (option) {
            case 1:
                playerInTurn.attack(opponent);
                //opponent.attack(playerInTurn);
                break;
            case 2:
                playerInTurn.magicRecovery();
                break;
            case 3:
                playerInTurn.defense();
                break;

        }
        System.out.println("\nDeseas cambiar de ubicacion?\n 1) Si\n 2) No");
        int opt = keyboard.nextInt();
        if (opt == 1)
            playerInTurn.setLocation(selectLocation());
        //opponent.isDead();

    }
//
//    private void magicRecovery(Character playerInTurn) {
//
//    }
//
//    private void healing(Character playerInTurn) {
//
//    }
//
//    private void attack(Character playerInTurn, Character opponent) {
//    }

    // while hasta que un pj muera
    // gameboardturn(jugador de turno - oponente)
    // pregunta al de turno qué accion attack(jugador de turno - oponente) lista de hechizos tipo ataque y qué hechizo elige, calcular todos los boosts y calcular nivel de daño int, hacia donde mandar el hechizo metodoDeUbicación() y eso se manda al oponente reciveAttak(if coincide la ubicacion, el daño se resta de la vida del pj)
    // healing(jugador de turno) calcular todos los boosts, se suma al nivel de vida
    // recovery(jugador de turno)calcular todos los boosts, se suma al nivel de energía
    //gameboardturn()
    
    public Character gameWinner() {
        Character winner = null;
        if (playerOne.getEnergyLevel() <= 0) {
            winner = playerTwo;
        } else
            winner = playerOne;

        return winner;
    }

    public void printWinner() {
        System.out.println("El ganador es " + gameWinner().getName() + "!!!");
    }
}
