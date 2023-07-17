import java.util.Random;

 public class Minus extends Binop {

     public Minus() {

     }

     public Minus(Minus p) {
         super(p);
     }

     /**
      * @param l the left node
      * @param r the right node
      */
    public Minus(Node l, Node r) {
        super(l, r);
    }
    /**
     * @return the result of subtracting
     * l and r
     */
     public double op(double l, double r) {
        return l - r;
    }

     protected char getOp() { return '-'; };
}
