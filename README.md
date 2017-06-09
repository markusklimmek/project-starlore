# project-starlore

## Log

### Create Project with Dropwizard Archetype

[The Dropwizard Archetype](https://github.com/dropwizard/dropwizard/tree/master/dropwizard-archetypes)

I used this command to start the generation
```mvn archetype:generate -DarchetypeGroupId=io.dropwizard.archetypes -DarchetypeArtifactId=java-simple -DarchetypeVersion=1.1.1```

#### maven coordinates

groupID := an ID which groups associated projects under one name (it should resemble a domain under your control)

artifactID := the name of this artifact (usually a jar file and the coresponding sources, but without the version)

version := the name of this release, i think i will try it [Semantic Versioning](http://semver.org/) with the format MAJOR.MINOR.PATCH

#### Additional informations

package := should corresond to the groupID

name := a short description (all class names relate to this field)

description := a description :) (but it is not needed for dropwizard projects)

shaded := should be true, uses Shade Plugin (https://maven.apache.org/plugins/maven-shade-plugin/usage.html), which creates a uber-jar (i.e. every dependency is within this jar) and renames (shades)  dependencies if necessary. 
