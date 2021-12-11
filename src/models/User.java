package models;

public class User {

    private int UsId = 0;

    private int Type;

    private String name;
    
    public User(int UsId, int Type, String name) {
        this.UsId = UsId;
        this.Type = Type;
        this.name = name;
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
    public int Type() {
        return Type;
    }
//--------------------------GET--------------------------


//--------------------------SET Type----------------------
    public void setType(int Type) {
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
