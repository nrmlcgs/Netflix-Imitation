B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=11.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: True
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private Panel1 As Panel
	Private HorizontalScrollView1 As HorizontalScrollView
	Private ScrollView1 As ScrollView
	Private LblEnd As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("NewLay")
	HorizontalScrollView1.Panel.LoadLayout("HsvNew")
	HorizontalScrollView1.Panel.Width = Panel1.Width
	
	ScrollView1.Panel.LoadLayout("SclNew")
	ScrollView1.Panel.Height = LblEnd.Top

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub





Private Sub imgHome_Click
	StartActivity(HomeMdl)
End Sub

Private Sub LblHome_Click
	StartActivity(HomeMdl)
End Sub

Private Sub imgGames_Click
	StartActivity(GamesMdl)
End Sub

Private Sub LblGames_Click
	StartActivity(GamesMdl)
End Sub

Private Sub imgFast_Click
	StartActivity(FastMdl)
End Sub

Private Sub LblFast_Click
	StartActivity(FastMdl)
End Sub

Private Sub imgDownload_Click
	StartActivity(DownloadMdl)
End Sub

Private Sub LblDownloads_Click
	StartActivity(DownloadMdl)
End Sub

Private Sub ImageView2_Click
	StartActivity(ProfilesMdl)
End Sub