public class MyComplexCal extends MyComplex {
    MyComplex complex, complex1;

    public MyComplexCal(MyComplex complex, MyComplex complex1) {
        this.complex = complex;
        this.complex1 = complex1;
    }
    boolean equals(){
        return (complex.real == complex1.real && complex.imag == complex1.imag);
    }
    MyComplex add(){
        // add to complex
        complex.real += complex1.real;
        complex.imag += complex1.imag;
        return this;
    }
    MyComplex addNew(){
        complex.real += complex1.real;
        complex.imag += complex1.imag;
        return new MyComplex(complex.real, complex.imag);
    }
    MyComplex subtract(){
        complex.real -= complex1.real;
        complex.imag -= complex1.imag;
        return this;
    }
    MyComplex subtractNew(){
        complex.real -= complex1.real;
        complex.imag -= complex1.imag;
        return new MyComplex(complex.real, complex.imag);
    }
    MyComplex multiply(){
        double a = complex.real,
                b = complex.imag,
                c = complex1.real,
                d = complex1.imag;
        complex.real = a*c - b*d;
        complex.imag = a*d + b*c;
        return this;
    }
    MyComplex devide(){
        double a = complex.real,
        b = complex.imag,
        c = complex1.real,
        d = complex1.imag;
        complex.real = (a*c + b*d) / (c*c + d*d);
        complex.imag = (b*c - a*d)/(c*c + d*d);
        return this;
    }
    MyComplex conjugate(MyComplex data){
        data.imag *= -1;
        return this;
    }

}
