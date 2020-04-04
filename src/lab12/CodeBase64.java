package lab12;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;


public class CodeBase64 {
	
	public static void main(String[] args) throws IOException {
		Path originalPath = Paths.get("C:\\Users\\GUILLERMO\\Documents\\workspace-spring-tool-suite-4-4.6.0.RELEASE\\Lab12", "Proyecto1.pdf");
		Path targetPath = Paths.get("C:\\Users\\GUILLERMO\\Documents\\workspace-spring-tool-suite-4-4.6.0.RELEASE\\Lab12", "encoded.txt");
		Base64.Encoder mimeEncoder = Base64.getMimeEncoder();
		try(OutputStream output = Files.newOutputStream(targetPath)){
			Files.copy(originalPath, mimeEncoder.wrap(output));
			OutputStream encodedStream = mimeEncoder.wrap(output);
		}
		 catch (IOException e) {
			System.out.println(e.getMessage());
		 }
	}

}
