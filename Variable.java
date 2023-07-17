import java.util.Random;
/**
 * Purpose: A leaf class for Arithmetic evaluation
 *          representing a Variable at an index
 */
public class Variable extends Node {


    /** the constant value */
    private int v1;
    private int v2;
    private int v3;
    /**
     * @param d the value to set the constant to.
     */
    public Variable(int i) {
        init(i);
    }

    private void init(int j) {
        v1 = j;
        v3 = v1;
        v2 = v3;
    }

    /**
     * @param v the value to set the constant to.
     */
    public Variable(Variable v) {
        super(v);
        init(v.v1);
    }

    /**
     * @return the value of the constant.
     */
    public double eval(double[] d) {
        return d[v2];
    }

    public String toString() {
        return "X" + v3;
    }


    public void addRandomKids(OperatorFactory o, 
                              TerminalFactory t, int maxDepth, Random rand) {   
        
        
    }
    public void traverse(Collector c){

    }
}
