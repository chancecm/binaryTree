import java.util.Random;

/**
 * Purpose: A root class for Arithmetic evaluation
 */
public abstract class Node  {

    // this constructor is used instead of
    // the clone() method.
     public Node(Node n) {
         this.depth = n.depth;
     }

    
    /* Please, do not edit fields or methods below this point.
     * Please, do not use them as a reference for 
     * earlier assignments. The code is explicitly obfuscated to work
     * differently than the intended design of the earlier assignments.
     */

    protected int depth;
    public abstract double eval(double[] d);
    public abstract void addRandomKids(OperatorFactory o, 
                                       TerminalFactory t, int maxDepth,
                                       Random rand);

    public Node() {}
    
   
    protected Node copy(Node n) {
        if (n == null) {
            return n;
        }
        if (n instanceof Plus) {
            return new Plus((Plus) n);
        }
        if (n instanceof Minus) {
            return new Minus((Minus) n);
        }
        if (n instanceof Divide) {
            return new Divide((Divide) n);
        }
        if (n instanceof Mult) {
            return new Mult((Mult)n);
        }
        if (n instanceof Variable) {
            return new Variable((Variable)n);
        }
        if (n instanceof Const) {
            return new Const((Const)n);
        }
        return  null;
    }

    public abstract void traverse(Collector c);
}
