

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NoAddOperationToListHandler implements InvocationHandler {

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		if (method.getName() != null && method.getName().startsWith("add")) {
			System.out.println("Method starting with add call is intercepted");
			return false;

		}
		return method.invoke(method, args);
	}

}
