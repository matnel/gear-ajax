package fi.hiit.wearable.fakeajax;

import java.io.IOException;
import com.squareup.okhttp.*;

public class HTTPHelper {
	
	private static OkHttpClient client = new OkHttpClient();

	public static String get(String url) throws IOException {
	  Request request = new Request.Builder()
	      .url(url)
	      .build();

	  Response response = client.newCall(request).execute();
	  return response.body().string();
	}

}
