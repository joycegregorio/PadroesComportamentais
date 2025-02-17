import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    private String token;
    private String role;
    private String body;
    private Map<String, String> attributes = new HashMap<>();

    public HttpRequest(String token, String role, String body) {
        this.token = token;
        this.role = role;
        this.body = body;
    }

    public String getToken() { return token; }
    public String getRole() { return role; }
    public String getBody() { return body; }
    public Map<String, String> getAttributes() { return attributes; }
}
