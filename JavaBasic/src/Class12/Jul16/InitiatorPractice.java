package Class12.Jul16;

public class InitiatorPractice {

	public static void main(String[] args) {
		Initiator s = new Initiator("201701", "邵发", true);
		System.out.println(s.id+" "+s.name+" "+s.sex);
		Initiator s2 = new Initiator("201701", "邵发", false);
		System.out.println(s2.id+" "+s2.name+" "+s2.sex);
		}
	}