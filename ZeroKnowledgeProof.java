import java.math.BigInteger;

public class ZeroKnowledgeProof {
    private Point X;
    private Point R;
    private Point Z;
    private Point A;
    private Point B;
    private BigInteger c;
    private EllipticCurve ec;
    private BigInteger E;

    public ZeroKnowledgeProof(Point X, Point R, Point Z, Point A, Point B, BigInteger c, EllipticCurve ec,
            BigInteger E) {
        this.A = A;
        this.B = B;
        this.R = R;
        this.X = X;
        this.Z = Z;
        this.c = c;
        this.ec = ec;
        this.E = E;
    }

    public Boolean isValid(BigInteger t) {
        Point t1 = ec.multiplyPoint(X, t);
        Point t2 = ec.sumPoints(ec.multiplyPoint(Z, c), B);

        // Point t1 = ec.multiplyPoint(G, t);
        // Point t2 = ec.sumPoints(ec.multiplyPoint(R, c), A);
        return t1.equals(t2);
    }

    public BigInteger generateT(BigInteger s, BigInteger r) {
        return s.add(c.multiply(r)).mod(E);
    }

}
