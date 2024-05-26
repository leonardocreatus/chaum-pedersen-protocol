import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;

public class App {

    public static void main(String[] args) {

        // BigInteger p = new BigInteger("17");
        // BigInteger E = new BigInteger("19");
        // BigInteger c = new BigInteger("9");

        // EllipticCurve ec = new EllipticCurve(BigInteger.TWO, BigInteger.TWO, p);

        // Point G = new Point(new BigInteger("5"), new BigInteger("1"));
        // Point X = new Point(new BigInteger("0"), new BigInteger("6"));
        // Point R = new Point(new BigInteger("9"), new BigInteger("17"));
        // Point Z = new Point(new BigInteger("10"), new BigInteger("11"));
        // Point A = new Point(new BigInteger("16"), new BigInteger("4"));
        // Point B = new Point(new BigInteger("3"), new BigInteger("16"));

        // ZeroKnowledgeProof zpk = new ZeroKnowledgeProof(X, R, Z, A, B, c, ec, E);

        // BigInteger t = zpk.generateT(new BigInteger("13"), new BigInteger("5"));
        // System.out.println(zpk.isValid(t) ? "True" : "False");

        BigInteger p = new BigInteger("649942387");
        BigInteger E = new BigInteger("649919997");
        BigInteger c = new BigInteger("334202239");

        EllipticCurve ec = new EllipticCurve(BigInteger.TWO, BigInteger.TWO, p);

        Point G = new Point(new BigInteger("127310624"), new BigInteger("442590477"));
        Point X = new Point(new BigInteger("408641257"), new BigInteger("77546425"));
        Point R = new Point(new BigInteger("169194362"), new BigInteger("454004252"));
        Point Z = new Point(new BigInteger("51512840"), new BigInteger("29904980"));
        Point A = new Point(new BigInteger("112404970"), new BigInteger("181640566"));
        Point B = new Point(new BigInteger("447214710"), new BigInteger("625708705"));

        ZeroKnowledgeProof zkp = new ZeroKnowledgeProof(X, R, Z, A, B, c, ec, E);

        // BigInteger t = zpk.generateT(new BigInteger("15"), new BigInteger("20"));
        // System.out.println(zpk.isValid(t) ? "True" : "False");

        ArrayList<BigInteger> t = new ArrayList<>();
        t.add(new BigInteger("248112110"));
        t.add(new BigInteger("248112111"));
        t.add(new BigInteger("248112112"));
        t.add(new BigInteger("248112113"));
        t.add(new BigInteger("248112114"));
        t.add(new BigInteger("248112115"));
        t.add(new BigInteger("248112116"));
        t.add(new BigInteger("248112117"));
        t.add(new BigInteger("248112118"));
        t.add(new BigInteger("248112119"));

        for (BigInteger i : t) {
            System.out.printf("t: %s is valid? %s\n", i, zkp.isValid(i) ? "True" : "False");
        }

        // BigInteger a = new BigInteger("2");
        // BigInteger b = new BigInteger("2");
        // BigInteger p = new BigInteger("17");

        // Point G = new Point(new BigInteger("5"), new BigInteger("1"));
        // Integer r = 5;
        // Integer x = 7;
        // Integer s = 13;
        // Integer c = 9;
        // Integer E = 19;
        // EllipticCurve ec = new EllipticCurve(a, b, p);
        // Point R = ec.multiplyPoint(G, r);
        // Point X = ec.multiplyPoint(G, x);
        // Point Z = ec.multiplyPoint(G, r * x);
        // Point A = ec.multiplyPoint(G, s);
        // Point B = ec.multiplyPoint(X, s);

        // System.out.printf("R: x: %s, y: %s\n", R.getX(), R.getY());
        // System.out.printf("X: x: %s, y: %s\n", X.getX(), X.getY());
        // System.out.printf("Z: x: %s, y: %s\n", Z.getX(), Z.getY());
        // System.out.printf("A: x: %s, y: %s\n", A.getX(), A.getY());
        // System.out.printf("B: x: %s, y: %s\n", B.getX(), B.getY());

        // Integer t = (s + c * r) % E;
        // System.out.println(t);

        // Point t1 = ec.multiplyPoint(G, t);
        // Point t2 = ec.sumPoints(ec.multiplyPoint(R, c), A);

        // System.out.printf("t1: x: %s, y: %s\n", t1.getX(), t1.getY());
        // System.out.printf("t2: x: %s, y: %s\n", t2.getX(), t2.getY());

        // Point p1 = new Point(new BigInteger("5"), new BigInteger("1"));
        // Point p2 = new Point(new BigInteger("5"), new BigInteger("1"));
        // for (int i = 0; i < 21; i++) {
        // p2 = ec.sumPoints(p1, p2);
        // System.out.printf(
        // "[%d] x: %s, y: %s\n",
        // i + 2,
        // p2.getX(),
        // p2.getY()
        // );
        // }

        // System.out.printf("x: %s, y: %s\n", p1.getX(), p1.getY());
        // Point p3 = ec.multiplyPoint(p1, 22);
        // System.out.printf("x: %s, y: %s\n", p3.getX(), p3.getY());
    }
}
