import com.amazonaws.services.lambda.runtime.events.S3Event;

public class Handler {
    public void recordHandler(S3Event event) {
        System.out.println("Hello, world");
        System.out.println(event);
    }
}
