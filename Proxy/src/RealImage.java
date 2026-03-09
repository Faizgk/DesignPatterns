public class RealImage implements Image{

    String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("Displaying " +fileName+ " from disk..");
    }

    @Override
    public String getFileName() {
        return fileName;
    }

    private void loadFromDisk(){
        //simulate loading from disk
        System.out.println("loading " +fileName+ " from disk..");
    }
}
