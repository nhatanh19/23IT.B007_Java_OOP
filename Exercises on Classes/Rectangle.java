public class Rectangle {
    float length, width;

    Rectangle(){
        width = 1.0f;
        length = 1.0f;
    }
    Rectangle(float length , float width){
        this.length = length;
        this.width = width;
    }
    float getLength(){
        return length;
    }
    void setLength(float length){this.length = length;}

    float getWidth(){
        return width;
    }
    void setWidth(float width){ this.width = width;}

    double getArea(){
        return width*length;
    }
    double getPerimeter(){
        return (width + length)*2;
    }
    @Override
    public String toString(){
        return "Rectangle[length="+length+",width="+width+"]";
    }
}
