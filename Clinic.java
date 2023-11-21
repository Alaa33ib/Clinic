main{  main here

}

public static void insertAppt(int IDtextfield, String Timetextfield, String Datetextfield)
{
	String sql = "INSERT INTO APPOINTMENT (Apptid, Time, Date)" + "VALUES (?, ?, ?);";

	PreparedStatement statement = conn.PreparedStatement(sql);
	statement.setString(1, IDtextfield);
	statement.setString(2, Timetextfield);
	statement.setString(3, Datetextfield);

	int rowInserted = statement.executeUpdate(); 
	if (rowInserted>0) System.out.println("A new Appointment was inserted successfully");
}

public static void updateApptTime(String Timetextfield, int IDtextfield)
{
	String sql = "UPDATE APPOINTMENT SET Time=? WHERE Apptid=?";

	PreparedStatement statement = conn.PreparedStatement(sql);
	statement.setString(1, Timetextfield);
	statement.setString(2, IDtextfield);

	int rowUpdated = statement.executeUpdate(); 
	if (rowUpdated>0) System.out.println("An existing Appointment's Time was updated successfully");
}

public static void updateApptDate(String Datetextfield, int IDtextfield)
{
	String sql = "UPDATE APPOINTMENT SET Date=? WHERE Apptid=?";

	PreparedStatement statement = conn.PreparedStatement(sql);
	statement.setString(1, Datetextfield);
	statement.setString(2, IDtextfield);

	int rowUpdated = statement.executeUpdate(); 
	if (rowUpdated>0) System.out.println("An existing Appointment's Date was updated successfully");
}

public void deleteAppt()
{

	String sql = "DELETE FROM APPOINTMENT WHERE Apptid=?";

	PreparedStatement statement = conn.PreparedStatement(sql);
	statement.setString(1, IDtextfield);

	int rowDeleted = statement.executeUpdate(); 
	if (rowDeleted>0) System.out.println("An existing Appointment was deleted successfully");

}

 public static void addToPrescribedIn() {
        try (Connection connection = DriverManager.getConnection("jdbc:your_database_url", "username", "password")) {
            Statement stmt = connection.createStatement();
            String sql = "INSERT INTO prescribed_in (appointment_id, drug_id, dosage) VALUES (?, ?, ?)";

            PreparedStatement pStmt = connection.prepareStatement(sql);
            pStmt.setString(1, this.appointmentID);
            pStmt.setString(2, this.drugID);
            pStmt.setString(3, this.dosage);
            pStmt.executeUpdate();

            System.out.println("Prescription data added to the database successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateInPrescribedIn() {
        try (Connection connection = DriverManager.getConnection("jdbc:your_database_url", "username", "password")) {
            String sql = "UPDATE prescribed_in SET dosage = ? WHERE appointment_id = ? AND drug_id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, this.dosage);
                preparedStatement.setString(2, this.appointmentID);
                preparedStatement.setString(3, this.drugID);
                preparedStatement.executeUpdate();

                System.out.println("Prescription data updated in the database successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteFromPrescribedIn() {
        try (Connection connection = DriverManager.getConnection("jdbc:your_database_url", "username", "password")) {
            String sql = "DELETE FROM prescribed_in WHERE appointment_id = ? AND drug_id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, this.appointmentID);
                preparedStatement.setString(2, this.drugID);
                preparedStatement.executeUpdate();

                System.out.println("Prescription data deleted from the database successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void selectFromPrescribedIn() {
        try (Connection connection = DriverManager.getConnection("jdbc:your_database_url", "username", "password")) {
            String sql = "SELECT * FROM prescribed_in WHERE appointment_id = ? AND drug_id = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, this.appointmentID);
                preparedStatement.setString(2, this.drugID);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        System.out.println("Prescription data found in the database:");
                        System.out.println("Dosage: " + resultSet.getString("dosage"));
                    } else {
                        System.out.println("Prescription data not found in the database.");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

