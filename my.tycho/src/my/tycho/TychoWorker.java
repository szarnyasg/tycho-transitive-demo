package my.tycho;

import com.google.common.collect.ImmutableMap;

public class TychoWorker {

	public static void sayHello() {
		ImmutableMap<String, String> map = ImmutableMap.of("hello", "world");
		System.out.println(map);		
	}

}
