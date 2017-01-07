package typeinference;

public class TypeInferenceExample {
	public static void main(String [] args){
		StringLenghtLamda stringLength= s -> s.length();
		System.out.println(stringLength.getLengths("NirozLovesPratiksya"));
	}
	
	interface StringLenghtLamda{
		int getLengths(String s);
	}
}

