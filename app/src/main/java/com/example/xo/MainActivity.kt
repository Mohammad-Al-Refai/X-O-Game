package com.example.xo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog

var i:Int=1



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var click_numbers=0
    var MAP= arrayOf(0,0,0,
                     0,0,0,
                     0,0,0)



    fun btnSelect(view: View){

        if(i==1){
            i=2

        }else if(i==2){
            i=1

        }
        var Select=view as Button
        when(Select.id){
            R.id.button-> {MAP[0]=i;HowISWin(IsWin().Check(MAP))}
            R.id.button2->{MAP[1]=i;HowISWin(IsWin().Check(MAP))}
            R.id.button3->{MAP[2]=i ;HowISWin(IsWin().Check(MAP))}
            R.id.button4->{MAP[3]=i ;HowISWin(IsWin().Check(MAP))}
            R.id.button5->{MAP[4]=i ;HowISWin(IsWin().Check(MAP))}
            R.id.button6->{MAP[5]=i; HowISWin(IsWin().Check(MAP))}
            R.id.button7->{MAP[6]=i ;HowISWin(IsWin().Check(MAP))}
            R.id.button8->{MAP[7]=i ;HowISWin(IsWin().Check(MAP))}
            R.id.button9->{MAP[8]=i; HowISWin(IsWin().Check(MAP))}
        }
        if(i==1){
            click_numbers++
            Select.setBackgroundResource(R.color.colorPrimary)
            Select.isClickable=false

        }else{
            click_numbers++
            Select.setBackgroundResource(R.color.colorAccent)
            Select.isClickable=false

        }
        Select.text=core(i)
    }
    fun core(num:Int):String{
       var r= when(num){
            0->"Z"
            1->"O"
            2->"X"
            else->"null"
        }
        return r
    }
    fun HowISWin(i:Int){
        var alert=AlertDialog.Builder(this)
        if(i==2){
            alert.setMessage("X is Win")
            alert.show()
        }else if(i==1) {
            alert.setMessage("O is Win")
            alert.show()
        }

    }


}