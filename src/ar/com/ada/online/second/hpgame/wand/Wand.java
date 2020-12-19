package ar.com.ada.online.second.hpgame.wand;

public class Wand {

    public String name;
    public Integer damageBoost;

    public Wand(){

    }

    public Wand(String name, Integer damageBoost){
        this.name = name;
        this.damageBoost = damageBoost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDamageBoost() {
        return damageBoost;
    }

    public void setDamageBoost(Integer damageBoost) {
        this.damageBoost = damageBoost;
    }

    @Override
    public String toString() {
        return name + ". Tienes un daño extra de:" + damageBoost;
    }
}
