package atividade2;

public class contato {
   private String nome;
    private String telefone;

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getTelefone() {
        return telefone;
    }

    
    public void setTelefone(String telefone) {
       
        if (telefone != null && telefone.replaceAll("\\D", "").length() >= 8) {
            this.telefone = telefone;
        } else {
            System.out.println("Número inválido");
        }
    }  
}