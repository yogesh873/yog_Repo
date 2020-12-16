package ingov.itd.iec.cpc.annotations;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.atteo.classindex.IndexAnnotated;
import org.springframework.stereotype.Component;

@IndexAnnotated
@Retention(RUNTIME)
@Target(TYPE)
public @interface Connector {

	String name();
	String id();
}
