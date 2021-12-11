package models;

public class author {
    
    private int AuId = 0;

    private String nome;

    public author(int AuId, String nome) {
        this.AuId = AuId;
        this.nome = nome;
    }



// ---------------------GET AuId ------------------- 
    public int getAuId() {
        return AuId;
    }
// ---------------------GET ------------------------


// ---------------------SET AuId -------------------
    public void setAuId(int AuId) {
        this.AuId = AuId;
    }
// ---------------------SET ------------------------


// ---------------------GET NOME ------------------- 

    public String getNome() {
        return nome;
    }

// ---------------------GET ------------------------


// ---------------------SET NOME -------------------
    public void setNome(String nome) {
        this.nome = nome;
    }    
// ---------------------SET ------------------------


}
