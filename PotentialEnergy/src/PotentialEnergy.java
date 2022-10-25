public class PotentialEnergy {
    private
    static double g = 9.81;
    double h;
    double m;

    public static double getG() {
        return g;
    }

    public static void setG(double g) {
        PotentialEnergy.g = g;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

    public PotentialEnergy(double h, double m) {
        this.h = h;
        this.m = m;
    }

    public PotentialEnergy() {
        this.h = 10.0;
        this.m = 50.0;
    }

    public double findPotentialEnergy() {
        return m*g*h;
    }

    public void printInformation() {
        System.out.println("Ускорение свободного падения: " + g + " м/с^2. Масса тела: " + m + " кг. Высота: " + h + " м. Потенциальная энергия: " + findPotentialEnergy() + " Дж.");
    }

}
