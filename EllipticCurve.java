import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EllipticCurve {

    private BigInteger a;
    private BigInteger b;
    private BigInteger N;

    public EllipticCurve(BigInteger a, BigInteger b, BigInteger N) {
        this.a = a;
        this.b = b;
        this.N = N;
    }

    public Point multiplyPoint(Point p, BigInteger d) {
        Point t = p.clone();
        List<String> bits = new ArrayList<>(Arrays.asList(d.toString(2).split("")));
        bits.remove(0);
        for (String c : bits) {
            t = this.sumPoints(t, t);
            if (c.equals("1")) {
                t = this.sumPoints(t, p);
            }
        }
        return t;
    }

    public Point sumPoints(Point p1, Point p2) {
        if (p1.equals(Point.Inf())) {
            return p2;
        } else if (p2.equals(Point.Inf())) {
            return p1;
        }

        BigInteger s = BigInteger.ZERO;
        if (p1.equals(p2)) {
            s = p1
                    .getX()
                    .multiply(p1.getX().multiply(BigInteger.valueOf(3)))
                    .add(this.a)
                    .multiply(
                            p1.getY().multiply(BigInteger.valueOf(2)).modInverse(this.N))
                    .mod(this.N);
        } else {
            if (p1.getX().compareTo(p2.getX()) == 0) {
                return Point.Inf();
            }

            s = p2
                    .getY()
                    .subtract(p1.getY())
                    .multiply(p2.getX().subtract(p1.getX()).modInverse(this.N))
                    .mod(this.N);
        }

        BigInteger x = s
                .multiply(s)
                .subtract(p1.getX())
                .subtract(p2.getX())
                .mod(this.N);

        BigInteger y = s
                .multiply(p1.getX().subtract(x))
                .subtract(p1.getY())
                .mod(this.N);
        return new Point(x, y);
    }
}
