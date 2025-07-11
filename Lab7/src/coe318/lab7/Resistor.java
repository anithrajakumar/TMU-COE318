package coe318.lab7;
/**
 *
 * @Antih Rajakumar
 */
public class Resistor extends Component {
    double resistance;
    Node n1;
    Node n2;
    static int nextid = 1;
    int id;
    
    public Resistor(double resistance, Node node1, Node node2){
        if(resistance < 0){
            throw new IllegalArgumentException("resistance cannot be negative");
        }
        if(node1 == null || node2 == null){
            throw new IllegalArgumentException("nodes can not be null");
        }
        if(node1 == node2){
            throw new IllegalArgumentException("nodes can not be the same");
        }
        this.resistance = resistance;
        this.n1 = node1;
        this.n2 = node2;
        this.id = nextid;
        nextid++;
        
        Circuit cir = Circuit.getInstance();
        cir.addComponent(this);
    }
    
    public Node[] getNodes(){
        Node[] nodes = new Node[2];
        nodes[0] = this.n1;
        nodes[1] = this.n2;
        
        return nodes;
    }
    
    public String spiceDescription(){
       return ("R" + this.id + " " + this.n1 + " " +
                this.n2 + " " + this.resistance + " ");
    }
    
}

