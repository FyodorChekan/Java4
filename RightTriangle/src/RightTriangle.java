public class RightTriangle {
    private
    double cathet1;
    double cathet2;
    double hypotenuse;

    public double getCathet1() {
        return cathet1;
    }

    public void setCathet1(int cathet1) {
        this.cathet1 = cathet1;
    }

    public double getCathet2() {
        return cathet2;
    }

    public void setCathet2(int cathet2) {
        this.cathet2 = cathet2;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    public double findHypotenuse(double cathet1, double cathet2) {
        return Math.sqrt(Math.pow(cathet1, 2) + Math.pow(cathet2, 2));
    }

    public RightTriangle(double cathet1, double cathet2) {
        this.cathet1 = cathet1;
        this.cathet2 = cathet2;
        this.hypotenuse = findHypotenuse(cathet1, cathet2);
    }

    public void printTriangle() {
        System.out.println("Длина первого катета: " + cathet1 + ". Длина второго катета: " + cathet2 + ". Длина гипотенузы: " + hypotenuse);
    }

}
