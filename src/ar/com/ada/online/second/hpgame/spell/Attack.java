package ar.com.ada.online.second.hpgame.spell;

public class Attack extends Spell{
    private int damageEnergy;

    public Attack(String name, int damageEnergy, int magicEnergy) {
        super (name, magicEnergy);
        this.damageEnergy = damageEnergy;
    }

    public int getDamageEnergy() {
        return damageEnergy;
    }

    public void setDamageEnergy(int damageEnergy) {
        this.damageEnergy = damageEnergy;
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
        return "Attack Spell:"+
                "\n Name: " + name +
                "\n Damage caused: " + damageEnergy +
                "\n Magic energy consumed" + magicEnergy + "\n";
                //"Magic energy available" cómo mostrar la energía que queda?
    }
}
