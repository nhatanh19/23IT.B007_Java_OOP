public class MyPoint {
    private int x= 0, y = 0;
    MyPoint(){};
    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    int[] getXY(){
        int[] valueXY = new int[2];
        valueXY[0] = this.x;
        valueXY[1] = this.y;
        return valueXY;
    }
    void setXY(int x, int y){
        this.x= x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "("+ x +',' + y +")";
    }
    double distance(int x, int y){
        return Math.sqrt(Math.pow(this.x-x, 2) + Math.pow(this.y-y, 2));
    }
    double distance(MyPoint another){
        return Math.sqrt(Math.pow(this.x- another.getX(), 2) + Math.pow(this.y-another.getY(), 2));
    }
    double distance(){
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

}
