
# Rapport

I started with setting up both of the layouts, then i created how second activity should save the
preferences, then i made how the main_activity should load the preferences and then fixed what
the teacher said wrong

This is home the resume function works:
```
super.onResume();
textView.setText(myPreferenceRef.getString("TextPref", "No preference found"));
```

![](Screenshot_Shared.png)