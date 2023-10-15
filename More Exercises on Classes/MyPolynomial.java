public class MyPolynomial {
    double[] coeffs;
    MyPolynomial(double... coeffs){
        this.coeffs = coeffs;
    }
    int getDegree(){
        int deg = coeffs.length - 1;
        if (deg > 0 && coeffs[deg] == 0){
            deg--;
        }
        return deg;
    }

    double evaluate(double x){
        double ans = 0;
        for(int i = 0; i < coeffs.length ; i++){
            ans += coeffs[i]*(Math.pow(x, i));
        }
        return ans;
    }
    // test
    public MyPolynomial add(MyPolynomial another) {
        int size = coeffs.length > another.getDegree() + 1 ? coeffs.length : another.getDegree() + 1;

        double[] ans = new double[size];

        for (int degree = 0; degree < ans.length; degree++) {
            double add = 0;
            if (degree <= this.getDegree()) {
                add += coeffs[degree];
            }
            if (degree <= another.getDegree()) {
                add += another.coeffs[degree];
            }
            ans[degree] = add;
        }

        return new MyPolynomial(ans);
    }

    public MyPolynomial multiply(MyPolynomial another) {
        int size = getDegree() + another.getDegree() + 1;
        double[] ans = new double[size];

        for (int deg1 = 0; deg1 < coeffs.length; deg1++) {
            for (int deg2 = 0; deg2 < another.coeffs.length; deg2++) {
                double num = coeffs[deg1] * another.coeffs[deg2];
                ans[deg1 + deg2] += num;
            }
        }

        return new MyPolynomial(ans);
    }

    @Override
    public String toString() {
        String coeffsString = "";
        for (int degree = coeffs.length - 1; degree >= 0; degree--) {
            if (coeffs[degree] == 0) {
                continue;
            }
            if (degree == coeffs.length - 1) {
                coeffsString += Math.floor(coeffs[degree] * 100) / 100;
            }else{
                coeffsString += (coeffs[degree] > 0 ? " + " : " - ");
                coeffsString += Math.floor(coeffs[degree] * 100) / 100;
            }

            if (degree >= 2) {
                coeffsString += "x^" + degree;
            } else if (degree == 1) {
                coeffsString += "x";
            }
        }
        return coeffsString;
    }

}
