package theatreProject;

public class Start_Theatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theatre T1 = new Theatre("Inox","Panaji",150,9.0f);
		Theatre T2 = new Theatre("Radha Krishna","Sanquelim");
		Theatre T3 = new Theatre("Royal House");
		T3.SetCapacity(250);
		T3.SetRating(9.9f);
		T2.SetCapacity(300);
		T2.SetRating(6.9f);
		System.out.println("Inox Rating : " + T1.GetRating() + ", and Capacity : " + T1.GetCapacity());
	}

}
