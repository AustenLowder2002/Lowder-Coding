package finals.project.data

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import finals.project.R
import finals.project.smsPage.SmsPage

class HomeActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage) // sets the view using the homepage.xml

        // sets the intent I.E. calls to the class Smspage which displays a layout
        val intentSMS = Intent(this, SmsPage::class.java)
        val intentPOST = Intent(this, PostActivity::class.java)
        //starts the activity onclick
        val smsButton = findViewById<View>(R.id.sms)
        smsButton.setOnClickListener {
            startActivity(intentSMS)
        }
        val postButton = findViewById<View>(R.id.post)
        postButton.setOnClickListener {
            startActivity(intentPOST)
        }
    }

    //only for testing.
    companion object {
        fun iscreated(): Any {
            val created = true;
            return created
        }
    }
}