package wildentertainmentsas.monsterwikilegends;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by apprenti on 01/03/17.
 */

public class Monstres implements Parcelable {

    private String name;
    private String element;
    private String life;
    private String stamina;
    private String power;
    private String speed;



    public Monstres(String name, String element, String life, String stamina, String power, String speed){
        this.name = name;
        this.element = element;
        this.life = life;
        this.stamina = stamina;
        this.power = power;
        this.speed = speed;
    }

    protected Monstres(Parcel in) {
        name = in.readString();
        element = in.readString();
        life = in.readString();
        stamina = in.readString();
        power = in.readString();
        speed = in.readString();
    }

    public static final Creator<Monstres> CREATOR = new Creator<Monstres>() {
        @Override
        public Monstres createFromParcel(Parcel in) {
            return new Monstres(in);
        }

        @Override
        public Monstres[] newArray(int size) {
            return new Monstres[size];
        }
    };

    public String toString(){

        return this.name + " // Type : " +  this.element + " -- Vie : " + this.life + " -- Stamina : " + this.stamina + " -- Puissance : " + this.power + " -- Vitesse  : " + this.speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getLife() {
        return life;
    }

    public void setLife(String life) {
        this.life = life;
    }

    public String getStamina() {
        return stamina;
    }

    public void setStamina(String stamina) {
        this.stamina = stamina;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(element);
        dest.writeString(life);
        dest.writeString(stamina);
        dest.writeString(power);
        dest.writeString(speed);
    }
}







