println "Launching https://github.com/CommonWealthRobotics/HotfixBowlerStudio/new/master"
int[] version = com.neuronrobotics.bowlerstudio.assets.StudioBuildInfo.getBuildInfo();
//https://github.com/madhephaestus/BowlerSlicer.git

if(version[0]<=1 && version[1]<=3&& version[2]<=1)
ScriptingEngine.gitScriptRun("https://github.com/CommonWealthRobotics/DeviceProviders.git",
											"loadAll.groovy",[])