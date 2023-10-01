import java.util.ArrayList;
import java.util.List;

public class Day252 {
    public static void main(String[] args) {
        int numerator = 4;
        int denominator = 13;
        List<Integer> egyptianFractions = getEgyptianFractions(numerator, denominator);

        System.out.print("Egyptian Fraction Representation of " + numerator + "/" + denominator + ": ");
        for (int i = 0; i < egyptianFractions.size(); i++) {
            System.out.print("1/" + egyptianFractions.get(i));
            if (i < egyptianFractions.size() - 1) {
                System.out.print(" + ");
            }
        }
    }

    public static List<Integer> getEgyptianFractions(int numerator, int denominator) {
        List<Integer> fractions = new ArrayList<>();
        if (numerator == 0 || denominator == 0) {
            throw new IllegalArgumentException("Numerator and denominator must be positive integers.");
        }

        while (numerator > 0) {
            int ceil = (int) Math.ceil((double) denominator / numerator);
            fractions.add(ceil);
            numerator = numerator * ceil - denominator;
            denominator = denominator * ceil;
        }

        return fractions;
    }
}

