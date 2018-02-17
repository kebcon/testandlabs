public class Plane implements IFly {

    private String name;

    public Plane(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public String flightSpeed() {
        return getName() + "can flies at 460 – 575 mph";
    }
}
