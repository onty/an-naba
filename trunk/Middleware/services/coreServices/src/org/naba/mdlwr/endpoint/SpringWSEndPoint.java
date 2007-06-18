package org.naba.mdlwr.endpoint;

import org.naba.mdlwr.data.*;
import org.naba.mdlwr.pojo.*;
import org.springframework.remoting.jaxrpc.ServletEndpointSupport;

public class SpringWSEndPoint extends ServletEndpointSupport implements ITestSpringWS {
	private ITestSpringWS springWS;

	protected void onInit() {
		this.springWS = (ITestSpringWS) getWebApplicationContext().getBean("springWS");
	}
	
	public OutputData fetchContent(InputData in) {
		return springWS.fetchContent(in);
	}
}