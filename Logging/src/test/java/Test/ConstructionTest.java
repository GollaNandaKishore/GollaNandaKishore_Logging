package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Construction_Materials.Material_Standard;
public class ConstructionTest {
	Material_Standard object=new Material_Standard();
	@Test
	public void test() {
		assertEquals("1200INR",object.Const_Materials("standard materials",0));
		assertEquals("1500INR",object.Const_Materials("above standard materials",0));
		assertEquals("1800INR",object.Const_Materials("high standard materials",0));
		assertEquals("2500INR",object.Const_Materials("high standard materials and fully automated home",8));
	}

}
