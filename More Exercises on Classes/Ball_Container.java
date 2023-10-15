class Container{
    int x1,x2,y1,y2;
    Container(int x, int y, int width, int height){
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width - 1;
        this.y2 = y + height -1;
    }
    int getWidth(){
        return this.x2 - this.x1 +1;
    }
    int getHeight(){
        return this.y2 - this.y1 +1;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    boolean collides(Ball_Container ball){
        if (ball.getX() - ball.getRadius() <= this.x1 || ball.getX() - ball.getRadius() >= this.x2) {
            ball.reflectHorizontal();
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Container[("+this.x1 +','+this.y1 +"),("+this.x2 +','+this.y2 +")]";
    }
}

public class Ball_Container {
    float x,y;
    int radius;
    float xDenta, yDenta;

    public Ball_Container(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        double dir = Math.toRadians(direction);
        this.xDenta = (float) (speed * Math.cos(dir));
        this.yDenta = (float) (-1*speed*Math.sin(dir));
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDenta() {
        return xDenta;
    }

    public void setxDenta(float xDenta) {
        this.xDenta = xDenta;
    }

    public float getyDenta() {
        return yDenta;
    }

    public void setyDenta(float yDenta) {
        this.yDenta = yDenta;
    }
    void move(){
        this.x += xDenta;
        this.y += yDenta;
    }
    void reflectHorizontal(){
        this.xDenta *=-1;
    }

    void reflectVertical(){
        this.yDenta *= -1;
    }
    @Override
    public String toString(){
        return "Ball[("+this.x +',' + this.y+"),speed=("+this.xDenta+','+this.yDenta+")]";
    }

}
