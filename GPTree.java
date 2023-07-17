import java.util.ArrayList;
import java.util.Random;

public class GPTree implements Collector{
    private Node root;
    private ArrayList<Binop> crossNodes;
    public void collect(Node node){
        if(node instanceof Binop){
            crossNodes.add((Binop) node);
        }
    }
    public void traverse(){
        crossNodes = new ArrayList<Binop>();
        root.traverse(this);
    }
    public String getCrossNodes(){
        StringBuilder string = new StringBuilder();
        int lastIndex = crossNodes.size()-1;
        for(int i = 0; i < lastIndex; ++i){
            Binop binop = crossNodes.get(i);
            string.append(binop.toString());
            string.append(";");
        }
        string.append(crossNodes.get(lastIndex));
        return string.toString();
    }
    public void crossover(GPTree tree, Random rand){
        this.traverse();
        tree.traverse();
        int thisPoint = rand.nextInt(this.crossNodes.size());
        int treePoint = rand.nextInt(tree.crossNodes.size());
        boolean left = rand.nextBoolean();
        Binop thisTrunk = crossNodes.get(thisPoint);
        Binop treeTrunk = tree.crossNodes.get(treePoint);
        if(left) {
            Node thisBranch = thisTrunk.lChild;
            Node treeBranch = treeTrunk.lChild;
            thisTrunk.lChild = treeBranch;
            treeTrunk.lChild = thisBranch;
        } else {
            Node thisBranch = thisTrunk.rChild;
            Node treeBranch = treeTrunk.rChild;
            thisTrunk.rChild = treeBranch;
            treeTrunk.rChild = thisBranch;
        }
    }
    GPTree() {
        root = null;
    }
    GPTree(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand){
        root = o.getOperator(rand);
        root.addRandomKids(o, t, maxDepth, rand);
    }
    public String toString(){
        return root.toString();
    }
    public double eval(double[] data){
        return root.eval(data);
    }
}
