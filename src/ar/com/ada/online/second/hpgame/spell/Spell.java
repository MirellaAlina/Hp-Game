package ar.com.ada.online.second.hpgame.spell;

public class Spell {
    protected Integer magicEnergy;
    protected String name;

    public Spell() {

    }

    public Spell(String name, Integer magicEnergy) {
        this.name = name;
        this.magicEnergy = magicEnergy;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMagicEnergy() {
        return magicEnergy;
    }

    public void setMagicEnergy(Integer magicEnergy) {
        this.magicEnergy = magicEnergy;
    }

    @Override
    public String toString() {
        return " Spell name: " + name +
                "\n Magic energy consumed: " + magicEnergy + "\n";

    }
}
