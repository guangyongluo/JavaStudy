//: annotations/InterfaceExtractorProcessorFactory.java
// APT-based annotation processing.
package thinking.in.java.chapter20;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import com.sun.mirror.apt.AnnotationProcessor;
import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.apt.AnnotationProcessorFactory;
import com.sun.mirror.declaration.AnnotationTypeDeclaration;

public class InterfaceExtractorProcessorFactory implements AnnotationProcessorFactory {
	public AnnotationProcessor getProcessorFor(Set<AnnotationTypeDeclaration> atds,
			AnnotationProcessorEnvironment env) {
		return new InterfaceExtractorProcessor(env);
	}

	public Collection<String> supportedAnnotationTypes() {
		return Collections.singleton("annotations.ExtractInterface");
	}

	public Collection<String> supportedOptions() {
		return Collections.emptySet();
	}
} /// :~
