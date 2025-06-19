package handson02_ImplementingFactoryMethodPattern;
public class Main1 {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape s1 = factory.getShape("CIRCLE");
        s1.draw(); 

        Shape s2 = factory.getShape("RECTANGLE");
        s2.draw();

        Shape s3 = factory.getShape("SQUARE");
        s3.draw(); 
    }
}