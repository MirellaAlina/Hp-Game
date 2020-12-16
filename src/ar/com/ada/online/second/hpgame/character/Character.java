package ar.com.ada.online.second.hpgame.character;

import ar.com.ada.online.second.hpgame.spell.Attack;
import ar.com.ada.online.second.hpgame.spell.Defense;
import ar.com.ada.online.second.hpgame.spell.Recovery;
import ar.com.ada.online.second.hpgame.spell.Spell;

import java.util.ArrayList;
import java.util.List;

public abstract class Character {

    //ATRIBUTOS

    protected String name;
    protected Integer energyLevel = 100; //vida
    protected Integer magicLevel = 100; //energía mágica
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

    public void reciveAttack(Integer damageEnergy, String location) {
        if (location.equals(location))
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

    public List<Defense> getDefenseSpellList() {
        ArrayList<Defense> defenses = new ArrayList<>();
        for (Spell spell : spellList) {
            if (spell instanceof Defense)
                defenses.add((Defense) spell);
        }
        return defenses;
    }

    public List<Recovery> getRecoverySpellList() {
        ArrayList<Recovery> recoveries = new ArrayList<>();
        for (Spell spell : spellList) {
            if (spell instanceof Attack)
                recoveries.add((Recovery) spell);
        }
        return recoveries;
    }

    public Boolean isDarkOrFree() {

        /*
        Boolean b = getAttackSpellList().size() > 3 ? true : false;
        return b;


        if (getAttackSpellList().size() > 3)
            return true;
        else
            return false;
        */
        return getAttackSpellList().size() > 3;
    }


    //METODOS ABSTRACTOS

    public abstract void attack(Character opponent);

    public abstract void defense();        //RECUPERA VIDA

    public abstract void magicRecovery();      //RECUPERA MAGIA

    public abstract boolean isDead();

    public void addSpell(Spell spell) {
        spellList.add(spell);
    }


    public abstract String characterStatus();
}