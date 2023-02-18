package Speech;
import Interfaces.ISpeech;

public class SayHello implements ISpeech {
    public void Say() {
        System.out.println("Привет!");
    }
}
