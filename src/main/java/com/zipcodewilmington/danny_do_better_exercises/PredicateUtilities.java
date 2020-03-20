package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class PredicateUtilities {
    /**
     * @param x
     * @param y
     * @return
     */
    public boolean isGreaterThan(int x, int y) {
        return x > y;

            }



        /**
     * @param x
     * @param y
     * @return true if `x` is less than `y`
     */
    public boolean isLessThan(int x, int y) {
        return x <= y;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is greater than or equal to `y`
     */
    public boolean isGreaterThanOrEqualTo(int x, int y) {
        return x >= y;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is less than or equal to `y`
     */
    public boolean isLessThanOrEqualTo(int x, int y) {
        return x <= y;
    }


    /**
     * @return true
     */
    public boolean returnTrue() {
        return true;
    }

    /**
     * @return false
     */
    public boolean returnFalse() {
        return false;
    }

}