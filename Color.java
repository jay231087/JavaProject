public interface Color {
  public void fillColor();
}

class Red implements Color{
  @Override
  public void fillColor() {
    System.out.println("fill red color");
  }
}

class White implements Color{
  @Override
  public void fillColor() {
    System.out.println("fill white color");
  }
}

class Black implements Color{
  @Override
  public void fillColor() {
    System.out.println("fill black color");
  }
}

abstract class AbstractFactory {
  abstract Color getColor(String color);
  abstract Shape getShape(String shape) ;
}

class ShapeFactories extends AbstractFactory {
  
  @Override
  public Shape getShape(String shapeType){
  
     if(shapeType == null){
        return null;
     }   
     
     if(shapeType.equalsIgnoreCase("CIRCLE")){
        return new Circle();
        
     }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
        return new Rectangle();
        
     }else if(shapeType.equalsIgnoreCase("SQUARE")){
        return new Square();
     }
     
     return null;
  }
  
  @Override
  Color getColor(String color) {
     return null;
  }
}

class ColorFactory extends AbstractFactory {
  
  @Override
  public Shape getShape(String shapeType){
     return null;
  }
  
  @Override
  Color getColor(String color) {
  
     if(color == null){
        return null;
     }   
     
     if(color.equalsIgnoreCase("RED")){
        return new Red();
        
     }else if(color.equalsIgnoreCase("WHITE")){
        return new White();
        
     }else if(color.equalsIgnoreCase("BLACK")){
        return new Black();
     }
     
     return null;
  }
}

class FactoryProducer {
  public static AbstractFactory getFactory(String choice){  
     if(choice.equalsIgnoreCase("SHAPE")){
        return new ShapeFactories();
        
     }else if(choice.equalsIgnoreCase("COLOR")){
        return new ColorFactory();
     }     
     return null;
  }
}

class AbstractFactoryPatternDemo {
  public static void main(String[] args) {

     //get shape factory
     AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

     //get an object of Shape Circle
     Shape shape1 = shapeFactory.getShape("CIRCLE");

     //call draw method of Shape Circle
     shape1.drawShape();

     //get an object of Shape Rectangle
     Shape shape2 = shapeFactory.getShape("RECTANGLE");

     //call draw method of Shape Rectangle
     shape2.drawShape();
     
     //get an object of Shape Square 
     Shape shape3 = shapeFactory.getShape("SQUARE");

     //call draw method of Shape Square
     shape3.drawShape();

     //get color factory
     AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

     //get an object of Color Red
     Color color1 = colorFactory.getColor("RED");

     //call fill method of Red
     color1.fillColor();

     //get an object of Color Green
     Color color2 = colorFactory.getColor("WHITE");

     //call fill method of Green
     color2.fillColor();

     //get an object of Color Blue
     Color color3 = colorFactory.getColor("BLACK");

     //call fill method of Color Blue
     color3.fillColor();
  }
}
