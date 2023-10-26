//Implementing primary constructor

class Car(name: String, model: Int){
    var name: String? = null
    var model: Int? = null
    
    init {
        this.name = name
        this.model = model
    }
}

fun main() {
	var myFirstCar = Car("Mercedes", 2020)
    var mySecondCar = Car("BMW", 2019)
    var myThirdCar = Car("Ford", 2016)
    
    println("My first car is ${myFirstCar.name} and it is ${myFirstCar.model} model")
    println("My second car is ${mySecondCar.name} and it is ${mySecondCar.model} model")
    println("My third car is ${myThirdCar.name} and it is ${myThirdCar.model} model")

}
