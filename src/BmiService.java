public class BmiService {
    public int calculate(int bodyMass, double height) {

        int index = (int) (bodyMass / (height * height));
        return index;
    }
}
