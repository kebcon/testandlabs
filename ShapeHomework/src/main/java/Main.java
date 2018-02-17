public class Main {
    public static void main(String[] args) {
        SuperHero[] superHeroes = new SuperHero[2];
        superHeroes[0] = new SuperMan("Clark Kent");
        superHeroes[1] = new WonderWoman("Diana Prince");

        for (SuperHero s: superHeroes) {
            System.out.println(s);
            System.out.println("======================================================================================");
        }

        Plane plane = new Plane("Boeing 737 ");

        System.out.println(superHeroes[0].flightSpeed());
        System.out.println("======================================================================================");
        System.out.println(plane.flightSpeed());


    }
}
