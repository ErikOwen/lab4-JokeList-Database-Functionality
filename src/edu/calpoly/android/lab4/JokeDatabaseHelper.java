package edu.calpoly.android.lab4;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

/**
 * Class that hooks up to the JokeContentProvider for initialization and
 * maintenance. Uses JokeTable for assistance.
 */
public class JokeDatabaseHelper extends android.database.sqlite.SQLiteOpenHelper {

	/** The name of the database. */
	public static final String DATABASE_NAME = "jokedatabase.db";
	
	/** The starting database version. */
	public static final int DATABASE_VERSION = 1;
	
	/**
	 * Create a helper object to create, open, and/or manage a database.
	 * 
	 * @param context
	 * 					The application context.
	 * @param name
	 * 					The name of the database.
	 * @param factory
	 * 					Factory used to create a cursor. Set to null for default behavior.
	 * @param version
	 * 					The starting database version.
	 */
	public JokeDatabaseHelper(Context context, String name, CursorFactory factory, int version) {
		super(context, name, null, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		JokeTable.onCreate(db);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		JokeTable.onUpgrade(db, oldVersion, newVersion);
		
	}
}
