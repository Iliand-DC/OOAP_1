class Main {
    public static void main(String[] args) {
        People Bob = new People(new SayHello());
        Bob.SaySomething();
        Bob.SetSpeech(new SayGoodbye());
        Bob.SaySomething();
        People Tommy = new People(new SayHello(), new MoveOnCar());
        Tommy.GetInfo();
        Tommy.SaySomething();
    }
}