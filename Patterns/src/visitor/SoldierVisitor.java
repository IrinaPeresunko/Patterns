package visitor;
/**
 * 
 * SoldierVisitor
 *
 */
public class SoldierVisitor implements UnitVisitor {

	public void visitSoldier(Soldier soldier) {
		System.out.println("Greetings " + soldier);
	}

	public void visitSergeant(Sergeant sergeant) {
		System.out.println(sergeant+" in the SoldierVisitor ");
	}

	public void visitCommander(Commander commander) {
		System.out.println(commander+" in the SoldierVisitor");
	}

}
