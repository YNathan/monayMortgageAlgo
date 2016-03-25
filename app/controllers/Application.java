package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

	public static Result index() {
		System.out.println("\n[INFO] Hello server\n");
		return redirect("assets/index.html");
	}
	
	public static Result Register(){
		return redirect("assets/index.html");
	}
	
	public static Result Main(){
		return redirect("assets/index.html");
	}
	
	public static play.mvc.Result uploadFile() throws IOException {
		System.out.println("================================");
		play.mvc.Http.MultipartFormData body = request().body().asMultipartFormData();
		play.mvc.Http.MultipartFormData.FilePart picture = body.getFile("fileUpload");
		if (picture != null) {
			String fileName = picture.getFilename();
			String contentType = picture.getContentType();

			java.io.File sourceFile = picture.getFile();

			File dest = new File("C:\\profilePicures\\" + picture.getFilename());
			try {
				copyFile(sourceFile, dest);
			} catch (IOException e) {
				e.printStackTrace();
			}

			return redirect("assets/index.html");
		} else {
			flash("error", "Missing file");
			return badRequest();
		}
	}

	/**
	 * Copy file from old location to a new location in the system we will use
	 * that for save the profile picture who we get from the client to the local
	 * directory in the server
	 * 
	 * @param oldLocation
	 * @param newLocation
	 * @throws IOException
	 */
	public static void copyFile(File oldLocation, File newLocation) throws IOException {
		if (oldLocation.exists()) {
			BufferedInputStream reader = new BufferedInputStream(new FileInputStream(oldLocation));
			BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(newLocation, false));
			try {
				byte[] buff = new byte[8192];
				int numChars;
				while ((numChars = reader.read(buff, 0, buff.length)) != -1) {
					writer.write(buff, 0, numChars);
				}
			} catch (IOException ex) {
				throw new IOException(
						"IOException when transferring " + oldLocation.getPath() + " to " + newLocation.getPath());
			} finally {
				try {
					if (reader != null) {
						writer.close();
						reader.close();
					}
				} catch (IOException ex) {
					System.out.println("Error closing files when transferring " + oldLocation.getPath() + " to "
							+ newLocation.getPath());
				}
			}
		} else {
			throw new IOException("Old location does not exist when transferring " + oldLocation.getPath() + " to "
					+ newLocation.getPath());
		}
	}


}
