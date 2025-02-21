package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class profilesmdl_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (profilesmdl) ","profilesmdl",12,profilesmdl.mostCurrent.activityBA,profilesmdl.mostCurrent,18);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.profilesmdl.remoteMe.runUserSub(false, "profilesmdl","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 18;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 20;BA.debugLine="Activity.LoadLayout(\"ProfilesLay\")";
Debug.ShouldStop(524288);
profilesmdl.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ProfilesLay")),profilesmdl.mostCurrent.activityBA);
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (profilesmdl) ","profilesmdl",12,profilesmdl.mostCurrent.activityBA,profilesmdl.mostCurrent,28);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.profilesmdl.remoteMe.runUserSub(false, "profilesmdl","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (profilesmdl) ","profilesmdl",12,profilesmdl.mostCurrent.activityBA,profilesmdl.mostCurrent,24);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.profilesmdl.remoteMe.runUserSub(false, "profilesmdl","activity_resume");}
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lblback_click() throws Exception{
try {
		Debug.PushSubsStack("LblBack_Click (profilesmdl) ","profilesmdl",12,profilesmdl.mostCurrent.activityBA,profilesmdl.mostCurrent,37);
if (RapidSub.canDelegate("lblback_click")) { return b4a.example.profilesmdl.remoteMe.runUserSub(false, "profilesmdl","lblback_click");}
 BA.debugLineNum = 37;BA.debugLine="Private Sub LblBack_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="StartActivity(HomeMdl)";
Debug.ShouldStop(32);
profilesmdl.mostCurrent.__c.runVoidMethod ("StartActivity",profilesmdl.processBA,(Object)((profilesmdl.mostCurrent._homemdl.getObject())));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _signout_click() throws Exception{
try {
		Debug.PushSubsStack("SignOut_Click (profilesmdl) ","profilesmdl",12,profilesmdl.mostCurrent.activityBA,profilesmdl.mostCurrent,33);
if (RapidSub.canDelegate("signout_click")) { return b4a.example.profilesmdl.remoteMe.runUserSub(false, "profilesmdl","signout_click");}
 BA.debugLineNum = 33;BA.debugLine="Private Sub SignOut_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="StartActivity(StartMdl)";
Debug.ShouldStop(2);
profilesmdl.mostCurrent.__c.runVoidMethod ("StartActivity",profilesmdl.processBA,(Object)((profilesmdl.mostCurrent._startmdl.getObject())));
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}