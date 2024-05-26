import java.math.BigInteger;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        BigInteger maxLimit = new BigInteger("649919996");
        BigInteger minLimit = new BigInteger("0");
        BigInteger bigInteger = maxLimit.subtract(minLimit);
        Random randNum = new Random();
        int len = maxLimit.bitLength();
        BigInteger res = new BigInteger(len, randNum);
        if (res.compareTo(minLimit) < 0)
            res = res.add(minLimit);
        if (res.compareTo(bigInteger) >= 0)
            res = res.mod(bigInteger).add(minLimit);
        System.out.println("The random BigInteger = " + res);
    }
}
