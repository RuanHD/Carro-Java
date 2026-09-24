public abstract class CarComponent {
    protected String name;

    public CarComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public abstract int calculateWeight(int[] partialTotal);
}