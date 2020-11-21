package ar.com.ada.online.second.hpgame;

import ar.com.ada.online.second.hpgame.character.Character;
import ar.com.ada.online.second.hpgame.character.Elf;
import ar.com.ada.online.second.hpgame.character.Wizard;
import ar.com.ada.online.second.hpgame.wand.Wand;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Gameboard {
    private Character playerOne;
    private Character playerTwo;
    private Scanner keyboard = new Scanner(System.in);

    public void character() {
        System.out.println("Selección del jugador nro 1 ");
        playerOne = selectCharacter();

        System.out.println("\n");

        System.out.println("Selección del jugador nro 2 ");
        playerTwo = selectCharacter();

    }

    private Character selectCharacter() {
        System.out.println("Seleccione el tipo de personaje: ");
        System.out.println("\n 1- Mago ,\n 2- Elfo: ");
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

    public Character getElf() {

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
        elfPlayer.setLocation(characterLocation());

        //seteamos demas atributos de elfo

        elfPlayer.setMagicLevel(100);
        elfPlayer.setEnergyLevel(100);

        return elfPlayer;
    }

    public Character getWizard() {
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
        wizardPlayer.setLocation(characterLocation());

        //seteamos demas atributos de mago

        wizardPlayer.setMagicLevel(100);
        wizardPlayer.setEnergyLevel(100);
        wizardPlayer.setWand(randomWandSelection());


        return wizardPlayer;
    }


    //seleccion de varita

    public Wand randomWandSelection() {

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
    public String characterLocation() {

        System.out.println("Seleccione ubicación: 1-IZQUIERDA, 2-CENTRO, 3-DERECHA");
        int optionLocation = 0;
        optionLocation = keyboard.nextInt();
        String location = null;
        switch (optionLocation) {

            case 1:
                location = "IZQUIERDA";
                break;

            case 2:
                location = "CENTRO";
                break;

            case 3:
                location = "DERECHA";
                ;

            default:
                System.out.println("Seleccione una ubicacion ingresando 1, 2 o 3");
                break;
        }
        return location;
    }
    public Character loadCharacterSpell() {
        System.out.println("Los hechizos disponibles son: ");
        
}


}
