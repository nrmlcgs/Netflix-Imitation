package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class fastmdl_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (fastmdl) ","fastmdl",9,fastmdl.mostCurrent.activityBA,fastmdl.mostCurrent,20);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.fastmdl.remoteMe.runUserSub(false, "fastmdl","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 20;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 22;BA.debugLine="Activity.LoadLayout(\"FastLay\")";
Debug.ShouldStop(2097152);
fastmdl.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("FastLay")),fastmdl.mostCurrent.activityBA);
 BA.debugLineNum = 23;BA.debugLine="ScrollView1.Panel.LoadLayout(\"SclFast\")";
Debug.ShouldStop(4194304);
fastmdl.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("SclFast")),fastmdl.mostCurrent.activityBA);
 BA.debugLineNum = 24;BA.debugLine="ScrollView1.Panel.Height = LblEnd.Top";
Debug.ShouldStop(8388608);
fastmdl.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",fastmdl.mostCurrent._lblend.runMethod(true,"getTop"));
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
		Debug.PushSubsStack("Activity_Pause (fastmdl) ","fastmdl",9,fastmdl.mostCurrent.activityBA,fastmdl.mostCurrent,32);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.fastmdl.remoteMe.runUserSub(false, "fastmdl","activity_pause", _userclosed);}
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
		Debug.PushSubsStack("Activity_Resume (fastmdl) ","fastmdl",9,fastmdl.mostCurrent.activityBA,fastmdl.mostCurrent,28);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.fastmdl.remoteMe.runUserSub(false, "fastmdl","activity_resume");}
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
 //BA.debugLineNum = 16;BA.debugLine="Private ScrollView1 As ScrollView";
