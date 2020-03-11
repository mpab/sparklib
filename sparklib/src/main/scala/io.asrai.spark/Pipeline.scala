package io.asrai.spark {

    object Pipeline {

        def Run(args: Array[String]) : Unit = {
        }

        def Run() : Unit = {
            val instruction = new CreateViewFromStorage(
                "CoreCashTransactions",
                "/Enterprise Business Reports/reconciliation_core_cb_2020-03-06/01.extract/CoreCashTransactions.csv",
                "/Enterprise Business Reports/reconciliation_core_cb_2020-03-06/02.extract-cache/CoreCashTransactions"
                )

            val view = new View(instruction)
            view.dataFrame.printSchema()
        }
    }

}