public class LavaCar {
    private Funcionario funcionario;
    private String Modelo;
    private int Ano;
    private String Tipo;

    public LavaCar(String modelo, int ano, String tipo, Funcionario funcionario) {
        this.Modelo = modelo;
        this.Ano = ano;
        this.Tipo = tipo;
        this.funcionario = funcionario;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int ano) {
        this.Ano = ano;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void printInfo() {
        System.out.println("----Carro----");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Tipo: " + getTipo());
        System.out.println("----Funcionário----");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Número RH: " + funcionario.getNumberRH());
        System.out.println("Setor: " + funcionario.getSetor());
    }
}
