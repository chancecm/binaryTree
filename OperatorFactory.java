import java.util.Random;

public class OperatorFactory {

    public OperatorFactory(Node[] ops) {
        NodeFactory.setOps(ops);
    }

    public Node getOperator(Random rand) {
        return NodeFactory.getOp(rand);
    }
    
}
