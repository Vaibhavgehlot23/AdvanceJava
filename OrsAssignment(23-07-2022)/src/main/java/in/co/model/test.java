package in.co.model;
import java.util.Iterator;
import java.util.List;

import in.co.Bean.MarksheetBean;
import in.co.Bean.RegistrationBean;
import in.co.Bean.StudentBean;
public class test {
	



	

		public static void main(String[] args) throws Exception {
         //Add();
		// testAdd();
			//testUpdate();
			// testDelete();
			testGet();
		//testSearch();
			// testGetMeritList();
			
			

		}

		private static void testGetMeritList() throws Exception {

			MarksheetModel model = new MarksheetModel();
			List<MarksheetBean> list = model.getMeritList();
			Iterator<MarksheetBean> it = list.iterator();
			while (it.hasNext()) {
				MarksheetBean mb = (MarksheetBean) it.next();
				System.out.print(mb.getId());
				System.out.print("\t" + mb.getRollno());
				System.out.print("\t" + mb.getName());
				
				System.out.print("\t" + mb.getPhy());
				System.out.print("\t" + mb.getChem());
				System.out.println("\t" + mb.getMaths());
			}

		}

	/*
	 * private static void testSearch() throws Exception {
	 * 
	 * MarksheetModel model = new MarksheetModel(); //List<MarksheetBean> list =
	 * model.search(); Iterator<MarksheetBean> it = list.iterator(); while
	 * (it.hasNext()) { MarksheetBean mb = it.next(); System.out.print(mb.getId());
	 * System.out.print("\t" + mb.getRollno()); System.out.print("\t" +
	 * mb.getName());
	 * 
	 * System.out.print("\t" + mb.getPhy()); System.out.print("\t" + mb.getChem());
	 * System.out.println("\t" + mb.getMaths());
	 * 
	 * }
	 * 
	 * }
	 */
		private static void testGet() throws Exception {
			MarksheetBean bean = new MarksheetBean();
			bean.setRollno("1065786");

			MarksheetModel model = new MarksheetModel();
			List<MarksheetBean> list = model.get(bean);
			Iterator<MarksheetBean> it = list.iterator();
			while (it.hasNext()) {
				MarksheetBean mb =  it.next();
				System.out.print(mb.getId());
				System.out.print("\t" + mb.getRollno());
				
				System.out.print("\t" + mb.getName());
				System.out.print("\t" + mb.getPhy());
				System.out.print("\t" + mb.getChem());
				System.out.println("\t" + mb.getMaths());

			}

		}

		private static void testAdd() throws Exception {

			MarksheetBean bean = new MarksheetBean();
			bean.setRollno("1065786");
			bean.setName("ram");
			
			bean.setPhy(80); 
			bean.setChem(92);
			bean.setMaths(89);

			MarksheetModel model = new MarksheetModel();
			model.add(bean);

		}

		private static void Add() throws Exception {

			RegistrationBean bean = new RegistrationBean();
			
			bean.setFirstName("kj");
			
			bean.setLastName("jj");
			bean.setLogin("kj@gmail.com");
			bean.setPassword("Krip@123");
			bean.setGender("male");
			//bean.setDob("2000-09-09");
			bean.setMobileNo("0987654");
			

			RegistrationModel model = new  RegistrationModel();
			model.add(bean);

		}

		private static void testUpdate() throws Exception {

			StudentBean bean = new StudentBean();

			
		/* bean.setId(7); */
			bean.setFirstName("t");
			
			bean.setLastName("gs");
			bean.setSession("288");
			
			bean.setRollNo("101");

			StudentModel model = new StudentModel();
			model.update(bean);

		}

		private static void testDelete() throws Exception {
			MarksheetBean bean = new MarksheetBean();
			bean.setRollno("114");

			MarksheetModel model = new MarksheetModel();
			model.delete(bean);

		}

	}



