package lesson1;

public class Orange extends Fruit{
    private final float weight = 1.5f;

    public Orange(){;

    }
    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Orange { weight= %f } %s", weight, "string");
    }
}
