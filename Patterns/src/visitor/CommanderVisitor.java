package visitor;

/**
 * 
 * CommanderVisitor
 *
 */
public class CommanderVisitor implements UnitVisitor {

	public void visitSoldier(Soldier soldier) {
		System.out.println(soldier+" in the CommanderVisitor ");
	}

	public void visitSergeant(Sergeant sergeant) {
		System.out.println(sergeant+" in the CommanderVisitor ");
	}

	public void visitCommander(Commander commander) {
		System.out.println("Good to see you " + commander);
	}

}
