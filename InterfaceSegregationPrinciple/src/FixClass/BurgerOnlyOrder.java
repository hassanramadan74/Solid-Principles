package FixClass;

public class BurgerOnlyOrder implements BurgerOnly {

    @Override
    public void orderBurger(int quantity) {
        System.out.println("Received order of " + quantity + " burgers");
    }



}
