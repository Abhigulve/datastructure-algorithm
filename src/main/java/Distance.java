/**
 * @author Abhijeet Gulve
 */
public class Distance {
    private int feet;
    private float inches;

    public Distance() {


    }

    public static void main(String[] args) {
        Distance dist1 = new Distance();
        dist1.setFeetAndInches(1, 6);
        Distance dist2 = new Distance();
        dist2.setFeetAndInches(1, 8);
        System.out.println(dist1.getDistanceComparision(dist2));
    }

    public int getFeet() {

        return feet;
    }

    public float getInches() {
        return inches;
    }

    public void setFeetAndInches(int feet, float inches) {
        this.feet = feet;
        this.inches = inches;
    }

    String getDistanceComparision(Distance dist2) {
        float firstInce = (this.feet * 12 + this.inches);
        float secondDist = (dist2.feet * 12 + dist2.inches);
        if (firstInce > secondDist) {
            return "First distance is greater";
        } else if (firstInce < secondDist) {
            return "Second distance is greater";
        } else {
            return "Both distances are equal";
        }
    }
}
