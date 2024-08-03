public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João Silva");
        funcionario.setNumberRH(12345);
        funcionario.setSetor("Lavagem");

        LavaCar carro = new LavaCar("Honda Civic", 2020, "Sedan", funcionario);
        carro.printInfo();
    }
}
