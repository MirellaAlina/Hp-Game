package ar.com.ada.online.second.hpgame.spell;

public class Defense extends Spell{
    public int defenseEnergy;

    public Defense() {
    }

    public Defense(String name, int defenseEnergy, int magicEnergy) {
        super(name, magicEnergy);
        this.defenseEnergy = defenseEnergy;
    }

    public int getDefenseEnergy() {
        return defenseEnergy;
    }

    public void setDefenseEnergy(int defenseEnergy) {
        this.defenseEnergy = defenseEnergy;
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
                "\n Puntos de vida recuperados: " + defenseEnergy +
                "\n Energía mágica consumida: " + magicEnergy + "\n";
        //"Magic energy available" cómo mostrar la energía que queda?;
    }
}
