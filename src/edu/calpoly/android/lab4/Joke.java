package edu.calpoly.android.lab4;

/**
 * This class encapsulates the data pertaining to a Joke.
 */
public class Joke {

	/** The three possible rating values for jokes */
	public static final int UNRATED = 0;
	public static final int LIKE = UNRATED + 1;
	public static final int DISLIKE = UNRATED + 2;

	/** Contains the text of this joke */
	private String m_strJoke;

	/** Contains the rating of this joke, should only be one of the constant
	 * rating values declared above. */
	private int m_nRating;

	/** Contains the name of the Author of this joke. */
	private String m_strAuthorName;
	
	/** Contains the unique id of this joke. */
	private long m_nID;

	/**
	 * Initializes with an empty joke and author string and the default rating
	 * of UNRATED.
	 */
	public Joke() {
		this.m_strJoke = "";
		this.m_strAuthorName = "";
		this.m_nRating = UNRATED;
		this.m_nID = 0;
	}

	/**
	 * Initializes with the joke and author strings passed in and the default
	 * rating of UNRATED.
	 * 
	 * @param strJoke
	 *            Joke String used to initialize the text of this joke.
	 * 
	 * @param strAuthor
	 *            The name of the Author of this Joke.
	 */
	public Joke(String strJoke, String strAuthor) {
		this.m_strJoke = strJoke;
		this.m_strAuthorName = strAuthor;
		this.m_nRating = UNRATED;
		this.m_nID = 0;
	}

	/**
	 * Initializes with a joke and author string and rating value passed in.
	 * 
	 * @param strJoke
	 *            Joke String used to initialize the text of this joke.
	 * 
	 * @param strAuthor
	 *            The name of the Author of this Joke.
	 * 
	 * @param nRating
	 *            Rating value to initialize the rating of this joke.
	 */
	public Joke(String strJoke, String strAuthor, int nRating) {
		this.m_strJoke = strJoke;
		this.m_strAuthorName = strAuthor;
		this.m_nRating = nRating;
		this.m_nID = 0;
	}
	
	/**
	 * Initializes with a joke and author string and rating value passed in.
	 * This constructor should be used when instantiating jokes from database
	 * tuples.
	 * 
	 * @param strJoke
	 *            Joke String used to initialize the text of this joke.
	 * 
	 * @param strAuthor
	 *            The name of the Author of this Joke.
	 * 
	 * @param nRating
	 *            Rating value to initialize the rating of this joke.
	 * 
	 * @param id
	 * 			  A long representing the unique id for this joke.
	 */
	public Joke(String strJoke, String strAuthor, int nRating, long id) {
		this.m_strJoke = strJoke;
		this.m_strAuthorName = strAuthor;
		this.m_nRating = nRating;
		this.m_nID = id;
	}

	/**
	 * Accessor for the text of this joke.
	 * 
	 * @return A String value containing the text of this joke.
	 */
	public String getJoke() {
		return this.m_strJoke;
	}

	/**
	 * Mutator that changes the text of this joke.
	 * 
	 * @param strJoke
	 *            The text of this joke.
	 */
	public void setJoke(String strJoke) {
		this.m_strJoke = strJoke;
	}

	/**
	 * Accessor for the rating of this joke.
	 * 
	 * @return An integer value containing one of the possible rating constants.
	 */
	public int getRating() {
		return this.m_nRating;
	}

	/**
	 * Mutator that changes the rating of this joke.
	 * 
	 * @param rating
	 *            One of the possible rating constants.
	 */
	public void setRating(int rating) {
		this.m_nRating = rating;
	}

	/**
	 * Accessor for the Author of this joke.
	 * 
	 * @return A String containing the Authors name.
	 */
	public String getAuthor() {
		return this.m_strAuthorName;
	}

	/**
	 * Mutator that changes the Author of this joke.
	 * 
	 * @param strAuthor
	 *            A String containing the Authors name.
	 */
	public void setAuthor(String strAuthor) {
		this.m_strAuthorName = strAuthor;
	}
	
	/**
	 * Accessor for the unique ID of this joke.
	 * 
	 * @return an long set to the unique id of this joke.
	 */
	public long getID() {
		return this.m_nID;
	}
	
	/**
	 * Mutator that changes the unique id of this joke.
	 * 
	 * @param id
	 * 				A long representing the unique id for this joke.
	 */
	public void setID(long id) {
		this.m_nID = id;
	}

	/**
	 * Returns only the text of the joke. This method should mimic getJoke().
	 * 
	 * @return A string containing the text of the joke
	 */
	@Override
	public String toString() {
		return this.m_strJoke;
	}
	
	/**
	 * An Object is equal to this Joke if all items below are true:
	 * 
	 * 1) The Object is a Joke.
	 * 
	 * 2) The Joke's id is the same as this Joke's id.
	 * 
	 * @return True if the object passed in is a Joke with the same id as this one; False otherwise.
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Joke) {
			Joke joke2 = (Joke)obj;
			
			return this.m_nID == joke2.getID();
			//return(this.m_strJoke.equals(joke2.m_strJoke) && this.m_strAuthorName.equals(joke2.m_strAuthorName));
		}
		return false;
	}
}
