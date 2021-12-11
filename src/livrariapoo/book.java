package livrariapoo;

public class book {
    
    private int Boid = 0;

    private int fk_puId = 0;

    private int fk_auId = 0;

    private String name;

    private int numPags = 0;

    private int quantidade = 0;

    public book(int Boid, int fk_puId, int fk_auId, String name, int numPags, int quantidade) {
        this.Boid = Boid;
        this.fk_puId = fk_puId;
        this.fk_auId = fk_auId;
        this.name = name;
        this.numPags = numPags;
        this.quantidade = quantidade;
    }




// --------------------GET QUANTIDADE --------------
    public int getquantidade() {
        return quantidade;
    }
 // ---------------------GET -----------------------



 // --------------------SET QUANTIDADE -------------
    public void setquantidade(int quantidade) {
        this.quantidade = quantidade;
    }
 // --------------------SET ------------------------



// --------------------GET numPags -----------------
    public int getnumPags() {
        return numPags;
    }
// ---------------------GET ------------------------


// --------------------SET numPags -----------------
    public void setnumPags(int numPags) {
        this.numPags = numPags;
    }
// --------------------SET -------------------------


// --------------------GET name --------------------
    public String getname() {
        return name;
    }
// ---------------------GET ------------------------


// --------------------SET name --------------------
    public void setname(String name) {
        this.name = name;
    }
// --------------------SET -------------------------



    public int getfk_auId() {
        return fk_auId;
    }
// --------------------SET fk_auId --------------------
    public void setfk_auId(int fk_auId) {
        this.fk_auId = fk_auId;
    }

// --------------------SET -------------------------


// --------------------GET fk_puId --------------------
    public int getfk_puId() {
        return fk_puId;
    }
// ---------------------GET ------------------------



// --------------------SET Boid --------------------
    public void setfk_puId(int fk_puId) {
        this.fk_puId = fk_puId;
    }
// --------------------SET -------------------------



// --------------------GET Boid --------------------
    public int getBoid() {
        return Boid;
    }
// ---------------------GET ------------------------



// --------------------SET Boid --------------------
    public void setBoid(int Boid) {
        this.Boid = Boid;
    }
// --------------------SET -------------------------

}
