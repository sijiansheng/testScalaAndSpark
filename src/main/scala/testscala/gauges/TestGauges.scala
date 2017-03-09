package testscala.gauges

import java.util.concurrent.{TimeUnit, LinkedBlockingDeque}

import com.codahale.metrics.{JmxReporter, Gauge, ConsoleReporter, MetricRegistry}

/**
  * Created by sijiansheng on 2016/9/19.
  */
object TestGauges {

  /**
    * 实例化一个registry，最核心的一个模块，相当于一个应用程序的metrics系统的容器，维护一个Map
    */
  private final val metrics = new MetricRegistry()

  private val queue = new LinkedBlockingDeque[String]()

  /**
    * 在控制台上打印输出
    */
  private val reporter = ConsoleReporter.forRegistry(metrics).build()

  def main(args: Array[String]) {


    reporter.start(3, TimeUnit.SECONDS)

    //实例化一个Gauge
    val gauge = new Gauge[Integer]() {
      @Override
      def getValue: Integer = {
        queue.size()
      }
    }

    //注册到容器中
    metrics.register(MetricRegistry.name(TestGauges.getClass, "pending-job", "size"), gauge)

    //测试JMX
    val jmxReporter = JmxReporter.forRegistry(metrics).build()
    jmxReporter.start()

    //模拟数据
    for (i <- 0 to 20) {
      queue.add("a")
      Thread.sleep(1000)
    }

  }


}
