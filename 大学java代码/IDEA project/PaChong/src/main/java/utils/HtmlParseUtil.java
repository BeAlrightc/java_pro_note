package utils;

import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import pojo.Content;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class HtmlParseUtil {
    public static void main(String[] args) throws Exception {
      new HtmlParseUtil().parseJD("vue").forEach(System.out::println);

    }

    public  List<Content> parseJD(String keywords) throws Exception {
        //获得请求前提必须联网
        String url = "https://search.jd.com/Search?keyword="+keywords;
        //解析网页(Jsoup返回Document就是浏览器Document对象)
        Document document= Jsoup.parse(new URL(url),30000);
        //所有你在js中可以使用的方法都可以使用
        Element element= document.getElementById("J_goodsList");
       // System.out.println(element.html());
        //获取所有的li元素
        Elements elements=document.getElementsByTag("li");
        //获取元素中的内容,el就是一个列标签
        ArrayList<Content> goods =new ArrayList<>();
        for (Element el : elements) {
            //关于图片特别多的网站，所欲的图片都是延迟加载的(懒加载)
            //source-data-lazy-img
            String img=el.getElementsByTag("img").eq(0).attr("data-lazy-img");
            String price=el.getElementsByClass("p-price").eq(0).text();
            String title=el.getElementsByClass("p-name").eq(0).text();

            Content content =new Content();
            content.setTitle(title);
            content.setPrice(price);
            content.setImg(img);
            goods.add(content);
        }
        // System.out.println(element.html());
        return goods;
    }
}
