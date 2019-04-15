package com.itheimaa.response;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * @author shkstart
 * @create 2019-04-15 14:43
 */
@WebServlet(name = "PicCodeServlet" , urlPatterns = "/code")
public class PicCodeServlet extends HttpServlet {
        private Random random = new Random();

        private Color getRandomColor() {

            // 随机生成0-255之间的整数
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);

            return new Color(red, green, blue);

        }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            // 创建缓存图片，指定宽度和高度

      int width = 90, height = 30;
      BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
      // 获取画笔对象
      Graphics graphics = img.getGraphics();
      //设置画笔颜色
      graphics.setColor(Color.WHITE);
      // 填充矩形区域
      graphics.fillRect(0,0,width,height);
      //从字符数组中随机得到字符
      char[] arr = {'A','B','C','D','E','F','N','b','o','y','1','2','3','4','5','6'};
      // 循环四次，画4个字符
      for(int i = 0; i < 4; i++) {
          int index = random.nextInt(arr.length);

          char c = arr[index];
          // 设置字的颜色为随机
          graphics.setColor(getRandomColor());
          //设置字体，大小为18 参数：字体，样式，大小
          graphics.setFont(new Font(Font.DIALOG, Font.BOLD + Font.ITALIC, 19));
          //将每个字符画成图片
          graphics.drawString(String.valueOf(c),10+(i*20),20 );


      }

      for(int i = 0; i < 8; i++) {
          //随机生成8条线，x在width范围之中，y在height范围之中
          int x1 = random.nextInt(width);
          int y1 = random.nextInt(height);
          int x2 = random.nextInt(width);
          int y2 = random.nextInt(height);

          // 画8条干扰线，每条线的颜色不同
          graphics.setColor(getRandomColor());
          graphics.drawLine(x1,y1,x2,y2);


      }

      // 将缓存的图片输出到响应流中
      ImageIO.write(img, "jpg",response.getOutputStream());



  }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request,response);
    }
}
