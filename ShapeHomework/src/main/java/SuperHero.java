public abstract class SuperHero implements IFly{

    private String name;

    public SuperHero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract String[] specialPowers();

    @Override
    public String toString(){
        return getClass().getName() + " whose real name is " + this.name + " has the following special powers:";
    }


}
