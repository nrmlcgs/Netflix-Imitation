package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class homemdl_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (homemdl) ","homemdl",6,homemdl.mostCurrent.activityBA,homemdl.mostCurrent,21);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.homemdl.remoteMe.runUserSub(false, "homemdl","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 21;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 23;BA.debugLine="Activity.LoadLayout(\"HomeLay\")";
Debug.ShouldStop(4194304);
homemdl.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("HomeLay")),homemdl.mostCurrent.activityBA);
 BA.debugLineNum = 24;BA.debugLine="ScrollView1.Panel.LoadLayout(\"HsvHomeContent\")";
Debug.ShouldStop(8388608);
homemdl.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("HsvHomeContent")),homemdl.mostCurrent.activityBA);
 BA.debugLineNum = 25;BA.debugLine="ScrollView1.Panel.Height = LblEnd.Top";
Debug.ShouldStop(16777216);
homemdl.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",homemdl.mostCurrent._lblend.runMethod(true,"getTop"));
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
		Debug.PushSubsStack("Activity_Pause (homemdl) ","homemdl",6,homemdl.mostCurrent.activityBA,homemdl.mostCurrent,33);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.homemdl.remoteMe.runUserSub(false, "homemdl","activity_pause", _userclosed);}
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
		Debug.PushSubsStack("Activity_Resume (homemdl) ","homemdl",6,homemdl.mostCurrent.activityBA,homemdl.mostCurrent,29);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.homemdl.remoteMe.runUserSub(false, "homemdl","activity_resume");}
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
 //BA.debugLineNum = 17;BA.debugLine="Private LblEnd As Label";
