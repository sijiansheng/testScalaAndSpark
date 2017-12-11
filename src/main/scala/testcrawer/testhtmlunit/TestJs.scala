package testcrawer.testhtmlunit

import com.gargoylesoftware.htmlunit.{JavaScriptPage, WebClient}
import com.gargoylesoftware.htmlunit.html.HtmlPage

/**
  * Created by sijiansheng on 2016/8/31.
  */
object TestJs {

  def main(args: Array[String]): Unit = {
    //创建一个webclient
    //htmlunit 对css和javascript的支持不好，所以请关闭之
    val webClient = new WebClient()
    webClient.getOptions.setCssEnabled(false)
    //获取页面
//    val hostPage: HtmlPage = webClient.getPage("http://baidu.com")
    //    val title = hostPage.getTitleText
    //    val xmlStr = hostPage.asXml()
    //    println(s"title是:$title")
    //    println(s"xmlStr是:$xmlStr")

    val hostPage: JavaScriptPage = webClient.getPage("http://www.sse.com.cn/js/common/companyissuebulletinInformation/companyissuebulletin_new.js")
    println(new String(hostPage.getContent.getBytes("ISO-8859-1"),"utf-8"))
    //
    //    //获取页面的TITLE
    //    val title = hostPage
    //    println(str)
    //    //获取页面的XML代码
    //   val xmlStr = hostPage.asXml();
    //    System.out.println(str);
    //    //获取页面的文本
    //    str = page.asText();
    //    System.out.println(str);
    //    //关闭webclient
    //    webClient.closeAllWindows();
  }

}
