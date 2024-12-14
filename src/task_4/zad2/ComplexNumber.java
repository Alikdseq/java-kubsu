package task_4.zad2;

class ComplexNumber {
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

    public boolean equals(ComplexNumber other) {
        return this.real == other.real && this.imaginary == other.imaginary;
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}


