package io.asrai.spark {

  object App {

    def main(args: Array[String]): Unit = {
      if (args.length == 0) {
        println("no arguments")
        Pipeline.Run()
      } else {
        println(s"arguments ${args}")
        Pipeline.Run(args)       
      }
    }
  }
}
