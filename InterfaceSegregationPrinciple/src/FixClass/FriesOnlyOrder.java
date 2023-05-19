package FixClass;

public class FriesOnlyOrder implements FriesOnlyInterface {
    @Override
    public void orderFries(int fries) {
        throw new UnsupportedOperationException("No fries in burger only order");
    }
}
