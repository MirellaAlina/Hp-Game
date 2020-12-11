package ar.com.ada.online.second.hpgame.character;

import ar.com.ada.online.second.hpgame.spell.Spell;

public class Elf extends Character {

    public Elf() {
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

    //metodos
    public Boolean freeElfOrNot() {
        return null;
    }
}
