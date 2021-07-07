/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws IOException {

        Gson gson = new Gson();

        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Motas\\asac\\401\\quotes\\app\\src\\main\\java\\quotes\\recentqoutes.json"));
        List<Quote> quote = gson.fromJson(reader, new TypeToken<List<Quote>>() {}.getType());
        int min = 0;
        int max = quote.size()-1 ;
        int max2 = quote.size();

        String url ="http://ron-swanson-quotes.herokuapp.com/v2/quotes";
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);
        connection.setRequestMethod("GET");
        int responseCode = connection.getResponseCode();


        if (responseCode == HttpURLConnection.HTTP_OK) {

            InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String data = bufferedReader.readLine();
            System.out.println(data);

            bufferedReader.close();

        }else{

            System.out.println(quote.get((int) (Math.random()*(max- min+1)+ min)).toString());
        }

    }
}
