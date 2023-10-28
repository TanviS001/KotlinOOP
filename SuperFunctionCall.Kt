open class Vehicle{
    open fun start(){
        println("Vehicle has started.")
    }
    open fun run(){
        println("Vehicle is running.")
    }
    open fun stop(){
        println("Vehicle has stopped.")
    }
}

class Car: Vehicle(){
    override fun start(){
        super.start()
        println("Car has started.")
    }
    override fun run(){
        super.run()
        println("Car is running.")
    }
    override fun stop(){
        super.stop()
        println("Car has stopped.")
    }    
}

fun main() {
    var myCar = Car()
    myCar.start()
    myCar.run()
    myCar.stop()
}
