public class Pizza {
    private boolean mMushrooms;
    private boolean mPepperoni;
    private boolean mSausage;
    private char mSize;
    private boolean mVegan;

    public Pizza(boolean mushrooms, boolean pepperoni, boolean sausage, char size, boolean vegan) {
        mMushrooms = mushrooms;
        mPepperoni = pepperoni;
        mSausage = sausage;
        mSize = size;
        mVegan = vegan;
    }

    public int getNumToppings() {
        int numTop = 0;
        if (mMushrooms == true) numTop++;
        if (mPepperoni == true) numTop++;
        if (mSausage == true) numTop++;
        return numTop;
    }

    public char getSize() {
        return mSize;
    }

    @Override
    public String toString() {
        String output = "Pizza{" +"Size ="+mSize;
        if(mSausage) output+= ", Sausage";
        if(mPepperoni) output+= ", Pepperoni";
        if(mVegan) output+= ", Vegan";

        return output+"}";
    }
}
