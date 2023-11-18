package entities;

public enum Elemento {
    PEDRA("Pedra"),
    PAPEL("Papel"),
    TESOURA("Tesoura");
    
    private final String descricao;

    private Elemento(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return descricao;
    }
}
