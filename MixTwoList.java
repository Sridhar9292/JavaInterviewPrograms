import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MixTwoList {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(5);
		a.add(7);
		a.add(6);
		a.add(9);

		List<Integer> b = new ArrayList<>();
		b.add(3);
		b.add(10);
		b.add(85);

		int bSize = b.size();

		Iterator<Integer> itr = b.iterator();
		int i = 1;
		while (itr.hasNext()) {

			a.add(i, itr.next());
			itr.remove();
			i = i + 2;
		}

		System.out.println(a);
		System.out.println(b);
	}

}
