
public class Gorrila extends Mammal{

    public int throwSomething() {
        System.out.println("Gorrila threw poop");
        energyLevel -= 5;
        return energyLevel;

    }
    public int eatBananas(){
        System.out.println("Gorrila ate nom nom 😀");
        energyLevel += 10;
        return energyLevel;
    }
    public int climb(){
        System.out.println("lawd have mercy this climb sucks climbing up this tree");
        energyLevel -= 10;
        return energyLevel;
    }
}
