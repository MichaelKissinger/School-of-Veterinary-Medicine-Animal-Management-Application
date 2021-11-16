import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class API {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(9100), 0);

        server.createContext("/api/SearchPage", exchange -> {
            if ("GET".equals(exchange.getRequestMethod())){
                String response = "Dear User\nYou are in search page now";
                exchange.sendResponseHeaders(200, response.getBytes().length);
                OutputStream output = exchange.getResponseBody();
                output.write(response.getBytes());
                output.flush();
            }
            else {
                exchange.sendResponseHeaders(405, -1);
            }
            exchange.close();
        });
        server.setExecutor(null);
        server.start();
    }
}
