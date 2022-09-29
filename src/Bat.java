public class Bat extends Gorrila {
    public int energyLevel = 300;

    public int fly(){
        System.out.println("Up Up and away");
        energyLevel -= 50;
        return energyLevel;
    }
    public int eatHuman(){
        System.out.println("He a munch");
        energyLevel += 25;
        return energyLevel;
    }
    public int attackTown(){
        System.out.println("Heeeeelllllllp 🔥🏢");
        energyLevel -= 100;
        return energyLevel;
    }
}
