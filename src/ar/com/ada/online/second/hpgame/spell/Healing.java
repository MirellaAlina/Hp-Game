package ar.com.ada.online.second.hpgame.spell;

public class Healing extends Spell{
    public int healingEnergy;

    public Healing() {
    }

    public Healing(String name, int magicEnergy, int healingEnergy) {
        super(name, magicEnergy);
        this.healingEnergy = healingEnergy;
    }

    public int getHealingEnergy() {
        return healingEnergy;
    }

    public void setHealingEnergy(int healingEnergy) {
        this.healingEnergy = healingEnergy;
    }
}
