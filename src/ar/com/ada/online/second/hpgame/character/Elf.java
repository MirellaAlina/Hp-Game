package ar.com.ada.online.second.hpgame.character;

import ar.com.ada.online.second.hpgame.Gameboard;
import ar.com.ada.online.second.hpgame.spell.Attack;
import ar.com.ada.online.second.hpgame.spell.Defense;
import ar.com.ada.online.second.hpgame.spell.Recovery;

import java.util.List;
import java.util.Scanner;

public class Elf extends Character {
    private static Scanner keyboard = new Scanner(System.in);

    public Elf() {
    }

    @Override
    public void attack(Character opponent) {
        int damageEnergySum = 0;
        String attackLocation = null;
        System.out.println("Los hechizos de ataque disponibles son: " + getAttackSpellList());

        List<Attack> attackSpellList = getAttackSpellList();
        for (int i = 0; i < attackSpellList.size(); i++) {
            System.out.println((i+1) + ") " + attackSpellList.get(i).getName());
        }
        // pedir que hechizo usar (1-n) opt
        int opt;
        System.out.println("Elije tu ataque preferido: ");
        opt = keyboard.nextInt();
        Attack attack = attackSpellList.get(opt);

        if (getMagicLevel() > attack.getMagicEnergy()) {
            if (isDarkOrFree() == true) {
                damageEnergySum = damageEnergySum + 5 + attack.getDamageEnergy();
            } else
                damageEnergySum = damageEnergySum + attack.getDamageEnergy();
        } else {
            System.out.println("No tenés suficiente energía para realizar este hechizo, te regalamos 10 puntos para el próximo turno");
            int giftMagicLevel = this.getMagicLevel() + 10;
            this.setMagicLevel(giftMagicLevel);
        }
        // Si el EM > attack.getMagicEnergy();
        // preguntar si es libre, de V => damageEnergySum = damageEnergySum + 5 + attack.getDamageEnergy();
        // preguntar si es libre, de F => damageEnergySum = damageEnergySum + attack.getDamageEnergy();
        // Sino sumarle +10 a magicEnergy


        // preguntar la ubicacion del ataque
        attackLocation = Gameboard.selectLocation();

        opponent.reciveAttack(damageEnergySum, attackLocation);

    }


    @Override
    public void defense() {
        int defenseSum = 0;
        System.out.println("Los hechizos de protección disponibles son: " + getDefenseSpellList());
        List<Defense> defenseSpellListList = getDefenseSpellList();
        for (int i = 0; i < defenseSpellListList.size(); i++) {
            System.out.println((i+1) + ") " + defenseSpellListList.get(i).getName());
        }
        // pedir que hechizo usar (1-n) opt
        int opt;
        System.out.println("Elije tu hechizo de protección: ");
        opt = keyboard.nextInt();
        Defense defense = defenseSpellListList.get(opt);

        if (getMagicLevel() > defense.getMagicEnergy()) {
            if (isDarkOrFree() == true) {
                defenseSum = defenseSum + 5 + defense.getDefenseEnergy();
            } else
                defenseSum = defenseSum + 10 + defense.getDefenseEnergy();
        } else {
            System.out.println("No tenés suficiente energía para realizar este hechizo, te regalamos 10 puntos para el próximo turno");
            int giftMagicLevel = this.getMagicLevel() + 10;
            this.setMagicLevel(giftMagicLevel);

        }


        //metodos

    }

    @Override
    public void magicRecovery() {
        int magicRecoverySum = 0;
        System.out.println("Los hechizos de recuperación mágica disponibles son: " + getRecoverySpellList());
        List<Recovery> magicRecoverySpellList = getRecoverySpellList();
        for (int i = 0; i < magicRecoverySpellList.size(); i++) {
            System.out.println((i+1) + ") " + magicRecoverySpellList.get(i).getName());
        }
        // pedir que hechizo usar (1-n) opt
        int opt;
        System.out.println("Elije tu hechizo de protección: ");
        opt = keyboard.nextInt();
        Recovery recovery = magicRecoverySpellList.get(opt);

        if (getMagicLevel() > recovery.getMagicEnergy()) {
            if (isDarkOrFree() == true) {
                magicRecoverySum = magicRecoverySum + 5 + recovery.getEnergyRecovery();
            } else
                magicRecoverySum = magicRecoverySum + recovery.getEnergyRecovery();
        } else {
            System.out.println("No tenés suficiente energía para realizar este hechizo, te regalamos 10 puntos para el próximo turno");
            int giftMagicLevel = this.getMagicLevel() + 10;
            this.setMagicLevel(giftMagicLevel);

        }

    }
    @Override
    public boolean isDead () {
        if (energyLevel <= 0) {
            System.out.println("Has muerto.");
        }
        return true;
    }

    @Override
    public String characterStatus () {
        return   "Estado del personaje"+
                "\n Nivel de vida: " + getEnergyLevel() +
                "\n Ubicación: " + getLocation() +
                "\n Energía mágica: " + getMagicLevel() + "\n";

    }
}
