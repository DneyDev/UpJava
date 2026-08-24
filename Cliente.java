public class Cliente{

    final private String name;
    final private String cpf;

    public Cliente(String name, String cpf){ //método Cliente com 2 atributos
        this.name = name;
        this.cpf = cpf;
    }
    //getters:
    public String getName() {
        return name;
    }
    public String getCpf() {
        return cpf;
    }
}