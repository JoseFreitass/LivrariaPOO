package livrariapoo;

public class order {
    private int Orid = 0;

    private int fk_kusId = 0;
   
    private book book;
    
    private User user;


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

    public int getFk_kusId() {
        return fk_kusId;
    }

    public void setFk_kusId(int fk_kusId) {
        this.fk_kusId = fk_kusId;
    }

    public book getBook() {
        return book;
    }

    public void setBook(book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
