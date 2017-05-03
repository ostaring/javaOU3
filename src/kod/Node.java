package kod;
import kod.Position;
import java.util.*;

/**
 * Created by dv16osg on 2017-05-02.
 */
public class Node{

    private ArrayList<Node> neighbourList;
    private Hashtable<Integer,Event> eventTable;
    private Position nodePos;
    private Queue<Event> informationQueue;
    private int agentTimeTolive, requestTimeToLive;
    private float agentProbability;
    private Network theNetwork;
    public Node(){
        nodePos = new Position(0 ,0);
        neighbourList = new ArrayList<>();
        getNeighbours(neighbourList);
    }
    public Node(int xPos, int yPos, Network theNetwork){
        nodePos = new Position(xPos, yPos);
        neighbourList = new ArrayList<>();
        getNeighbours(neighbourList);
        this.theNetwork = theNetwork;
        informationQueue = new LinkedList<>();
        eventTable = new Hashtable<>();

    }
    public void detectEvent(int eventID, int time){

    }
    public Event getEvent(int eventID){
        return eventTable.get(eventID);
    }
    public Position getPosition(){
        return nodePos;
    }
    public void runQueue(){

    }
    public void addInformation(){

    }
    public void genereateQuery(){

    }
    public void generateAgent(){
        Random agentCreate = new Random();
        if(agentCreate.nextInt(2) == 1){
            Agent jamesBond = new Agent(1, 1, nodePos);
        }
    }
    public void updateNeighbours(){

    }

    /**
     * Adds neighbours to the list considering a given search distance.
     * The search distance is set when the network is created. The default
     * distance between the rows and cols in the network is set to 10.
     *  @param neighbourList list to fill.
     */
    public void addNeighboursToList(ArrayList neighbourList){
        int searchRadius = theNetwork.getSearchDistance();
        for(Position position : theNetwork.getTheNetwork().keySet()){
            for(){
                if(Math.sqrt(nodePos.getY()){
                    neighbourList.add()
                }

            }

        }


    }

    /**
     * Fills the list with the neighbours surrounding node.
     * max number of neighbours is 8 using this method.
      * @param neighbourList, list to fill.
     */
    public void getNeighbours(ArrayList neighbourList){
        if(nodePos.getPosToSouth() != null){
            this.neighbourList.add(theNetwork.getNode(nodePos.getPosToSouth()));
        }
        if(nodePos.getPosToEast() != null){
            this.neighbourList.add(theNetwork.getNode(nodePos.getPosToEast()));
        }
        if(nodePos.getPosToWest() != null){
            this.neighbourList.add(theNetwork.getNode(nodePos.getPosToWest()));
        }
        if(nodePos.getPosToNorth() != null){
            this.neighbourList.add(theNetwork.getNode(nodePos.getPosToNorth()));
        }
        if(nodePos.getPosToNorthEast() != null){
            this.neighbourList.add(theNetwork.getNode(nodePos.getPosToNorthEast()));
        }
        if(nodePos.getPosToNorthWest() != null){
            this.neighbourList.add(theNetwork.getNode(nodePos.getPosToNorthWest()));
        }
        if(nodePos.getPosToSouthEast() != null){
            this.neighbourList.add(theNetwork.getNode(nodePos.getPosToSouthEast()));
        }
        if(nodePos.getPosToSouthWest() != null){
            this.neighbourList.add(theNetwork.getNode(nodePos.getPosToSouthWest()));
        }
    }









}
