println "Launching https://github.com/CommonWealthRobotics/HotfixBowlerStudio/new/master"
//https://github.com/madhephaestus/BowlerSlicer.git
ScriptingEngine.gitScriptRun(
	                "https://gist.github.com/44d3d390483b3d1bec11b63ac0c012a6.git", // git location of the library
	                      "SliceTest.groovy" , // file to load
	                      []// no parameters but not null
                        );