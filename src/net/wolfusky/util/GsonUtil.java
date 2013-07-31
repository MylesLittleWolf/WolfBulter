package net.wolfusky.util;

import java.sql.Timestamp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonUtil {
	public static final Gson gson = new GsonBuilder()
			.registerTypeAdapter(Timestamp.class, new TimestampTypeAdapter())
			.setExclusionStrategies(new ExcludeFromGsonExclusionStrategy())
			.setDateFormat(TimestampTypeAdapter.DATE_FORMAT).create();
}