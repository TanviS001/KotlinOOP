interface canGo{
    fun run()
}

interface canStop{
    fun stop()
}

class Vehicle: canGo, canStop{
	override fun run(){
        println("car has started")
    }
    
  override fun stop(){
        println("Car has stopped")
    }
}

fun main() {
   var myVehicle = Vehicle()
   myVehicle.run()
   myVehicle.stop()
}
