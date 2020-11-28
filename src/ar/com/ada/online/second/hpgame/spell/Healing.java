package ar.com.ada.online.second.hpgame.spell;

public class Healing extends Spell{
    public int healingEnergy;

    public Healing() {
    }

    public Healing(String name, int healingEnergy, int magicEnergy) {
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
        return   "Hechizo de sanación:"+
                "\n Nombre: " + name +
                "\n Puntos de vida recuperados: " + healingEnergy +
                "\n Energía mágica consumida: " + magicEnergy + "\n";
        //"Magic energy available" cómo mostrar la energía que queda?;
    }
}
