<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE log4j:configuration PUBLIC "-//APACHE//DTD LOG4J 1.2//EN" "log4j.dtd">

<log4j:configuration>
        
  <appender name="LF5Appender" class="org.apache.log4j.lf5.LF5Appender">
     <param name="MaxNumberOfRecords" value="1000"/> 
  </appender>

  <root>
    <priority value ="debug" />
    <appender-ref ref="LF5Appender"/>
  </root>

</log4j:configuration>