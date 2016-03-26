package fun.n.learn.annotation;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.TypeElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// List the custom annotations that are supported.
@SupportedAnnotationTypes({ "fun.n.learn.annotation.LogMeCustomAnnotation" })
// Extend AbstractProcessor. This will let you process.
public class LogMeCustomAnnotationProcessor extends AbstractProcessor {

	private final static Logger logger = LoggerFactory
			.getLogger("fun.n.learn.annotation.LogMeCustomAnnotationProcessor");

	@Override
	public boolean process(Set<? extends TypeElement> annotations,
			RoundEnvironment roundEnv) {
		logger.debug("I was here.");

		// TODO: Put some meaningful code here. Right now just get it to work.

		// return false;
		// We have already handled these annotations. No more. So return true.
		return true;
	}

}
