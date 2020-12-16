package ingov.itd.iec.cpc.annotations;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target({ TYPE, METHOD })
public @interface Sourceconnector {

	String getsourcemaxId();
	String getSourceCount();
	String getdb();
	
}
