main{  main here

}

public void insertAppt(int IDtextfield, String Timetextfield, String Datetextfield)
{
	String sql = "INSERT INTO APPOINTMENT (Apptid, Time, Date)" + "VALUES (?, ?, ?);";

	PreparedStatement statement = conn.PreparedStatement(sql);
	statement.setString(1, IDtextfield);
	statement.setString(2, Timetextfield);
	statement.setString(3, Datetextfield);

	int rowInserted = statement.executeUpdate(); 
	if (rowInserted>0) System.out.println("A new Appointment was inserted successfully");
}

public void updateApptTime(String Timetextfield, int IDtextfield)
{
	String sql = "UPDATE APPOINTMENT SET Time=? WHERE Apptid=?";

	PreparedStatement statement = conn.PreparedStatement(sql);
	statement.setString(1, Timetextfield);
	statement.setString(2, IDtextfield);

	int rowUpdated = statement.executeUpdate(); 
	if (rowUpdated>0) System.out.println("An existing Appointment's Time was updated successfully");
}

public void updateApptDate(String Datetextfield, int IDtextfield)
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
