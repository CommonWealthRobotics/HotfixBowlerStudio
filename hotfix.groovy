println "Launching https://github.com/CommonWealthRobotics/HotfixBowlerStudio/new/master"

ScriptingEngine.gitScriptRun(
	                "https://github.com/madhephaestus/BowlerSlicer.git", // git location of the library
	                      "SliceTest.groovy" , // file to load
	                      []// no parameters but not null
                        );