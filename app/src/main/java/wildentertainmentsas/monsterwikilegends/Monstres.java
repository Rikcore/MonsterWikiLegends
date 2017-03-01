package wildentertainmentsas.monsterwikilegends;

/**
 * Created by apprenti on 01/03/17.
 */

public class Monstres {

    String name;
    String element;
    String life;
    String stamina;
    String power;
    String speed;



    public Monstres(String name, String element, String life, String stamina, String power, String speed){
        this.name = name;
        this.element = element;
        this.life = life;
        this.stamina = stamina;
        this.power = power;
        this.speed = speed;
    }

    public String toString(){
        return this.name + " // Type : " +  this.element + " -- Vie : " + this.life + " -- Stamina : " + this.stamina + " -- Puissance : " + this.power + " -- Vitesse  : " + this.speed;
    }
}







