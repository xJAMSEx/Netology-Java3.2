public class BmiService {
    public BmiService() {
    }

    public int calculate(double weight, double height) {
        double BMI = weight / (height * height);
        return (int)BMI;
    }
}

