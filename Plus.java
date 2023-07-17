import java.util.Random;

 public class Plus extends Binop {

     public Plus() {

     }

     public Plus(Plus p) {
         super(p);
     }
     /**
      * @param l the left node
      * @param r the right node
      */
    public Plus(Node l, Node r) {
        super(l, r);
    }
    /**
     * @return the result of adding
     * l + r
     */
     public double op(double l, double r) {
        return l + r;
    }

     protected char getOp() { return '+'; };
}
