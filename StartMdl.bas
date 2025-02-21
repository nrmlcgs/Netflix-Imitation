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
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("StartLayout")
	HorizontalScrollView1.Panel.LoadLayout("HsvContent")
	HorizontalScrollView1.Panel.Width = Panel1.Width

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub BtnGetStarted_Click
	StartActivity(ReadyMdl)
End Sub

Private Sub btnSignIn_Click
	StartActivity(SignInMdl)
End Sub