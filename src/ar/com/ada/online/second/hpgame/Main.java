package ar.com.ada.online.second.hpgame;

public class Main {

    public static void main(String[] args) {
        System.out.println("Juego de combate de Harry Potter");
        Gameboard gameboard = new Gameboard();
        gameboard.selectCharacters();
        gameboard.loadSpellsByCharacters();
        gameboard.letsFight();
        gameboard.printWinner();
    }
}
