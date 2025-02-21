package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class newmdl_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (newmdl) ","newmdl",8,newmdl.mostCurrent.activityBA,newmdl.mostCurrent,22);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.newmdl.remoteMe.runUserSub(false, "newmdl","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 22;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 24;BA.debugLine="Activity.LoadLayout(\"NewLay\")";
Debug.ShouldStop(8388608);
newmdl.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("NewLay")),newmdl.mostCurrent.activityBA);
 BA.debugLineNum = 25;BA.debugLine="HorizontalScrollView1.Panel.LoadLayout(\"HsvNew\")";
Debug.ShouldStop(16777216);
newmdl.mostCurrent._horizontalscrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("HsvNew")),newmdl.mostCurrent.activityBA);
 BA.debugLineNum = 26;BA.debugLine="HorizontalScrollView1.Panel.Width = Panel1.Width";
Debug.ShouldStop(33554432);
newmdl.mostCurrent._horizontalscrollview1.runMethod(false,"getPanel").runMethod(true,"setWidth",newmdl.mostCurrent._panel1.runMethod(true,"getWidth"));
 BA.debugLineNum = 28;BA.debugLine="ScrollView1.Panel.LoadLayout(\"SclNew\")";
Debug.ShouldStop(134217728);
newmdl.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("SclNew")),newmdl.mostCurrent.activityBA);
 BA.debugLineNum = 29;BA.debugLine="ScrollView1.Panel.Height = LblEnd.Top";
