package week_5;


/**
 *
 * @author Rob
 */
public class HotelOccupancyC 
{
    int floors;          // Number of floors
    int totalRooms;      // Total number of rooms
    int rooms;           //Rooms on a floor
    private int totalOccupied;   // Total rooms occupied
    private int occupied;        // Occupied rooms on a floor
    private int vacantRooms;     // Number of vacant rooms
    double occupancy;    // Occupancy rate
    
    public void setFloors(int floors)
    {
        this.floors = floors;
    }
    public void setTotalRooms(int totalRooms)
    {
        this.totalRooms = totalRooms;
    }
    public void setRooms(int rooms)
    {
        this.rooms = rooms;
    }
    public void setTotalOccupied(int totalOccupied)
    {
        this.totalOccupied = totalOccupied;
    }
    public void setOccupied(int occupied)
    {
        this.occupied = occupied;
    }
    public void setVacantRooms(int vacantRooms)
    {
        this.vacantRooms = vacantRooms;
    }
    public void setOccupancy(double occupancy)
    {
        this.occupancy = occupancy;
    }
    public int getFloors()
    {
        return floors;
    }
    public int getTotalRooms()
    {
        return totalRooms;
    }
    public int getRooms()
    {
        return rooms;
    }
    public int getTotalOccupied()
    {
        return totalOccupied;
    }
    public int getOccupied()
    {
        return occupied;
    }
    public int getVacantRooms()
    {
        return vacantRooms;
    }
    public double getOccupancy()
    {
        return occupancy;
    }
}
