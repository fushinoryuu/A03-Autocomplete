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
		return new ReverseComparator();
	}

	/**
	 * Compares the terms in lexicographic order but using only the first r
	 * characters of each query.
	 * 
	 * @param r
	 * @return
	 */
	public static Comparator<Term> byPrefixOrder(int r) {
		return new PrefixComparator();
	}

	/**
	 * Compare the terms in lexicographic order by query.
	 */
	@Override
	public int compareTo(Term that) {
		return this.query.compareTo(that.query);
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
	private static class ReverseComparator implements Comparator<Term> {

		@Override
		public int compare(Term o1, Term o2) {
			// TODO Auto-generated method stub
			return 0;
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
		public int compare(Term o1, Term o2) {
			// TODO Auto-generated method stub
			return 0;
		}

	}

}
