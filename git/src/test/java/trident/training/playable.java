package trident.training;

interface playing {
	void play();
}

class guitar implements playing {

	@Override
	public void play() {
		System.out.println("play guitar");

	}
}

//	class piano implements playing{
//
//		@Override
//		public void play() {
//			System.out.println("play piano");			
//		}
//	}
public class playable extends guitar {

	public static void main(String[] args) {
		playable pl = new playable();
		pl.play();
	}

}
