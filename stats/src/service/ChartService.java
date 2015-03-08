package service;


import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

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
	
	
	
	

	public static OutputStream createPieChart(OutputStream out) throws Exception{
		String imageMap = null;
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

//		ChartRenderingInfo info = new ChartRenderingInfo(
//	            new StandardEntityCollection());
		
		//ByteArrayOutputStream out = new ByteArrayOutputStream();
        //ChartUtilities.writeChartAsPNG(out, chart, 600, 400, info);		
        //imageMap =  ChartUtilities.getImageMap("chart", info);
		//out.close();
		
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
