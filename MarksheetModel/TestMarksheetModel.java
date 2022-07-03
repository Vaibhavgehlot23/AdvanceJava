package MarksheetModel;

import java.util.Iterator;
import java.util.List;

public class TestMarksheetModel {

	public static void main(String[] args) throws Exception {

		// testAdd();
		//testUpdate();
		// testDelete();
		//testGet();
		// testSearch();
		 testGetMeritList();
		
		

	}

	private static void testGetMeritList() throws Exception {

		MarksheetModel model = new MarksheetModel();
		List<MarksheetBean> list = model.getMeritList();
		Iterator<MarksheetBean> it = list.iterator();
		while (it.hasNext()) {
			MarksheetBean mb = (MarksheetBean) it.next();
			System.out.print(mb.getId());
			System.out.print("\t" + mb.getRollno());
			System.out.print("\t" + mb.getFname());
			System.out.print("\t" + mb.getLname());
			System.out.print("\t" + mb.getPhy());
			System.out.print("\t" + mb.getChem());
			System.out.println("\t" + mb.getMaths());
		}

	}

	private static void testSearch() throws Exception {

		MarksheetModel model = new MarksheetModel();
		List<MarksheetBean> list = model.search();
		Iterator<MarksheetBean> it = list.iterator();
		while (it.hasNext()) {
			MarksheetBean mb = it.next();
			System.out.print(mb.getId());
			System.out.print("\t" + mb.getRollno());
			System.out.print("\t" + mb.getFname());
			System.out.print(" " + mb.getLname());
			System.out.print("\t" + mb.getPhy());
			System.out.print("\t" + mb.getChem());
			System.out.println("\t" + mb.getMaths());

		}

	}

	private static void testGet() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setRollno("102");

		MarksheetModel model = new MarksheetModel();
		List<MarksheetBean> list = model.get(bean);
		Iterator<MarksheetBean> it = list.iterator();
		while (it.hasNext()) {
			MarksheetBean mb =  it.next();
			System.out.print(mb.getId());
			System.out.print("\t" + mb.getRollno());
			System.out.print("\t" + mb.getFname());
			System.out.print("\t" + mb.getLname());
			System.out.print("\t" + mb.getPhy());
			System.out.print("\t" + mb.getChem());
			System.out.println("\t" + mb.getMaths());

		}

	}

	private static void testAdd() throws Exception {

		MarksheetBean bean = new MarksheetBean();
		bean.setRollno("1065786");
		bean.setFname("ram");
		bean.setLname("sharma");
		bean.setPhy(80); 
		bean.setChem(92);
		bean.setMaths(89);

		MarksheetModel model = new MarksheetModel();
		model.add(bean);

	}

	private static void testUpdate() throws Exception {

		MarksheetBean bean = new MarksheetBean();

		bean.setId(7);
		bean.setFname("vaibhav");
		bean.setLname("Gehlot");
		bean.setPhy(18);
		bean.setChem(87);
		bean.setMaths(67);
		bean.setRollno("106576");

		MarksheetModel model = new MarksheetModel();
		model.update(bean);

	}

	private static void testDelete() throws Exception {
		MarksheetBean bean = new MarksheetBean();
		bean.setRollno("101");

		MarksheetModel model = new MarksheetModel();
		model.delete(bean);

	}

}
