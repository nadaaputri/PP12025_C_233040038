package pertemuan4Tugas;

public class ListMainB {

	public static void main(String[] args) {
		StrukturList list = new StrukturList();
		list.addTail(4.5);
		list.addTail(5.5);
		list.addHead(2.1);
		list.addHead(3.4);
		list.addMid(1.1, 3);
		
		list.displayElement();
	}
}
