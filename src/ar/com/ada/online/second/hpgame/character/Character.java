package ar.com.ada.online.second.hpgame.character;

import ar.com.ada.online.second.hpgame.spell.Spell;

import java.util.ArrayList;

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


    //METODOS ABSTRACTOS

    public abstract void Attack();

    public abstract void Healing();        //RECUPERA VIDA

    public abstract void magicRecovery();      //RECUPERA MAGIA

    public abstract boolean isDead();

    public abstract void addSpell(Spell spell);

    public abstract void characterStatus();
}