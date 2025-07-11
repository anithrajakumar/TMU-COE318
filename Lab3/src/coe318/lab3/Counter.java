/**
 *
 * @author Anith Rajakumar
 */
package coe318.lab3;
public class Counter {
    //Instance variables here
    private int counterMod;
    private int counterDig = 0;
    private Counter counterLeft;
    private int counter = 0;

    
    public Counter(int modulus, Counter left) {
        this.counterMod = modulus;
        this.counterLeft = left;
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        return this.counterMod;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        if(counterLeft == null){
            return null; 
        } else{
            return counterLeft;
        }
    }
    

    /**
     * @return the digit
     */
    public int getDigit() {
        return this.counterDig;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        this.counterDig = digit;
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        if(counterLeft == null){
            ++counterDig;
            counter = counterDig%counterMod;
        } else {
            ++counter;
            counterDig = counter%counterMod;
            if(counterDig == 0){
                counterLeft.setDigit(counterLeft.getDigit()+1);
            }
        }
    
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        return counter;
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neigbhour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}
