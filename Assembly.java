import java.util.ArrayList;
import java.util.List;

public class Assembly extends CarComponent {
    private List<CarComponent> components = new ArrayList<>();

    public Assembly(String name) {
        super(name);
    }

    public void add(CarComponent component) {
        components.add(component);
    }

    @Override
    public int calculateWeight(int[] partialTotal) {
        int totalWeight = 0;
        for (CarComponent component : components) {
            totalWeight += component.calculateWeight(partialTotal);
        }
        return totalWeight;
    }
}