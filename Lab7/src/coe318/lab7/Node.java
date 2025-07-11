package coe318.lab7;
/**
 *
 * @Anith Rajakumar
 */
public class Node {
    static int nextid = 0;
    int id;
    
    public Node(){
        this.id = nextid;
        nextid++;
        
    }
    public int getNode(){
        return id;
    }
    
    @Override
    public String toString(){
       return String.valueOf(id); 
    }
}

