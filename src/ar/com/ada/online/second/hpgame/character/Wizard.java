package ar.com.ada.online.second.hpgame.character;

public class Wizard extends Character {

    //ATRIBUTOS
    private String wand;

    public Wizard() {
    }


    public Wizard(String name, Integer energyLevel, Integer magicLevel, String location, String wand) {
        super(name, energyLevel, magicLevel, location);
        this.wand = wand;
    }


    public String getWand() {
        return wand;
    }

    public void setWand(String wand) {
        this.wand = wand;
    }


    public Boolean darkWizardOrNot() {
        return null;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void Attack() {


    }

    @Override
    public void Healing() {

    }

    @Override
    public void magicRecovery() {

    }

    @Override
    public void aliveOrNot() {

    }

    @Override
    public void addSpell() {

    }

    @Override
    public void characterStatus() {

    }
}
