println "Launching https://github.com/CommonWealthRobotics/HotfixBowlerStudio/new/master"
int[] version = com.neuronrobotics.bowlerstudio.assets.StudioBuildInfo.getBuildInfo();
//https://github.com/madhephaestus/BowlerSlicer.git
if(version[0]<=0 && version[1]<=27&& version[2]<=1){
ScriptingEngine.gitScriptRun(
	                "https://github.com/madhephaestus/CSGSlicer.git", // git location of the library
	                      "slice.groovy" , // file to load
	                      []// no parameters but not null
                        );
}else{
	println "Using internal slicer"
}
