package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class searchmdl_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (searchmdl) ","searchmdl",13,searchmdl.mostCurrent.activityBA,searchmdl.mostCurrent,20);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.searchmdl.remoteMe.runUserSub(false, "searchmdl","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 20;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 22;BA.debugLine="Activity.LoadLayout(\"SearchLay\")";
Debug.ShouldStop(2097152);
searchmdl.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("SearchLay")),searchmdl.mostCurrent.activityBA);
 BA.debugLineNum = 23;BA.debugLine="ScrollView1.Panel.LoadLayout(\"SclSearch\")";
Debug.ShouldStop(4194304);
searchmdl.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("SclSearch")),searchmdl.mostCurrent.activityBA);
 BA.debugLineNum = 24;BA.debugLine="ScrollView1.Panel.Height = Label1.Top";
Debug.ShouldStop(8388608);
searchmdl.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",searchmdl.mostCurrent._label1.runMethod(true,"getTop"));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Activity_Pause (searchmdl) ","searchmdl",13,searchmdl.mostCurrent.activityBA,searchmdl.mostCurrent,33);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.searchmdl.remoteMe.runUserSub(false, "searchmdl","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (searchmdl) ","searchmdl",13,searchmdl.mostCurrent.activityBA,searchmdl.mostCurrent,29);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.searchmdl.remoteMe.runUserSub(false, "searchmdl","activity_resume");}
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
 //BA.debugLineNum = 16;BA.debugLine="Private ScrollView1 As ScrollView";
searchmdl.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private Label1 As Label";
searchmdl.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lblback_click() throws Exception{
try {
		Debug.PushSubsStack("LblBack_Click (searchmdl) ","searchmdl",13,searchmdl.mostCurrent.activityBA,searchmdl.mostCurrent,39);
if (RapidSub.canDelegate("lblback_click")) { return b4a.example.searchmdl.remoteMe.runUserSub(false, "searchmdl","lblback_click");}
 BA.debugLineNum = 39;BA.debugLine="Private Sub LblBack_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="StartActivity(HomeMdl)";
Debug.ShouldStop(128);
searchmdl.mostCurrent.__c.runVoidMethod ("StartActivity",searchmdl.processBA,(Object)((searchmdl.mostCurrent._homemdl.getObject())));
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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