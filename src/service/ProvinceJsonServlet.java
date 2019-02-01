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
		// ����ʡ��ID��ѯ��Ӧ�ĳ�����Ϣ
		String pid = request.getParameter("pid");
		ProvinceService provinceService = new ProvinceService();
		try { // ��ѯ���е���Ϣ����
			List<City> city = provinceService.findCity(pid);
			// ��list���ϵ�����ת��Ϊjson��ʽ
			JSONArray jsonArray = JSONArray.fromObject(city);
			// ��������������ݵķ�ʽ,��ֹ�������ݵ�����
			response.setContentType("text/html;chaeset=UTF-8");
			// ����response�Ļ������ı���ĸ�ʽ
			response.setCharacterEncoding("UTF-8");
			response.getWriter().println(jsonArray.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ProvinceService provinceService = new ProvinceService();
		// try { // �����ݿ��л�ȡʡ�ݵ���Ϣ
		// List<Province> province = provinceService.findProvince();
		// ��LIst����ת��JSON:ȥ������ĳЩ�ֶ�
		// JsonConfig config = new JsonConfig(); ����jsonת�������ö���
		// config.setExcludes(new String[]{"pid"}); ������Ҫ������json�е��ֶη���������
		// ʹ��json��List��������ת��Ϊjson��ʽ��ȥ��ָ�������ö����е��ֶ�
		// JSONArray jsonArray = JSONArray.fromObject(list,config);
		// ����ѯ������Ϣת��Ϊjson��ʽ JSONArray jsonArr = JSONArray.fromObject(province);
		// ����������ݵ�����,��ֹ�������� response.setContentType("text/html;charset=UTF-8");
		// ���json����ʱ���뽫JSONArray����תΪString����
		// response.getWriter().println(jsonArr.toString());
		// } catch (SQLException e) { e.printStackTrace();
		// } }
		// }}
	}
}
