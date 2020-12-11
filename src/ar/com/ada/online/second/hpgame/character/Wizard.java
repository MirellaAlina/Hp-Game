package ar.com.ada.online.second.hpgame.character;

import ar.com.ada.online.second.hpgame.spell.Spell;
import ar.com.ada.online.second.hpgame.wand.Wand;

public class Wizard extends Character {

    //ATRIBUTOS
    private Wand wand;

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
        int damageEnergySum =0;
        String attackLocation = null;


        opponent.reciveAttack(damageEnergySum, attackLocation);

    }

    @Override
    public void healing() {

    }

    @Override
    public void magicRecovery() {

    }

    @Override
    public boolean isDead() {
        if (energyLevel <= 0) {

        } return true;
    }

    @Override
    public void characterStatus() {

    }
}
