package kod;

/**
 * Created by dv16osg on 2017-05-02.
 */
public class Event {
    public int eventID;
    private int timeStep;
    private Position eventPos;
hjhjhejrherjhejrhejrhe
    public Event(int eventID){
        this.eventID = eventID;
    }
    public int getTime(){
        return timeStep;
    }
    public Position getPos(){
        return eventPos;
    }
    public int getId(){
        return eventID;
    }
}
