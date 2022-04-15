package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
	}
}

//W klasie HanoiRhymer źle sformatowane byy wiersze: 5, 12, 14, 15
//Kombinacje klawiszy alt + ->, alt + <- umożliwiają przełączanie między otwartymi oknami w ide