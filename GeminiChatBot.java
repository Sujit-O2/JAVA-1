import java.io.*;
import java.net.*;
import javax.net.ssl.HttpsURLConnection;

public class GeminiChatBot {
    public static void main(String[] args) {
        String apiKey = "AIzaSyCwwtOpu8nSK9Z9BV3TkjYDHDCKLoFDeD0"; // 🔑 Replace with your Gemini API key
        String endpoint = "https://generativelanguage.googleapis.com/v1beta/models/gemini-2.0-flash:generateContent?key=" + apiKey;

        try {
            URL url = new URL(endpoint);
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            // 🧠 Request body
            String userMessage = "Hello, who are you?";
            String jsonInput = "{\n" +
                    "  \"contents\": [\n" +
                    "    {\n" +
                    "      \"parts\": [\n" +
                    "        { \"text\": \"" + userMessage + "\" }\n" +
                    "      ]\n" +
                    "    }\n" +
                    "  ]\n" +
                    "}";

            // Send request
            OutputStream os = conn.getOutputStream();
            os.write(jsonInput.getBytes());
            os.flush();
            os.close();

            // Read response
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Print full JSON response
            System.out.println("Response: " + response.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
