# project-starlore

## Log

### Create Project with Dropwizard Archetype

'''https://github.com/dropwizard/dropwizard/tree/master/dropwizard-archetypes'''
'''mvn archetype:generate -DarchetypeGroupId=io.dropwizard.archetypes -DarchetypeArtifactId=java-simple -DarchetypeVersion=[REPLACE ME WITH A VALID DROPWIZARD VERSION]'''

You are gona be prompted for some maven coordinates
groupID := an ID which groups associated projects under one name (it should resemble a domain under your control)
artifactID := the name of this artifact (usually a jar file and the coresponding sources, but without the version)
version := the name of this release

package := should corresond to the groupID
name := a short description (free text)
description := a description :)

shaded := should be true, uses Shade Plugin (https://maven.apache.org/plugins/maven-shade-plugin/usage.html), which creates a uber-jar (i.e. every dependency is within this jar) and renames (shades)  dependencies if necessary. 