fastmdl.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private LblEnd As Label";
fastmdl.mostCurrent._lblend = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imgdownload_click() throws Exception{
try {
		Debug.PushSubsStack("imgDownload_Click (fastmdl) ","fastmdl",9,fastmdl.mostCurrent.activityBA,fastmdl.mostCurrent,37);
if (RapidSub.canDelegate("imgdownload_click")) { return b4a.example.fastmdl.remoteMe.runUserSub(false, "fastmdl","imgdownload_click");}
 BA.debugLineNum = 37;BA.debugLine="Private Sub imgDownload_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="StartActivity(DownloadMdl)";
Debug.ShouldStop(32);
fastmdl.mostCurrent.__c.runVoidMethod ("StartActivity",fastmdl.processBA,(Object)((fastmdl.mostCurrent._downloadmdl.getObject())));
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
public static RemoteObject  _imggames_click() throws Exception{
try {
		Debug.PushSubsStack("imgGames_Click (fastmdl) ","fastmdl",9,fastmdl.mostCurrent.activityBA,fastmdl.mostCurrent,53);
if (RapidSub.canDelegate("imggames_click")) { return b4a.example.fastmdl.remoteMe.runUserSub(false, "fastmdl","imggames_click");}
 BA.debugLineNum = 53;BA.debugLine="Private Sub imgGames_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="StartActivity(GamesMdl)";
Debug.ShouldStop(2097152);
fastmdl.mostCurrent.__c.runVoidMethod ("StartActivity",fastmdl.processBA,(Object)((fastmdl.mostCurrent._gamesmdl.getObject())));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imghome_click() throws Exception{
try {
		Debug.PushSubsStack("imgHome_Click (fastmdl) ","fastmdl",9,fastmdl.mostCurrent.activityBA,fastmdl.mostCurrent,65);
if (RapidSub.canDelegate("imghome_click")) { return b4a.example.fastmdl.remoteMe.runUserSub(false, "fastmdl","imghome_click");}
 BA.debugLineNum = 65;BA.debugLine="Private Sub imgHome_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imghome_longclick() throws Exception{
try {
		Debug.PushSubsStack("imgHome_LongClick (fastmdl) ","fastmdl",9,fastmdl.mostCurrent.activityBA,fastmdl.mostCurrent,61);
if (RapidSub.canDelegate("imghome_longclick")) { return b4a.example.fastmdl.remoteMe.runUserSub(false, "fastmdl","imghome_longclick");}
 BA.debugLineNum = 61;BA.debugLine="Private Sub imgHome_LongClick";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imgnew_click() throws Exception{
try {
		Debug.PushSubsStack("imgNew_Click (fastmdl) ","fastmdl",9,fastmdl.mostCurrent.activityBA,fastmdl.mostCurrent,45);
if (RapidSub.canDelegate("imgnew_click")) { return b4a.example.fastmdl.remoteMe.runUserSub(false, "fastmdl","imgnew_click");}
 BA.debugLineNum = 45;BA.debugLine="Private Sub imgNew_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="StartActivity(NewMdl)";
Debug.ShouldStop(8192);
fastmdl.mostCurrent.__c.runVoidMethod ("StartActivity",fastmdl.processBA,(Object)((fastmdl.mostCurrent._newmdl.getObject())));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label2_click() throws Exception{
try {
		Debug.PushSubsStack("Label2_Click (fastmdl) ","fastmdl",9,fastmdl.mostCurrent.activityBA,fastmdl.mostCurrent,73);
if (RapidSub.canDelegate("label2_click")) { return b4a.example.fastmdl.remoteMe.runUserSub(false, "fastmdl","label2_click");}
 BA.debugLineNum = 73;BA.debugLine="Private Sub Label2_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="StartActivity(SearchMdl)";
Debug.ShouldStop(512);
fastmdl.mostCurrent.__c.runVoidMethod ("StartActivity",fastmdl.processBA,(Object)((fastmdl.mostCurrent._searchmdl.getObject())));
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbldownloads_click() throws Exception{
try {
		Debug.PushSubsStack("LblDownloads_Click (fastmdl) ","fastmdl",9,fastmdl.mostCurrent.activityBA,fastmdl.mostCurrent,41);
if (RapidSub.canDelegate("lbldownloads_click")) { return b4a.example.fastmdl.remoteMe.runUserSub(false, "fastmdl","lbldownloads_click");}
 BA.debugLineNum = 41;BA.debugLine="Private Sub LblDownloads_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="StartActivity(DownloadMdl)";
Debug.ShouldStop(512);
fastmdl.mostCurrent.__c.runVoidMethod ("StartActivity",fastmdl.processBA,(Object)((fastmdl.mostCurrent._downloadmdl.getObject())));
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
public static RemoteObject  _lblgames_click() throws Exception{
try {
		Debug.PushSubsStack("LblGames_Click (fastmdl) ","fastmdl",9,fastmdl.mostCurrent.activityBA,fastmdl.mostCurrent,57);
if (RapidSub.canDelegate("lblgames_click")) { return b4a.example.fastmdl.remoteMe.runUserSub(false, "fastmdl","lblgames_click");}
 BA.debugLineNum = 57;BA.debugLine="Private Sub LblGames_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="StartActivity(GamesMdl)";
Debug.ShouldStop(33554432);
fastmdl.mostCurrent.__c.runVoidMethod ("StartActivity",fastmdl.processBA,(Object)((fastmdl.mostCurrent._gamesmdl.getObject())));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblhome_click() throws Exception{
try {
		Debug.PushSubsStack("LblHome_Click (fastmdl) ","fastmdl",9,fastmdl.mostCurrent.activityBA,fastmdl.mostCurrent,69);
if (RapidSub.canDelegate("lblhome_click")) { return b4a.example.fastmdl.remoteMe.runUserSub(false, "fastmdl","lblhome_click");}
 BA.debugLineNum = 69;BA.debugLine="Private Sub LblHome_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblnew_click() throws Exception{
try {
		Debug.PushSubsStack("LblNew_Click (fastmdl) ","fastmdl",9,fastmdl.mostCurrent.activityBA,fastmdl.mostCurrent,49);
if (RapidSub.canDelegate("lblnew_click")) { return b4a.example.fastmdl.remoteMe.runUserSub(false, "fastmdl","lblnew_click");}
 BA.debugLineNum = 49;BA.debugLine="Private Sub LblNew_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="StartActivity(NewMdl)";
Debug.ShouldStop(131072);
fastmdl.mostCurrent.__c.runVoidMethod ("StartActivity",fastmdl.processBA,(Object)((fastmdl.mostCurrent._newmdl.getObject())));
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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