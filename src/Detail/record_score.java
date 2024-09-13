package Detail;

public class record_score extends TrueToFalse{
	protected static int score=0;
	public record_score() {super();}
	protected void update_score() {
		score++;
	}
	protected void decrease_score() {
		score--;
	}
}
