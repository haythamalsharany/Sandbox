fun main() {
 var experiencePoint:Int=5;
    val playerName :String ="Estraone";
    var hasState :Boolean=false;

    experiencePoint+=5;
    println(experiencePoint);
    println(playerName);
    println(playerState(hasState));
    hasState=true;
    println(playerState(hasState));
    reverseName(playerName)






    }
fun playerState(hasState:Boolean):String{
   var _state :String="";
    if(hasState)
        _state=  "has dragon";
    else _state ="has no dragon";
    return _state;

}
fun reverseName(name:String){
    println(name.reversed());

}


class Typeintro{

}