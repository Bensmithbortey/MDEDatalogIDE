package runtime.datalog;

public class DatalogTest {

	public static void main(String[] args) {
		
		Datalog d = new Datalog() {
			@Override
			public void run() {
				addSingleTruthToList("male", "grandpaSmith");
				addSingleTruthToList("male", "mrSmith");
				addSingleTruthToList("male", "peterSmith");
				addSingleTruthToList("male", "johnJones");
				addSingleTruthToList("male", "babyJones");
				
				addSingleTruthToList("female", "mrsSmith");
				addSingleTruthToList("female", "maryJones");
				addSingleTruthToList("female", "sallyWilkinson");
				
				addDoubleTruthToList("father", "grandpaSmith", "mrSmith");
				addDoubleTruthToList("father", "mrSmith", "peterSmith");
				addDoubleTruthToList("father", "mrSmith", "maryJones");
				addDoubleTruthToList("father", "johnJones", "babyJones");
				
				addDoubleTruthToList("husband_wife", "mrSmith", "mrsSmith");
				addDoubleTruthToList("husband_wife", "johnJones", "maryJones");
				
				addDoubleTruthToList("mother", "mrsSmith", "peterSmith");
				addDoubleTruthToList("mother", "mrsSmith", "maryJones");
				addDoubleTruthToList("mother", "maryJones", "babyJones");
				
				addDoubleTruthToList("loves", "peterSmith", "sallyWilkinson");

				System.out.println(getSimpleTruth("male", "mrSmith"));
				System.out.println(getSimpleTruth("male", "mrsSmith"));
				System.out.println(getListTruth("female"));
				System.out.println(getMapTruth("loves", null, "johnJones"));
				System.out.println(getMapTruth("loves", null, null));
			}
		};
		d.run();

	}

}
