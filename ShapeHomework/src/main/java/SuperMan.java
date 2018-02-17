import java.util.Arrays;

public class SuperMan extends SuperHero{

    public SuperMan(String name){
        super(name);
    }

    public String[] specialPowers() {
        return new String[] {"flight", "x-ray vision", "super-speed", "enhanced hearing"};

    }

    @Override
    public String toString(){
       return super.toString() + Arrays.toString(specialPowers());
    }

    public String flightSpeed() {
        return "Superman flies at a speed of 120,000 miles";
    }
}
