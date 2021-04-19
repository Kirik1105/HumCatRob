public class Cat {
    int runDist = 50;
    int jumpHeight = 3;

    public boolean run(RunningTrack track) {
        if (track.runTrack(runDist)) {
            System.out.println("Кот пробежал");
            return true;
        } else {
            System.out.println("Кот не пробежал");
            return false;
        }
    }

    public boolean jump(Wall wall) {
        if (wall.wallJump(jumpHeight)) {
            System.out.println("Кот перепрыгнул стену");
            return true;
        } else {
            System.out.println("Кот не перепрыгнул стену");
            return false;
        }
    }
}
