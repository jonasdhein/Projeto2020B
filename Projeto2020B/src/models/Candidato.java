package models;

public class Candidato {
    
    private int id;
    private String nome;
    private int id_bairro;
    private String data_nascimento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId_bairro() {
        return id_bairro;
    }

    public void setId_bairro(int id_bairro) {
        this.id_bairro = id_bairro;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    
    
    
}