import Interfaces.IMovement;
import Interfaces.ISpeech;

public class People {
    private ISpeech _speech;
    private IMovement _movement;

    public void SaySomething() {
        _speech.Say();
    }

    public void GetInfo() {
        _movement.Move();
    }

    public People(ISpeech speech) {
        SetSpeech(speech);
    }

    public People(IMovement movement) {
        SetMovement(movement);
    }

    public People(ISpeech speech, IMovement movement) {
        SetSpeech(speech);
        SetMovement(movement);
    }

    public void SetSpeech(ISpeech speech) {
        _speech = speech;
    }

    public void SetMovement(IMovement movement) {
        _movement = movement;
    }
}
