package models;

public class Orderitens {
    private int OiId = 0;

    private int fkorId = 0;


    private int fkbrId;
    


    public Orderitens(int OiId, int fkorId, int fkbrId) {
        this.OiId = OiId;
        this.fkorId = fkorId;
        this.fkbrId = fkbrId;
    }



    
//--------------------------GET OiId----------------------
    public int getOiId() {
        return OiId;
    }
//--------------------------GET---------------------------


//--------------------------SET OiId----------------------
    public void setOiId(int OiId) {
        this.OiId = OiId;
    }
//--------------------------SET---------------------------
    

//--------------------------GET fkorId----------------------
    public int getfkorId() {
        return fkorId;
    }
//--------------------------GET---------------------------


//--------------------------SET fkorId----------------------
    public void setfkorId(int fkorId) {
        this.fkorId = fkorId;
    }
//--------------------------SET---------------------------


//--------------------------GET fkbrId----------------------
    public int getfkbrId() {
        return fkbrId;
    }
//--------------------------GET---------------------------


//--------------------------SET fkbrId----------------------
    public void setfkbrId(int fkbrId) {
        this.fkbrId = fkbrId;
    }
//--------------------------SET---------------------------

    
}
