package coe318.lab6;
/**
 *
 * @Antih Rajakumar
 */
public class Resistor {
    
    // Instance Variables
    private double resistance_Value;
    private int resistor_ID;
    Node n1, n2;
    
    // Static variable to be used in multiple resistors
    private static int id_Counter = 1;
    
    //contructor for resistor class
    public Resistor(double resistance, Node node1, Node node2){
        if(resistance < 0){
            throw new IllegalArgumentException("Resistance can not be negative");
        } 
        //setting variables with given values 
        this.resistance_Value = resistance;
        
            
        if(node1 == null || node2 == null){
            throw new IllegalArgumentException("Node can not be null");
        }
        //setting the nodes 
        this.n1 = node1;
        this.n2 = node2;

        //setting the resistor id based on the id counter
        resistor_ID = id_Counter++;
    }
    
    public Node[] getNodes(){
        //Creating the array to hold both nodes
        Node[] nodes = new Node[2];
        //adding node 1
        nodes[1] = this.n1;
        //adding node 2
        nodes[2] = this.n2;
        //returning the list of nodes
        return nodes;
    }
    
    @Override
    public String toString(){
        // adding quotes help convert the varaiable into a string
        return "R" +  this.resistor_ID + " " 
                + this.n1 + " " + this.n2 + " " + this.resistance_Value;
    }
}
