package io.asrai.spark {

  import org.apache.spark._

  object App {

    def main(args: Array[String]): Unit = {
      if (args.length == 0) {
        println("missing arguments")
      } else {
        Process.Run(args)       
      }
    }
  }
}
