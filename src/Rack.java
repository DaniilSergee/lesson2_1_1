public final class Rack extends Library{
    private int rackNumber;
    private EnumMaterial enumMaterial;
    private Content content;
    public Rack(int rackNumber, EnumMaterial enumMaterial, Content content,
                int floorsNumber, String address, String name, int employees){
        super(floorsNumber, address, name, employees);
        this.rackNumber = rackNumber;
        this.enumMaterial = enumMaterial;
        this.content=content;

    }
    public int getRackNumber() {
        return rackNumber;
    }
    public EnumMaterial getEnumMaterial() {
        return enumMaterial;
    }
    public Content getContent() {
        return content;
    }

    @Override
    public String getInfo1() {
        return super.getInfo1()+
                "\nRack number: " + rackNumber+
                "\nWas made of: " + enumMaterial+
                "\nGenre: " + content.getGenre()+
                "\nHeight: " + content.getHeight()+
                "\nLength: " + content.getLength()+
                "\nWidth: " + content.getWidth();
    }
}
