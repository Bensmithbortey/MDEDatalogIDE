package runtime.datalog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class Datalog {
	
	private Map<String, ArrayList<String>> truthMap = new HashMap<>();
	private Map<String, ArrayList<Map<String, String>>> truthMap2 = new HashMap<>();


	public Datalog() {}
	
	protected void addSingleTruthToList(String name, String value) {
		if(truthMap.containsKey(name)) {
			truthMap.get(name).add(value);
		} else {
			ArrayList<String> list = new ArrayList<>();
			list.add(value);
			truthMap.put(name, list);
		}
	}
	
	protected void addDoubleTruthToList(String name, String value, String value2) {
		if(truthMap2.containsKey(name)) {
			Map<String, String> map = new HashMap<>();
			map.put(value, value2);
			truthMap2.get(name).add(map);
		} else {
			Map<String, String> map = new HashMap<>();
			ArrayList<Map<String, String>> list = new ArrayList<>();
			map.put(value, value2);
			list.add(map);
			truthMap2.put(name, list);
		}
	}
	
	protected ArrayList<String> getListTruth(String name){
		return truthMap.get(name);
	}
	
	protected ArrayList<Map<String, String>> getMapTruth(String name, String value1, String value2){
		if(value1 != null && value2 != null) 
		{
			ArrayList<Map<String, String>> map = truthMap2.get(name);
			Map<String, String> val = new HashMap<>();
			val.put(value1, value2);
			ArrayList<Map<String, String>> finalList = new ArrayList<>();
			if(map.contains(val)) 
			{
				finalList.add(val);
				return finalList;
			} 
			else 
			{
				return finalList;
			}
		} 
		else if(value1 == null & value2 != null) 
		{
			ArrayList<Map<String, String>> finalList = new ArrayList<>();
			ArrayList<Map<String, String>> map = truthMap2.get(name);
			for (Map<String, String> map2 : map) {
				if(map2.containsValue(value2)) {
					finalList.add(map2);
				}
			}
			return finalList;
		}
		else if(value1 != null && value2 == null) 
		{
			ArrayList<Map<String, String>> finalList = new ArrayList<>();
			ArrayList<Map<String, String>> map = truthMap2.get(name);
			for (Map<String, String> map2 : map) {
				if(map2.containsKey(value1)) {
					finalList.add(map2);
				}
			}
			return finalList;
		}
		else 
		{
			return truthMap2.get(name);
		}
	}
	
	protected boolean getSimpleTruth(String name, String value) {
			return truthMap.containsKey(name) && truthMap.get(name).contains(value);	
	}
	
	protected boolean getDoubleTruth(String name, String value, String value2) {
		Map<String, String> map = new HashMap<>();
		map.put(value, value2);
		return truthMap2.containsKey(name) && truthMap2.get(name).contains(map);
	}
	
	protected boolean checkRules(String name2, String value1, String value2) {
			return getDoubleTruth(name2, value1, value2);
	}
	
	public abstract void run();
}
