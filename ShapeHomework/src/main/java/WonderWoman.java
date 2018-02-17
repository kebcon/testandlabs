import java.util.Arrays;

public class WonderWoman extends SuperHero {

    public WonderWoman(String name){
        super(name);
    }

    public String[] specialPowers() {
        String[] powers = {"Lasso of Truth", "indestructible bracelets", "a tiara which serves as a projectile"};
        return powers;
    }

    @Override
    public String toString(){
        return super.toString() + Arrays.toString(specialPowers());
    }

    public String flightSpeed() {
        return "Wonder woman does not fly";
    }
}
