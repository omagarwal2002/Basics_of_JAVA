package lab7;
class nonumeric extends Exception {

	nonumeric()
    {
        super("the value is non numeric \n");
    }
}
public class Q2_main {
	public static void main(String ar[]) {
        int a, b, c = 0;
        System.out.println("Name : Om Agrawal | Sap : 500087764");
        try {
            a = Integer.parseInt(ar[0]);
            throw new nonumeric();
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (nonumeric e) {
            System.out.println(e);
        }
    }

}
