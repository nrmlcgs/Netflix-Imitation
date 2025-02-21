
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class usermdl implements IRemote{
	public static usermdl mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public usermdl() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("usermdl"), "b4a.example.usermdl");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, usermdl.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.startmdl _startmdl = null;
public static b4a.example.readymdl _readymdl = null;
public static b4a.example.signinmdl _signinmdl = null;
public static b4a.example.homemdl _homemdl = null;
public static b4a.example.gamesmdl _gamesmdl = null;
public static b4a.example.newmdl _newmdl = null;
public static b4a.example.fastmdl _fastmdl = null;
public static b4a.example.downloadmdl _downloadmdl = null;
public static b4a.example.categoriesmdl _categoriesmdl = null;
public static b4a.example.profilesmdl _profilesmdl = null;
public static b4a.example.searchmdl _searchmdl = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",usermdl.mostCurrent._activity,"CategoriesMdl",Debug.moduleToString(b4a.example.categoriesmdl.class),"DownloadMdl",Debug.moduleToString(b4a.example.downloadmdl.class),"FastMdl",Debug.moduleToString(b4a.example.fastmdl.class),"GamesMdl",Debug.moduleToString(b4a.example.gamesmdl.class),"HomeMdl",Debug.moduleToString(b4a.example.homemdl.class),"Main",Debug.moduleToString(b4a.example.main.class),"NewMdl",Debug.moduleToString(b4a.example.newmdl.class),"ProfilesMdl",Debug.moduleToString(b4a.example.profilesmdl.class),"ReadyMdl",Debug.moduleToString(b4a.example.readymdl.class),"SearchMdl",Debug.moduleToString(b4a.example.searchmdl.class),"SignInMdl",Debug.moduleToString(b4a.example.signinmdl.class),"Starter",Debug.moduleToString(b4a.example.starter.class),"StartMdl",Debug.moduleToString(b4a.example.startmdl.class)};
}
}