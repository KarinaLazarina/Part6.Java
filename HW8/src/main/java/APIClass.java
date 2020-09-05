import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class APIClass {
    private String url;

    public APIClass(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "APIClass{" +
                "url='" + url + '\'' +
                '}';
    }

    public String read(){
            StringBuilder stringBuilder = new StringBuilder();
        try {
            URL url = new URL(this.url);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            //int responseCode = urlConnection.getResponseCode();

            if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK){
                InputStream inputStream = urlConnection.getInputStream();
                int i = 0;
                while ((i = inputStream.read()) != -1){
                    stringBuilder.append((char)i);
                }
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String result = "\n Information from this address: " + this.url + "\n" + stringBuilder.toString();

        return result;
    }


}
