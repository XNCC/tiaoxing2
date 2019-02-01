package service;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

public class ProvinceJsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 根据省份ID查询对应的城市信息
		String pid = request.getParameter("pid");
		ProvinceService provinceService = new ProvinceService();
		try { // 查询城市的信息集合
			List<City> city = provinceService.findCity(pid);
			// 将list集合的数据转换为json格式
			JSONArray jsonArray = JSONArray.fromObject(city);
			// 设置浏览器打开数据的方式,防止中文数据的乱码
			response.setContentType("text/html;chaeset=UTF-8");
			// 设置response的缓冲区的编码的格式
			response.setCharacterEncoding("UTF-8");
			response.getWriter().println(jsonArray.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ProvinceService provinceService = new ProvinceService();
		// try { // 从数据库中获取省份的信息
		// List<Province> province = provinceService.findProvince();
		// 将LIst集合转成JSON:去除其中某些字段
		// JsonConfig config = new JsonConfig(); 创建json转换的配置对象
		// config.setExcludes(new String[]{"pid"}); 将不需要出现在json中的字段放在数组中
		// 使用json将List集合数据转换为json格式并去除指定的配置对象中的字段
		// JSONArray jsonArray = JSONArray.fromObject(list,config);
		// 将查询到的信息转换为json格式 JSONArray jsonArr = JSONArray.fromObject(province);
		// 设置输出数据的类型,防止中文乱码 response.setContentType("text/html;charset=UTF-8");
		// 输出json数据时必须将JSONArray类型转为String类型
		// response.getWriter().println(jsonArr.toString());
		// } catch (SQLException e) { e.printStackTrace();
		// } }
		// }}
	}
}