Debug.ShouldStop(268435456);
newmdl.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",newmdl.mostCurrent._lblend.runMethod(true,"getTop"));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (newmdl) ","newmdl",8,newmdl.mostCurrent.activityBA,newmdl.mostCurrent,37);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.newmdl.remoteMe.runUserSub(false, "newmdl","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (newmdl) ","newmdl",8,newmdl.mostCurrent.activityBA,newmdl.mostCurrent,33);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.newmdl.remoteMe.runUserSub(false, "newmdl","activity_resume");}
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Resume";
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private Panel1 As Panel";
newmdl.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private HorizontalScrollView1 As HorizontalScroll";
newmdl.mostCurrent._horizontalscrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.HorizontalScrollViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private ScrollView1 As ScrollView";
newmdl.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private LblEnd As Label";
newmdl.mostCurrent._lblend = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imageview2_click() throws Exception{
try {
		Debug.PushSubsStack("ImageView2_Click (newmdl) ","newmdl",8,newmdl.mostCurrent.activityBA,newmdl.mostCurrent,77);
if (RapidSub.canDelegate("imageview2_click")) { return b4a.example.newmdl.remoteMe.runUserSub(false, "newmdl","imageview2_click");}
 BA.debugLineNum = 77;BA.debugLine="Private Sub ImageView2_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="StartActivity(ProfilesMdl)";
Debug.ShouldStop(8192);
newmdl.mostCurrent.__c.runVoidMethod ("StartActivity",newmdl.processBA,(Object)((newmdl.mostCurrent._profilesmdl.getObject())));
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("imgDownload_Click (newmdl) ","newmdl",8,newmdl.mostCurrent.activityBA,newmdl.mostCurrent,69);
if (RapidSub.canDelegate("imgdownload_click")) { return b4a.example.newmdl.remoteMe.runUserSub(false, "newmdl","imgdownload_click");}
 BA.debugLineNum = 69;BA.debugLine="Private Sub imgDownload_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="StartActivity(DownloadMdl)";
Debug.ShouldStop(32);
newmdl.mostCurrent.__c.runVoidMethod ("StartActivity",newmdl.processBA,(Object)((newmdl.mostCurrent._downloadmdl.getObject())));
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
public static RemoteObject  _imgfast_click() throws Exception{
try {
		Debug.PushSubsStack("imgFast_Click (newmdl) ","newmdl",8,newmdl.mostCurrent.activityBA,newmdl.mostCurrent,61);
if (RapidSub.canDelegate("imgfast_click")) { return b4a.example.newmdl.remoteMe.runUserSub(false, "newmdl","imgfast_click");}
 BA.debugLineNum = 61;BA.debugLine="Private Sub imgFast_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="StartActivity(FastMdl)";
Debug.ShouldStop(536870912);
newmdl.mostCurrent.__c.runVoidMethod ("StartActivity",newmdl.processBA,(Object)((newmdl.mostCurrent._fastmdl.getObject())));
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
public static RemoteObject  _imggames_click() throws Exception{
try {
		Debug.PushSubsStack("imgGames_Click (newmdl) ","newmdl",8,newmdl.mostCurrent.activityBA,newmdl.mostCurrent,53);
if (RapidSub.canDelegate("imggames_click")) { return b4a.example.newmdl.remoteMe.runUserSub(false, "newmdl","imggames_click");}
 BA.debugLineNum = 53;BA.debugLine="Private Sub imgGames_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="StartActivity(GamesMdl)";
Debug.ShouldStop(2097152);
newmdl.mostCurrent.__c.runVoidMethod ("StartActivity",newmdl.processBA,(Object)((newmdl.mostCurrent._gamesmdl.getObject())));
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
		Debug.PushSubsStack("imgHome_Click (newmdl) ","newmdl",8,newmdl.mostCurrent.activityBA,newmdl.mostCurrent,45);
if (RapidSub.canDelegate("imghome_click")) { return b4a.example.newmdl.remoteMe.runUserSub(false, "newmdl","imghome_click");}
 BA.debugLineNum = 45;BA.debugLine="Private Sub imgHome_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="StartActivity(HomeMdl)";
Debug.ShouldStop(8192);
newmdl.mostCurrent.__c.runVoidMethod ("StartActivity",newmdl.processBA,(Object)((newmdl.mostCurrent._homemdl.getObject())));
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
public static RemoteObject  _lbldownloads_click() throws Exception{
try {
		Debug.PushSubsStack("LblDownloads_Click (newmdl) ","newmdl",8,newmdl.mostCurrent.activityBA,newmdl.mostCurrent,73);
if (RapidSub.canDelegate("lbldownloads_click")) { return b4a.example.newmdl.remoteMe.runUserSub(false, "newmdl","lbldownloads_click");}
 BA.debugLineNum = 73;BA.debugLine="Private Sub LblDownloads_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="StartActivity(DownloadMdl)";
Debug.ShouldStop(512);
newmdl.mostCurrent.__c.runVoidMethod ("StartActivity",newmdl.processBA,(Object)((newmdl.mostCurrent._downloadmdl.getObject())));
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
public static RemoteObject  _lblfast_click() throws Exception{
try {
		Debug.PushSubsStack("LblFast_Click (newmdl) ","newmdl",8,newmdl.mostCurrent.activityBA,newmdl.mostCurrent,65);
if (RapidSub.canDelegate("lblfast_click")) { return b4a.example.newmdl.remoteMe.runUserSub(false, "newmdl","lblfast_click");}
 BA.debugLineNum = 65;BA.debugLine="Private Sub LblFast_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="StartActivity(FastMdl)";
Debug.ShouldStop(2);
newmdl.mostCurrent.__c.runVoidMethod ("StartActivity",newmdl.processBA,(Object)((newmdl.mostCurrent._fastmdl.getObject())));
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
public static RemoteObject  _lblgames_click() throws Exception{
try {
		Debug.PushSubsStack("LblGames_Click (newmdl) ","newmdl",8,newmdl.mostCurrent.activityBA,newmdl.mostCurrent,57);
if (RapidSub.canDelegate("lblgames_click")) { return b4a.example.newmdl.remoteMe.runUserSub(false, "newmdl","lblgames_click");}
 BA.debugLineNum = 57;BA.debugLine="Private Sub LblGames_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="StartActivity(GamesMdl)";
Debug.ShouldStop(33554432);
newmdl.mostCurrent.__c.runVoidMethod ("StartActivity",newmdl.processBA,(Object)((newmdl.mostCurrent._gamesmdl.getObject())));
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
		Debug.PushSubsStack("LblHome_Click (newmdl) ","newmdl",8,newmdl.mostCurrent.activityBA,newmdl.mostCurrent,49);
if (RapidSub.canDelegate("lblhome_click")) { return b4a.example.newmdl.remoteMe.runUserSub(false, "newmdl","lblhome_click");}
 BA.debugLineNum = 49;BA.debugLine="Private Sub LblHome_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="StartActivity(HomeMdl)";
Debug.ShouldStop(131072);
newmdl.mostCurrent.__c.runVoidMethod ("StartActivity",newmdl.processBA,(Object)((newmdl.mostCurrent._homemdl.getObject())));
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