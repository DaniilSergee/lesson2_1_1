public class Main {
    public static void main(String[] args) {
        Content adventure = new Content("Adventure", 50,2, 8);
        Library objectA = new Library(7, "Строителей 2а", "имени Ленина", 35);
        Rack objectB = new Rack(526, EnumMaterial.WOOD, adventure,
                objectA.getFloorsNumber(), objectA.getAddress(), objectA.getName(), objectA.getEmployees());
        Rack objectC = new Rack(524, EnumMaterial.PLASTIC, adventure,
                objectA.getFloorsNumber(), objectA.getAddress(), objectA.getName(), objectA.getEmployees());
        System.out.println(objectA.getInfo1());
        System.out.println("-------------------");
        System.out.println(objectA.getInfo2());
        System.out.println("-------------------");
        System.out.println(objectB.getInfo1());
        System.out.println("-------------------");
        System.out.println(objectC.getInfo1());

    }
}