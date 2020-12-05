package ar.com.ada.online.second.hpgame.character;

import ar.com.ada.online.second.hpgame.spell.Spell;

public class Elf extends Character {

    public Elf() {
    }

    @Override
    public void Attack(Character opponent) {


        opponent.reciveAttack(damageEnergy, loc);
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
