public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // Creating multiple similar objects is inefficient!
        GraphicElement button1 = new GraphicElement("Rectangle", "Blue", 10, 20);
        GraphicElement button2 = button1.clone(); 
        button2.setX(40);
        button2.setY(60);
        // We want button2 to be just like button1 but at a different position.

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
    }
}