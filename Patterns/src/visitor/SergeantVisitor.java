package visitor;

/**
 * 
 * SergeantVisitor
 *
 */
public class SergeantVisitor implements UnitVisitor {

	public void visitSoldier(Soldier soldier) {
		System.out.println(soldier+" in the SergeantVisitor ");
	}

	public void visitSergeant(Sergeant sergeant) {
		System.out.println("Hello " + sergeant);
	}

	public void visitCommander(Commander commander) {
		System.out.println(commander+" in the SergeantVisitor");
	}

}
