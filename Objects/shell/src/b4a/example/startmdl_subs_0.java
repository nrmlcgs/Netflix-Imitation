package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class startmdl_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (startmdl) ","startmdl",2,startmdl.mostCurrent.activityBA,startmdl.mostCurrent,20);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.startmdl.remoteMe.runUserSub(false, "startmdl","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 20;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 22;BA.debugLine="Activity.LoadLayout(\"StartLayout\")";
Debug.ShouldStop(2097152);
startmdl.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("StartLayout")),startmdl.mostCurrent.activityBA);
 BA.debugLineNum = 23;BA.debugLine="HorizontalScrollView1.Panel.LoadLayout(\"HsvConten";
Debug.ShouldStop(4194304);
startmdl.mostCurrent._horizontalscrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("HsvContent")),startmdl.mostCurrent.activityBA);
 BA.debugLineNum = 24;BA.debugLine="HorizontalScrollView1.Panel.Width = Panel1.Width";
Debug.ShouldStop(8388608);
startmdl.mostCurrent._horizontalscrollview1.runMethod(false,"getPanel").runMethod(true,"setWidth",startmdl.mostCurrent._panel1.runMethod(true,"getWidth"));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (startmdl) ","startmdl",2,startmdl.mostCurrent.activityBA,startmdl.mostCurrent,32);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.startmdl.remoteMe.runUserSub(false, "startmdl","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Activity_Resume (startmdl) ","startmdl",2,startmdl.mostCurrent.activityBA,startmdl.mostCurrent,28);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.startmdl.remoteMe.runUserSub(false, "startmdl","activity_resume");}
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Resume";
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
public static RemoteObject  _btngetstarted_click() throws Exception{
try {
		Debug.PushSubsStack("BtnGetStarted_Click (startmdl) ","startmdl",2,startmdl.mostCurrent.activityBA,startmdl.mostCurrent,37);
if (RapidSub.canDelegate("btngetstarted_click")) { return b4a.example.startmdl.remoteMe.runUserSub(false, "startmdl","btngetstarted_click");}
 BA.debugLineNum = 37;BA.debugLine="Private Sub BtnGetStarted_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="StartActivity(ReadyMdl)";
Debug.ShouldStop(32);
startmdl.mostCurrent.__c.runVoidMethod ("StartActivity",startmdl.processBA,(Object)((startmdl.mostCurrent._readymdl.getObject())));
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
public static RemoteObject  _btnsignin_click() throws Exception{
try {
		Debug.PushSubsStack("btnSignIn_Click (startmdl) ","startmdl",2,startmdl.mostCurrent.activityBA,startmdl.mostCurrent,41);
if (RapidSub.canDelegate("btnsignin_click")) { return b4a.example.startmdl.remoteMe.runUserSub(false, "startmdl","btnsignin_click");}
 BA.debugLineNum = 41;BA.debugLine="Private Sub btnSignIn_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="StartActivity(SignInMdl)";
Debug.ShouldStop(512);
startmdl.mostCurrent.__c.runVoidMethod ("StartActivity",startmdl.processBA,(Object)((startmdl.mostCurrent._signinmdl.getObject())));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
 //BA.debugLineNum = 16;BA.debugLine="Private Panel1 As Panel";
startmdl.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private HorizontalScrollView1 As HorizontalScroll";
startmdl.mostCurrent._horizontalscrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.HorizontalScrollViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}