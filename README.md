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


### Starting, after doing more or less nothing
 gets you a
 ```{"code":404,"message":"HTTP 404 Not Found"}``` which is good I suppose, because we have no real endpoint, that could give you an answer.

### We want to view something real
1. Configuration: Every dropwizard app got a configuration class. It is the bridge between the app and the configuration file.
    * The configuration file is a yaml file and will be (de-)serialized with Jackson (for a list of usable anotations look here: https://github.com/FasterXML/jackson-docs/wiki/JacksonAnnotations
    * The values of the fields in the class can be validated with Hibernate (http://docs.jboss.org/hibernate/validator/4.2/reference/en-US/html_single/#validator-defineconstraints-builtin)
2. The Application Class
    * Create a representation Class (that means a class which can hold data to (de-)serialization.) We can use here again Jackson for this. For further reference: https://github.com/FasterXML/jackson-docs/wiki/JacksonAnnotations . This one goes into the API subfolder, because it describes the to be expected format of your answer.
    * We need a Resource class, which delivers the content to the customer (i.e. the browser, or another webclient)
    * And we need to tell the application class, that there is this crazy resource which can do so many unbelievable stuff.

### Project Organization
* api: Representations.
* cli: Commands
* client: Client implementation for your application
* core: Domain implementation
* jdbi: Database access classes
* health: Health Checks
* resources: Resources
* MyApplication: The application class
* MyApplicationConfiguration: configuration class

This one is copied from here: http://www.dropwizard.io/1.1.0/docs/manual/core.html#organizing-your-project

### Turn debugging on
with the help of this tutorial:
(http://mikelynchgames.com/software-development/how-to-run-a-dropwizard-application-in-intellij-idea/)

TODO: put these steps into this tutorial (and my thoughts)

### FTLs and why they can't find specific values
Why can he find the template, with the class that provides this template, but cannot find the variable within this class???
My guess is that it was just a problem with the visibility of the class in relation to the ftl parser.
The View class was package private, not public. That should explain the problem.
(https://github.com/markusklimmek/project-starlore/commit/8672ad470d7751ee31c039bf52afc3b1f2f4f199)

### Facts for the end
* automatically generated files should not be put into a vcs
* Debugging is most times very helpful