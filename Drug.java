import java.util.Date;
public class Drug {
public int drugID, price, usage;
 public String Drugname; 
 public Date Exp_date;

    public Drug(int drugID, int price, int usage, String Drugname, Date Exp_date) {
        this.drugID = drugID;
        this.price = price;
        this.usage = usage;
        this.Drugname = Drugname;
        this.Exp_date = Exp_date;
    }

    public int getDrugID() {
        return drugID;
    }

    public void setDrugID(int drugID) {
        this.drugID = drugID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getUsage() {
        return usage;
    }

    public void setUsage(int usage) {
        this.usage = usage;
    }

    public String getDrugname() {
        return Drugname;
    }

    public void setDrugname(String Drugname) {
        this.Drugname = Drugname;
    }

    public Date getExp_date() {
        return Exp_date;
    }

    public void setExp_date(Date Exp_date) {
        this.Exp_date = Exp_date;
    }
 
}
