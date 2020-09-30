public enum HypixelString {

	// Scoreboard
	SKYBLOCK_COOP(103356), // SkyBlock%%aqua%%%%bold%% CO-OP
	SKYBLOCK_GUEST(103354), // SkyBlock%%green%%%%bold%% GUEST

	// Skills
	ENCHANTING(45822), // Enchanting
	COMBAT(99526), // Combat
	FARMING(99528), // Farming
	FISHING(99530), // Fishing
	MINING(99532), // Mining
	FORAGING(99534), // Foraging
	ALCHEMY(99538), // Alchemy
	CARPENTRY(99540), // Carpentry
	RUNECRAFTING(99542), // Runecrafting
	;

	private int id;

	HypixelString(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
}