homemdl.mostCurrent._lblend = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private ScrollView1 As ScrollView";
homemdl.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imageview2_click() throws Exception{
try {
		Debug.PushSubsStack("ImageView2_Click (homemdl) ","homemdl",6,homemdl.mostCurrent.activityBA,homemdl.mostCurrent,70);
if (RapidSub.canDelegate("imageview2_click")) { return b4a.example.homemdl.remoteMe.runUserSub(false, "homemdl","imageview2_click");}
 BA.debugLineNum = 70;BA.debugLine="Private Sub ImageView2_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="StartActivity(ProfilesMdl)";
Debug.ShouldStop(64);
homemdl.mostCurrent.__c.runVoidMethod ("StartActivity",homemdl.processBA,(Object)((homemdl.mostCurrent._profilesmdl.getObject())));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("imgDownload_Click (homemdl) ","homemdl",6,homemdl.mostCurrent.activityBA,homemdl.mostCurrent,62);
if (RapidSub.canDelegate("imgdownload_click")) { return b4a.example.homemdl.remoteMe.runUserSub(false, "homemdl","imgdownload_click");}
 BA.debugLineNum = 62;BA.debugLine="Private Sub imgDownload_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="StartActivity(DownloadMdl)";
Debug.ShouldStop(1073741824);
homemdl.mostCurrent.__c.runVoidMethod ("StartActivity",homemdl.processBA,(Object)((homemdl.mostCurrent._downloadmdl.getObject())));
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("imgFast_Click (homemdl) ","homemdl",6,homemdl.mostCurrent.activityBA,homemdl.mostCurrent,54);
if (RapidSub.canDelegate("imgfast_click")) { return b4a.example.homemdl.remoteMe.runUserSub(false, "homemdl","imgfast_click");}
 BA.debugLineNum = 54;BA.debugLine="Private Sub imgFast_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="StartActivity(FastMdl)";
Debug.ShouldStop(4194304);
homemdl.mostCurrent.__c.runVoidMethod ("StartActivity",homemdl.processBA,(Object)((homemdl.mostCurrent._fastmdl.getObject())));
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("imgGames_Click (homemdl) ","homemdl",6,homemdl.mostCurrent.activityBA,homemdl.mostCurrent,38);
if (RapidSub.canDelegate("imggames_click")) { return b4a.example.homemdl.remoteMe.runUserSub(false, "homemdl","imggames_click");}
 BA.debugLineNum = 38;BA.debugLine="Private Sub imgGames_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="StartActivity(GamesMdl)";
Debug.ShouldStop(64);
homemdl.mostCurrent.__c.runVoidMethod ("StartActivity",homemdl.processBA,(Object)((homemdl.mostCurrent._gamesmdl.getObject())));
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("imgNew_Click (homemdl) ","homemdl",6,homemdl.mostCurrent.activityBA,homemdl.mostCurrent,46);
if (RapidSub.canDelegate("imgnew_click")) { return b4a.example.homemdl.remoteMe.runUserSub(false, "homemdl","imgnew_click");}
 BA.debugLineNum = 46;BA.debugLine="Private Sub imgNew_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="StartActivity(NewMdl)";
Debug.ShouldStop(16384);
homemdl.mostCurrent.__c.runVoidMethod ("StartActivity",homemdl.processBA,(Object)((homemdl.mostCurrent._newmdl.getObject())));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label4_click() throws Exception{
try {
		Debug.PushSubsStack("Label4_Click (homemdl) ","homemdl",6,homemdl.mostCurrent.activityBA,homemdl.mostCurrent,78);
if (RapidSub.canDelegate("label4_click")) { return b4a.example.homemdl.remoteMe.runUserSub(false, "homemdl","label4_click");}
 BA.debugLineNum = 78;BA.debugLine="Private Sub Label4_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="StartActivity(CategoriesMdl)";
Debug.ShouldStop(16384);
homemdl.mostCurrent.__c.runVoidMethod ("StartActivity",homemdl.processBA,(Object)((homemdl.mostCurrent._categoriesmdl.getObject())));
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("LblDownloads_Click (homemdl) ","homemdl",6,homemdl.mostCurrent.activityBA,homemdl.mostCurrent,66);
if (RapidSub.canDelegate("lbldownloads_click")) { return b4a.example.homemdl.remoteMe.runUserSub(false, "homemdl","lbldownloads_click");}
 BA.debugLineNum = 66;BA.debugLine="Private Sub LblDownloads_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="StartActivity(DownloadMdl)";
Debug.ShouldStop(4);
homemdl.mostCurrent.__c.runVoidMethod ("StartActivity",homemdl.processBA,(Object)((homemdl.mostCurrent._downloadmdl.getObject())));
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("LblFast_Click (homemdl) ","homemdl",6,homemdl.mostCurrent.activityBA,homemdl.mostCurrent,58);
if (RapidSub.canDelegate("lblfast_click")) { return b4a.example.homemdl.remoteMe.runUserSub(false, "homemdl","lblfast_click");}
 BA.debugLineNum = 58;BA.debugLine="Private Sub LblFast_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="StartActivity(FastMdl)";
Debug.ShouldStop(67108864);
homemdl.mostCurrent.__c.runVoidMethod ("StartActivity",homemdl.processBA,(Object)((homemdl.mostCurrent._fastmdl.getObject())));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("LblGames_Click (homemdl) ","homemdl",6,homemdl.mostCurrent.activityBA,homemdl.mostCurrent,42);
if (RapidSub.canDelegate("lblgames_click")) { return b4a.example.homemdl.remoteMe.runUserSub(false, "homemdl","lblgames_click");}
 BA.debugLineNum = 42;BA.debugLine="Private Sub LblGames_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="StartActivity(GamesMdl)";
Debug.ShouldStop(1024);
homemdl.mostCurrent.__c.runVoidMethod ("StartActivity",homemdl.processBA,(Object)((homemdl.mostCurrent._gamesmdl.getObject())));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("LblNew_Click (homemdl) ","homemdl",6,homemdl.mostCurrent.activityBA,homemdl.mostCurrent,50);
if (RapidSub.canDelegate("lblnew_click")) { return b4a.example.homemdl.remoteMe.runUserSub(false, "homemdl","lblnew_click");}
 BA.debugLineNum = 50;BA.debugLine="Private Sub LblNew_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="StartActivity(NewMdl)";
Debug.ShouldStop(262144);
homemdl.mostCurrent.__c.runVoidMethod ("StartActivity",homemdl.processBA,(Object)((homemdl.mostCurrent._newmdl.getObject())));
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblsearch_click() throws Exception{
try {
		Debug.PushSubsStack("LblSearch_Click (homemdl) ","homemdl",6,homemdl.mostCurrent.activityBA,homemdl.mostCurrent,74);
if (RapidSub.canDelegate("lblsearch_click")) { return b4a.example.homemdl.remoteMe.runUserSub(false, "homemdl","lblsearch_click");}
 BA.debugLineNum = 74;BA.debugLine="Private Sub LblSearch_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="StartActivity(SearchMdl)";
Debug.ShouldStop(1024);
homemdl.mostCurrent.__c.runVoidMethod ("StartActivity",homemdl.processBA,(Object)((homemdl.mostCurrent._searchmdl.getObject())));
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}