package chapter07;

public class circleclass {


private double radius;
private final double PI = 3.14159;

public circleclass(double radius){
    this.radius = radius;
}

public circleclass(){
    this.radius = 0;
}

public double getArea(){
    return PI * radius * radius;
}

public double getDiameter(){
    return radius * 2;
}

public double getCircumference(){
    return 2 * PI * radius;
}

// getters and setters
public double getRadius(){
    return radius;
}

public void setRadius(double radius){
    this.radius = radius;
}

}
