package coe318.lab6;
import java.util.ArrayList;

/**
 *
 * @Anith Rajakumar
 */
public class Circuit {
    
    // Array list to hold the resistors of the circuit
    ArrayList<Resistor> resistors = new ArrayList<Resistor>();
    
    //creating an instance of the circuit class 
    private static Circuit instance = null;
    
    //method in order to get access to the class
    public static Circuit getInstance() {
        if (instance == null) {
            instance = new Circuit();
        }
        return instance;
    }
    
    private Circuit(){}
    
    public void add(Resistor r){
        //adding the resistor onto the array list
        resistors.add(r);
    }
    
    @Override
    public String toString(){
        
        String tempString = "";
        
        for(int i = 0; i < resistors.size(); i++){
            tempString += resistors.get(i) + "\n";
        }

        return tempString;
    }
}
