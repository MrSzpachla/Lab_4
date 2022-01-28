public class Kwadrat extends Figura {
    private double a;
    @Override
    double pole(double a) {
        this.a = a;
        return a*a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    double obwod(double a) {
        return a+a+a+a;
    }
}
