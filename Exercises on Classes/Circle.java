public class Circle {
    double radius ;
    String color;

    Circle(){
        radius = 1.0;
        color = "red";
    }
    Circle(double r){
        this.radius = r;
    }
    Circle(double r, String color){
        this.radius = r;
        this.color = color;
    }
    double getRadius(){
        return radius;
    }
    String getColor(){ return color;}
    void setRadius(double radius){ this.radius = radius;}

    void setColor(String color){ this.color = color;}
    double getArea(){
        return radius*radius*Math.PI;
    }
    double getCircumference(){
        return Math.PI*2*radius;
    }
    @Override
    public String toString(){
        return "Circle[radius="+radius+",color="+color+"]";
    }
}
