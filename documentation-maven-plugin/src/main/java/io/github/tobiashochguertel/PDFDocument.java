package io.github.tobiashochguertel;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.ResolutionScope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Generates the document out of the different documentations.
 */
@Mojo(
		name = Goal.Constants.PDFDOCUMENT,
		defaultPhase = LifecyclePhase.VERIFY,
		requiresDependencyResolution = ResolutionScope.TEST
)
public class PDFDocument extends Document {

	private final static Logger LOGGER = LoggerFactory.getLogger(PDFDocument.class);

	@Override
	public void generate() throws MojoExecutionException {
		generateDocumentationDocument(Documenttype.PDF);
	}
}
