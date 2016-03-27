package fun.n.learn.annotation;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;

// List the custom annotations that are supported.
@SupportedAnnotationTypes({ "fun.n.learn.annotation.LogMeCustomAnnotation" })
// Extend AbstractProcessor. This will let you process.
public class LogMeCustomAnnotationProcessor extends AbstractProcessor {

	@Override
	public boolean process(Set<? extends TypeElement> annotations,
			RoundEnvironment roundEnv) {

		Messager messager = processingEnv.getMessager();
		messager.printMessage(Diagnostic.Kind.NOTE, "I was here.");

		// TODO: Put some meaningful code here. Right now just get it to work.

		// return false;
		// We have already handled these annotations. No more. So return true.
		return true;
	}

}
