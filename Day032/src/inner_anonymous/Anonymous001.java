package inner_anonymous;

interface Fish{
	public String fishType();
	public void breath();
}
class FlatFish implements Fish{

	@Override
	public String fishType() {
		
		return "광어";
	}

	@Override
	public void breath() {
		System.out.println(this.fishType() +"는 모래바닥에서 숨을 쉽니다.");
		
	}
	
}

public class Anonymous001 {
	public static void main(String[] args) {
		Fish fish = new FlatFish(); fish.breath();
		
		Fish fish2 = new Fish() {
			@Override public String fishType() {return "붕어";}
			@Override public void breath() {System.out.println(this.fishType()+"는 맛있어");}
		};
		fish2.breath();
	}

}
