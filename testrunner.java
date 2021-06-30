

@RunWith(Cucumber.class)
@Cucumberoptions
{
	features=".//Feature/Product.Feature",
			glue="stepsdefinitions"
			dryRun=false,
			monochrome=true,
			plugin= {"pretty","html:test_output"}
}
}
public class testrunner {

}
