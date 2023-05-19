package FixClsss;

public class Subtraction implements CalculatorOperation{
    private double left;
    private double right;
    private double result;

    @Override
    public void perform() {
        result = left - right;
    }

    // constructor, getters and setters
}
