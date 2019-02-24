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

	/**
	 * Initialize a term with the given query string and weight.
	 * 
	 * @param query
	 * @param weight
	 */
	public Term(String query, double weight) {
		// TODO
	}

	/**
	 * Compares the terms in descending order by weight.
	 * 
	 * @return
	 */
	public static Comparator<Term> byReverseWeightOrder() {
		// TODO
		return null;
	}

	/**
	 * Compares the terms in lexicographic order but using only the first r
	 * characters of each query.
	 * 
	 * @param r
	 * @return
	 */
	public static Comparator<Term> byPrefixOrder(int r) {
		// TODO
		return null;
	}

	/**
	 * Compare the terms in lexicographic order by query.
	 */
	@Override
	public int compareTo(Term that) {
		// TODO
		return 0;
	}

	/**
	 * Return a string representation of the term in the following format: the
	 * weight, followed by a tab, followed by the query.
	 */
	public String toString() {
		// TODO
		return null;
	}

}
