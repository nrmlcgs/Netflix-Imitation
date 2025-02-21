package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class downloadmdl_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (downloadmdl) ","downloadmdl",10,downloadmdl.mostCurrent.activityBA,downloadmdl.mostCurrent,18);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.downloadmdl.remoteMe.runUserSub(false, "downloadmdl","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 18;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 20;BA.debugLine="Activity.LoadLayout(\"DownloadLay\")";
Debug.ShouldStop(524288);
downloadmdl.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("DownloadLay")),downloadmdl.mostCurrent.activityBA);
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
		Debug.PushSubsStack("Activity_Pause (downloadmdl) ","downloadmdl",10,downloadmdl.mostCurrent.activityBA,downloadmdl.mostCurrent,28);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.downloadmdl.remoteMe.runUserSub(false, "downloadmdl","activity_pause", _userclosed);}
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
		Debug.PushSubsStack("Activity_Resume (downloadmdl) ","downloadmdl",10,downloadmdl.mostCurrent.activityBA,downloadmdl.mostCurrent,24);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.downloadmdl.remoteMe.runUserSub(false, "downloadmdl","activity_resume");}
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
public static RemoteObject  _imageview2_click() throws Exception{
try {
		Debug.PushSubsStack("ImageView2_Click (downloadmdl) ","downloadmdl",10,downloadmdl.mostCurrent.activityBA,downloadmdl.mostCurrent,65);
if (RapidSub.canDelegate("imageview2_click")) { return b4a.example.downloadmdl.remoteMe.runUserSub(false, "downloadmdl","imageview2_click");}
 BA.debugLineNum = 65;BA.debugLine="Private Sub ImageView2_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="StartActivity(ProfilesMdl)";
Debug.ShouldStop(2);
downloadmdl.mostCurrent.__c.runVoidMethod ("StartActivity",downloadmdl.processBA,(Object)((downloadmdl.mostCurrent._profilesmdl.getObject())));
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
public static RemoteObject  _imgfast_click() throws Exception{
try {
		Debug.PushSubsStack("imgFast_Click (downloadmdl) ","downloadmdl",10,downloadmdl.mostCurrent.activityBA,downloadmdl.mostCurrent,33);
if (RapidSub.canDelegate("imgfast_click")) { return b4a.example.downloadmdl.remoteMe.runUserSub(false, "downloadmdl","imgfast_click");}
 BA.debugLineNum = 33;BA.debugLine="Private Sub imgFast_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="StartActivity(FastMdl)";
Debug.ShouldStop(2);
downloadmdl.mostCurrent.__c.runVoidMethod ("StartActivity",downloadmdl.processBA,(Object)((downloadmdl.mostCurrent._fastmdl.getObject())));
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
public static RemoteObject  _imggames_click() throws Exception{
try {
		Debug.PushSubsStack("imgGames_Click (downloadmdl) ","downloadmdl",10,downloadmdl.mostCurrent.activityBA,downloadmdl.mostCurrent,49);
if (RapidSub.canDelegate("imggames_click")) { return b4a.example.downloadmdl.remoteMe.runUserSub(false, "downloadmdl","imggames_click");}
 BA.debugLineNum = 49;BA.debugLine="Private Sub imgGames_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="StartActivity(GamesMdl)";
Debug.ShouldStop(131072);
downloadmdl.mostCurrent.__c.runVoidMethod ("StartActivity",downloadmdl.processBA,(Object)((downloadmdl.mostCurrent._gamesmdl.getObject())));
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
public static RemoteObject  _imghome_click() throws Exception{
try {
		Debug.PushSubsStack("imgHome_Click (downloadmdl) ","downloadmdl",10,downloadmdl.mostCurrent.activityBA,downloadmdl.mostCurrent,57);
if (RapidSub.canDelegate("imghome_click")) { return b4a.example.downloadmdl.remoteMe.runUserSub(false, "downloadmdl","imghome_click");}
 BA.debugLineNum = 57;BA.debugLine="Private Sub imgHome_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="StartActivity(HomeMdl)";
Debug.ShouldStop(33554432);
downloadmdl.mostCurrent.__c.runVoidMethod ("StartActivity",downloadmdl.processBA,(Object)((downloadmdl.mostCurrent._homemdl.getObject())));
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
public static RemoteObject  _imgnew_click() throws Exception{
try {
		Debug.PushSubsStack("imgNew_Click (downloadmdl) ","downloadmdl",10,downloadmdl.mostCurrent.activityBA,downloadmdl.mostCurrent,41);
if (RapidSub.canDelegate("imgnew_click")) { return b4a.example.downloadmdl.remoteMe.runUserSub(false, "downloadmdl","imgnew_click");}
 BA.debugLineNum = 41;BA.debugLine="Private Sub imgNew_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="StartActivity(NewMdl)";
Debug.ShouldStop(512);
downloadmdl.mostCurrent.__c.runVoidMethod ("StartActivity",downloadmdl.processBA,(Object)((downloadmdl.mostCurrent._newmdl.getObject())));
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
public static RemoteObject  _lblfast_click() throws Exception{
try {
		Debug.PushSubsStack("LblFast_Click (downloadmdl) ","downloadmdl",10,downloadmdl.mostCurrent.activityBA,downloadmdl.mostCurrent,37);
if (RapidSub.canDelegate("lblfast_click")) { return b4a.example.downloadmdl.remoteMe.runUserSub(false, "downloadmdl","lblfast_click");}
 BA.debugLineNum = 37;BA.debugLine="Private Sub LblFast_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="StartActivity(FastMdl)";
Debug.ShouldStop(32);
downloadmdl.mostCurrent.__c.runVoidMethod ("StartActivity",downloadmdl.processBA,(Object)((downloadmdl.mostCurrent._fastmdl.getObject())));
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
public static RemoteObject  _lblgames_click() throws Exception{
try {
		Debug.PushSubsStack("LblGames_Click (downloadmdl) ","downloadmdl",10,downloadmdl.mostCurrent.activityBA,downloadmdl.mostCurrent,53);
if (RapidSub.canDelegate("lblgames_click")) { return b4a.example.downloadmdl.remoteMe.runUserSub(false, "downloadmdl","lblgames_click");}
 BA.debugLineNum = 53;BA.debugLine="Private Sub LblGames_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="StartActivity(GamesMdl)";
Debug.ShouldStop(2097152);
downloadmdl.mostCurrent.__c.runVoidMethod ("StartActivity",downloadmdl.processBA,(Object)((downloadmdl.mostCurrent._gamesmdl.getObject())));
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
public static RemoteObject  _lblhome_click() throws Exception{
try {
		Debug.PushSubsStack("LblHome_Click (downloadmdl) ","downloadmdl",10,downloadmdl.mostCurrent.activityBA,downloadmdl.mostCurrent,61);
if (RapidSub.canDelegate("lblhome_click")) { return b4a.example.downloadmdl.remoteMe.runUserSub(false, "downloadmdl","lblhome_click");}
 BA.debugLineNum = 61;BA.debugLine="Private Sub LblHome_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="StartActivity(HomeMdl)";
Debug.ShouldStop(536870912);
downloadmdl.mostCurrent.__c.runVoidMethod ("StartActivity",downloadmdl.processBA,(Object)((downloadmdl.mostCurrent._homemdl.getObject())));
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
public static RemoteObject  _lblnew_click() throws Exception{
try {
		Debug.PushSubsStack("LblNew_Click (downloadmdl) ","downloadmdl",10,downloadmdl.mostCurrent.activityBA,downloadmdl.mostCurrent,45);
if (RapidSub.canDelegate("lblnew_click")) { return b4a.example.downloadmdl.remoteMe.runUserSub(false, "downloadmdl","lblnew_click");}
 BA.debugLineNum = 45;BA.debugLine="Private Sub LblNew_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="StartActivity(NewMdl)";
Debug.ShouldStop(8192);
downloadmdl.mostCurrent.__c.runVoidMethod ("StartActivity",downloadmdl.processBA,(Object)((downloadmdl.mostCurrent._newmdl.getObject())));
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}