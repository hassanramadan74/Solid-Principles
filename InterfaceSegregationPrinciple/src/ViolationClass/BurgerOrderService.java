package ViolationClass;

public class BurgerOrderService implements OrderService {

    /*

      Now, to implement a burger-only order,
      we are forced to throw an exception in the orderFries() method:
      ---------------------------------------------------------------
      Similarly, for a fries-only order,
      we’d also need to throw an exception in orderBurger() method.

     */
    @Override
    public void orderBurger(int quantity) {
        System.out.println("Received order of " + quantity + " burgers");
    }

    @Override
    public void orderFries(int fries) {
        throw new UnsupportedOperationException("No fries in burger only order");
    }

    @Override
    public void orderCombo(int quantity, int fries) {
        throw new UnsupportedOperationException("No combo in burger only order");

    }
}
