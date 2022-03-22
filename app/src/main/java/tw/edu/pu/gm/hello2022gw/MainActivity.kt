package tw.edu.pu.gm.hello2022gw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var txv:TextView = findViewById<TextView>(R.id.txv)
    //txv.text = "Hello tcyang"
    // TestDEV()
    // TestMaster()
    txv.text = "嗨，我是黃冠維"
    }
    fun TestMaster(){
        var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = "Master分支"}



        var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = "Hello gw"
        TestDEV()
    }

    fun TestDEV(){
        var txv:TextView = findViewById<TextView>(R.id.txv)
        txv.text = "Dev分支"
    }



}