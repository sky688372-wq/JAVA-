package ex16;

public class Tv extends Product{
	public Tv(String pr_name, int pd_price) {
		super(pr_name, pd_price);
	}

	void changeChannel(int channelNumber) {
		System.out.println(pr_name + "채널을" + channelNumber + "번으로 변경합니다.");
	}
}
