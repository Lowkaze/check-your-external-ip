import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class CheckYourExternalIp {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder(URI.create("https://checkip.amazonaws.com")).build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, BodyHandlers.ofString());

        System.out.print(response.body());
    }
}
