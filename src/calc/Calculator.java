package calc;

import static java.lang.String.format;

public class Calculator {
    double addTwoNumbers(double first, double second) {
        double resuld = first + second;
        System.out.println(format("%f + %f = %f", first, second, resuld));
        return resuld;
    }

    double subtractTwoNumbers(double first, double second) {
            double resuld = first + second;
            System.out.println(format("%f - %f = %f", first, second, resuld));
            return resuld;
}


        public static void main(String[] args) {
          var calc = new Calculator();
            calc.addTwoNumbers(2.1, 3.4);
          calc.subtractTwoNumbers(2.1, 3.4);
        }
    }
