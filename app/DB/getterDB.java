package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import Entity.Gelt;
import Entity.User;
import Entity.UserLogin;

/**
 * 
 * @author Yaacov
 *
 */
public class getterDB {
	private final Lock lock = new ReentrantLock();
	private static Connection connect;
	private static Statement statement;
	private static ResultSet resultSet;

	public ArrayList<String> getUserNames() {
		lock.lock();
		ArrayList<String> userNames = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connect = DriverManager.getConnection("jdbc:mysql://localhost/yankalee?" + "user=root&password=Ny7516399");
			// Statements allow to issue SQL queries to the database
			statement = connect.createStatement();
			// Result set get the result of the SQL query
			resultSet = statement.executeQuery("select * from users");
			// INFO
			play.Logger.info("<DATA_BASE> Get User-Names");

			// Looping over the result user-names
			while ((resultSet.next()) && (!resultSet.isClosed())) {
				userNames.add(resultSet.getString("user_name"));
			}

		} catch (Exception e) {
			e.printStackTrace();
			play.Logger.error(e.getMessage());
			;
		} finally {
			// Closing the resultSet
			close();
		}
		lock.unlock();
		return userNames;
	}

	public ArrayList<String> getEmails() {
		lock.lock();
		ArrayList<String> emails = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connect = DriverManager.getConnection("jdbc:mysql://localhost/yankalee?" + "user=root&password=Ny7516399");
			// Statements allow to issue SQL queries to the database
			statement = connect.createStatement();
			// Result set get the result of the SQL query
			resultSet = statement.executeQuery("select * from users");
			// INFO
			play.Logger.info("<DATA_BASE> Get Emails");

			// Looping over the result user-names
			while (resultSet.next()) {
				emails.add(resultSet.getString("email"));
			}

		} catch (Exception e) {
			e.printStackTrace();
			play.Logger.error(e.getMessage());
			;
		} finally {
			// Closing the resultSet
			close();
		}
		lock.unlock();
		return emails;
	}

	public ArrayList<UserLogin> getUserLogins() {
		lock.lock();
		ArrayList<UserLogin> userLogins = new ArrayList<UserLogin>();
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connect = DriverManager.getConnection("jdbc:mysql://localhost/yankalee?" + "user=root&password=Ny7516399");
			// Statements allow to issue SQL queries to the database
			statement = connect.createStatement();
			// Result set get the result of the SQL query
			resultSet = statement.executeQuery("select * from users");
			// INFO
			play.Logger.info("<DATA_BASE> Get User-Login");

			// Looping over the result user-names
			while (resultSet.next()) {
				userLogins.add(new UserLogin(resultSet.getString("user_name"), resultSet.getString("password")));
			}

		} catch (Exception e) {
			e.printStackTrace();
			play.Logger.error(e.getMessage());
			;
		} finally {
			// Closing the resultSet
			close();
		}
		lock.unlock();
		return userLogins;
	}

	public ArrayList<User> getUsers() {

		lock.lock();
		ArrayList<User> usersLst = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connect = DriverManager.getConnection("jdbc:mysql://localhost/yankalee?" + "user=root&password=Ny7516399");
			// Statements allow to issue SQL queries to the database
			statement = connect.createStatement();
			// Result set get the result of the SQL query
			resultSet = statement.executeQuery("select * from users");
			// INFO
			play.Logger.info("<DATA_BASE> Get Users");

			// Looping over the result user-names
			while (resultSet.next()) {
				usersLst.add(new User(resultSet.getString("user_name"), resultSet.getString("first_name"),
						resultSet.getString("last_name"), resultSet.getString("email"),
						resultSet.getString("telephone"), resultSet.getString("password"),
						resultSet.getString("birthdate"), resultSet.getString("user_id")));
			}

		} catch (Exception e) {
			e.printStackTrace();
			play.Logger.error(e.getMessage());
			;
		} finally {
			// Closing the resultSet
			close();
		}
		lock.unlock();
		return usersLst;
	}

	public ArrayList<Gelt> getGelts() {
		lock.lock();
		ArrayList<Gelt> gelts = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connect = DriverManager.getConnection("jdbc:mysql://localhost/yankalee?" + "user=root&password=Ny7516399");
			// Statements allow to issue SQL queries to the database
			statement = connect.createStatement();
			// Result set get the result of the SQL query
			resultSet = statement.executeQuery("select * from bank");
			// INFO
			play.Logger.info("<DATA_BASE> Get Gelts");

			// Looping over the result user-names
			while (resultSet.next()) {
				gelts.add(new Gelt(resultSet.getInt("debter_id"), resultSet.getInt("amount"),
						resultSet.getInt("entitled_id")));
			}

		} catch (Exception e) {
			e.printStackTrace();
			play.Logger.error(e.getMessage());
			;
		} finally {
			// Closing the resultSet
			close();
		}
		lock.unlock();
		return gelts;
	}

	/**
	 * Getting the temp gelts who weiting for confirming from the debter
	 * 
	 * @return an array witch gelts who weiting for confirming from the debter
	 */
	public ArrayList<Gelt> getTempGelts() {
		lock.lock();
		ArrayList<Gelt> gelts = new ArrayList<>();
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connect = DriverManager.getConnection("jdbc:mysql://localhost/yankalee?" + "user=root&password=Ny7516399");
			// Statements allow to issue SQL queries to the database
			statement = connect.createStatement();
			// Result set get the result of the SQL query
			resultSet = statement.executeQuery("select * from temp_debts");
			// INFO
			play.Logger.info("<DATA_BASE> Get Temp Gelts");

			// Looping over the result user-names
			while (resultSet.next()) {
				gelts.add(new Gelt(resultSet.getInt("debter_id"), resultSet.getInt("amount"),
						resultSet.getInt("entitled_id")));
			}

		} catch (Exception e) {
			e.printStackTrace();
			play.Logger.error(e.getMessage());
		} finally {
			// Closing the resultSet
			close();
		}
		lock.unlock();
		return gelts;
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
			e.printStackTrace();
			play.Logger.error(e.getMessage());
			;
		}
	}

}
