public class Robot {
    int runDist = 1000;
    int jumpHeight = 1000;

    public boolean run(RunningTrack track) {
        if (track.runTrack(runDist)) {
            System.out.println("Робот пробежал");
            return true;
        } else {
            System.out.println("Робот не пробежал");
            return false;
        }
    }

    public boolean jump(Wall wall) {
        if (wall.wallJump(jumpHeight)) {
            System.out.println("Робот перепрыгнул стену");
            return true;
        } else {
            System.out.println("Робот не перепрыгнул стену");
            return false;
        }
    }
}
