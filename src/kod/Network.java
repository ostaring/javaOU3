package kod;
import java.util.HashMap;
/**
 * Created by dv16osg on 2017-05-02.
 */
public class Network {
    private HashMap<Position, Node> theNetwork;
    private int distanceRowCol, searchDistance, xSize, ySize;

    public Network(){
        searchDistance = 15;
        distanceRowCol = 10;
        xSize = 50;
        ySize = 50;
        for(int r = 0; r < ySize; r++){
            for(int c  = 0; c < xSize; c++){
                Node newNode = new Node(r, c, this);
                theNetwork.put(newNode.getPosition(), newNode);
            }
        }
    }
    public Network(int xSize, int ySize, int searchDistance){
        this.searchDistance = searchDistance;
        distanceRowCol = 10;
        for(int r = 0; r < ySize; r++){
            for(int c  = 0; c < xSize; c++){
                Node newNode = new Node(r, c, this);
                theNetwork.put(newNode.getPosition(), newNode);
            }
        }

    }
    public Node getNode(Position pos) {
        return theNetwork.get(pos);
    }
    public int getDistanceRowCol(){
        return distanceRowCol;
    }

    public int getSearchDistance() {
        return searchDistance;
    }

    public HashMap<Position, Node> getTheNetwork() {
        return theNetwork;
    }
}
