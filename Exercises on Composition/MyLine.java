public class MyLine {
    private MyPoint begin, end;

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }
    MyLine(int x1, int y1, int x2, int y2){
        begin.setX(x1);
        begin.setY(y1);
        end.setX(x2);
        end.setY(y2);
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }
    int getBeginX(){
        return begin.getX();
    }
    void setBeginX(int x){
        begin.setX(x);
    }
    void setBeginY(int y){
        begin.setY(y);
    }
    int getBeginY(){
        return begin.getY();
    }
    int getEndX(){
        return end.getX();
    }
    void setEndX(int x){
        end.setX(x);
    }
    void setEndY(int y){
        end.setY(y);
    }
    int getEndY(){
        return end.getY();
    }
    int[] getBeginXY(){
        int data[] = {begin.getX(), begin.getY()};
        return data;
    }
    void setBeginXY(int x, int y){
        begin.setXY(x,y);
    }
    int[] getEndXY(){
        return end.getXY();
    }
    void setEndXY(int x, int y){
        end.setXY(x,y);
    }
    double getLength(){
        return this.begin.distance(this.end);
    }
    double getGradient(){
        return Math.atan2(this.end.getY()-this.begin.getY(), this.end.getX()-this.begin.getX());
    }
    @Override
    public String toString(){
        return "MyLine[begin=("+begin+"),end="+end+"]";
    }
}
