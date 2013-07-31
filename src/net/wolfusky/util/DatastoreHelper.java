package net.wolfusky.util;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;

public class DatastoreHelper {
	public static DatastoreService datastore = DatastoreServiceFactory
			.getDatastoreService();
	public DatastoreHelper() {
		
	}
}
