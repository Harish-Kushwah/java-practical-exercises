package practical1.setB;

/**
 * <h1>Test the number</h1>
 * <ol>
    * <li>Number is positive</li>
    * <li>Number is negative</li>
    * <li>Number is zero</li>
    * <li>Number is odd</li>
 * </ol>
 * 
 * @author Harish
 */
public class MyNumber {
    private int number;

    /**
     * It is default constructor construct the MyNumber with initial value of
     * number is 0
     */
    public MyNumber() {
        number = 0;
    }

    /**
     * It constructs the MyNumber with user defined number
     * 
     * @param number
     */
    public MyNumber(int number) {
        this.number = number;
    }

    /**
     * This method is used to check whether given number id negative or not
     * 
     * @param without parameter
     * @return Nothing
     */
    public void isNegative() {
        if (this.number < 0)
            System.out.println(number + " : is negative");
    }

    /**
     * This method is used to check whether given number id positive or not
     * 
     * @param without parameter
     * @return Nothing
     */
    public void isPositive() {
        if (this.number > 0)
            System.out.println(number + " : is positive");
    }

    /**
     * This method is used to check whether given number id zero or not
     * 
     * @param without parameter
     * @return Nothing
     */
    public void isZero() {
        if (this.number == 0)
            System.out.println(number + " : is zero");
    }

    /**
     * This method is used to check whether given number id odd or not
     * 
     * @param without parameter
     * @return Nothing
     */
    void isOdd() {
        if (this.number % 2 != 0)
            System.out.println(number + " : is odd");
    }
}
