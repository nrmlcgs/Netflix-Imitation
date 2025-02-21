package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class categoriesmdl_subs_0 {


public static RemoteObject  _activity_click() throws Exception{
try {
		Debug.PushSubsStack("Activity_Click (categoriesmdl) ","categoriesmdl",11,categoriesmdl.mostCurrent.activityBA,categoriesmdl.mostCurrent,37);
if (RapidSub.canDelegate("activity_click")) { return b4a.example.categoriesmdl.remoteMe.runUserSub(false, "categoriesmdl","activity_click");}
 BA.debugLineNum = 37;BA.debugLine="Private Sub Activity_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="StartActivity(HomeMdl)";
Debug.ShouldStop(32);
categoriesmdl.mostCurrent.__c.runVoidMethod ("StartActivity",categoriesmdl.processBA,(Object)((categoriesmdl.mostCurrent._homemdl.getObject())));
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
public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (categoriesmdl) ","categoriesmdl",11,categoriesmdl.mostCurrent.activityBA,categoriesmdl.mostCurrent,20);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.categoriesmdl.remoteMe.runUserSub(false, "categoriesmdl","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 20;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 22;BA.debugLine="Activity.LoadLayout(\"CategoriesLay\")";
Debug.ShouldStop(2097152);
categoriesmdl.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("CategoriesLay")),categoriesmdl.mostCurrent.activityBA);
 BA.debugLineNum = 23;BA.debugLine="ScrollView1.Panel.LoadLayout(\"SclCategories\")";
Debug.ShouldStop(4194304);
categoriesmdl.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("SclCategories")),categoriesmdl.mostCurrent.activityBA);
 BA.debugLineNum = 24;BA.debugLine="ScrollView1.Panel.Height = LblEnd.Top";
Debug.ShouldStop(8388608);
categoriesmdl.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",categoriesmdl.mostCurrent._lblend.runMethod(true,"getTop"));
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
		Debug.PushSubsStack("Activity_Pause (categoriesmdl) ","categoriesmdl",11,categoriesmdl.mostCurrent.activityBA,categoriesmdl.mostCurrent,32);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.categoriesmdl.remoteMe.runUserSub(false, "categoriesmdl","activity_pause", _userclosed);}
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
		Debug.PushSubsStack("Activity_Resume (categoriesmdl) ","categoriesmdl",11,categoriesmdl.mostCurrent.activityBA,categoriesmdl.mostCurrent,28);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.categoriesmdl.remoteMe.runUserSub(false, "categoriesmdl","activity_resume");}
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private LblEnd As Label";
categoriesmdl.mostCurrent._lblend = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private ScrollView1 As ScrollView";
categoriesmdl.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _label23_click() throws Exception{
try {
		Debug.PushSubsStack("Label23_Click (categoriesmdl) ","categoriesmdl",11,categoriesmdl.mostCurrent.activityBA,categoriesmdl.mostCurrent,41);
if (RapidSub.canDelegate("label23_click")) { return b4a.example.categoriesmdl.remoteMe.runUserSub(false, "categoriesmdl","label23_click");}
 BA.debugLineNum = 41;BA.debugLine="Private Sub Label23_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="StartActivity(HomeMdl)";
Debug.ShouldStop(512);
categoriesmdl.mostCurrent.__c.runVoidMethod ("StartActivity",categoriesmdl.processBA,(Object)((categoriesmdl.mostCurrent._homemdl.getObject())));
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}