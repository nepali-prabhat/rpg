package rpg;

public class events_display {

public static void main(String[] args) {
	predetor beer1 = predetor.beer;
	predetor tiger1 = predetor.tiger;
	prey elephant1 = prey.Elephant;
	prey sheep1 = prey.Deer;
	System.out.println("hp before attack is "+ elephant1.getHp());
	beer1.attack(elephant1);
	tiger1.attack(elephant1);
	tiger1.attack(elephant1);
	System.out.println("the hp of beer1 is "+ elephant1.getHp());
}

}