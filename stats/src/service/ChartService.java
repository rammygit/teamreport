package service;


import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Map;

import javax.imageio.ImageIO;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.data.general.DefaultPieDataset;

import dao.UserDao;

/**
 * charting service with JFreeChart
 * @author ramkumarsundarajan
 *
 */
public class ChartService {

	private UserDao userDao;





	/**
	 * demo method with hardcoded values
	 * @param out
	 * @return
	 * @throws Exception
	 */
	public static OutputStream createPieChart(OutputStream out) throws Exception{

		DefaultPieDataset pieDataset = new DefaultPieDataset();
		pieDataset.setValue("Project", new Integer(3));
		pieDataset.setValue("Defects", new Integer(10));
		pieDataset.setValue("Incident", new Integer(3));
		pieDataset.setValue("Misc", new Integer(5));
		JFreeChart chart = ChartFactory.createPieChart
				("work type Distribution", // Title
						pieDataset, // Dataset
						true, // Show legend
						true, // Use tooltips
						false // Configure chart to generate URLs?
						);

		BufferedImage bufferedImage = chart.createBufferedImage(300, 300);
		ImageIO.write(bufferedImage, "gif", out);

		return out;
	}

	/**
	 * 
	 * @param out
	 * @param dataMap
	 * @return
	 * @throws Exception
	 */
	public static OutputStream createPieChart(OutputStream out,Map<String,Number> dataMap) throws Exception{

		DefaultPieDataset pieDataset = new DefaultPieDataset();
		pieDataset.setValue("A", new Integer(75));
		pieDataset.setValue("B", new Integer(10));
		pieDataset.setValue("C", new Integer(10));
		pieDataset.setValue("D", new Integer(5));
		JFreeChart chart = ChartFactory.createPieChart
				("CSC408 Mark Distribution", // Title
						pieDataset, // Dataset
						true, // Show legend
						true, // Use tooltips
						false // Configure chart to generate URLs?
						);

		BufferedImage bufferedImage = chart.createBufferedImage(300, 300);
		ImageIO.write(bufferedImage, "gif", out);

		return out;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}



}
