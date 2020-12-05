package ar.com.ada.online.second.hpgame.character;

import ar.com.ada.online.second.hpgame.spell.Attack;
import ar.com.ada.online.second.hpgame.spell.Healing;
import ar.com.ada.online.second.hpgame.spell.Recovery;
import ar.com.ada.online.second.hpgame.spell.Spell;

import java.util.ArrayList;
import java.util.List;

public abstract class Character {

    //ATRIBUTOS

    protected String name;
    protected Integer energyLevel; //vida
    protected Integer magicLevel; //energía mágica
    protected String location;
    protected ArrayList<Spell> spellList = new ArrayList<Spell>();

    //CONSTRUCTOR
    public Character() {
    }

    //SOBRECARGA CONSTRUCTOR
    public Character(String name, Integer energyLevel, Integer magicLevel, String location) {
        this.name = name;
        this.energyLevel = energyLevel;
        this.magicLevel = magicLevel;
        this.location = location;
    }

    //ArrayList<String> nombreArrayList = new ArrayList<String>();
    //nombreArrayList.add("Elemento");


    //GETTERS Y SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(Integer energyLevel) {
        this.energyLevel = energyLevel;
    }

    public Integer getMagicLevel() {
        return magicLevel;
    }

    public void setMagicLevel(Integer magicLevel) {
        this.magicLevel = magicLevel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void reciveAttack(Integer damageEnergy, String Location) {
        if (this.location.equals(location))
            energyLevel = energyLevel - damageEnergy;
        else
            System.out.println("");
    }

    public List<Attack> getAttackSpellList() {
        ArrayList<Attack> attacks = new ArrayList<>();
        for (Spell spell : spellList) {
            if (spell instanceof Attack)
                attacks.add((Attack) spell);
        }
        return attacks;
    }

    public List<Healing> getHealingSpellList() {
        ArrayList<Healing> healings = new ArrayList<>();
        for (Spell spell : spellList) {
            if (spell instanceof Attack)
                healings.add((Healing) spell);
        }
        return healings;
    }

    public List<Recovery> getRecoverySpellList() {
        ArrayList<Recovery> recoveries = new ArrayList<>();
        for (Spell spell : spellList) {
            if (spell instanceof Attack)
                recoveries.add((Recovery) spell);
        }
        return recoveries;
    }




    //METODOS ABSTRACTOS

    public abstract void attack();

    public abstract void healing();        //RECUPERA VIDA

    public abstract void magicRecovery();      //RECUPERA MAGIA

    public abstract boolean isDead();

    public void addSpell(Spell spell) {
        spellList.add(spell);
    }


    public abstract void characterStatus();
}