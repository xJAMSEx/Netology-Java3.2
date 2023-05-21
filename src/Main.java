public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98.0;
        double height = 1.87;
        int BMI = service.calculate(weight, height);
        System.out.println(BMI);
    }
}
