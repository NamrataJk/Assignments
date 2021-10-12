class employee{
	String name, email, address, birthday;
	public void work(){}
}

class programmer extends employee{
	String programmingLanguage;
	public void code(){}
	public void bugsFix(){}
}

class tester extends employee{
	String testingMethodologies;
	public void test(){}
	public void verify(){}
}

class designer extends employee{
	String designPhilosophy, designTools;
	public void design(){}
}

class businessDeveloper extends employee{
	String specializedDomains;
	public void collectRequirements(){}
	public void analyzeRequirements(){}
	public void writeDocuments(){}
}

class teamLeader extends programmer{
	String teamCollaborationTools, developmentMethods;
	public void schedule(){}
	public void organize(){}
	public void manageProgramers(){}
	public void designers(){}
	public void testers(){}
}

class architect extends programmer{
	String designMethodology;
	public void designSystem(){}
}

class cto extends architect{
	String technologyDomains;
	public void adviceTechnology(){}
}

class ceo extends employee{
	String vision,mission;
	public void manageFinance(){}
}