public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall(5);
        RunningTrack trace = new RunningTrack(10);

        Human human = new Human();
        Robot robot = new Robot();
        Cat cat = new Cat();

        if (human.jump(wall))
            human.run(trace);

        if (robot.jump(wall))
            robot.run(trace);

        if (cat.run(trace))
            cat.jump(wall);
    }
}


