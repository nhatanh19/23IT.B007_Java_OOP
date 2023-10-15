public class MyCircle {
    MyPoint center = new MyPoint(0,0);
    int radius = 1;

    MyCircle(){}
    MyCircle(int x, int y, int radius){
        center.setXY(x,y);
        this.radius = radius;
    }

    MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }
    void setCenterX(int x){
        center.setX(x);
    }
    int getCenterX(){
        return center.getX();
    }
    void setCenterY(int x){
        center.setX(x);
    }
    int getCenterY(){
        return center.getY();
    }
    int[] getCenterXY(){
        return center.getXY();
    }
    void setCenterXY(int x, int y){
        center.setXY(x,y);
    }
    @Override
    public String toString(){
        return "MyCircle[radius="+this.radius+",center="+center+"]";
    }
    double getArea(){
        return radius*radius*3.14;
    }
    double getCircumference(){
        return radius*2*3.14;
    }
    double distance(MyCircle another){
        return center.distance(another.center);
    }
}
