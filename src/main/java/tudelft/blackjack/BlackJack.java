package tudelft.blackjack;

public class BlackJack {

    public int play(int left, int right) {
        int ln = left;
        int rn = right;
        if (ln > 21)
            ln = 0;
        if (rn > 21)
            rn = 0;

        return ln > rn ? ln : rn;
    }
}
