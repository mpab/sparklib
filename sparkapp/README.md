Create project

sbt new scala/scala-seed.g8

edit $SPARK_HOME/conf/log4j.properties, change the following line

log4j.rootCategory=ERROR, console

(sbt compile)

sbt package -> creates *.jar file

sbt run

spark-submit target/scala-2.11/sparkapp_2.11-0.1.0-SNAPSHOT.jar