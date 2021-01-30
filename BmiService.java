public class BmiService {
    public float calculate(float weight, float height) {
        float bodyMassIndex = (float) (weight / (height * height));
        return bodyMassIndex;
    }
}
