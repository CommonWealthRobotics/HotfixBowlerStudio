println "Launching https://github.com/CommonWealthRobotics/HotfixBowlerStudio/new/master"
//https://github.com/madhephaestus/BowlerSlicer.git
ScriptingEngine.gitScriptRun(
	                "https://github.com/madhephaestus/CSGSlicer.git", // git location of the library
	                      "slice.groovy" , // file to load
	                      []// no parameters but not null
                        );