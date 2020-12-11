import org.apache.spark
import org.apache.spark.sql.SparkSession

object Main {

  def main(args: Array[String]): Unit = {
    implicit val spark: SparkSession =
      SparkSession.builder()
        .appName("TP_SPARK")
        .master("local")
        .getOrCreate()

    println("************")
    println("************")
    println("Hello, world!")
    val rdd = spark.sparkContext.parallelize(Array(1 to 10))
    rdd.collect.foreach(println)
    println("************")
    println("************")

    spark.stop()
  }
}