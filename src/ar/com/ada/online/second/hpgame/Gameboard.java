package ar.com.ada.online.second.hpgame;

import ar.com.ada.online.second.hpgame.character.Wizard;
import ar.com.ada.online.second.hpgame.wand.Wand;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Gameboard {
    private Character playerOne;
    private Character playerTwo;
    private Scanner keyboard = new Scanner(System.in);

    public Character SelectDataCharacter() {
        System.out.println("Selección del jugador nro 1 ");
        playerOne = SelectCharacter();

        System.out.println("\n");

        System.out.println("Selección del jugador nro 2 ");
        playerTwo = SelectCharacter();
        return null;
    }

    private Character SelectCharacter() {
        System.out.println("Seleccione el tipo de personaje: ");
        System.out.println("\n 1- Mago ,\n 2- Elfo: ");
        int character = keyboard.nextInt();
        switch (character) {
            case 1: setWizard();
            break;

            case 2: setElf();
            break;
        }
        return SelectDataCharacter();
    }

    private Character setElf() {
        return null;
    }

    public Wizard setWizard(){
        Wizard wizardPlayer = new Wizard();
        System.out.println("Seleccione el nombre de su personaje!");

        ArrayList<String> arrayCharacters = new ArrayList<>();
        arrayCharacters.add("Harry");
        arrayCharacters.add("Hermione");
        arrayCharacters.add("Luna");
        arrayCharacters.add("Draco");
        arrayCharacters.add("Severus");

        System.out.println(arrayCharacters);
        System.out.println();
        System.out.println("O escriba su nombre!");
        String playerName = keyboard.nextLine();
        wizardPlayer.setName(playerName);

        //seleccion de ubicacion

        System.out.println("Seleccione ubicación: 1-IZQUIERDA, 2-CENTRO, 3-DERECHA");
        System.out.println("");
        int option = 0;
        switch (option) {

            case 1:
                wizardPlayer.setLocation("IZQUIERDA");
                break;

            case 2:
                wizardPlayer.setLocation("CENTRO");
                break;

            case 3:
                wizardPlayer.setLocation("DERECHA");

            default:
                System.out.println("Seleccione una ubicacion ingresando 1, 2 o 3");
                break;
        }

        //seteamos demas atributos de mago

        wizardPlayer.setMagicLevel(100);
        wizardPlayer.setEnergyLevel(100);
        wizardPlayer.setWand(randomWandSelection());


        return wizardPlayer;
    }


    //seleccion de varita

    public Wand randomWandSelection() {

        ArrayList<Wand> arrayRandomWands = new ArrayList<>();

        arrayRandomWands.add(new Wand("Varita1", 1));
        arrayRandomWands.add(new Wand("Varita2", 2));
        arrayRandomWands.add(new Wand("Varita3", 3));
        arrayRandomWands.add(new Wand("Varita4", 4));
        arrayRandomWands.add(new Wand("Varita5" , 5));

        Random random = new Random();

        Wand randomWand = arrayRandomWands.get(random.nextInt(arrayRandomWands.size()));

        System.out.println("Una varita te elegirá ... ... ...");
        System.out.println("La varita que te eligió es: " + randomWand);

        return randomWand;

    }



}
