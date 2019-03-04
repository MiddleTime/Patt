package Template4;

public abstract class HotDrink {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsIngridients()) {
            addIngridients();
        }
    }

    abstract void brew();

    abstract void addIngridients();

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWantsIngridients() {
        return true;
    }
}
