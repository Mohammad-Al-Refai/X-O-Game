package com.example.xo

class IsWin(){
    fun Check(MAP:Array<*>):Int{
        if(MAP[0]==2&&MAP[1]==2&&MAP[2]==2){
            return (2)
        }
        if(MAP[3]==2&&MAP[4]==2&&MAP[5]==2){
            return (2)

        }
        if(MAP[6]==2&&MAP[7]==2&&MAP[8]==2){
            return (2)

        }
        ///////////////
        if(MAP[0]==2&&MAP[3]==2&&MAP[6]==2){
            return (2)

        }
        if(MAP[1]==2&&MAP[4]==2&&MAP[7]==2){
            return (2)

        }
        if(MAP[2]==2&&MAP[5]==2&&MAP[8]==2){
            return (2)

        }
        ///////////////////
        if(MAP[0]==2&&MAP[4]==2&&MAP[8]==2){
            return (2)

        }
        if(MAP[3]==2&&MAP[5]==2&&MAP[8]==2){
            return (2)

        }
        if(MAP[2]==2&&MAP[4]==2&&MAP[6]==2){
            return (2)

        }
        /////////////////////////////////////////////for O
        if(MAP[0]==1&&MAP[1]==1&&MAP[2]==1){
            return (1)
        }
        if(MAP[3]==1&&MAP[4]==1&&MAP[5]==1){
            return (1)

        }
        if(MAP[6]==1&&MAP[7]==1&&MAP[8]==1){
            return (1)

        }
        ///////////////
        if(MAP[0]==1&&MAP[3]==1&&MAP[6]==1){
            return (1)

        }
        if(MAP[1]==1&&MAP[4]==1&&MAP[7]==1){
            return (1)

        }
        if(MAP[2]==1&&MAP[5]==1&&MAP[8]==1){
            return (1)

        }
        ///////////////////
        if(MAP[0]==1&&MAP[4]==1&&MAP[8]==1){
            return (1)

        }
        if(MAP[2]==1&&MAP[4]==1&&MAP[6]==1){
            return (1)

        }
        if(MAP[3]==1&&MAP[5]==1&&MAP[8]==1){
            return (1)

        }else{
            return (0)
        }
    }
}