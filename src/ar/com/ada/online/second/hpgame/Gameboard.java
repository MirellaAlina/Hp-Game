package ar.com.ada.online.second.hpgame;

import ar.com.ada.online.second.hpgame.character.Wizard;
import ar.com.ada.online.second.hpgame.wand.Wand;

import java.util.Scanner;

public class Gameboard {
    private Character playerOne;
    private Character playerTwo;
    private Scanner keyboard = new Scanner(System.in);

    public void SettingGame() {
        System.out.println("Selección del jugador nro 1 ");
        playerOne = SelectCharacter();

        System.out.println("\n");

        System.out.println("Selección del jugador nro 2 ");
        playerTwo = SelectCharacter();
    }

    private Character SelectCharacter() {
        System.out.println("Seleccione el tipo de personaje: ");
        System.out.println("\n 1- Mago ,\n 2- Elfo: ");
        int character = keyboard.nextInt();
        if (character == 1) {
            return setWizard();
        }
        return setElf();
    }

    private Character setElf() {
        return null;
    }

    public Character setWizard(){
        Wizard playerWizard = new Wizard();
        System.out.println("Escriba su nombre");
        playerWizard.setName(keyboard.next());
        return null;
    }

    private Wand getRandomWand() {
        System.out.println("Lista de varitas: ");
        return null;
    }


}
