public class Ball {
    float x, y, xDelta, yDelta;
    int radius;

    public Ball(float x, float y, int radius, float xDelta, float yDElta) {
        this.x = x;
        this.y = y;
        this.xDelta = xDelta;
        this.yDelta = yDElta;
        this.radius = radius;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setYDelta(float yDElta) {
        this.yDelta = yDElta;
    }
    public void move(){
        this.x += this.xDelta;
        this.y += this.yDelta;
    }
    public void reflectHorizontal(){
        this.xDelta *= -1;
    }
    public void reflectVertical(){
        this.yDelta *= -1;
    }
    @Override
    public String toString(){
        return "Ball[("+x+','+y+"),speed=("+this.xDelta+','+this.yDelta+")]";
    }
}
