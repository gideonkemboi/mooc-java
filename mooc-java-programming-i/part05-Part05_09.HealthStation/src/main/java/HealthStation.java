
public class HealthStation {

    private int weighings;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.weighings += 1;
        return person.getWeight();
    }

    public void feed(Person person) {
        int weight = person.getWeight() + 1;
        person.setWeight(weight);
    }

    public int weighings() {
        return this.weighings;
    }
}
