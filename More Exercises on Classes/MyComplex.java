public class MyComplex {
    double real = 0.0, imag = 0.0;
    MyComplex(){}

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    @Override
    public String toString(){
        String real = String.valueOf(this.real);
        String imag = String.valueOf(this.imag);
        return '(' + real + '+' + imag + "i)";
    }
    boolean isReal(){
        if(imag == 0){
            return true;
        } else return false;
    }
    boolean isImaginary(){
        if(real == 0){
            return true;
        } else return false;
    }
     boolean equals(double real, double imag){
        if(this.imag == imag && this.imag == imag){
            return true;
        } else return false;
     }
     boolean equals(MyComplex another){
         if(this.real == another.real && this.imag == another.imag){
             return true;
         } else return false;
     }
     double magnitude(){
        return Math.sqrt(real*real + imag*imag);
     }
     MyComplex addInto(MyComplex right){
        this.real += right.real;
        this.imag += right.imag;
        return this;
     }

     MyComplex addNew(MyComplex right){
         return new MyComplex(right.real, right.imag);
     }
}
