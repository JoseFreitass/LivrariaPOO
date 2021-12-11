package livrariapoo;

public class User {

    private int UsId = 0;

    private String Type;

    private String name;
    
    public User(int UsId, String Type, String name) {
        this.UsId = UsId;
        this.Type = Type;
        this.name = name;
    }

    public User(int aInt, String string, int aInt0, int aInt1, int aInt2, int aInt3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


//--------------------------GET UsId----------------------

    public int getUsId() {
        return UsId;
    }
//--------------------------GET----------------------


//--------------------------SET UsId----------------------
    public void setUsId(int UsId) {
        this.UsId = UsId;
    }
//--------------------------SET---------------------------




//--------------------------GET Type----------------------
    public String Type() {
        return Type;
    }
//--------------------------GET--------------------------


//--------------------------SET Type----------------------
    public void setType(String Type) {
        this.Type = Type;
    }
//--------------------------SET---------------------------




//--------------------------GET NAME----------------------
    public String getname() {
        return name;
    }
//--------------------------GET--------------------------



//--------------------------SET NAME----------------------
    public void setname(String name) {
        this.name = name;
    }
//--------------------------SET---------------------------

    
}
