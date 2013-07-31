package net.wolfusky.data;

import net.wolfusky.util.GsonUtil;

public class JSONDataVO {
	private int code;
	private String message;
	private Object object;
	public JSONDataVO() {
		code = 200;
		object = new Object();
		message = "";
	}
	
	public int code() {
		return code;
	}
	public JSONDataVO code(int code) {
		this.code = code;
		return this;
	}
	
	public Object obj() {
		return object;
	}
	public JSONDataVO obj(Object obj) {
		this.object = obj;
		return this;
	}
	public String toJSON() {
		return GsonUtil.gson.toJson(this);
	}
	
	
	public String msg() {
		return message;
	}
	public JSONDataVO msg(String msg) {
		this.message = msg;
		return this;
	}	
	
	public static JSONDataVO vo(){
		return new JSONDataVO();
	}
	public static JSONDataVO vo(int code){
		return new JSONDataVO().code(code);
	}	
	public static JSONDataVO vo(String msg){
		return new JSONDataVO().msg(msg);
	}
	public static JSONDataVO vo(Object obj){
		return new JSONDataVO().obj(obj);
	}
	
	public static JSONDataVO vo(int code, Object obj){
		return new JSONDataVO().code(code).obj(obj);
	}	
	public static JSONDataVO vo(int code, String msg){
		return new JSONDataVO().code(code).msg(msg);
	}
	
	public static JSONDataVO vo(int code, String msg, Object obj){
		return new JSONDataVO().code(code).msg(msg).obj(obj);
	}	
}
