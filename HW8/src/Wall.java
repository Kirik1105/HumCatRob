public class Wall {
    int height;

    Wall(int x) {
        height = x;
    }

    public boolean wallJump(int x) {
        if (height < x) {
            return true;
        } else {
            return false;
        }
    }
}
