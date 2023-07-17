import java.util.Random;

 public class Divide extends Binop {

     public Divide() {

     }

     public Divide(Divide p) {
         super(p);
     }

     /**
      * @param l the left node
      * @param r the right node
      */
    public Divide(Node l, Node r) {
        super(l, r);
    }
    /**
     * @return the result of dividing
     * l and r
     */
     public double op(double l, double r) {
        if(r < 0.0001){
            return 1.0;
        }
         return l / r;
    }

     protected char getOp() { return '/'; };
}
