package info.dearth.dearth_module;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Resources {

	public void loadResources(String path) throws IOException {
		List<String> filenames = new ArrayList<String>();

		try (InputStream in = getResourceAsStream(path);
				BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
			String resource;

			while ((resource = br.readLine()) != null) {
				filenames.add(resource);
			}
			
			Properties properties = new Properties();
			for (String s : filenames) {
				properties.load(getResourceAsStream(path + "/" + s));
			}
			properties.list(System.out);
		}
	}

	private InputStream getResourceAsStream(String resource) {
		//classloader fun
		final InputStream in = getContextClassLoader().getResourceAsStream(resource);

		return in == null ? getClass().getResourceAsStream(resource) : in;
	}

	private ClassLoader getContextClassLoader() {
		return Thread.currentThread().getContextClassLoader();
	}
}