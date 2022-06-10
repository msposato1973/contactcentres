package org.connect.contactcentres.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.ResourceUtils;

public class ReadFileIO {
	
	// inject via application.properties
    @Value("${filePath.name}")
    private String resourceFileName;
	
	public static String loadTextResourceFileContents() throws Exception
    {
		File resource = loadEmployeesWithSpringInternalClass();
		return new String(Files.readAllBytes(resource.toPath()));
    }
	
	private static File loadEmployeesWithSpringInternalClass() throws FileNotFoundException {
			    return ResourceUtils.getFile("classpath:configuration.xml");
	}

}
