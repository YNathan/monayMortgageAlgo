package DB;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import Entity.Gelt;

/**
 * 
 * @author Yaacov
 *
 */
public class setterDB {
	private static Connection connect;
	private static Statement statement;
	private static ResultSet resultSet;
	private PreparedStatement preparedStatement;

	/**
	 * @param m_gelts
	 */
	public boolean setGelts(ArrayList<Gelt> m_gelts) {
		boolean bIsWasAdded = true;
		// Deleting all data-base like this we dosn't want to have duplicate
		// data ("debts")
		deleteTable("yankalee.bank");
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connect = DriverManager.getConnection("jdbc:mysql://localhost/yankalee?" + "user=root&password=Ny7516399");
			play.Logger.info("Insert new gelts to the data-base");
			for (Gelt currGelts : m_gelts) {
				// PreparedStatements can use variables and are more efficient
				preparedStatement = connect.prepareStatement("insert into yankalee.bank values (? , ?, ?)");
				preparedStatement.setInt(1, currGelts.getDebterID());
				preparedStatement.setInt(2, currGelts.getAmount());
				preparedStatement.setInt(3, currGelts.getEntitledID());
				preparedStatement.executeUpdate();
			}

		} catch (Exception e) {
			bIsWasAdded = false;
			e.printStackTrace();
			play.Logger.error(e.getMessage());
		} finally {
			// Closing the resultSet
			close();
		}
		// Commit changes
		commit();
		return bIsWasAdded;
	}

	/**
	 * 
	 * @param m_gelt
	 */
	public boolean setTempGelt(Gelt m_gelt) {
		boolean bIsWasAdded = true;
		// Deleting all data-base like this we dosn't want to have duplicate
		// data ("debts")
		deleteTable("yankalee.temp_debts");
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connect = DriverManager.getConnection("jdbc:mysql://localhost/yankalee?" + "user=root&password=Ny7516399");
			play.Logger.info("Insert new temp gelt to the data-base");

			// PreparedStatements can use variables and are more efficient
			preparedStatement = connect.prepareStatement("insert into yankalee.temp_debts values (? , ?, ?)");
			preparedStatement.setInt(1, m_gelt.getDebterID());
			preparedStatement.setInt(2, m_gelt.getAmount());
			preparedStatement.setInt(3, m_gelt.getEntitledID());
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			bIsWasAdded = false;
			e.printStackTrace();
			play.Logger.error(e.getMessage());
		} finally {
			// Closing the resultSet
			close();
		}
		// Commit changes
		commit();
		return bIsWasAdded;
	}

	/**
	 * 
	 * @param m_gelt
	 */
	public boolean deleteGelt(Gelt m_gelt) {
		boolean bIsWasAdded = true;
		// Deleting all data-base like this we dosn't want to have duplicate
		// data ("debts")
		deleteTable("yankalee.temp_debts");
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connect = DriverManager.getConnection("jdbc:mysql://localhost/yankalee?" + "user=root&password=Ny7516399");
			play.Logger.info(" Insert new temp gelt to the data-base");

			// PreparedStatements can use variables and are more efficient
			preparedStatement = connect
					.prepareStatement("delete from temp_bank where debter_id = ? and amount = ? and entitled_id = ? ");
			preparedStatement.setInt(1, m_gelt.getDebterID());
			preparedStatement.setInt(2, m_gelt.getAmount());
			preparedStatement.setInt(3, m_gelt.getEntitledID());
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			bIsWasAdded = false;
			e.printStackTrace();
			play.Logger.error(e.getMessage());
		} finally {
			// Closing the resultSet
			close();
		}
		// Commit changes
		commit();
		return bIsWasAdded;
	}

	/**
	 * This method its for helping the testing and init the table that asked
	 * 
	 * @param tableName
	 *            the table that want to delete
	 */
	public void deleteTable(String tableName) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connect = DriverManager.getConnection("jdbc:mysql://localhost/yankalee?" + "user=root&password=Ny7516399");
			// PreparedStatements can use variables and are more efficient
			preparedStatement = connect.prepareStatement("DELETE FROM " + tableName + ";");
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			play.Logger.error(e.getMessage());
		} finally {
			// Closing the resultSet
			close();
		}
		// Commit changes
		commit();
	}

	/**
	 * Register a new user into the data-base
	 * 
	 * @param userName
	 *            - user name
	 * @param firstName
	 *            - first name
	 * @param lastName
	 *            - last name
	 * @param telephone
	 *            - telephone
	 * @param email
	 *            - email
	 * @param password
	 *            - password
	 * @param birthdate
	 *            - birthdate
	 * @return
	 * @throws Exception
	 */
	public boolean registerNewUser(String userName, String firstName, String lastName, String telephone, String email,
			String password, Date birthdate) throws Exception {

		boolean bWasRegister = true;
		// INFO
		play.Logger.info(" " + new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime())
				+ " <SETTER> Register new user : ");
		System.out.println("============================");
		System.out.println("For : =>>");
		System.out.println("User name : " + userName);
		System.out.println("First name : " + firstName);
		System.out.println("Last name : " + lastName);
		System.out.println("Telephone : " + telephone);
		System.out.println("Email : " + email);
		System.out.println("Password : " + password);
		System.out.println("Birthdate : " + birthdate);
		System.out.println("============================");
		System.out.println("registered successfully!!!");
		System.out.println("============================");

		try {
			// The newInstance() call is a work around for some broken Java
			// implementations
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			// String strConnection=
			// "Server=127.0.0.1;Port=3306;Database=yankalee;Uid=root;password=Ny7516399;";
			connect = DriverManager.getConnection("jdbc:mysql://localhost/yankalee?" + "user=root&password=Ny7516399");

			// PreparedStatements can use variables and are more efficient
			preparedStatement = connect.prepareStatement(
					"insert into users (user_name,first_name,last_name,telephone,email,password,birthdate) values (?, ?, ?, ?, ? , ?, ?)");
			play.Logger.info(" Insert new user to the data-base");
			// Parameters start with 1
			preparedStatement.setString(1, userName);
			preparedStatement.setString(2, firstName);
			preparedStatement.setString(3, lastName);
			preparedStatement.setString(4, telephone);
			preparedStatement.setString(5, email);
			preparedStatement.setString(6, password);
			preparedStatement.setDate(7, birthdate);
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			bWasRegister = false;
			throw e;
		} finally {
			// Closing the resultSet
			close();
		}
		// Commit changes
		commit();
		return bWasRegister;

	}

	/**
	 * Commit changes of data base
	 */
	public void commit() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connect = DriverManager.getConnection("jdbc:mysql://localhost/yankalee?" + "user=root&password=Ny7516399");
			// PreparedStatements can use variables and are more efficient
			preparedStatement = connect.prepareStatement("commit");
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			play.Logger.error(e.getMessage());
		} finally {
			// Closing the resultSet
			close();
		}
	}

	// Closing the resultSet
	private static void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}

			if (statement != null) {
				statement.close();
			}

			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {

		}
	}
}
