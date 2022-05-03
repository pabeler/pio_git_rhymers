package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

/**
 * DefaultRhymersFactory class implements methods from Rhymersfactory interface
 */
public class DefaultRhymersFactory implements Rhymersfactory {

	/**
	 * getStandardRhymer()
	 * @return new DefaultCountingOutRhymer object
	 */
	@Override
	public DefaultCountingOutRhymer getStandardRhymer() {
		return new DefaultCountingOutRhymer();
	}
	/**
	 * getFalseRhymer()
	 * @return new DefaultCountingOutRhymer object
	 */
	@Override
	public DefaultCountingOutRhymer getFalseRhymer() {
		return new DefaultCountingOutRhymer();
	}
	/**
	 * getFIFORhymer()
	 * @return new FIFORhymer object
	 */
	@Override
	public DefaultCountingOutRhymer getFIFORhymer() {
		return new FIFORhymer();
	}
	/**
	 * getHanoiRhymer()
	 * @return new HanoiRhymer object
	 */
	@Override
	public DefaultCountingOutRhymer getHanoiRhymer() {
		return new HanoiRhymer();
	}

}
