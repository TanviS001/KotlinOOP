//Implementing primary constructor

class Car(name: String, model: Int){
    init {
        println("my car is ${name} and it is model ${model}")
    }
}

fun main() {
	var myFirstCar = Car("Mercedes", 2020)
    var mySecondCar = Car("BMW", 2019)
    var myThirdCar = Car("Ford", 2016)
}
