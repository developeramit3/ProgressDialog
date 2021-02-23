# ProgressDialog
# Step 1. Add the JitPack repository to your build file

     allprojects {
		  repositories {
			 ...
			  maven { url 'https://jitpack.io' }
		 }
	  }
		
# Step 2. Add the dependency
		
		dependencies {
	        implementation 'com.github.developeramit3:ProgressDialog:8acccb0dc1'
	}
	
# Step 3. How to use
	
	     new ProgressDialogBuilder(this)
                 .setProgressStyle(ProgressStyle.STYLE_3)
                 .show();
