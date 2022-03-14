package Character.Job;

import Character.Stat.Stat;

public class JobMock extends Job {
    @Override
    public int modifier(Stat stat) {
        return 0;
    }
}
