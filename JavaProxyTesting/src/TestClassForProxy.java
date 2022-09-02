

import java.lang.reflect.Proxy;
import java.util.List;

public class TestClassForProxy {

	public static void main(String[] args) {

		List<String> newProxyInstance = ((List<String>) Proxy.newProxyInstance(TestClassForProxy.class.getClassLoader(),
				new Class[] { List.class }, new NoAddOperationToListHandler()));
		newProxyInstance.add("Hello");
		System.out.println(newProxyInstance);
	}
}
