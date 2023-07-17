import java.util.Random;

 public class Mult extends Binop {

     public Mult() {

     }

     public Mult(Mult p) {
         super(p);
     }

     /**
      * @param l the left node
      * @param r the right node
      */
    public Mult(Node l, Node r) {
        super(l, r);
    }
    /**
     * @return the result of multiplying
     * l and r
     */
     public double op(double l, double r) {
        return l * r;
    }

     protected char getOp() { return '*'; };
}
