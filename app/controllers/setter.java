package controllers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Logger;
import java.util.logging.Level;
import BL.setterBL;
import play.mvc.Result;

/**
 * 
 * @author Yaacov
 *
 */
public class setter {
	private static setterBL setterBL = new setterBL();

	/**
	 * Inserting new debt.
	 * 
	 * @param szDebterName
	 *            - the debter name
	 * @param szAmount
	 *            - the amount for inserting
	 * @param szEntitledName
	 *            - the entitled name
	 * @return
	 */
	public static Result newGelt(String szDebterName, String szAmount, String szEntitledName) {
		if ((szDebterName != null) && (szAmount != null) && (szEntitledName != null)) {
			if (setterBL.insertGelt(szDebterName, szAmount, szEntitledName)) {
				return play.mvc.Results.ok("true");
			} else {
				return play.mvc.Results.badRequest("An internal error as ocurred when trying to insert the gelt");
			}

		} else {
			return play.mvc.Results.badRequest(
					"Null pointer screw you! \nyou send your request with an empty debter-name or an empty amount or an entitled-name!");
		}
	}

	/**
	 * Register new user into the system
	 * 
	 * @param szUserName
	 *            - user name
	 * @param szFirstName
	 *            - first name
	 * @param szLastName
	 *            - last name
	 * @param szTelephone
	 *            - telephone
	 * @param szEmail
	 *            - email
	 * @param szPassword
	 *            - password
	 * @param szBirthdate
	 *            - birthdate
	 * @return
	 * @throws Exception
	 */
	public static Result registerNewUser(String szUserName, String szFirstName, String szLastName, String szTelephone,
			String szEmail, String szPassword, String szBirthdate) throws Exception {

		// INFO
		play.Logger.info("<SETTER> Register new user : \n============================\nFor : =>>\nUser name : "
				+ szUserName + "\nFirst name : " + szFirstName + "\nLast name : " + szLastName + "\nTelephone : "
				+ szTelephone + "\nEmail : " + szEmail + "\nPassword : " + szPassword + "\nBirthdate : " + szBirthdate
				+ "\n============================\n");

		System.out.println("[INFO] " + new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime())
				+ " <SETTER> Register new user : ");
		System.out.println("============================");
		System.out.println("For : =>>");
		System.out.println("User name : " + szUserName);
		System.out.println("First name : " + szFirstName);
		System.out.println("Last name : " + szLastName);
		System.out.println("Telephone : " + szTelephone);
		System.out.println("Email : " + szEmail);
		System.out.println("Password : " + szPassword);
		System.out.println("Birthdate : " + szBirthdate);
		System.out.println("============================");

		if ((szUserName != null) && (szFirstName != null) && (szLastName != null) && (szTelephone != null)
				&& (szEmail != null) && (szPassword != null) && (szBirthdate != null)) {
			if (setterBL.registerNewUser(szUserName, szFirstName, szLastName, szTelephone, szEmail, szPassword,
					szBirthdate)) {
				return play.mvc.Results.ok("true");
			} else {
				return play.mvc.Results.badRequest("An internal error as ocurred when trying to register");
			}

		} else {
			return play.mvc.Results.badRequest(
					"Null pointer screw you! \nyou send your request with an empty user-name or an empty first-name or an last-name or an telephone or an email or an password or an birthdate!");
		}
	}

	/**
	 * Confirm from a debter if the data of this debt is true
	 * 
	 * @param szDebterName
	 *            - the debter name
	 * @param szAmount
	 *            - the amount for inserting
	 * @param szEntitledName
	 *            - the entitled name
	 * @return
	 */
	public static Result confirm(String szDebterName, String szAmount, String szEntitledName) {
		play.Logger.info("<SETTER> Confiming");
		if ((szDebterName != null) && (szAmount != null) && (szEntitledName != null)) {
			if (setterBL.confirm(szDebterName, szAmount, szEntitledName)) {
				return play.mvc.Results.ok("true");
			} else {
				return play.mvc.Results.badRequest("An internal error as ocurred when trying to insert the gelt");
			}

		} else {
			return play.mvc.Results.badRequest(
					"Null pointer screw you! \nyou send your request with an empty debter-name or an empty amount or an entitled-name!");
		}

	}
}