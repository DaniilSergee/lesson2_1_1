public class Library extends Building{
    private String name;
    private int employees;
    public Library(int floorsNumber, String address, String name, int employees) {
        super(floorsNumber, address);
        this.name = name;
        this.employees = employees;
    }
    public String getName() {
        return name;
    }
    public int getEmployees() {return employees;}
    public String getInfo1(){
        return "Library name: "+ name+
                "\nLibrary address: " + getAddress()+
                "\nNumber of employees: " + employees+
                "\nLibrary floors number: " + getFloorsNumber();
    }
    public final String getInfo2(){
        return "Library name: "+ name+
                "\nLibrary address: " + getAddress();
    }
}
