import java.math.BigInteger;

public class Point {

    private BigInteger x;
    private BigInteger y;

    public Point(BigInteger x, BigInteger y) {
        this.x = x;
        this.y = y;
    }

    public BigInteger getX() {
        return x;
    }

    public BigInteger getY() {
        return y;
    }

    public static Point Inf() {
        return new Point(BigInteger.valueOf(-1), BigInteger.valueOf(-1));
    }

    public boolean equals(Point p) {
        return this.x.equals(p.getX()) && this.y.equals(p.getY());
    }

    public Point clone() {
        return new Point(this.x, this.y);
    }

}
