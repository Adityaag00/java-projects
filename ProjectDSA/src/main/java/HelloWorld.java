import org.codehaus.jackson.JsonNode;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class HelloWorld {
    public static void main(String a[]) {
        System.out.println(generateUniqueSecretKey());
    }

    private static String generateUniqueSecretKey() {
        byte[] randomBytes = new byte[16];
        new SecureRandom().nextBytes(randomBytes);
        String encoded = Base64.getEncoder().encodeToString(randomBytes);
        return UUID.randomUUID().toString().replace("-", "") + encoded;
    }
}
