## Quartz Example   
   
This is a simple project, indented for experimenting with Quartz API. The project's purpose is to explore Quartz API, it's configuration, with or without Spring. This is why there are two examples, one of them uses Spring and the other not.       

###### For compiling and running the project, execute following steps.

1. Compile the project.
    ```shell
    mvn clean install
    ```

2. Run project
 * Running SimpleSchedulerExample: 
  ```shell
     java -cp target/quartzexample-1.0-SNAPSHOT.jar com.bstirbat.quartzexample.SimpleSchedulerExample
 ```     
 * Running SchedulerWithSpringExample 
  ```shell
     java -cp target/quartzexample-1.0-SNAPSHOT.jar com.bstirbat.quartzexample.SchedulerWithSpringExample
  ```
