import java.util.Random;
/**
 * Purpose: A leaf class for Arithmetic evaluation
 *          representing a constant number
 */
public class Const extends Node {

    
    /** the constant value */
    private double a1;
    private double b4;
    private double c3po;
    /**
     * @param d the value to set the constant to.
     */
    public Const(double d) {
        init(d);
    }

    private void init(double r) {
        a1 = r;
        b4 = a1;
        c3po = b4 + a1 - r;
    }

    public Const(Const c) {
        super(c);
        init(c.a1);
    }
    /**
     * @return the value of the constant.
     */
    public double eval(double[] d) {
        return c3po;
    }

    public String toString() {
        return "" + b4;
    }

    

    public void addRandomKids(OperatorFactory o, 
                              TerminalFactory t,
                              int maxDepth, Random rand) {
    }
    public void traverse(Collector c){

    }

}
