package lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class LambdaDemo {

//arity           ret               args
//sig acSp  mod   ret   name        args           exceptions 
	public  int eChecker(String s1,String s2) {
		if(s1.contains("e") && !s2.contains("e")) {
			return -1;
		}else if(!s1.contains("e") && s2.contains("e")) {
			return 1;
		}else {
			return 0;
		}
	}

	public static void main(String[] args) {
		String[] words = {"this","is","a","bunch","of","rather","strange","words"};
		
		Comparator<String> c = (o1,o2) -> o1.length() - o2.length();
		Arrays.sort(words,c);

//		Arrays.sort(words, (s1,s2) -> eChecker(s1,s2));
		
		LambdaDemo obj = new LambdaDemo();
		
		Arrays.sort(words, obj::eChecker);
		
		System.out.println(Arrays.asList(words));
		
		BinaryOperator<String> o = (s1,s2) -> s1.concat(s2);
		o = String::concat; // (s1,s2) -> s1.concat(s2)
		
		Optional<String> name = getNameForEmpId(1);
		
		String actualName = name.orElse("nothing");
		if(name.isPresent()) {
			System.out.println(name.get());
		}
	}
	
	
	public static Optional<String> getNameForEmpId(int id) {
		//query db
		return Optional.of("data");
		//else Optional.empty();
	}

}
