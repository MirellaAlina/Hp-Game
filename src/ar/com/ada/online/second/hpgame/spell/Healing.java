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

    @Override
    public Integer getMagicEnergy() {
        return super.getMagicEnergy();
    }

    @Override
    public void setMagicEnergy(Integer magicEnergy) {
        super.setMagicEnergy(magicEnergy);
    }

    @Override
    public String toString() {
        return   "Healing Spell:"+
                "\n Name: " + name +
                "\n Energy restored: " + healingEnergy +
                "\n Magic energy consumed" + magicEnergy + "\n";
        //"Magic energy available" cómo mostrar la energía que queda?;
    }
}
