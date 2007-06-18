package org.naba.mdlwr.pojo;

import org.naba.mdlwr.data.*;
import java.util.Date;

public class TestSpringWS implements ITestSpringWS {

	public OutputData fetchContent(InputData in) {
		OutputData out = new OutputData();
		out.setTitle("Title here");
		out.setDescription("Description here");
		out.setPublishDate(new Date());
		out.setOriginalSource("www.eramuslim.com");
		return out;
	}
}
