package StrategyPattern;

import java.util.Scanner;

public class Application {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);

        int a = read.nextInt();
        int b = read.nextInt();
        String action = read.next();

        Context context = null;

        if (action.equals("+")) {
            context = new Context(new StrategyAdd());
        }
        else if (action.equals("-")) {
            context = new Context(new StrategySubtract());
        }
        else if (action.equals("*")) {
            context = new Context(new StrategyMultiply());
        }
        else {
            System.out.println("Wrong strategy.");
        }

        if (context != null) {
            int result = context.executeStrategy(a, b);

            System.out.println(result);
        }
    }
}
