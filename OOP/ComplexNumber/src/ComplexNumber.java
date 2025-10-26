public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(ComplexNumber b) {
        add(b.real, b.imaginary);
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;

    }

    public void subtract(ComplexNumber b) {
        subtract(b.real, b.imaginary);
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;

    }
}
