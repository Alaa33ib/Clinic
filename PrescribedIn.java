public class PrescribedIn {
  
    private String appointmentID;
    private String drugID;
    private String dosage;

    public PrescribedIn(String appID, String dID, String dosage) {
        appointmentID = appID;
        drugID = dID;
        this.dosage = dosage;
    }

    public void setAppointmentID(String appID) {
        appointmentID = appID;
    }

    public void setDrugID(String dID) {
       drugID = dID;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
    


}
