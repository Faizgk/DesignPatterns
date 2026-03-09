public class ProxyImage implements Image{

    RealImage realImage;
    String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
        System.out.println("loaded image (not really !. but I know what image to load when you actually want to display it)");
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    public void display() {
        if(realImage == null) realImage = new RealImage(fileName);
        realImage.display();

    }
}
