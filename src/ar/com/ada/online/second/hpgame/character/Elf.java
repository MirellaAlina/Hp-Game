package ar.com.ada.online.second.hpgame.character;

import ar.com.ada.online.second.hpgame.spell.Spell;

public class Elf extends Character {

    public Elf() {
    }

    @Override
    public void Attack() {

    }

    @Override
    public void Healing() {

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
    public void addSpell(Spell spell) {

    }

    @Override
    public void characterStatus() {

    }

    //metodos
    public Boolean freeElfOrNot() {
        return null;
    }
}
