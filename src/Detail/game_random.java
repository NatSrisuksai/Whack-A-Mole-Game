package Detail;
import java.util.Random;
public class game_random extends record_score{
	Random rand = new Random();
	protected int int_random;
	protected int all;
	public game_random() {
		super();
		all = 9;
		int_random = rand.nextInt(all);
	}
}
