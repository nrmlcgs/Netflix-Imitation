package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class readymdl_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (readymdl) ","readymdl",3,readymdl.mostCurrent.activityBA,readymdl.mostCurrent,18);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.readymdl.remoteMe.runUserSub(false, "readymdl","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 18;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 20;BA.debugLine="Activity.LoadLayout(\"ReadyLay\")";
Debug.ShouldStop(524288);
readymdl.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ReadyLay")),readymdl.mostCurrent.activityBA);
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
		Debug.PushSubsStack("Activity_Pause (readymdl) ","readymdl",3,readymdl.mostCurrent.activityBA,readymdl.mostCurrent,28);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.readymdl.remoteMe.runUserSub(false, "readymdl","activity_pause", _userclosed);}
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
		Debug.PushSubsStack("Activity_Resume (readymdl) ","readymdl",3,readymdl.mostCurrent.activityBA,readymdl.mostCurrent,24);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.readymdl.remoteMe.runUserSub(false, "readymdl","activity_resume");}
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
public static RemoteObject  _btnstart_click() throws Exception{
try {
		Debug.PushSubsStack("BtnStart_Click (readymdl) ","readymdl",3,readymdl.mostCurrent.activityBA,readymdl.mostCurrent,37);
if (RapidSub.canDelegate("btnstart_click")) { return b4a.example.readymdl.remoteMe.runUserSub(false, "readymdl","btnstart_click");}
 BA.debugLineNum = 37;BA.debugLine="Private Sub BtnStart_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="StartActivity(SignInMdl)";
Debug.ShouldStop(32);
readymdl.mostCurrent.__c.runVoidMethod ("StartActivity",readymdl.processBA,(Object)((readymdl.mostCurrent._signinmdl.getObject())));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lbleks_click() throws Exception{
try {
		Debug.PushSubsStack("Lbleks_Click (readymdl) ","readymdl",3,readymdl.mostCurrent.activityBA,readymdl.mostCurrent,33);
if (RapidSub.canDelegate("lbleks_click")) { return b4a.example.readymdl.remoteMe.runUserSub(false, "readymdl","lbleks_click");}
 BA.debugLineNum = 33;BA.debugLine="Private Sub Lbleks_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="StartActivity(StartMdl)";
Debug.ShouldStop(2);
readymdl.mostCurrent.__c.runVoidMethod ("StartActivity",readymdl.processBA,(Object)((readymdl.mostCurrent._startmdl.getObject())));
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}