package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_gameslay{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("imgnew").vw.setLeft((int)((50d / 100 * width) - (views.get("imgnew").vw.getWidth() / 2)));
//BA.debugLineNum = 4;BA.debugLine="LblNew.HorizontalCenter =50%x"[GamesLay/General script]
views.get("lblnew").vw.setLeft((int)((50d / 100 * width) - (views.get("lblnew").vw.getWidth() / 2)));

}
}