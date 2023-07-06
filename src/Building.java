public class Building {
    private int floorsNumber;
    private String address;
    public Building(int floorsNumber, String address){
        this.floorsNumber=floorsNumber;
        this.address=address;
    }

    public int getFloorsNumber() {
        return floorsNumber;
    }

    public String getAddress() {
        return address;
    }
}
