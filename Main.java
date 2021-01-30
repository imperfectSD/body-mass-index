public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 70.5F;
        float height = 1.8F;
        float bodyMassIndex = (float) service.calculate(weight, height);
        System.out.println(bodyMassIndex);
    }
}