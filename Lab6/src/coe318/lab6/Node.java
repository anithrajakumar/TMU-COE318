package coe318.lab6;
/**
 *
 * @Anith Rajakumar
 */
public class Node {
    
    //static varibale to keep track of the id numbers
    private static int id_Counter = 0;
    //the currenr node's id 
    private int node_ID;
    
    //Constructor for node class
    public Node(){
        //Setting the id value to the id counter using post-increment 
        node_ID = id_Counter++;
    }
    
    @Override
    public String toString(){
        // adding quotes help convert the varaiable into a string
        return "" + this.node_ID;
    }
    
    
}
