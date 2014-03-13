package hensun.SpringHello;


public aspect JudageAspect {
	private CritiEngine critiEngine;

	public JudageAspect() {}
	
	pointcut peformance(): execution(* perform(..));
	
	after() returning(): peformance() {
		System.out.println(critiEngine.getCriti());
	}
	
	public void setCritiEngine(CritiEngine critiEngine) {
		this.critiEngine = critiEngine;
	}
}
