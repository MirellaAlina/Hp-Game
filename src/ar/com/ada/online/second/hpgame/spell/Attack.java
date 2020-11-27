package ar.com.ada.online.second.hpgame.spell;

public class Attack extends Spell{
    private int damageEnergy;

    public Attack(String name, int magicEnergy, int damageEnergy) {
        super (name, magicEnergy);
        this.damageEnergy = damageEnergy;
    }

    public int getDamageEnergy() {
        return damageEnergy;
    }

    public void setDamageEnergy(int damageEnergy) {
        this.damageEnergy = damageEnergy;
    }


}
