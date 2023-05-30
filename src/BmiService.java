public class BmiService {
    public int calculate(int weightKg, float heightMet) {
        return (int) (weightKg / (heightMet * heightMet));
    }
}
