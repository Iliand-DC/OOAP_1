package Speech;
import Interfaces.ISpeech;

public class SayGoodbye implements ISpeech {
    public void Say() {
        System.out.println("Пока!");
    }
}
