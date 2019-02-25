/**
 * 
 */
package autocomplete;

import java.util.Comparator;

/**
 * @author Annie & Christopher Munoz
 *
 */
public class Term implements Comparable<Term> {
	private String query;
	private double weight;
	private static int rSize;

	/**
	 * Initialize a term with the given query string and weight.
	 * 
	 * @param query
	 * @param weight
	 */
	public Term(String query, double weight) {
		this.query = query;
		this.weight = weight;
	}

	/**
	 * Compares the terms in descending order by weight.
	 * 
	 * @return
	 */
	public static Comparator<Term> byReverseWeightOrder() {
		return new ReverseWeightComparator();
	}

	/**
	 * Compares the terms in lexicographic order but using only the first r
	 * characters of each query.
	 * 
	 * @param r
	 * @return
	 */
	public static Comparator<Term> byPrefixOrder(int r) {
		rSize = r;
		return new PrefixComparator();
	}

	/**
	 * Compare the terms in lexicographic order by query.
	 */
	@Override
	public int compareTo(Term that) {
		return this.query.compareTo(that.query);
		/* return Integer.compare((int)this.weight, (int)that.weight); */
	}

	/**
	 * Return a string representation of the term in the following format: the
	 * weight, followed by a tab, followed by the query.
	 */
	public String toString() {
		return weight + "\t" + query;
	}

	/**
	 * Creates a Comparator that compares terms by weight in descending order.
	 * 
	 * @author Annie Ruiz & Christopher Munoz
	 *
	 */
	private static class ReverseWeightComparator implements Comparator<Term> {

		@Override
		public int compare(Term first, Term second) {
			return Integer.compare((int) first.weight, (int) second.weight);
			/*
			 * if (first.weight > second.weight) return 1; else if (first.weight <
			 * second.weight) return -1; else return 0;
			 */
		}

	}

	/**
	 * Compares the terms in lexicographic order but using only the first r
	 * characters of each query.
	 * 
	 * @author Annie Ruiz & Christopher Munoz
	 *
	 */
	private static class PrefixComparator implements Comparator<Term> {

		@Override
		public int compare(Term first, Term second) {
			String firstR = first.query.substring(0, rSize);
			String secondR = second.query.substring(0, rSize);

			return firstR.compareTo(secondR);
		}

	}

}
