public class Part extends CarComponent {
    private int weight;

    public Part(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public int calculateWeight(int[] partialTotal) {
        partialTotal[0] += this.weight;
        System.out.println("Somando agora o peso de " + this.name + ": " + this.weight + ". Total parcial: " + partialTotal[0]);
        return this.weight;
    }
}