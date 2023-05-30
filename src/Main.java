public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        float heightMet = 1.87F;
        int weightKg = 98;
        int bodyMassIndex = service.calculate(weightKg, heightMet);

        System.out.println(bodyMassIndex);
    }
}
