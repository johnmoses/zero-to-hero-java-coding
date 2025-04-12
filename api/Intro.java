/*
Java REST API without framework with get and post endpoints
*/
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.Map;
import java.util.HashMap;

public class Intro {
    private HttpServer server;

    private Map<String, String> database = new HashMap<>();
    
    public void start() throws IOException {
        server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/api/get", new GetHandler());
        server.createContext("/api/post", new PostHandler());
        server.setExecutor(null);

        server.start();
    }
    class GetHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            handleGetRequest(exchange);
        }
        private void handleGetRequest(HttpExchange exchange) throws IOException {
            String response = "Data retrieved successfully";
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

    class PostHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            handlePostRequest(exchange);
        }
        private void handlePostRequest(HttpExchange exchange) throws IOException {
            String requestBody = new String(exchange.getRequestBody().readAllBytes());
            String[] keyValuePairs = requestBody.split("&");
            for (String pair : keyValuePairs) {
                String[] keyValue = pair.split("=");
                if (keyValue.length == 2) {
                    String key = keyValue[0];
                    String value = keyValue[1];
                    database.put(key, value);
                }
            }
            String response = "Data stored successfully";
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

    public static void main(String[] args) throws IOException {
        Intro api = new Intro();
        api.start();
    }
}
