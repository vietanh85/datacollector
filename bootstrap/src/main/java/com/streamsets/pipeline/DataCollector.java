/**
 * (c) 2015 StreamSets, Inc. All rights reserved. May not
 * be copied, modified, or distributed in whole or part without
 * written consent of StreamSets, Inc.
 */
package com.streamsets.pipeline;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public interface DataCollector {

  public void init();

  public void destroy();

  public URI getServerURI();

  public void startPipeline(String pipelineJson) throws Exception;

  public List<URI> getWorkerList() throws URISyntaxException;
}
