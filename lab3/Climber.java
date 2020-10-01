/**
 * A climber is a person who ascends vertical rocks.
 * The difference between a climber's armspan and their height is called
 * their "apeIndex".
 * @author Orcun Tasdemir
 * @version Sep 2020
 */
public class Climber
{

    private String name;  // the climber's name
    private int apeIndex;  // the climber's ape index
    
    /**
     * Constructor for an empty Climber.
     */
    public Climber()
    {
        this.name = "";
    }

    /**
     * Construct a climber with the given attributes.
     * 
     * @param  namep the climber's name
     * @param  apeIndexp the climber's apeIndex
     */
    public Climber(String namep, int apeIndexp)
    {
        this.name = namep;
        this.apeIndex = apeIndexp;
    }
    
    /**
     * Accessor to climber's name.
     * @return String the name of this climber
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Accessor to climber's apeIndex.
     * @return int the apeIndex of this climber
     */
    public int getApeIndex()
    {
        return apeIndex;
    }
    
    /** Return whether or not this climber has a long reach.
     * @return true if this climber's apeIndex > 2, false otherwise.
     */
    public boolean hasLongReach()
    {
        if(apeIndex > 2){
        return true;
        }
        return false;
    }
    
    /** Return whether or not this climber is empty.
     * @return true if this climber has a name of length zero.
     */
    public boolean isEmpty()
    {
        if(name == ""){
        return true;
        }
        return false;        
    }
    
    /** Determine if two climber's are the same.
     * @param other the climber to whom this climber is compared
     * @return true if climber's are equal
     */
    public boolean equals(Object other)
    {
        if (other instanceof Climber)
        {
            Climber candidate = (Climber) other;
            return this.name == candidate.name; 
        }
        return false;
    }
}