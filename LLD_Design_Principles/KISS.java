

public class KISS {

    // Complex way: Checking if a number is even or odd
    public boolean isEven1(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Simple way (KISS): Checking if a number is even
    public boolean isEven2(int number) {
        return number % 2 == 0;
    }
}
