package models;

public class order {
    private int Orid = 0;

    private int fk_kusId = 0;


    public order(int Orid, int fk_kusId) {
        this.Orid = Orid;
        this.fk_kusId = fk_kusId;

    }

//--------------------------GET Orid----------------------
    public int getOrid() {
        return Orid;
    }
//--------------------------GET---------------------------


//--------------------------SET Orid----------------------
    public void setOrid(int Orid) {
        this.Orid = Orid;
    }
//--------------------------SET---------------------------



//--------------------------GET fk_kusId------------------
    public int getfk_kusId() {
        return fk_kusId;
    }
//--------------------------GET---------------------------


//--------------------------SET fk_kusId------------------
    public void setfk_kusId(int fk_kusId) {
        this.fk_kusId = fk_kusId;
    }
//--------------------------SET---------------------------
}
