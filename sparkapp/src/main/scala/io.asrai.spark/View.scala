package io.asrai.spark {

    import org.apache.spark._
    import java.io._

    case class CreateViewFromStorage(name: String, csvFilePath: String, parquetPath: String)

    /*
    TODO
    Implement priority option to choose CSV or parquet as view source
    If priority is CSV, delete existing parquet
    */

    class View (instruction: CreateViewFromStorage) extends SparkSessionWrapper {

        val dataFrame = 
            if (new File(instruction.parquetPath).exists) {
                println(s"reading from parquet ${instruction.parquetPath}")
                spark.read.parquet(instruction.parquetPath)
            } else if (new File(instruction.csvFilePath).exists) {
                println(s"reading from csv ${instruction.csvFilePath}")
                spark.read.format("csv").option("header", "true").load(instruction.csvFilePath)
            } else {
                throw new Exception(s"Could not load View: ${instruction.name}")
            }

        dataFrame.createOrReplaceTempView(instruction.name)

        def SaveParquet(): Unit = {
            dataFrame.write.parquet(instruction.parquetPath)
        }

    }
}