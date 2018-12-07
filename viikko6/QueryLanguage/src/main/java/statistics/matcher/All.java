package statistics.matcher;

import statistics.Player;

public class All implements Matcher {

    private Matcher[] matchers;

    @Override
    public boolean matches(Player p) {
        return true;
    }
    
}
