public interface Shape {
  public void drawShape();
}

class Rectangle implements Shape{
  @Override
  public void drawShape() {
    System.out.println("inside rectangle");
  } 
}

class Circle implements Shape{
  @Override
  public void drawShape() {
    System.out.println("inside circle");   
  } 
}

class Square implements Shape{
  @Override
  public void drawShape() {
    System.out.println("inside square");  
  } 
}

class ShapeFactory{
  public Shape getShape(String shapeType){
    if(shapeType == null){
      return null;
    }
    if(shapeType.equalsIgnoreCase("RECTANGLE")){
      return new Rectangle();
    }else if(shapeType.equalsIgnoreCase("CIRCLE")){
      return new Circle();
    }else if(shapeType.equalsIgnoreCase("SQUARE")){
      return new Square();
    }
    return null;
  }
}

class FactoryPatternDemo{
  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();
    Shape shape1 = shapeFactory.getShape("RECTANGLE");
    shape1.drawShape();
    Shape shape2 = shapeFactory.getShape("CIRCLE");
    shape2.drawShape();
    Shape shape3 = shapeFactory.getShape("SQUARE");
    shape3.drawShape();
  }
}
