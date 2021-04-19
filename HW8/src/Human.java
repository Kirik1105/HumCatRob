public class Human {
    int runDist = 34;
    int jumpHeight = 2;

    public boolean run(RunningTrack track) {
        if (track.runTrack(runDist)) {
            System.out.println("Человек пробежал");
            return true;
        } else {
            System.out.println("Человек не пробежал");
            return false;
        }
    }

    public boolean jump(Wall wall) {
        if (wall.wallJump(jumpHeight)) {
            System.out.println("Человек перепрыгнул стену");
            return true;
        } else {
            System.out.println("Человек не перепрыгнул стену");
            return false;
        }
    }

}
