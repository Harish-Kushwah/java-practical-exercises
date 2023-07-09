package practical1.setB;

/**
b) Define a class MyNumber having one private int data member. Write a default 
constructor to initialize it to 0 and another constructor to initialize it to a value 
(Use this). Write methods isNegative, isPositive, isZero, isOdd, isEven. Create an 
object in main. Use command line arguments to pass a value to the object */


public class Ex2 {

    /**
     * This is main method which makes the object of MyNumber and perform the
     * tests on given input number
     * @param args
     * @return Nothing
     */
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            MyNumber number = new MyNumber(num);
            number.isPositive();
            number.isNegative();
            number.isOdd();
            number.isZero();
        }
    }
}
