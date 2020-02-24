package Presentation_Layer;
import java.io.*;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Construction_Materials.Material_Standard;
import Presentation_Layer.SI_CI.Presented;

public class Present implements Presented{
	private static final Logger LOGGER =LogManager.getLogger(Material_Standard.class);
public static void main(String[] args) {
	Present object=new Present();
	Scanner scanObject=new Scanner(System.in);
	LOGGER.debug("Principle Amount : ");
	int Principle_Amount=scanObject.nextInt();
	LOGGER.debug("Rate of Interest : ");
	int Rate_Of_Interest=scanObject.nextInt();
	LOGGER.debug("Time : ");
	int Time=scanObject.nextInt();
	LOGGER.debug("Simple Interest :");
	LOGGER.info(object.Simple_Interest(Principle_Amount,Rate_Of_Interest,Time));
	LOGGER.debug("Compound Interest :");
	LOGGER.info(object.Compound_Interest(Principle_Amount,Rate_Of_Interest,Time));

}

public int Simple_Interest(int Principle_Amount, int Rate_Of_Interest, int Time) {
	int Simple_Interest_result=(Principle_Amount*Time*Rate_Of_Interest)/100;
	return Simple_Interest_result;
}

public int Compound_Interest(int Principle_Amount, int Rate_Of_Interest, int Time) {
	double Compound_Interest_result=Principle_Amount*(Math.pow(1.0+Rate_Of_Interest/100.0,Time)-1.0);
	//float result=(float)Compound_Interest_result;
	return (int)Math.round(Compound_Interest_result);
}
}