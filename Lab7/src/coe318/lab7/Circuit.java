package coe318.lab7;
import java.util.ArrayList;

/**
 *
 * @Anith Rajakumar
 */
public class Circuit {
    
    private static Circuit instance = null;
    public static Circuit getInstance() {
    if (instance == null) {
        instance = new Circuit();
    }
    return instance;
    }
    
    public static ArrayList<Component> components;
    public final ArrayList<Node> nodes;
    
    public Circuit() {
        this.components = new ArrayList<>();
        nodes = new ArrayList<>();
    }
    
    public int biggerNumber(int one, int two){
        if(one > two){
            return one;
        }
        return two;
    }
    
    public void addComponent(Component c){
        this.components.add(c);
    }
    
    public void addStrComp(String input){
        String[] ainput = input.split(" ");
        int noRequiredNodes = biggerNumber(Integer.parseInt(ainput[1]), 
                Integer.parseInt(ainput[2])) - (nodes.size()-1);
        if(biggerNumber(Integer.parseInt(ainput[1]),Integer.parseInt(ainput[2])) < nodes.size()){
            noRequiredNodes = 0;
        }
        for(int i = 1; i <= noRequiredNodes; i++){
            nodes.add(new Node());
        }
        
        if(ainput[0].equals("r")){
            new Resistor(Double.parseDouble(ainput[3]), nodes.get(Integer.parseInt(ainput[1])), nodes.get(Integer.parseInt(ainput[2])));
            
        }else if(ainput[0].equals("v")){
            new Voltage_Source(Double.parseDouble(ainput[3]), nodes.get(Integer.parseInt(ainput[1])), nodes.get(Integer.parseInt(ainput[2])));
        }
    }
    
    public void spiceDescription(){
        for(int i = 0; i < this.components.size(); i++){
            System.out.println(this.components.get(i).spiceDescription());
        }
        
    }
}
