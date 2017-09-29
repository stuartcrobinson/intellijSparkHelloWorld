package SparkAttempt1GroupId


import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD.rddToPairRDDFunctions

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._

//THIS WORKS!!!!

object App {
  def main(args: Array[String]) = {
    println("oh hi")
    
    val spark = SparkSession.builder.master("local[2]").appName("SUnderstandingSparkSession").getOrCreate()

    val df = spark.read.json("people.json")
    df.show()

//    org.apache.log4j.Logger.getLogger("org").setLevel(org.apache.log4j.Level.OFF)
  }
}