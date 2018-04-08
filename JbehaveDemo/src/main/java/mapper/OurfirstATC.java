package mapper;

import java.util.Arrays;
import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import steps.UILoginsteps;

public class OurfirstATC extends JUnitStories{

	
	public OurfirstATC()
	{
	 super();
	this.configuredEmbedder().candidateSteps().add(new UILoginsteps());
	}
	
	@Override
    public Configuration configuration() {
        return new MostUsefulConfiguration()
            // where to find the stories
            .useStoryLoader(new LoadFromClasspath(this.getClass()))  
            // CONSOLE and TXT reporting
            .useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats().withFormats(Format.CONSOLE, Format.TXT, Format.HTML)); 
    }

	@Override
	public List<CandidateSteps> candidateSteps(){

	return new InstanceStepsFactory(configuration(), this).createCandidateSteps();
	}
	
	@Override
	protected List<String> storyPaths() {
		return Arrays.asList("stories/OurfirstATC.story");
	}

}
