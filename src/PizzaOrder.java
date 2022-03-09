import java.text.NumberFormat;
import java.util.Arrays;

public class PizzaOrder {
    private static final int mMAX_PIZZAS = 100;
    private int mNumPies;
    private Pizza[] mPies = new Pizza[mMAX_PIZZAS];



    public boolean addPizzaToOrder(char size, boolean pepperoni, boolean sausage, boolean mushrooms, boolean vegan){
        // If inventory is able to, make pizza object
        if (mNumPies < mMAX_PIZZAS) {
            mPies[mNumPies++] = new Pizza(mushrooms, pepperoni, sausage, size, vegan);
            return true;
        }
        return false;
    }

    public double calcDouble() {
        double cost = 0.0;

        for (int i = 0; i < mNumPies; i++) {
            // Make a decision on size:
            switch(mPies[i].getSize())
            {
                case 's':
                case 'S':
                    cost+=8.0;
                    break;
                case 'M':
                case 'm':
                    cost+=10.0;
                    break;
                case 'L':
                case 'l':
                    cost+=12.0;
                    break;
            }
            // Add toppings
            cost += mPies[i].getNumToppings();
        }
        return cost;
    }

    @Override
    public String toString() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String output = "Pizza Order: Number of Pies = " + mNumPies + "\n";
        // Loop through pizza
        for (int i = 0; i < mNumPies; i++)
            output += "Pie #" + (i+1) + ": " + mPies[i] + "\n";

        output += "Total Cost = " + currency.format(calcDouble()) + "\n";
        return output;
    }
}
