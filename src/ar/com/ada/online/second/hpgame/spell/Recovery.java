package ar.com.ada.online.second.hpgame.spell;

public class Recovery extends Spell {
    public int energyRecovery;

    public Recovery(String name, int energyRecovery, int magicEnergy) {
        super(name, magicEnergy);
        this.energyRecovery = energyRecovery;
    }

    public int getEnergyRecovery() {
        return energyRecovery;
    }

    public void setEnergyRecovery(int damageEnergy) {
        this.energyRecovery = damageEnergy;
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
        return "Hechizo de recuperación:" +
                "\n Nombre: " + name +
                "\n Energía mágica recuperada: " + energyRecovery +
                "\n Energía mágica consumida: " + magicEnergy + "\n";
        //"Magic energy available" cómo mostrar la energía que queda?
    }
}
