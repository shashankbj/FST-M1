package testRunner;

import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
 
import io.cucumber.junit.platform.engine.Constants;
 
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("Features")
@ConfigurationParameter(  key = Constants.GLUE_PROPERTY_NAME, value = "stepDefination")
@ConfigurationParameter(  key = Constants.FILTER_TAGS_PROPERTY_NAME, value = "@activity2")
@ConfigurationParameter(  key = Constants.FILTER_TAGS_PROPERTY_NAME, value = "@activity3")
public class TestRunner {}
