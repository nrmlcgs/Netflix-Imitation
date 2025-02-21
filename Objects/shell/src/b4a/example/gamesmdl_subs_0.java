package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class gamesmdl_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (gamesmdl) ","gamesmdl",7,gamesmdl.mostCurrent.activityBA,gamesmdl.mostCurrent,20);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.gamesmdl.remoteMe.runUserSub(false, "gamesmdl","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 20;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 22;BA.debugLine="Activity.LoadLayout(\"GamesLay\")";
Debug.ShouldStop(2097152);
gamesmdl.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("GamesLay")),gamesmdl.mostCurrent.activityBA);
 BA.debugLineNum = 23;BA.debugLine="ScrollView1.Panel.LoadLayout(\"ScvGamesContent\")";
Debug.ShouldStop(4194304);
gamesmdl.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ScvGamesContent")),gamesmdl.mostCurrent.activityBA);
 BA.debugLineNum = 24;BA.debugLine="ScrollView1.Panel.Height = LblEnd.Top";
Debug.ShouldStop(8388608);
gamesmdl.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",gamesmdl.mostCurrent._lblend.runMethod(true,"getTop"));
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
		Debug.PushSubsStack("Activity_Pause (gamesmdl) ","gamesmdl",7,gamesmdl.mostCurrent.activityBA,gamesmdl.mostCurrent,32);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.gamesmdl.remoteMe.runUserSub(false, "gamesmdl","activity_pause", _userclosed);}
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
		Debug.PushSubsStack("Activity_Resume (gamesmdl) ","gamesmdl",7,gamesmdl.mostCurrent.activityBA,gamesmdl.mostCurrent,28);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.gamesmdl.remoteMe.runUserSub(false, "gamesmdl","activity_resume");}
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
gamesmdl.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private LblEnd As Label";
gamesmdl.mostCurrent._lblend = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imageview2_click() throws Exception{
try {
		Debug.PushSubsStack("ImageView2_Click (gamesmdl) ","gamesmdl",7,gamesmdl.mostCurrent.activityBA,gamesmdl.mostCurrent,69);
if (RapidSub.canDelegate("imageview2_click")) { return b4a.example.gamesmdl.remoteMe.runUserSub(false, "gamesmdl","imageview2_click");}
 BA.debugLineNum = 69;BA.debugLine="Private Sub ImageView2_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="StartActivity(ProfilesMdl)";
Debug.ShouldStop(32);
gamesmdl.mostCurrent.__c.runVoidMethod ("StartActivity",gamesmdl.processBA,(Object)((gamesmdl.mostCurrent._profilesmdl.getObject())));
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
public static RemoteObject  _imgdownload_click() throws Exception{
try {
		Debug.PushSubsStack("imgDownload_Click (gamesmdl) ","gamesmdl",7,gamesmdl.mostCurrent.activityBA,gamesmdl.mostCurrent,61);
if (RapidSub.canDelegate("imgdownload_click")) { return b4a.example.gamesmdl.remoteMe.runUserSub(false, "gamesmdl","imgdownload_click");}
 BA.debugLineNum = 61;BA.debugLine="Private Sub imgDownload_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="StartActivity(DownloadMdl)";
Debug.ShouldStop(536870912);
gamesmdl.mostCurrent.__c.runVoidMethod ("StartActivity",gamesmdl.processBA,(Object)((gamesmdl.mostCurrent._downloadmdl.getObject())));
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
public static RemoteObject  _imgfast_click() throws Exception{
try {
		Debug.PushSubsStack("imgFast_Click (gamesmdl) ","gamesmdl",7,gamesmdl.mostCurrent.activityBA,gamesmdl.mostCurrent,53);
if (RapidSub.canDelegate("imgfast_click")) { return b4a.example.gamesmdl.remoteMe.runUserSub(false, "gamesmdl","imgfast_click");}
 BA.debugLineNum = 53;BA.debugLine="Private Sub imgFast_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="StartActivity(FastMdl)";
Debug.ShouldStop(2097152);
gamesmdl.mostCurrent.__c.runVoidMethod ("StartActivity",gamesmdl.processBA,(Object)((gamesmdl.mostCurrent._fastmdl.getObject())));
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
		Debug.PushSubsStack("imgHome_Click (gamesmdl) ","gamesmdl",7,gamesmdl.mostCurrent.activityBA,gamesmdl.mostCurrent,37);
if (RapidSub.canDelegate("imghome_click")) { return b4a.example.gamesmdl.remoteMe.runUserSub(false, "gamesmdl","imghome_click");}
 BA.debugLineNum = 37;BA.debugLine="Private Sub imgHome_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="StartActivity(HomeMdl)";
Debug.ShouldStop(32);
gamesmdl.mostCurrent.__c.runVoidMethod ("StartActivity",gamesmdl.processBA,(Object)((gamesmdl.mostCurrent._homemdl.getObject())));
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
public static RemoteObject  _imgnew_click() throws Exception{
try {
		Debug.PushSubsStack("imgNew_Click (gamesmdl) ","gamesmdl",7,gamesmdl.mostCurrent.activityBA,gamesmdl.mostCurrent,45);
if (RapidSub.canDelegate("imgnew_click")) { return b4a.example.gamesmdl.remoteMe.runUserSub(false, "gamesmdl","imgnew_click");}
 BA.debugLineNum = 45;BA.debugLine="Private Sub imgNew_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="StartActivity(NewMdl)";
Debug.ShouldStop(8192);
gamesmdl.mostCurrent.__c.runVoidMethod ("StartActivity",gamesmdl.processBA,(Object)((gamesmdl.mostCurrent._newmdl.getObject())));
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
		Debug.PushSubsStack("Label2_Click (gamesmdl) ","gamesmdl",7,gamesmdl.mostCurrent.activityBA,gamesmdl.mostCurrent,74);
if (RapidSub.canDelegate("label2_click")) { return b4a.example.gamesmdl.remoteMe.runUserSub(false, "gamesmdl","label2_click");}
 BA.debugLineNum = 74;BA.debugLine="Private Sub Label2_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="StartActivity(SearchMdl)";
Debug.ShouldStop(1024);
gamesmdl.mostCurrent.__c.runVoidMethod ("StartActivity",gamesmdl.processBA,(Object)((gamesmdl.mostCurrent._searchmdl.getObject())));
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("LblDownloads_Click (gamesmdl) ","gamesmdl",7,gamesmdl.mostCurrent.activityBA,gamesmdl.mostCurrent,65);
if (RapidSub.canDelegate("lbldownloads_click")) { return b4a.example.gamesmdl.remoteMe.runUserSub(false, "gamesmdl","lbldownloads_click");}
 BA.debugLineNum = 65;BA.debugLine="Private Sub LblDownloads_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="StartActivity(DownloadMdl)";
Debug.ShouldStop(2);
gamesmdl.mostCurrent.__c.runVoidMethod ("StartActivity",gamesmdl.processBA,(Object)((gamesmdl.mostCurrent._downloadmdl.getObject())));
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
public static RemoteObject  _lblfast_click() throws Exception{
try {
		Debug.PushSubsStack("LblFast_Click (gamesmdl) ","gamesmdl",7,gamesmdl.mostCurrent.activityBA,gamesmdl.mostCurrent,57);
if (RapidSub.canDelegate("lblfast_click")) { return b4a.example.gamesmdl.remoteMe.runUserSub(false, "gamesmdl","lblfast_click");}
 BA.debugLineNum = 57;BA.debugLine="Private Sub LblFast_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="StartActivity(FastMdl)";
Debug.ShouldStop(33554432);
gamesmdl.mostCurrent.__c.runVoidMethod ("StartActivity",gamesmdl.processBA,(Object)((gamesmdl.mostCurrent._fastmdl.getObject())));
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
		Debug.PushSubsStack("LblHome_Click (gamesmdl) ","gamesmdl",7,gamesmdl.mostCurrent.activityBA,gamesmdl.mostCurrent,41);
if (RapidSub.canDelegate("lblhome_click")) { return b4a.example.gamesmdl.remoteMe.runUserSub(false, "gamesmdl","lblhome_click");}
 BA.debugLineNum = 41;BA.debugLine="Private Sub LblHome_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="StartActivity(HomeMdl)";
Debug.ShouldStop(512);
gamesmdl.mostCurrent.__c.runVoidMethod ("StartActivity",gamesmdl.processBA,(Object)((gamesmdl.mostCurrent._homemdl.getObject())));
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
public static RemoteObject  _lblnew_click() throws Exception{
try {
		Debug.PushSubsStack("LblNew_Click (gamesmdl) ","gamesmdl",7,gamesmdl.mostCurrent.activityBA,gamesmdl.mostCurrent,49);
if (RapidSub.canDelegate("lblnew_click")) { return b4a.example.gamesmdl.remoteMe.runUserSub(false, "gamesmdl","lblnew_click");}
 BA.debugLineNum = 49;BA.debugLine="Private Sub LblNew_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="StartActivity(NewMdl)";
Debug.ShouldStop(131072);
gamesmdl.mostCurrent.__c.runVoidMethod ("StartActivity",gamesmdl.processBA,(Object)((gamesmdl.mostCurrent._newmdl.getObject())));
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