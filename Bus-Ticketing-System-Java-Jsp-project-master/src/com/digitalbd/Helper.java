package com.digitalbd;

import java.util.HashMap;

public class Helper {
	public static String baseUrl = "http://localhost:8081/Train_Ticket_System/";
	public static String TestName="Gourav";
	public static String Currency = "Rs";
	public static HashMap<String,String> TrainsCoach(){
		HashMap<String,String> coach = new HashMap<String,String>();
		coach.put("First Class", "First Class");
		coach.put("Economy-AC", "Economy-AC");
		coach.put("Economy", "Economy");
		coach.put("Sleeper", "Sleeper");
		return coach;
	}
}
