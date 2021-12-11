package models;

public class publisher {
    
    private int PuId = 0;

    private String nome;

    private String endereco;


    public publisher(int PuId, String nome, String endereco) {
        this.PuId = PuId;
        this.nome = nome;
        this.endereco = endereco;
    }


//--------------------------GET PuId----------------------
    public int getPuId() {
        return PuId;
    }
//--------------------------GET---------------------------



//--------------------------SET PuId----------------------
    public void setPuId(int PuId) {
        this.PuId = PuId;
    }
//--------------------------SET---------------------------



//--------------------------GET NOME----------------------
    public String getnome() {
        return nome;
    }
//--------------------------GET---------------------------



//--------------------------SET NOME----------------------
    public void setnome(String nome) {
        this.nome = nome;
    }
//--------------------------SET---------------------------   



//--------------------------GET ENDERECO------------------
    public String getendereco() {
        return endereco;
    }
//--------------------------GET---------------------------



//--------------------------SET ENDERECO------------------
    public void setendereco(String endereco) {
        this.endereco = endereco;
    }
//--------------------------SET---------------------------

}
