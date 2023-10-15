public class MyTriangle {
    MyPoint v1,v2,v3;

    public MyTriangle(int x1, int y1 , int x2, int y2 ,int x3, int y3 ){
        this.v1.setXY(x1,y1);
        this.v2.setXY(x2,y2);
        this.v3.setXY(x3,y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    @Override
    public String toString(){
        return "MyTriangle[v1="+this.v1+",v2="+this.v2+",v3="+this.v3+"]";
    }
    double getPerimeter(){
        return v1.distance(v2)+ v1.distance(v3) + v2.distance(v3);
    }
    String getType(){
        double a,b,c;
        a = v1.distance(v2);
        b = v2.distance(v3);
        c = v3.distance(v1);
        if( a == b && b == c && c == a ){
            return "Equilateral";
        }else if(a == b || b == c || c == a){
            return "Isosceles";
        }else return "Scalene";
    }
}
