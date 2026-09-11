public enum Cargo {
    GERENTE("Responsavel por uma equipe"),
    ESTAGIARIO("Em aprendizado, com carga horaria menor"),
    ANALISTA("Executa tarefas técnicas especializadas");

    private final String descricao;

    Cargo(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
}
