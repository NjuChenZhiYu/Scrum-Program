package com.scrum.Library.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import org.springframework.web.bind.annotation.ResponseBody;

//登陆界面的验证码功能
@SuppressWarnings("restriction")
public class IdentityCode {

//	 验证码的随机数
	public static final char[] CHARS = { '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'D' };
//	声明随机数的对象
	public static Random random = new Random();

//	获取验证码在页面显示的六个数
	public static String getRandomString() {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < 4; i++) {
			buffer.append(CHARS[random.nextInt(CHARS.length)]);
		}
		return buffer.toString();
	}

//	得到背景色
	public static Color getRandomColor() {
		return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
	}

//	得到验证码的前景色
	public static Color getReverseColor(Color c) {
		return new Color(255 - c.getRed(), 255 - c.getGreen(), 255 - c.getBlue());
	}

//	生成验证码的图片，并在session中存储验证码的值
	@ResponseBody
	public static void outputIdentity(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//设置图片的格式
		response.setContentType("image/jpeg");
		String randomString = getRandomString();
		//将验证码的值绑到session中
		request.getSession().setAttribute("randomString", randomString);
		int width = 100;
		int height = 30;
		Color color = getRandomColor();
		Color reverse = getReverseColor(color);
		BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics2D g = bi.createGraphics();
		g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
		g.setColor(color);
		g.fillRect(0, 0, width, height);
		g.setColor(reverse);
		g.drawString(randomString, 18, 20);
		//转化成jpg的格式
		ServletOutputStream out = response.getOutputStream();

		//Linux部署无法显示验证码，新版本jdk1.8不再支持JPEGCodec
//		JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
//		encoder.encode(bi);
		//修改如下
		ImageIO.write(bi,"jpg",out);
		out.flush();
	}
}
