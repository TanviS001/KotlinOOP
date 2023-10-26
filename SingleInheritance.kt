// Super Class
open class Vehicle{
    
    fun start(){
        println("Vehicle has started")
    }
    
    open fun run(){
        println("Vehicle is running at speed 40km/hr")
    }
    
    fun stop(){
        println("Vehicle has stopped")
    }
    
}

//Sub Class
class Car: Vehicle(){
    
    override fun run(){
        println("Car is running at speed 70km/hr")
    }
    
}

fun main() {
    
    var myCar = Car()
    
    myCar.start()
    myCar.run()
    myCar.stop()
    
}
