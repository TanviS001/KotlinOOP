// Super Class : Level 1
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

//Sub Class : Level 2
open class Car: Vehicle(){
    
    open override fun run(){
        println("Car is running at speed 70km/hr")
    }
    
}

//Sub CLass : Level 3
class Mercedes: Car(){
    
    override fun run(){
        println("Mercedes is running at speed 223km/hr")
    }
    
}


fun main() {
    
    var myCar = Car()
    var myMercedes = Mercedes()
    
    myCar.start()
    myCar.run()
    myCar.stop()

    println("---------------------------------------")
    
    myMercedes.start()
    myMercedes.run()
    myMercedes.stop()
}
