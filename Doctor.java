
public class Doctor {
    
    private String Docid, Dfirst, Dlast, Degree, Speciality, Resnum, Street, Docphone;
    private double Salary;
    private int Zip;

    public Doctor(String Docid, String Dfirst, String Dlast, String Degree, String Speciality, String Resnum, String Street, String Docphone, double Salary, int Zip) {
        this.Docid = Docid;
        this.Dfirst = Dfirst;
        this.Dlast = Dlast;
        this.Degree = Degree;
        this.Speciality = Speciality;
        this.Resnum = Resnum;
        this.Street = Street;
        this.Docphone = Docphone;
        this.Salary = Salary;
        this.Zip = Zip;
    }

    public void setDocid(String Docid) {
        this.Docid = Docid;
    }

    public void setDfirst(String Dfirst) {
        this.Dfirst = Dfirst;
    }

    public void setDlast(String Dlast) {
        this.Dlast = Dlast;
    }

    public void setDegree(String Degree) {
        this.Degree = Degree;
    }

    public void setSpeciality(String Speciality) {
        this.Speciality = Speciality;
    }

    public void setResnum(String Resnum) {
        this.Resnum = Resnum;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public void setDocphone(String Docphone) {
        this.Docphone = Docphone;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public void setZip(int Zip) {
        this.Zip = Zip;
    }

    public String getDocid() {
        return Docid;
    }

    public String getDfirst() {
        return Dfirst;
    }

    public String getDlast() {
        return Dlast;
    }

    public String getDegree() {
        return Degree;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public String getResnum() {
        return Resnum;
    }

    public String getStreet() {
        return Street;
    }

    public String getDocphone() {
        return Docphone;
    }

    public double getSalary() {
        return Salary;
    }

    public int getZip() {
        return Zip;
    }
    
    
    
}
