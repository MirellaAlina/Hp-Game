package ar.com.ada.online.second.hpgame.character;

import ar.com.ada.online.second.hpgame.Gameboard;
import ar.com.ada.online.second.hpgame.spell.Attack;
import ar.com.ada.online.second.hpgame.spell.Defense;
import ar.com.ada.online.second.hpgame.spell.Recovery;
import ar.com.ada.online.second.hpgame.spell.Spell;
import ar.com.ada.online.second.hpgame.wand.Wand;

import java.util.List;
import java.util.Scanner;

public class Wizard extends Character {


    //ATRIBUTOS
    private Wand wand;
    private static Scanner keyboard = new Scanner(System.in);

    public Wizard() {
    }


    public Wizard(String name, Integer energyLevel, Integer magicLevel, String location, Wand wand) {
        super(name, energyLevel, magicLevel, location);
        this.wand = wand;
    }


    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }


    public Boolean darkWizardOrNot() {
        return null;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void attack(Character opponent) {
        int damageEnergySum = 0;
        String attackLocation = null;
        System.out.println("Los hechizos de ataque disponibles son: " + getAttackSpellList());

        List<Attack> attackSpellList = getAttackSpellList();
        for (int i = 0; i < attackSpellList.size(); i++) {
            System.out.println((i + 1) + ") " + attackSpellList.get(i).getName());
        }
        // pedir que hechizo usar (1-n) opt
        int opt;
        System.out.println("Elije tu ataque preferido: ");
        opt = keyboard.nextInt();
        Attack attack = attackSpellList.get(opt - 1);

        if (getMagicLevel() > attack.getDamageEnergy()) {
            if (isDarkOrFree() == true) {
                damageEnergySum = damageEnergySum + 10 + attack.getDamageEnergy() + wand.getDamageBoost();
                magicLevel = magicLevel - attack.getMagicEnergy();
            } else
                damageEnergySum = damageEnergySum + attack.getDamageEnergy() + wand.getDamageBoost();
                magicLevel = magicLevel - attack.getMagicEnergy();
        } else {
            System.out.println("No tenés suficiente energía para realizar este hechizo, te regalamos 10 puntos para el próximo turno");
            int giftMagicLevel = this.getMagicLevel() + 10;
            this.setMagicLevel(giftMagicLevel);
        }

        // preguntar la ubicacion del ataque
        attackLocation = Gameboard.selectLocation();

        opponent.reciveAttack(damageEnergySum, attackLocation);


    }

    @Override
        public void magicRecovery() {
            int magicRecoverySum = 0;
            System.out.println("Los hechizos de recuperación mágica disponibles son: " + getRecoverySpellList());
            List<Recovery> magicRecoverySpellList = getRecoverySpellList();
            for (int i = 0; i < magicRecoverySpellList.size(); i++) {
                System.out.println((i + 1) + ") " + magicRecoverySpellList.get(i).getName());
            }
            // pedir que hechizo usar (1-n) opt
            int opt;
            System.out.println("Elije tu hechizo de protección: ");
            opt = keyboard.nextInt();
            Recovery recovery = magicRecoverySpellList.get(opt - 1);

            if (getMagicLevel() > recovery.getMagicEnergy()) {
                if (isDarkOrFree() == true) {
                    magicRecoverySum = magicRecoverySum + recovery.getEnergyRecovery();
                    magicLevel = magicLevel - recovery.getMagicEnergy();
                } else if (getEnergyLevel() <= 35)
                    magicRecoverySum = magicRecoverySum + 10 + recovery.getEnergyRecovery();
                    magicLevel = magicLevel - recovery.getMagicEnergy();
            } else {
                System.out.println("No tenés suficiente energía para realizar este hechizo, te regalamos 10 puntos para el próximo turno");
                int giftMagicLevel = this.getMagicLevel() + 10;
                this.setMagicLevel(giftMagicLevel);

            }
        }



    @Override
    public void defense() {
        int defenseSum = 0;
        System.out.println("Los hechizos de protección disponibles son: " + getDefenseSpellList());
        List<Defense> defenseSpellListList = getDefenseSpellList();
        for (int i = 0; i < defenseSpellListList.size(); i++) {
            System.out.println((i + 1) + ") " + defenseSpellListList.get(i).getName());
        }
        // pedir que hechizo usar (1-n) opt
        int opt;
        System.out.println("Elije tu hechizo de protección: ");
        opt = keyboard.nextInt();
        Defense defense = defenseSpellListList.get(opt - 1);

        if (getMagicLevel() > defense.getMagicEnergy()) {
            if (isDarkOrFree() == true) {
                defenseSum = defenseSum - 10 + defense.getDefenseEnergy();
                magicLevel = magicLevel - defense.getMagicEnergy();
            } else
                defenseSum = defenseSum + defense.getDefenseEnergy();
                magicLevel = magicLevel - defense.getMagicEnergy();
        } else {
            System.out.println("No tenés suficiente energía para realizar este hechizo, te regalamos 10 puntos para el próximo turno");
            int giftMagicLevel = this.getMagicLevel() + 10;
            this.setMagicLevel(giftMagicLevel);

        }



    }
    @Override
    public boolean isDead() {
        Boolean hasDead = false;
        if (energyLevel <= 0)
            hasDead = true;

        return hasDead;

    }

    @Override
    public String characterStatus() {
        return "Estado del personaje:"+
                "\n Nivel de vida: " + getEnergyLevel() +
                "\n Ubicación: " + getLocation() +
                "\n Energía mágica: " + getMagicLevel() + "\n";
    }
}
