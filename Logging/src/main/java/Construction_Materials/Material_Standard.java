package Construction_Materials;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Material_Standard implements Construction{
	private static final Logger LOGGER =LogManager.getLogger(Material_Standard.class);
	static String Material_Standard="";
	static int Area;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Material_Standard object=new Material_Standard();
		LOGGER.debug("Enter Material standard : standard materials or above standard materials or high standard materials or high standard materials and fully automated home:");
		 Material_Standard=scan.nextLine();
		 LOGGER.info(Material_Standard);
		 LOGGER.debug("Enter Area if you want fully automated house otherwise make it 0 : ");
		 Area=scan.nextInt();
		 LOGGER.info(Area);
		 LOGGER.debug("Amount estimated for Construction :");
		 LOGGER.info(object.Const_Materials(Material_Standard,Area));
		
	}
	

	public String Const_Materials(String Material_Standard, int Area) {
		if(Material_Standard.contentEquals("standard materials")&&Area==0) {
			return "1200INR";
		}
		if(Material_Standard.contentEquals("above standard materials")&&Area==0)
			return "1500INR";
		if(Material_Standard.contentEquals("high standard materials")&&Area==0)
		return "1800INR";
		if(Material_Standard.contentEquals("high standard materials and fully automated home")&&Area>0)
			return "2500INR";
			return null;
	}
}