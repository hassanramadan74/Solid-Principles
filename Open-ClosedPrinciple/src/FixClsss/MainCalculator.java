package FixClsss;

import java.security.InvalidParameterException;

public class MainCalculator {


        public void calculate(CalculatorOperation operation) {
            if (operation == null) {
                throw new InvalidParameterException("Cannot perform operation");
            }
            operation.perform();
         }

}
