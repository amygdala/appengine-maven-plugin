/**
 * Copyright 2012 Google Inc. All Rights Reserved.
 */
package com.google.appengine;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * @goal rollback
 * @execute phase="package"
 */
public class AppCfgRollback extends AbstractAppCfgMojo {

  @Override
  public void execute() throws MojoExecutionException, MojoFailureException {

    getLog().info("");
    getLog().info("Google App Engine Java SDK - Rolling Back Application");
    getLog().info("");

    getLog().info("Retrieving Google App Engine Java SDK from Maven");
    resolveAndSetSdkRoot();

    String appDir = project.getBuild().getDirectory() + "/" + project.getBuild().getFinalName();

    getLog().info("Rolling Back Google App Engine Application");

    executeAppCfg("rollback", appDir);
  }

}
