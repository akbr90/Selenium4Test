package prog;
import java.lang.reflect.*;

public class SampleTest {
	   @SuppressWarnings("deprecation")
	public static void main(String args[]) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
	      Class c = DemoTest.class;
	      //Class c = Class.forName("DemoTest");
	      Object obj = c.newInstance();
	      Method method = c.getDeclaredMethod("sampleMethod", null);
	      method.setAccessible(true);
	      method.invoke(obj, null);
	   }
	}
