package ar.com.ada.online.second.hpgame.spell;

public class Spell {
    protected Integer magicEnergy;
    protected String name;

    public Spell(){

    }

    public Spell(String name, Integer magicenergy){
        this.name = name;
        this.magicEnergy = magicenergy;
    }
}
