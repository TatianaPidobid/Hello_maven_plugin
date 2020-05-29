package com.mavenplugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;


//annotation, which changes its name to greeting "Hello .."
@Mojo(name = "say")
public class HelloMojo extends AbstractMojo {
	public void execute() throws MojoExecutionException, MojoFailureException {
		getLog().info("Hello, Maven plugin!");
	}
}
