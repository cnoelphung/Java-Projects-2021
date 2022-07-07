package chapter07;
public class carclass {
    
    private int modelYear;
    private String make;
    private int speed;
    
    public carclass(int modelYear, String make){
        this.modelYear = modelYear;
        this.make = make;
        this.speed = 0;
    }
    
    public void accelerate(){
        speed += 5;
    }
    
    public void brake(){
        speed -= 5;
    }
    
    public int getmodelYear(){ return modelYear; }
    public String getMake(){ return make; }
    public int getSpeed(){ return speed; }
    
}
