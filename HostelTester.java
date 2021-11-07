public class HostelTester {

	public static void main(String[] args) {

		Hostel tenent1 = new Hostel();

		tenent1.setFees(500000);
		tenent1.setHostelName("GRS Hostel");
		tenent1.setOwnerName("Srushti");
		tenent1.setRoomNo((byte)105);
		tenent1.setTenentName("Chitti");

		System.out.println(tenent1.getFees());
		System.out.println(tenent1.getHostelName());
		System.out.println(tenent1.getOwnerName());
		System.out.println(tenent1.getRoomNo());
		System.out.println(tenent1.getTenentName());

	}

}