package week3_array.Polynomial;

class Polynomial {
    private int degree;
    private int number;

    public Polynomial(int number, int degree) {
        this.degree = degree;
        this.number = number;
    }

    public int getDegree() {
        return degree;
    }

    public int getNumber() {
        return number;
    }
}
