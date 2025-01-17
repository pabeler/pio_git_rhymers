package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
	}

    public int getTotalRejected() {
        return totalRejected;
    }
}

//W klasie HanoiRhymer źle sformatowane byy wiersze: 5, 12, 14, 15
//Kombinacje klawiszy alt + ->, alt + <- umożliwiają przełączanie między otwartymi oknami w ide