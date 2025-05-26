import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.SparkConf;


public class HelloSpark {

    public static void main (String[]args){
    	SparkConf conf = new SparkConf()
    		.setAppName("Hello World Spark")
    		.setMaster("local");
    	
    	JavaSparkContext sc = new JavaSparkContext(conf);
    
    System.out.println("Hello World");
    
    sc.close();
   
    }
}
