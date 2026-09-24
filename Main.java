public class Main {
    public static void main(String[] args) {

        Assembly car = new Assembly("Carro");
        Assembly body = new Assembly("Carroceria");
        Assembly chassis = new Assembly("Chassi");
        Assembly powertrain = new Assembly("Trem de forca");

        body.add(new Part("Para-lamas", 15)); //montou a carroceria
        body.add(new Part("Portas", 60));
        body.add(new Part("Paineis", 45));
        body.add(new Part("Porta-malas", 30));
        body.add(new Part("Capo", 20));

        powertrain.add(new Part("Motor", 120)); //montou o trem de força
        powertrain.add(new Part("Transmissao", 70));
        powertrain.add(new Part("Diferencial", 30));
        powertrain.add(new Part("Rodas", 80));

        chassis.add(powertrain); //montou o chassi raspado KKKKK
        chassis.add(new Part("Suspensao", 90));

        car.add(body); //montou o carro supimpa
        car.add(chassis);

        int[] partialTotal = {0};
        System.out.println("Iniciando a pesagem do " + car.getName() + "...\n");
        int totalWeight = car.calculateWeight(partialTotal);
        
        System.out.println("\nPeso total final: " + totalWeight);
    }
}