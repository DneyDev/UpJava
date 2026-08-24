public class Funcionario{
    
    private String name;
    private String cargo;
    private double salary;

    public Funcionario(String name, String cargo, double salary){ //definição de atributos do método
        this.name = name; //remetendo as "var" aos métodos da classe Funcionário
        this.cargo = cargo;
        this.salary = salary; 
    }
    public Funcionario(String name, String cargo){
        this(name, cargo, 0.0); //delega pro construtor completo
    }
    public Funcionario(String name){
        this(name, "nao definido"); //delegando para o construtor de 2 parâmetros
    }

    //criando os getters abaixo
    public String getName() {
        return name;
    }
    public String getCargo() {
        return cargo;
    }

    public double getSalary() {
        return salary;
    }
    //criando setter para o salário

    public void setSalary(double salary) {

        if(salary < 0){
            throw new IllegalArgumentException("Valor invalido!");
        } this.salary = salary;
    }

    public void exibirInfo(){ //método de informações do produto
        System.out.printf("\nNome: %s", name);
        System.out.printf("\nCargo: %s", cargo);
        System.out.printf("\nSalary: %.2f \n", salary);
    }
}