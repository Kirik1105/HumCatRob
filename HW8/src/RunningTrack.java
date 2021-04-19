public class RunningTrack {
    int length;

    RunningTrack(int x) {
        length = x;
    }

    public boolean runTrack(int x) {
        if (length < x) {
            return true;
        } else {
            return false;
        }
    }
}
